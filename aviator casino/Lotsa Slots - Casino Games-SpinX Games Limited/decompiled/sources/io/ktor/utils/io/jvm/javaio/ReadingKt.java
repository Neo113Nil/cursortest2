package io.ktor.utils.io.jvm.javaio;

/* compiled from: Reading.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u0007¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Ljava/io/InputStream;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "pool", "Lio/ktor/utils/io/ByteReadChannel;", "toByteReadChannel", "(Ljava/io/InputStream;Lkotlin/coroutines/CoroutineContext;Lio/ktor/utils/io/pool/ObjectPool;)Lio/ktor/utils/io/ByteReadChannel;", "", "toByteReadChannelWithArrayPool", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReadingKt {
    public static /* synthetic */ io.ktor.utils.io.ByteReadChannel toByteReadChannel$default(java.io.InputStream inputStream, kotlin.coroutines.CoroutineContext coroutineContext, io.ktor.utils.io.pool.ObjectPool objectPool, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getIO();
        }
        return toByteReadChannel(inputStream, coroutineContext, objectPool);
    }

    public static final io.ktor.utils.io.ByteReadChannel toByteReadChannel(java.io.InputStream inputStream, kotlin.coroutines.CoroutineContext context, io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> pool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pool, "pool");
        return new io.ktor.utils.io.jvm.javaio.RawSourceChannel(kotlinx.io.JvmCoreKt.asSource(inputStream), context);
    }

    public static /* synthetic */ io.ktor.utils.io.ByteReadChannel toByteReadChannelWithArrayPool$default(java.io.InputStream inputStream, kotlin.coroutines.CoroutineContext coroutineContext, io.ktor.utils.io.pool.ObjectPool objectPool, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getIO();
        }
        if ((i & 2) != 0) {
            objectPool = io.ktor.utils.io.pool.ByteArrayPoolKt.getByteArrayPool();
        }
        return toByteReadChannelWithArrayPool(inputStream, coroutineContext, objectPool);
    }

    public static final io.ktor.utils.io.ByteReadChannel toByteReadChannelWithArrayPool(java.io.InputStream inputStream, kotlin.coroutines.CoroutineContext context, io.ktor.utils.io.pool.ObjectPool<byte[]> pool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pool, "pool");
        return new io.ktor.utils.io.jvm.javaio.RawSourceChannel(kotlinx.io.JvmCoreKt.asSource(inputStream), context);
    }
}
