package androidx.work;

/* loaded from: classes2.dex */
public abstract class Worker extends androidx.work.ListenableWorker {
    androidx.work.impl.utils.futures.SettableFuture<androidx.work.ListenableWorker.Result> mFuture;

    public abstract androidx.work.ListenableWorker.Result doWork();

    public Worker(android.content.Context context, androidx.work.WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @Override // androidx.work.ListenableWorker
    public final com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker.Result> startWork() {
        this.mFuture = androidx.work.impl.utils.futures.SettableFuture.create();
        getBackgroundExecutor().execute(new java.lang.Runnable() { // from class: androidx.work.Worker.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    androidx.work.Worker.this.mFuture.set(androidx.work.Worker.this.doWork());
                } catch (java.lang.Throwable th) {
                    androidx.work.Worker.this.mFuture.setException(th);
                }
            }
        });
        return this.mFuture;
    }

    @Override // androidx.work.ListenableWorker
    public com.google.common.util.concurrent.ListenableFuture<androidx.work.ForegroundInfo> getForegroundInfoAsync() {
        final androidx.work.impl.utils.futures.SettableFuture create = androidx.work.impl.utils.futures.SettableFuture.create();
        getBackgroundExecutor().execute(new java.lang.Runnable() { // from class: androidx.work.Worker.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    create.set(androidx.work.Worker.this.getForegroundInfo());
                } catch (java.lang.Throwable th) {
                    create.setException(th);
                }
            }
        });
        return create;
    }

    public androidx.work.ForegroundInfo getForegroundInfo() {
        throw new java.lang.IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }
}
