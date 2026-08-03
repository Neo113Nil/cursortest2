package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.h6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1660h6 implements com.facebook.ads.redexgen.core.InterfaceC1034Sp {
    public static java.lang.String[] A02 = {"XqTxzibSN1zAjaiM9LtVSqsxSG", "xqN5bEwB0Nihon7KSuA", "FVkOY26I4teb9ftOLmk9A45ZS3TS2DIY", "wzTDEcMKt7VvW9W8eKeIWksTnJ0tE", "iGRCr9OHUARnshCNCmKS3XNzEIA09VDm", "MJLgHxMJm3Fw", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, "m77T1m6dtAhGTcgbhkAg"};
    public final java.util.List<com.facebook.ads.redexgen.core.C1818ju> A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1659h5 A01;

    public C1660h6(com.facebook.ads.redexgen.core.C1659h5 c1659h5, java.util.List<com.facebook.ads.redexgen.core.C1818ju> list) {
        this.A01 = c1659h5;
        this.A00 = list;
    }

    private void A00() {
        com.facebook.ads.redexgen.core.S6 s6;
        com.facebook.ads.redexgen.core.S6 s62;
        com.facebook.ads.redexgen.core.S6 s63;
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        com.facebook.ads.redexgen.core.S6 s64;
        com.facebook.ads.redexgen.core.S6 s65;
        com.facebook.ads.redexgen.core.C1636gi c1636gi2;
        com.facebook.ads.NativeAd.NativeOptions nativeOptions;
        s6 = this.A01.A01;
        s6.A05(true);
        s62 = this.A01.A01;
        s62.A02();
        s63 = this.A01.A01;
        s63.A03(0);
        java.util.Iterator<com.facebook.ads.redexgen.core.C1818ju> it = this.A00.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A02[4].charAt(3) == 'E') {
                throw new java.lang.RuntimeException();
            }
            A02[0] = "GKxyFdZ7ADxfGJ";
            if (hasNext) {
                com.facebook.ads.redexgen.core.C1818ju next = it.next();
                c1636gi = this.A01.A02;
                com.facebook.ads.redexgen.core.C1081Uk A0K = com.facebook.ads.redexgen.core.UK.A0K();
                s64 = this.A01.A01;
                com.facebook.ads.redexgen.core.UK uk = new com.facebook.ads.redexgen.core.UK(c1636gi, next, null, A0K, s64.A01());
                if (uk.A12() != null && uk.A12().A0F() != null) {
                    ((com.facebook.ads.redexgen.core.AbstractC1766iv) uk.A12().A0F()).A00(uk);
                }
                s65 = this.A01.A01;
                c1636gi2 = this.A01.A02;
                nativeOptions = this.A01.A00;
                s65.A04(new com.facebook.ads.NativeAd(c1636gi2, uk, nativeOptions));
            } else {
                com.facebook.ads.redexgen.core.WT.A00(new com.facebook.ads.redexgen.core.C1661h7(this));
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1034Sp
    public final void ADL() {
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1034Sp
    public final void ADT() {
        A00();
    }
}
