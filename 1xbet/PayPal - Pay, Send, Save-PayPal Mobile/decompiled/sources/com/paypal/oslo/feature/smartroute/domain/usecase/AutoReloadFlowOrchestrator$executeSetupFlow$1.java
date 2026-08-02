package com.paypal.oslo.feature.smartroute.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator", f = "AutoReloadFlowOrchestrator.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {79, 117, 135}, m = "executeSetupFlow", n = {com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "onStepProgress", "skipSave", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "onStepProgress", "validatedDetails", "balanceId", "moneyboxId", "thresholdAmount", "reloadAmount", "currency", "reloadAmountDecimal", "setupRequest", "skipSave", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "onStepProgress", "validatedDetails", "balanceId", "moneyboxId", "thresholdAmount", "reloadAmount", "currency", "reloadAmountDecimal", "setupRequest", "skipSave"}, nl = {80, 395, 137}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "Z$0"}, v = 2)
/* loaded from: classes15.dex */
final class AutoReloadFlowOrchestrator$executeSetupFlow$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    boolean getOutputMinFrameDurationlomOqCM;
    int getOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputStallDuration;
    final /* synthetic */ com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDuration = obj;
        this.getOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputStallDurationlomOqCM.executeSetupFlow(null, false, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoReloadFlowOrchestrator$executeSetupFlow$1(com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator autoReloadFlowOrchestrator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$executeSetupFlow$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = autoReloadFlowOrchestrator;
    }
}
