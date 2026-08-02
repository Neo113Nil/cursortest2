package com.paypal.oslo.feature.bnplacquisition.ui.repayments;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper", f = "RepaymentsUiMapper.kt", i = {0}, l = {111}, m = "toRepaymentSchedule", n = {"$this$toRepaymentSchedule"}, nl = {112}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class RepaymentsUiMapper$toRepaymentSchedule$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RepaymentsUiMapper$toRepaymentSchedule$1(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper repaymentsUiMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper$toRepaymentSchedule$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = repaymentsUiMapper;
    }
}
