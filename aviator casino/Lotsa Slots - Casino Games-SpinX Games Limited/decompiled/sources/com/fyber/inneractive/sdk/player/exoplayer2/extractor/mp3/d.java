package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

/* loaded from: classes3.dex */
public final class d implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f3961a;
    public final long[] b;
    public final long c;

    public d(long[] jArr, long[] jArr2, long j) {
        this.f3961a = jArr;
        this.b = jArr2;
        this.c = j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b
    public final long b(long j) {
        return this.f3961a[com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.b, j, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j) {
        return this.b[com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.f3961a, j, true)];
    }
}
