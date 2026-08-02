package androidx.camera.core.internal;

/* loaded from: classes6.dex */
public final class ByteBufferOutputStream extends java.io.OutputStream {
    private final java.nio.ByteBuffer Camera2StreamConfigurationMap;

    public ByteBufferOutputStream(java.nio.ByteBuffer byteBuffer) {
        this.Camera2StreamConfigurationMap = byteBuffer;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws java.io.IOException {
        if (!this.Camera2StreamConfigurationMap.hasRemaining()) {
            throw new java.io.EOFException("Output ByteBuffer has no bytes remaining.");
        }
        this.Camera2StreamConfigurationMap.put((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return;
        }
        if (this.Camera2StreamConfigurationMap.remaining() < i2) {
            throw new java.io.EOFException("Output ByteBuffer has insufficient bytes remaining.");
        }
        this.Camera2StreamConfigurationMap.put(bArr, i, i2);
    }
}
