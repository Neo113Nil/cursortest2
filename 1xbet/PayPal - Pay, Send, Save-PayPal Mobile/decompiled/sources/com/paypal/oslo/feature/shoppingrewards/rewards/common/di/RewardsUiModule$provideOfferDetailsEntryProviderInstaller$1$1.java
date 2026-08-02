package com.paypal.oslo.feature.shoppingrewards.rewards.common.di;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class RewardsUiModule$provideOfferDetailsEntryProviderInstaller$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    public final void getHighSpeedVideoSizes() {
        ((com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.OfferDetailsDismissCoordinator) this.receiver).invokeCallback();
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ kotlin.Unit invoke() {
        getHighSpeedVideoSizes();
        return kotlin.Unit.INSTANCE;
    }

    RewardsUiModule$provideOfferDetailsEntryProviderInstaller$1$1(java.lang.Object obj) {
        super(0, obj, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.OfferDetailsDismissCoordinator.class, "invokeCallback", "invokeCallback()V", 0);
    }
}
