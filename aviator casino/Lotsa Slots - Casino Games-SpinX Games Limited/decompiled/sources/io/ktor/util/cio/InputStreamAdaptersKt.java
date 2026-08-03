package io.ktor.util.cio;

/* compiled from: InputStreamAdapters.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\t\u001a\u00020\b*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ljava/io/InputStream;", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "pool", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/Job;", "parent", "Lio/ktor/utils/io/ByteReadChannel;", "toByteReadChannel", "(Ljava/io/InputStream;Lio/ktor/utils/io/pool/ObjectPool;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/Job;)Lio/ktor/utils/io/ByteReadChannel;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InputStreamAdaptersKt {
    public static /* synthetic */ io.ktor.utils.io.ByteReadChannel toByteReadChannel$default(java.io.InputStream inputStream, io.ktor.utils.io.pool.ObjectPool objectPool, kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.Job job, int i, java.lang.Object obj) {
        kotlinx.coroutines.CompletableJob Job$default;
        if ((i & 1) != 0) {
            objectPool = io.ktor.util.cio.ByteBufferPoolKt.getKtorDefaultPool();
        }
        if ((i & 2) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        if ((i & 4) != 0) {
            Job$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
            job = Job$default;
        }
        return toByteReadChannel(inputStream, objectPool, coroutineContext, job);
    }

    @kotlin.Deprecated(message = "Use variant from 'ktor-io' module instead", replaceWith = @kotlin.ReplaceWith(expression = "this.toByteReadChannel(context + parent, pool)", imports = {"io.ktor.utils.io.jvm.javaio.toByteReadChannel"}))
    public static final io.ktor.utils.io.ByteReadChannel toByteReadChannel(java.io.InputStream inputStream, io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> pool, kotlin.coroutines.CoroutineContext context, kotlinx.coroutines.Job parent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pool, "pool");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parent, "parent");
        return io.ktor.utils.io.jvm.javaio.ReadingKt.toByteReadChannel(inputStream, context.plus(parent), pool);
    }
}
