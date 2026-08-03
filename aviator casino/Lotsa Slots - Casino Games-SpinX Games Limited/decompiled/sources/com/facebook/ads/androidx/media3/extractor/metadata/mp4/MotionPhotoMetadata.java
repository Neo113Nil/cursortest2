package com.facebook.ads.androidx.media3.extractor.metadata.mp4;

/* loaded from: assets/audience_network/classes2.dex */
public final class MotionPhotoMetadata implements com.facebook.ads.androidx.media3.common.Metadata.Entry {
    public static byte[] A05;
    public static final android.os.Parcelable.Creator<com.facebook.ads.androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata> CREATOR;
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + androidx.media3.common.PlaybackException.ERROR_CODE_CONCURRENT_STREAM_LIMIT);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{com.google.common.base.Ascii.CR, 1, 81, 73, 80, 85, 80, 49, 83, 70, 84, 70, 79, 85, 66, 85, 74, 80, 79, 53, 74, 78, 70, 84, 85, 66, 78, 81, 54, 84, com.google.common.base.Ascii.RS, -27, -39, 41, 33, 40, 45, 40, com.google.common.base.Ascii.FF, 34, 51, com.google.common.base.Ascii.RS, -10, 3, -9, 77, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 59, 60, 70, 42, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 81, 60, com.google.common.base.Ascii.DC4, -49, -61, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.FF, 7, 8, com.google.common.base.Ascii.DC2, -10, com.google.common.base.Ascii.ETB, 4, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.ETB, -13, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.DC2, 17, -32, com.google.common.base.Ascii.DC2, 52, 57, 46, 52, 51, -27, 53, 45, 52, 57, 52, -27, 50, 42, 57, 38, 41, 38, 57, 38, -1, -27, 53, 45, 52, 57, 52, com.google.common.base.Ascii.CAN, 57, 38, 55, 57, com.google.common.base.Ascii.NAK, 52, 56, 46, 57, 46, 52, 51, 2};
    }

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] A9a() {
        return com.facebook.ads.redexgen.core.C3E.A01(this);
    }

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final /* synthetic */ com.facebook.ads.redexgen.core.C2196qI A9b() {
        return com.facebook.ads.redexgen.core.C3E.A00(this);
    }

    static {
        A01();
        CREATOR = new com.facebook.ads.redexgen.core.IN();
    }

    public MotionPhotoMetadata(long j, long j2, long j3, long j4, long j5) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = j3;
        this.A04 = j4;
        this.A03 = j5;
    }

    public MotionPhotoMetadata(android.os.Parcel parcel) {
        this.A02 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        this.A04 = parcel.readLong();
        this.A03 = parcel.readLong();
    }

    public /* synthetic */ MotionPhotoMetadata(android.os.Parcel parcel, com.facebook.ads.redexgen.core.IN in) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata motionPhotoMetadata = (com.facebook.ads.androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata) obj;
        return this.A02 == motionPhotoMetadata.A02 && this.A01 == motionPhotoMetadata.A01 && this.A00 == motionPhotoMetadata.A00 && this.A04 == motionPhotoMetadata.A04 && this.A03 == motionPhotoMetadata.A03;
    }

    public final int hashCode() {
        int result = com.facebook.ads.redexgen.core.AbstractC2255rd.A00(this.A02);
        int A00 = ((((17 * 31) + result) * 31) + com.facebook.ads.redexgen.core.AbstractC2255rd.A00(this.A01)) * 31;
        int result2 = com.facebook.ads.redexgen.core.AbstractC2255rd.A00(this.A00);
        int A002 = (((A00 + result2) * 31) + com.facebook.ads.redexgen.core.AbstractC2255rd.A00(this.A04)) * 31;
        int result3 = com.facebook.ads.redexgen.core.AbstractC2255rd.A00(this.A03);
        return A002 + result3;
    }

    public final java.lang.String toString() {
        return A00(76, 42, 93) + this.A02 + A00(31, 12, 81) + this.A01 + A00(0, 31, 121) + this.A00 + A00(55, 21, 59) + this.A04 + A00(43, 12, 111) + this.A03;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A04);
        parcel.writeLong(this.A03);
    }
}
