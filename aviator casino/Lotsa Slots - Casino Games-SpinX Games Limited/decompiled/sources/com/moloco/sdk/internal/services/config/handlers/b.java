package com.moloco.sdk.internal.services.config.handlers;

/* loaded from: classes5.dex */
public final class b implements com.moloco.sdk.internal.services.config.handlers.a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7263a = 0;

    @Override // com.moloco.sdk.internal.services.config.handlers.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.moloco.sdk.internal.configs.a a(com.moloco.sdk.Init.SDKInitResponse sdkInitResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
        if (!sdkInitResponse.hasOperationalMetricsConfig()) {
            return com.moloco.sdk.internal.configs.b.c();
        }
        com.moloco.sdk.Init.SDKInitResponse.OperationalMetricsConfig operationalMetricsConfig = sdkInitResponse.getOperationalMetricsConfig();
        java.lang.String url = operationalMetricsConfig.getUrl();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
        return new com.moloco.sdk.internal.configs.a(url, operationalMetricsConfig.getPollingIntervalSeconds());
    }

    @Override // com.moloco.sdk.internal.services.config.handlers.a
    public java.lang.Class<com.moloco.sdk.internal.configs.a> a() {
        return com.moloco.sdk.internal.configs.a.class;
    }
}
