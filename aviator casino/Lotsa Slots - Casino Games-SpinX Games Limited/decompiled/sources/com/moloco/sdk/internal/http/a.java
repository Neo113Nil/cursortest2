package com.moloco.sdk.internal.http;

/* loaded from: classes5.dex */
public final class a {
    public static final io.ktor.client.HttpClient a(final com.moloco.sdk.internal.services.C3439j appInfo, final com.moloco.sdk.internal.services.x deviceInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        return io.ktor.client.HttpClientJvmKt.HttpClient(new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.internal.http.a$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.internal.http.a.a(com.moloco.sdk.internal.services.C3439j.this, deviceInfo, (io.ktor.client.HttpClientConfig) obj);
            }
        });
    }

    public static final kotlin.Unit a(final com.moloco.sdk.internal.services.C3439j c3439j, final com.moloco.sdk.internal.services.x xVar, io.ktor.client.HttpClientConfig HttpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(HttpClient, "$this$HttpClient");
        HttpClient.install(io.ktor.client.plugins.UserAgentKt.getUserAgent(), new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.internal.http.a$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.internal.http.a.a((io.ktor.client.plugins.UserAgentConfig) obj);
            }
        });
        io.ktor.client.HttpClientConfig.install$default(HttpClient, io.ktor.client.plugins.HttpTimeoutKt.getHttpTimeout(), null, 2, null);
        io.ktor.client.HttpClientConfig.install$default(HttpClient, io.ktor.client.plugins.HttpRequestRetryKt.getHttpRequestRetry(), null, 2, null);
        io.ktor.client.plugins.DefaultRequestKt.defaultRequest(HttpClient, new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.internal.http.a$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.internal.http.a.a(com.moloco.sdk.internal.services.C3439j.this, xVar, (io.ktor.client.plugins.DefaultRequest.DefaultRequestBuilder) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(io.ktor.client.plugins.UserAgentConfig install) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(install, "$this$install");
        install.setAgent(com.moloco.sdk.xenoss.sdkdevkit.android.core.b.b().invoke());
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(final com.moloco.sdk.internal.services.C3439j c3439j, final com.moloco.sdk.internal.services.x xVar, io.ktor.client.plugins.DefaultRequest.DefaultRequestBuilder defaultRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultRequest, "$this$defaultRequest");
        io.ktor.client.request.HttpRequestKt.headers(defaultRequest, new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.internal.http.a$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.internal.http.a.a(com.moloco.sdk.internal.services.C3439j.this, xVar, (io.ktor.http.HeadersBuilder) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(com.moloco.sdk.internal.services.C3439j c3439j, com.moloco.sdk.internal.services.x xVar, io.ktor.http.HeadersBuilder headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "$this$headers");
        headers.append("X-Moloco-App-Info", "AppBundle/" + c3439j.b() + "; AppVersion/" + c3439j.c() + "; AppKey/" + com.moloco.sdk.publisher.Moloco.INSTANCE.getAppKey$moloco_sdk_release() + ';');
        headers.append("X-Moloco-Device-Info", "make/" + xVar.t() + "; model/" + xVar.v() + "; hwv/" + xVar.r() + "; osv/" + xVar.x() + "; OS/Android;");
        headers.append("X-Moloco-SDK-Info", "SdkVersion/4.7.0");
        return kotlin.Unit.INSTANCE;
    }
}
