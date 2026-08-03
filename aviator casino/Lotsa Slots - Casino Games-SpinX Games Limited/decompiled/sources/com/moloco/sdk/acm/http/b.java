package com.moloco.sdk.acm.http;

/* loaded from: classes5.dex */
public final class b {
    public static io.ktor.client.HttpClient b;
    public static java.lang.String c;

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.acm.http.b f6906a = new com.moloco.sdk.acm.http.b();
    public static final kotlin.Lazy d = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.acm.http.b$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.moloco.sdk.acm.http.b.b();
        }
    });

    public static final com.moloco.sdk.acm.http.f b() {
        io.ktor.client.HttpClient httpClient = b;
        java.lang.String str = null;
        if (httpClient == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("httpClient");
            httpClient = null;
        }
        java.lang.String str2 = c;
        if (str2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("apiUrl");
        } else {
            str = str2;
        }
        return new com.moloco.sdk.acm.http.f(httpClient, str);
    }

    public final void a(io.ktor.client.HttpClient httpClient, java.lang.String apiUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiUrl, "apiUrl");
        if (b == null) {
            b = httpClient;
            c = apiUrl;
        }
    }

    public final com.moloco.sdk.acm.http.e a() {
        return (com.moloco.sdk.acm.http.e) d.getValue();
    }
}
