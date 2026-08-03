package com.ironsource.environment.workerthread;

/* loaded from: classes5.dex */
public class WorkerManager<T> {

    /* renamed from: a, reason: collision with root package name */
    java.util.List<java.util.concurrent.Callable<T>> f6232a = new java.util.ArrayList();
    private final java.util.concurrent.ExecutorService b;

    public interface WorkEndedListener<T> {
        void onWorkCompleted(java.util.List<com.ironsource.environment.workerthread.WorkerResult<T>> list, long j);

        void onWorkFailed(java.lang.String str);
    }

    public WorkerManager(java.util.concurrent.ExecutorService executorService) {
        this.b = executorService;
    }

    public void addCallable(java.util.concurrent.Callable<T> callable) {
        this.f6232a.add(callable);
    }

    public void startWork(com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener<T> workEndedListener, long j, java.util.concurrent.TimeUnit timeUnit) {
        if (this.b.isShutdown()) {
            workEndedListener.onWorkFailed("can not start work, executor has been shut down");
            return;
        }
        if (this.f6232a.isEmpty()) {
            workEndedListener.onWorkFailed("can not start work, callable list is empty");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.util.List<java.util.concurrent.Future<T>> invokeAll = this.b.invokeAll(this.f6232a, j, timeUnit);
            for (int i = 0; i < invokeAll.size(); i++) {
                java.util.concurrent.Future<T> future = invokeAll.get(i);
                if (!future.isDone() || future.isCancelled()) {
                    arrayList.add(new com.ironsource.environment.workerthread.WorkerResult.Canceled(this.f6232a.get(i)));
                } else {
                    try {
                        arrayList.add(new com.ironsource.environment.workerthread.WorkerResult.Completed(future.get()));
                    } catch (java.lang.InterruptedException e) {
                        e = e;
                        com.ironsource.C3180n4.d().a(e);
                        arrayList.add(new com.ironsource.environment.workerthread.WorkerResult.Failed(this.f6232a.get(i), e));
                    } catch (java.util.concurrent.CancellationException e2) {
                        com.ironsource.C3180n4.d().a(e2);
                        arrayList.add(new com.ironsource.environment.workerthread.WorkerResult.Canceled(this.f6232a.get(i)));
                    } catch (java.util.concurrent.ExecutionException e3) {
                        e = e3;
                        com.ironsource.C3180n4.d().a(e);
                        arrayList.add(new com.ironsource.environment.workerthread.WorkerResult.Failed(this.f6232a.get(i), e));
                    }
                }
            }
            workEndedListener.onWorkCompleted(arrayList, java.lang.System.currentTimeMillis() - currentTimeMillis);
            this.b.shutdownNow();
        } catch (java.lang.Exception e4) {
            com.ironsource.C3180n4.d().a(e4);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e4.toString());
            workEndedListener.onWorkFailed("failed to invoke callables, error= " + e4.getMessage());
            this.b.shutdownNow();
        }
    }
}
