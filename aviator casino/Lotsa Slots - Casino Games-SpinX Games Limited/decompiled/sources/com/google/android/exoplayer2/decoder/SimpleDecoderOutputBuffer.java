package com.google.android.exoplayer2.decoder;

/* loaded from: classes3.dex */
public class SimpleDecoderOutputBuffer extends com.google.android.exoplayer2.decoder.DecoderOutputBuffer {
    public java.nio.ByteBuffer data;
    private final com.google.android.exoplayer2.decoder.DecoderOutputBuffer.Owner<com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer> owner;

    public SimpleDecoderOutputBuffer(com.google.android.exoplayer2.decoder.DecoderOutputBuffer.Owner<com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer> owner) {
        this.owner = owner;
    }

    public java.nio.ByteBuffer init(long j, int i) {
        this.timeUs = j;
        java.nio.ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.data = java.nio.ByteBuffer.allocateDirect(i).order(java.nio.ByteOrder.nativeOrder());
        }
        this.data.position(0);
        this.data.limit(i);
        return this.data;
    }

    @Override // com.google.android.exoplayer2.decoder.Buffer
    public void clear() {
        super.clear();
        java.nio.ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    @Override // com.google.android.exoplayer2.decoder.DecoderOutputBuffer
    public void release() {
        this.owner.releaseOutputBuffer(this);
    }
}
