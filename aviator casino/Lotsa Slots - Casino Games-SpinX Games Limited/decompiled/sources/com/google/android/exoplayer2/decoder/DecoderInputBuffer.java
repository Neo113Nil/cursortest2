package com.google.android.exoplayer2.decoder;

/* loaded from: classes3.dex */
public class DecoderInputBuffer extends com.google.android.exoplayer2.decoder.Buffer {
    public static final int BUFFER_REPLACEMENT_MODE_DIRECT = 2;
    public static final int BUFFER_REPLACEMENT_MODE_DISABLED = 0;
    public static final int BUFFER_REPLACEMENT_MODE_NORMAL = 1;
    private final int bufferReplacementMode;
    public final com.google.android.exoplayer2.decoder.CryptoInfo cryptoInfo;
    public java.nio.ByteBuffer data;
    public com.google.android.exoplayer2.Format format;
    private final int paddingSize;
    public java.nio.ByteBuffer supplementalData;
    public long timeUs;
    public boolean waitingForKeys;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface BufferReplacementMode {
    }

    static {
        com.google.android.exoplayer2.ExoPlayerLibraryInfo.registerModule("goog.exo.decoder");
    }

    public static final class InsufficientCapacityException extends java.lang.IllegalStateException {
        public final int currentCapacity;
        public final int requiredCapacity;

        public InsufficientCapacityException(int i, int i2) {
            super("Buffer too small (" + i + " < " + i2 + ")");
            this.currentCapacity = i;
            this.requiredCapacity = i2;
        }
    }

    public static com.google.android.exoplayer2.decoder.DecoderInputBuffer newNoDataInstance() {
        return new com.google.android.exoplayer2.decoder.DecoderInputBuffer(0);
    }

    public DecoderInputBuffer(int i) {
        this(i, 0);
    }

    public DecoderInputBuffer(int i, int i2) {
        this.cryptoInfo = new com.google.android.exoplayer2.decoder.CryptoInfo();
        this.bufferReplacementMode = i;
        this.paddingSize = i2;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"supplementalData"})
    public void resetSupplementalData(int i) {
        java.nio.ByteBuffer byteBuffer = this.supplementalData;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.supplementalData = java.nio.ByteBuffer.allocate(i);
        } else {
            this.supplementalData.clear();
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"data"})
    public void ensureSpaceForWrite(int i) {
        int i2 = i + this.paddingSize;
        java.nio.ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null) {
            this.data = createReplacementByteBuffer(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.data = byteBuffer;
            return;
        }
        java.nio.ByteBuffer createReplacementByteBuffer = createReplacementByteBuffer(i3);
        createReplacementByteBuffer.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            createReplacementByteBuffer.put(byteBuffer);
        }
        this.data = createReplacementByteBuffer;
    }

    public final boolean isEncrypted() {
        return getFlag(1073741824);
    }

    public final void flip() {
        java.nio.ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        java.nio.ByteBuffer byteBuffer2 = this.supplementalData;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    @Override // com.google.android.exoplayer2.decoder.Buffer
    public void clear() {
        super.clear();
        java.nio.ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        java.nio.ByteBuffer byteBuffer2 = this.supplementalData;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.waitingForKeys = false;
    }

    private java.nio.ByteBuffer createReplacementByteBuffer(int i) {
        int i2 = this.bufferReplacementMode;
        if (i2 == 1) {
            return java.nio.ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return java.nio.ByteBuffer.allocateDirect(i);
        }
        java.nio.ByteBuffer byteBuffer = this.data;
        throw new com.google.android.exoplayer2.decoder.DecoderInputBuffer.InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }
}
