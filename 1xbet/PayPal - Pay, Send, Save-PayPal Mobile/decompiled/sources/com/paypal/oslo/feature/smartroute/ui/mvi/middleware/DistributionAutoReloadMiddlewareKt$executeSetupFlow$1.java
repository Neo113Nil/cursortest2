package com.paypal.oslo.feature.smartroute.ui.mvi.middleware;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt", f = "DistributionAutoReloadMiddleware.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {201}, m = "executeSetupFlow", n = {"$this$executeSetupFlow", "screenState", "savedConfig", "configToSave", "currentSavings", "currentCrypto", "hasPercentageChanges"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "F$1", "I$0"}, v = 2)
/* loaded from: classes15.dex */
final class DistributionAutoReloadMiddlewareKt$executeSetupFlow$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    float Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    float getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt.access$executeSetupFlow(null, null, this);
    }

    DistributionAutoReloadMiddlewareKt$executeSetupFlow$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt$executeSetupFlow$1> continuation) {
        super(continuation);
    }
}
