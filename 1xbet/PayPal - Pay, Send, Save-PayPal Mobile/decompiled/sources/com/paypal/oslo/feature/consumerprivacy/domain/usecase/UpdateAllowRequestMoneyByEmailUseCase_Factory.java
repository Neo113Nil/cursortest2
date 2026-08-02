package com.paypal.oslo.feature.consumerprivacy.domain.usecase;

/* loaded from: classes12.dex */
public final class UpdateAllowRequestMoneyByEmailUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByEmailUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.GranularAccountVisibilityRepository> getHighResolutionOutputSizeshNQ4ISI;

    private UpdateAllowRequestMoneyByEmailUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.GranularAccountVisibilityRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByEmailUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByEmailUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.GranularAccountVisibilityRepository> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByEmailUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByEmailUseCase newInstance(com.paypal.oslo.feature.consumerprivacy.domain.repository.GranularAccountVisibilityRepository granularAccountVisibilityRepository) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByEmailUseCase(granularAccountVisibilityRepository);
    }
}
