package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.cE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1360cE implements android.view.View.OnClickListener {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"QT04eFLa9mjEfMLd", "wn7Oy4ZvyPX", "JdVOIkh1rweljXiNlmOrPPxbj76ouIw4", "8", "HoYvJWyWnzW9xQrMEDuDE8k", "", "4NNWhWDRRxnZXe7GAIP6Nv2mv9IaX8G8", "Hy00I9bleYebYRTE8UzaGRkCp9A9i8E3"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.KU A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + androidx.media3.common.PlaybackException.ERROR_CODE_SETUP_REQUIRED);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SYN};
    }

    static {
        A01();
    }

    public ViewOnClickListenerC1360cE(com.facebook.ads.redexgen.core.KU ku) {
        this.A00 = ku;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A0E(A00(0, 5, 69));
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
            java.lang.String[] strArr = A02;
            if (strArr[1].length() == strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A02;
            strArr2[2] = "gqn3ITnmd8SVLq3knr5xxRJ0pveQ6sYL";
            strArr2[7] = "MdUyII5PUBg9MBmNc1g4VKtuuD0LDq6P";
        }
    }
}
