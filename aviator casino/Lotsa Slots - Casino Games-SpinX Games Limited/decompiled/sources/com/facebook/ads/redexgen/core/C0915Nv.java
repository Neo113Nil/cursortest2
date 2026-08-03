package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Nv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0915Nv implements com.facebook.ads.redexgen.core.XN {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"RKj", "", "UN15gotjq8", "ajoBiEUEQKFJNLqm", "ifgUnXqkKiJSPGKzKRtyUVwCV1ynqJ", "MgNPOwYKG3krpOkrgoqalUsb7GIlLECG", "4d5pH5OlBXd1RidH0kkNXmSukCNaNWUQ", "ZdfTYbLhRFsUmKvgir0oysIbzYx0fUOP"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.NO A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 17);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-31, -7, -21, -23, -7, -29};
    }

    static {
        A01();
    }

    public C0915Nv(com.facebook.ads.redexgen.core.NO no) {
        this.A00 = no;
    }

    public /* synthetic */ C0915Nv(com.facebook.ads.redexgen.core.NO no, com.facebook.ads.redexgen.core.OV ov) {
        this(no);
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void ADS() {
        boolean z;
        boolean A0X;
        this.A00.A0g.setToolbarActionMessage(A00(0, 0, 19));
        this.A00.A0I();
        z = this.A00.A0d;
        if (z) {
            A0X = this.A00.A0X();
            java.lang.String[] strArr = A02;
            if (strArr[5].charAt(0) == strArr[7].charAt(0)) {
                throw new java.lang.RuntimeException();
            }
            A02[4] = "QDC88FCswtzFK8CArK72WEL9jXMBl5";
            if (A0X) {
                this.A00.A0g.setToolbarActionMode(1);
                return;
            }
        }
        this.A00.A0g.setToolbarActionMode(0);
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void AFV(float f) {
        boolean z;
        com.facebook.ads.redexgen.core.C0908No c0908No;
        boolean z2;
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd;
        float A04;
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd2;
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd3;
        boolean z3;
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd4;
        boolean z4;
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd5;
        this.A00.A0Q((int) f);
        z = this.A00.A0e;
        if (!z) {
            c0908No = this.A00.A0P;
            this.A00.A0g.setProgress(100.0f * (1.0f - (f / c0908No.A0C())));
            return;
        }
        z2 = this.A00.A0J;
        if (z2) {
            abstractC1801jd4 = this.A00.A0O;
            if (A02[6].charAt(27) != 'a') {
                throw new java.lang.RuntimeException();
            }
            A02[4] = "3MuDy2E798EtOoHK0e0a3SiH1QgAy5";
            A04 = 1.0f - (f / abstractC1801jd4.A29().A0H().A03());
            z4 = this.A00.A0M;
            if (z4 || A04 < 1.0f) {
                this.A00.A0M = false;
                abstractC1801jd5 = this.A00.A0O;
                this.A00.A0g.setToolbarActionMessage(abstractC1801jd5.A2D().A06().replace(A00(0, 6, 117), java.lang.String.valueOf((int) f)));
            } else {
                this.A00.A0M = true;
                com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb = this.A00.A0g;
                java.lang.String A00 = A00(0, 0, 19);
                if (A02[3].length() != 16) {
                    abstractC1171Yb.setToolbarActionMessage(A00);
                } else {
                    java.lang.String[] strArr = A02;
                    strArr[5] = "wpbUz5ctYXHuYyRf6fVCU3uRzsMt7dE8";
                    strArr[7] = "BBfRd69Z77LUH69GeqVAIKhho7h2fuMA";
                    abstractC1171Yb.setToolbarActionMessage(A00);
                }
            }
        } else {
            abstractC1801jd = this.A00.A0O;
            A04 = 1.0f - (f / abstractC1801jd.A29().A0H().A04());
        }
        this.A00.A0g.setProgress(100.0f * A04);
        abstractC1801jd2 = this.A00.A0O;
        float A03 = abstractC1801jd2.A29().A0H().A03() - f;
        abstractC1801jd3 = this.A00.A0O;
        float percentageOfReward = abstractC1801jd3.A29().A0H().A04();
        boolean z5 = A03 >= percentageOfReward;
        z3 = this.A00.A0M;
        if (!z3 && z5) {
            this.A00.A0g.setToolbarActionMode(1);
        }
    }
}
