package io.reactivex.internal.schedulers;

/* loaded from: classes17.dex */
public interface SchedulerMultiWorkerSupport {

    public interface WorkerCallback {
        void onWorker(int i, io.reactivex.Scheduler.Worker worker);
    }

    void createWorkers(int i, io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport.WorkerCallback workerCallback);
}
