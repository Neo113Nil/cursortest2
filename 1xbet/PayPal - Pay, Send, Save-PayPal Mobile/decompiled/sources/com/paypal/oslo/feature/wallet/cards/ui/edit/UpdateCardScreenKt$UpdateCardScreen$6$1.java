package com.paypal.oslo.feature.wallet.cards.ui.edit;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class UpdateCardScreenKt$UpdateCardScreen$6$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        ((com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardViewModel) this.receiver).updateCVV(str);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
        getHighSpeedVideoSizes(str);
        return kotlin.Unit.INSTANCE;
    }

    UpdateCardScreenKt$UpdateCardScreen$6$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardViewModel.class, "updateCVV", "updateCVV(Ljava/lang/String;)V", 0);
    }
}
