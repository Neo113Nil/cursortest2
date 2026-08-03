package com.google.android.exoplayer2.source.chunk;

/* loaded from: classes3.dex */
public final class ChunkHolder {
    public com.google.android.exoplayer2.source.chunk.Chunk chunk;
    public boolean endOfStream;

    public void clear() {
        this.chunk = null;
        this.endOfStream = false;
    }
}
