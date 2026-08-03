package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

/* loaded from: classes3.dex */
public final class c extends com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a {
    public byte[] i;
    public int j;
    public volatile boolean k;
    public final java.lang.String l;
    public byte[] m;

    public c(com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i, java.lang.Object obj, byte[] bArr, java.lang.String str) {
        super(3, i, -9223372036854775807L, -9223372036854775807L, oVar, hVar, kVar, obj);
        this.i = bArr;
        this.l = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final boolean a() {
        return this.k;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void b() {
        this.k = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a
    public final long c() {
        return this.j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void load() {
        try {
            this.h.a(this.f4050a);
            this.j = 0;
            while (!this.k) {
                byte[] bArr = this.i;
                if (bArr == null) {
                    this.i = new byte[16384];
                } else if (bArr.length < this.j + 16384) {
                    this.i = java.util.Arrays.copyOf(bArr, bArr.length + 16384);
                }
                int read = this.h.read(this.i, this.j, 16384);
                if (read != -1) {
                    this.j += read;
                }
                if (read == -1) {
                    break;
                }
            }
            if (!this.k) {
                this.m = java.util.Arrays.copyOf(this.i, this.j);
            }
        } finally {
            com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.h);
        }
    }
}
