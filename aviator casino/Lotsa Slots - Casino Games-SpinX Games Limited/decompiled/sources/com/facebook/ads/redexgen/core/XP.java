package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class XP implements com.facebook.ads.redexgen.core.VM {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"HMqNF3eSIzlMBYXVNU3nP1NvWYo5", "x1o785RKTr7Jq0RcU0BPUyycJ3fBjUeE", "GBfmO3K", "Po", "VaaklUluHJvo1XkXnH3kavV5L6d7gpHG", "rG9SvJ3uZ6", "s9MPDvRc6n", "AU4sbnw7bsTTRuLyXll9UaPcK28fS"};
    public static final java.lang.String A06;
    public com.facebook.ads.redexgen.core.ViewOnAttachStateChangeListenerC1148Xe A00;
    public com.facebook.ads.redexgen.core.C2245rN<com.facebook.ads.redexgen.core.C1093Uw, com.facebook.ads.redexgen.core.V1> A01;
    public final com.facebook.ads.redexgen.core.C1632ge A02;
    public final com.facebook.ads.redexgen.core.C0576Ao A03 = com.facebook.ads.redexgen.core.C0576Ao.A01();

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A05[1].length() == 18) {
                throw new java.lang.RuntimeException();
            }
            A05[1] = "YaUcq3PJYQGMSsmKTTLasxzUL6lFeW7O";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 121);
            i4++;
        }
    }

    public static void A02() {
        A04 = new byte[]{79, 115, 126, 59, 118, 126, Byte.MAX_VALUE, 114, 122, 59, 120, 105, 126, 122, 111, 114, 109, 126, 59, 109, 114, 126, 108, 59, 114, 104, 59, 117, 110, 119, 119, 53, 121, 66, 94, 73, 75, 69, 95, 88, 73, 94, 69, 66, 75, com.google.common.base.Ascii.FF, 77, com.google.common.base.Ascii.FF, 66, 89, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.base.Ascii.FF, 79, 94, 73, 77, 88, 69, 90, 73, com.google.common.base.Ascii.FF, 90, 69, 73, 91, com.google.common.base.Ascii.CR, 83, 108, 96, 114, 117, 106, 108, 107, 113, 65, 100, 113, 100, 37, 108, 118, 37, 107, 112, 105, 105, 36, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SI, 9, 5, 4, com.google.common.base.Ascii.SO, 53, 9, 2, com.google.common.base.Ascii.VT, 4, 4, com.google.common.base.Ascii.SI, 6};
    }

    static {
        A02();
        A06 = com.facebook.ads.redexgen.core.XP.class.getSimpleName();
    }

    public XP(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        this.A02 = c1632ge;
    }

    private void A01() {
        this.A02.A08().ABC(A00(89, 14, 19), 3600, new com.facebook.ads.redexgen.core.C1049Te(A00(67, 22, 124)));
    }

    @Override // com.facebook.ads.redexgen.core.VM
    public final void ADb() {
        if (this.A01 != null) {
            this.A01.A07.A00();
        } else {
            A01();
        }
    }

    @Override // com.facebook.ads.redexgen.core.VM
    public final void AGc() {
        if (this.A01 != null) {
            this.A01.A07.A03();
        } else {
            A01();
        }
    }

    @Override // com.facebook.ads.redexgen.core.VM
    public final void AKU(android.view.View view) {
        if (this.A01 == null) {
            this.A02.A08().ABC(A00(89, 14, 19), 3600, new com.facebook.ads.redexgen.core.C1049Te(A00(32, 35, 85)));
            return;
        }
        this.A03.A08(view);
    }

    @Override // com.facebook.ads.redexgen.core.VM
    public final void AKn(android.view.View view, java.lang.String str, boolean z) {
        AKo(view, str, z, false);
    }

    @Override // com.facebook.ads.redexgen.core.VM
    public final void AKo(android.view.View view, java.lang.String str, boolean z, boolean z2) {
        AKp(view, str, z, z2, false);
    }

    @Override // com.facebook.ads.redexgen.core.VM
    public final void AKp(android.view.View view, java.lang.String str, boolean z, boolean z2, boolean z3) {
        if (view != null) {
            this.A00 = new com.facebook.ads.redexgen.core.ViewOnAttachStateChangeListenerC1148Xe(view, this.A02);
            this.A03.A0A(this.A00, view);
            if (z2) {
                this.A00.A04();
            }
            this.A01 = com.facebook.ads.redexgen.core.C2245rN.A00(new com.facebook.ads.redexgen.core.C1093Uw(this.A02, view, str, z, z3), new com.facebook.ads.redexgen.core.V1(), A06).A06(new com.facebook.ads.redexgen.core.C1149Xf(new com.facebook.ads.redexgen.core.XM())).A07();
            this.A03.A09(view, this.A01);
            return;
        }
        this.A02.A08().ABC(A00(89, 14, 19), 3600, new com.facebook.ads.redexgen.core.C1049Te(A00(0, 32, 98)));
    }
}
