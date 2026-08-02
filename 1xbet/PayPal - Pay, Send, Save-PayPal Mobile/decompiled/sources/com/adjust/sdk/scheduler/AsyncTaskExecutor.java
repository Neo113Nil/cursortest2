package com.adjust.sdk.scheduler;

/* loaded from: classes7.dex */
public abstract class AsyncTaskExecutor<Params, Result> {
    public abstract Result doInBackground(Params[] paramsArr);

    @java.lang.SafeVarargs
    public final com.adjust.sdk.scheduler.AsyncTaskExecutor<Params, Result> execute(final Params... paramsArr) {
        onPreExecute();
        final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        java.util.concurrent.Executors.newSingleThreadExecutor().execute(new java.lang.Runnable() { // from class: com.adjust.sdk.scheduler.AsyncTaskExecutor.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                final java.lang.Object doInBackground = com.adjust.sdk.scheduler.AsyncTaskExecutor.this.doInBackground(paramsArr);
                handler.post(new java.lang.Runnable() { // from class: com.adjust.sdk.scheduler.AsyncTaskExecutor.1.1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.adjust.sdk.scheduler.AsyncTaskExecutor.this.onPostExecute(doInBackground);
                    }
                });
            }
        });
        return this;
    }

    public void onPostExecute(Result result) {
    }

    public void onPreExecute() {
    }
}
