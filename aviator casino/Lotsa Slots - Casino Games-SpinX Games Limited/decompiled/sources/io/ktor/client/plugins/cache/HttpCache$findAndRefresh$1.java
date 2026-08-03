package io.ktor.client.plugins.cache;

/* compiled from: HttpCache.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cache.HttpCache", f = "HttpCache.kt", i = {0, 0, 0, 1, 1, 1}, l = {343, 344}, m = "findAndRefresh", n = {"request", com.ironsource.Ve.n, com.ironsource.X3.a.k, "request", com.ironsource.Ve.n, "cache"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
final class HttpCache$findAndRefresh$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.ktor.client.plugins.cache.HttpCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpCache$findAndRefresh$1(io.ktor.client.plugins.cache.HttpCache httpCache, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.HttpCache$findAndRefresh$1> continuation) {
        super(continuation);
        this.this$0 = httpCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object findAndRefresh;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        findAndRefresh = this.this$0.findAndRefresh(null, null, this);
        return findAndRefresh;
    }
}
