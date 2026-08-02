package com.paypal.oslo.feature.bnplservicing.ui.makepayment;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel", f = "MakeAPaymentViewModel.kt", i = {0, 0}, l = {150}, m = "onSuccess", n = {"result", "correlationId"}, nl = {151}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes11.dex */
final class MakeAPaymentViewModel$onSuccess$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel.access$onSuccess(this.getHighSpeedVideoFpsRanges, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MakeAPaymentViewModel$onSuccess$1(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel makeAPaymentViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel$onSuccess$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = makeAPaymentViewModel;
    }
}
