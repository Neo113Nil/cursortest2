package com.paypal.oslo.feature.consumerprivacy.data.mapper;

/* loaded from: classes11.dex */
public final class AccountVisibilityDataMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper_Factory create() {
        return com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper newInstance() {
        return new com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper_Factory();

        private InstanceHolder() {
        }
    }
}
