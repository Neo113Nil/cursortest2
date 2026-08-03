package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class CI implements com.facebook.ads.redexgen.core.InterfaceC1686hW {
    public static byte[] A02;
    public static final com.facebook.ads.redexgen.core.CI A03;
    public java.lang.String A01 = A01(1, 7, 98);
    public int A00 = 5;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 42);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A05() {
        A02 = new byte[]{-33, 1, -6, -9, -6, -5, 3, -6};
    }

    static {
        A05();
        A03 = new com.facebook.ads.redexgen.core.CI();
    }

    public static com.facebook.ads.redexgen.core.CI A00() {
        return A03;
    }

    private java.lang.String A02(java.lang.String str) {
        if (this.A01 != null) {
            return this.A01 + A01(0, 1, 123) + str;
        }
        return str;
    }

    public static java.lang.String A03(java.lang.String str, java.lang.Throwable th) {
        return str + '\n' + A04(th);
    }

    public static java.lang.String A04(java.lang.Throwable th) {
        if (th == null) {
            return A01(0, 0, 21);
        }
        return android.util.Log.getStackTraceString(th);
    }

    private void A06(int i, java.lang.String str, java.lang.String str2) {
        android.util.Log.println(i, A02(str), str2);
    }

    private void A07(int i, java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        android.util.Log.println(i, A02(str), A03(str2, th));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1686hW
    public final void A9t(java.lang.String str, java.lang.String str2) {
        A06(4, str, str2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1686hW
    public final void A9u(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        A07(4, str, str2, th);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1686hW
    public final boolean AAY(int i) {
        return this.A00 <= i;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1686hW
    public final void AJY(int i) {
        this.A00 = i;
    }
}
