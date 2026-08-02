package com.paypal.oslo.feature.consumerprivacy.data.repository;

/* loaded from: classes12.dex */
public final class PersonalizedAdsRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedAdsRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.mapper.PersonalizedAdsMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedAdsApi> getHighSpeedVideoFpsRangesFor;

    private PersonalizedAdsRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedAdsApi> provider, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.mapper.PersonalizedAdsMapper> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedAdsRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedAdsRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedAdsApi> provider, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.mapper.PersonalizedAdsMapper> provider2) {
        return new com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedAdsRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedAdsRepositoryImpl newInstance(com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedAdsApi personalizedAdsApi, com.paypal.oslo.feature.consumerprivacy.data.mapper.PersonalizedAdsMapper personalizedAdsMapper) {
        return new com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedAdsRepositoryImpl(personalizedAdsApi, personalizedAdsMapper);
    }
}
