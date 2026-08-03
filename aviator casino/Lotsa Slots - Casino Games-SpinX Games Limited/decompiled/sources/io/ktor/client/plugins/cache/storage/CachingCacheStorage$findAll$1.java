package io.ktor.client.plugins.cache.storage;

/* compiled from: FileCacheStorage.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", i = {0}, l = {57}, m = "findAll", n = {"url"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class CachingCacheStorage$findAll$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.ktor.client.plugins.cache.storage.CachingCacheStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CachingCacheStorage$findAll$1(io.ktor.client.plugins.cache.storage.CachingCacheStorage cachingCacheStorage, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.storage.CachingCacheStorage$findAll$1> continuation) {
        super(continuation);
        this.this$0 = cachingCacheStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.findAll(null, this);
    }
}
