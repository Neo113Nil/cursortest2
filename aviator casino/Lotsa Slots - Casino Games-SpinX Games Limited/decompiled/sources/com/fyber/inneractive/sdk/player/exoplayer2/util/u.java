package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* loaded from: classes3.dex */
public final class u implements com.fyber.inneractive.sdk.player.exoplayer2.util.h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4117a;
    public long b;
    public long c;
    public com.fyber.inneractive.sdk.player.exoplayer2.s d = com.fyber.inneractive.sdk.player.exoplayer2.s.d;

    public final void a(long j) {
        this.b = j;
        if (this.f4117a) {
            this.c = android.os.SystemClock.elapsedRealtime();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final long b() {
        long j = this.b;
        if (!this.f4117a) {
            return j;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.c;
        if (this.d.f4046a != 1.0f) {
            return j + (elapsedRealtime * r4.c);
        }
        int i = com.fyber.inneractive.sdk.player.exoplayer2.b.f3917a;
        return j + (elapsedRealtime != -9223372036854775807L ? 1000 * elapsedRealtime : -9223372036854775807L);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.s a(com.fyber.inneractive.sdk.player.exoplayer2.s sVar) {
        if (this.f4117a) {
            a(b());
        }
        this.d = sVar;
        return sVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.s a() {
        return this.d;
    }
}
