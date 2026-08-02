package com.paypal.oslo.feature.shaketoreport.shake;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001 B\u0019\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u000bR\u0014\u0010\u001a\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/shake/ShakeToReport;", "Lcom/paypal/oslo/feature/shaketoreport/shake/ActivityUiLifecycleCallbacks$Listener;", "Lcom/paypal/oslo/feature/shaketoreport/shake/ShakeDetector$Listener;", "Lcom/paypal/oslo/feature/shaketoreport/shake/ActivityUiLifecycleCallbacks;", "activityCallbacks", "Lcom/paypal/oslo/feature/shaketoreport/shake/ShakeDetector;", "shakeDetector", "<init>", "(Lcom/paypal/oslo/feature/shaketoreport/shake/ActivityUiLifecycleCallbacks;Lcom/paypal/oslo/feature/shaketoreport/shake/ShakeDetector;)V", "", "start$shake_to_report_prodRelease", "()V", "stop$shake_to_report_prodRelease", "Lcom/paypal/oslo/feature/shaketoreport/shake/ShakeToReport$OnShakeListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnShakeListener", "(Lcom/paypal/oslo/feature/shaketoreport/shake/ShakeToReport$OnShakeListener;)V", "Landroidx/lifecycle/Lifecycle$Event;", "lifecycleEvent", "Landroid/app/Activity;", "activity", "onActivityStatus", "(Landroidx/lifecycle/Lifecycle$Event;Landroid/app/Activity;)V", "onShake", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/shaketoreport/shake/ActivityUiLifecycleCallbacks;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/shaketoreport/shake/ShakeDetector;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/shaketoreport/shake/ShakeToReport$OnShakeListener;", "OnShakeListener"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ShakeToReport implements com.paypal.oslo.feature.shaketoreport.shake.ActivityUiLifecycleCallbacks.Listener, com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector.Listener {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shaketoreport.shake.ActivityUiLifecycleCallbacks getHighResolutionOutputSizeshNQ4ISI;
    private com.paypal.oslo.feature.shaketoreport.shake.ShakeToReport.OnShakeListener getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/shake/ShakeToReport$OnShakeListener;", "", "Landroid/app/Activity;", "activity", "", "onShakeDetected", "(Landroid/app/Activity;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface OnShakeListener {
        void onShakeDetected(android.app.Activity activity);
    }

    @javax.inject.Inject
    public ShakeToReport(com.paypal.oslo.feature.shaketoreport.shake.ActivityUiLifecycleCallbacks activityUiLifecycleCallbacks, com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector shakeDetector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityUiLifecycleCallbacks, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shakeDetector, "");
        this.getHighResolutionOutputSizeshNQ4ISI = activityUiLifecycleCallbacks;
        this.getHighSpeedVideoFpsRangesFor = shakeDetector;
    }

    public final void start$shake_to_report_prodRelease() {
        this.getHighSpeedVideoFpsRangesFor.setOnShakeDetectorListener(this);
        com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector.start$default(this.getHighSpeedVideoFpsRangesFor, 0, 1, null);
    }

    public final void stop$shake_to_report_prodRelease() {
        this.getHighSpeedVideoFpsRangesFor.stop();
        this.getHighSpeedVideoFpsRangesFor.setOnShakeDetectorListener(null);
        this.getHighSpeedVideoFpsRanges = null;
    }

    public final void setOnShakeListener(com.paypal.oslo.feature.shaketoreport.shake.ShakeToReport.OnShakeListener listener) {
        this.getHighSpeedVideoFpsRanges = listener;
    }

    @Override // com.paypal.oslo.feature.shaketoreport.shake.ActivityUiLifecycleCallbacks.Listener
    public final void onActivityStatus(androidx.lifecycle.Lifecycle.Event lifecycleEvent, android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleEvent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        int i = com.paypal.oslo.feature.shaketoreport.shake.ShakeToReport.WhenMappings.$EnumSwitchMapping$0[lifecycleEvent.ordinal()];
        if (i == 1) {
            com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector.start$default(this.getHighSpeedVideoFpsRangesFor, 0, 1, null);
        } else {
            if (i != 2) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor.stop();
        }
    }

    @Override // com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector.Listener
    public final void onShake() {
        kotlin.Unit unit;
        android.app.Activity topForegroundActivity = this.getHighResolutionOutputSizeshNQ4ISI.getTopForegroundActivity();
        if (topForegroundActivity != null) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.shaketoreport.LoggerKt.log, "shake_to_send_detect_activity", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("success", java.lang.Boolean.TRUE), kotlin.TuplesKt.to("activity", topForegroundActivity.getClass().getSimpleName())), null, 4, null);
            com.paypal.oslo.feature.shaketoreport.shake.ShakeToReport.OnShakeListener onShakeListener = this.getHighSpeedVideoFpsRanges;
            if (onShakeListener != null) {
                onShakeListener.onShakeDetected(topForegroundActivity);
                unit = kotlin.Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.shaketoreport.LoggerKt.log, "shake_to_send_detect_activity", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("success", java.lang.Boolean.FALSE), kotlin.TuplesKt.to("message", "Shake detected, but no activity found")), null, 4, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.lifecycle.Lifecycle.Event.values().length];
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_RESUME.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
