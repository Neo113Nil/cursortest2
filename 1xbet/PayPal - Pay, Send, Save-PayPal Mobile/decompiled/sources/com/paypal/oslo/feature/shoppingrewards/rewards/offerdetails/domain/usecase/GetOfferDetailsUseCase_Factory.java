package com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase;

/* loaded from: classes15.dex */
public final class GetOfferDetailsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.GetOfferDetailsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.repository.OffersRepository> getHighSpeedVideoFpsRanges;

    private GetOfferDetailsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.repository.OffersRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.GetOfferDetailsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.GetOfferDetailsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.repository.OffersRepository> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.GetOfferDetailsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.GetOfferDetailsUseCase newInstance(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.repository.OffersRepository offersRepository) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.GetOfferDetailsUseCase(offersRepository);
    }
}
