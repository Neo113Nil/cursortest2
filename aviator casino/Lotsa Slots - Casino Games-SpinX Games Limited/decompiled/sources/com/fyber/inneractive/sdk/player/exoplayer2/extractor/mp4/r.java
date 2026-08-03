package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* loaded from: classes3.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f3976a = {com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("isom"), com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("iso2"), com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("iso3"), com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("iso4"), com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("iso5"), com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("iso6"), com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("avc1"), com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("hvc1"), com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("hev1"), com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("mp41"), com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("mp42"), com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("3g2a"), com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("3g2b"), com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("3gr6"), com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("3gs6"), com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("3ge6"), com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("3gg6"), com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("M4V "), com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("M4A "), com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("f4v "), com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("kddi"), com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("M4VP"), com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("qt  "), com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("MSNV")};

    public static boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, boolean z) {
        boolean z2;
        int i;
        long j = bVar.b;
        if (j == -1 || j > android.support.v4.media.session.PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j = 4096;
        }
        int i2 = (int) j;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(64);
        int i3 = 0;
        boolean z3 = false;
        while (i3 < i2) {
            nVar.c(8);
            bVar.a(nVar.f4112a, 0, 8, false);
            long k = nVar.k();
            int b = nVar.b();
            if (k == 1) {
                bVar.a(nVar.f4112a, 8, 8, false);
                nVar.d(16);
                k = nVar.n();
                i = 16;
            } else {
                i = 8;
            }
            long j2 = i;
            if (k < j2) {
                return false;
            }
            i3 += i;
            if (b != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.C) {
                if (b == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.L || b == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.N) {
                    z2 = true;
                    break;
                }
                if ((i3 + k) - j2 >= i2) {
                    break;
                }
                int i4 = (int) (k - j2);
                i3 += i4;
                if (b == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.b) {
                    if (i4 < 8) {
                        return false;
                    }
                    nVar.c(i4);
                    bVar.a(nVar.f4112a, 0, i4, false);
                    int i5 = i4 / 4;
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (i6 != 1) {
                            int b2 = nVar.b();
                            if ((b2 >>> 8) != com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("3gp")) {
                                for (int i7 : f3976a) {
                                    if (i7 != b2) {
                                    }
                                }
                            }
                            z3 = true;
                            break;
                        }
                        nVar.e(nVar.b + 4);
                    }
                    if (!z3) {
                        return false;
                    }
                } else if (i4 != 0) {
                    bVar.a(i4, false);
                }
            }
        }
        z2 = false;
        return z3 && z == z2;
    }
}
