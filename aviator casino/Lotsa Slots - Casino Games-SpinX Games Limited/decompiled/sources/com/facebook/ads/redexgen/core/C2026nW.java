package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.nW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2026nW implements com.facebook.ads.redexgen.core.AnonymousClass24 {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"kjXOolT", "y1uosoppcQ2KAnagmdUHUDs2pqKkNOP", "9S5fCrLfVI6Z6wWSlA", "LW4KLvv", "ESAoxwChDjEBJ2YD38hEjiU5IsN", "MD8cz6uZEkXt7x64XO0blzPRBkN5Dhm8", "wv8vTraLOdvtLK52tGc0aCYgNtDO0cFF", "ftZS2reRIxcEfCn6parOlN78mV3R9Y2K"};
    public static final com.facebook.ads.redexgen.core.AnonymousClass23<com.facebook.ads.redexgen.core.C2026nW> A05;
    public static final com.facebook.ads.redexgen.core.C2026nW A06;
    public static final java.lang.String A07;
    public int A00;
    public final int A01;
    public final com.facebook.ads.redexgen.core.BP<com.facebook.ads.redexgen.core.C2159pg> A02;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 95);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {119, 79, 86, 78, 83, 74, 86, 95, com.google.common.base.Ascii.SUB, 83, 94, 95, 84, 78, 83, 89, 91, 86, com.google.common.base.Ascii.SUB, 110, 72, 91, 89, 81, 125, 72, 85, 79, 74, 73, com.google.common.base.Ascii.SUB, 91, 94, 94, 95, 94, com.google.common.base.Ascii.SUB, 78, 85, com.google.common.base.Ascii.SUB, 85, 84, 95, com.google.common.base.Ascii.SUB, 110, 72, 91, 89, 81, 125, 72, 85, 79, 74, 123, 72, 72, 91, 67, com.google.common.base.Ascii.DC4, 81, 119, 100, 102, 110, 66, 119, 106, 112, 117, 68, 119, 119, 100, 124};
        if (A04[5].charAt(31) == 'Q') {
            throw new java.lang.RuntimeException();
        }
        A04[4] = "LoVxB454";
        A03 = bArr;
    }

    static {
        A03();
        A06 = new com.facebook.ads.redexgen.core.C2026nW(new com.facebook.ads.redexgen.core.C2159pg[0]);
        A07 = com.facebook.ads.redexgen.core.C5C.A0h(0);
        A05 = new com.facebook.ads.redexgen.core.AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.nX
            @Override // com.facebook.ads.redexgen.core.AnonymousClass23
            public final com.facebook.ads.redexgen.core.AnonymousClass24 A6f(android.os.Bundle bundle) {
                return com.facebook.ads.redexgen.core.C2026nW.A00(bundle);
            }
        };
    }

    public C2026nW(com.facebook.ads.redexgen.core.C2159pg... c2159pgArr) {
        this.A02 = com.facebook.ads.redexgen.core.BP.A07(c2159pgArr);
        this.A01 = c2159pgArr.length;
        A02();
    }

    public static /* synthetic */ com.facebook.ads.redexgen.core.C2026nW A00(android.os.Bundle bundle) {
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(A07);
        if (parcelableArrayList == null) {
            return new com.facebook.ads.redexgen.core.C2026nW(new com.facebook.ads.redexgen.core.C2159pg[0]);
        }
        return new com.facebook.ads.redexgen.core.C2026nW((com.facebook.ads.redexgen.core.C2159pg[]) com.facebook.ads.redexgen.core.AnonymousClass44.A01(com.facebook.ads.redexgen.core.C2159pg.A06, parcelableArrayList).toArray(new com.facebook.ads.redexgen.core.C2159pg[0]));
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /* JADX WARN: Incorrect condition in loop: B:6:0x0011 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A02() {
        for (int i = 0; i < i; i++) {
            for (int i2 = i + 1; i2 < i; i2++) {
                if (this.A02.get(i).equals(this.A02.get(i2))) {
                    com.facebook.ads.redexgen.core.AbstractC04284g.A08(A01(60, 15, 90), A01(0, 0, 115), new java.lang.IllegalArgumentException(A01(0, 60, 101)));
                }
            }
        }
    }

    public final int A04(com.facebook.ads.redexgen.core.C2159pg c2159pg) {
        int index = this.A02.indexOf(c2159pg);
        if (index >= 0) {
            return index;
        }
        return -1;
    }

    public final com.facebook.ads.redexgen.core.C2159pg A05(int i) {
        return this.A02.get(i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.redexgen.core.C2026nW c2026nW = (com.facebook.ads.redexgen.core.C2026nW) obj;
        return this.A01 == c2026nW.A01 && this.A02.equals(c2026nW.A02);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = this.A02.hashCode();
        }
        int i = this.A00;
        java.lang.String[] strArr = A04;
        if (strArr[3].length() != strArr[0].length()) {
            throw new java.lang.RuntimeException();
        }
        A04[6] = "ifk0Ba0Zppjn7MlaJBrmzFqZbJ0HKklT";
        return i;
    }
}
