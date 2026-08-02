package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel", f = "TapToPayProgressViewModel.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {116, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m = "updatePurchase", n = {"paymentPayload", "paymentRequest", "payload", "paymentPayload", "paymentRequest", "payload", "this_$iv", "it$iv", "it", "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", "$i$a$-onRight-TapToPayProgressViewModel$updatePurchase$3"}, nl = {117, 125}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes11.dex */
final class TapToPayProgressViewModel$updatePurchase$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel getOutputSizeshNQ4ISI;
    int getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        return this.getOutputSizeshNQ4ISI.updatePurchase(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapToPayProgressViewModel$updatePurchase$1(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel tapToPayProgressViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel$updatePurchase$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = tapToPayProgressViewModel;
    }
}
