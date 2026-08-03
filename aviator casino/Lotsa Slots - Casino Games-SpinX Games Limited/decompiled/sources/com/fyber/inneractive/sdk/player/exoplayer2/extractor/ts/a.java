package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* loaded from: classes3.dex */
public final class a implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {
    public static final int e = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("ID3");

    /* renamed from: a, reason: collision with root package name */
    public final long f3996a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(2786);
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b c;
    public boolean d;

    public a(long j) {
        this.f3996a = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r11.e = 0;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
    
        if ((r4 - r3) < 8192) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003b, code lost:
    
        return false;
     */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        int a2;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(10);
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
            while (true) {
                bVar.a(nVar.f4112a, 0, 5, false);
                nVar.e(0);
                if (nVar.o() != 2935) {
                    break;
                }
                i4++;
                if (i4 >= 4) {
                    return true;
                }
                byte[] bArr = nVar.f4112a;
                if (bArr.length < 5) {
                    a2 = -1;
                } else {
                    byte b = bArr[4];
                    a2 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.a((b & 192) >> 6, b & 63);
                }
                if (a2 == -1) {
                    return false;
                }
                bVar.a(a2 - 5, false);
            }
            bVar.a(i3, false);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b bVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b(null);
        this.c = bVar;
        bVar.d = "0";
        bVar.e = jVar.a(0, 1);
        jVar.b();
        jVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j, long j2) {
        this.d = false;
        this.c.a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) {
        int min;
        byte[] bArr = this.b.f4112a;
        int i = bVar.f;
        if (i == 0) {
            min = 0;
        } else {
            min = java.lang.Math.min(i, 2786);
            java.lang.System.arraycopy(bVar.d, 0, bArr, 0, min);
            bVar.b(min);
        }
        if (min == 0) {
            min = bVar.a(bArr, 0, 2786, 0, true);
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
            this.c.l = this.f3996a;
            this.d = true;
        }
        this.c.a(this.b);
        return 0;
    }
}
