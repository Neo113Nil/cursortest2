package com.paypal.oslo.feature.wallet.loyalty.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/loyalty/ui/LoyaltyManualConfirmScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "<init>", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)V", "Lcom/paypal/oslo/feature/wallet/loyalty/ui/LoyaltyCardData;", "loyaltyCardData", "", "navigateToFinishScreen$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/loyalty/ui/LoyaltyCardData;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/navigation/AppNavigator;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class LoyaltyManualConfirmScreenViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public LoyaltyManualConfirmScreenViewModel(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
    }

    public final void navigateToFinishScreen$wallet_prodRelease(final com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyCardData loyaltyCardData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loyaltyCardData, "");
        this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyManualConfirmScreenViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyManualConfirmScreenViewModel.m21372$r8$lambda$HV9rvj2vEOegg4pJprgIjSMdBU(com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyCardData.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    /* renamed from: $r8$lambda$HV9rvj2vEOegg4pJprgI-jSMdBU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21372$r8$lambda$HV9rvj2vEOegg4pJprgIjSMdBU(com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyCardData loyaltyCardData, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyFinishEntry(loyaltyCardData.getName(), loyaltyCardData.getLogo(), loyaltyCardData.getCardNumber()));
        return kotlin.Unit.INSTANCE;
    }
}
