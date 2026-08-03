package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

/* loaded from: classes3.dex */
public abstract class s {
    public static com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.r a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        a(1, nVar, false);
        nVar.e();
        int j = nVar.j();
        long e = nVar.e();
        nVar.d();
        int d = nVar.d();
        nVar.d();
        int j2 = nVar.j();
        int pow = (int) java.lang.Math.pow(2.0d, j2 & 15);
        int pow2 = (int) java.lang.Math.pow(2.0d, (j2 & 240) >> 4);
        nVar.j();
        return new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.r(j, e, d, pow, pow2, java.util.Arrays.copyOf(nVar.f4112a, nVar.c));
    }

    public static boolean a(int i, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, boolean z) {
        if (nVar.c - nVar.b < 7) {
            if (z) {
                return false;
            }
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("too short header: " + (nVar.c - nVar.b));
        }
        if (nVar.j() != i) {
            if (z) {
                return false;
            }
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("expected header type " + java.lang.Integer.toHexString(i));
        }
        if (nVar.j() == 118 && nVar.j() == 111 && nVar.j() == 114 && nVar.j() == 98 && nVar.j() == 105 && nVar.j() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("expected characters 'vorbis'");
    }
}
