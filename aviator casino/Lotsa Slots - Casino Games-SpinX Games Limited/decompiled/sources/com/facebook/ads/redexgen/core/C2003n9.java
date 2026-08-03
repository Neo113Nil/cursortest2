package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.n9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2003n9 implements com.facebook.ads.redexgen.core.FF {
    public final int A00;

    public C2003n9() {
        this(-1);
    }

    public C2003n9(int i) {
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.FF
    public final int A8Z(int i) {
        if (this.A00 == -1) {
            if (i == 7) {
                return 6;
            }
            return 3;
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.FF
    public final long A8u(com.facebook.ads.redexgen.core.FE fe) {
        java.io.IOException iOException = fe.A03;
        if ((iOException instanceof com.facebook.ads.redexgen.core.C3K) || (iOException instanceof java.io.FileNotFoundException) || (iOException instanceof com.facebook.ads.redexgen.core.AM) || (iOException instanceof com.facebook.ads.redexgen.core.FP) || com.facebook.ads.redexgen.core.C04495b.A00(iOException)) {
            return -9223372036854775807L;
        }
        return java.lang.Math.min((fe.A00 - 1) * 1000, 5000);
    }
}
