package com.paypal.oslo.feature.identity.accountswitch.di;

/* loaded from: classes12.dex */
public final class UserAccountSwitchModule_ProvideAccountSwitchRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.accountswitch.domain.repository.UserAccountSwitchRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.data.repository.UserAccountSwitchRepositoryImpl> getHighSpeedVideoSizes;

    private UserAccountSwitchModule_ProvideAccountSwitchRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.data.repository.UserAccountSwitchRepositoryImpl> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.accountswitch.domain.repository.UserAccountSwitchRepository get() {
        return provideAccountSwitchRepository(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.identity.accountswitch.di.UserAccountSwitchModule_ProvideAccountSwitchRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.data.repository.UserAccountSwitchRepositoryImpl> provider) {
        return new com.paypal.oslo.feature.identity.accountswitch.di.UserAccountSwitchModule_ProvideAccountSwitchRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.identity.accountswitch.domain.repository.UserAccountSwitchRepository provideAccountSwitchRepository(com.paypal.oslo.feature.identity.accountswitch.data.repository.UserAccountSwitchRepositoryImpl userAccountSwitchRepositoryImpl) {
        return (com.paypal.oslo.feature.identity.accountswitch.domain.repository.UserAccountSwitchRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.identity.accountswitch.di.UserAccountSwitchModule.INSTANCE.provideAccountSwitchRepository(userAccountSwitchRepositoryImpl));
    }
}
