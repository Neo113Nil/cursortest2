package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class NA extends android.content.BroadcastReceiver {
    public static byte[] A04;
    public com.facebook.ads.redexgen.core.InterfaceC1832k8 A00;
    public com.facebook.ads.redexgen.core.N9 A01;
    public com.facebook.ads.redexgen.core.C1636gi A02;
    public java.lang.String A03;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{120, 66, 78, 76, com.google.common.base.Ascii.SI, 71, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 66, 68, 67, 78, 78, 74, com.google.common.base.Ascii.SI, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 69, 82, com.google.common.base.Ascii.SI, 67, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 79, 79, 68, 83, com.google.common.base.Ascii.SI, 66, 77, 72, 66, 74, 68, 69};
    }

    public NA(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.lang.String str, com.facebook.ads.redexgen.core.InterfaceC1832k8 interfaceC1832k8, com.facebook.ads.redexgen.core.N9 n9) {
        this.A02 = c1636gi;
        this.A03 = str;
        this.A01 = n9;
        this.A00 = interfaceC1832k8;
    }

    public final void A02() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction(A00(1, 31, 48) + A00(0, 1, 83) + this.A03);
        com.facebook.ads.redexgen.core.P2.A00(this.A02).A06(this, intentFilter);
    }

    public final void A03() {
        com.facebook.ads.redexgen.core.P2.A00(this.A02).A05(this);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        if (action == null) {
            return;
        }
        java.lang.String intentAction = A00(0, 1, 83);
        java.lang.String[] parts = action.split(intentAction);
        java.lang.String str = parts[0];
        if (str == null) {
            return;
        }
        java.lang.String intentAction2 = A00(1, 31, 48);
        if (intentAction2.equals(str)) {
            this.A01.ADC(this.A00);
        }
    }
}
