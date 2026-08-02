package rx.plugins;

/* loaded from: classes18.dex */
public class RxJavaSchedulersHook {
    private static final rx.plugins.RxJavaSchedulersHook getHighSpeedVideoSizes = new rx.plugins.RxJavaSchedulersHook();

    public rx.Scheduler getComputationScheduler() {
        return null;
    }

    public rx.Scheduler getIOScheduler() {
        return null;
    }

    public rx.Scheduler getNewThreadScheduler() {
        return null;
    }

    @java.lang.Deprecated
    public rx.functions.Action0 onSchedule(rx.functions.Action0 action0) {
        return action0;
    }

    public static rx.Scheduler createComputationScheduler() {
        return createComputationScheduler(new rx.internal.util.RxThreadFactory("RxComputationScheduler-"));
    }

    public static rx.Scheduler createComputationScheduler(java.util.concurrent.ThreadFactory threadFactory) {
        if (threadFactory == null) {
            throw new java.lang.NullPointerException("threadFactory == null");
        }
        return new rx.internal.schedulers.EventLoopsScheduler(threadFactory);
    }

    public static rx.Scheduler createIoScheduler() {
        return createIoScheduler(new rx.internal.util.RxThreadFactory("RxIoScheduler-"));
    }

    public static rx.Scheduler createIoScheduler(java.util.concurrent.ThreadFactory threadFactory) {
        if (threadFactory == null) {
            throw new java.lang.NullPointerException("threadFactory == null");
        }
        return new rx.internal.schedulers.CachedThreadScheduler(threadFactory);
    }

    public static rx.Scheduler createNewThreadScheduler() {
        return createNewThreadScheduler(new rx.internal.util.RxThreadFactory("RxNewThreadScheduler-"));
    }

    public static rx.Scheduler createNewThreadScheduler(java.util.concurrent.ThreadFactory threadFactory) {
        if (threadFactory == null) {
            throw new java.lang.NullPointerException("threadFactory == null");
        }
        return new rx.internal.schedulers.NewThreadScheduler(threadFactory);
    }

    public static rx.plugins.RxJavaSchedulersHook getDefaultInstance() {
        return getHighSpeedVideoSizes;
    }
}
