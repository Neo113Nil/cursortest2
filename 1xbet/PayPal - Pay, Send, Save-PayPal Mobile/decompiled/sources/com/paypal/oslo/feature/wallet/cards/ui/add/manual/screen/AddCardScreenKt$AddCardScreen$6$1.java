package com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class AddCardScreenKt$AddCardScreen$6$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        ((com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel) this.receiver).updateExpirationDate(str);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
        getHighResolutionOutputSizeshNQ4ISI(str);
        return kotlin.Unit.INSTANCE;
    }

    AddCardScreenKt$AddCardScreen$6$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel.class, "updateExpirationDate", "updateExpirationDate(Ljava/lang/String;)V", 0);
    }
}
