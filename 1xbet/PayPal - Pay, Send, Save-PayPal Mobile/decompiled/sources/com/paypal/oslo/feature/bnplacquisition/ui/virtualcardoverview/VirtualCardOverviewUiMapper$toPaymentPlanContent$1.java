package com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiMapper", f = "VirtualCardOverviewUiMapper.kt", i = {0, 1}, l = {150, 161}, m = "toPaymentPlanContent", n = {"$this$toPaymentPlanContent", "$this$toPaymentPlanContent"}, nl = {151, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, s = {"L$0", "L$0"}, v = 2)
/* loaded from: classes11.dex */
final class VirtualCardOverviewUiMapper$toPaymentPlanContent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiMapper getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VirtualCardOverviewUiMapper$toPaymentPlanContent$1(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiMapper virtualCardOverviewUiMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiMapper$toPaymentPlanContent$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = virtualCardOverviewUiMapper;
    }
}
