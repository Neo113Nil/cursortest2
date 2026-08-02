package rx.plugins;

/* loaded from: classes18.dex */
final class RxJavaObservableExecutionHookDefault extends rx.plugins.RxJavaObservableExecutionHook {
    private static final rx.plugins.RxJavaObservableExecutionHookDefault getHighSpeedVideoSizes = new rx.plugins.RxJavaObservableExecutionHookDefault();

    private RxJavaObservableExecutionHookDefault() {
    }

    public static rx.plugins.RxJavaObservableExecutionHook Camera2StreamConfigurationMap() {
        return getHighSpeedVideoSizes;
    }
}
