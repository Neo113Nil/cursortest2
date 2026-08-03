package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Pp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0959Pp implements com.facebook.ads.redexgen.core.YT {
    public static byte[] A04;
    public com.facebook.ads.redexgen.core.C1632ge A00;
    public com.facebook.ads.redexgen.core.C1067Tw A01;
    public com.facebook.ads.redexgen.core.InterfaceC1587fv A02;
    public final java.util.concurrent.Executor A03;

    static {
        A06();
    }

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 53);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A06() {
        A04 = new byte[]{98, 103, 103, 97, 100, 105, 97, 99, 102, 98, 99, 96, 103, 97, 98, 92, 87, 89, 94, 93, 91, 90, 92, 94, 86, 86, 91, 90, 93, 90, 95, 80, 90, 80, 92, 90, 80, 93, 89, 80, 80, 94, 80, 89, 88, com.google.common.base.Ascii.NAK, 80, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SI, 91, 80, 8, 88, com.google.common.base.Ascii.SI, 91, 94, 93, 92, 94, 93, 95, 8, 95, 10, 95, 89, com.google.common.base.Ascii.CR, 94, 89, 94, com.google.common.base.Ascii.SI, 92, com.google.common.base.Ascii.VT, 10, 91, 90, 10, 91, 94, 124, 115, 126, 120, 113, 109, 65, 89, 0, 79, 84, 72, 69, 82, 83, 0, 76, 79, 71, 73, 78, 0, 65, 83, 0, 89, 79, 85, 0, 84, 79, 0, 68, 69, 66, 85, 71, com.google.common.base.Ascii.US, 0, 104, 79, 87, 0, 68, 79, 0, 89, 79, 85, 0, 82, 69, 80, 82, 79, 68, 85, 67, 69, 0, 84, 72, 69, 0, 73, 83, 83, 85, 69, com.google.common.base.Ascii.US, 53, 3, 8, 2, 70, 52, 3, com.google.common.base.Ascii.SYN, 9, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.DC2, 62, 1, 8, com.google.common.base.Ascii.GS, 73, 33, 8, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.FF, 7, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.CR, 86, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.US, 9, 9, 37, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.NAK, 17, com.google.common.base.Ascii.US, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.US, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.NAK, 8, 3, 37, 19, com.google.common.base.Ascii.RS, 47, 32, 37, 41, 34, 56, 19, 56, 37, 33, 41, 99, 108, 105, 101, 110, 116, 95, 116, 111, 107, 101, 110, 89, 85, 84, 92, 83, 93, 101, 83, 94, 1, 0, com.google.common.base.Ascii.SYN, 6, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.NAK, 17, com.google.common.base.Ascii.FF, 10, com.google.common.base.Ascii.VT, 47, 39, 54, 35, 38, 35, 54, 35, 57, kotlin.io.encoding.Base64.padSymbol, 39, 55, com.google.common.base.Ascii.VT, kotlin.io.encoding.Base64.padSymbol, 58, 50, 59, 116, 114, 100, 115, 94, 104, 101, 100, 111, 117, 104, 103, 104, 100, 115};
    }

    public C0959Pp(java.util.concurrent.Executor executor, com.facebook.ads.redexgen.core.C1067Tw c1067Tw, com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        this.A00 = c1636gi.A02();
        this.A02 = com.facebook.ads.redexgen.core.C1605gD.A01(this.A00);
        this.A03 = executor;
        this.A01 = c1067Tw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.Map<java.lang.String, java.lang.String> A02(java.lang.String str) {
        com.facebook.ads.redexgen.core.C1601g9 c1601g9 = new com.facebook.ads.redexgen.core.C1601g9();
        com.facebook.ads.redexgen.core.C1601g9 c1601g92 = new com.facebook.ads.redexgen.core.C1601g9();
        com.facebook.ads.redexgen.core.C1601g9 c1601g93 = new com.facebook.ads.redexgen.core.C1601g9();
        c1601g9.put(A03(257, 15, 52), com.facebook.ads.redexgen.core.SZ.A00().A03());
        c1601g9.put(A03(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 9, 15), A03(15, 15, 91));
        c1601g9.put(A03(186, 11, 79), A03(0, 15, 101));
        c1601g9.put(A03(174, 12, 79), A03(30, 48, 92));
        c1601g9.put(A03(197, 11, 121), (java.lang.System.currentTimeMillis() / 1000) + A03(0, 0, 108));
        java.lang.String A09 = this.A01.A09();
        if (A09 != null) {
            c1601g93.put(A03(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 12, 53), A09);
        }
        c1601g92.put(A03(229, 11, 80), str);
        c1601g92.put(A03(248, 9, 97), com.facebook.ads.redexgen.core.AbstractC1147Xd.A01(c1601g93));
        c1601g9.A04(A03(240, 8, 119), com.facebook.ads.redexgen.core.AbstractC1147Xd.A01(c1601g92));
        return c1601g9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(com.facebook.ads.redexgen.core.C1067Tw c1067Tw) {
        this.A01 = c1067Tw;
    }

    @Override // com.facebook.ads.redexgen.core.YT
    public final void AFv() {
        android.app.Activity A00 = com.facebook.ads.internal.util.activity.ActivityUtils.A00();
        if (A00 == null) {
            return;
        }
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(A00);
        builder.setTitle(A03(160, 14, 92));
        android.widget.EditText editText = new android.widget.EditText(A00);
        editText.setSingleLine(false);
        editText.setImeOptions(1073741824);
        editText.setHint(A03(84, 65, 21));
        editText.setMaxLines(2);
        editText.setMinLines(2);
        builder.setView(editText);
        builder.setNegativeButton(A03(78, 6, 40), new com.facebook.ads.redexgen.core.YQ(this));
        builder.setPositiveButton(A03(149, 11, 83), new com.facebook.ads.redexgen.core.YR(this, editText));
        builder.create().show();
    }
}
