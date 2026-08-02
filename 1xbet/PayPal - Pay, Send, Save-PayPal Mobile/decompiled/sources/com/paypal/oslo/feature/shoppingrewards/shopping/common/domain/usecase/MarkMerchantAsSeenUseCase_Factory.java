package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase;

/* loaded from: classes15.dex */
public final class MarkMerchantAsSeenUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.MarkMerchantAsSeenUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.MerchantVisitHistoryRepository> getHighSpeedVideoFpsRangesFor;

    private MarkMerchantAsSeenUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.MerchantVisitHistoryRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.MarkMerchantAsSeenUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.MarkMerchantAsSeenUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.MerchantVisitHistoryRepository> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.MarkMerchantAsSeenUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.MarkMerchantAsSeenUseCase newInstance(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.MerchantVisitHistoryRepository merchantVisitHistoryRepository) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.MarkMerchantAsSeenUseCase(merchantVisitHistoryRepository);
    }
}
