package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.n1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1995n1 implements com.facebook.ads.redexgen.core.G5, android.hardware.display.DisplayManager.DisplayListener {
    public static byte[] A02;
    public com.facebook.ads.redexgen.core.G4 A00;
    public final android.hardware.display.DisplayManager A01;

    static {
        A03();
    }

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + androidx.media3.common.PlaybackException.ERROR_CODE_NOT_AVAILABLE_IN_REGION);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.FF, 36};
    }

    public C1995n1(android.hardware.display.DisplayManager displayManager) {
        this.A01 = displayManager;
    }

    private android.view.Display A00() {
        return this.A01.getDisplay(0);
    }

    public static com.facebook.ads.redexgen.core.C1995n1 A01(android.content.Context context) {
        android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) context.getSystemService(A02(0, 7, 65));
        if (displayManager != null) {
            return new com.facebook.ads.redexgen.core.C1995n1(displayManager);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.G5
    public final void AHX(com.facebook.ads.redexgen.core.G4 g4) {
        this.A00 = g4;
        this.A01.registerDisplayListener(this, com.facebook.ads.redexgen.core.C5C.A0Y());
        g4.ADd(A00());
    }

    @Override // com.facebook.ads.redexgen.core.G5
    public final void AKW() {
        this.A01.unregisterDisplayListener(this);
        this.A00 = null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (this.A00 != null && i == 0) {
            this.A00.ADd(A00());
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
