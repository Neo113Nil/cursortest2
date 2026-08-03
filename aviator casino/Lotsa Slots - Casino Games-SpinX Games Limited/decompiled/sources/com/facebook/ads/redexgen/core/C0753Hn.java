package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Hn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0753Hn extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"MrnT4Eks85vPuqQr37JMtu4NfaYgfi6f", "zfkVjNlCcNBydFIcz2mD", "Bee43nRREoDmuohWbk", "LYOPzNoZy5N5VpEZxT", "78Vp0AX9Eb5UezJBTqKvLg5S66jER", "qnB2IM", "Ag3pKfa1yi0C6RoVnqVP", "pygY9b2"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.AnonymousClass55 A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            if (A02[4].length() != 29) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A02;
            strArr[2] = "zTo8qTO106BkbxhANT";
            strArr[3] = "z1bPe1QyN1GViRGZCE";
            copyOfRange[i4] = (byte) ((b - i3) - 15);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-111, -92, -97, -96, -86, 91, -78, -100, -82, 91, -87, -96, -79, -96, -83, 91, -85, -83, -96, -85, -100, -83, -96, -97};
    }

    static {
        A01();
    }

    public C0753Hn(com.facebook.ads.redexgen.core.AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        boolean z;
        z = this.A00.A0M;
        if (!z) {
            com.facebook.ads.redexgen.core.AnonymousClass55 anonymousClass55 = this.A00;
            java.lang.String[] strArr = A02;
            if (strArr[7].length() == strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            A02[1] = "EIUkH3ntVfUyNEjhHXbRpTHh";
            anonymousClass55.A0s(A00(0, 24, 44));
        }
    }
}
