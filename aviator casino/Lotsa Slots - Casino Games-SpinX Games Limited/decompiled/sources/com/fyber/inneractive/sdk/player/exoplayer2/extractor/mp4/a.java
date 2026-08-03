package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* loaded from: classes3.dex */
public final class a extends com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c {
    public final long P0;
    public final java.util.ArrayList Q0;
    public final java.util.ArrayList R0;

    public a(int i, long j) {
        super(i);
        this.P0 = j;
        this.Q0 = new java.util.ArrayList();
        this.R0 = new java.util.ArrayList();
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a b(int i) {
        int size = this.R0.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a) this.R0.get(i2);
            if (aVar.f3963a == i) {
                return aVar;
            }
        }
        return null;
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b c(int i) {
        int size = this.Q0.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b) this.Q0.get(i2);
            if (bVar.f3963a == i) {
                return bVar;
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c
    public final java.lang.String toString() {
        return com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.a(this.f3963a) + " leaves: " + java.util.Arrays.toString(this.Q0.toArray()) + " containers: " + java.util.Arrays.toString(this.R0.toArray());
    }
}
