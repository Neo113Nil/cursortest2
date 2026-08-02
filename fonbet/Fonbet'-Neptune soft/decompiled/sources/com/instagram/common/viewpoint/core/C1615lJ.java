package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.lJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1615lJ implements InterfaceC0460Gw {
    public final long A00;
    public final boolean A01;
    public final long[] A02;
    public final long[] A03;

    public C1615lJ(long[] jArr, long[] jArr2, long j) {
        C3M.A07(jArr.length == jArr2.length);
        int length = jArr2.length;
        this.A01 = length > 0;
        if (this.A01 && jArr2[0] > 0) {
            int length2 = length + 1;
            this.A02 = new long[length2];
            int length3 = length + 1;
            this.A03 = new long[length3];
            System.arraycopy(jArr, 0, this.A02, 1, length);
            System.arraycopy(jArr2, 0, this.A03, 1, length);
        } else {
            this.A02 = jArr;
            this.A03 = jArr2;
        }
        this.A00 = j;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0460Gw
    public final long A7l() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0460Gw
    public final C0459Gv A8t(long j) {
        if (!this.A01) {
            return new C0459Gv(C0461Gx.A04);
        }
        int A0L = AbstractC01424a.A0L(this.A03, j, true, true);
        C0461Gx c0461Gx = new C0461Gx(this.A03[A0L], this.A02[A0L]);
        if (c0461Gx.A01 != j) {
            int targetIndex = this.A03.length;
            if (A0L != targetIndex - 1) {
                int targetIndex2 = A0L + 1;
                long j2 = this.A03[targetIndex2];
                int targetIndex3 = A0L + 1;
                C0461Gx rightSeekPoint = new C0461Gx(j2, this.A02[targetIndex3]);
                return new C0459Gv(c0461Gx, rightSeekPoint);
            }
        }
        return new C0459Gv(c0461Gx);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0460Gw
    public final boolean AAa() {
        return this.A01;
    }
}
