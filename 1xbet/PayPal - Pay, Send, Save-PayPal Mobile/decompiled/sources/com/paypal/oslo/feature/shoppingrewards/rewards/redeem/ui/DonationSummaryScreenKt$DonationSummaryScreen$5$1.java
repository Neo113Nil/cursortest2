package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class DonationSummaryScreenKt$DonationSummaryScreen$5$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    public final void Camera2StreamConfigurationMap() {
        ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel) this.receiver).onConfirmDonation();
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ kotlin.Unit invoke() {
        Camera2StreamConfigurationMap();
        return kotlin.Unit.INSTANCE;
    }

    DonationSummaryScreenKt$DonationSummaryScreen$5$1(java.lang.Object obj) {
        super(0, obj, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel.class, "onConfirmDonation", "onConfirmDonation()V", 0);
    }
}
