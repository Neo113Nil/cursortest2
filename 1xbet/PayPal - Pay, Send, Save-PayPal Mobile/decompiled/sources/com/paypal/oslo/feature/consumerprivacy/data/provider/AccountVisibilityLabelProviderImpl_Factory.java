package com.paypal.oslo.feature.consumerprivacy.data.provider;

/* loaded from: classes11.dex */
public final class AccountVisibilityLabelProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.data.provider.AccountVisibilityLabelProviderImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetAccountVisibilityLabelUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private AccountVisibilityLabelProviderImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetAccountVisibilityLabelUseCase> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.data.provider.AccountVisibilityLabelProviderImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.provider.AccountVisibilityLabelProviderImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetAccountVisibilityLabelUseCase> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.data.provider.AccountVisibilityLabelProviderImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.provider.AccountVisibilityLabelProviderImpl newInstance(com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetAccountVisibilityLabelUseCase getAccountVisibilityLabelUseCase) {
        return new com.paypal.oslo.feature.consumerprivacy.data.provider.AccountVisibilityLabelProviderImpl(getAccountVisibilityLabelUseCase);
    }
}
