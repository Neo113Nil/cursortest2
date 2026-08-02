package com.paypal.oslo.feature.consumerprivacy.data.mapper;

/* loaded from: classes11.dex */
public final class PersonalizedAdsMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.data.mapper.PersonalizedAdsMapper> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.data.mapper.PersonalizedAdsMapper get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.mapper.PersonalizedAdsMapper_Factory create() {
        return com.paypal.oslo.feature.consumerprivacy.data.mapper.PersonalizedAdsMapper_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.mapper.PersonalizedAdsMapper newInstance() {
        return new com.paypal.oslo.feature.consumerprivacy.data.mapper.PersonalizedAdsMapper();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.consumerprivacy.data.mapper.PersonalizedAdsMapper_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.consumerprivacy.data.mapper.PersonalizedAdsMapper_Factory();

        private InstanceHolder() {
        }
    }
}
