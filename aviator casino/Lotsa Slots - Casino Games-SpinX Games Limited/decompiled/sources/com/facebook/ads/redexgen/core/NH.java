package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class NH extends android.content.BroadcastReceiver {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"Y8Z1", "Gib9", "71bezSKIJxKufdL13ppDGQvN3l", "amgHka60jBO0VGEiDWjvaQpooGEX1vUM", "ttT0jofZ4zWB5Dwx3mPNIXc", "eyh0I6c0vYFaGMFwnoeMEbyGHh2pIYmK", "GRZnv0m", "VfIH6aQ48NmkLcOtEQWPZe5uGeHooIii"};
    public com.facebook.ads.redexgen.core.C1818ju A00;
    public com.facebook.ads.redexgen.core.NG A01;
    public com.facebook.ads.redexgen.core.C1636gi A02;
    public java.lang.String A03;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 64);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-12, -58, -46, -48, -111, -55, -60, -58, -56, -59, -46, -46, -50, -111, -60, -57, -42, -111, -47, -60, -41, -52, -39, -56, -111, -60, -57, -62, -58, -49, -52, -58, -50};
    }

    static {
        A01();
    }

    public NH(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.lang.String str, com.facebook.ads.redexgen.core.C1818ju c1818ju, com.facebook.ads.redexgen.core.NG ng) {
        this.A02 = c1636gi;
        this.A03 = str;
        this.A01 = ng;
        this.A00 = c1818ju;
    }

    public final void A02() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction(A00(1, 32, 35) + A00(0, 1, 122) + this.A03);
        com.facebook.ads.redexgen.core.P2.A00(this.A02).A06(this, intentFilter);
    }

    public final void A03() {
        com.facebook.ads.redexgen.core.P2.A00(this.A02).A05(this);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String action = intent.getAction();
        if (action == null) {
            return;
        }
        java.lang.String intentAction = A00(0, 1, 122);
        java.lang.String[] split = action.split(intentAction);
        if (split.length >= 1 && (str = split[0]) != null) {
            java.lang.String[] strArr = A05;
            java.lang.String str2 = strArr[0];
            java.lang.String intentAction2 = strArr[1];
            if (str2.length() != intentAction2.length()) {
                throw new java.lang.RuntimeException();
            }
            A05[7] = "UAhxU8HTiJONxaKo3zNJYg3uL8StvHDr";
            java.lang.String intentAction3 = A00(1, 32, 35);
            if (intentAction3.equals(str)) {
                com.facebook.ads.redexgen.core.NG ng = this.A01;
                com.facebook.ads.redexgen.core.C1818ju c1818ju = this.A00;
                java.lang.String[] strArr2 = A05;
                java.lang.String str3 = strArr2[0];
                java.lang.String intentAction4 = strArr2[1];
                if (str3.length() != intentAction4.length()) {
                    throw new java.lang.RuntimeException();
                }
                A05[6] = "";
                ng.AEv(c1818ju);
            }
        }
    }
}
