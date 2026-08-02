package com.paypal.oslo.feature.wallet.preferred.ui.online;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class OnlinePaymentScreenKt$OnlinePaymentScreen$6$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    public final void getHighSpeedVideoSizes() {
        ((com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel) this.receiver).retryFromSaveError();
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ kotlin.Unit invoke() {
        getHighSpeedVideoSizes();
        return kotlin.Unit.INSTANCE;
    }

    OnlinePaymentScreenKt$OnlinePaymentScreen$6$1(java.lang.Object obj) {
        super(0, obj, com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.class, "retryFromSaveError", "retryFromSaveError()V", 0);
    }
}
