package com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase;

/* loaded from: classes15.dex */
public final class ActivateOfferUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.repository.OffersRepository> getHighSpeedVideoSizes;

    private ActivateOfferUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.repository.OffersRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.repository.OffersRepository> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase newInstance(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.repository.OffersRepository offersRepository) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase(offersRepository);
    }
}
