package com.moloco.sdk.acm.http;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.Lazy f6907a = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.acm.http.c$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.moloco.sdk.acm.http.c.a();
        }
    });

    public static final io.ktor.client.HttpClient a() {
        return io.ktor.client.HttpClientJvmKt.HttpClient(new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.acm.http.c$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.acm.http.c.a((io.ktor.client.HttpClientConfig) obj);
            }
        });
    }

    public static final io.ktor.client.HttpClient b() {
        return (io.ktor.client.HttpClient) f6907a.getValue();
    }

    public static final io.ktor.client.HttpClient c() {
        return b();
    }

    public static final kotlin.Unit a(io.ktor.client.HttpClientConfig HttpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(HttpClient, "$this$HttpClient");
        io.ktor.client.HttpClientConfig.install$default(HttpClient, io.ktor.client.plugins.UserAgentKt.getUserAgent(), null, 2, null);
        io.ktor.client.HttpClientConfig.install$default(HttpClient, io.ktor.client.plugins.HttpTimeoutKt.getHttpTimeout(), null, 2, null);
        return kotlin.Unit.INSTANCE;
    }
}
