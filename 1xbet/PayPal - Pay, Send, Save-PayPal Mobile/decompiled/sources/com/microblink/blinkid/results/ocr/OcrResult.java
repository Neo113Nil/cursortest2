package com.microblink.blinkid.results.ocr;

/* loaded from: classes10.dex */
public class OcrResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.results.ocr.OcrResult> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.results.ocr.OcrResult>() { // from class: com.microblink.blinkid.results.ocr.OcrResult.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.results.ocr.OcrResult createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.results.ocr.OcrResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.results.ocr.OcrResult[] newArray(int i) {
            return new com.microblink.blinkid.results.ocr.OcrResult[i];
        }
    };
    private final java.lang.Object Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private final long getHighSpeedVideoFpsRanges;
    private com.microblink.blinkid.results.ocr.OcrBlock[] getHighSpeedVideoFpsRangesFor;

    public OcrResult(long j, java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        this.getHighSpeedVideoFpsRanges = j;
        this.Camera2StreamConfigurationMap = obj;
    }

    private static native long nativeClone(long j);

    private static native void nativeDestruct(long j);

    private static native int nativeGetBlockCount(long j);

    private static native void nativeGetBlocks(long j, long[] jArr);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void dispose() {
        long j = this.getHighSpeedVideoFpsRanges;
        if (j != 0 && this.Camera2StreamConfigurationMap == null) {
            nativeDestruct(j);
            com.microblink.blinkid.results.ocr.OcrBlock[] ocrBlockArr = this.getHighSpeedVideoFpsRangesFor;
            if (ocrBlockArr != null) {
                for (com.microblink.blinkid.results.ocr.OcrBlock ocrBlock : ocrBlockArr) {
                    ocrBlock.getHighSpeedVideoFpsRanges = 0L;
                    com.microblink.blinkid.results.ocr.OcrLine[] ocrLineArr = ocrBlock.getHighSpeedVideoSizes;
                    if (ocrLineArr != null) {
                        for (com.microblink.blinkid.results.ocr.OcrLine ocrLine : ocrLineArr) {
                            ocrLine.Camera2StreamConfigurationMap = 0L;
                            com.microblink.blinkid.results.ocr.CharWithVariants[] charWithVariantsArr = ocrLine.getHighResolutionOutputSizeshNQ4ISI;
                            if (charWithVariantsArr != null) {
                                for (com.microblink.blinkid.results.ocr.CharWithVariants charWithVariants : charWithVariantsArr) {
                                    charWithVariants.dispose();
                                }
                            }
                            ocrLine.getHighResolutionOutputSizeshNQ4ISI = null;
                        }
                    }
                    ocrBlock.getHighSpeedVideoSizes = null;
                }
            }
        }
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
    }

    protected final void finalize() {
        super.finalize();
        dispose();
    }

    public com.microblink.blinkid.results.ocr.OcrBlock[] getBlocks() {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Cannot use OcrResult that has been disposed!");
        }
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            long j = this.getHighSpeedVideoFpsRanges;
            if (j != 0) {
                int nativeGetBlockCount = nativeGetBlockCount(j);
                this.getHighSpeedVideoFpsRangesFor = new com.microblink.blinkid.results.ocr.OcrBlock[nativeGetBlockCount];
                long[] jArr = new long[nativeGetBlockCount];
                nativeGetBlocks(this.getHighSpeedVideoFpsRanges, jArr);
                for (int i = 0; i < nativeGetBlockCount; i++) {
                    this.getHighSpeedVideoFpsRangesFor[i] = new com.microblink.blinkid.results.ocr.OcrBlock(jArr[i], this);
                }
            }
        }
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.lang.String toString() {
        com.microblink.blinkid.results.ocr.OcrBlock[] blocks = getBlocks();
        if (blocks == null) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (com.microblink.blinkid.results.ocr.OcrBlock ocrBlock : blocks) {
            sb.append(ocrBlock.toString());
            sb.append('\n');
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        com.microblink.blinkid.results.ocr.OcrBlock[] blocks = getBlocks();
        if (blocks == null || blocks.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(blocks.length);
            parcel.writeTypedArray(blocks, i);
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.microblink.blinkid.results.ocr.OcrResult m10898clone() {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Cannot clone OcrResult that has been disposed!");
        }
        return new com.microblink.blinkid.results.ocr.OcrResult(nativeClone(this.getHighSpeedVideoFpsRanges), null);
    }

    OcrResult(android.os.Parcel parcel) {
        this.getHighSpeedVideoFpsRangesFor = null;
        this.Camera2StreamConfigurationMap = null;
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        this.getHighSpeedVideoFpsRanges = 0L;
        int readInt = parcel.readInt();
        if (readInt > 0) {
            com.microblink.blinkid.results.ocr.OcrBlock[] ocrBlockArr = new com.microblink.blinkid.results.ocr.OcrBlock[readInt];
            this.getHighSpeedVideoFpsRangesFor = ocrBlockArr;
            parcel.readTypedArray(ocrBlockArr, com.microblink.blinkid.results.ocr.OcrBlock.CREATOR);
        }
    }
}
