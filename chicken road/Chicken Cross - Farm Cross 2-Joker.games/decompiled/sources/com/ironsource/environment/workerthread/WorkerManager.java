package com.ironsource.environment.workerthread;

import com.ironsource.C4491k4;
import com.ironsource.environment.workerthread.WorkerResult;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class WorkerManager<T> {

    /* renamed from: a, reason: collision with root package name */
    List<Callable<T>> f8178a = new ArrayList();
    private final ExecutorService b;

    public interface WorkEndedListener<T> {
        void onWorkCompleted(List<WorkerResult<T>> list, long j);

        void onWorkFailed(String str);
    }

    public WorkerManager(ExecutorService executorService) {
        this.b = executorService;
    }

    public void addCallable(Callable<T> callable) {
        this.f8178a.add(callable);
    }

    public void startWork(WorkEndedListener<T> workEndedListener, long j, TimeUnit timeUnit) {
        if (this.b.isShutdown()) {
            workEndedListener.onWorkFailed("can not start work, executor has been shut down");
            return;
        }
        if (this.f8178a.isEmpty()) {
            workEndedListener.onWorkFailed("can not start work, callable list is empty");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            List<Future<T>> invokeAll = this.b.invokeAll(this.f8178a, j, timeUnit);
            for (int i = 0; i < invokeAll.size(); i++) {
                Future<T> future = invokeAll.get(i);
                if (!future.isDone() || future.isCancelled()) {
                    arrayList.add(new WorkerResult.Canceled(this.f8178a.get(i)));
                } else {
                    try {
                        arrayList.add(new WorkerResult.Completed(future.get()));
                    } catch (InterruptedException e) {
                        e = e;
                        C4491k4.d().a(e);
                        arrayList.add(new WorkerResult.Failed(this.f8178a.get(i), e));
                    } catch (CancellationException e2) {
                        C4491k4.d().a(e2);
                        arrayList.add(new WorkerResult.Canceled(this.f8178a.get(i)));
                    } catch (ExecutionException e3) {
                        e = e3;
                        C4491k4.d().a(e);
                        arrayList.add(new WorkerResult.Failed(this.f8178a.get(i), e));
                    }
                }
            }
            workEndedListener.onWorkCompleted(arrayList, System.currentTimeMillis() - currentTimeMillis);
            this.b.shutdownNow();
        } catch (Exception e4) {
            C4491k4.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            workEndedListener.onWorkFailed("failed to invoke callables, error= " + e4.getMessage());
            this.b.shutdownNow();
        }
    }
}
