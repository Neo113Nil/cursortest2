package com.paypal.oslo.core.i18n.data.repository;

/* loaded from: classes10.dex */
public final class DocumentRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.data.repository.DocumentRepositoryImpl> {
    private final dagger.internal.Provider<kotlinx.serialization.json.Json> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.data.repository.NetworkRepository> getHighSpeedVideoFpsRanges;

    private DocumentRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.data.repository.NetworkRepository> provider, dagger.internal.Provider<kotlinx.serialization.json.Json> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.data.repository.DocumentRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.i18n.data.repository.DocumentRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.data.repository.NetworkRepository> provider, dagger.internal.Provider<kotlinx.serialization.json.Json> provider2) {
        return new com.paypal.oslo.core.i18n.data.repository.DocumentRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.i18n.data.repository.DocumentRepositoryImpl newInstance(com.paypal.oslo.core.i18n.data.repository.NetworkRepository networkRepository, kotlinx.serialization.json.Json json) {
        return new com.paypal.oslo.core.i18n.data.repository.DocumentRepositoryImpl(networkRepository, json);
    }
}
