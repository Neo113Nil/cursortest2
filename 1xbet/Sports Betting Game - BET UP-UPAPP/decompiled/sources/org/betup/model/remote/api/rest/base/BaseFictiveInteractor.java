package org.betup.model.remote.api.rest.base;

import android.os.AsyncTask;
import java.lang.ref.WeakReference;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;

/* loaded from: classes2.dex */
public abstract class BaseFictiveInteractor<T, S> {
    public abstract T getResult(S id);

    public long getTimeout() {
        return 1000L;
    }

    public void load(S id, BaseCachedSharedInteractor.OnFetchedListener<T, S> listener) {
        new Task(id, getTimeout(), listener).execute(new Void[0]);
    }

    private class Task extends AsyncTask<Void, Void, Void> {
        private S id;
        private WeakReference<BaseCachedSharedInteractor.OnFetchedListener<T, S>> listener;
        private long timeout;

        public Task(S id, long timeout, BaseCachedSharedInteractor.OnFetchedListener<T, S> listener) {
            this.timeout = timeout;
            this.listener = new WeakReference<>(listener);
            this.id = id;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voids) {
            try {
                Thread.sleep(this.timeout);
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Void aVoid) {
            super.onPostExecute((Task) aVoid);
            BaseCachedSharedInteractor.OnFetchedListener<T, S> onFetchedListener = this.listener.get();
            if (onFetchedListener != null) {
                onFetchedListener.onFetched(new FetchedResponseMessage<>(BaseFictiveInteractor.this.getResult(this.id), FetchStat.SUCCESS, this.id, null));
            }
        }
    }
}
