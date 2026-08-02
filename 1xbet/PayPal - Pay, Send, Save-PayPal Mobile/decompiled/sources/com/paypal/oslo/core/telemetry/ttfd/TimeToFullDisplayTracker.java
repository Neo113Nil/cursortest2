package com.paypal.oslo.core.telemetry.ttfd;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\""}, d2 = {"Lcom/paypal/oslo/core/telemetry/ttfd/TimeToFullDisplayTracker;", "Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleObserver;", "Landroidx/navigation3/runtime/NavKey;", "expectedDestination", "", "backStack", "Lkotlin/Function0;", "", "onReadyToReportFullyDrawn", "<init>", "(Landroidx/navigation3/runtime/NavKey;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent$Appeared;", "event", "onScreenAppeared", "(Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent$Appeared;)V", "Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent$Ready;", "onScreenReady", "(Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent$Ready;)V", "Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent$Disappeared;", "onScreenDisappeared", "(Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent$Disappeared;)V", "onAppBackgrounded", "()V", "getHighSpeedVideoFpsRangesFor", "Landroidx/navigation3/runtime/NavKey;", "getHighSpeedVideoSizes", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function0;", "Camera2StreamConfigurationMap", "", "p0", "isComplete", "Z", "()Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TimeToFullDisplayTracker implements com.paypal.oslo.core.telemetry.compose.ScreenLifecycleObserver {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    private final androidx.navigation3.runtime.NavKey getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.List<androidx.navigation3.runtime.NavKey> getHighResolutionOutputSizeshNQ4ISI;
    private boolean isComplete;

    /* JADX WARN: Multi-variable type inference failed */
    public TimeToFullDisplayTracker(androidx.navigation3.runtime.NavKey navKey, java.util.List<? extends androidx.navigation3.runtime.NavKey> list, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighSpeedVideoFpsRangesFor = navKey;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.Camera2StreamConfigurationMap = function0;
    }

    public /* synthetic */ TimeToFullDisplayTracker(androidx.navigation3.runtime.NavKey navKey, java.util.List list, kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(navKey, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, function0);
    }

    /* renamed from: isComplete, reason: from getter */
    public final boolean getIsComplete() {
        return this.isComplete;
    }

    @Override // com.paypal.oslo.core.telemetry.compose.ScreenLifecycleObserver
    public final void onScreenAppeared(com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Appeared event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (this.isComplete || !kotlin.jvm.internal.Intrinsics.areEqual(event.getDestination(), this.getHighSpeedVideoFpsRangesFor) || event.isSignalInteractionSupported()) {
            return;
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "TTFD tracking stopped - expected destination reached but will not report readiness", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("expected_destination", com.paypal.oslo.core.telemetry.util.NavKeyExtensionsKt.extractSimpleName(this.getHighSpeedVideoFpsRangesFor))), null, 4, null);
        this.isComplete = true;
    }

    @Override // com.paypal.oslo.core.telemetry.compose.ScreenLifecycleObserver
    public final void onScreenReady(com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Ready event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (this.isComplete) {
            return;
        }
        com.paypal.android.logger.Logger logger = com.paypal.oslo.core.telemetry.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = kotlin.TuplesKt.to("signaled_destination", com.paypal.oslo.core.telemetry.util.NavKeyExtensionsKt.extractSimpleName(event.getDestination()));
        pairArr[1] = kotlin.TuplesKt.to("expected_destination", com.paypal.oslo.core.telemetry.util.NavKeyExtensionsKt.extractSimpleName(this.getHighSpeedVideoFpsRangesFor));
        androidx.navigation3.runtime.NavKey navKey = (androidx.navigation3.runtime.NavKey) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) this.getHighResolutionOutputSizeshNQ4ISI);
        pairArr[2] = kotlin.TuplesKt.to("current_top_destination", navKey != null ? com.paypal.oslo.core.telemetry.util.NavKeyExtensionsKt.extractSimpleName(navKey) : null);
        com.paypal.android.logger.Logger.d$default(logger, "TTFD signalReady received", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        androidx.navigation3.runtime.NavKey destination = event.getDestination();
        boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(destination, kotlin.collections.CollectionsKt.lastOrNull((java.util.List) this.getHighResolutionOutputSizeshNQ4ISI));
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "TTFD isDestinationCurrentlyOnTop", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("result", java.lang.Boolean.valueOf(areEqual)), kotlin.TuplesKt.to("destination", com.paypal.oslo.core.telemetry.util.NavKeyExtensionsKt.extractSimpleName(destination))), null, 4, null);
        if (areEqual) {
            com.paypal.android.logger.Logger logger2 = com.paypal.oslo.core.telemetry.LoggerKt.log;
            kotlin.Pair[] pairArr2 = new kotlin.Pair[3];
            pairArr2[0] = kotlin.TuplesKt.to("signaled_destination", com.paypal.oslo.core.telemetry.util.NavKeyExtensionsKt.extractSimpleName(event.getDestination()));
            pairArr2[1] = kotlin.TuplesKt.to("expected_destination", com.paypal.oslo.core.telemetry.util.NavKeyExtensionsKt.extractSimpleName(this.getHighSpeedVideoFpsRangesFor));
            androidx.navigation3.runtime.NavKey navKey2 = (androidx.navigation3.runtime.NavKey) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) this.getHighResolutionOutputSizeshNQ4ISI);
            pairArr2[2] = kotlin.TuplesKt.to("current_top_destination", navKey2 != null ? com.paypal.oslo.core.telemetry.util.NavKeyExtensionsKt.extractSimpleName(navKey2) : null);
            com.paypal.android.logger.Logger.i$default(logger2, "TTFD signalReady accepted", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
            this.Camera2StreamConfigurationMap.invoke();
            this.isComplete = true;
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event.getDestination(), this.getHighSpeedVideoFpsRangesFor)) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "TTFD tracking stopped - expected destination signaled but not on top", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("expected_destination", com.paypal.oslo.core.telemetry.util.NavKeyExtensionsKt.extractSimpleName(this.getHighSpeedVideoFpsRangesFor))), null, 4, null);
            this.isComplete = true;
        } else {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "TTFD signalReady ignored - stale signal from invalid destination, will continue to wait.", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("signal_destination", com.paypal.oslo.core.telemetry.util.NavKeyExtensionsKt.extractSimpleName(event.getDestination())), kotlin.TuplesKt.to("expected_destination", com.paypal.oslo.core.telemetry.util.NavKeyExtensionsKt.extractSimpleName(this.getHighSpeedVideoFpsRangesFor))), null, 4, null);
        }
    }

    public final void onAppBackgrounded() {
        if (this.isComplete) {
            return;
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "TTFD tracking aborted - app went to background before TTFD reported", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("expected_destination", com.paypal.oslo.core.telemetry.util.NavKeyExtensionsKt.extractScreenName(this.getHighSpeedVideoFpsRangesFor))), null, 4, null);
        this.isComplete = true;
    }

    @Override // com.paypal.oslo.core.telemetry.compose.ScreenLifecycleObserver
    public final void onScreenDisappeared(com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Disappeared event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
    }
}
