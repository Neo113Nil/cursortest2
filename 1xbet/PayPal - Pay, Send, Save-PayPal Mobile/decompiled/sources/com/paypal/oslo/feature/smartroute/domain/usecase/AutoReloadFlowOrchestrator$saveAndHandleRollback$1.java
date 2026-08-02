package com.paypal.oslo.feature.smartroute.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator", f = "AutoReloadFlowOrchestrator.kt", i = {0, 0, 1, 1, 1, 1, 1, 1}, l = {185, 188}, m = "saveAndHandleRollback", n = {com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "balanceId", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "balanceId", "this_$iv", "it", "$i$f$fold", "$i$a$-fold-AutoReloadFlowOrchestrator$saveAndHandleRollback$2"}, nl = {391, 393}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1"}, v = 2)
/* loaded from: classes15.dex */
final class AutoReloadFlowOrchestrator$saveAndHandleRollback$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getOutputFormats = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI(null, null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoReloadFlowOrchestrator$saveAndHandleRollback$1(com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator autoReloadFlowOrchestrator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$saveAndHandleRollback$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = autoReloadFlowOrchestrator;
    }
}
