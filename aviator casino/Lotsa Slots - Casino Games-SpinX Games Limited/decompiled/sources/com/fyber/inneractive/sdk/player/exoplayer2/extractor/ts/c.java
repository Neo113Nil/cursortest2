package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* loaded from: classes3.dex */
public final class c implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {
    public static final int e = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("ID3");

    /* renamed from: a, reason: collision with root package name */
    public final long f4000a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(200);
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.d c;
    public boolean d;

    public c(long j) {
        this.f4000a = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        r11.e = 0;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if ((r5 - r4) < 8192) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
    
        return false;
     */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(10);
        com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(nVar.f4112a);
        int i = 0;
        while (true) {
            bVar.a(nVar.f4112a, 0, 10, false);
            nVar.e(0);
            if (nVar.l() != e) {
                break;
            }
            nVar.e(nVar.b + 3);
            int i2 = nVar.i();
            i += i2 + 10;
            bVar.a(i2, false);
        }
        bVar.e = 0;
        bVar.a(i, false);
        int i3 = i;
        while (true) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                bVar.a(nVar.f4112a, 0, 2, false);
                nVar.e(0);
                if ((nVar.o() & 65526) != 65520) {
                    break;
                }
                i4++;
                if (i4 >= 4 && i5 > 188) {
                    return true;
                }
                bVar.a(nVar.f4112a, 0, 4, false);
                mVar.b(14);
                int a2 = mVar.a(13);
                if (a2 <= 6) {
                    return false;
                }
                bVar.a(a2 - 6, false);
                i5 += a2;
            }
            bVar.a(i3, false);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.d dVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.d(true, null);
        this.c = dVar;
        dVar.a(jVar, new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.e0(Integer.MIN_VALUE, 0, 1));
        jVar.b();
        jVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j, long j2) {
        this.d = false;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.d dVar = this.c;
        dVar.h = 0;
        dVar.i = 0;
        dVar.j = 256;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) {
        int min;
        byte[] bArr = this.b.f4112a;
        int i = bVar.f;
        if (i == 0) {
            min = 0;
        } else {
            min = java.lang.Math.min(i, 200);
            java.lang.System.arraycopy(bVar.d, 0, bArr, 0, min);
            bVar.b(min);
        }
        if (min == 0) {
            min = bVar.a(bArr, 0, 200, 0, true);
        }
        if (min != -1) {
            bVar.c += min;
        }
        if (min == -1) {
            return -1;
        }
        this.b.e(0);
        this.b.d(min);
        if (!this.d) {
            this.c.o = this.f4000a;
            this.d = true;
        }
        this.c.a(this.b);
        return 0;
    }
}
