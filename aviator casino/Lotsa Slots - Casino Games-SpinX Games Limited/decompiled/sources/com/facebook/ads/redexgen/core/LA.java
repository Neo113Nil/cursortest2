package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class LA {
    public static byte[] A09;
    public static java.lang.String[] A0A = {"YKrx4tQL3HFlbX0m6cI7YSMmMtJDnVWt", "EhNKRydGslBNjHwz4Qke8RkUgCBaonuc", "lVt1vjccWtobRJMyEDSjQomkweVugX5V", "X5vaF2wJa8umjlLI", "q53FR06vPOBUDZ08SG0Q3HmIsvEwqM01", "eDYPuZuNQVkkkUOb40HZTr2GxKWyUyQ4", "7DZ3geXrHcZNODb56yin0lXQD6ovjT1O", "oKDHpDD8v386AT9biWd"};
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final com.facebook.ads.redexgen.core.AnonymousClass53 A08 = new com.facebook.ads.redexgen.core.AnonymousClass53(0);
    public long A01 = -9223372036854775807L;
    public long A02 = -9223372036854775807L;
    public long A00 = -9223372036854775807L;
    public final com.facebook.ads.redexgen.core.C04434v A07 = new com.facebook.ads.redexgen.core.C04434v();

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 17);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A06() {
        A09 = new byte[]{-89, -103, -50, -20, -30, -25, -32, -103, -51, -62, -58, -66, -40, -50, -57, -52, -66, -51, -103, -30, -25, -20, -19, -34, -38, -35, -89, -119, -82, -74, -95, -84, -87, -92, 96, -92, -75, -78, -95, -76, -87, -81, -82, 122, 96, -95, -64, -111, -62, -65, -82, -63, -74, -68, -69, -97, -78, -82, -79, -78, -65};
    }

    static {
        A06();
    }

    public LA(int i) {
        this.A06 = i;
    }

    private int A00(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) {
        this.A07.A0i(com.facebook.ads.redexgen.core.C5C.A07);
        this.A03 = true;
        interfaceC1987ms.AIl();
        return 0;
    }

    private int A01(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, com.facebook.ads.redexgen.core.HV hv, int i) throws java.io.IOException {
        int min = (int) java.lang.Math.min(this.A06, interfaceC1987ms.A8O());
        if (interfaceC1987ms.A8n() != 0) {
            hv.A00 = 0;
            return 1;
        }
        this.A07.A0d(min);
        interfaceC1987ms.AIl();
        interfaceC1987ms.AGt(this.A07.A0l(), 0, min);
        this.A01 = A03(this.A07, i);
        this.A04 = true;
        return 0;
    }

    private int A02(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, com.facebook.ads.redexgen.core.HV hv, int i) throws java.io.IOException {
        long inputLength = interfaceC1987ms.A8O();
        int min = (int) java.lang.Math.min(this.A06, inputLength);
        long inputLength2 = inputLength - min;
        if (interfaceC1987ms.A8n() != inputLength2) {
            hv.A00 = inputLength2;
            return 1;
        }
        this.A07.A0d(min);
        interfaceC1987ms.AIl();
        interfaceC1987ms.AGt(this.A07.A0l(), 0, min);
        this.A02 = A04(this.A07, i);
        this.A05 = true;
        return 0;
    }

    private long A03(com.facebook.ads.redexgen.core.C04434v c04434v, int i) {
        int A0A2 = c04434v.A0A();
        for (int A092 = c04434v.A09(); A092 < A0A2; A092++) {
            int searchEndPosition = c04434v.A0l()[A092];
            if (searchEndPosition == 71) {
                long A01 = com.facebook.ads.redexgen.core.LI.A01(c04434v, A092, i);
                if (A01 != -9223372036854775807L) {
                    return A01;
                }
            }
        }
        return -9223372036854775807L;
    }

    private long A04(com.facebook.ads.redexgen.core.C04434v c04434v, int i) {
        int A092 = c04434v.A09();
        int A0A2 = c04434v.A0A();
        for (int i2 = A0A2 - 188; i2 >= A092; i2--) {
            if (com.facebook.ads.redexgen.core.LI.A03(c04434v.A0l(), A092, A0A2, i2)) {
                long A01 = com.facebook.ads.redexgen.core.LI.A01(c04434v, i2, i);
                if (A01 != -9223372036854775807L) {
                    return A01;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int A07(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, com.facebook.ads.redexgen.core.HV hv, int i) throws java.io.IOException {
        if (i <= 0) {
            return A00(interfaceC1987ms);
        }
        if (!this.A05) {
            return A02(interfaceC1987ms, hv, i);
        }
        if (this.A02 == -9223372036854775807L) {
            return A00(interfaceC1987ms);
        }
        if (!this.A04) {
            int A01 = A01(interfaceC1987ms, hv, i);
            if (A0A[0].charAt(2) == 'O') {
                throw new java.lang.RuntimeException();
            }
            A0A[0] = "U4EwafF7WjzJM20D4nSEnM6oLnkPTMDI";
            return A01;
        }
        if (this.A01 == -9223372036854775807L) {
            return A00(interfaceC1987ms);
        }
        this.A00 = this.A08.A06(this.A02) - this.A08.A06(this.A01);
        if (this.A00 < 0) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(A05(45, 16, 60), A05(27, 18, 47) + this.A00 + A05(0, 27, 104));
            this.A00 = -9223372036854775807L;
        }
        return A00(interfaceC1987ms);
    }

    public final long A08() {
        return this.A00;
    }

    public final com.facebook.ads.redexgen.core.AnonymousClass53 A09() {
        return this.A08;
    }

    public final boolean A0A() {
        return this.A03;
    }
}
