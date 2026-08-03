package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.eA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1479eA implements com.facebook.ads.redexgen.core.InterfaceC1129Wi {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"cL9KuymxmXYmG8NC9NVGcaGlfdWWeniK", "Nk16ts9BY6zqy", "EgJ1qeWjq2zhUumNQfvGHLF4hTEd3z2y", "RODoYaIjQAnjV1WNThn2vejpwKsM19Cc", "40Y1apu8pWAms0kzI1QlbJay1792dWSe", "dN3sSSJjIpaTvjnI8sFpNb6rIgDjDuKA", "fmvlDKN6b1IL1", "7gRFv5vnh1tPqRcG4sTxqyzgIBUkam47"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1632ge A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 58);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        java.lang.String[] strArr = A02;
        if (strArr[1].length() != strArr[6].length()) {
            throw new java.lang.RuntimeException();
        }
        A02[0] = "cTAx5t1qCw5Hmq8oguM2xeNpSThd5fgi";
        A01 = new byte[]{-47, -51, -52, 0, -17, -12, -16, -7, -18, -16, -39, -16, -1, 2, -6, -3, -10, -5, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.VT, 9, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.VT, 10, -58, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.CAN, -44, -94, -79, -96, -78, -89, -98, -78, -89, -88, -92, -85, -93};
    }

    static {
        A01();
    }

    public C1479eA(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        this.A00 = c1632ge;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1129Wi
    public final void AAx(int i, java.lang.Throwable th) {
        android.util.Log.e(A00(0, 17, 81), A00(17, 17, 108), th);
        this.A00.A08().ABC(A00(34, 12, 5), i, new com.facebook.ads.redexgen.core.C1049Te(th));
    }
}
