package com.paypal.oslo.feature.identity.accountswitch.domain.usecase;

/* loaded from: classes12.dex */
public final class UnlinkAccountUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UnlinkAccountUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.ClearRememberedUserProfileUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentitySession> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.repository.UserAccountSwitchRepository> getHighSpeedVideoSizes;

    private UnlinkAccountUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.repository.UserAccountSwitchRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentitySession> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.ClearRememberedUserProfileUseCase> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UnlinkAccountUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UnlinkAccountUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.repository.UserAccountSwitchRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentitySession> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.ClearRememberedUserProfileUseCase> provider3) {
        return new com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UnlinkAccountUseCase_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UnlinkAccountUseCase newInstance(com.paypal.oslo.feature.identity.accountswitch.domain.repository.UserAccountSwitchRepository userAccountSwitchRepository, com.paypal.oslo.feature.identity.api.IdentitySession identitySession, com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.ClearRememberedUserProfileUseCase clearRememberedUserProfileUseCase) {
        return new com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UnlinkAccountUseCase(userAccountSwitchRepository, identitySession, clearRememberedUserProfileUseCase);
    }
}
