package com.paypal.oslo.feature.consumerprivacy.domain.usecase;

/* loaded from: classes12.dex */
public final class UpdateAllowFindViaPayPalMeUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowFindViaPayPalMeUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.AccountVisibilityRepository> getHighSpeedVideoFpsRangesFor;

    private UpdateAllowFindViaPayPalMeUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.AccountVisibilityRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowFindViaPayPalMeUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowFindViaPayPalMeUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.AccountVisibilityRepository> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowFindViaPayPalMeUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowFindViaPayPalMeUseCase newInstance(com.paypal.oslo.feature.consumerprivacy.domain.repository.AccountVisibilityRepository accountVisibilityRepository) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowFindViaPayPalMeUseCase(accountVisibilityRepository);
    }
}
