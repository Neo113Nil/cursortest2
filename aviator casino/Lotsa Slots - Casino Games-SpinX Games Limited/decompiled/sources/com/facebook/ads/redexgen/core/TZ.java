package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class TZ extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"rr4pEtDer0K6hYSMypGI4SVA4", "qv2m0fG", "2OIR1Yv9Y7RzsB5MK8fjyIRTaeFBsJy", "02JyCSWW55zn1AQ6h7F4FoBumR9MK", "PV14KCf6Ep37wllo1HHxqudNmgtveNCD", "8xcTKK5W7UNHePnVaLckl2F", "lGpL0wggi73mqN0I3cVtORcNpouSV80j", "84RqxglWV7M6OmuSAB1gnMVf4"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.WA A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.WD A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 98);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{121, 115, 97, 124, Byte.MAX_VALUE, 112, 112, 123, 108, 97, 117, 123, 103, com.google.common.base.Ascii.DC2, 51, 124, 50, 57, 40, 43, 51, 46, 55, 124, 63, 51, 50, 50, 57, 63, 40, 53, 51, 50};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        com.facebook.ads.redexgen.core.C1636gi c1636gi2;
        com.facebook.ads.redexgen.core.C1636gi c1636gi3;
        com.facebook.ads.redexgen.core.C1636gi c1636gi4;
        com.facebook.ads.redexgen.core.C1636gi c1636gi5;
        long j;
        com.facebook.ads.redexgen.core.C1636gi c1636gi6;
        java.lang.String str;
        java.util.Map<? extends java.lang.String, ? extends java.lang.String> map;
        com.facebook.ads.redexgen.core.InterfaceC1588fw A032;
        com.facebook.ads.redexgen.core.C1636gi c1636gi7;
        com.facebook.ads.redexgen.core.C1636gi c1636gi8;
        com.facebook.ads.redexgen.core.C1636gi c1636gi9;
        com.facebook.ads.redexgen.core.C1636gi c1636gi10;
        long j2;
        this.A01.A00 = java.lang.System.currentTimeMillis();
        c1636gi = this.A01.A05;
        if (com.facebook.ads.redexgen.core.AbstractC1169Xz.A00(c1636gi) == com.facebook.ads.redexgen.core.EnumC1168Xy.A07) {
            this.A01.A0A();
            com.facebook.ads.internal.protocol.AdErrorType adErrorType = com.facebook.ads.internal.protocol.AdErrorType.NETWORK_ERROR;
            java.lang.String A00 = A00(13, 21, 62);
            c1636gi10 = this.A01.A05;
            com.facebook.ads.redexgen.core.InterfaceC0862Lt A0F = c1636gi10.A0F();
            j2 = this.A01.A01;
            A0F.A3W(com.facebook.ads.redexgen.core.Y1.A01(j2), adErrorType.getErrorCode(), A00, adErrorType.isPublicError());
            this.A01.A0E(new com.facebook.ads.redexgen.core.C1108Vm(adErrorType, A00));
            return;
        }
        c1636gi2 = this.A01.A05;
        com.facebook.ads.redexgen.core.C1058Tn.A08(c1636gi2);
        c1636gi3 = this.A01.A05;
        com.facebook.ads.redexgen.core.SZ.A07(c1636gi3);
        com.facebook.ads.redexgen.core.UG A002 = com.facebook.ads.redexgen.core.UG.A00();
        c1636gi4 = this.A01.A05;
        boolean z = true;
        java.util.Map<java.lang.String, java.lang.String> A0A = this.A00.A0A(A002.A01(c1636gi4, true).A7y(this.A00.A05()));
        this.A01.A03 = A0A;
        try {
            c1636gi7 = this.A01.A05;
            android.content.pm.PackageManager packageManager = c1636gi7.getPackageManager();
            if (packageManager != null) {
                java.lang.String A003 = A00(1, 12, 92);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                c1636gi8 = this.A01.A05;
                java.lang.StringBuilder append = sb.append(c1636gi8.getPackageName()).append(A00(0, 1, 59));
                c1636gi9 = this.A01.A05;
                A0A.put(A003, new java.lang.String(android.util.Base64.encode(append.append(packageManager.getInstallerPackageName(c1636gi9.getPackageName())).toString().getBytes(), 2)));
            }
        } catch (java.lang.Exception unused) {
        }
        try {
            if (this.A00.A07() != com.facebook.ads.redexgen.core.EnumC1111Vq.A04 && this.A00.A07() != com.facebook.ads.redexgen.core.EnumC1111Vq.A06 && this.A00.A07() != com.facebook.ads.redexgen.core.EnumC1111Vq.A05 && this.A00.A07() != null) {
                z = false;
            }
            c1636gi6 = this.A01.A05;
            com.facebook.ads.redexgen.core.InterfaceC1587fv A022 = com.facebook.ads.redexgen.core.C1605gD.A02(z, c1636gi6);
            str = this.A01.A07;
            com.facebook.ads.redexgen.core.C1601g9 c1601g9 = new com.facebook.ads.redexgen.core.C1601g9();
            map = this.A01.A03;
            byte[] A08 = c1601g9.A05(map).A08();
            A032 = this.A01.A03(com.facebook.ads.redexgen.core.Y1.A00(), this.A00);
            A022.AGy(str, A08, A032);
        } catch (java.lang.Exception e) {
            com.facebook.ads.internal.protocol.AdErrorType adErrorType2 = com.facebook.ads.internal.protocol.AdErrorType.AD_REQUEST_FAILED;
            java.lang.String message = e.getMessage();
            c1636gi5 = this.A01.A05;
            com.facebook.ads.redexgen.core.InterfaceC0862Lt A0F2 = c1636gi5.A0F();
            j = this.A01.A01;
            A0F2.A3W(com.facebook.ads.redexgen.core.Y1.A01(j), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
            com.facebook.ads.redexgen.core.WD wd = this.A01;
            com.facebook.ads.redexgen.core.C1108Vm A01 = com.facebook.ads.redexgen.core.C1108Vm.A01(adErrorType2, message);
            if (A03[3].length() != 29) {
                throw new java.lang.RuntimeException();
            }
            A03[3] = "TysUXKeFt8WChM0CalDFmuBH7ELd8";
            wd.A0E(A01);
        }
    }

    static {
        A01();
    }

    public TZ(com.facebook.ads.redexgen.core.WD wd, com.facebook.ads.redexgen.core.WA wa) {
        this.A01 = wd;
        this.A00 = wa;
    }
}
