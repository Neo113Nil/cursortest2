package io.ktor.utils.io.pool;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\"\u001d\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/utils/io/pool/ObjectPool;", "", "ByteArrayPool", "Lio/ktor/utils/io/pool/ObjectPool;", "getByteArrayPool", "()Lio/ktor/utils/io/pool/ObjectPool;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ByteArrayPoolKt {
    private static final io.ktor.utils.io.pool.ObjectPool<byte[]> ByteArrayPool = new io.ktor.utils.io.pool.DefaultPool<byte[]>() { // from class: io.ktor.utils.io.pool.ByteArrayPoolKt$ByteArrayPool$1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.ktor.utils.io.pool.DefaultPool
        public final byte[] produceInstance() {
            return new byte[4096];
        }
    };

    public static final io.ktor.utils.io.pool.ObjectPool<byte[]> getByteArrayPool() {
        return ByteArrayPool;
    }
}
