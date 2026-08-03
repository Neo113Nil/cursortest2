package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Sl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1030Sl implements com.facebook.ads.redexgen.core.InterfaceC1588fw {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"vUQacvUb1jgaOB1nXCILUaEr4ItZ5QEs", "N", "ozPzI", "iemFS7qx3ItQSdDQeBrvuJ9y9CMkfIqY", "EwROMxnfRd6F7268i4EpvPtVg3hQf", "a", "qVu8", "3RxrE6NsEsLt8TXu"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.WA A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.WD A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 120);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{85, 81, 3, 85, 87, 7, 80, 3, 60, 111, 51, 63, 51, 63, 107, 60, 44, 53, 41, 40, 35, com.google.common.base.Ascii.RS, 5, 3, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SI, 9, 8, 92, 70, 78, 120, 111, 107, 120, 111, kotlin.io.encoding.Base64.padSymbol, 120, 111, 111, 114, 111, kotlin.io.encoding.Base64.padSymbol, 114, 126, 126, 104, 111, 111, 120, 121, 124, 74, 93, 89, 74, 93, com.google.common.base.Ascii.SI, 93, 74, 95, 67, 70, 74, 75, com.google.common.base.Ascii.SI, 92, 90, 76, 76, 74, 92, 92, 73, 90, 67, 67, 86, 63, 62, 19, 63, kotlin.io.encoding.Base64.padSymbol, 32, 60, 53, 36, 53, com.google.common.base.Ascii.DLE, 17, 58, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.CR};
    }

    static {
        A01();
    }

    public C1030Sl(com.facebook.ads.redexgen.core.WD wd, com.facebook.ads.redexgen.core.WA wa, long j) {
        this.A02 = wd;
        this.A01 = wa;
        this.A00 = j;
    }

    private final void A02(com.facebook.ads.redexgen.core.C1600g8 c1600g8) {
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        long j;
        com.facebook.ads.redexgen.core.C1636gi c1636gi2;
        long j2;
        com.facebook.ads.redexgen.core.WE we;
        com.facebook.ads.redexgen.core.C1636gi c1636gi3;
        com.facebook.ads.redexgen.core.C1636gi c1636gi4;
        long j3;
        com.facebook.ads.redexgen.core.W9.A06(this.A01);
        try {
            com.facebook.ads.redexgen.core.InterfaceC1586fu response = c1600g8.A00();
            if (response != null) {
                java.lang.String A73 = response.A73();
                we = this.A02.A06;
                c1636gi3 = this.A02.A05;
                com.facebook.ads.redexgen.core.WG serverResponse = we.A07(c1636gi3, A73, this.A00);
                if (serverResponse.A01() == com.facebook.ads.redexgen.core.WF.A03) {
                    com.facebook.ads.redexgen.core.R4 r4 = (com.facebook.ads.redexgen.core.R4) serverResponse;
                    java.lang.String A042 = r4.A04();
                    com.facebook.ads.internal.protocol.AdErrorType adErrorTypeFromCode = com.facebook.ads.internal.protocol.AdErrorType.adErrorTypeFromCode(r4.A03(), com.facebook.ads.internal.protocol.AdErrorType.ERROR_MESSAGE);
                    if (A042 != null) {
                        A73 = A042;
                    }
                    c1636gi4 = this.A02.A05;
                    com.facebook.ads.redexgen.core.InterfaceC0862Lt A0F = c1636gi4.A0F();
                    j3 = this.A02.A01;
                    A0F.A3W(com.facebook.ads.redexgen.core.Y1.A01(j3), adErrorTypeFromCode.getErrorCode(), A73, adErrorTypeFromCode.isPublicError());
                    this.A02.A0E(com.facebook.ads.redexgen.core.C1108Vm.A01(adErrorTypeFromCode, A73));
                    return;
                }
            }
            com.facebook.ads.internal.protocol.AdErrorType adErrorType = com.facebook.ads.internal.protocol.AdErrorType.NETWORK_ERROR;
            java.lang.String message = c1600g8.getMessage();
            c1636gi2 = this.A02.A05;
            com.facebook.ads.redexgen.core.InterfaceC0862Lt A0F2 = c1636gi2.A0F();
            j2 = this.A02.A01;
            long A01 = com.facebook.ads.redexgen.core.Y1.A01(j2);
            int errorCode = adErrorType.getErrorCode();
            boolean isPublicError = adErrorType.isPublicError();
            if (A04[2].length() == 29) {
                throw new java.lang.RuntimeException();
            }
            A04[4] = "NZ18w";
            A0F2.A3W(A01, errorCode, message, isPublicError);
            this.A02.A0E(com.facebook.ads.redexgen.core.C1108Vm.A01(adErrorType, message));
        } catch (org.json.JSONException e) {
            com.facebook.ads.internal.protocol.AdErrorType adErrorType2 = com.facebook.ads.internal.protocol.AdErrorType.NETWORK_ERROR;
            java.lang.String errorMessage = c1600g8.getMessage();
            c1636gi = this.A02.A05;
            com.facebook.ads.redexgen.core.InterfaceC0862Lt A0F3 = c1636gi.A0F();
            j = this.A02.A01;
            A0F3.A3W(com.facebook.ads.redexgen.core.Y1.A01(j), adErrorType2.getErrorCode(), A00(16, 15, 30) + e.getMessage(), adErrorType2.isPublicError());
            this.A02.A0E(com.facebook.ads.redexgen.core.C1108Vm.A01(adErrorType2, errorMessage));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1588fw
    public final void ADR(com.facebook.ads.redexgen.core.InterfaceC1586fu interfaceC1586fu) {
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        com.facebook.ads.redexgen.core.C1636gi c1636gi2;
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A05(A00(79, 10, 40), A00(52, 27, 87), A00(8, 8, 114));
        if (interfaceC1586fu != null) {
            java.lang.String A73 = interfaceC1586fu.A73();
            c1636gi = this.A02.A05;
            int A02 = com.facebook.ads.redexgen.core.C1086Up.A02(c1636gi);
            java.lang.String[] strArr = A04;
            java.lang.String str = strArr[5];
            java.lang.String response = strArr[1];
            if (str.length() != response.length()) {
                throw new java.lang.RuntimeException();
            }
            A04[2] = "kblvpkFa8oUK1ItVGqcsW93nH";
            if (A02 > 0) {
                c1636gi2 = this.A02.A05;
                com.facebook.ads.redexgen.core.C1132Wl.A00(c1636gi2).A0C(A73);
            }
            com.facebook.ads.redexgen.core.W9.A06(this.A01);
            this.A02.A0O(A73, this.A00, this.A01);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1588fw
    public final void ADq(java.lang.Exception exc) {
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        long j;
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A05(A00(89, 7, 7), A00(31, 21, 101), A00(0, 8, 30));
        if (com.facebook.ads.redexgen.core.C1600g8.class.equals(exc.getClass())) {
            A02((com.facebook.ads.redexgen.core.C1600g8) exc);
            return;
        }
        com.facebook.ads.internal.protocol.AdErrorType adErrorType = com.facebook.ads.internal.protocol.AdErrorType.NETWORK_ERROR;
        java.lang.String errorMessage = exc.getMessage();
        c1636gi = this.A02.A05;
        com.facebook.ads.redexgen.core.InterfaceC0862Lt A0F = c1636gi.A0F();
        j = this.A02.A01;
        A0F.A3W(com.facebook.ads.redexgen.core.Y1.A01(j), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
        this.A02.A0E(com.facebook.ads.redexgen.core.C1108Vm.A01(adErrorType, errorMessage));
    }
}
