package com.paypal.oslo.feature.identity.accountswitch.ui;

/* loaded from: classes12.dex */
public final class UserAccountSwitchViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GetUserAccountsUseCase> getHighSpeedVideoFpsRangesFor;

    private UserAccountSwitchViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GetUserAccountsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider> provider2, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GetUserAccountsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider> provider2, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider3) {
        return new com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchViewModel newInstance(com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GetUserAccountsUseCase getUserAccountsUseCase, com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider stringProvider, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return new com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchViewModel(getUserAccountsUseCase, stringProvider, appNavigator);
    }
}
