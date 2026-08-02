package com.paypal.oslo.feature.searchandintelligence.domain;

/* loaded from: classes14.dex */
public final class SearchAndIntelligenceImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.domain.SearchAndIntelligenceImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.domain.SearchAndIntelligenceImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.SearchAndIntelligenceImpl_Factory create() {
        return com.paypal.oslo.feature.searchandintelligence.domain.SearchAndIntelligenceImpl_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.SearchAndIntelligenceImpl newInstance() {
        return new com.paypal.oslo.feature.searchandintelligence.domain.SearchAndIntelligenceImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.searchandintelligence.domain.SearchAndIntelligenceImpl_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.searchandintelligence.domain.SearchAndIntelligenceImpl_Factory();

        private InstanceHolder() {
        }
    }
}
