package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001e\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\"\u001a\u00020\u001f8G¢\u0006\u0006\u001a\u0004\b \u0010!"}, d2 = {"Lio/ktor/websocket/Serializer;", "", "<init>", "()V", "Lio/ktor/websocket/Frame;", "f", "", "enqueue", "(Lio/ktor/websocket/Frame;)V", "Ljava/nio/ByteBuffer;", "buffer", "serialize", "(Ljava/nio/ByteBuffer;)V", "Ljava/util/concurrent/ArrayBlockingQueue;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/ArrayBlockingQueue;", "getHighSpeedVideoSizes", "Ljava/nio/ByteBuffer;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lio/ktor/websocket/FrameType;", "Lio/ktor/websocket/FrameType;", "", "masking", "Z", "getMasking", "()Z", "setMasking", "(Z)V", "getHasOutstandingBytes", "hasOutstandingBytes", "", "getRemainingCapacity", "()I", "remainingCapacity"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Serializer {
    private java.nio.ByteBuffer Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.concurrent.ArrayBlockingQueue<io.ktor.websocket.Frame> getHighSpeedVideoSizes = new java.util.concurrent.ArrayBlockingQueue<>(1024);

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private io.ktor.websocket.FrameType getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.nio.ByteBuffer getHighSpeedVideoFpsRanges;
    private boolean masking;

    public final boolean getMasking() {
        return this.masking;
    }

    public final void setMasking(boolean z) {
        this.masking = z;
    }

    public final boolean getHasOutstandingBytes() {
        return (this.getHighSpeedVideoSizes.isEmpty() && this.getHighSpeedVideoFpsRanges == null) ? false : true;
    }

    public final int getRemainingCapacity() {
        return this.getHighSpeedVideoSizes.remainingCapacity();
    }

    public final void enqueue(io.ktor.websocket.Frame f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f, "");
        this.getHighSpeedVideoSizes.put(f);
    }

    public final void serialize(java.nio.ByteBuffer buffer) {
        java.nio.ByteBuffer byteBuffer;
        int opcode;
        java.nio.ByteBuffer duplicate;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        while (true) {
            java.nio.ByteBuffer byteBuffer2 = this.getHighSpeedVideoFpsRanges;
            if (byteBuffer2 != null) {
                io.ktor.util.NIOKt.moveTo$default(byteBuffer2, buffer, 0, 2, null);
                if (byteBuffer2.hasRemaining()) {
                    return;
                } else {
                    this.getHighSpeedVideoFpsRanges = null;
                }
            }
            io.ktor.websocket.Frame peek = this.getHighSpeedVideoSizes.peek();
            if (peek == null) {
                return;
            }
            boolean z = this.masking;
            if (z) {
                byteBuffer = java.nio.ByteBuffer.allocate(4);
                byteBuffer.putInt(kotlin.random.Random.INSTANCE.nextInt());
                byteBuffer.clear();
            } else {
                byteBuffer = null;
            }
            this.Camera2StreamConfigurationMap = byteBuffer;
            int remaining = peek.getBuffer().remaining();
            if (buffer.remaining() < (remaining < 126 ? 2 : remaining <= 32767 ? 4 : 10) + (z ? 4 : 0)) {
                return;
            }
            int remaining2 = peek.getBuffer().remaining();
            if (remaining2 >= 126) {
                remaining2 = remaining2 <= 65535 ? 126 : 127;
            }
            io.ktor.websocket.FrameType frameType = this.getHighResolutionOutputSizeshNQ4ISI;
            if (frameType == null) {
                if (!peek.getFin()) {
                    this.getHighResolutionOutputSizeshNQ4ISI = peek.getFrameType();
                }
                opcode = peek.getFrameType().getOpcode();
            } else if (frameType == peek.getFrameType()) {
                if (peek.getFin()) {
                    this.getHighResolutionOutputSizeshNQ4ISI = null;
                }
                opcode = 0;
            } else {
                if (!peek.getFrameType().getControlFrame()) {
                    throw new java.lang.IllegalStateException("Can't continue with different data frame opcode");
                }
                opcode = peek.getFrameType().getOpcode();
            }
            buffer.put((byte) (opcode | (peek.getFin() ? 128 : 0) | (peek.getRsv1() ? 64 : 0) | (peek.getRsv2() ? 32 : 0) | (peek.getRsv3() ? 16 : 0)));
            buffer.put((byte) ((z ? 128 : 0) | remaining2));
            if (remaining2 == 126) {
                buffer.putShort((short) peek.getBuffer().remaining());
            } else if (remaining2 == 127) {
                buffer.putLong(peek.getBuffer().remaining());
            }
            java.nio.ByteBuffer byteBuffer3 = this.Camera2StreamConfigurationMap;
            if (byteBuffer3 != null && (duplicate = byteBuffer3.duplicate()) != null) {
                io.ktor.util.NIOKt.moveTo$default(duplicate, buffer, 0, 2, null);
            }
            this.getHighSpeedVideoSizes.remove();
            java.nio.ByteBuffer buffer2 = peek.getBuffer();
            java.nio.ByteBuffer byteBuffer4 = this.Camera2StreamConfigurationMap;
            if (byteBuffer4 != null) {
                java.nio.ByteBuffer copy$default = io.ktor.util.NIOKt.copy$default(buffer2, 0, 1, null);
                io.ktor.websocket.UtilsKt.xor(copy$default, byteBuffer4);
                if (copy$default != null) {
                    buffer2 = copy$default;
                }
            }
            this.getHighSpeedVideoFpsRanges = buffer2;
        }
    }
}
