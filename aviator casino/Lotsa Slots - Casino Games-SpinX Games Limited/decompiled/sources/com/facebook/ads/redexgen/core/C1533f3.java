package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.f3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1533f3 extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public static byte[] A05;
    public final /* synthetic */ int A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.T8 A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.TW A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1049Te A03;
    public final /* synthetic */ java.lang.String A04;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 7);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{115, -97, -64, -67, -48, -62, 123, -66, -51, -68, -50, -61, 123, -67, -64, -66, -68, -48, -50, -64, 123, -50, -96, -55, -47, -60, -51, -54, -55, -56, -64, -55, -49, -97, -68, -49, -68, -85, -51, -54, -47, -60, -65, -64, -51, 123, -55, -54, -49, 123, -60, -55, -59, -64, -66, -49, -64, -65, 113, -121, -116, -119, 62, -121, -111, 62, -116, -109, -118, -118, 63, -109, -106, -106, -101, -90, -101, -95, -96, -109, -98, -111, -101, -96, -104, -95, 116, -119, 116, 124, Byte.MAX_VALUE, 116, 117, Byte.MAX_VALUE, 120, 114, 119, 124, -122, 126, 114, -122, -125, 116, 118, 120, -26, -28, -26, -21, -24, -106, -119, -121, -109, -106, -120, -125, -120, -123, -104, -123, -122, -123, -105, -119, -59, -72, -60, -56, -72, -58, -57, -78, -68, -73, -115, -113, 124, -114, -109, -118, Byte.MAX_VALUE, -104, -102, -121, -103, -98, -107, -118, -124, -120, -108, -119, -118};
    }

    public C1533f3(com.facebook.ads.redexgen.core.T8 t8, java.lang.String str, int i, com.facebook.ads.redexgen.core.C1049Te c1049Te, com.facebook.ads.redexgen.core.TW tw) {
        this.A01 = t8;
        this.A04 = str;
        this.A00 = i;
        this.A03 = c1049Te;
        this.A02 = tw;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        java.lang.String str;
        java.util.Map<java.lang.String, java.lang.String> A5a;
        java.lang.String A8L;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        try {
            if (com.facebook.ads.redexgen.core.TX.A0K(this.A01, this.A04, this.A00, this.A03)) {
                return;
            }
            com.facebook.ads.redexgen.core.VL.A08(this.A01, com.facebook.ads.redexgen.core.VD.A0A.toString() + A00(0, 1, 50) + this.A04);
            java.lang.Throwable cause = this.A03.getCause();
            if (cause != null) {
                str = com.facebook.ads.redexgen.core.AbstractC1163Xt.A03(this.A01, cause);
            } else if (com.facebook.ads.redexgen.core.AbstractC1088Ur.A0R(this.A01)) {
                com.facebook.ads.redexgen.core.T8 t8 = this.A01;
                java.lang.Throwable deLogExceptionCause = this.A03;
                str = com.facebook.ads.redexgen.core.AbstractC1163Xt.A03(t8, deLogExceptionCause);
            } else {
                str = A00(0, 0, 81) + this.A03.getMessage();
            }
            if (com.facebook.ads.redexgen.core.AbstractC1088Ur.A0V(this.A01)) {
                A5a = this.A01.A04().A5a();
            } else if (this.A02 != null) {
                A5a = this.A02.A7z();
            } else if (com.facebook.ads.redexgen.core.TX.A02) {
                com.facebook.ads.redexgen.core.TX.A0F(new java.lang.RuntimeException(A00(1, 57, 84), this.A03));
                A5a = new java.util.HashMap<>();
            } else {
                A5a = this.A01.A04().A5a();
            }
            A5a.put(A00(136, 7, 19), this.A04);
            A5a.put(A00(143, 12, 30), java.lang.String.valueOf(this.A00));
            org.json.JSONObject A03 = this.A03.A03();
            if (A03 != null) {
                A5a.put(A00(71, 15, 43), A03.toString());
            }
            if ((A00(106, 5, 124).equals(this.A04) || A00(111, 15, 29).equals(this.A04)) && (A8L = this.A01.A04().A8L()) != null) {
                A5a.put(A00(86, 20, 12), A8L);
            }
            java.lang.String A0C = this.A01.A0C();
            if (A0C != null && !android.text.TextUtils.isEmpty(A0C)) {
                A5a.put(A00(126, 10, 76), A0C);
            }
            atomicReference = com.facebook.ads.redexgen.core.TX.A0A;
            com.facebook.ads.redexgen.core.TV tv = (com.facebook.ads.redexgen.core.TV) atomicReference.get();
            if (tv == null) {
                com.facebook.ads.redexgen.core.TX.A0F(new java.lang.RuntimeException(A00(58, 13, 23)));
            } else {
                tv.AL5(str, A5a, this.A01);
            }
        } catch (java.lang.Throwable t) {
            com.facebook.ads.redexgen.core.TX.A0F(t);
        }
    }
}
