package com.fyber.inneractive.sdk.player.exoplayer2.video;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f4124a;
    public final int b;

    public d(int i, java.util.List list) {
        this.f4124a = list;
        this.b = i;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.video.d a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        try {
            nVar.e(nVar.b + 21);
            int j = nVar.j() & 3;
            int j2 = nVar.j();
            int i = nVar.b;
            int i2 = 0;
            for (int i3 = 0; i3 < j2; i3++) {
                nVar.e(nVar.b + 1);
                int o = nVar.o();
                for (int i4 = 0; i4 < o; i4++) {
                    int o2 = nVar.o();
                    i2 += o2 + 4;
                    nVar.e(nVar.b + o2);
                }
            }
            nVar.e(i);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            for (int i6 = 0; i6 < j2; i6++) {
                nVar.e(nVar.b + 1);
                int o3 = nVar.o();
                for (int i7 = 0; i7 < o3; i7++) {
                    int o4 = nVar.o();
                    java.lang.System.arraycopy(com.fyber.inneractive.sdk.player.exoplayer2.util.l.f4110a, 0, bArr, i5, 4);
                    int i8 = i5 + 4;
                    java.lang.System.arraycopy(nVar.f4112a, nVar.b, bArr, i8, o4);
                    i5 = i8 + o4;
                    nVar.e(nVar.b + o4);
                }
            }
            return new com.fyber.inneractive.sdk.player.exoplayer2.video.d(j + 1, i2 == 0 ? null : java.util.Collections.singletonList(bArr));
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing HEVC config", e);
        }
    }
}
