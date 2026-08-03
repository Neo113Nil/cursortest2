package com.facebook.ads.androidx.media3.extractor.metadata.flac;

/* loaded from: assets/audience_network/classes2.dex */
public final class PictureFrame implements com.facebook.ads.androidx.media3.common.Metadata.Entry {
    public static byte[] A08;
    public static java.lang.String[] A09 = {"rI5TEheYOJp05VNApergGrEEHCWaES4C", "o6wWfrjUdw4LevlhwfZASZQrY", "UWoyLLtEqu034Q80pJxgHqQ3TFbt", "jnvUxVCjnhOQIYYcwBh2GPR5wbhVDTOy", "29XTtQExfztCGetR3Cqmh5L0E52wuoLu", "Hd1JIMrPWoRu", "ETzUd0wMReQVTdTsGtn8YYwfqZIUbVPg", "sLyN"};
    public static final android.os.Parcelable.Creator<com.facebook.ads.androidx.media3.extractor.metadata.flac.PictureFrame> CREATOR;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final java.lang.String A05;
    public final java.lang.String A06;
    public final byte[] A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static com.facebook.ads.androidx.media3.extractor.metadata.flac.PictureFrame A00(com.facebook.ads.redexgen.core.C04434v c04434v) {
        int A0C = c04434v.A0C();
        java.lang.String A0X = c04434v.A0X(c04434v.A0C(), com.facebook.ads.redexgen.core.AbstractC1833k9.A01);
        java.lang.String A0W = c04434v.A0W(c04434v.A0C());
        int A0C2 = c04434v.A0C();
        int A0C3 = c04434v.A0C();
        int A0C4 = c04434v.A0C();
        int A0C5 = c04434v.A0C();
        int A0C6 = c04434v.A0C();
        byte[] bArr = new byte[A0C6];
        c04434v.A0k(bArr, 0, A0C6);
        return new com.facebook.ads.androidx.media3.extractor.metadata.flac.PictureFrame(A0C, A0X, A0W, A0C2, A0C3, A0C4, A0C5, bArr);
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 23);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A08 = new byte[]{76, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 4, 5, 19, 3, com.google.common.base.Ascii.DC2, 9, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.DC4, 9, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SO, 93, kotlin.io.encoding.Base64.padSymbol, 4, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.US, 8, 87, 77, 0, 4, 0, 8, 57, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.GS, 8, 80};
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
        A02();
        CREATOR = new com.facebook.ads.redexgen.core.I2();
    }

    public PictureFrame(int i, java.lang.String str, java.lang.String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.A03 = i;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = i2;
        this.A02 = i3;
        this.A01 = i4;
        this.A00 = i5;
        this.A07 = bArr;
    }

    public PictureFrame(android.os.Parcel parcel) {
        this.A03 = parcel.readInt();
        this.A06 = (java.lang.String) com.facebook.ads.redexgen.core.C5C.A0f(parcel.readString());
        this.A05 = (java.lang.String) com.facebook.ads.redexgen.core.C5C.A0f(parcel.readString());
        this.A04 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A07 = (byte[]) com.facebook.ads.redexgen.core.C5C.A0f(parcel.createByteArray());
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
        com.facebook.ads.androidx.media3.extractor.metadata.flac.PictureFrame pictureFrame = (com.facebook.ads.androidx.media3.extractor.metadata.flac.PictureFrame) obj;
        if (this.A03 == pictureFrame.A03) {
            java.lang.String str = this.A06;
            if (A09[2].length() != 28) {
                throw new java.lang.RuntimeException();
            }
            A09[2] = "EI2VBd4ee1IoRa9rBnnoAwg1aEDf";
            if (str.equals(pictureFrame.A06) && this.A05.equals(pictureFrame.A05) && this.A04 == pictureFrame.A04 && this.A02 == pictureFrame.A02 && this.A01 == pictureFrame.A01 && this.A00 == pictureFrame.A00 && java.util.Arrays.equals(this.A07, pictureFrame.A07)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A03;
        int result2 = ((((17 * 31) + result) * 31) + this.A06.hashCode()) * 31;
        int result3 = this.A05.hashCode();
        int result4 = (((result2 + result3) * 31) + this.A04) * 31;
        int result5 = this.A02;
        int result6 = (((result4 + result5) * 31) + this.A01) * 31;
        int result7 = this.A00;
        return ((result6 + result7) * 31) + java.util.Arrays.hashCode(this.A07);
    }

    public final java.lang.String toString() {
        return A01(14, 18, 122) + this.A06 + A01(0, 14, 119) + this.A05;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByteArray(this.A07);
    }
}
