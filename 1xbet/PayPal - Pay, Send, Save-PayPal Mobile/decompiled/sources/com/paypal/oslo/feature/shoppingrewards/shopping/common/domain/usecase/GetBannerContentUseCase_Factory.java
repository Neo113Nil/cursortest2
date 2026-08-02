package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase;

/* loaded from: classes15.dex */
public final class GetBannerContentUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetBannerContentUseCase> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetBannerContentUseCase get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetBannerContentUseCase_Factory create() {
        return com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetBannerContentUseCase_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetBannerContentUseCase newInstance() {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetBannerContentUseCase();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetBannerContentUseCase_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetBannerContentUseCase_Factory();

        private InstanceHolder() {
        }
    }
}
