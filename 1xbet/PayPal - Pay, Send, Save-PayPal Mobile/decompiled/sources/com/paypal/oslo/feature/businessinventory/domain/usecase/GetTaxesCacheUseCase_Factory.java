package com.paypal.oslo.feature.businessinventory.domain.usecase;

/* loaded from: classes11.dex */
public final class GetTaxesCacheUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businessinventory.domain.usecase.GetTaxesCacheUseCase> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businessinventory.domain.usecase.GetTaxesCacheUseCase get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.businessinventory.domain.usecase.GetTaxesCacheUseCase_Factory create() {
        return com.paypal.oslo.feature.businessinventory.domain.usecase.GetTaxesCacheUseCase_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.businessinventory.domain.usecase.GetTaxesCacheUseCase newInstance() {
        return new com.paypal.oslo.feature.businessinventory.domain.usecase.GetTaxesCacheUseCase();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.businessinventory.domain.usecase.GetTaxesCacheUseCase_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.businessinventory.domain.usecase.GetTaxesCacheUseCase_Factory();

        private InstanceHolder() {
        }
    }
}
