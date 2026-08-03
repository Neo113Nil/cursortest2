package com.facebook.ads.androidx.media3.extractor.metadata.scte35;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class SpliceCommand implements com.facebook.ads.androidx.media3.common.Metadata.Entry {
    public static byte[] A00;

    static {
        A03();
    }

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 88);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{54, 38, 49, 32, 72, 86, 80, 69, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.NAK, 9, com.google.common.base.Ascii.FF, 6, 0, 69, 6, 10, 8, 8, 4, com.google.common.base.Ascii.VT, 1, 95, 69, 17, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.NAK, 0, 88};
    }

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] A9a() {
        return com.facebook.ads.redexgen.core.C3E.A01(this);
    }

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final /* synthetic */ com.facebook.ads.redexgen.core.C2196qI A9b() {
        return com.facebook.ads.redexgen.core.C3E.A00(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        return A02(0, 29, 61) + getClass().getSimpleName();
    }
}
