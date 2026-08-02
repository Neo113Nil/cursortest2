package com.paypal.oslo.feature.businesspayandgetpaid.zettle.di;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/di/ZettleModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/data/config/ZettleConfigProvider;", "provideZettleConfigProvider$business_pay_and_get_paid_prodRelease", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/data/config/ZettleConfigProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes11.dex */
public final class ZettleModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.zettle.di.ZettleModule INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.zettle.di.ZettleModule();

    private ZettleModule() {
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.config.ZettleConfigProvider provideZettleConfigProvider$business_pay_and_get_paid_prodRelease() {
        return new com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.config.ZettleConfigProvider();
    }
}
