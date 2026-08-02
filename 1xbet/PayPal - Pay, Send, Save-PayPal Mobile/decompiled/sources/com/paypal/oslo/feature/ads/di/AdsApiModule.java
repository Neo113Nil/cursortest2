package com.paypal.oslo.feature.ads.di;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/ads/di/AdsApiModule;", "", "<init>", "()V", "Lkotlinx/coroutines/CoroutineDispatcher;", "provideIoDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "Lcom/paypal/oslo/feature/ads/api/config/AdsConfiguration;", "adsConfiguration", "Lcom/paypal/oslo/feature/ads/di/AdsClientOkHttpProvider;", "adsClientProvider", "ioDispatcher", "Lcom/paypal/oslo/feature/ads/data/repository/client/AdsApiClient;", "provideAdsApiClient", "(Lcom/paypal/oslo/feature/ads/api/config/AdsConfiguration;Lcom/paypal/oslo/feature/ads/di/AdsClientOkHttpProvider;Lkotlinx/coroutines/CoroutineDispatcher;)Lcom/paypal/oslo/feature/ads/data/repository/client/AdsApiClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class AdsApiModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.ads.di.AdsApiModule INSTANCE = new com.paypal.oslo.feature.ads.di.AdsApiModule();

    private AdsApiModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final kotlinx.coroutines.CoroutineDispatcher provideIoDispatcher() {
        return kotlinx.coroutines.Dispatchers.getIO();
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.ads.data.repository.client.AdsApiClient provideAdsApiClient(com.paypal.oslo.feature.ads.api.config.AdsConfiguration adsConfiguration, com.paypal.oslo.feature.ads.di.AdsClientOkHttpProvider adsClientProvider, kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adsConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adsClientProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioDispatcher, "");
        return new com.paypal.oslo.feature.ads.data.repository.client.AdsApiClientImpl(adsConfiguration, ioDispatcher, adsClientProvider.getCallFactory(), null, 8, null);
    }
}
