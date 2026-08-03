package io.ktor.client.plugins.cache.storage;

/* compiled from: FileCacheStorage.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCacheUnsafe$2$1$1", f = "FileCacheStorage.kt", i = {}, l = {151, 153}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class FileCacheStorage$writeCacheUnsafe$2$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.List<io.ktor.client.plugins.cache.storage.CachedResponseData> $caches;
    final /* synthetic */ io.ktor.utils.io.ByteChannel $channel;
    java.lang.Object L$0;
    int label;
    final /* synthetic */ io.ktor.client.plugins.cache.storage.FileCacheStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileCacheStorage$writeCacheUnsafe$2$1$1(io.ktor.utils.io.ByteChannel byteChannel, java.util.List<io.ktor.client.plugins.cache.storage.CachedResponseData> list, io.ktor.client.plugins.cache.storage.FileCacheStorage fileCacheStorage, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCacheUnsafe$2$1$1> continuation) {
        super(2, continuation);
        this.$channel = byteChannel;
        this.$caches = list;
        this.this$0 = fileCacheStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCacheUnsafe$2$1$1(this.$channel, this.$caches, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCacheUnsafe$2$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Iterator<io.ktor.client.plugins.cache.storage.CachedResponseData> it;
        java.lang.Object writeCache;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeInt(this.$channel, this.$caches.size(), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (java.util.Iterator) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                while (it.hasNext()) {
                    io.ktor.client.plugins.cache.storage.CachedResponseData next = it.next();
                    this.L$0 = it;
                    this.label = 2;
                    writeCache = this.this$0.writeCache(this.$channel, next, this);
                    if (writeCache == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.$channel.close();
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        it = this.$caches.iterator();
        while (it.hasNext()) {
        }
        this.$channel.close();
        return kotlin.Unit.INSTANCE;
    }
}
