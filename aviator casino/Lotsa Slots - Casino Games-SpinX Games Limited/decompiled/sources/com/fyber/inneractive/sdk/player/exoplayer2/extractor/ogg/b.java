package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

/* loaded from: classes3.dex */
public final class b implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.g f3984a = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.g();
    public final long b;
    public final long c;
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    public b(long j, long j2, com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l lVar, int i, long j3) {
        if (j < 0 || j2 <= j) {
            throw new java.lang.IllegalArgumentException();
        }
        this.d = lVar;
        this.b = j;
        this.c = j2;
        if (i != j2 - j) {
            this.e = 0;
        } else {
            this.f = j3;
            this.e = 3;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.g gVar;
        long j;
        int i = this.e;
        long j2 = 0;
        if (i == 0) {
            long j3 = bVar.c;
            this.g = j3;
            this.e = 1;
            long j4 = this.c - 65307;
            if (j4 > j3) {
                return j4;
            }
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return -1L;
                }
                throw new java.lang.IllegalStateException();
            }
            long j5 = this.h;
            if (j5 != 0) {
                long j6 = this.i;
                long j7 = this.j;
                if (j6 == j7) {
                    j = -(this.k + 2);
                } else {
                    long j8 = bVar.c;
                    if (a(bVar, j7)) {
                        this.f3984a.a(bVar, false);
                        bVar.e = 0;
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.g gVar2 = this.f3984a;
                        long j9 = gVar2.b;
                        long j10 = j5 - j9;
                        int i2 = gVar2.d + gVar2.e;
                        if (j10 < 0 || j10 > 72000) {
                            if (j10 < 0) {
                                this.j = j8;
                                this.l = j9;
                            } else {
                                long j11 = i2;
                                long j12 = bVar.c + j11;
                                this.i = j12;
                                this.k = j9;
                                if ((this.j - j12) + j11 < androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                                    bVar.a(i2);
                                    j = -(this.k + 2);
                                    j2 = 0;
                                }
                            }
                            long j13 = this.j;
                            long j14 = this.i;
                            long j15 = j13 - j14;
                            if (j15 < androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                                this.j = j14;
                                j = j14;
                            } else {
                                j = java.lang.Math.min(java.lang.Math.max(((j15 * j10) / (this.l - this.k)) + (bVar.c - (i2 * (j10 <= 0 ? 2 : 1))), j14), this.j - 1);
                            }
                            j2 = 0;
                        } else {
                            bVar.a(i2);
                            j = -(this.f3984a.b + 2);
                        }
                    } else {
                        j = this.i;
                        if (j == j8) {
                            throw new java.io.IOException("No ogg page can be found.");
                        }
                    }
                }
                if (j >= j2) {
                    return j;
                }
                long j16 = this.h;
                long j17 = -(j + 2);
                this.f3984a.a(bVar, false);
                while (true) {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.g gVar3 = this.f3984a;
                    if (gVar3.b >= j16) {
                        break;
                    }
                    bVar.a(gVar3.d + gVar3.e);
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.g gVar4 = this.f3984a;
                    long j18 = gVar4.b;
                    gVar4.a(bVar, false);
                    j17 = j18;
                }
                bVar.e = 0;
                j2 = j17;
            }
            this.e = 3;
            return -(j2 + 2);
        }
        if (!a(bVar, this.c)) {
            throw new java.io.EOFException();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.g gVar5 = this.f3984a;
        gVar5.f3988a = 0;
        gVar5.b = 0L;
        gVar5.c = 0;
        gVar5.d = 0;
        gVar5.e = 0;
        while (true) {
            gVar = this.f3984a;
            if ((gVar.f3988a & 4) == 4 || bVar.c >= this.c) {
                break;
            }
            gVar.a(bVar, false);
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.g gVar6 = this.f3984a;
            bVar.a(gVar6.d + gVar6.e);
        }
        this.f = gVar.b;
        this.e = 3;
        return this.g;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.q b() {
        if (this.f != 0) {
            return new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.a(this);
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final long c(long j) {
        int i = this.e;
        if (i != 3 && i != 2) {
            throw new java.lang.IllegalArgumentException();
        }
        long j2 = j == 0 ? 0L : (this.d.i * j) / 1000000;
        this.h = j2;
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
        return j2;
    }

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, long j) {
        int i;
        long min = java.lang.Math.min(j + 3, this.c);
        int i2 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            long j2 = bVar.c;
            int i3 = 0;
            if (i2 + j2 > min && (i2 = (int) (min - j2)) < 4) {
                return false;
            }
            bVar.a(bArr, 0, i2, false);
            while (true) {
                i = i2 - 3;
                if (i3 < i) {
                    if (bArr[i3] == 79 && bArr[i3 + 1] == 103 && bArr[i3 + 2] == 103 && bArr[i3 + 3] == 83) {
                        bVar.a(i3);
                        return true;
                    }
                    i3++;
                }
            }
            bVar.a(i);
        }
    }
}
