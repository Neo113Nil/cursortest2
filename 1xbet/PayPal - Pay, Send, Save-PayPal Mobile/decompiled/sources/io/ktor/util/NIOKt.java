package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a)\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00112\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0013"}, d2 = {"Ljava/nio/ByteBuffer;", "destination", "", "limit", "moveTo", "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)I", "", "moveToByteArray", "(Ljava/nio/ByteBuffer;)[B", "Ljava/nio/charset/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "", "decodeString", "(Ljava/nio/ByteBuffer;Ljava/nio/charset/Charset;)Ljava/lang/String;", io.ktor.http.ContentDisposition.Parameters.Size, "copy", "(Ljava/nio/ByteBuffer;I)Ljava/nio/ByteBuffer;", "Lio/ktor/utils/io/pool/ObjectPool;", "pool", "(Ljava/nio/ByteBuffer;Lio/ktor/utils/io/pool/ObjectPool;I)Ljava/nio/ByteBuffer;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class NIOKt {
    public static /* synthetic */ int moveTo$default(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        return moveTo(byteBuffer, byteBuffer2, i);
    }

    public static final int moveTo(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer2, "");
        int min = java.lang.Math.min(i, java.lang.Math.min(byteBuffer.remaining(), byteBuffer2.remaining()));
        if (min == byteBuffer.remaining()) {
            byteBuffer2.put(byteBuffer);
            return min;
        }
        int limit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer2.put(byteBuffer);
        byteBuffer.limit(limit);
        return min;
    }

    public static final byte[] moveToByteArray(java.nio.ByteBuffer byteBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "");
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static /* synthetic */ java.lang.String decodeString$default(java.nio.ByteBuffer byteBuffer, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        return decodeString(byteBuffer, charset);
    }

    public static final java.lang.String decodeString(java.nio.ByteBuffer byteBuffer, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
        java.lang.String obj = charset.decode(byteBuffer).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public static /* synthetic */ java.nio.ByteBuffer copy$default(java.nio.ByteBuffer byteBuffer, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = byteBuffer.remaining();
        }
        return copy(byteBuffer, i);
    }

    public static final java.nio.ByteBuffer copy(java.nio.ByteBuffer byteBuffer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "");
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(i);
        java.nio.ByteBuffer slice = byteBuffer.slice();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(slice, "");
        kotlin.jvm.internal.Intrinsics.checkNotNull(allocate);
        moveTo$default(slice, allocate, 0, 2, null);
        allocate.clear();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(allocate, "");
        return allocate;
    }

    public static final java.nio.ByteBuffer copy(java.nio.ByteBuffer byteBuffer, io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> objectPool, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectPool, "");
        java.nio.ByteBuffer borrow = objectPool.borrow();
        borrow.limit(i);
        java.nio.ByteBuffer slice = byteBuffer.slice();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(slice, "");
        moveTo$default(slice, borrow, 0, 2, null);
        borrow.flip();
        return borrow;
    }

    public static /* synthetic */ java.nio.ByteBuffer copy$default(java.nio.ByteBuffer byteBuffer, io.ktor.utils.io.pool.ObjectPool objectPool, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = byteBuffer.remaining();
        }
        return copy(byteBuffer, objectPool, i);
    }
}
