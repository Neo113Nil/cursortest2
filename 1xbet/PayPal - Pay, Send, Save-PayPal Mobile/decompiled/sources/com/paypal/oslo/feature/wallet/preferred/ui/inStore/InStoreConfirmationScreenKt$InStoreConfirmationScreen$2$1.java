package com.paypal.oslo.feature.wallet.preferred.ui.inStore;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class InStoreConfirmationScreenKt$InStoreConfirmationScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(boolean z) {
        ((com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel) this.receiver).onUseForOnlinePaymentsChange(z);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool) {
        getHighSpeedVideoSizes(bool.booleanValue());
        return kotlin.Unit.INSTANCE;
    }

    InStoreConfirmationScreenKt$InStoreConfirmationScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel.class, "onUseForOnlinePaymentsChange", "onUseForOnlinePaymentsChange(Z)V", 0);
    }
}
