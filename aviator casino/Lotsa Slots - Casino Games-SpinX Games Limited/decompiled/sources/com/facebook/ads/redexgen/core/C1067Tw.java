package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Tw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1067Tw {
    public static byte[] A0B;
    public static java.lang.String[] A0C = {"HvWirbE21CthcAzglwYfTu8hbbodSMpt", "IeFog7wu84ahUP8wrgQRktORVTrd36mu", "iK4FOuTHNOskZfjZXsfgR2qFw0uXKXeK", "C94HT2jeMQxh5gbTQbuMo6", "sYjDRqqzhUlQiHGhQNwIRm9nE6", "ToeXfBs6HhTxzZ9ArPJAGMlk", "KWsBEUuyQyen4sbZ9JEq20dYDlqTcXTf", "JMF3DYKQmRYKnieuthRXwzFPxh0qj8YI"};
    public com.facebook.ads.redexgen.core.C1068Tx A01;
    public com.facebook.ads.internal.protocol.AdPlacementType A02;
    public java.lang.String A03;
    public java.lang.String A04;
    public java.lang.String A05;
    public java.lang.String A06;
    public java.lang.String A07;
    public org.json.JSONObject A09;
    public final boolean A0A;
    public int A00 = 0;
    public java.util.List<com.facebook.ads.redexgen.core.C1065Tu> A08 = new java.util.ArrayList();

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 86);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A0B = new byte[]{-8, 9};
    }

    static {
        A01();
    }

    public C1067Tw(com.facebook.ads.redexgen.core.C1068Tx c1068Tx, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z) {
        this.A01 = c1068Tx;
        this.A05 = str;
        this.A03 = str2;
        this.A06 = str3;
        this.A04 = str4;
        this.A07 = str5;
        if (this.A01 != null) {
            this.A02 = this.A01.A0D();
        }
        this.A0A = z;
    }

    public final int A02() {
        return this.A08.size();
    }

    public final long A03() {
        if (this.A01 != null) {
            return this.A01.A0C() + this.A01.A03();
        }
        return -1L;
    }

    public final com.facebook.ads.redexgen.core.C1065Tu A04() {
        if (this.A00 < this.A08.size()) {
            this.A00++;
            return this.A08.get(this.A00 - 1);
        }
        return null;
    }

    public final com.facebook.ads.redexgen.core.C1068Tx A05() {
        return this.A01;
    }

    public final com.facebook.ads.internal.protocol.AdPlacementType A06() {
        return this.A02;
    }

    public final java.lang.String A07() {
        return this.A03;
    }

    public final java.lang.String A08() {
        return this.A04;
    }

    public final java.lang.String A09() {
        if (this.A00 > 0) {
            int i = this.A00;
            if (A0C[2].charAt(13) != 'f') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0C;
            strArr[4] = "rOOT956xIOu8KS0VzerRP9k2FI";
            strArr[3] = "CsBaNUluQU2chTuAQUApCe";
            if (i <= this.A08.size()) {
                return this.A08.get(this.A00 - 1).A04().optString(A00(0, 2, 63));
            }
        }
        if (A0C[7].charAt(12) != 'n') {
            return null;
        }
        A0C[2] = "3lTgH9thszczufuEmz4eSAEm15D6iTfe";
        return null;
    }

    public final java.lang.String A0A() {
        return this.A05;
    }

    public final java.lang.String A0B() {
        com.facebook.ads.redexgen.core.C1065Tu c1065Tu;
        if (this.A08.isEmpty() || (c1065Tu = this.A08.get(0)) == null || c1065Tu.A04() == null) {
            return null;
        }
        return c1065Tu.A04().optString(A00(0, 2, 63));
    }

    public final java.lang.String A0C() {
        return this.A06;
    }

    public final java.lang.String A0D() {
        return this.A07;
    }

    public final org.json.JSONObject A0E() {
        return this.A09;
    }

    public final void A0F(com.facebook.ads.redexgen.core.C1065Tu c1065Tu) {
        this.A08.add(c1065Tu);
    }

    public final void A0G(org.json.JSONObject jSONObject) {
        this.A09 = jSONObject;
    }

    public final boolean A0H() {
        return this.A0A;
    }

    public final boolean A0I() {
        return this.A01 == null || com.facebook.ads.redexgen.core.Y1.A00() > this.A01.A0C() + ((long) this.A01.A03());
    }
}
