package org.betup.model.remote.api.rest.base;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GetTokenResult;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import retrofit2.Call;
import retrofit2.Response;

/* loaded from: classes2.dex */
public abstract class BaseTokenInteractor<T, S, F> extends BaseCachedSharedInteractor<T, S, F> {
    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    protected final Call<T> makeCall(F api, S id, Bundle parameters) {
        return null;
    }

    protected abstract Call<T> makeCall(F api, S id, Bundle parameters, String token);

    protected void onAuthFails() {
    }

    protected boolean shouldForceRefreshToken(S id, Bundle parameters) {
        return false;
    }

    public T transformErrorBody(String body) {
        return null;
    }

    public BaseTokenInteractor(Context context) {
        super(context);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    protected FetchStat getErrorStat(Response<T> response) {
        if (response.code() == 401 || response.code() == 403) {
            return FetchStat.NO_AUTH;
        }
        if (response.code() == 404) {
            return FetchStat.NOT_FOUND;
        }
        return FetchStat.INVALID;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public void load(BaseCachedSharedInteractor.OnFetchedListener<T, S> listener, S id) {
        super.load(listener, id);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    protected void buildCall(final Request<S> request, final CallBuildListener<T> listener) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        if (firebaseAuth.getCurrentUser() != null) {
            firebaseAuth.getCurrentUser().getIdToken(shouldForceRefreshToken(request.getId(), request.getParameters())).addOnCompleteListener(new OnCompleteListener<GetTokenResult>() { // from class: org.betup.model.remote.api.rest.base.BaseTokenInteractor.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(Task<GetTokenResult> task) {
                    if (task.isSuccessful()) {
                        CallBuildListener callBuildListener = listener;
                        BaseTokenInteractor baseTokenInteractor = BaseTokenInteractor.this;
                        callBuildListener.onCallBuilt(baseTokenInteractor.makeCall(baseTokenInteractor.mRetrofitService, request.getId(), request.getParameters(), task.getResult().getToken()));
                    } else {
                        BaseTokenInteractor.this.unlock(request.getHash());
                        BaseTokenInteractor.this.onAuthFails();
                        BaseTokenInteractor.this.notifyListeners(request.getHash(), BaseTokenInteractor.this.generateMessageResponse(request.getId(), FetchStat.NO_AUTH, request.getParameters()));
                    }
                }
            });
            return;
        }
        unlock(request.getHash());
        onAuthFails();
        notifyListeners(request.getHash(), generateMessageResponse(request.getId(), FetchStat.NO_AUTH, request.getParameters()));
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    protected void notifyInvalidResponse(FetchStat fetchStat, String errorBody, Request<S> request) {
        if (fetchStat == FetchStat.NO_AUTH) {
            onAuthFails();
        }
        Log.d("TRANSFORM", "TRANSFORMING BODY");
        notifyListeners(request.getHash(), generateMessageResponseFromBody(transformErrorBody(errorBody), request.getId(), fetchStat, request.getParameters()));
    }
}
