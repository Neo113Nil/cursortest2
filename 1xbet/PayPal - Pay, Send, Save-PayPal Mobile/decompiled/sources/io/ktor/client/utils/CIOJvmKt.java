package io.ktor.client.utils;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0017\u0010\u0001\u001a\u00020\u00008\u0007¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/ktor/utils/io/pool/ByteBufferPool;", "HttpClientDefaultPool", "Lio/ktor/utils/io/pool/ByteBufferPool;", "getHttpClientDefaultPool", "()Lio/ktor/utils/io/pool/ByteBufferPool;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CIOJvmKt {
    private static final io.ktor.utils.io.pool.ByteBufferPool HttpClientDefaultPool = new io.ktor.utils.io.pool.ByteBufferPool(0, 0, 3, null);

    public static final io.ktor.utils.io.pool.ByteBufferPool getHttpClientDefaultPool() {
        return HttpClientDefaultPool;
    }
}
