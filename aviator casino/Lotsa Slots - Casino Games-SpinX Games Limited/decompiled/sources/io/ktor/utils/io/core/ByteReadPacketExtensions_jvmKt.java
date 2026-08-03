package io.ktor.utils.io.core;

/* compiled from: ByteReadPacketExtensions.jvm.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\u000e\u001a\u00020\t*\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ljava/nio/ByteBuffer;", "byteBuffer", "Lkotlinx/io/Source;", "ByteReadPacket", "(Ljava/nio/ByteBuffer;)Lkotlinx/io/Source;", "buffer", "", "readAvailable", "(Lkotlinx/io/Source;Ljava/nio/ByteBuffer;)I", "", "readFully", "(Lkotlinx/io/Source;Ljava/nio/ByteBuffer;)V", "Lkotlin/Function1;", "block", "read", "(Lkotlinx/io/Source;Lkotlin/jvm/functions/Function1;)V", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ByteReadPacketExtensions_jvmKt {
    public static final kotlinx.io.Source ByteReadPacket(java.nio.ByteBuffer byteBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
        kotlinx.io.SinksJvmKt.write(buffer, byteBuffer);
        return buffer;
    }

    public static final int readAvailable(kotlinx.io.Source source, java.nio.ByteBuffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        int remaining = buffer.remaining();
        kotlinx.io.SourcesJvmKt.readAtMostTo(source, buffer);
        return remaining - buffer.remaining();
    }

    public static final void readFully(kotlinx.io.Source source, java.nio.ByteBuffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        while (!source.exhausted() && buffer.hasRemaining()) {
            kotlinx.io.SourcesJvmKt.readAtMostTo(source, buffer);
        }
    }

    public static final void read(kotlinx.io.Source source, kotlin.jvm.functions.Function1<? super java.nio.ByteBuffer, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
        kotlinx.io.Buffer buffer = source.getBuffer();
        if (!(!buffer.exhausted())) {
            throw new java.lang.IllegalArgumentException("Buffer is empty".toString());
        }
        kotlinx.io.Segment head = buffer.getHead();
        kotlin.jvm.internal.Intrinsics.checkNotNull(head);
        byte[] dataAsByteArray = head.dataAsByteArray(true);
        int pos = head.getPos();
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(dataAsByteArray, pos, head.getLimit() - pos);
        kotlin.jvm.internal.Intrinsics.checkNotNull(wrap);
        block.invoke(wrap);
        int position = wrap.position() - pos;
        if (position != 0) {
            if (position < 0) {
                throw new java.lang.IllegalStateException("Returned negative read bytes count");
            }
            if (position > head.getSize()) {
                throw new java.lang.IllegalStateException("Returned too many bytes");
            }
            buffer.skip(position);
        }
    }
}
