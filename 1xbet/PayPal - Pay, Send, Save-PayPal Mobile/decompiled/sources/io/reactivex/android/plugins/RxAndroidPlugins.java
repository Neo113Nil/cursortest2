package io.reactivex.android.plugins;

/* loaded from: classes17.dex */
public final class RxAndroidPlugins {
    private static volatile io.reactivex.functions.Function<io.reactivex.Scheduler, io.reactivex.Scheduler> getHighResolutionOutputSizeshNQ4ISI;
    private static volatile io.reactivex.functions.Function<java.util.concurrent.Callable<io.reactivex.Scheduler>, io.reactivex.Scheduler> getHighSpeedVideoFpsRangesFor;

    public static void setInitMainThreadSchedulerHandler(io.reactivex.functions.Function<java.util.concurrent.Callable<io.reactivex.Scheduler>, io.reactivex.Scheduler> function) {
        getHighSpeedVideoFpsRangesFor = function;
    }

    public static io.reactivex.Scheduler initMainThreadScheduler(java.util.concurrent.Callable<io.reactivex.Scheduler> callable) {
        if (callable == null) {
            throw new java.lang.NullPointerException("scheduler == null");
        }
        io.reactivex.functions.Function<java.util.concurrent.Callable<io.reactivex.Scheduler>, io.reactivex.Scheduler> function = getHighSpeedVideoFpsRangesFor;
        if (function == null) {
            return getHighSpeedVideoFpsRangesFor(callable);
        }
        io.reactivex.Scheduler scheduler = (io.reactivex.Scheduler) getHighResolutionOutputSizeshNQ4ISI(function, callable);
        if (scheduler != null) {
            return scheduler;
        }
        throw new java.lang.NullPointerException("Scheduler Callable returned null");
    }

    public static void setMainThreadSchedulerHandler(io.reactivex.functions.Function<io.reactivex.Scheduler, io.reactivex.Scheduler> function) {
        getHighResolutionOutputSizeshNQ4ISI = function;
    }

    public static io.reactivex.Scheduler onMainThreadScheduler(io.reactivex.Scheduler scheduler) {
        if (scheduler == null) {
            throw new java.lang.NullPointerException("scheduler == null");
        }
        io.reactivex.functions.Function<io.reactivex.Scheduler, io.reactivex.Scheduler> function = getHighResolutionOutputSizeshNQ4ISI;
        return function == null ? scheduler : (io.reactivex.Scheduler) getHighResolutionOutputSizeshNQ4ISI(function, scheduler);
    }

    public static io.reactivex.functions.Function<java.util.concurrent.Callable<io.reactivex.Scheduler>, io.reactivex.Scheduler> getInitMainThreadSchedulerHandler() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static io.reactivex.functions.Function<io.reactivex.Scheduler, io.reactivex.Scheduler> getOnMainThreadSchedulerHandler() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public static void reset() {
        setInitMainThreadSchedulerHandler(null);
        setMainThreadSchedulerHandler(null);
    }

    private static io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor(java.util.concurrent.Callable<io.reactivex.Scheduler> callable) {
        try {
            io.reactivex.Scheduler call = callable.call();
            if (call != null) {
                return call;
            }
            throw new java.lang.NullPointerException("Scheduler Callable returned null");
        } catch (java.lang.Throwable th) {
            throw io.reactivex.exceptions.Exceptions.propagate(th);
        }
    }

    private static <T, R> R getHighResolutionOutputSizeshNQ4ISI(io.reactivex.functions.Function<T, R> function, T t) {
        try {
            return function.apply(t);
        } catch (java.lang.Throwable th) {
            throw io.reactivex.exceptions.Exceptions.propagate(th);
        }
    }

    private RxAndroidPlugins() {
        throw new java.lang.AssertionError("No instances.");
    }
}
