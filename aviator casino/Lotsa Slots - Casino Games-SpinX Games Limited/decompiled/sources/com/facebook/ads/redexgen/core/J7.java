package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class J7 {
    public static java.lang.String[] A0A = {"EJzHBf6C0sknf46Vq1Osr72lZWU", "EzVPMe4nRAbvxSng0PXVwtyqLeoR1KIv", "OkBxNGbCc3SGP6NNAhHfxcRtiUQBpmsu", "1fihPQnAv3tt3xF1xxV2XjfJNe5jiXUE", "EaQIZLU4UTAcxpaH6Zb3hTUPzu", "nXVDjS3P8WK4na35on8K5ox1mEuGJ9Tn", "34qesDVsFPLU35m5e8V9GlfuLx1oAXXP", "IwUkif7926Fg"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public com.facebook.ads.redexgen.core.J1 A04;
    public com.facebook.ads.redexgen.core.JO A05;
    public final com.facebook.ads.redexgen.core.InterfaceC0743Hd A06;
    public final com.facebook.ads.redexgen.core.JQ A07 = new com.facebook.ads.redexgen.core.JQ();
    public final com.facebook.ads.redexgen.core.C04434v A09 = new com.facebook.ads.redexgen.core.C04434v(1);
    public final com.facebook.ads.redexgen.core.C04434v A08 = new com.facebook.ads.redexgen.core.C04434v();

    public J7(com.facebook.ads.redexgen.core.InterfaceC0743Hd interfaceC0743Hd) {
        this.A06 = interfaceC0743Hd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.facebook.ads.redexgen.core.JP A00() {
        com.facebook.ads.redexgen.core.JP encryptionBox;
        int i = this.A07.A06.A02;
        if (this.A07.A07 != null) {
            encryptionBox = this.A07.A07;
        } else {
            encryptionBox = this.A05.A00(i);
        }
        if (encryptionBox == null || !encryptionBox.A03) {
            return null;
        }
        return encryptionBox;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        com.facebook.ads.redexgen.core.JP A00 = A00();
        if (A00 == null) {
            return;
        }
        com.facebook.ads.redexgen.core.C04434v c04434v = this.A07.A0H;
        if (A00.A00 != 0) {
            c04434v.A0g(A00.A00);
        }
        if (this.A07.A06(this.A01)) {
            c04434v.A0g(c04434v.A0M() * 6);
        }
    }

    public final int A04() {
        com.facebook.ads.redexgen.core.C04434v c04434v;
        int vectorSize;
        com.facebook.ads.redexgen.core.JP A00 = A00();
        if (A00 == null) {
            return 0;
        }
        if (A00.A00 != 0) {
            c04434v = this.A07.A0H;
            vectorSize = A00.A00;
        } else {
            byte[] initVectorData = A00.A04;
            this.A08.A0j(initVectorData, initVectorData.length);
            c04434v = this.A08;
            vectorSize = initVectorData.length;
        }
        boolean A06 = this.A07.A06(this.A01);
        this.A09.A00[0] = (byte) ((A06 ? 128 : 0) | vectorSize);
        this.A09.A0f(0);
        com.facebook.ads.redexgen.core.InterfaceC0743Hd interfaceC0743Hd = this.A06;
        com.facebook.ads.redexgen.core.C04434v initializationVectorData = this.A09;
        interfaceC0743Hd.AIr(initializationVectorData, 1);
        this.A06.AIr(c04434v, vectorSize);
        if (!A06) {
            int vectorSize2 = vectorSize + 1;
            if (A0A[2].charAt(9) == '1') {
                throw new java.lang.RuntimeException();
            }
            A0A[3] = "cKav7mEAu9tQ2Y9RA5SJHOCCBpQ48rqR";
            return vectorSize2;
        }
        com.facebook.ads.redexgen.core.C04434v c04434v2 = this.A07.A0H;
        int A0M = c04434v2.A0M();
        c04434v2.A0g(-2);
        int i = (A0M * 6) + 2;
        this.A06.AIr(c04434v2, i);
        return vectorSize + 1 + i;
    }

    public final void A05() {
        this.A07.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0006 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A06(long j) {
        for (int i = this.A01; i < searchIndex && this.A07.A00(i) < j; i++) {
            if (this.A07.A0G[i]) {
                this.A03 = i;
            }
        }
    }

    public final void A07(com.facebook.ads.androidx.media3.common.DrmInitData drmInitData) {
        com.facebook.ads.redexgen.core.JP encryptionBox = this.A05.A00(this.A07.A06.A02);
        this.A06.A6e(this.A05.A07.A09(drmInitData.A01(encryptionBox != null ? encryptionBox.A02 : null)));
    }

    public final void A08(com.facebook.ads.redexgen.core.JO jo, com.facebook.ads.redexgen.core.J1 j1) {
        this.A05 = (com.facebook.ads.redexgen.core.JO) com.facebook.ads.redexgen.core.AbstractC04203y.A01(jo);
        this.A04 = (com.facebook.ads.redexgen.core.J1) com.facebook.ads.redexgen.core.AbstractC04203y.A01(j1);
        this.A06.A6e(jo.A07);
        A05();
    }

    public final boolean A09() {
        this.A01++;
        this.A00++;
        if (this.A00 != this.A07.A0C[this.A02]) {
            return true;
        }
        this.A02++;
        this.A00 = 0;
        return false;
    }
}
