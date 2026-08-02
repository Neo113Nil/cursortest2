package com.paypal.oslo.feature.consumerprivacy.data.repository;

/* loaded from: classes12.dex */
public final class PersonalizedShoppingRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedShoppingRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.mapper.PersonalizedShoppingMapper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedShoppingApi> getHighSpeedVideoSizes;

    private PersonalizedShoppingRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedShoppingApi> provider, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.mapper.PersonalizedShoppingMapper> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedShoppingRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedShoppingRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedShoppingApi> provider, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.mapper.PersonalizedShoppingMapper> provider2) {
        return new com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedShoppingRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedShoppingRepositoryImpl newInstance(com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedShoppingApi personalizedShoppingApi, com.paypal.oslo.feature.consumerprivacy.data.mapper.PersonalizedShoppingMapper personalizedShoppingMapper) {
        return new com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedShoppingRepositoryImpl(personalizedShoppingApi, personalizedShoppingMapper);
    }
}
