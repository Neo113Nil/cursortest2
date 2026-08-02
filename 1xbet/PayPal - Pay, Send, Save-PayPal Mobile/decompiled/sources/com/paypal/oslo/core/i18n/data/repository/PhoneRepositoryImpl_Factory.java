package com.paypal.oslo.core.i18n.data.repository;

/* loaded from: classes10.dex */
public final class PhoneRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.data.repository.PhoneRepositoryImpl> {
    private final dagger.internal.Provider<kotlinx.serialization.json.Json> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.data.repository.NetworkRepository> getHighSpeedVideoFpsRangesFor;

    private PhoneRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.data.repository.NetworkRepository> provider, dagger.internal.Provider<kotlinx.serialization.json.Json> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.data.repository.PhoneRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.i18n.data.repository.PhoneRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.data.repository.NetworkRepository> provider, dagger.internal.Provider<kotlinx.serialization.json.Json> provider2) {
        return new com.paypal.oslo.core.i18n.data.repository.PhoneRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.i18n.data.repository.PhoneRepositoryImpl newInstance(com.paypal.oslo.core.i18n.data.repository.NetworkRepository networkRepository, kotlinx.serialization.json.Json json) {
        return new com.paypal.oslo.core.i18n.data.repository.PhoneRepositoryImpl(networkRepository, json);
    }
}
