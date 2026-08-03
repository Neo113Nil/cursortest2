package io.ktor.client.plugins.cache;

/* compiled from: HttpCacheLegacy.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cache.HttpCacheLegacyKt", f = "HttpCacheLegacy.kt", i = {}, l = {120}, m = "cacheResponse", n = {}, s = {})
/* loaded from: classes6.dex */
final class HttpCacheLegacyKt$cacheResponse$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;

    HttpCacheLegacyKt$cacheResponse$1(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.HttpCacheLegacyKt$cacheResponse$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object cacheResponse;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        cacheResponse = io.ktor.client.plugins.cache.HttpCacheLegacyKt.cacheResponse(null, null, this);
        return cacheResponse;
    }
}
