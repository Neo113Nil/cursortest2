package com.paypal.oslo.feature.wallet.cards.ui.expired;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class ExpiredCardModalKt$ExpiredCardModal$6$1$2$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        ((com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel) this.receiver).onCvvChanged(str);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
        getHighResolutionOutputSizeshNQ4ISI(str);
        return kotlin.Unit.INSTANCE;
    }

    ExpiredCardModalKt$ExpiredCardModal$6$1$2$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.class, "onCvvChanged", "onCvvChanged(Ljava/lang/String;)V", 0);
    }
}
