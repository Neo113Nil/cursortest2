package io.ktor.client.plugins.cache.storage;

import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FileCacheStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCacheUnsafe$2$1$1", f = "FileCacheStorage.kt", i = {}, l = {151, 153}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class FileCacheStorage$writeCacheUnsafe$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<CachedResponseData> $caches;
    final /* synthetic */ ByteChannel $channel;
    Object L$0;
    int label;
    final /* synthetic */ FileCacheStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileCacheStorage$writeCacheUnsafe$2$1$1(ByteChannel byteChannel, List<CachedResponseData> list, FileCacheStorage fileCacheStorage, Continuation<? super FileCacheStorage$writeCacheUnsafe$2$1$1> continuation) {
        super(2, continuation);
        this.$channel = byteChannel;
        this.$caches = list;
        this.this$0 = fileCacheStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileCacheStorage$writeCacheUnsafe$2$1$1(this.$channel, this.$caches, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileCacheStorage$writeCacheUnsafe$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator<CachedResponseData> it;
        Object writeCache;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (ByteWriteChannelOperationsKt.writeInt(this.$channel, this.$caches.size(), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$0;
                ResultKt.throwOnFailure(obj);
                while (it.hasNext()) {
                    CachedResponseData next = it.next();
                    this.L$0 = it;
                    this.label = 2;
                    writeCache = this.this$0.writeCache(this.$channel, next, this);
                    if (writeCache == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.$channel.close();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        it = this.$caches.iterator();
        while (it.hasNext()) {
        }
        this.$channel.close();
        return Unit.INSTANCE;
    }
}
