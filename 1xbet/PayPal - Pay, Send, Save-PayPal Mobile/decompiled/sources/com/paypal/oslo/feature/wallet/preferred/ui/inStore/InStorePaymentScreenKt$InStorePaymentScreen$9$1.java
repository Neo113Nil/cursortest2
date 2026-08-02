package com.paypal.oslo.feature.wallet.preferred.ui.inStore;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class InStorePaymentScreenKt$InStorePaymentScreen$9$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(boolean z) {
        ((com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel) this.receiver).onBalanceToggleChange(z);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool) {
        getHighSpeedVideoSizes(bool.booleanValue());
        return kotlin.Unit.INSTANCE;
    }

    InStorePaymentScreenKt$InStorePaymentScreen$9$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel.class, "onBalanceToggleChange", "onBalanceToggleChange(Z)V", 0);
    }
}
