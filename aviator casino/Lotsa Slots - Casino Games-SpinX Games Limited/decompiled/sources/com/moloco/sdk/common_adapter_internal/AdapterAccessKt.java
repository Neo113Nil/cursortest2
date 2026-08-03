package com.moloco.sdk.common_adapter_internal;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/moloco/sdk/Init$SDKInitResponse;", "", "adUnitId", "Lcom/moloco/sdk/common_adapter_internal/AdapterSessionData;", "a", "(Lcom/moloco/sdk/Init$SDKInitResponse;Ljava/lang/String;)Lcom/moloco/sdk/common_adapter_internal/AdapterSessionData;", "Lcom/moloco/sdk/publisher/bidrequest/Geo;", "Lcom/moloco/sdk/publisher/bidrequest/Geo;", "DefaultGeo", "moloco-sdk_release"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes5.dex */
public final class AdapterAccessKt {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.publisher.bidrequest.Geo f6924a = new com.moloco.sdk.publisher.bidrequest.Geo(null, null, null, null, null, null);

    public static final com.moloco.sdk.common_adapter_internal.AdapterSessionData a(com.moloco.sdk.Init.SDKInitResponse sDKInitResponse, java.lang.String str) {
        com.moloco.sdk.publisher.bidrequest.Geo geo;
        com.moloco.sdk.Init.SDKInitResponse.Geo geo2 = sDKInitResponse.getGeo();
        if (geo2 != null) {
            geo = new com.moloco.sdk.publisher.bidrequest.Geo(geo2.getCity(), geo2.getCountryIso3Code(), geo2.getCountryIso2Code(), geo2.getZipCode(), java.lang.Float.valueOf(geo2.getLatitude()), java.lang.Float.valueOf(geo2.getLongitude()));
        } else {
            geo = f6924a;
        }
        com.moloco.sdk.publisher.bidrequest.Geo geo3 = geo;
        com.moloco.sdk.Init.SDKInitResponse.DirectAdsConfig directAdsConfig = sDKInitResponse.getDirectAdsConfig();
        return new com.moloco.sdk.common_adapter_internal.AdapterSessionData(geo3, directAdsConfig != null ? directAdsConfig.getUrl() : null, sDKInitResponse.getAppId(), sDKInitResponse.getPublisherId(), sDKInitResponse.getPlatformId());
    }
}
