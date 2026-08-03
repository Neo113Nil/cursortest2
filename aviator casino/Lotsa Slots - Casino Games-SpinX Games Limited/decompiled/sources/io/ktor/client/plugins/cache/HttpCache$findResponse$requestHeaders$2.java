package io.ktor.client.plugins.cache;

/* compiled from: HttpCache.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class HttpCache$findResponse$requestHeaders$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, java.util.List<? extends java.lang.String>> {
    HttpCache$findResponse$requestHeaders$2(java.lang.Object obj) {
        super(1, obj, io.ktor.http.Headers.class, "getAll", "getAll(Ljava/lang/String;)Ljava/util/List;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.util.List<java.lang.String> invoke(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
        return ((io.ktor.http.Headers) this.receiver).getAll(p0);
    }
}
