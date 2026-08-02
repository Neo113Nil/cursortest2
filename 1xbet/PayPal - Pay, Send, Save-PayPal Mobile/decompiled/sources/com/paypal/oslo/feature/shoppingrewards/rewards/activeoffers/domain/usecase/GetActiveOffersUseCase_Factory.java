package com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase;

/* loaded from: classes15.dex */
public final class GetActiveOffersUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.repository.ActiveOffersRepository> getHighSpeedVideoFpsRangesFor;

    private GetActiveOffersUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.repository.ActiveOffersRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.repository.ActiveOffersRepository> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase newInstance(com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.repository.ActiveOffersRepository activeOffersRepository) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase(activeOffersRepository);
    }
}
