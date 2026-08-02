package rx.internal.schedulers;

/* loaded from: classes18.dex */
public class NewThreadWorker extends rx.Scheduler.Worker implements rx.Subscription {
    private static final boolean getHighSpeedVideoFpsRangesFor;
    private static volatile java.lang.Object getHighSpeedVideoSizesFor;
    volatile boolean getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.concurrent.ScheduledExecutorService getInputFormats;
    private static final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();
    private static final java.util.concurrent.ConcurrentHashMap<java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledThreadPoolExecutor> getHighSpeedVideoSizes = new java.util.concurrent.ConcurrentHashMap<>();
    private static final java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>();
    public static final int PURGE_FREQUENCY = java.lang.Integer.getInteger("rx.scheduler.jdk6.purge-frequency-millis", 1000).intValue();

    static {
        boolean z = java.lang.Boolean.getBoolean("rx.scheduler.jdk6.purge-force");
        int androidApiVersion = rx.internal.util.PlatformDependent.getAndroidApiVersion();
        getHighSpeedVideoFpsRangesFor = !z && (androidApiVersion == 0 || androidApiVersion >= 21);
    }

    public static void registerExecutor(java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        while (true) {
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> atomicReference = Camera2StreamConfigurationMap;
            if (atomicReference.get() != null) {
                break;
            }
            java.util.concurrent.ScheduledExecutorService newScheduledThreadPool = java.util.concurrent.Executors.newScheduledThreadPool(1, new rx.internal.util.RxThreadFactory("RxSchedulerPurge-"));
            if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, newScheduledThreadPool)) {
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: rx.internal.schedulers.NewThreadWorker.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        rx.internal.schedulers.NewThreadWorker.getHighSpeedVideoFpsRanges();
                    }
                };
                long j = PURGE_FREQUENCY;
                newScheduledThreadPool.scheduleAtFixedRate(runnable, j, j, java.util.concurrent.TimeUnit.MILLISECONDS);
                break;
            }
            newScheduledThreadPool.shutdownNow();
        }
        getHighSpeedVideoSizes.putIfAbsent(scheduledThreadPoolExecutor, scheduledThreadPoolExecutor);
    }

    public static void deregisterExecutor(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        getHighSpeedVideoSizes.remove(scheduledExecutorService);
    }

    static void getHighSpeedVideoFpsRanges() {
        try {
            java.util.Iterator<java.util.concurrent.ScheduledThreadPoolExecutor> it = getHighSpeedVideoSizes.keySet().iterator();
            while (it.hasNext()) {
                java.util.concurrent.ScheduledThreadPoolExecutor next = it.next();
                if (!next.isShutdown()) {
                    next.purge();
                } else {
                    it.remove();
                }
            }
        } catch (java.lang.Throwable th) {
            rx.exceptions.Exceptions.throwIfFatal(th);
            rx.plugins.RxJavaHooks.onError(th);
        }
    }

    public static boolean tryEnableCancelPolicy(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        java.lang.reflect.Method highResolutionOutputSizeshNQ4ISI;
        if (getHighSpeedVideoFpsRangesFor) {
            if (scheduledExecutorService instanceof java.util.concurrent.ScheduledThreadPoolExecutor) {
                java.lang.Object obj = getHighSpeedVideoSizesFor;
                java.lang.Object obj2 = getHighSpeedVideoFpsRanges;
                if (obj == obj2) {
                    return false;
                }
                if (obj == null) {
                    highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(scheduledExecutorService);
                    if (highResolutionOutputSizeshNQ4ISI != null) {
                        obj2 = highResolutionOutputSizeshNQ4ISI;
                    }
                    getHighSpeedVideoSizesFor = obj2;
                } else {
                    highResolutionOutputSizeshNQ4ISI = (java.lang.reflect.Method) obj;
                }
            } else {
                highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(scheduledExecutorService);
            }
            if (highResolutionOutputSizeshNQ4ISI != null) {
                try {
                    highResolutionOutputSizeshNQ4ISI.invoke(scheduledExecutorService, java.lang.Boolean.TRUE);
                    return true;
                } catch (java.lang.IllegalAccessException e) {
                    rx.plugins.RxJavaHooks.onError(e);
                } catch (java.lang.IllegalArgumentException e2) {
                    rx.plugins.RxJavaHooks.onError(e2);
                } catch (java.lang.reflect.InvocationTargetException e3) {
                    rx.plugins.RxJavaHooks.onError(e3);
                }
            }
        }
        return false;
    }

    private static java.lang.reflect.Method getHighResolutionOutputSizeshNQ4ISI(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        for (java.lang.reflect.Method method : scheduledExecutorService.getClass().getMethods()) {
            if (method.getName().equals("setRemoveOnCancelPolicy")) {
                java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0] == java.lang.Boolean.TYPE) {
                    return method;
                }
            }
        }
        return null;
    }

    public NewThreadWorker(java.util.concurrent.ThreadFactory threadFactory) {
        java.util.concurrent.ScheduledExecutorService newScheduledThreadPool = java.util.concurrent.Executors.newScheduledThreadPool(1, threadFactory);
        if (!tryEnableCancelPolicy(newScheduledThreadPool) && (newScheduledThreadPool instanceof java.util.concurrent.ScheduledThreadPoolExecutor)) {
            registerExecutor((java.util.concurrent.ScheduledThreadPoolExecutor) newScheduledThreadPool);
        }
        this.getInputFormats = newScheduledThreadPool;
    }

    @Override // rx.Scheduler.Worker
    public rx.Subscription schedule(rx.functions.Action0 action0) {
        return schedule(action0, 0L, null);
    }

    @Override // rx.Scheduler.Worker
    public rx.Subscription schedule(rx.functions.Action0 action0, long j, java.util.concurrent.TimeUnit timeUnit) {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return rx.subscriptions.Subscriptions.unsubscribed();
        }
        return scheduleActual(action0, j, timeUnit);
    }

    public rx.internal.schedulers.ScheduledAction scheduleActual(rx.functions.Action0 action0, long j, java.util.concurrent.TimeUnit timeUnit) {
        java.util.concurrent.Future<?> schedule;
        rx.internal.schedulers.ScheduledAction scheduledAction = new rx.internal.schedulers.ScheduledAction(rx.plugins.RxJavaHooks.onScheduledAction(action0));
        if (j <= 0) {
            schedule = this.getInputFormats.submit(scheduledAction);
        } else {
            schedule = this.getInputFormats.schedule(scheduledAction, j, timeUnit);
        }
        scheduledAction.add(schedule);
        return scheduledAction;
    }

    public rx.internal.schedulers.ScheduledAction scheduleActual(rx.functions.Action0 action0, long j, java.util.concurrent.TimeUnit timeUnit, rx.subscriptions.CompositeSubscription compositeSubscription) {
        java.util.concurrent.Future<?> schedule;
        rx.internal.schedulers.ScheduledAction scheduledAction = new rx.internal.schedulers.ScheduledAction(rx.plugins.RxJavaHooks.onScheduledAction(action0), compositeSubscription);
        compositeSubscription.add(scheduledAction);
        if (j <= 0) {
            schedule = this.getInputFormats.submit(scheduledAction);
        } else {
            schedule = this.getInputFormats.schedule(scheduledAction, j, timeUnit);
        }
        scheduledAction.add(schedule);
        return scheduledAction;
    }

    public rx.internal.schedulers.ScheduledAction scheduleActual(rx.functions.Action0 action0, long j, java.util.concurrent.TimeUnit timeUnit, rx.internal.util.SubscriptionList subscriptionList) {
        java.util.concurrent.Future<?> schedule;
        rx.internal.schedulers.ScheduledAction scheduledAction = new rx.internal.schedulers.ScheduledAction(rx.plugins.RxJavaHooks.onScheduledAction(action0), subscriptionList);
        subscriptionList.add(scheduledAction);
        if (j <= 0) {
            schedule = this.getInputFormats.submit(scheduledAction);
        } else {
            schedule = this.getInputFormats.schedule(scheduledAction, j, timeUnit);
        }
        scheduledAction.add(schedule);
        return scheduledAction;
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getInputFormats.shutdownNow();
        deregisterExecutor(this.getInputFormats);
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
