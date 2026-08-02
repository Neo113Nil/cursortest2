package com.paypal.oslo.feature.searchandintelligence.domain.usecase;

/* loaded from: classes14.dex */
public final class GetCommerceItemVariantsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetCommerceItemVariantsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.repository.CommerceItemRepository> getHighSpeedVideoFpsRangesFor;

    private GetCommerceItemVariantsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.repository.CommerceItemRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetCommerceItemVariantsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetCommerceItemVariantsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.repository.CommerceItemRepository> provider) {
        return new com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetCommerceItemVariantsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetCommerceItemVariantsUseCase newInstance(com.paypal.oslo.feature.searchandintelligence.domain.repository.CommerceItemRepository commerceItemRepository) {
        return new com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetCommerceItemVariantsUseCase(commerceItemRepository);
    }
}
