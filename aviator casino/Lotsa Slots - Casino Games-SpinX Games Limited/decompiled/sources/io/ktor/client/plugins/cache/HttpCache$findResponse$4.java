package io.ktor.client.plugins.cache;

/* compiled from: HttpCache.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cache.HttpCache", f = "HttpCache.kt", i = {0, 0, 1}, l = {370, 370}, m = "findResponse", n = {"url", "lookup", "lookup"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes6.dex */
final class HttpCache$findResponse$4 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.ktor.client.plugins.cache.HttpCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpCache$findResponse$4(io.ktor.client.plugins.cache.HttpCache httpCache, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.HttpCache$findResponse$4> continuation) {
        super(continuation);
        this.this$0 = httpCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object findResponse;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        findResponse = this.this$0.findResponse(null, null, this);
        return findResponse;
    }
}
