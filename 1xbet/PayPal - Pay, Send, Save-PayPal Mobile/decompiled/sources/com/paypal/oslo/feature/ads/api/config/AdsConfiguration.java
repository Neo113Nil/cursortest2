package com.paypal.oslo.feature.ads.api.config;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\tR\u0011\u0010\u001b\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/ads/api/config/AdsConfiguration;", "", "", "baseUrl", com.visa.cbp.sdk.facade.data.Constants.API_KEY, "clientId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/ads/api/config/AdsConfiguration;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBaseUrl", "getApiKey", "getClientId", "getDisplayAdsEndpoint", "displayAdsEndpoint", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AdsConfiguration {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.ads.api.config.AdsConfiguration.Companion INSTANCE = new com.paypal.oslo.feature.ads.api.config.AdsConfiguration.Companion(null);
    private final java.lang.String apiKey;
    private final java.lang.String baseUrl;
    private final java.lang.String clientId;

    public AdsConfiguration(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.baseUrl = str;
        this.apiKey = str2;
        this.clientId = str3;
    }

    public final java.lang.String getBaseUrl() {
        return this.baseUrl;
    }

    public final java.lang.String getApiKey() {
        return this.apiKey;
    }

    public /* synthetic */ AdsConfiguration(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "paypal-app-oslo-android" : str3);
    }

    public final java.lang.String getClientId() {
        return this.clientId;
    }

    public final java.lang.String getDisplayAdsEndpoint() {
        java.lang.String str = this.baseUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("display-ads");
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/ads/api/config/AdsConfiguration$Companion;", "", "<init>", "()V", "", com.visa.cbp.sdk.facade.data.Constants.API_KEY, "Lcom/paypal/oslo/feature/ads/api/config/AdsConfiguration;", com.adjust.sdk.AdjustConfig.ENVIRONMENT_PRODUCTION, "(Ljava/lang/String;)Lcom/paypal/oslo/feature/ads/api/config/AdsConfiguration;", "staging"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.ads.api.config.AdsConfiguration production(java.lang.String apiKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiKey, "");
            return new com.paypal.oslo.feature.ads.api.config.AdsConfiguration("https://edge.paypal-ads.com/orchestration/v1/public/", apiKey, null, 4, null);
        }

        public final com.paypal.oslo.feature.ads.api.config.AdsConfiguration staging(java.lang.String apiKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiKey, "");
            return new com.paypal.oslo.feature.ads.api.config.AdsConfiguration("https://edge.staging.paypal-ads.com/orchestration/v1/public/", apiKey, null, 4, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.baseUrl;
        java.lang.String str2 = this.apiKey;
        java.lang.String str3 = this.clientId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AdsConfiguration(baseUrl=");
        sb.append(str);
        sb.append(", apiKey=");
        sb.append(str2);
        sb.append(", clientId=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.baseUrl.hashCode() * 31) + this.apiKey.hashCode()) * 31) + this.clientId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.ads.api.config.AdsConfiguration)) {
            return false;
        }
        com.paypal.oslo.feature.ads.api.config.AdsConfiguration adsConfiguration = (com.paypal.oslo.feature.ads.api.config.AdsConfiguration) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.baseUrl, adsConfiguration.baseUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.apiKey, adsConfiguration.apiKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.clientId, adsConfiguration.clientId);
    }

    public final com.paypal.oslo.feature.ads.api.config.AdsConfiguration copy(java.lang.String baseUrl, java.lang.String apiKey, java.lang.String clientId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientId, "");
        return new com.paypal.oslo.feature.ads.api.config.AdsConfiguration(baseUrl, apiKey, clientId);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getClientId() {
        return this.clientId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getApiKey() {
        return this.apiKey;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getBaseUrl() {
        return this.baseUrl;
    }

    public static /* synthetic */ com.paypal.oslo.feature.ads.api.config.AdsConfiguration copy$default(com.paypal.oslo.feature.ads.api.config.AdsConfiguration adsConfiguration, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = adsConfiguration.baseUrl;
        }
        if ((i & 2) != 0) {
            str2 = adsConfiguration.apiKey;
        }
        if ((i & 4) != 0) {
            str3 = adsConfiguration.clientId;
        }
        return adsConfiguration.copy(str, str2, str3);
    }
}
