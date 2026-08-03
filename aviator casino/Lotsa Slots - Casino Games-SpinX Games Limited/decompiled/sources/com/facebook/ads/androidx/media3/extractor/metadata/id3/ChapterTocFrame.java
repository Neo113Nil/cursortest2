package com.facebook.ads.androidx.media3.extractor.metadata.id3;

/* loaded from: assets/audience_network/classes2.dex */
public final class ChapterTocFrame extends com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"41NC5", "0J", "e5KnEwX30al5HhEfsapKBEHe3tkNzIRg", "hjAEStB30D9jY", "8lRM69KUqjxin5EqodPaG36", "AeGUWh3YVhB7McaTEUzGpI1", "ViWv54Lb", "YmmztsHdSeGoBz"};
    public static final android.os.Parcelable.Creator<com.facebook.ads.androidx.media3.extractor.metadata.id3.ChapterTocFrame> CREATOR;
    public final java.lang.String A00;
    public final boolean A01;
    public final boolean A02;
    public final java.lang.String[] A03;
    public final com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame[] A04;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 60);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-19, -2, -7, -19};
    }

    static {
        A01();
        CREATOR = new com.facebook.ads.redexgen.core.IB();
    }

    public ChapterTocFrame(android.os.Parcel parcel) {
        super(A00(0, 4, 110));
        this.A00 = (java.lang.String) com.facebook.ads.redexgen.core.C5C.A0f(parcel.readString());
        this.A02 = parcel.readByte() != 0;
        this.A01 = parcel.readByte() != 0;
        this.A03 = (java.lang.String[]) com.facebook.ads.redexgen.core.C5C.A0f(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.A04 = new com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.A04[i] = (com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame) parcel.readParcelable(com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame.class.getClassLoader());
        }
    }

    public ChapterTocFrame(java.lang.String str, boolean z, boolean z2, java.lang.String[] strArr, com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame[] id3FrameArr) {
        super(A00(0, 4, 110));
        this.A00 = str;
        this.A02 = z;
        this.A01 = z2;
        this.A03 = strArr;
        this.A04 = id3FrameArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            java.lang.Class<?> cls = getClass();
            if (A06[1].length() == 8) {
                throw new java.lang.RuntimeException();
            }
            A06[2] = "Y5qiRripW3638QaK8HmAYdCRHbvBTlaE";
            if (cls == obj.getClass()) {
                com.facebook.ads.androidx.media3.extractor.metadata.id3.ChapterTocFrame chapterTocFrame = (com.facebook.ads.androidx.media3.extractor.metadata.id3.ChapterTocFrame) obj;
                java.lang.String[] strArr = A06;
                if (strArr[7].length() == strArr[3].length()) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A06;
                strArr2[7] = "3ADh3DGYZ0lZXq";
                strArr2[3] = "8CiyD2GMUXgUE";
                if (this.A02 == chapterTocFrame.A02 && this.A01 == chapterTocFrame.A01 && com.facebook.ads.redexgen.core.C5C.A1E(this.A00, chapterTocFrame.A00) && java.util.Arrays.equals(this.A03, chapterTocFrame.A03) && java.util.Arrays.equals(this.A04, chapterTocFrame.A04)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((17 * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A01 ? 1 : 0)) * 31) + (this.A00 != null ? this.A00.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeByte(this.A02 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A01 ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.A03);
        parcel.writeInt(this.A04.length);
        for (com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame id3Frame : this.A04) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }
}
