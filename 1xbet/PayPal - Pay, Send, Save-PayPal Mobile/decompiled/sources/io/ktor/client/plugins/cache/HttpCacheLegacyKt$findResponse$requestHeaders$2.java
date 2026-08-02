package io.ktor.client.plugins.cache;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final /* synthetic */ class HttpCacheLegacyKt$findResponse$requestHeaders$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, java.util.List<? extends java.lang.String>> {
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public final java.util.List<java.lang.String> invoke(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return ((io.ktor.http.Headers) this.receiver).getAll(str);
    }

    HttpCacheLegacyKt$findResponse$requestHeaders$2(java.lang.Object obj) {
        super(1, obj, io.ktor.http.Headers.class, "getAll", "getAll(Ljava/lang/String;)Ljava/util/List;", 0);
    }
}
