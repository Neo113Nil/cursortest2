package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.nt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2049nt implements com.facebook.ads.redexgen.core.DT {
    public static java.lang.String[] A03 = {"SXf2ikyU7x67I20o8i24dVpGUFSBqQTw", "mkUiuiIj8yhWc2", "ZVpzrzkkS3TCIC8ssuB1q665Cly", "AyVvw5Y1t2x", "iglXNLTRJoy", "iTKB7JlXxZgW", "zcduVvETVwMCfQslxyZfhoZ", "8SZ4gfyzqyWZuyWUMuDO3PJ5JnvEF7yK"};
    public boolean A00;
    public final com.facebook.ads.redexgen.core.DT A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C9v A02;

    public C2049nt(com.facebook.ads.redexgen.core.C9v c9v, com.facebook.ads.redexgen.core.DT dt) {
        this.A02 = c9v;
        this.A01 = dt;
    }

    public final void A00() {
        this.A00 = false;
    }

    @Override // com.facebook.ads.redexgen.core.DT
    public final boolean AAe() {
        if (!this.A02.A03()) {
            boolean AAe = this.A01.AAe();
            java.lang.String[] strArr = A03;
            if (strArr[5].length() == strArr[6].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A03;
            strArr2[5] = "tfusTrbeCFgw";
            strArr2[6] = "N1qkw3c8e5Hqf14VA9IMw1Y";
            if (AAe) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.DT
    public final void ACR() throws java.io.IOException {
        this.A01.ACR();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r0 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r2 != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
    
        r3 = r6.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        if (r2 != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00df, code lost:
    
        if (r3 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f7, code lost:
    
        if (r3 == false) goto L45;
     */
    @Override // com.facebook.ads.redexgen.core.DT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int AHP(com.facebook.ads.redexgen.core.C04996z c04996z, com.facebook.ads.redexgen.core.C2117p0 c2117p0, int i) {
        int encoderPadding;
        if (this.A02.A03()) {
            return -3;
        }
        if (this.A00) {
            c2117p0.A02(4);
            return -4;
        }
        int AHP = this.A01.AHP(c04996z, c2117p0, i);
        if (AHP == -5) {
            java.lang.Object A01 = com.facebook.ads.redexgen.core.AbstractC04203y.A01(c04996z.A00);
            if (A03[1].length() == 3) {
                throw new java.lang.RuntimeException();
            }
            A03[1] = "CgcnacS";
            com.facebook.ads.redexgen.core.C2196qI c2196qI = (com.facebook.ads.redexgen.core.C2196qI) A01;
            int result = c2196qI.A08;
            if (result == 0) {
                int result2 = c2196qI.A09;
            }
            long j = this.A02.A01;
            java.lang.String[] strArr = A03;
            java.lang.String str = strArr[3];
            java.lang.String str2 = strArr[4];
            int length = str.length();
            int result3 = str2.length();
            if (length != result3) {
                java.lang.String[] strArr2 = A03;
                strArr2[3] = "GNrNzPSs5rG";
                strArr2[4] = "BRLad8Ppi7x";
            } else {
                java.lang.String[] strArr3 = A03;
                strArr3[7] = "EEmKLcyNYLT06pocayZ2GsCLcCuyLxXc";
                strArr3[0] = "iurrvyyHueo7iqPuT2paMo28xJltVQ5w";
            }
            c04996z.A00 = c2196qI.A07().A0d(encoderPadding).A0e(this.A02.A00 == Long.MIN_VALUE ? c2196qI.A09 : 0).A14();
            return -5;
        }
        if (this.A02.A00 != Long.MIN_VALUE) {
            if (AHP != -4 || c2117p0.A01 < this.A02.A00) {
                if (AHP == -3 && this.A02.A78() == Long.MIN_VALUE) {
                    boolean z = c2117p0.A04;
                    if (A03[2].length() != 27) {
                        java.lang.String[] strArr4 = A03;
                        strArr4[7] = "1nwlHryK5EDeU2ZU0H4BcQJbxB1i4Ihb";
                        strArr4[0] = "uJ2uSAytr2SiAHwLxUdt9xnwmqCI2wHf";
                    } else {
                        java.lang.String[] strArr5 = A03;
                        strArr5[5] = "inKi0NPX9S85";
                        strArr5[6] = "FN6Cq4NmwdrKNoi6ofH3HqR";
                    }
                }
            }
            c2117p0.A0A();
            c2117p0.A02(4);
            this.A00 = true;
            return -4;
        }
        return AHP;
    }

    @Override // com.facebook.ads.redexgen.core.DT
    public final int AK2(long j) {
        if (this.A02.A03()) {
            return -3;
        }
        return this.A01.AK2(j);
    }
}
