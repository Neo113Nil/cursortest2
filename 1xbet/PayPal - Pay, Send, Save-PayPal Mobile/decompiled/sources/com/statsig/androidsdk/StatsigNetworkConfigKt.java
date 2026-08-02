package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\"'\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u00008\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007*\n\u0010\n\"\u00020\u00022\u00020\u0002"}, d2 = {"", "Lcom/statsig/androidsdk/Endpoint;", "", "Lcom/statsig/androidsdk/EndpointDnsKey;", "ENDPOINT_DNS_KEY_MAP", "Ljava/util/Map;", "getENDPOINT_DNS_KEY_MAP", "()Ljava/util/Map;", "NetworkDefault", "getNetworkDefault", "EndpointDnsKey"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class StatsigNetworkConfigKt {
    private static final java.util.Map<com.statsig.androidsdk.Endpoint, java.lang.String> ENDPOINT_DNS_KEY_MAP = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.statsig.androidsdk.Endpoint.Initialize, "i"), kotlin.TuplesKt.to(com.statsig.androidsdk.Endpoint.Rgstr, "e"));
    private static final java.util.Map<com.statsig.androidsdk.Endpoint, java.lang.String> NetworkDefault = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.statsig.androidsdk.Endpoint.Initialize, com.statsig.androidsdk.StatsigOptionsKt.DEFAULT_INIT_API), kotlin.TuplesKt.to(com.statsig.androidsdk.Endpoint.Rgstr, com.statsig.androidsdk.StatsigOptionsKt.DEFAULT_EVENT_API));

    public static final java.util.Map<com.statsig.androidsdk.Endpoint, java.lang.String> getENDPOINT_DNS_KEY_MAP() {
        return ENDPOINT_DNS_KEY_MAP;
    }

    public static final java.util.Map<com.statsig.androidsdk.Endpoint, java.lang.String> getNetworkDefault() {
        return NetworkDefault;
    }
}
