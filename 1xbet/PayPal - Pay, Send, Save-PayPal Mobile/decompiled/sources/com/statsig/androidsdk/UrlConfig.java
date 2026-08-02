package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0018\u001a\u00060\u0004j\u0002`\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000bR$\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\u0010R$\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\u0010R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$"}, d2 = {"Lcom/statsig/androidsdk/UrlConfig;", "", "Lcom/statsig/androidsdk/Endpoint;", "endpoint", "", "inputApi", "", "userFallbackUrls", "<init>", "(Lcom/statsig/androidsdk/Endpoint;Ljava/lang/String;Ljava/util/List;)V", "getUrl", "()Ljava/lang/String;", "customUrl", "Ljava/lang/String;", "getCustomUrl", "setCustomUrl", "(Ljava/lang/String;)V", "defaultUrl", "getDefaultUrl", "setDefaultUrl", "Lcom/statsig/androidsdk/Endpoint;", "getEndpoint", "()Lcom/statsig/androidsdk/Endpoint;", "Lcom/statsig/androidsdk/EndpointDnsKey;", "endpointDnsKey", "getEndpointDnsKey", "fallbackUrl", "getFallbackUrl", "setFallbackUrl", "statsigFallbackUrl", "getStatsigFallbackUrl", "setStatsigFallbackUrl", "Ljava/util/List;", "getUserFallbackUrls", "()Ljava/util/List;", "setUserFallbackUrls", "(Ljava/util/List;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class UrlConfig {
    private java.lang.String customUrl;
    private java.lang.String defaultUrl;
    private final com.statsig.androidsdk.Endpoint endpoint;
    private final java.lang.String endpointDnsKey;
    private java.lang.String fallbackUrl;
    private java.lang.String statsigFallbackUrl;
    private java.util.List<java.lang.String> userFallbackUrls;

    public UrlConfig(com.statsig.androidsdk.Endpoint endpoint, java.lang.String str, java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpoint, "");
        this.endpoint = endpoint;
        this.userFallbackUrls = list;
        java.lang.String str2 = com.statsig.androidsdk.StatsigNetworkConfigKt.getENDPOINT_DNS_KEY_MAP().get(endpoint);
        this.endpointDnsKey = str2 != null ? str2 : "";
        java.lang.String str3 = com.statsig.androidsdk.StatsigNetworkConfigKt.getNetworkDefault().get(endpoint);
        java.lang.String value = endpoint.getValue();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str3);
        sb.append(value);
        this.defaultUrl = sb.toString();
        if (this.customUrl != null || str == null) {
            return;
        }
        java.lang.String trimEnd = kotlin.text.StringsKt.trimEnd(str, kotlinx.io.files.FileSystemKt.UnixPathSeparator);
        java.lang.String value2 = endpoint.getValue();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(trimEnd);
        sb2.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        sb2.append(value2);
        java.lang.String obj = sb2.toString();
        if (kotlin.jvm.internal.Intrinsics.areEqual(obj, this.defaultUrl)) {
            return;
        }
        this.customUrl = obj;
    }

    public /* synthetic */ UrlConfig(com.statsig.androidsdk.Endpoint endpoint, java.lang.String str, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(endpoint, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list);
    }

    public final com.statsig.androidsdk.Endpoint getEndpoint() {
        return this.endpoint;
    }

    public final java.util.List<java.lang.String> getUserFallbackUrls() {
        return this.userFallbackUrls;
    }

    public final void setUserFallbackUrls(java.util.List<java.lang.String> list) {
        this.userFallbackUrls = list;
    }

    public final java.lang.String getEndpointDnsKey() {
        return this.endpointDnsKey;
    }

    public final java.lang.String getDefaultUrl() {
        return this.defaultUrl;
    }

    public final void setDefaultUrl(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.defaultUrl = str;
    }

    public final java.lang.String getCustomUrl() {
        return this.customUrl;
    }

    public final void setCustomUrl(java.lang.String str) {
        this.customUrl = str;
    }

    public final java.lang.String getStatsigFallbackUrl() {
        return this.statsigFallbackUrl;
    }

    public final void setStatsigFallbackUrl(java.lang.String str) {
        this.statsigFallbackUrl = str;
    }

    public final java.lang.String getFallbackUrl() {
        return this.fallbackUrl;
    }

    public final void setFallbackUrl(java.lang.String str) {
        this.fallbackUrl = str;
    }

    public final java.lang.String getUrl() {
        java.lang.String str = this.customUrl;
        return str == null ? this.defaultUrl : str;
    }
}
