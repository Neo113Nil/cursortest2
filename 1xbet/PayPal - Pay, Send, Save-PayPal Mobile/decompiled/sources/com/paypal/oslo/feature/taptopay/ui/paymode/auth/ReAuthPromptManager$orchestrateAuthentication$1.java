package com.paypal.oslo.feature.taptopay.ui.paymode.auth;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager", f = "ReAuthPromptManager.kt", i = {0, 0, 0, 1, 1, 1}, l = {340, 358}, m = "orchestrateAuthentication", n = {"activity", "authState", "authMethod", "activity", "authState", "authMethod"}, nl = {345, 363}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes15.dex */
final class ReAuthPromptManager$orchestrateAuthentication$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getOutputFormats.orchestrateAuthentication(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReAuthPromptManager$orchestrateAuthentication$1(com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager reAuthPromptManager, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager$orchestrateAuthentication$1> continuation) {
        super(continuation);
        this.getOutputFormats = reAuthPromptManager;
    }
}
