package rx.internal.schedulers;

/* loaded from: classes18.dex */
enum GenericScheduledExecutorServiceFactory {
    ;

    static final rx.internal.util.RxThreadFactory getHighSpeedVideoSizes = new rx.internal.util.RxThreadFactory("RxScheduledExecutorPool-");

    public static java.util.concurrent.ScheduledExecutorService Camera2StreamConfigurationMap() {
        rx.functions.Func0<? extends java.util.concurrent.ScheduledExecutorService> onGenericScheduledExecutorService = rx.plugins.RxJavaHooks.getOnGenericScheduledExecutorService();
        if (onGenericScheduledExecutorService != null) {
            return onGenericScheduledExecutorService.call();
        }
        return java.util.concurrent.Executors.newScheduledThreadPool(1, getHighSpeedVideoSizes);
    }
}
