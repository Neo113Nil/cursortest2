package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* loaded from: classes3.dex */
public final class h implements com.fyber.inneractive.sdk.player.exoplayer2.source.w {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.w[] f4054a;

    public h(com.fyber.inneractive.sdk.player.exoplayer2.source.w[] wVarArr) {
        this.f4054a = wVarArr;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final boolean b(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long f = f();
            if (f == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (com.fyber.inneractive.sdk.player.exoplayer2.source.w wVar : this.f4054a) {
                if (wVar.f() == f) {
                    z |= wVar.b(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final long f() {
        long j = Long.MAX_VALUE;
        for (com.fyber.inneractive.sdk.player.exoplayer2.source.w wVar : this.f4054a) {
            long f = wVar.f();
            if (f != Long.MIN_VALUE) {
                j = java.lang.Math.min(j, f);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }
}
