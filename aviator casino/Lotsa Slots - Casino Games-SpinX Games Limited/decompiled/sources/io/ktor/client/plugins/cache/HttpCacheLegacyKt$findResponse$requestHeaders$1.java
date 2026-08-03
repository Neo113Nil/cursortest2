package io.ktor.client.plugins.cache;

/* compiled from: HttpCacheLegacy.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class HttpCacheLegacyKt$findResponse$requestHeaders$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, java.lang.String> {
    HttpCacheLegacyKt$findResponse$requestHeaders$1(java.lang.Object obj) {
        super(1, obj, io.ktor.http.Headers.class, "get", "get(Ljava/lang/String;)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.String invoke(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
        return ((io.ktor.http.Headers) this.receiver).get(p0);
    }
}
