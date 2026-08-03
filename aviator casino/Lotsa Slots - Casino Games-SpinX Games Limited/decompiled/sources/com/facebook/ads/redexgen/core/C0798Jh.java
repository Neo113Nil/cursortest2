package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Jh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0798Jh {
    public static byte[] A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 109);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{33};
    }

    public final com.facebook.ads.redexgen.core.BP<com.facebook.ads.redexgen.core.C2146pT> A02(byte[] bArr) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        android.os.Bundle readBundle = obtain.readBundle(android.os.Bundle.class.getClassLoader());
        obtain.recycle();
        return com.facebook.ads.redexgen.core.AnonymousClass44.A01(com.facebook.ads.redexgen.core.C2146pT.A0I, (java.util.ArrayList) com.facebook.ads.redexgen.core.AbstractC04203y.A01(readBundle.getParcelableArrayList(A00(0, 1, 47))));
    }
}
