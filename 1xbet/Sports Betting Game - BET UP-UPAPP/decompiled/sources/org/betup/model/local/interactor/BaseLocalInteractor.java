package org.betup.model.local.interactor;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import java.lang.ref.WeakReference;
import org.betup.model.local.AppDatabase;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;

/* loaded from: classes2.dex */
public abstract class BaseLocalInteractor<T, S> {
    private AppDatabase appDatabase;
    private Context context;

    protected abstract T doJob(AppDatabase appDatabase, S params, Bundle bundle);

    public BaseLocalInteractor(Context context, AppDatabase appDatabase) {
        this.context = context;
        this.appDatabase = appDatabase;
    }

    public AppDatabase getAppDatabase() {
        return this.appDatabase;
    }

    public Context getContext() {
        return this.context;
    }

    public void load(BaseCachedSharedInteractor.OnFetchedListener<T, S> listener, S param, Bundle bundle) {
        new AsyncDatabaseTask(this, this.appDatabase, param, new WeakReference(listener), bundle).execute(new Void[0]);
    }

    protected void onJobCompleted(WeakReference<BaseCachedSharedInteractor.OnFetchedListener<T, S>> listenerWeakReference, T result, S param, Bundle bundle) {
        BaseCachedSharedInteractor.OnFetchedListener<T, S> onFetchedListener = listenerWeakReference.get();
        if (onFetchedListener == null) {
            return;
        }
        onFetchedListener.onFetched(new FetchedResponseMessage<>(result, result == null ? FetchStat.INVALID : FetchStat.SUCCESS, param, bundle));
    }

    protected static class AsyncDatabaseTask<T, S> extends AsyncTask<Void, Void, T> {
        private AppDatabase appDatabase;
        private Bundle bundle;
        private WeakReference<BaseCachedSharedInteractor.OnFetchedListener<T, S>> listenerWeakReference;
        private BaseLocalInteractor<T, S> localInteractor;
        private S param;

        public AsyncDatabaseTask(BaseLocalInteractor<T, S> localInteractor, AppDatabase appDatabase, S param, WeakReference<BaseCachedSharedInteractor.OnFetchedListener<T, S>> listenerWeakReference, Bundle bundle) {
            this.localInteractor = localInteractor;
            this.appDatabase = appDatabase;
            this.param = param;
            this.bundle = bundle;
            this.listenerWeakReference = listenerWeakReference;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public T doInBackground(Void... voids) {
            try {
                return this.localInteractor.doJob(this.appDatabase, this.param, this.bundle);
            } catch (Exception e) {
                Log.e("ROOMTEST", "ERROR = " + e.getMessage());
                return null;
            }
        }

        @Override // android.os.AsyncTask
        protected void onPostExecute(T t) {
            super.onPostExecute(t);
            this.localInteractor.onJobCompleted(this.listenerWeakReference, t, this.param, this.bundle);
        }
    }
}
