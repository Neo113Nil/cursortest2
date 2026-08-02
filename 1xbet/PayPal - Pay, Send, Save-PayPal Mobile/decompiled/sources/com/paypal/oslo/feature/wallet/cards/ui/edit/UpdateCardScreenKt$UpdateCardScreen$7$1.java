package com.paypal.oslo.feature.wallet.cards.ui.edit;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class UpdateCardScreenKt$UpdateCardScreen$7$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(boolean z) {
        ((com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardViewModel) this.receiver).onExpirationDateFocusChanged(z);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool) {
        getHighSpeedVideoFpsRanges(bool.booleanValue());
        return kotlin.Unit.INSTANCE;
    }

    UpdateCardScreenKt$UpdateCardScreen$7$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardViewModel.class, "onExpirationDateFocusChanged", "onExpirationDateFocusChanged(Z)V", 0);
    }
}
