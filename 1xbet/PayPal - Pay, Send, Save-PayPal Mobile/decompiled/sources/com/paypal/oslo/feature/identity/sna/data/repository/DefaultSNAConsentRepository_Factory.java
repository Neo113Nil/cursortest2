package com.paypal.oslo.feature.identity.sna.data.repository;

/* loaded from: classes13.dex */
public final class DefaultSNAConsentRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.sna.data.repository.DefaultSNAConsentRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.sna.data.repository.DefaultSNAConsentRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.identity.sna.data.repository.DefaultSNAConsentRepository_Factory create() {
        return com.paypal.oslo.feature.identity.sna.data.repository.DefaultSNAConsentRepository_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.identity.sna.data.repository.DefaultSNAConsentRepository newInstance() {
        return new com.paypal.oslo.feature.identity.sna.data.repository.DefaultSNAConsentRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.sna.data.repository.DefaultSNAConsentRepository_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.identity.sna.data.repository.DefaultSNAConsentRepository_Factory();

        private InstanceHolder() {
        }
    }
}
