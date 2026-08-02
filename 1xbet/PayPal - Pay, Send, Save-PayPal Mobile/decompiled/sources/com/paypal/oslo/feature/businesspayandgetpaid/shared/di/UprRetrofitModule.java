package com.paypal.oslo.feature.businesspayandgetpaid.shared.di;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/di/UprRetrofitModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/network/rest/RetrofitProvider;", "retrofitProvider", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/di/UprOkHttpClientProvider;", "uprOkHttpClientProvider", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/config/UprEnvironmentConfig;", "uprEnvironmentConfig", "Lretrofit2/Retrofit;", "provideUprRetrofit", "(Lcom/paypal/oslo/core/network/rest/RetrofitProvider;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/di/UprOkHttpClientProvider;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/config/UprEnvironmentConfig;)Lretrofit2/Retrofit;", "retrofit", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/api/UprPurchaseService;", "provideUprPurchaseService", "(Lretrofit2/Retrofit;)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/api/UprPurchaseService;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class UprRetrofitModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprRetrofitModule INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprRetrofitModule();

    private UprRetrofitModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    @com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprRetrofit
    public final retrofit2.Retrofit provideUprRetrofit(com.paypal.oslo.core.network.rest.RetrofitProvider retrofitProvider, com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprOkHttpClientProvider uprOkHttpClientProvider, com.paypal.oslo.feature.businesspayandgetpaid.shared.data.config.UprEnvironmentConfig uprEnvironmentConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retrofitProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uprOkHttpClientProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uprEnvironmentConfig, "");
        return retrofitProvider.create(uprOkHttpClientProvider.getCallFactory(), uprEnvironmentConfig);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.data.api.UprPurchaseService provideUprPurchaseService(@com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprRetrofit retrofit2.Retrofit retrofit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retrofit, "");
        java.lang.Object create = retrofit.create(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.api.UprPurchaseService.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
        return (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.api.UprPurchaseService) create;
    }
}
