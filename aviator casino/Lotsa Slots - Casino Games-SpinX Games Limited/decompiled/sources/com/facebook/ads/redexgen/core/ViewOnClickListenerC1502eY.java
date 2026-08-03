package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.eY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1502eY implements android.view.View.OnClickListener {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"6oymiTsLeOB6akVZhYZlzt9u0lzod266", "zcFrhgW", "pA0IIkGKiekAr0fjB", "y6hjg8mxqAalWUMcxQuHYQOItnPT39hG", "7U0TsM6", "Tg7m67O8vHVp5z623KOmUlfZNUrkO0e2", "eZwTRoaquQnWH3ejc5rSlBlQZkiVI59b", "AT7ca5j6uH8ZMFY8gdhWcohA"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.FO A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] - i3) - 52);
            java.lang.String[] strArr = A02;
            if (strArr[4].length() == strArr[2].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A02;
            strArr2[7] = "b4q8hXeVYJWgCCKNMDRDzuby";
            strArr2[1] = "dEe326h";
            copyOfRange[i4] = b;
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.DC2, 35, com.google.common.base.Ascii.NAK, 36};
    }

    static {
        A01();
    }

    public ViewOnClickListenerC1502eY(com.facebook.ads.redexgen.core.FO fo) {
        this.A00 = fo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr;
        com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr2;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            viewOnClickListenerC0834Kr = this.A00.A06;
            if (viewOnClickListenerC0834Kr != null) {
                viewOnClickListenerC0834Kr2 = this.A00.A06;
                viewOnClickListenerC0834Kr2.A0E(A00(0, 8, 125));
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
            java.lang.String[] strArr = A02;
            if (strArr[4].length() == strArr[2].length()) {
                throw new java.lang.RuntimeException();
            }
            A02[6] = "NoOvb1ER3rIaV6vkspGGWoVzXAP3qQ3Z";
        }
    }
}
