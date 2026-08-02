package com.paypal.oslo.feature.cashin.data.repository;

/* loaded from: classes11.dex */
public final class CashInPreferencesRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cashin.data.repository.CashInPreferencesRepositoryImpl> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;

    private CashInPreferencesRepositoryImpl_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cashin.data.repository.CashInPreferencesRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.cashin.data.repository.CashInPreferencesRepositoryImpl_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.cashin.data.repository.CashInPreferencesRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.cashin.data.repository.CashInPreferencesRepositoryImpl newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.cashin.data.repository.CashInPreferencesRepositoryImpl(context);
    }
}
