package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.io, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1759io implements com.facebook.ads.redexgen.core.OE {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"LqS4Vpkhy9E", "ge1EwIuJY0TovlYE8lSK4ibgoBpAWn9a", "g9aMV", "tM0yo6k6wg7fwB8A5Xyw1gAw", "QSFbFVun0ml7C8TY77Vqi1TYUccnWCEL", "t0vPMbYvCUeZJjWwsMbVoEbKc6G6LcPD", "iAyfyMUWIOpY9gjOpihEXzDIF", "NOfvqhzewpei8jQqPEPmMqHVwiKNDwof"};
    public com.facebook.ads.AdError A00;
    public com.facebook.ads.redexgen.core.OD A01 = com.facebook.ads.redexgen.core.OD.A02;
    public com.facebook.ads.redexgen.core.OD A02 = com.facebook.ads.redexgen.core.OD.A02;
    public final com.facebook.ads.redexgen.core.AbstractC1756ik A03;
    public final com.facebook.ads.redexgen.core.C1636gi A04;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 33);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {125, 41, 50, 125, com.google.common.base.Ascii.FF, 2, 123, 77, 87, 2, 65, 67, 76, 2, 65, 74, 67, 76, 69, 71, 2, 107, 76, 86, 71, 69, 80, 67, 86, 75, 77, 76, 2, 103, 80, 80, 77, 80, 2, 79, 77, 70, 71, 2, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 91, 2, 81, 71, 86, 86, 75, 76, 69, 2, 99, 70, 113, 71, 86, 86, 75, 76, 69, 81, com.google.common.base.Ascii.FF, 81, 71, 86, 107, 76, 86, 71, 69, 80, 67, 86, 75, 77, 76, 103, 80, 80, 77, 80, 111, 77, 70, 71, 10, com.google.common.base.Ascii.VT, 37, 33, 34, com.google.common.base.Ascii.SYN, 7, 10, 6, com.google.common.base.Ascii.CR, 0, 6, 45, 6, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.FF, 17, 8, 65, 117, 104, 106, 39, 90, Byte.MAX_VALUE, 98, 99, 106, 45, 100, 99, 121, 104, Byte.MAX_VALUE, 99, 108, 97, 45, 121, Byte.MAX_VALUE, 108, 99, 126, 100, 121, 100, 98, 99, 35, 125, 108, 117, 106, 105, 103, 98, 46, 47, 121, 98, 101, 125, 34, 35, 120, 100, 109, 120, 44, 101, Byte.MAX_VALUE, 44, 109, 96, 126, 105, 109, 104, 117, 44, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 67, 77, 72, 69, 66, 75, 32, 44, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 67, 77, 72, 73, 72, 44, 99, 126, 44, 95, 68, 67, 91, 69, 66, 75, 123, 103, 110, 123, 47, 102, 124, 47, 110, 99, 125, 106, 110, 107, 118, 47, 92, 71, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 88, 70, 65, 72, 121, 101, 108, 121, 45, 100, 126, 45, 99, 98, 121, 45, 65, 66, 76, 73, 72, 73};
        java.lang.String[] strArr = A06;
        if (strArr[1].charAt(28) == strArr[5].charAt(28)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A06;
        strArr2[1] = "uHXyGv91YS5AZybwuzmh7pK9ZkTxCxly";
        strArr2[5] = "aSclBZwoH94XlBt4xX3FAXD0bzJVnGEs";
        A05 = bArr;
    }

    static {
        A01();
    }

    public C1759io(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.AbstractC1756ik abstractC1756ik) {
        this.A04 = c1636gi;
        this.A03 = abstractC1756ik;
    }

    private void A02(com.facebook.ads.redexgen.core.OD od, com.facebook.ads.redexgen.core.OD od2) {
        java.lang.String A00 = A00(113, 26, 44);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String errorTitle = A00(108, 5, 38);
        java.lang.StringBuilder append = sb.append(errorTitle).append(od);
        java.lang.String errorTitle2 = A00(0, 4, 124);
        java.lang.String sb2 = append.append(errorTitle2).append(od2).toString();
        com.facebook.ads.redexgen.core.InterfaceC1047Tc A08 = this.A04.A08();
        int i = com.facebook.ads.redexgen.core.AbstractC1048Td.A0e;
        com.facebook.ads.redexgen.core.C1049Te c1049Te = new com.facebook.ads.redexgen.core.C1049Te(A00, sb2);
        java.lang.String errorTitle3 = A00(androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_UHD, 3, 61);
        A08.ABC(errorTitle3, i, c1049Te);
        java.lang.String errorTitle4 = A00 + ' ' + sb2;
        this.A04.A0F().ALA(errorTitle4);
    }

    private void A03(java.lang.String str, java.lang.String str2, boolean z) {
        com.facebook.ads.AdSettings.IntegrationErrorMode A00 = com.facebook.ads.redexgen.core.OA.A00(this.A04);
        java.lang.String format = java.lang.String.format(java.util.Locale.US, com.facebook.ads.internal.protocol.AdErrorType.INCORRECT_API_CALL_ERROR.getDefaultErrorMessage(), str, str2);
        java.lang.String A002 = A00(androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_UHD, 3, 61);
        java.lang.String A003 = A00(91, 17, 66);
        if (!z) {
            android.util.Log.e(A003, format);
            this.A04.A08().ABC(A002, com.facebook.ads.redexgen.core.AbstractC1048Td.A0c, new com.facebook.ads.redexgen.core.C1049Te(format));
            this.A04.A0F().AL9(format);
            return;
        }
        switch (com.facebook.ads.redexgen.core.OC.A00[A00.ordinal()]) {
            case 1:
                java.lang.String errorMessage = format + A00(4, 87, 3);
                throw new com.facebook.ads.redexgen.core.OF(errorMessage);
            case 2:
                this.A03.A08();
                this.A03.A0B(10, com.facebook.ads.internal.protocol.AdErrorType.INCORRECT_STATE_ERROR, format);
                this.A04.A0F().AL9(format);
                android.util.Log.e(A003, format);
                this.A04.A08().ABC(A002, com.facebook.ads.redexgen.core.AbstractC1048Td.A0c, new com.facebook.ads.redexgen.core.C1049Te(format));
                break;
        }
        android.util.Log.e(A003, format);
    }

    @Override // com.facebook.ads.redexgen.core.OE
    public final boolean A6U() {
        boolean z = (this.A01 == com.facebook.ads.redexgen.core.OD.A02 || this.A01 == com.facebook.ads.redexgen.core.OD.A04) && this.A02 != com.facebook.ads.redexgen.core.OD.A07;
        if (z) {
            this.A01 = com.facebook.ads.redexgen.core.OD.A06;
        } else {
            A03(A00(142, 6, 39), A00(154, 42, 45), false);
        }
        return !z;
    }

    @Override // com.facebook.ads.redexgen.core.OE
    public final boolean A6V() {
        if (this.A01 == com.facebook.ads.redexgen.core.OD.A04 && this.A00 != null && this.A00.getErrorCode() == 2008) {
            this.A04.A0F().AI5();
            this.A03.A0B(10, com.facebook.ads.internal.protocol.AdErrorType.AD_PRESENTATION_ERROR, null);
            return true;
        }
        com.facebook.ads.redexgen.core.OD od = this.A01;
        com.facebook.ads.redexgen.core.OD od2 = com.facebook.ads.redexgen.core.OD.A05;
        java.lang.String[] strArr = A06;
        if (strArr[6].length() == strArr[2].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A06;
        strArr2[4] = "mF60z106z8KVykzxhCmjg96dV72kpnud";
        strArr2[7] = "JHGcNRxcSq72OhujKZnAiyvPQwA3qgql";
        boolean z = od == od2 && (this.A02 != com.facebook.ads.redexgen.core.OD.A07 || com.facebook.ads.redexgen.core.C1086Up.A0i(this.A04));
        if (z) {
            this.A01 = com.facebook.ads.redexgen.core.OD.A02;
            this.A02 = com.facebook.ads.redexgen.core.OD.A07;
        } else {
            com.facebook.ads.redexgen.core.OD od3 = this.A01;
            com.facebook.ads.redexgen.core.OD od4 = com.facebook.ads.redexgen.core.OD.A05;
            java.lang.String A00 = A00(148, 6, 43);
            if (od3 != od4) {
                A03(A00, A00(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 18, 44), true);
            } else {
                A03(A00, A00(196, 23, 46), false);
            }
        }
        return !z;
    }

    @Override // com.facebook.ads.redexgen.core.OE
    public final com.facebook.ads.redexgen.core.OD A6p() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.OE
    public final com.facebook.ads.redexgen.core.OD A6q() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.OE
    public final void AAw() {
        this.A01 = com.facebook.ads.redexgen.core.OD.A06;
    }

    @Override // com.facebook.ads.redexgen.core.OE
    public final void AJM(com.facebook.ads.redexgen.core.OD od) {
        this.A01 = od;
        this.A02 = od;
    }

    @Override // com.facebook.ads.redexgen.core.OE
    public final void AJR(com.facebook.ads.AdError adError) {
        this.A01 = com.facebook.ads.redexgen.core.OD.A04;
        this.A02 = com.facebook.ads.redexgen.core.OD.A04;
        this.A00 = adError;
    }

    @Override // com.facebook.ads.redexgen.core.OE
    public final void AJW() {
        if (this.A01 != com.facebook.ads.redexgen.core.OD.A06) {
            A02(this.A01, com.facebook.ads.redexgen.core.OD.A05);
        }
        com.facebook.ads.redexgen.core.OD od = com.facebook.ads.redexgen.core.OD.A05;
        java.lang.String[] strArr = A06;
        if (strArr[4].charAt(13) == strArr[7].charAt(13)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A06;
        strArr2[6] = "0CQ8O9HdNp0eBnIGd0pIqA2Cb";
        strArr2[2] = "A9QPt";
        this.A01 = od;
    }

    @Override // com.facebook.ads.redexgen.core.OE
    public final void AJm() {
        if (this.A02 != com.facebook.ads.redexgen.core.OD.A07) {
            A02(this.A01, com.facebook.ads.redexgen.core.OD.A08);
        }
        this.A02 = com.facebook.ads.redexgen.core.OD.A08;
    }
}
