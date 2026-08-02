package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase;

/* loaded from: classes15.dex */
public final class CheckFirstTimeMerchantUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.CheckFirstTimeMerchantUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.MerchantVisitHistoryRepository> getHighSpeedVideoFpsRanges;

    private CheckFirstTimeMerchantUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.MerchantVisitHistoryRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.CheckFirstTimeMerchantUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.CheckFirstTimeMerchantUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.MerchantVisitHistoryRepository> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.CheckFirstTimeMerchantUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.CheckFirstTimeMerchantUseCase newInstance(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.MerchantVisitHistoryRepository merchantVisitHistoryRepository) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.CheckFirstTimeMerchantUseCase(merchantVisitHistoryRepository);
    }
}
