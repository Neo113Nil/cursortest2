package com.moloco.sdk.publisher.bidrequest;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toGeo", "Lcom/moloco/sdk/publisher/bidrequest/Geo;", "Lcom/moloco/sdk/Init$SDKInitResponse$Geo;", "moloco-sdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GeoKt {
    public static final com.moloco.sdk.publisher.bidrequest.Geo toGeo(com.moloco.sdk.Init.SDKInitResponse.Geo geo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(geo, "<this>");
        return new com.moloco.sdk.publisher.bidrequest.Geo(geo.getCity(), geo.getCountryIso3Code(), geo.getCountryIso2Code(), geo.getZipCode(), java.lang.Float.valueOf(geo.getLatitude()), java.lang.Float.valueOf(geo.getLongitude()));
    }
}
