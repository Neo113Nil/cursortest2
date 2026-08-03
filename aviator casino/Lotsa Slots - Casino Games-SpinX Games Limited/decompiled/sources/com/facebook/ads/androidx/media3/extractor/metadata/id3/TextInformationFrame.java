package com.facebook.ads.androidx.media3.extractor.metadata.id3;

/* loaded from: assets/audience_network/classes2.dex */
public final class TextInformationFrame extends com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"PRzzvuBjwgRBlybrfgCXUu0h8kRE0BYl", "wpvJm9E3j", "XMJYjWJhpM05jCuEk8g1dCDyUY0olBpf", "Qsgwd6eZwkpqny4yz6zyMy2XfivsvALV", "clQMjNTRp", "2j6tBuGV", "VJB8QHv", "YZxxVdDySmA2nPcuTgf4p"};
    public static final android.os.Parcelable.Creator<com.facebook.ads.androidx.media3.extractor.metadata.id3.TextInformationFrame> CREATOR;
    public final java.lang.String A00;

    @java.lang.Deprecated
    public final java.lang.String A01;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Replaces ImmutableList with MetaExoPlayerCustomizedCollections")
    public final java.util.List<java.lang.String> A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 60);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-99, -125, -57, -56, -42, -58, -43, -52, -45, -41, -52, -46, -47, -96, -33, -59, com.google.common.base.Ascii.ESC, 6, 17, com.google.common.base.Ascii.SUB, 10, com.google.common.base.Ascii.CAN, -30};
        java.lang.String[] strArr = A04;
        if (strArr[2].charAt(18) == strArr[3].charAt(18)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A04;
        strArr2[2] = "yRSPqh3aRsAylVpe1hOBm5YLh5Sq4zVd";
        strArr2[3] = "7kqk0liQnwbAMo7HBLnU1F6wmq1Tne5o";
        A03 = bArr;
    }

    static {
        A01();
        CREATOR = new com.facebook.ads.redexgen.core.IJ();
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Replaces ImmutableList.copyOf with MetaExoPlayerCustomizedCollections")
    public TextInformationFrame(android.os.Parcel parcel) {
        this((java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(parcel.readString()), parcel.readString(), com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections.A02((java.lang.String[]) com.facebook.ads.redexgen.core.AbstractC04203y.A01(parcel.createStringArray())));
    }

    public /* synthetic */ TextInformationFrame(android.os.Parcel parcel, com.facebook.ads.redexgen.core.IJ ij) {
        this(parcel);
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Replaces ImmutableList.copyOf with MetaExoPlayerCustomizedCollections")
    public TextInformationFrame(java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> values) {
        super(str);
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(!values.isEmpty());
        this.A00 = str2;
        this.A02 = com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections.A02((java.lang.String[]) values.toArray(new java.lang.String[0]));
        this.A01 = this.A02.get(0);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            java.lang.Class<?> cls = getClass();
            java.lang.Class<?> cls2 = obj.getClass();
            java.lang.String[] strArr = A04;
            if (strArr[1].length() != strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A04;
            strArr2[2] = "8D2Ula8sxyLo2Sqvwa2MzZhuaia5hg34";
            strArr2[3] = "0hDX4qrnX3efe3zY5D7tm747s1qsajWd";
            if (cls == cls2) {
                com.facebook.ads.androidx.media3.extractor.metadata.id3.TextInformationFrame textInformationFrame = (com.facebook.ads.androidx.media3.extractor.metadata.id3.TextInformationFrame) obj;
                if (com.facebook.ads.redexgen.core.C5C.A1E(super.A00, ((com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame) textInformationFrame).A00)) {
                    boolean A1E = com.facebook.ads.redexgen.core.C5C.A1E(this.A00, textInformationFrame.A00);
                    if (A04[5].length() == 10) {
                        throw new java.lang.RuntimeException();
                    }
                    A04[7] = "aAA9QqK2VvJ";
                    if (A1E && this.A02.equals(textInformationFrame.A02)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = super.A00.hashCode();
        int result2 = ((((17 * 31) + result) * 31) + (this.A00 != null ? this.A00.hashCode() : 0)) * 31;
        int result3 = this.A02.hashCode();
        return result2 + result3;
    }

    @Override // com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame
    public final java.lang.String toString() {
        return super.A00 + A00(0, 14, 39) + this.A00 + A00(14, 9, 105) + this.A02;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A00);
        parcel.writeStringArray((java.lang.String[]) this.A02.toArray(new java.lang.String[0]));
    }
}
