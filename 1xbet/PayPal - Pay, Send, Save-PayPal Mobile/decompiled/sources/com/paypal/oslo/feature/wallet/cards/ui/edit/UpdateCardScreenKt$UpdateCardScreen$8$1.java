package com.paypal.oslo.feature.wallet.cards.ui.edit;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class UpdateCardScreenKt$UpdateCardScreen$8$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        ((com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardViewModel) this.receiver).onCvvFocusChanged(z);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool) {
        getHighResolutionOutputSizeshNQ4ISI(bool.booleanValue());
        return kotlin.Unit.INSTANCE;
    }

    UpdateCardScreenKt$UpdateCardScreen$8$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardViewModel.class, "onCvvFocusChanged", "onCvvFocusChanged(Z)V", 0);
    }
}
