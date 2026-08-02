package com.paypal.oslo.feature.consumerprivacy.di;

/* loaded from: classes12.dex */
public final class AccountVisibilityLabelDataModule_Companion_ProvideAccountVisibilityLabelProviderFactory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.api.data.IAccountVisibilityLabelProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetAccountVisibilityLabelUseCase> getHighSpeedVideoFpsRangesFor;

    private AccountVisibilityLabelDataModule_Companion_ProvideAccountVisibilityLabelProviderFactory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetAccountVisibilityLabelUseCase> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.api.data.IAccountVisibilityLabelProvider get() {
        return provideAccountVisibilityLabelProvider(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.di.AccountVisibilityLabelDataModule_Companion_ProvideAccountVisibilityLabelProviderFactory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetAccountVisibilityLabelUseCase> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.di.AccountVisibilityLabelDataModule_Companion_ProvideAccountVisibilityLabelProviderFactory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.api.data.IAccountVisibilityLabelProvider provideAccountVisibilityLabelProvider(com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetAccountVisibilityLabelUseCase getAccountVisibilityLabelUseCase) {
        return (com.paypal.oslo.feature.consumerprivacy.api.data.IAccountVisibilityLabelProvider) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.consumerprivacy.di.AccountVisibilityLabelDataModule.INSTANCE.provideAccountVisibilityLabelProvider(getAccountVisibilityLabelUseCase));
    }
}
