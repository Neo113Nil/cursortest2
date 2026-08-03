package com.google.android.exoplayer2.decoder;

/* loaded from: classes3.dex */
public abstract class DecoderOutputBuffer extends com.google.android.exoplayer2.decoder.Buffer {
    public int skippedOutputBufferCount;
    public long timeUs;

    public interface Owner<S extends com.google.android.exoplayer2.decoder.DecoderOutputBuffer> {
        void releaseOutputBuffer(S s);
    }

    public abstract void release();
}
