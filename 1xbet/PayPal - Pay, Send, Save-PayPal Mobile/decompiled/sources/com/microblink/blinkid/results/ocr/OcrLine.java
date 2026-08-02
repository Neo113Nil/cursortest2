package com.microblink.blinkid.results.ocr;

/* loaded from: classes10.dex */
public class OcrLine implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.results.ocr.OcrLine> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.results.ocr.OcrLine>() { // from class: com.microblink.blinkid.results.ocr.OcrLine.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.results.ocr.OcrLine createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.results.ocr.OcrLine(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.results.ocr.OcrLine[] newArray(int i) {
            return new com.microblink.blinkid.results.ocr.OcrLine[i];
        }
    };
    long Camera2StreamConfigurationMap;
    com.microblink.blinkid.results.ocr.CharWithVariants[] getHighResolutionOutputSizeshNQ4ISI;
    private com.microblink.blinkid.geometry.Rectangle getHighSpeedVideoSizes;

    public OcrLine(long j, com.microblink.blinkid.results.ocr.OcrBlock ocrBlock) {
        this.getHighSpeedVideoSizes = null;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.Camera2StreamConfigurationMap = j;
    }

    private static native int nativeGetCharCount(long j);

    private static native void nativeGetChars(long j, long[] jArr);

    private static native void nativeGetRectangle(long j, short[] sArr);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public com.microblink.blinkid.results.ocr.CharWithVariants[] getChars() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            long j = this.Camera2StreamConfigurationMap;
            if (j != 0) {
                int nativeGetCharCount = nativeGetCharCount(j);
                this.getHighResolutionOutputSizeshNQ4ISI = new com.microblink.blinkid.results.ocr.CharWithVariants[nativeGetCharCount];
                long[] jArr = new long[nativeGetCharCount];
                nativeGetChars(this.Camera2StreamConfigurationMap, jArr);
                for (int i = 0; i < nativeGetCharCount; i++) {
                    this.getHighResolutionOutputSizeshNQ4ISI[i] = new com.microblink.blinkid.results.ocr.CharWithVariants(jArr[i], this);
                }
            }
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public com.microblink.blinkid.geometry.Rectangle getPosition() {
        if (this.getHighSpeedVideoSizes == null) {
            long j = this.Camera2StreamConfigurationMap;
            if (j != 0) {
                nativeGetRectangle(j, new short[4]);
                this.getHighSpeedVideoSizes = new com.microblink.blinkid.geometry.Rectangle(r2[0], r2[1], r2[2], r2[3]);
            }
        }
        return this.getHighSpeedVideoSizes;
    }

    public java.lang.String toString() {
        com.microblink.blinkid.results.ocr.CharWithVariants[] chars = getChars();
        if (chars == null) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(chars.length);
        for (com.microblink.blinkid.results.ocr.CharWithVariants charWithVariants : chars) {
            sb.append(charWithVariants.getChar().getValue());
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(getPosition(), i);
        com.microblink.blinkid.results.ocr.CharWithVariants[] chars = getChars();
        if (chars == null || chars.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(chars.length);
            parcel.writeTypedArray(chars, i);
        }
    }

    OcrLine(android.os.Parcel parcel) {
        this.getHighSpeedVideoSizes = null;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.Camera2StreamConfigurationMap = 0L;
        this.getHighSpeedVideoSizes = (com.microblink.blinkid.geometry.Rectangle) parcel.readParcelable(com.microblink.blinkid.geometry.Rectangle.class.getClassLoader());
        int readInt = parcel.readInt();
        if (readInt > 0) {
            com.microblink.blinkid.results.ocr.CharWithVariants[] charWithVariantsArr = new com.microblink.blinkid.results.ocr.CharWithVariants[readInt];
            this.getHighResolutionOutputSizeshNQ4ISI = charWithVariantsArr;
            parcel.readTypedArray(charWithVariantsArr, com.microblink.blinkid.results.ocr.CharWithVariants.CREATOR);
        }
    }
}
