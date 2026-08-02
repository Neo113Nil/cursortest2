package com.paypal.oslo.feature.consumerprivacy.ui.screens;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class AccountVisibilityScreenKt$AccountVisibilityScreen$simplifiedCallbacks$3$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(int i) {
        ((com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel) this.receiver).updatePaymentRequestsFrom(i);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.Integer num) {
        getHighSpeedVideoFpsRanges(num.intValue());
        return kotlin.Unit.INSTANCE;
    }

    AccountVisibilityScreenKt$AccountVisibilityScreen$simplifiedCallbacks$3$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel.class, "updatePaymentRequestsFrom", "updatePaymentRequestsFrom(I)V", 0);
    }
}
