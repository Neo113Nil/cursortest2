package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.n2, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1996n2 implements com.facebook.ads.redexgen.core.G5 {
    public static byte[] A01;
    public final android.view.WindowManager A00;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 115);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-7, -21, -16, -26, -15, -7};
    }

    public C1996n2(android.view.WindowManager windowManager) {
        this.A00 = windowManager;
    }

    public static com.facebook.ads.redexgen.core.C1996n2 A00(android.content.Context context) {
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService(A01(0, 6, 15));
        if (windowManager != null) {
            return new com.facebook.ads.redexgen.core.C1996n2(windowManager);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.G5
    public final void AHX(com.facebook.ads.redexgen.core.G4 g4) {
        g4.ADd(this.A00.getDefaultDisplay());
    }

    @Override // com.facebook.ads.redexgen.core.G5
    public final void AKW() {
    }
}
