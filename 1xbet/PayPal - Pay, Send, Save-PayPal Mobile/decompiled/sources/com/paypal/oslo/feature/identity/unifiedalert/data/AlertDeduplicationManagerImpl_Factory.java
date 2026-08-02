package com.paypal.oslo.feature.identity.unifiedalert.data;

/* loaded from: classes13.dex */
public final class AlertDeduplicationManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.unifiedalert.domain.repository.HandledAlertsRepository> getHighSpeedVideoSizes;

    private AlertDeduplicationManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.unifiedalert.domain.repository.HandledAlertsRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.unifiedalert.domain.repository.HandledAlertsRepository> provider) {
        return new com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl newInstance(com.paypal.oslo.feature.identity.unifiedalert.domain.repository.HandledAlertsRepository handledAlertsRepository) {
        return new com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl(handledAlertsRepository);
    }
}
