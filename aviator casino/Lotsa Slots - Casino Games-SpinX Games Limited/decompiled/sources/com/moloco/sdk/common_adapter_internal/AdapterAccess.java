package com.moloco.sdk.common_adapter_internal;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tJ(\u0010\u000b\u001a\u00020\f*\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0012\u0010\u0012\u001a\u00020\f*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\n\u001a\u00020\tJ\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0086T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/moloco/sdk/common_adapter_internal/AdapterAccess;", "", "<init>", "()V", "sessionData", "Lcom/moloco/sdk/common_adapter_internal/AdapterSessionData;", "adUnitId", "", "ApplicationContext", "Landroid/content/Context;", "context", "appendMolocoUserAgent", "", "Lio/ktor/http/HeadersBuilder;", "molocoSdkVersion", "androidOSVersion", "mediationInfo", "Lcom/moloco/sdk/publisher/MediationInfo;", "httpRequestTimeoutMillis", "Lio/ktor/client/request/HttpRequestBuilder;", "millis", "", "UserAgentService", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/UserAgentService;", "HttpClient", "Lio/ktor/client/HttpClient;", "screenData", "Lcom/moloco/sdk/common_adapter_internal/ScreenData;", "DispatcherProvider", "Lcom/moloco/sdk/internal/scheduling/DispatcherProvider;", "TABLET_MIN_SMALLEST_WIDTH_DP", "", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AdapterAccess {
    public static final int $stable = 0;
    public static final com.moloco.sdk.common_adapter_internal.AdapterAccess INSTANCE = new com.moloco.sdk.common_adapter_internal.AdapterAccess();
    public static final int TABLET_MIN_SMALLEST_WIDTH_DP = 600;

    public static /* synthetic */ android.content.Context ApplicationContext$default(com.moloco.sdk.common_adapter_internal.AdapterAccess adapterAccess, android.content.Context context, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        return adapterAccess.ApplicationContext(context);
    }

    public static /* synthetic */ com.moloco.sdk.common_adapter_internal.ScreenData screenData$default(com.moloco.sdk.common_adapter_internal.AdapterAccess adapterAccess, android.content.Context context, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            context = ApplicationContext$default(adapterAccess, null, 1, null);
        }
        return adapterAccess.screenData(context);
    }

    @kotlin.jvm.JvmStatic
    public static final com.moloco.sdk.common_adapter_internal.AdapterSessionData sessionData(java.lang.String adUnitId) {
        com.moloco.sdk.common_adapter_internal.AdapterSessionData a2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        com.moloco.sdk.Init.SDKInitResponse a3 = com.moloco.sdk.service_locator.a.f.f7347a.b().a();
        if (a3 == null) {
            return null;
        }
        a2 = com.moloco.sdk.common_adapter_internal.AdapterAccessKt.a(a3, adUnitId);
        return a2;
    }

    public final android.content.Context ApplicationContext(android.content.Context context) {
        return com.moloco.sdk.internal.android_context.b.a(context);
    }

    public final com.moloco.sdk.internal.scheduling.DispatcherProvider DispatcherProvider() {
        return com.moloco.sdk.internal.scheduling.b.a();
    }

    public final io.ktor.client.HttpClient HttpClient() {
        return com.moloco.sdk.service_locator.a.i.f7350a.a();
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.UserAgentService UserAgentService() {
        return com.moloco.sdk.xenoss.sdkdevkit.android.core.b.b();
    }

    public final void appendMolocoUserAgent(io.ktor.http.HeadersBuilder headersBuilder, java.lang.String str, java.lang.String str2, com.moloco.sdk.publisher.MediationInfo mediationInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headersBuilder, "<this>");
        com.moloco.sdk.internal.n.a(headersBuilder, str, str2, mediationInfo);
    }

    public final void httpRequestTimeoutMillis(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        com.moloco.sdk.xenoss.sdkdevkit.android.core.a.a(httpRequestBuilder, j);
    }

    public final com.moloco.sdk.common_adapter_internal.ScreenData screenData(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r.a(context).invoke();
    }
}
