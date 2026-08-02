package com.paypal.oslo.feature.identity.accountswitch.domain.usecase;

/* loaded from: classes12.dex */
public final class GetUserAccountsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GetUserAccountsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.repository.UserAccountSwitchRepository> getHighResolutionOutputSizeshNQ4ISI;

    private GetUserAccountsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.repository.UserAccountSwitchRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GetUserAccountsUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GetUserAccountsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.repository.UserAccountSwitchRepository> provider) {
        return new com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GetUserAccountsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GetUserAccountsUseCase newInstance(com.paypal.oslo.feature.identity.accountswitch.domain.repository.UserAccountSwitchRepository userAccountSwitchRepository) {
        return new com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GetUserAccountsUseCase(userAccountSwitchRepository);
    }
}
