package com.paypal.oslo.feature.searchandintelligence.domain.cache;

/* loaded from: classes14.dex */
public final class InMemoryQuickStartPromptsCache_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.domain.cache.InMemoryQuickStartPromptsCache> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.domain.cache.InMemoryQuickStartPromptsCache get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.cache.InMemoryQuickStartPromptsCache_Factory create() {
        return com.paypal.oslo.feature.searchandintelligence.domain.cache.InMemoryQuickStartPromptsCache_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.cache.InMemoryQuickStartPromptsCache newInstance() {
        return new com.paypal.oslo.feature.searchandintelligence.domain.cache.InMemoryQuickStartPromptsCache();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.searchandintelligence.domain.cache.InMemoryQuickStartPromptsCache_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.searchandintelligence.domain.cache.InMemoryQuickStartPromptsCache_Factory();

        private InstanceHolder() {
        }
    }
}
