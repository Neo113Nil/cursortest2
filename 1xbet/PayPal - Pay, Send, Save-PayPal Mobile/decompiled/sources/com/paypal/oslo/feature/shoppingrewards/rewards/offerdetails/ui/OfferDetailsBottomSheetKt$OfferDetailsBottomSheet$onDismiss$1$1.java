package com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class OfferDetailsBottomSheetKt$OfferDetailsBottomSheet$onDismiss$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    public final void getHighSpeedVideoSizes() {
        ((com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsViewModel) this.receiver).onClose();
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ kotlin.Unit invoke() {
        getHighSpeedVideoSizes();
        return kotlin.Unit.INSTANCE;
    }

    OfferDetailsBottomSheetKt$OfferDetailsBottomSheet$onDismiss$1$1(java.lang.Object obj) {
        super(0, obj, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsViewModel.class, "onClose", "onClose()V", 0);
    }
}
