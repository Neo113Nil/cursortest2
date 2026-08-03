package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ma, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1969ma extends com.facebook.ads.redexgen.core.AbstractC0760Hu {
    public static byte[] A06;
    public static java.lang.String[] A07 = {"k0wYTkKie1JHeFYg", "DKl7H6qsoN4MQmGVFxhVfc9YoKR", "eOp5RF4DxMr8YboQGZKTl4GQk1b", "2gSlciuhxyUpZq2z", "EzoVAngWIMXE2t797gVmsxYwwugMTqE8", "YSwU3mnkrzPmwh4w8hA9Gpc9iPzLacTq", "wmfh6", "T9R7fvqNl5WyvyD6SUGUJNeU84vDYmq7"};
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final com.facebook.ads.redexgen.core.C04434v A04;
    public final com.facebook.ads.redexgen.core.C04434v A05;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 64);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{68, 123, 118, 119, 125, 50, 116, 125, 96, Byte.MAX_VALUE, 115, 102, 50, 124, 125, 102, 50, 97, 103, 98, 98, 125, 96, 102, 119, 118, 40, 50, 43, 52, 57, 56, 50, 114, 60, 43, 62};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.AbstractC0760Hu
    public final boolean A0C(com.facebook.ads.redexgen.core.C04434v c04434v, long j) throws com.facebook.ads.redexgen.core.C3K {
        int A0I = c04434v.A0I();
        long A0D = j + (c04434v.A0D() * 1000);
        if (A0I == 0 && !this.A02) {
            com.facebook.ads.redexgen.core.C04434v c04434v2 = new com.facebook.ads.redexgen.core.C04434v(new byte[c04434v.A07()]);
            c04434v.A0k(c04434v2.A0l(), 0, c04434v.A07());
            com.facebook.ads.redexgen.core.C0735Gv A00 = com.facebook.ads.redexgen.core.C0735Gv.A00(c04434v2);
            this.A01 = A00.A02;
            super.A00.A6e(new com.facebook.ads.redexgen.core.C03872p().A11(A00(28, 9, 29)).A0w(A00.A04).A0r(A00.A03).A0f(A00.A01).A0Y(A00.A00).A12(A00.A05).A14());
            this.A02 = true;
            return false;
        }
        if (A0I != 1 || !this.A02) {
            return false;
        }
        int i = this.A00;
        if (A07[1].length() != 27) {
            throw new java.lang.RuntimeException();
        }
        A07[5] = "ywa4QqUhdtSZ68DIQ13xWUOznnvwilgI";
        boolean z = i == 1;
        if (A07[2].length() == 28) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A07;
        strArr[6] = "IIAwH";
        strArr[0] = "qu1M6PwQ9kLePSP6";
        if (!this.A03 && !z) {
            return false;
        }
        byte[] A0l = this.A04.A0l();
        A0l[0] = 0;
        A0l[1] = 0;
        A0l[2] = 0;
        int i2 = 4 - this.A01;
        int i3 = 0;
        while (c04434v.A07() > 0) {
            c04434v.A0k(this.A04.A0l(), i2, this.A01);
            this.A04.A0f(0);
            int A0L = this.A04.A0L();
            this.A05.A0f(0);
            super.A00.AIr(this.A05, 4);
            super.A00.AIr(c04434v, A0L);
            i3 = i3 + 4 + A0L;
        }
        super.A00.AIu(A0D, z ? 1 : 0, i3, 0, null);
        this.A03 = true;
        return true;
    }

    static {
        A01();
    }

    public C1969ma(com.facebook.ads.redexgen.core.InterfaceC0743Hd interfaceC0743Hd) {
        super(interfaceC0743Hd);
        this.A05 = new com.facebook.ads.redexgen.core.C04434v(com.facebook.ads.redexgen.core.HS.A03);
        this.A04 = new com.facebook.ads.redexgen.core.C04434v(4);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0760Hu
    public final boolean A0B(com.facebook.ads.redexgen.core.C04434v c04434v) throws com.facebook.ads.redexgen.core.C1970mb {
        int A0I = c04434v.A0I();
        int header = A0I >> 4;
        int frameType = header & 15;
        int i = A0I & 15;
        if (i == 7) {
            this.A00 = frameType;
            return frameType != 5;
        }
        throw new com.facebook.ads.redexgen.core.C1970mb(A00(0, 28, 82) + i);
    }
}
