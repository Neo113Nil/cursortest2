package com.facebook.ads.androidx.media3.extractor.metadata.id3;

/* loaded from: assets/audience_network/classes2.dex */
public final class BinaryFrame extends com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame {
    public static java.lang.String[] A01 = {"mO2v2I8nIlxBj", "qTeiOagQgmfIePZq", "", "yu", "e92", "94hbfjGXx", "JfA8eazzapC4ELerSklcK4", "O"};
    public static final android.os.Parcelable.Creator<com.facebook.ads.androidx.media3.extractor.metadata.id3.BinaryFrame> CREATOR = new com.facebook.ads.redexgen.core.I9();
    public final byte[] A00;

    public BinaryFrame(android.os.Parcel parcel) {
        super((java.lang.String) com.facebook.ads.redexgen.core.C5C.A0f(parcel.readString()));
        this.A00 = (byte[]) com.facebook.ads.redexgen.core.C5C.A0f(parcel.createByteArray());
    }

    public BinaryFrame(java.lang.String str, byte[] bArr) {
        super(str);
        this.A00 = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            java.lang.Class<?> cls = getClass();
            if (A01[2].length() != 0) {
                throw new java.lang.RuntimeException();
            }
            A01[2] = "";
            if (cls == obj.getClass()) {
                com.facebook.ads.androidx.media3.extractor.metadata.id3.BinaryFrame binaryFrame = (com.facebook.ads.androidx.media3.extractor.metadata.id3.BinaryFrame) obj;
                return super.A00.equals(((com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame) binaryFrame).A00) && java.util.Arrays.equals(this.A00, binaryFrame.A00);
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = super.A00.hashCode();
        return (((17 * 31) + result) * 31) + java.util.Arrays.hashCode(this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeByteArray(this.A00);
    }
}
