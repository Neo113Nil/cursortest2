package com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class PpwMerchantScreenKt$PpwMerchantScreen$3$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantEvent ppwMerchantEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ppwMerchantEvent, "");
        ((com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantViewModel) this.receiver).handleEvent(ppwMerchantEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantEvent ppwMerchantEvent) {
        getHighSpeedVideoFpsRangesFor(ppwMerchantEvent);
        return kotlin.Unit.INSTANCE;
    }

    PpwMerchantScreenKt$PpwMerchantScreen$3$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantViewModel.class, "handleEvent", "handleEvent(Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantEvent;)V", 0);
    }
}
