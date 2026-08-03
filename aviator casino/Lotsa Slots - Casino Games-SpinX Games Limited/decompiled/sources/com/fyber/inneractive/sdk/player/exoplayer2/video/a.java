package com.fyber.inneractive.sdk.player.exoplayer2.video;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f4122a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public a(java.util.ArrayList arrayList, int i, int i2, int i3, float f) {
        this.f4122a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.video.a a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int i;
        int i2;
        float f;
        try {
            nVar.e(nVar.b + 4);
            int j = (nVar.j() & 3) + 1;
            if (j == 3) {
                throw new java.lang.IllegalStateException();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int j2 = nVar.j() & 31;
            for (int i3 = 0; i3 < j2; i3++) {
                int o = nVar.o();
                int i4 = nVar.b;
                nVar.e(i4 + o);
                byte[] bArr = nVar.f4112a;
                byte[] bArr2 = new byte[o + 4];
                java.lang.System.arraycopy(com.fyber.inneractive.sdk.player.exoplayer2.util.d.f4104a, 0, bArr2, 0, 4);
                java.lang.System.arraycopy(bArr, i4, bArr2, 4, o);
                arrayList.add(bArr2);
            }
            int j3 = nVar.j();
            for (int i5 = 0; i5 < j3; i5++) {
                int o2 = nVar.o();
                int i6 = nVar.b;
                nVar.e(i6 + o2);
                byte[] bArr3 = nVar.f4112a;
                byte[] bArr4 = new byte[o2 + 4];
                java.lang.System.arraycopy(com.fyber.inneractive.sdk.player.exoplayer2.util.d.f4104a, 0, bArr4, 0, 4);
                java.lang.System.arraycopy(bArr3, i6, bArr4, 4, o2);
                arrayList.add(bArr4);
            }
            if (j2 > 0) {
                com.fyber.inneractive.sdk.player.exoplayer2.util.k a2 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a((byte[]) arrayList.get(0), j, ((byte[]) arrayList.get(0)).length);
                int i7 = a2.b;
                int i8 = a2.c;
                f = a2.d;
                i = i7;
                i2 = i8;
            } else {
                i = -1;
                i2 = -1;
                f = 1.0f;
            }
            return new com.fyber.inneractive.sdk.player.exoplayer2.video.a(arrayList, j, i, i2, f);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing AVC config", e);
        }
    }
}
