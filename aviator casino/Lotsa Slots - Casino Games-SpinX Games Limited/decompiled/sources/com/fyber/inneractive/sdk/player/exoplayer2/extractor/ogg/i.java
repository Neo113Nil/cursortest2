package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

/* loaded from: classes3.dex */
public final class i extends com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l {
    public static final int o = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("Opus");
    public static final byte[] p = {79, 112, 117, 115, 72, 101, 97, 100};
    public boolean n;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.n = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int i;
        byte[] bArr = nVar.f4112a;
        byte b = bArr[0];
        int i2 = b & 255;
        int i3 = b & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = bArr[1] & 63;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        return (this.i * (i * (i4 >= 16 ? 2500 << r0 : i4 >= 12 ? 10000 << (i4 & 1) : (i4 & 3) == 3 ? 60000 : 10000 << r0))) / 1000000;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, long j, com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.j jVar) {
        if (!this.n) {
            byte[] copyOf = java.util.Arrays.copyOf(nVar.f4112a, nVar.c);
            int i = copyOf[9] & 255;
            int i2 = ((copyOf[11] & 255) << 8) | (copyOf[10] & 255);
            java.util.ArrayList arrayList = new java.util.ArrayList(3);
            arrayList.add(copyOf);
            arrayList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong((i2 * 1000000000) / 48000).array());
            arrayList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong((3840 * 1000000000) / 48000).array());
            jVar.f3989a = com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, "audio/opus", -1, -1, i, 48000, arrayList, null, null);
            this.n = true;
            return true;
        }
        boolean z = nVar.b() == o;
        nVar.e(0);
        return z;
    }
}
