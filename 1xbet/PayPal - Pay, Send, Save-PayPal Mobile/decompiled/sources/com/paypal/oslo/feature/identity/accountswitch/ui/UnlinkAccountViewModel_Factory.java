package com.paypal.oslo.feature.identity.accountswitch.ui;

/* loaded from: classes12.dex */
public final class UnlinkAccountViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UnlinkAccountUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider> getHighSpeedVideoSizes;

    private UnlinkAccountViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UnlinkAccountUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UnlinkAccountUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider> provider2) {
        return new com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel newInstance(com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UnlinkAccountUseCase unlinkAccountUseCase, com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider stringProvider) {
        return new com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel(unlinkAccountUseCase, stringProvider);
    }
}
