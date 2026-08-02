package io.ktor.util.cio;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0014\u0010\u0001\u001a\u00020\u00008\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00008\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\" \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"", "DEFAULT_BUFFER_SIZE", com.visa.cbp.getEncExpo.warmup, "DEFAULT_KTOR_POOL_SIZE", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "KtorDefaultPool", "Lio/ktor/utils/io/pool/ObjectPool;", "getKtorDefaultPool", "()Lio/ktor/utils/io/pool/ObjectPool;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ByteBufferPoolKt {
    public static final int DEFAULT_BUFFER_SIZE = 4098;
    public static final int DEFAULT_KTOR_POOL_SIZE = 2048;
    private static final io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> KtorDefaultPool = new io.ktor.utils.io.pool.ByteBufferPool(2048, 4098);

    public static final io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> getKtorDefaultPool() {
        return KtorDefaultPool;
    }
}
