package com.instagram.common.viewpoint.core;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.mQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1682mQ implements InterfaceC0351Cr {
    public static String[] A03 = {"SXf2ikyU7x67I20o8i24dVpGUFSBqQTw", "mkUiuiIj8yhWc2", "ZVpzrzkkS3TCIC8ssuB1q665Cly", "AyVvw5Y1t2x", "iglXNLTRJoy", "iTKB7JlXxZgW", "zcduVvETVwMCfQslxyZfhoZ", "8SZ4gfyzqyWZuyWUMuDO3PJ5JnvEF7yK"};
    public boolean A00;
    public final InterfaceC0351Cr A01;
    public final /* synthetic */ C9F A02;

    public C1682mQ(C9F c9f, InterfaceC0351Cr interfaceC0351Cr) {
        this.A02 = c9f;
        this.A01 = interfaceC0351Cr;
    }

    public final void A00() {
        this.A00 = false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0351Cr
    public final boolean AAV() {
        if (!this.A02.A03()) {
            boolean AAV = this.A01.AAV();
            String[] strArr = A03;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "tfusTrbeCFgw";
            strArr2[6] = "N1qkw3c8e5Hqf14VA9IMw1Y";
            if (AAV) {
                return true;
            }
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0351Cr
    public final void ABs() throws IOException {
        this.A01.ABs();
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
    @Override // com.instagram.common.viewpoint.core.InterfaceC0351Cr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int AGf(C6N c6n, C1752nY c1752nY, int i) {
        int encoderPadding;
        if (this.A02.A03()) {
            return -3;
        }
        if (this.A00) {
            c1752nY.A02(4);
            return -4;
        }
        int AGf = this.A01.AGf(c6n, c1752nY, i);
        if (AGf == -5) {
            Object A01 = C3M.A01(c6n.A00);
            if (A03[1].length() == 3) {
                throw new RuntimeException();
            }
            A03[1] = "CgcnacS";
            C1830or c1830or = (C1830or) A01;
            int result = c1830or.A08;
            if (result == 0) {
                int result2 = c1830or.A09;
            }
            long j = this.A02.A01;
            String[] strArr = A03;
            String str = strArr[3];
            String str2 = strArr[4];
            int length = str.length();
            int result3 = str2.length();
            if (length != result3) {
                String[] strArr2 = A03;
                strArr2[3] = "GNrNzPSs5rG";
                strArr2[4] = "BRLad8Ppi7x";
            } else {
                String[] strArr3 = A03;
                strArr3[7] = "EEmKLcyNYLT06pocayZ2GsCLcCuyLxXc";
                strArr3[0] = "iurrvyyHueo7iqPuT2paMo28xJltVQ5w";
            }
            c6n.A00 = c1830or.A07().A0d(encoderPadding).A0e(this.A02.A00 == Long.MIN_VALUE ? c1830or.A09 : 0).A14();
            return -5;
        }
        if (this.A02.A00 != Long.MIN_VALUE) {
            if (AGf != -4 || c1752nY.A01 < this.A02.A00) {
                if (AGf == -3 && this.A02.A70() == Long.MIN_VALUE) {
                    boolean z = c1752nY.A04;
                    if (A03[2].length() != 27) {
                        String[] strArr4 = A03;
                        strArr4[7] = "1nwlHryK5EDeU2ZU0H4BcQJbxB1i4Ihb";
                        strArr4[0] = "uJ2uSAytr2SiAHwLxUdt9xnwmqCI2wHf";
                    } else {
                        String[] strArr5 = A03;
                        strArr5[5] = "inKi0NPX9S85";
                        strArr5[6] = "FN6Cq4NmwdrKNoi6ofH3HqR";
                    }
                }
            }
            c1752nY.A0A();
            c1752nY.A02(4);
            this.A00 = true;
            return -4;
        }
        return AGf;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0351Cr
    public final int AJI(long j) {
        if (this.A02.A03()) {
            return -3;
        }
        return this.A01.AJI(j);
    }
}
