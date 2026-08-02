package rx;

/* loaded from: classes18.dex */
public abstract class Scheduler {
    public abstract rx.Scheduler.Worker createWorker();

    public static abstract class Worker implements rx.Subscription {
        public abstract rx.Subscription schedule(rx.functions.Action0 action0);

        public abstract rx.Subscription schedule(rx.functions.Action0 action0, long j, java.util.concurrent.TimeUnit timeUnit);

        public rx.Subscription schedulePeriodically(rx.functions.Action0 action0, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
            return rx.internal.schedulers.SchedulePeriodicHelper.schedulePeriodically(this, action0, j, j2, timeUnit, null);
        }

        public long now() {
            return java.lang.System.currentTimeMillis();
        }
    }

    public long now() {
        return java.lang.System.currentTimeMillis();
    }

    public <S extends rx.Scheduler & rx.Subscription> S when(rx.functions.Func1<rx.Observable<rx.Observable<rx.Completable>>, rx.Completable> func1) {
        return new rx.internal.schedulers.SchedulerWhen(func1, this);
    }
}
