package com.paypal.oslo.feature.consumerprivacy.domain.usecase;

/* loaded from: classes12.dex */
public final class GetAccountVisibilityLabelUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetAccountVisibilityLabelUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.AccountVisibilityLabelRepository> Camera2StreamConfigurationMap;

    private GetAccountVisibilityLabelUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.AccountVisibilityLabelRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetAccountVisibilityLabelUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetAccountVisibilityLabelUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.AccountVisibilityLabelRepository> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetAccountVisibilityLabelUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetAccountVisibilityLabelUseCase newInstance(com.paypal.oslo.feature.consumerprivacy.domain.repository.AccountVisibilityLabelRepository accountVisibilityLabelRepository) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetAccountVisibilityLabelUseCase(accountVisibilityLabelRepository);
    }
}
