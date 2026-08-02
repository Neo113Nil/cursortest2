package com.paypal.oslo.feature.wallet.loyalty.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/loyalty/ui/LoyaltyFinishScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "<init>", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)V", "", "navigateToAccountsScreen$wallet_prodRelease", "()V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class LoyaltyFinishScreenViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public LoyaltyFinishScreenViewModel(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
    }

    public final void navigateToAccountsScreen$wallet_prodRelease() {
        this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyFinishScreenViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyFinishScreenViewModel.m21370$r8$lambda$Lqnz18WQIJhqds3Du95S8d7DKk((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    /* renamed from: $r8$lambda$Lqnz18WQIJhqds3Du9-5S8d7DKk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21370$r8$lambda$Lqnz18WQIJhqds3Du95S8d7DKk(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.popTo(com.paypal.oslo.feature.wallet.api.navigation.AccountsDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
