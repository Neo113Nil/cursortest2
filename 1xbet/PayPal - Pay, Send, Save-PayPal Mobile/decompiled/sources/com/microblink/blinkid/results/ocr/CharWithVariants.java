package com.microblink.blinkid.results.ocr;

/* loaded from: classes10.dex */
public class CharWithVariants implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.results.ocr.CharWithVariants> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.results.ocr.CharWithVariants>() { // from class: com.microblink.blinkid.results.ocr.CharWithVariants.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.results.ocr.CharWithVariants createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.results.ocr.CharWithVariants(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.results.ocr.CharWithVariants[] newArray(int i) {
            return new com.microblink.blinkid.results.ocr.CharWithVariants[i];
        }
    };
    private com.microblink.blinkid.results.ocr.OcrChar[] Camera2StreamConfigurationMap;
    private long getHighSpeedVideoFpsRanges;
    private com.microblink.blinkid.results.ocr.OcrChar getHighSpeedVideoFpsRangesFor;

    public CharWithVariants(long j, com.microblink.blinkid.results.ocr.OcrLine ocrLine) {
        this.getHighSpeedVideoFpsRangesFor = null;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRanges = j;
    }

    private static native long nativeGetChar(long j);

    private static native void nativeGetRecognitionVariants(long j, long[] jArr);

    private static native int nativeGetRecognitionVariantsCount(long j);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void dispose() {
        this.getHighSpeedVideoFpsRanges = 0L;
        com.microblink.blinkid.results.ocr.OcrChar ocrChar = this.getHighSpeedVideoFpsRangesFor;
        if (ocrChar != null) {
            ocrChar.getHighSpeedVideoSizes();
        }
        com.microblink.blinkid.results.ocr.OcrChar[] ocrCharArr = this.Camera2StreamConfigurationMap;
        if (ocrCharArr != null) {
            for (com.microblink.blinkid.results.ocr.OcrChar ocrChar2 : ocrCharArr) {
                ocrChar2.getHighSpeedVideoSizes();
            }
        }
    }

    public com.microblink.blinkid.results.ocr.OcrChar getChar() {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = new com.microblink.blinkid.results.ocr.OcrChar(nativeGetChar(this.getHighSpeedVideoFpsRanges), this);
        }
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public com.microblink.blinkid.results.ocr.OcrChar[] getRecognitionVariants() {
        int nativeGetRecognitionVariantsCount;
        if (this.Camera2StreamConfigurationMap == null) {
            long j = this.getHighSpeedVideoFpsRanges;
            if (j != 0 && (nativeGetRecognitionVariantsCount = nativeGetRecognitionVariantsCount(j)) > 0) {
                long[] jArr = new long[nativeGetRecognitionVariantsCount];
                this.Camera2StreamConfigurationMap = new com.microblink.blinkid.results.ocr.OcrChar[nativeGetRecognitionVariantsCount];
                nativeGetRecognitionVariants(this.getHighSpeedVideoFpsRanges, jArr);
                for (int i = 0; i < nativeGetRecognitionVariantsCount; i++) {
                    this.Camera2StreamConfigurationMap[i] = new com.microblink.blinkid.results.ocr.OcrChar(jArr[i], this);
                }
            }
        }
        return this.Camera2StreamConfigurationMap;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(getChar(), i);
        com.microblink.blinkid.results.ocr.OcrChar[] recognitionVariants = getRecognitionVariants();
        if (recognitionVariants == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(recognitionVariants.length);
            parcel.writeTypedArray(recognitionVariants, 0);
        }
    }

    CharWithVariants(android.os.Parcel parcel) {
        this.getHighSpeedVideoFpsRangesFor = null;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRanges = 0L;
        this.getHighSpeedVideoFpsRangesFor = (com.microblink.blinkid.results.ocr.OcrChar) parcel.readParcelable(com.microblink.blinkid.results.ocr.OcrChar.class.getClassLoader());
        int readInt = parcel.readInt();
        if (readInt > 0) {
            com.microblink.blinkid.results.ocr.OcrChar[] ocrCharArr = new com.microblink.blinkid.results.ocr.OcrChar[readInt];
            this.Camera2StreamConfigurationMap = ocrCharArr;
            parcel.readTypedArray(ocrCharArr, com.microblink.blinkid.results.ocr.OcrChar.CREATOR);
        }
    }
}
