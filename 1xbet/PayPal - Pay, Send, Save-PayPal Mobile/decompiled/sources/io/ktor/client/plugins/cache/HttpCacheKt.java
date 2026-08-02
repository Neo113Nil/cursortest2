package io.ktor.client.plugins.cache;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aU\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00050\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u001e\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lio/ktor/http/content/OutgoingContent;", "content", "Lkotlin/Function1;", "", "headerExtractor", "", "allHeadersExtractor", "mergedHeadersLookup", "(Lio/ktor/http/content/OutgoingContent;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "getLOGGER", "()Lorg/slf4j/Logger;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpCacheKt {
    private static final org.slf4j.Logger LOGGER = io.ktor.util.logging.KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpCache");

    public static final org.slf4j.Logger getLOGGER() {
        return LOGGER;
    }

    public static final kotlin.jvm.functions.Function1<java.lang.String, java.lang.String> mergedHeadersLookup(final io.ktor.http.content.OutgoingContent outgoingContent, final kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> function1, final kotlin.jvm.functions.Function1<? super java.lang.String, ? extends java.util.List<java.lang.String>> function12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outgoingContent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        return new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.cache.HttpCacheKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.cache.HttpCacheKt.$r8$lambda$PhzvVDWfw6MPoqBdHwfn19p6okY(io.ktor.http.content.OutgoingContent.this, function1, function12, (java.lang.String) obj);
            }
        };
    }

    public static /* synthetic */ java.lang.String $r8$lambda$PhzvVDWfw6MPoqBdHwfn19p6okY(io.ktor.http.content.OutgoingContent outgoingContent, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, java.lang.String str) {
        java.lang.String obj;
        java.lang.String obj2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, io.ktor.http.HttpHeaders.INSTANCE.getContentLength())) {
            java.lang.Long contentLength = outgoingContent.getContentLength();
            return (contentLength == null || (obj2 = contentLength.toString()) == null) ? "" : obj2;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, io.ktor.http.HttpHeaders.INSTANCE.getContentType())) {
            io.ktor.http.ContentType contentType = outgoingContent.getContentType();
            return (contentType == null || (obj = contentType.toString()) == null) ? "" : obj;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, io.ktor.http.HttpHeaders.INSTANCE.getUserAgent())) {
            java.lang.String str2 = outgoingContent.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getUserAgent());
            if (str2 != null) {
                return str2;
            }
            java.lang.String str3 = (java.lang.String) function1.invoke(io.ktor.http.HttpHeaders.INSTANCE.getUserAgent());
            return str3 == null ? io.ktor.client.engine.UtilsKt.getKTOR_DEFAULT_USER_AGENT() : str3;
        }
        java.util.List<java.lang.String> all = outgoingContent.getHeaders().getAll(str);
        if (all == null && (all = (java.util.List) function12.invoke(str)) == null) {
            all = kotlin.collections.CollectionsKt.emptyList();
        }
        return kotlin.collections.CollectionsKt.joinToString$default(all, ";", null, null, 0, null, null, 62, null);
    }

    public static final /* synthetic */ boolean access$canStore(io.ktor.http.URLProtocol uRLProtocol) {
        return kotlin.jvm.internal.Intrinsics.areEqual(uRLProtocol.getName(), "http") || kotlin.jvm.internal.Intrinsics.areEqual(uRLProtocol.getName(), "https");
    }
}
