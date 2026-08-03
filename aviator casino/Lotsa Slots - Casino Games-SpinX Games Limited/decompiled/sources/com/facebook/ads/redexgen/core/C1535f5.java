package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.f5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1535f5 implements com.facebook.ads.redexgen.core.TP {
    public static byte[] A04;
    public android.content.Context A00;
    public final com.facebook.ads.redexgen.core.TO A02;
    public final java.util.concurrent.atomic.AtomicBoolean A03 = new java.util.concurrent.atomic.AtomicBoolean(false);
    public com.facebook.ads.redexgen.core.TM A01 = A00();

    static {
        A03();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 81);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{113, 101, 122, 106, 102, 112, 97, 97, 124, 123, 114, 102, 106, 126, 112, 108};
    }

    public C1535f5(android.content.Context context, com.facebook.ads.redexgen.core.TO to) {
        this.A00 = context;
        this.A02 = to;
    }

    private com.facebook.ads.redexgen.core.TM A00() {
        return com.facebook.ads.redexgen.core.TM.A00(com.facebook.ads.redexgen.core.WN.A00(this.A00).getString(A01(0, 16, 100), null));
    }

    private void A02() {
        this.A02.ACV(new com.facebook.ads.redexgen.core.C1540fA(this));
    }

    public final void A04(java.lang.String[] strArr, java.lang.Integer num, java.lang.Integer num2) {
        com.facebook.ads.redexgen.core.TM tm = new com.facebook.ads.redexgen.core.TM(strArr, num, num2);
        com.facebook.ads.redexgen.core.TM newSettings = this.A01;
        if (tm.equals(newSettings)) {
            return;
        }
        this.A01 = tm;
        this.A03.set(true);
        android.content.SharedPreferences.Editor edit = com.facebook.ads.redexgen.core.WN.A00(this.A00).edit();
        com.facebook.ads.redexgen.core.TM newSettings2 = this.A01;
        edit.putString(A01(0, 16, 100), newSettings2.A07()).apply();
    }

    @Override // com.facebook.ads.redexgen.core.TP
    public final com.facebook.ads.redexgen.core.TM A7k() {
        A02();
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.TP
    public final boolean AAh() {
        A02();
        if (this.A01 == null) {
            return false;
        }
        java.util.Set<java.lang.String> A0a = com.facebook.ads.redexgen.core.C1086Up.A0a(this.A00);
        java.lang.String identifier = this.A01.A07();
        java.util.Iterator<java.lang.String> it = A0a.iterator();
        while (it.hasNext()) {
            if (identifier.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.TP
    public final boolean AJw() {
        A02();
        return this.A03.getAndSet(false);
    }
}
