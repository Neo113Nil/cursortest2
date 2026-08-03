package io.ktor.client.plugins.cache;

/* compiled from: HttpCache.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aU\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00050\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\"\u001e\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/ktor/http/content/OutgoingContent;", "content", "Lkotlin/Function1;", "", "headerExtractor", "", "allHeadersExtractor", "mergedHeadersLookup", "(Lio/ktor/http/content/OutgoingContent;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "Lio/ktor/http/URLProtocol;", "", "canStore", "(Lio/ktor/http/URLProtocol;)Z", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "getLOGGER", "()Lorg/slf4j/Logger;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpCacheKt {
    private static final org.slf4j.Logger LOGGER = io.ktor.util.logging.KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpCache");

    public static final org.slf4j.Logger getLOGGER() {
        return LOGGER;
    }

    public static final kotlin.jvm.functions.Function1<java.lang.String, java.lang.String> mergedHeadersLookup(final io.ktor.http.content.OutgoingContent content, final kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> headerExtractor, final kotlin.jvm.functions.Function1<? super java.lang.String, ? extends java.util.List<java.lang.String>> allHeadersExtractor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerExtractor, "headerExtractor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allHeadersExtractor, "allHeadersExtractor");
        return new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.cache.HttpCacheKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.String mergedHeadersLookup$lambda$0;
                mergedHeadersLookup$lambda$0 = io.ktor.client.plugins.cache.HttpCacheKt.mergedHeadersLookup$lambda$0(io.ktor.http.content.OutgoingContent.this, headerExtractor, allHeadersExtractor, (java.lang.String) obj);
                return mergedHeadersLookup$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String mergedHeadersLookup$lambda$0(io.ktor.http.content.OutgoingContent outgoingContent, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, java.lang.String header) {
        java.lang.String contentType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(header, "header");
        if (kotlin.jvm.internal.Intrinsics.areEqual(header, io.ktor.http.HttpHeaders.INSTANCE.getContentLength())) {
            java.lang.Long contentLength = outgoingContent.getContentLength();
            if (contentLength == null || (contentType = contentLength.toString()) == null) {
                return "";
            }
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(header, io.ktor.http.HttpHeaders.INSTANCE.getContentType())) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(header, io.ktor.http.HttpHeaders.INSTANCE.getUserAgent())) {
                    java.lang.String str = outgoingContent.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getUserAgent());
                    if (str != null) {
                        return str;
                    }
                    java.lang.String str2 = (java.lang.String) function1.invoke(io.ktor.http.HttpHeaders.INSTANCE.getUserAgent());
                    return str2 == null ? io.ktor.client.engine.UtilsKt.getKTOR_DEFAULT_USER_AGENT() : str2;
                }
                java.util.List<java.lang.String> all = outgoingContent.getHeaders().getAll(header);
                if (all == null && (all = (java.util.List) function12.invoke(header)) == null) {
                    all = kotlin.collections.CollectionsKt.emptyList();
                }
                return kotlin.collections.CollectionsKt.joinToString$default(all, ";", null, null, 0, null, null, 62, null);
            }
            io.ktor.http.ContentType contentType2 = outgoingContent.getContentType();
            if (contentType2 == null || (contentType = contentType2.toString()) == null) {
                return "";
            }
        }
        return contentType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean canStore(io.ktor.http.URLProtocol uRLProtocol) {
        return kotlin.jvm.internal.Intrinsics.areEqual(uRLProtocol.getName(), androidx.webkit.ProxyConfig.MATCH_HTTP) || kotlin.jvm.internal.Intrinsics.areEqual(uRLProtocol.getName(), "https");
    }
}
