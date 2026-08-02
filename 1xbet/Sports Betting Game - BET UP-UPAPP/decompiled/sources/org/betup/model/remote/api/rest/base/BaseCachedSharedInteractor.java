package org.betup.model.remote.api.rest.base;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.ResponseBody;
import org.betup.bus.ServerDownMessage;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponse;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.utils.LogUtil;
import org.betup.utils.Profiler;
import org.greenrobot.eventbus.EventBus;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* loaded from: classes2.dex */
public abstract class BaseCachedSharedInteractor<T, S, F> extends BaseInteractor<F> {
    private final SparseBooleanArray busyState;
    private final SparseArray<FetchedResponse<T>> cache;
    private final Map<Integer, List<SharedListener<T, S>>> listeners;

    public interface OnFetchedListener<T, S> {
        void onFetched(FetchedResponseMessage<T, S> responseMessage);
    }

    public abstract long getLifetime(S id, Bundle parameters);

    public int getRetryCount() {
        return 2;
    }

    public boolean isCritical() {
        return false;
    }

    protected abstract Call<T> makeCall(F api, S id, Bundle parameters);

    protected void onBeforeListenersNotified(FetchedResponseMessage<T, S> message) {
    }

    protected void onListenersNotified(FetchedResponseMessage<T, S> message) {
    }

    public boolean useHashAfterFetch() {
        return false;
    }

    public BaseCachedSharedInteractor(Context context) {
        setContext(context);
        this.cache = new SparseArray<>();
        this.busyState = new SparseBooleanArray();
        this.listeners = new HashMap();
    }

    protected void cacheResponse(int hash, T model, long lifetime) {
        this.cache.put(hash, new FetchedResponse<>(model, lifetime));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.cache.size(); i++) {
            int keyAt = this.cache.keyAt(i);
            if (this.cache.get(keyAt).getModel() == null) {
                arrayList.add(Integer.valueOf(keyAt));
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.cache.remove(((Integer) it.next()).intValue());
        }
    }

    protected T getCachedResponse(int hash, boolean checkValid) {
        FetchedResponse<T> fetchedResponse = this.cache.get(hash);
        if (fetchedResponse == null) {
            return null;
        }
        if (fetchedResponse.isValid() || !checkValid) {
            return fetchedResponse.getModel();
        }
        return null;
    }

    protected void clearCache() {
        this.cache.clear();
    }

    protected final FetchedResponseMessage<T, S> generateMessageResponse(S id, FetchStat stat, Bundle params) {
        T cachedResponse = getCachedResponse(getHash(id, params), false);
        if (getLifetime(id, params) == 0) {
            removeFromCache(getHash(id, params));
        }
        return new FetchedResponseMessage<>(cachedResponse, stat, id, params);
    }

    protected final FetchedResponseMessage<T, S> generateMessageResponseFromBody(T body, S id, FetchStat stat, Bundle params) {
        return new FetchedResponseMessage<>(body, stat, id, params);
    }

    protected final void removeFromCache(int hash) {
        this.cache.remove(hash);
    }

    public void invalidate(S id) {
        this.cache.remove(getHash(id, null));
    }

    public void invalidate() {
        this.cache.clear();
    }

    public void invalidate(S id, Bundle bundle) {
        this.cache.remove(getHash(id, bundle));
    }

    public int getHashFetched(T model, S id, Bundle parameters) {
        return getHash(id, parameters);
    }

    protected final boolean isBusy(int hash) {
        return this.busyState.get(hash);
    }

    protected final void lock(int hash) {
        this.busyState.put(hash, true);
    }

    protected final void unlock(int hash) {
        this.busyState.put(hash, false);
    }

    public void load(final OnFetchedListener<T, S> listener, final S id) {
        load(listener, id, null);
    }

    public int getHash(S id, Bundle parameters) {
        if (id != null) {
            return id.hashCode();
        }
        return 1;
    }

    protected void subscribeWhileBusy(int hash, OnFetchedListener<T, S> listener) {
        if (listener == null) {
            return;
        }
        List<SharedListener<T, S>> list = this.listeners.get(Integer.valueOf(hash));
        Log.d("SHAREDINTERACTOR", getClass().getName() + " SUBSCRIBING WHILE BUSY... listener: " + listener.getClass().getSimpleName());
        if (list == null) {
            list = new ArrayList<>();
            this.listeners.put(Integer.valueOf(hash), list);
            Log.d("SHAREDINTERACTOR", getClass().getName() + " Created new listener list for hash: " + hash);
        }
        SharedListener<T, S> sharedListener = new SharedListener<>(listener, true);
        if (!list.contains(sharedListener)) {
            list.add(sharedListener);
            Log.d("SHAREDINTERACTOR", getClass().getName() + " Added listener to list. Total listeners for hash " + hash + ": " + list.size());
        } else {
            Log.d("SHAREDINTERACTOR", getClass().getName() + " Listener already exists in list");
        }
    }

    public void subscribe(S id, Bundle parameters, OnFetchedListener<T, S> listener) {
        List<SharedListener<T, S>> list = this.listeners.get(Integer.valueOf(getHash(id, parameters)));
        if (list == null) {
            list = new ArrayList<>();
            this.listeners.put(Integer.valueOf(getHash(id, parameters)), list);
        }
        SharedListener<T, S> sharedListener = new SharedListener<>(listener, false);
        if (listener == null || list.contains(sharedListener)) {
            return;
        }
        list.add(sharedListener);
    }

    public void subscribe(S id, OnFetchedListener<T, S> listener) {
        List<SharedListener<T, S>> list = this.listeners.get(Integer.valueOf(getHash(id, null)));
        if (list == null) {
            list = new ArrayList<>();
            this.listeners.put(Integer.valueOf(getHash(id, null)), list);
        }
        SharedListener<T, S> sharedListener = new SharedListener<>(listener, false);
        if (listener == null || list.contains(sharedListener)) {
            return;
        }
        list.add(sharedListener);
    }

    public void unsubscribe(S id, Bundle parameters, OnFetchedListener<T, S> listener) {
        unsubscribeListener(this.listeners.get(Integer.valueOf(getHash(id, parameters))), listener);
    }

    protected void unsubscribeListener(List<SharedListener<T, S>> listeners, OnFetchedListener<T, S> listener) {
        if (listeners == null) {
            return;
        }
        Iterator<SharedListener<T, S>> it = listeners.iterator();
        while (it.hasNext()) {
            if (it.next().getListener() == listener) {
                it.remove();
            }
        }
    }

    public void unsubscribe(S id, OnFetchedListener<T, S> listener) {
        unsubscribeListener(this.listeners.get(Integer.valueOf(getHash(id, null))), listener);
    }

    public void unsubscribe(OnFetchedListener<T, S> listener) {
        Iterator<List<SharedListener<T, S>>> it = this.listeners.values().iterator();
        while (it.hasNext()) {
            unsubscribeListener(it.next(), listener);
        }
    }

    public void load(final OnFetchedListener<T, S> listener, final S id, final Bundle parameters) {
        int hash = getHash(id, parameters);
        Log.d("SHAREDINTERACTOR", getClass().getName() + " HASH = " + hash + ", listener: " + (listener != null ? listener.getClass().getSimpleName() : AbstractJsonLexerKt.NULL));
        if (isBusy(hash)) {
            Log.d("SHAREDINTERACTOR", getClass().getName() + " SUBSCRIBING WHILE BUSY...");
            subscribeWhileBusy(hash, listener);
        } else {
            if (getCachedResponse(hash, true) != null) {
                Log.d("SHAREDINTERACTOR", getClass().getName() + " HAVING VALID CACHED VERSION OF REQUEST RESPONSE");
                notifyListener(hash, listener, generateMessageResponse(id, FetchStat.SUCCESS, parameters));
                return;
            }
            lock(hash);
            subscribeWhileBusy(hash, listener);
            Log.d("SHAREDINTERACTOR", getClass().getName() + " LOCKED...");
            final Request<S> request = new Request<>(id, parameters, hash);
            buildCall(request, new CallBuildListener<T>() { // from class: org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.1
                @Override // org.betup.model.remote.api.rest.base.CallBuildListener
                public void onCallBuilt(Call<T> call) {
                    LogUtil.INSTANCE.addStartTime("MatchesDetailsInfo", "Request begin");
                    BaseCachedSharedInteractor.this.getResult(call, request);
                    LogUtil.INSTANCE.addStartTime("MatchesDetailsInfo", "Request end");
                }
            });
        }
    }

    public T getFromCacheIfExists(S id, Bundle parameters) {
        return getCachedResponse(getHash(id, parameters), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void buildCall(Request<S> request, CallBuildListener<T> listener) {
        listener.onCallBuilt(makeCall(this.mRetrofitService, request.getId(), request.getParameters()));
    }

    protected void getResult(Call<T> call, final Request<S> request) {
        Log.d("ERROR", "GETTING RESULT " + getClass().getName());
        call.enqueue(new Callback<T>() { // from class: org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.2
            int retryCount;

            {
                this.retryCount = BaseCachedSharedInteractor.this.getRetryCount();
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                BaseCachedSharedInteractor.this.processResponse(request, response);
            }

            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable t) {
                int i = this.retryCount;
                if (i > 0) {
                    this.retryCount = i - 1;
                    call2.mo14623clone().enqueue(this);
                } else {
                    BaseCachedSharedInteractor.this.processFailure(request, t);
                }
            }
        });
    }

    protected void processResponse(Request<S> request, Response<T> response) {
        unlock(request.getHash());
        Log.d("SHAREDINTERACTOR", getClass().getName() + " RESPONSE GOT...");
        Profiler.showHeaders(getContext(), response.headers());
        if (isResponseSuccessfull(response)) {
            Log.d("SHAREDINTERACTOR", getClass().getName() + " CACHING..." + request.getHash() + " with " + (response.body() != null ? "valid body" : "null body"));
            cacheResponse(request.getHash(), response.body(), getLifetime(request.getId(), request.getParameters()));
            if (useHashAfterFetch()) {
                Log.d("SHAREDINTERACTOR", getClass().getName() + " CACHING DOUBLE..." + getHashFetched(response.body(), request.getId(), request.getParameters()));
                cacheResponse(getHashFetched(response.body(), request.getId(), request.getParameters()), response.body(), getLifetime(request.getId(), request.getParameters()));
            }
            Log.d("SHAREDINTERACTOR", getClass().getName() + " About to notify listeners with SUCCESS");
            notifyListeners(request.getHash(), generateMessageResponse(request.getId(), FetchStat.SUCCESS, request.getParameters()));
            return;
        }
        String str = null;
        try {
            ResponseBody errorBody = response.errorBody();
            if (errorBody != null) {
                str = errorBody.string();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (str == null) {
            str = response.toString();
        }
        FetchStat errorStat = getErrorStat(response);
        Log.d("SHAREDINTERACTOR", getClass().getName() + " Response failed with stat: " + errorStat + ", error: " + str);
        if (isCritical()) {
            ServerDownMessage serverDownMessage = new ServerDownMessage(str, getErrorStat(response));
            serverDownMessage.setSourceInteractor(getClass().getName());
            serverDownMessage.setStatusCode(response.code());
            serverDownMessage.setFrom("OnResponse");
            EventBus.getDefault().post(serverDownMessage);
        }
        Log.d("SHAREDINTERACTOR", getClass().getName() + " About to notify listeners with ERROR");
        notifyInvalidResponse(errorStat, str, request);
    }

    protected FetchStat getErrorStat(Response<T> response) {
        return FetchStat.INVALID;
    }

    protected void notifyInvalidResponse(FetchStat fetchStat, String errorBody, Request<S> request) {
        notifyListeners(request.getHash(), generateMessageResponse(request.getId(), fetchStat, request.getParameters()));
    }

    protected void processFailure(Request<S> request, Throwable throwable) {
        unlock(request.getHash());
        if (isCritical()) {
            if (!isTransientNetworkFailure(throwable)) {
                FirebaseCrashlytics.getInstance().recordException(throwable);
            } else {
                FirebaseCrashlytics.getInstance().log("Transient network failure (not reported): " + throwable.getClass().getSimpleName() + " — " + String.valueOf(throwable.getMessage()));
            }
            Log.d("SHAREDINTERACTOR", getClass().getName() + " RESPONSE FAILED...");
            ServerDownMessage serverDownMessage = new ServerDownMessage(throwable, FetchStat.FAIL_AFTER_RETRIALS);
            serverDownMessage.setSourceInteractor(getClass().getName());
            serverDownMessage.setFrom("OnFailure");
            EventBus.getDefault().post(serverDownMessage);
        }
        notifyListeners(request.getHash(), generateMessageResponse(request.getId(), FetchStat.NO_CONNECTION, request.getParameters()));
        throwable.printStackTrace();
    }

    private static boolean isTransientNetworkFailure(Throwable t) {
        while (t != null) {
            if ((t instanceof SocketTimeoutException) || (t instanceof UnknownHostException) || (t instanceof ConnectException) || (t instanceof InterruptedIOException)) {
                return true;
            }
            t = t.getCause();
        }
        return false;
    }

    protected void notifyListener(int hash, OnFetchedListener<T, S> listener, FetchedResponseMessage<T, S> message) {
        if (listener == null) {
            return;
        }
        List<SharedListener<T, S>> list = this.listeners.get(Integer.valueOf(hash));
        if (list == null) {
            listener.onFetched(message);
            return;
        }
        Log.d("SHAREDINTERACTOR", "NOTIFYING ALL...");
        for (SharedListener sharedListener : new ArrayList(list)) {
            if (sharedListener.getListener() != null && !sharedListener.getListener().equals(listener)) {
                sharedListener.getListener().onFetched(message);
            }
        }
        listener.onFetched(message);
    }

    protected void notifyListeners(int hash, FetchedResponseMessage<T, S> message) {
        if (this.listeners.get(Integer.valueOf(hash)) == null) {
            onBeforeListenersNotified(message);
            Log.d("SHAREDINTERACTOR", getClass().getName() + " LISTENER LIST IS EMPTY - NO LISTENERS TO NOTIFY");
            onListenersNotified(message);
            return;
        }
        onBeforeListenersNotified(message);
        Log.d("SHAREDINTERACTOR", getClass().getName() + " NOTIFYING LISTENERS... " + this.listeners.size() + " total listeners, " + this.listeners.get(Integer.valueOf(hash)).size() + " for this hash");
        List<SharedListener<T, S>> list = this.listeners.get(Integer.valueOf(hash));
        for (SharedListener sharedListener : new ArrayList(list)) {
            if (sharedListener.getListener() == null) {
                Log.d("SHAREDINTERACTOR", getClass().getName() + " Skipping null listener");
            } else {
                Log.d("SHAREDINTERACTOR", getClass().getName() + " Notifying listener: " + sharedListener.getListener().getClass().getSimpleName() + ", autoRemove: " + sharedListener.autoRemove);
                sharedListener.getListener().onFetched(message);
                if (sharedListener.autoRemove) {
                    Log.d("SHAREDINTERACTOR", getClass().getName() + " Removing auto-remove listener after notification");
                    list.remove(sharedListener);
                }
            }
        }
        onListenersNotified(message);
    }

    protected boolean isResponseSuccessfull(Response<T> response) {
        return (response == null || response.body() == null || !response.isSuccessful()) ? false : true;
    }
}
