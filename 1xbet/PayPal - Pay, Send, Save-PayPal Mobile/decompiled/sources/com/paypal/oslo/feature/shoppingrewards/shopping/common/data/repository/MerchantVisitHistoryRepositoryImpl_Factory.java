package com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository;

/* loaded from: classes15.dex */
public final class MerchantVisitHistoryRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MerchantVisitHistoryRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> getHighSpeedVideoFpsRanges;

    private MerchantVisitHistoryRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MerchantVisitHistoryRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MerchantVisitHistoryRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MerchantVisitHistoryRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MerchantVisitHistoryRepositoryImpl newInstance(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MerchantVisitHistoryRepositoryImpl(appStorage);
    }
}
