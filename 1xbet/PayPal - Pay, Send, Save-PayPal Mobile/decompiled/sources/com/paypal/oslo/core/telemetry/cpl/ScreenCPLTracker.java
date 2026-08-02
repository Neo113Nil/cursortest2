package com.paypal.oslo.core.telemetry.cpl;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R0\u0010\u001a\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u0015j\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0003`\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/core/telemetry/cpl/ScreenCPLTracker;", "Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleObserver;", "Lkotlin/Function0;", "", "clock", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent$Appeared;", "event", "", "onScreenAppeared", "(Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent$Appeared;)V", "Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent$Ready;", "onScreenReady", "(Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent$Ready;)V", "Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent$Disappeared;", "onScreenDisappeared", "(Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent$Disappeared;)V", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function0;", "Camera2StreamConfigurationMap", "Ljava/util/HashMap;", "Landroidx/navigation3/runtime/NavKey;", "Lkotlin/collections/getHighSpeedVideoFpsRangesFor;", "getHighSpeedVideoFpsRanges", "Ljava/util/HashMap;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ScreenCPLTracker implements com.paypal.oslo.core.telemetry.compose.ScreenLifecycleObserver {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.HashMap<androidx.navigation3.runtime.NavKey, java.lang.Long> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<java.lang.Long> Camera2StreamConfigurationMap;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.core.telemetry.cpl.ScreenCPLTracker$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<java.lang.Long> {
        public static final com.paypal.oslo.core.telemetry.cpl.ScreenCPLTracker.AnonymousClass1 Camera2StreamConfigurationMap = new com.paypal.oslo.core.telemetry.cpl.ScreenCPLTracker.AnonymousClass1();

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        public final java.lang.Long invoke() {
            return java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis());
        }

        AnonymousClass1() {
            super(0, android.os.SystemClock.class, "uptimeMillis", "uptimeMillis()J", 0);
        }
    }

    public ScreenCPLTracker(kotlin.jvm.functions.Function0<java.lang.Long> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.Camera2StreamConfigurationMap = function0;
        this.getHighSpeedVideoSizes = new java.util.HashMap<>();
    }

    public /* synthetic */ ScreenCPLTracker(com.paypal.oslo.core.telemetry.cpl.ScreenCPLTracker.AnonymousClass1 anonymousClass1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.paypal.oslo.core.telemetry.cpl.ScreenCPLTracker.AnonymousClass1.Camera2StreamConfigurationMap : anonymousClass1);
    }

    @Override // com.paypal.oslo.core.telemetry.compose.ScreenLifecycleObserver
    public final void onScreenAppeared(com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Appeared event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!event.isSignalInteractionSupported()) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "CPL tracking not supported for screen", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("screen_ready_cpl_destination", com.paypal.oslo.core.telemetry.util.NavKeyExtensionsKt.extractSimpleName(event.getDestination()))), null, 4, null);
        } else if (!event.isSignalInteractionReported()) {
            this.getHighSpeedVideoSizes.put(event.getDestination(), this.Camera2StreamConfigurationMap.invoke());
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "CPL tracking started", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("screen_ready_cpl_destination", com.paypal.oslo.core.telemetry.util.NavKeyExtensionsKt.extractSimpleName(event.getDestination()))), null, 4, null);
        } else {
            com.paypal.android.logger.Logger.v$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "CPL already reported - skipping CPL tracking", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("screen_ready_cpl_destination", com.paypal.oslo.core.telemetry.util.NavKeyExtensionsKt.extractSimpleName(event.getDestination()))), null, 4, null);
        }
    }

    @Override // com.paypal.oslo.core.telemetry.compose.ScreenLifecycleObserver
    public final void onScreenReady(com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Ready event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        java.lang.Long remove = this.getHighSpeedVideoSizes.remove(event.getDestination());
        if (remove != null) {
            long longValue = remove.longValue();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "CPL measurement complete", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("screen_ready_cpl_destination", com.paypal.oslo.core.telemetry.util.NavKeyExtensionsKt.extractSimpleName(event.getDestination())), kotlin.TuplesKt.to("screen_ready_cpl_ms", java.lang.Long.valueOf(this.Camera2StreamConfigurationMap.invoke().longValue() - longValue))), null, 4, null);
        }
    }

    @Override // com.paypal.oslo.core.telemetry.compose.ScreenLifecycleObserver
    public final void onScreenDisappeared(com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Disappeared event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        java.lang.Long remove = this.getHighSpeedVideoSizes.remove(event.getDestination());
        if (remove != null) {
            long longValue = remove.longValue();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "CPL tracking dropped - screen disappeared before signaling ready", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("screen_ready_cpl_destination", com.paypal.oslo.core.telemetry.util.NavKeyExtensionsKt.extractSimpleName(event.getDestination())), kotlin.TuplesKt.to("screen_ready_cpl_dropped_after_ms", java.lang.Long.valueOf(this.Camera2StreamConfigurationMap.invoke().longValue() - longValue))), null, 4, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScreenCPLTracker() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
