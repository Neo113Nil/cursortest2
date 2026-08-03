package com.moloco.sdk.acm;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/moloco/sdk/acm/InitConfig;", "", com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID, "", "postAnalyticsUrl", "context", "Landroid/content/Context;", "requestPeriodSeconds", "", "clientOptions", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;JLjava/util/Map;)V", "getAppId", "()Ljava/lang/String;", "getPostAnalyticsUrl", "getContext", "()Landroid/content/Context;", "getRequestPeriodSeconds", "()J", "getClientOptions", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "moloco-android-client-metrics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class InitConfig {
    private final java.lang.String appId;
    private final java.util.Map<java.lang.String, java.lang.String> clientOptions;
    private final android.content.Context context;
    private final java.lang.String postAnalyticsUrl;
    private final long requestPeriodSeconds;

    public InitConfig(java.lang.String appId, java.lang.String postAnalyticsUrl, android.content.Context context, long j, java.util.Map<java.lang.String, java.lang.String> clientOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "appId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postAnalyticsUrl, "postAnalyticsUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientOptions, "clientOptions");
        this.appId = appId;
        this.postAnalyticsUrl = postAnalyticsUrl;
        this.context = context;
        this.requestPeriodSeconds = j;
        this.clientOptions = clientOptions;
    }

    public static /* synthetic */ com.moloco.sdk.acm.InitConfig copy$default(com.moloco.sdk.acm.InitConfig initConfig, java.lang.String str, java.lang.String str2, android.content.Context context, long j, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = initConfig.appId;
        }
        if ((i & 2) != 0) {
            str2 = initConfig.postAnalyticsUrl;
        }
        java.lang.String str3 = str2;
        if ((i & 4) != 0) {
            context = initConfig.context;
        }
        android.content.Context context2 = context;
        if ((i & 8) != 0) {
            j = initConfig.requestPeriodSeconds;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            map = initConfig.clientOptions;
        }
        return initConfig.copy(str, str3, context2, j2, map);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAppId() {
        return this.appId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPostAnalyticsUrl() {
        return this.postAnalyticsUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final android.content.Context getContext() {
        return this.context;
    }

    /* renamed from: component4, reason: from getter */
    public final long getRequestPeriodSeconds() {
        return this.requestPeriodSeconds;
    }

    public final java.util.Map<java.lang.String, java.lang.String> component5() {
        return this.clientOptions;
    }

    public final com.moloco.sdk.acm.InitConfig copy(java.lang.String appId, java.lang.String postAnalyticsUrl, android.content.Context context, long requestPeriodSeconds, java.util.Map<java.lang.String, java.lang.String> clientOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "appId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postAnalyticsUrl, "postAnalyticsUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientOptions, "clientOptions");
        return new com.moloco.sdk.acm.InitConfig(appId, postAnalyticsUrl, context, requestPeriodSeconds, clientOptions);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.moloco.sdk.acm.InitConfig)) {
            return false;
        }
        com.moloco.sdk.acm.InitConfig initConfig = (com.moloco.sdk.acm.InitConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.appId, initConfig.appId) && kotlin.jvm.internal.Intrinsics.areEqual(this.postAnalyticsUrl, initConfig.postAnalyticsUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.context, initConfig.context) && this.requestPeriodSeconds == initConfig.requestPeriodSeconds && kotlin.jvm.internal.Intrinsics.areEqual(this.clientOptions, initConfig.clientOptions);
    }

    public final java.lang.String getAppId() {
        return this.appId;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getClientOptions() {
        return this.clientOptions;
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    public final java.lang.String getPostAnalyticsUrl() {
        return this.postAnalyticsUrl;
    }

    public final long getRequestPeriodSeconds() {
        return this.requestPeriodSeconds;
    }

    public int hashCode() {
        return (((((((this.appId.hashCode() * 31) + this.postAnalyticsUrl.hashCode()) * 31) + this.context.hashCode()) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.requestPeriodSeconds)) * 31) + this.clientOptions.hashCode();
    }

    public java.lang.String toString() {
        return "InitConfig(appId=" + this.appId + ", postAnalyticsUrl=" + this.postAnalyticsUrl + ", context=" + this.context + ", requestPeriodSeconds=" + this.requestPeriodSeconds + ", clientOptions=" + this.clientOptions + ')';
    }

    public /* synthetic */ InitConfig(java.lang.String str, java.lang.String str2, android.content.Context context, long j, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, context, (i & 8) != 0 ? 600L : j, map);
    }
}
