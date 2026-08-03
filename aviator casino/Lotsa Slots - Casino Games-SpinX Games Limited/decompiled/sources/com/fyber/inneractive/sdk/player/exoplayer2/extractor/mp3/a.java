package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

/* loaded from: classes3.dex */
public final class a implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b {

    /* renamed from: a, reason: collision with root package name */
    public final long f3959a;
    public final int b;
    public final long c;

    public a(int i, long j, long j2) {
        this.f3959a = j;
        this.b = i;
        this.c = j2 == -1 ? -9223372036854775807L : b(j2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return this.c != -9223372036854775807L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b
    public final long b(long j) {
        return (java.lang.Math.max(0L, j - this.f3959a) * 8000000) / this.b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j) {
        long j2 = this.c;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        int i = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a;
        return ((java.lang.Math.max(0L, java.lang.Math.min(j, j2)) * this.b) / 8000000) + this.f3959a;
    }
}
