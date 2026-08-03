package com.facebook.ads.androidx.media3.extractor.metadata.flac;

@java.lang.Deprecated
/* loaded from: assets/audience_network/classes2.dex */
public class VorbisComment implements com.facebook.ads.androidx.media3.common.Metadata.Entry {
    public static byte[] A02;
    public static final android.os.Parcelable.Creator<com.facebook.ads.androidx.media3.extractor.metadata.flac.VorbisComment> CREATOR;
    public final java.lang.String A00;
    public final java.lang.String A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 28);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{119, 17, 4, 125, 103};
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
        CREATOR = new com.facebook.ads.redexgen.core.I3();
    }

    public VorbisComment(android.os.Parcel parcel) {
        this.A00 = (java.lang.String) com.facebook.ads.redexgen.core.C5C.A0f(parcel.readString());
        this.A01 = (java.lang.String) com.facebook.ads.redexgen.core.C5C.A0f(parcel.readString());
    }

    public VorbisComment(java.lang.String str, java.lang.String str2) {
        this.A00 = str;
        this.A01 = str2;
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
        com.facebook.ads.androidx.media3.extractor.metadata.flac.VorbisComment vorbisComment = (com.facebook.ads.androidx.media3.extractor.metadata.flac.VorbisComment) obj;
        return this.A00.equals(vorbisComment.A00) && this.A01.equals(vorbisComment.A01);
    }

    public final int hashCode() {
        int result = this.A00.hashCode();
        return (((17 * 31) + result) * 31) + this.A01.hashCode();
    }

    public final java.lang.String toString() {
        return A00(1, 4, 91) + this.A00 + A00(0, 1, 86) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
