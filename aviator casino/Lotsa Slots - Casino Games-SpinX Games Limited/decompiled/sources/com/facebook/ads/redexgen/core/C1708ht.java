package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ht, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1708ht implements com.facebook.ads.redexgen.core.InterfaceC0978Qk {
    public static byte[] A07;
    public static java.lang.String[] A08 = {"t5607oHfL2MNwmRFcsOr1jnyxzutumg5", "jNVCF7hNBx7qTlxJtSxtZf62y0YMH9ti", "vdh53KDEVDvYPF4U9zJ9CmemLfeqkfcW", "xmowDJGre", "ZTG0qcJaBRai17vkpDLZ7jbeFwjjrIPL", "kzc7Q54viT3CLivIFTQawvhHzc5bSJU6", "6m9Kb2lg4QS4P0ZcGJ2XwsRwfv4UyCAv", "gH"};
    public int A00;
    public com.facebook.ads.redexgen.core.PD<com.facebook.ads.redexgen.core.QN> A01;
    public final com.facebook.ads.redexgen.core.QM A02;
    public final com.facebook.ads.redexgen.core.C0979Ql A03;
    public final java.util.ArrayList<com.facebook.ads.redexgen.core.QN> A04;
    public final java.util.ArrayList<com.facebook.ads.redexgen.core.QN> A05;
    public final boolean A06;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 10);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DLE, 19, 2, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FF, 2, 7};
    }

    static {
        A02();
    }

    public C1708ht(com.facebook.ads.redexgen.core.QM qm) {
        this(qm, false);
    }

    public C1708ht(com.facebook.ads.redexgen.core.QM qm, boolean z) {
        this.A01 = new com.facebook.ads.redexgen.core.C1719i6(30);
        this.A04 = new java.util.ArrayList<>();
        this.A05 = new java.util.ArrayList<>();
        this.A00 = 0;
        this.A02 = qm;
        this.A06 = z;
        this.A03 = new com.facebook.ads.redexgen.core.C0979Ql(this);
    }

    private final int A00(int i, int i2) {
        int count = this.A05.size();
        if (i2 < count) {
            this.A05.get(i2);
            throw new java.lang.NullPointerException(A01(0, 3, 126));
        }
        return i;
    }

    private final void A03(java.util.List<com.facebook.ads.redexgen.core.QN> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i);
            A0A(null);
        }
        list.clear();
        if (A08[1].charAt(29) != '9') {
            throw new java.lang.RuntimeException();
        }
        A08[2] = "ayjYK9F9Z6sDhNCNS52R1Qcr5XRGx639";
    }

    public final int A04(int i) {
        return A00(i, 0);
    }

    public final int A05(int i) {
        int size = this.A04.size();
        if (0 < size) {
            this.A04.get(0);
            throw new java.lang.NullPointerException(A01(0, 3, 126));
        }
        return i;
    }

    public final void A06() {
        int count = this.A05.size();
        if (0 < count) {
            com.facebook.ads.redexgen.core.QM qm = this.A02;
            this.A05.get(0);
            java.lang.String[] strArr = A08;
            java.lang.String str = strArr[0];
            java.lang.String str2 = strArr[4];
            int i = str.charAt(3);
            int count2 = str2.charAt(3);
            if (i != count2) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A08;
            strArr2[0] = "Yhl0jQrdp33aIQ4Nx5XRCxKVlJRMQ99k";
            strArr2[4] = "te80aWrb7iKuE4ta48s0tNKQ3kiAwVCD";
            qm.ADg(null);
            throw null;
        }
        A03(this.A05);
        this.A00 = 0;
    }

    public final void A07() {
        A06();
        int count = this.A04.size();
        if (0 < count) {
            this.A04.get(0);
            throw new java.lang.NullPointerException(A01(0, 3, 126));
        }
        A03(this.A04);
        this.A00 = 0;
    }

    public final void A08() {
        this.A03.A04(this.A04);
        int count = this.A04.size();
        if (0 < count) {
            this.A04.get(0);
            throw new java.lang.NullPointerException(A01(0, 3, 126));
        }
        this.A04.clear();
    }

    public final void A09() {
        A03(this.A04);
        A03(this.A05);
        this.A00 = 0;
    }

    public final void A0A(com.facebook.ads.redexgen.core.QN qn) {
        if (!this.A06) {
            throw new java.lang.NullPointerException(A01(3, 7, 105));
        }
    }

    public final boolean A0B() {
        return this.A04.size() > 0;
    }

    public final boolean A0C() {
        return (this.A05.isEmpty() || this.A04.isEmpty()) ? false : true;
    }

    public final boolean A0D(int i) {
        return (this.A00 & i) != 0;
    }
}
