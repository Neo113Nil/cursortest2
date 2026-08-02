package com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.repository;

/* loaded from: classes15.dex */
public final class ActiveOffersRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.repository.ActiveOffersRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.source.ActiveOffersCache> getHighSpeedVideoFpsRanges;

    private ActiveOffersRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.source.ActiveOffersCache> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.repository.ActiveOffersRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.repository.ActiveOffersRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.source.ActiveOffersCache> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.repository.ActiveOffersRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.repository.ActiveOffersRepositoryImpl newInstance(com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.source.ActiveOffersCache activeOffersCache) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.repository.ActiveOffersRepositoryImpl(activeOffersCache);
    }
}
