package com.paypal.oslo.feature.qrc.ui.showtopay.home;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class ShowToPayScreenKt$ShowToPayScreen$3$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent showToPayEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showToPayEvent, "");
        ((com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayViewModel) this.receiver).handleEvent(showToPayEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent showToPayEvent) {
        getHighSpeedVideoFpsRanges(showToPayEvent);
        return kotlin.Unit.INSTANCE;
    }

    ShowToPayScreenKt$ShowToPayScreen$3$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayViewModel.class, "handleEvent", "handleEvent(Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent;)V", 0);
    }
}
