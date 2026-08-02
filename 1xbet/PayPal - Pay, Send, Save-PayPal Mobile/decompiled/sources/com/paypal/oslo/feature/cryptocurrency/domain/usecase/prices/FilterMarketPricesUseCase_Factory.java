package com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices;

/* loaded from: classes12.dex */
public final class FilterMarketPricesUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.FilterMarketPricesUseCase> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.FilterMarketPricesUseCase get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.FilterMarketPricesUseCase_Factory create() {
        return com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.FilterMarketPricesUseCase_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.FilterMarketPricesUseCase newInstance() {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.FilterMarketPricesUseCase();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.FilterMarketPricesUseCase_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.FilterMarketPricesUseCase_Factory();

        private InstanceHolder() {
        }
    }
}
