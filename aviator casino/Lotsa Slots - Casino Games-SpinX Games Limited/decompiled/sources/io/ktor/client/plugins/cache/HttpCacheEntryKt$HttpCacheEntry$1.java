package io.ktor.client.plugins.cache;

/* compiled from: HttpCacheEntry.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cache.HttpCacheEntryKt", f = "HttpCacheEntry.kt", i = {0, 0}, l = {18}, m = "HttpCacheEntry", n = {com.ironsource.Ve.n, "isShared"}, s = {"L$0", "Z$0"})
/* loaded from: classes6.dex */
final class HttpCacheEntryKt$HttpCacheEntry$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ java.lang.Object result;

    HttpCacheEntryKt$HttpCacheEntry$1(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.HttpCacheEntryKt$HttpCacheEntry$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return io.ktor.client.plugins.cache.HttpCacheEntryKt.HttpCacheEntry(false, null, this);
    }
}
