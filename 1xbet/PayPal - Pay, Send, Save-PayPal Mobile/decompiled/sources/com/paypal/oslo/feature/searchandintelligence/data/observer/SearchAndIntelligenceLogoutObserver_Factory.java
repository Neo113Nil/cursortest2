package com.paypal.oslo.feature.searchandintelligence.data.observer;

/* loaded from: classes14.dex */
public final class SearchAndIntelligenceLogoutObserver_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.data.observer.SearchAndIntelligenceLogoutObserver> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.InternalSearchAndIntelligence> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoSizes;

    private SearchAndIntelligenceLogoutObserver_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider, dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.InternalSearchAndIntelligence> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.data.observer.SearchAndIntelligenceLogoutObserver get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.searchandintelligence.data.observer.SearchAndIntelligenceLogoutObserver_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider, dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.InternalSearchAndIntelligence> provider2) {
        return new com.paypal.oslo.feature.searchandintelligence.data.observer.SearchAndIntelligenceLogoutObserver_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.searchandintelligence.data.observer.SearchAndIntelligenceLogoutObserver newInstance(com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.searchandintelligence.domain.InternalSearchAndIntelligence internalSearchAndIntelligence) {
        return new com.paypal.oslo.feature.searchandintelligence.data.observer.SearchAndIntelligenceLogoutObserver(userStore, internalSearchAndIntelligence);
    }
}
