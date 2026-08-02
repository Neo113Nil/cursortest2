package com.microblink.blinkid.results.ocr;

/* loaded from: classes10.dex */
public class OcrBlock implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.results.ocr.OcrBlock> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.results.ocr.OcrBlock>() { // from class: com.microblink.blinkid.results.ocr.OcrBlock.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.results.ocr.OcrBlock createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.results.ocr.OcrBlock(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.results.ocr.OcrBlock[] newArray(int i) {
            return new com.microblink.blinkid.results.ocr.OcrBlock[i];
        }
    };
    private final com.microblink.blinkid.results.ocr.OcrResult Camera2StreamConfigurationMap;
    long getHighSpeedVideoFpsRanges;
    private com.microblink.blinkid.geometry.Rectangle getHighSpeedVideoFpsRangesFor;
    com.microblink.blinkid.results.ocr.OcrLine[] getHighSpeedVideoSizes;

    public OcrBlock(long j, com.microblink.blinkid.results.ocr.OcrResult ocrResult) {
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRanges = j;
        this.Camera2StreamConfigurationMap = ocrResult;
    }

    private static native int nativeGetLineCount(long j);

    private static native void nativeGetLines(long j, long[] jArr);

    private static native void nativeGetRectangle(long j, short[] sArr);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public com.microblink.blinkid.results.ocr.OcrLine[] getLines() {
        if (this.getHighSpeedVideoSizes == null) {
            long j = this.getHighSpeedVideoFpsRanges;
            if (j != 0) {
                int nativeGetLineCount = nativeGetLineCount(j);
                this.getHighSpeedVideoSizes = new com.microblink.blinkid.results.ocr.OcrLine[nativeGetLineCount];
                long[] jArr = new long[nativeGetLineCount];
                nativeGetLines(this.getHighSpeedVideoFpsRanges, jArr);
                for (int i = 0; i < nativeGetLineCount; i++) {
                    this.getHighSpeedVideoSizes[i] = new com.microblink.blinkid.results.ocr.OcrLine(jArr[i], this);
                }
            }
        }
        return this.getHighSpeedVideoSizes;
    }

    public com.microblink.blinkid.geometry.Rectangle getPosition() {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            long j = this.getHighSpeedVideoFpsRanges;
            if (j != 0) {
                nativeGetRectangle(j, new short[4]);
                this.getHighSpeedVideoFpsRangesFor = new com.microblink.blinkid.geometry.Rectangle(r2[0], r2[1], r2[2], r2[3]);
            }
        }
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.lang.String toString() {
        com.microblink.blinkid.results.ocr.OcrLine[] lines = getLines();
        if (lines == null) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (com.microblink.blinkid.results.ocr.OcrLine ocrLine : lines) {
            sb.append(ocrLine.toString());
            sb.append('\n');
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(getPosition(), i);
        com.microblink.blinkid.results.ocr.OcrLine[] lines = getLines();
        if (lines == null || lines.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(lines.length);
            parcel.writeTypedArray(lines, i);
        }
    }

    OcrBlock(android.os.Parcel parcel) {
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRanges = 0L;
        this.getHighSpeedVideoFpsRangesFor = (com.microblink.blinkid.geometry.Rectangle) parcel.readParcelable(com.microblink.blinkid.geometry.Rectangle.class.getClassLoader());
        int readInt = parcel.readInt();
        if (readInt > 0) {
            com.microblink.blinkid.results.ocr.OcrLine[] ocrLineArr = new com.microblink.blinkid.results.ocr.OcrLine[readInt];
            this.getHighSpeedVideoSizes = ocrLineArr;
            parcel.readTypedArray(ocrLineArr, com.microblink.blinkid.results.ocr.OcrLine.CREATOR);
        }
    }
}
