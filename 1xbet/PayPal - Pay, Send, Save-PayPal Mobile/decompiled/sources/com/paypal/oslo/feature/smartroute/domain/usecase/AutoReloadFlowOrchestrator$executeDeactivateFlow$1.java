package com.paypal.oslo.feature.smartroute.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator", f = "AutoReloadFlowOrchestrator.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 251}, m = "executeDeactivateFlow", n = {com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "balanceId", "onStepProgress", "rollbackParams", "skipSave", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "balanceId", "onStepProgress", "rollbackParams", "skipSave"}, nl = {391, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0"}, v = 2)
/* loaded from: classes15.dex */
final class AutoReloadFlowOrchestrator$executeDeactivateFlow$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator getInputFormats;
    int getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getInputFormats.executeDeactivateFlow(null, null, false, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoReloadFlowOrchestrator$executeDeactivateFlow$1(com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator autoReloadFlowOrchestrator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$executeDeactivateFlow$1> continuation) {
        super(continuation);
        this.getInputFormats = autoReloadFlowOrchestrator;
    }
}
