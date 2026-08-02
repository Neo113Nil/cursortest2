package com.paypal.oslo.feature.smartroute.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator", f = "AutoReloadFlowOrchestrator.kt", i = {0, 0, 0, 0, 0, 0}, l = {349}, m = "performDeactivateRollback", n = {"balanceId", "thresholdAmount", "reloadAmount", "currencyCode", "financialInstrumentId", "rollbackRequest"}, nl = {391}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: classes15.dex */
final class AutoReloadFlowOrchestrator$performDeactivateRollback$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getInputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getOutputFormats.getHighSpeedVideoSizes(null, null, null, null, null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoReloadFlowOrchestrator$performDeactivateRollback$1(com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator autoReloadFlowOrchestrator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$performDeactivateRollback$1> continuation) {
        super(continuation);
        this.getOutputFormats = autoReloadFlowOrchestrator;
    }
}
