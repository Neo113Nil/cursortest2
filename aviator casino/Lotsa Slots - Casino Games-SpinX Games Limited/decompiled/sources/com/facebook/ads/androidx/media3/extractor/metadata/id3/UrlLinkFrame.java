package com.facebook.ads.androidx.media3.extractor.metadata.id3;

/* loaded from: assets/audience_network/classes2.dex */
public final class UrlLinkFrame extends com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"xxXPcCrNJGLODnntRXdDXuTLETzeRSPk", "BM6YzmnlcmbfbcRTXZNQ791eRQEfQtzt", "fhJqw", "jLA8WfPPASI7lTWhNaBhUXLjINWrZlwE", "SaNh", "Wiu8Q", "Gydj", "3rZ3NkXCEjz6xD1XlhGn8ySTpct48s"};
    public static final android.os.Parcelable.Creator<com.facebook.ads.androidx.media3.extractor.metadata.id3.UrlLinkFrame> CREATOR;
    public final java.lang.String A00;
    public final java.lang.String A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 112);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-84, -110, -25, -28, -34, -81};
    }

    static {
        A01();
        CREATOR = new com.facebook.ads.redexgen.core.IK();
    }

    public UrlLinkFrame(android.os.Parcel parcel) {
        super((java.lang.String) com.facebook.ads.redexgen.core.C5C.A0f(parcel.readString()));
        this.A00 = parcel.readString();
        this.A01 = (java.lang.String) com.facebook.ads.redexgen.core.C5C.A0f(parcel.readString());
    }

    public UrlLinkFrame(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(str);
        this.A00 = str2;
        this.A01 = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (A03[1].charAt(26) == '7') {
            throw new java.lang.RuntimeException();
        }
        A03[7] = "KGgHB7WLO7OsYt6jFaU1vF";
        com.facebook.ads.androidx.media3.extractor.metadata.id3.UrlLinkFrame urlLinkFrame = (com.facebook.ads.androidx.media3.extractor.metadata.id3.UrlLinkFrame) obj;
        if (super.A00.equals(((com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame) urlLinkFrame).A00) && com.facebook.ads.redexgen.core.C5C.A1E(this.A00, urlLinkFrame.A00) && com.facebook.ads.redexgen.core.C5C.A1E(this.A01, urlLinkFrame.A01)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = super.A00.hashCode();
        return (((((17 * 31) + result) * 31) + (this.A00 != null ? this.A00.hashCode() : 0)) * 31) + (this.A01 != null ? this.A01.hashCode() : 0);
    }

    @Override // com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame
    public final java.lang.String toString() {
        return super.A00 + A00(0, 6, 2) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
