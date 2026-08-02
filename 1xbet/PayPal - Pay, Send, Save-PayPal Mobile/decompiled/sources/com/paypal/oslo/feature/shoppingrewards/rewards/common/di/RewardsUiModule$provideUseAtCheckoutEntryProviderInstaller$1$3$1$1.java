package com.paypal.oslo.feature.shoppingrewards.rewards.common.di;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class RewardsUiModule$provideUseAtCheckoutEntryProviderInstaller$1$3$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function0<? extends kotlin.Unit>, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutDismissCoordinator) this.receiver).registerCallback(function0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(kotlin.jvm.functions.Function0<? extends kotlin.Unit> function0) {
        getHighSpeedVideoSizes(function0);
        return kotlin.Unit.INSTANCE;
    }

    RewardsUiModule$provideUseAtCheckoutEntryProviderInstaller$1$3$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutDismissCoordinator.class, "registerCallback", "registerCallback(Lkotlin/jvm/functions/Function0;)V", 0);
    }
}
