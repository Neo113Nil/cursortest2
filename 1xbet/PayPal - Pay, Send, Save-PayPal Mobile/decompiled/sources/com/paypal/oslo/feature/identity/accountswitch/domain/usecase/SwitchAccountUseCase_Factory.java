package com.paypal.oslo.feature.identity.accountswitch.domain.usecase;

/* loaded from: classes12.dex */
public final class SwitchAccountUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.SwitchAccountUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.identity.config.AuthConfigProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.repository.UserAccountSwitchRepository> getHighSpeedVideoFpsRanges;

    private SwitchAccountUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.repository.UserAccountSwitchRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.identity.config.AuthConfigProvider> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.accountswitch.domain.usecase.SwitchAccountUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.accountswitch.domain.usecase.SwitchAccountUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.repository.UserAccountSwitchRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.identity.config.AuthConfigProvider> provider2) {
        return new com.paypal.oslo.feature.identity.accountswitch.domain.usecase.SwitchAccountUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.accountswitch.domain.usecase.SwitchAccountUseCase newInstance(com.paypal.oslo.feature.identity.accountswitch.domain.repository.UserAccountSwitchRepository userAccountSwitchRepository, com.paypal.oslo.core.identity.config.AuthConfigProvider authConfigProvider) {
        return new com.paypal.oslo.feature.identity.accountswitch.domain.usecase.SwitchAccountUseCase(userAccountSwitchRepository, authConfigProvider);
    }
}
