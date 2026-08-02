package io.ktor.client.plugins.cache;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class HttpCache$findResponse$lookup$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, java.lang.String> {
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public final java.lang.String invoke(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return ((io.ktor.http.HeadersBuilder) this.receiver).get(str);
    }

    HttpCache$findResponse$lookup$1(java.lang.Object obj) {
        super(1, obj, io.ktor.http.HeadersBuilder.class, "get", "get(Ljava/lang/String;)Ljava/lang/String;", 0);
    }
}
