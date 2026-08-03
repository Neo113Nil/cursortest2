package com.facebook.ads.androidx.media3.extractor.metadata.id3;

/* loaded from: assets/audience_network/classes2.dex */
public final class MlltFrame extends com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame {
    public static byte[] A05;
    public static final android.os.Parcelable.Creator<com.facebook.ads.androidx.media3.extractor.metadata.id3.MlltFrame> CREATOR;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int[] A03;
    public final int[] A04;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 97);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{38, 37, 37, 45};
    }

    static {
        A01();
        CREATOR = new com.facebook.ads.redexgen.core.IH();
    }

    public MlltFrame(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super(A00(0, 4, 120));
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = iArr;
        this.A04 = iArr2;
    }

    public MlltFrame(android.os.Parcel parcel) {
        super(A00(0, 4, 120));
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A03 = (int[]) com.facebook.ads.redexgen.core.C5C.A0f(parcel.createIntArray());
        this.A04 = (int[]) com.facebook.ads.redexgen.core.C5C.A0f(parcel.createIntArray());
    }

    @Override // com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame, android.os.Parcelable
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
        com.facebook.ads.androidx.media3.extractor.metadata.id3.MlltFrame mlltFrame = (com.facebook.ads.androidx.media3.extractor.metadata.id3.MlltFrame) obj;
        if (this.A02 == mlltFrame.A02 && this.A00 == mlltFrame.A00 && this.A01 == mlltFrame.A01 && java.util.Arrays.equals(this.A03, mlltFrame.A03) && java.util.Arrays.equals(this.A04, mlltFrame.A04)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A02;
        int result2 = ((((17 * 31) + result) * 31) + this.A00) * 31;
        int result3 = this.A01;
        int result4 = (((result2 + result3) * 31) + java.util.Arrays.hashCode(this.A03)) * 31;
        int result5 = java.util.Arrays.hashCode(this.A04);
        return result4 + result5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeIntArray(this.A03);
        parcel.writeIntArray(this.A04);
    }
}
