package com.paypal.oslo.feature.smartroute.ui.mvi.middleware;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt", f = "DistributionAutoReloadMiddleware.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, m = "executeDeactivateFlow", n = {"$this$executeDeactivateFlow", "screenState", "savedConfig", "configToSave", "balanceId", "currentSavings", "currentCrypto", "hasPercentageChanges"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "F$0", "F$1", "I$0"}, v = 2)
/* loaded from: classes15.dex */
final class DistributionAutoReloadMiddlewareKt$executeDeactivateFlow$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    float getHighSpeedVideoFpsRanges;
    float getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt.access$executeDeactivateFlow(null, null, this);
    }

    DistributionAutoReloadMiddlewareKt$executeDeactivateFlow$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt$executeDeactivateFlow$1> continuation) {
        super(continuation);
    }
}
