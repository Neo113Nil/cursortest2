package com.paypal.oslo.feature.bnplacquisition.ui.repayments;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper", f = "RepaymentsUiMapper.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {75}, m = "toUiModel", n = {"repaymentsSuccess", "creditApplication", "fundingInstruments", "documents", "paymentAuthorizationDocument", "paymentAuthorizationLink", "loanAgreementDocument", "loanAgreementLink"}, nl = {77}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"}, v = 2)
/* loaded from: classes11.dex */
final class RepaymentsUiMapper$toUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper getOutputMinFrameDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDurationlomOqCM.toUiModel(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RepaymentsUiMapper$toUiModel$1(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper repaymentsUiMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper$toUiModel$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDurationlomOqCM = repaymentsUiMapper;
    }
}
