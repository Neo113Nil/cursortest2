package io.ktor.websocket.internals;

/* compiled from: DeflaterUtils.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u000f\u001a\u00020\u000e*\u00020\b2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0011\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Ljava/util/zip/Deflater;", "", "data", "deflateFully", "(Ljava/util/zip/Deflater;[B)[B", "Ljava/util/zip/Inflater;", "inflateFully", "(Ljava/util/zip/Inflater;[B)[B", "Lkotlinx/io/Sink;", "deflater", "Ljava/nio/ByteBuffer;", "buffer", "", "flush", "", "deflateTo", "(Lkotlinx/io/Sink;Ljava/util/zip/Deflater;Ljava/nio/ByteBuffer;Z)I", "PADDED_EMPTY_CHUNK", "[B", "EMPTY_CHUNK", "ktor-websockets"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeflaterUtilsKt {
    private static final byte[] PADDED_EMPTY_CHUNK = {0, 0, 0, -1, -1};
    private static final byte[] EMPTY_CHUNK = {0, 0, -1, -1};

    public static final byte[] deflateFully(java.util.zip.Deflater deflater, byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deflater, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        deflater.setInput(data);
        kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
        kotlinx.io.Buffer buffer2 = buffer;
        io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> ktorDefaultPool = io.ktor.util.cio.ByteBufferPoolKt.getKtorDefaultPool();
        java.nio.ByteBuffer borrow = ktorDefaultPool.borrow();
        try {
            java.nio.ByteBuffer byteBuffer = borrow;
            while (!deflater.needsInput()) {
                deflateTo(buffer2, deflater, byteBuffer, false);
            }
            while (deflateTo(buffer2, deflater, byteBuffer, true) != 0) {
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            ktorDefaultPool.recycle(borrow);
            kotlinx.io.Buffer buffer3 = buffer;
            if (io.ktor.websocket.internals.BytePacketUtilsKt.endsWith(buffer3, PADDED_EMPTY_CHUNK)) {
                byte[] readByteArray = kotlinx.io.SourcesKt.readByteArray(buffer3, ((int) io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(buffer3)) - EMPTY_CHUNK.length);
                buffer3.close();
                return readByteArray;
            }
            kotlinx.io.Buffer buffer4 = new kotlinx.io.Buffer();
            kotlinx.io.Buffer buffer5 = buffer4;
            io.ktor.utils.io.core.BytePacketBuilderKt.writePacket(buffer5, buffer3);
            buffer5.writeByte((byte) 0);
            return kotlinx.io.SourcesKt.readByteArray(buffer4);
        } catch (java.lang.Throwable th) {
            ktorDefaultPool.recycle(borrow);
            throw th;
        }
    }

    public static final byte[] inflateFully(java.util.zip.Inflater inflater, byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        inflater.setInput(kotlin.collections.ArraysKt.plus(data, EMPTY_CHUNK));
        kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
        kotlinx.io.Buffer buffer2 = buffer;
        io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> ktorDefaultPool = io.ktor.util.cio.ByteBufferPoolKt.getKtorDefaultPool();
        java.nio.ByteBuffer borrow = ktorDefaultPool.borrow();
        try {
            java.nio.ByteBuffer byteBuffer = borrow;
            long length = r10.length + inflater.getBytesRead();
            while (inflater.getBytesRead() < length) {
                byteBuffer.clear();
                byteBuffer.position(byteBuffer.position() + inflater.inflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit()));
                byteBuffer.flip();
                io.ktor.utils.io.core.BytePacketBuilderExtensions_jvmKt.writeFully(buffer2, byteBuffer);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            ktorDefaultPool.recycle(borrow);
            return kotlinx.io.SourcesKt.readByteArray(buffer);
        } catch (java.lang.Throwable th) {
            ktorDefaultPool.recycle(borrow);
            throw th;
        }
    }

    private static final int deflateTo(kotlinx.io.Sink sink, java.util.zip.Deflater deflater, java.nio.ByteBuffer byteBuffer, boolean z) {
        int deflate;
        byteBuffer.clear();
        if (z) {
            deflate = deflater.deflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit(), 2);
        } else {
            deflate = deflater.deflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit());
        }
        if (deflate == 0) {
            return 0;
        }
        byteBuffer.position(byteBuffer.position() + deflate);
        byteBuffer.flip();
        io.ktor.utils.io.core.BytePacketBuilderExtensions_jvmKt.writeFully(sink, byteBuffer);
        return deflate;
    }
}
