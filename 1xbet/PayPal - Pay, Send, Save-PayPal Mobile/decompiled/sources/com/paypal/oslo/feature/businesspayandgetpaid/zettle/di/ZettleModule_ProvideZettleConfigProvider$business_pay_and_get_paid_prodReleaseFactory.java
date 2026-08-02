package com.paypal.oslo.feature.businesspayandgetpaid.zettle.di;

/* loaded from: classes11.dex */
public final class ZettleModule_ProvideZettleConfigProvider$business_pay_and_get_paid_prodReleaseFactory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.config.ZettleConfigProvider> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.config.ZettleConfigProvider get() {
        return provideZettleConfigProvider$business_pay_and_get_paid_prodRelease();
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.zettle.di.ZettleModule_ProvideZettleConfigProvider$business_pay_and_get_paid_prodReleaseFactory create() {
        return com.paypal.oslo.feature.businesspayandgetpaid.zettle.di.ZettleModule_ProvideZettleConfigProvider$business_pay_and_get_paid_prodReleaseFactory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.config.ZettleConfigProvider provideZettleConfigProvider$business_pay_and_get_paid_prodRelease() {
        return (com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.config.ZettleConfigProvider) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.businesspayandgetpaid.zettle.di.ZettleModule.INSTANCE.provideZettleConfigProvider$business_pay_and_get_paid_prodRelease());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.businesspayandgetpaid.zettle.di.ZettleModule_ProvideZettleConfigProvider$business_pay_and_get_paid_prodReleaseFactory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.businesspayandgetpaid.zettle.di.ZettleModule_ProvideZettleConfigProvider$business_pay_and_get_paid_prodReleaseFactory();

        private InstanceHolder() {
        }
    }
}
