package com.paypal.oslo.feature.smartroute.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator", f = "AutoReloadFlowOrchestrator.kt", i = {0}, l = {311}, m = "performSetupRollback", n = {"balanceId"}, nl = {391}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class AutoReloadFlowOrchestrator$performSetupRollback$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoReloadFlowOrchestrator$performSetupRollback$1(com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator autoReloadFlowOrchestrator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$performSetupRollback$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = autoReloadFlowOrchestrator;
    }
}
