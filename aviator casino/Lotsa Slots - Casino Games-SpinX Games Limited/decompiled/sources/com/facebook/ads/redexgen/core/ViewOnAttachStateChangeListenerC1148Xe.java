package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Xe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class ViewOnAttachStateChangeListenerC1148Xe extends com.facebook.ads.redexgen.core.AbstractC2243rL implements android.view.View.OnAttachStateChangeListener {
    public static byte[] A02;
    public final android.view.View A00;
    public final com.facebook.ads.redexgen.core.C1632ge A01;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 40);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{Byte.MAX_VALUE, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 76, 94, 89, 70, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 71, 93, 9, Byte.MAX_VALUE, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 76, 94, 9, 69, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 79, 76, 74, 80, 74, 69, 76, 9, 74, 91, 72, 90, 65, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 71, 78, 9, 90, 93, 72, 91, 93, 122, 74, 72, 71, 9, 9, com.google.common.base.Ascii.VT, 52, 56, 42, 45, 50, 52, 51, 41, 125, com.google.common.base.Ascii.VT, 52, 56, 42, 125, 49, 52, 59, 56, 62, 36, 62, 49, 56, 125, 62, 47, 60, 46, 53, 52, 51, 58, 125, 46, 41, 60, 47, 41, com.google.common.base.Ascii.SO, 62, 60, 51, 19, 50, 42, 125, 125, 103, 88, 84, 70, 65, 94, 88, 95, 69, 17, 103, 88, 84, 70, 17, 93, 88, 87, 84, 82, 72, 82, 93, 84, 17, 82, 67, 80, 66, 89, 88, 95, 86, 17, 66, 69, 94, 65, 98, 82, 80, 95, 17, 17, 8, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.US, 36, com.google.common.base.Ascii.CAN, 19, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.ETB};
    }

    public ViewOnAttachStateChangeListenerC1148Xe(android.view.View view, com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        this.A00 = view;
        this.A01 = c1632ge;
        this.A00.addOnAttachStateChangeListener(this);
        if (A05()) {
            try {
                A00();
            } catch (java.lang.Throwable th) {
                this.A01.A08().ABC(A00(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 14, 83), 3600, new com.facebook.ads.redexgen.core.C1049Te(A00(0, 45, 1) + th.getMessage()));
            }
        }
    }

    public final void A04() {
        try {
            A00();
        } catch (java.lang.Throwable th) {
            this.A01.A08().ABC(A00(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 14, 83), 3600, new com.facebook.ads.redexgen.core.C1049Te(A00(45, 48, 117) + th.getMessage()));
        }
    }

    public final boolean A05() {
        return com.facebook.ads.redexgen.core.Ph.A0H(this.A00);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        try {
            A00();
        } catch (java.lang.Throwable th) {
            this.A01.A08().ABC(A00(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 14, 83), 3600, new com.facebook.ads.redexgen.core.C1049Te(A00(0, 45, 1) + th.getMessage()));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        try {
            A02();
        } catch (java.lang.Throwable th) {
            this.A01.A08().ABC(A00(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 14, 83), 3600, new com.facebook.ads.redexgen.core.C1049Te(A00(93, 44, 25) + th.getMessage()));
        }
    }
}
