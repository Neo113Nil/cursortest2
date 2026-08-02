package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel", f = "TapToPayProgressViewModel.kt", i = {2, 2, 2, 2, 3, 3, 3, 3, 3}, l = {86, 89, 104, 101}, m = "createPurchase$business_pay_and_get_paid_prodRelease", n = {"this_$iv", "response", "$i$f$fold", "$i$a$-fold-TapToPayProgressViewModel$createPurchase$3", "this_$iv", "error", "type", "$i$f$fold", "$i$a$-fold-TapToPayProgressViewModel$createPurchase$2"}, nl = {87, 215, 110, 102}, s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"}, v = 2)
/* loaded from: classes11.dex */
final class TapToPayProgressViewModel$createPurchase$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getOutputFormats.createPurchase$business_pay_and_get_paid_prodRelease(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapToPayProgressViewModel$createPurchase$1(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel tapToPayProgressViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel$createPurchase$1> continuation) {
        super(continuation);
        this.getOutputFormats = tapToPayProgressViewModel;
    }
}
