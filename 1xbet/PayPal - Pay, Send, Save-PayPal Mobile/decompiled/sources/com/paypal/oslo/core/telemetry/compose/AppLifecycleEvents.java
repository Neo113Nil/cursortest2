package com.paypal.oslo.core.telemetry.compose;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/core/telemetry/compose/AppLifecycleEvents;", "Landroidx/lifecycle/LifecycleEventObserver;", "<init>", "()V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getHighSpeedVideoFpsRanges", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AppLifecycleEvents implements androidx.view.LifecycleEventObserver {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicBoolean Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicBoolean(false);

    public AppLifecycleEvents() {
        androidx.view.ProcessLifecycleOwner.INSTANCE.get().getLifecycleRegistry().addObserver(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.view.LifecycleEventObserver
    public final void onStateChanged(androidx.view.LifecycleOwner source, androidx.lifecycle.Lifecycle.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        int i = com.paypal.oslo.core.telemetry.compose.AppLifecycleEvents.WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        int i2 = 2;
        java.util.List list = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        java.lang.Object[] objArr4 = 0;
        java.lang.Object[] objArr5 = 0;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.AppBackgrounded(new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.APPLICATION, com.paypal.oslo.core.telemetry.AppLifecycleConstants.FEATURE, com.paypal.oslo.core.telemetry.AppLifecycleConstants.ACTION_BACKGROUNDED), list, i2, objArr5 == true ? 1 : 0).track(com.paypal.oslo.core.telemetry.AnalyticsTrackerKt.analyticsTracker);
        } else {
            if (!this.Camera2StreamConfigurationMap.getAndSet(true)) {
                new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.AppLaunch(new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.APPLICATION, com.paypal.oslo.core.telemetry.AppLifecycleConstants.FEATURE, com.paypal.oslo.core.telemetry.AppLifecycleConstants.ACTION_LAUNCHED), objArr4 == true ? 1 : 0, i2, objArr3 == true ? 1 : 0).track(com.paypal.oslo.core.telemetry.AnalyticsTrackerKt.analyticsTracker);
            }
            new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.AppForegrounded(new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.APPLICATION, com.paypal.oslo.core.telemetry.AppLifecycleConstants.FEATURE, com.paypal.oslo.core.telemetry.AppLifecycleConstants.ACTION_FOREGROUNDED), objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0).track(com.paypal.oslo.core.telemetry.AnalyticsTrackerKt.analyticsTracker);
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.lifecycle.Lifecycle.Event.values().length];
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
