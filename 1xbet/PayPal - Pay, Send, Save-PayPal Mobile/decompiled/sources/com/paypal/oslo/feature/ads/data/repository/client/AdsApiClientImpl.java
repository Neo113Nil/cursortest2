package com.paypal.oslo.feature.ads.data.repository.client;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/repository/client/AdsApiClientImpl;", "Lcom/paypal/oslo/feature/ads/data/repository/client/AdsApiClient;", "Lcom/paypal/oslo/feature/ads/api/config/AdsConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "Lokhttp3/Call$Factory;", "callFactory", "Lcom/paypal/oslo/feature/ads/data/repository/serialization/SmithyJsonSerializer;", "serializer", "<init>", "(Lcom/paypal/oslo/feature/ads/api/config/AdsConfiguration;Lkotlinx/coroutines/CoroutineDispatcher;Lokhttp3/Call$Factory;Lcom/paypal/oslo/feature/ads/data/repository/serialization/SmithyJsonSerializer;)V", "Lcom/paypal/oslo/feature/ads/data/models/smithy/GetDisplayAdsRequest;", "request", "Lcom/paypal/oslo/feature/ads/data/models/smithy/GetDisplayAdsResponse;", "getDisplayAds", "(Lcom/paypal/oslo/feature/ads/data/models/smithy/GetDisplayAdsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/ads/api/config/AdsConfiguration;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighResolutionOutputSizeshNQ4ISI", "Lokhttp3/Call$Factory;", "Lcom/paypal/oslo/feature/ads/data/repository/serialization/SmithyJsonSerializer;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AdsApiClientImpl implements com.paypal.oslo.feature.ads.data.repository.client.AdsApiClient {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final okhttp3.Call.Factory getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.ads.api.config.AdsConfiguration getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonSerializer getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoSizes;
    public static final int $stable = 8;

    public AdsApiClientImpl(com.paypal.oslo.feature.ads.api.config.AdsConfiguration adsConfiguration, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, okhttp3.Call.Factory factory, com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonSerializer smithyJsonSerializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adsConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smithyJsonSerializer, "");
        this.getHighSpeedVideoFpsRangesFor = adsConfiguration;
        this.getHighSpeedVideoSizes = coroutineDispatcher;
        this.getHighSpeedVideoFpsRanges = factory;
        this.getHighResolutionOutputSizeshNQ4ISI = smithyJsonSerializer;
    }

    public /* synthetic */ AdsApiClientImpl(com.paypal.oslo.feature.ads.api.config.AdsConfiguration adsConfiguration, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, okhttp3.Call.Factory factory, com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter smithyJsonAdapter, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(adsConfiguration, coroutineDispatcher, factory, (i & 8) != 0 ? com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonAdapter.INSTANCE : smithyJsonAdapter);
    }

    @Override // com.paypal.oslo.feature.ads.data.repository.client.AdsApiClient
    public final java.lang.Object getDisplayAds(com.paypal.oslo.feature.ads.data.models.smithy.GetDisplayAdsRequest getDisplayAdsRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.ads.data.models.smithy.GetDisplayAdsResponse> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoSizes, new com.paypal.oslo.feature.ads.data.repository.client.AdsApiClientImpl$getDisplayAds$2(this, getDisplayAdsRequest, null), continuation);
    }
}
