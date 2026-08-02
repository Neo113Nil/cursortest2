package com.paypal.oslo.feature.businesshome.data.repository;

/* loaded from: classes11.dex */
public final class EngagementCardDismissalRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesshome.data.repository.EngagementCardDismissalRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorage> Camera2StreamConfigurationMap;

    private EngagementCardDismissalRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorage> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesshome.data.repository.EngagementCardDismissalRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.businesshome.data.repository.EngagementCardDismissalRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorage> provider) {
        return new com.paypal.oslo.feature.businesshome.data.repository.EngagementCardDismissalRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesshome.data.repository.EngagementCardDismissalRepositoryImpl newInstance(com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorage dismissedCardsStorage) {
        return new com.paypal.oslo.feature.businesshome.data.repository.EngagementCardDismissalRepositoryImpl(dismissedCardsStorage);
    }
}
