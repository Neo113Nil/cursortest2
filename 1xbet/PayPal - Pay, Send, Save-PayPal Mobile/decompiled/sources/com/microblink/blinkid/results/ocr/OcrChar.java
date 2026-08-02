package com.microblink.blinkid.results.ocr;

/* loaded from: classes10.dex */
public class OcrChar implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.results.ocr.OcrChar> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.results.ocr.OcrChar>() { // from class: com.microblink.blinkid.results.ocr.OcrChar.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.results.ocr.OcrChar createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.results.ocr.OcrChar(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.results.ocr.OcrChar[] newArray(int i) {
            return new com.microblink.blinkid.results.ocr.OcrChar[i];
        }
    };
    private com.microblink.blinkid.geometry.Rectangle Camera2StreamConfigurationMap;
    private long getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.Integer getHighSpeedVideoFpsRanges;
    private java.lang.Boolean getHighSpeedVideoFpsRangesFor;
    private com.microblink.blinkid.results.ocr.OcrFont getHighSpeedVideoSizes;
    private final java.lang.Object getHighSpeedVideoSizesFor;
    private java.lang.Integer getInputFormats;
    private java.lang.Character getOutputMinFrameDuration;

    public OcrChar(long j, java.lang.Object obj) {
        this.getOutputMinFrameDuration = null;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getInputFormats = null;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizes = null;
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoSizesFor = obj;
    }

    private static native int nativeGetFont(long j);

    private static native int nativeGetHeight(long j);

    private static native int nativeGetQuality(long j);

    private static native void nativeGetRectangle(long j, short[] sArr);

    private static native char nativeGetValue(long j);

    private static native boolean nativeIsUncertain(long j);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public com.microblink.blinkid.results.ocr.OcrFont getFont() {
        if (this.getHighSpeedVideoSizes == null) {
            long j = this.getHighResolutionOutputSizeshNQ4ISI;
            if (j != 0) {
                int nativeGetFont = nativeGetFont(j);
                if (nativeGetFont > 0) {
                    this.getHighSpeedVideoSizes = com.microblink.blinkid.results.ocr.OcrFont.values()[nativeGetFont];
                } else {
                    this.getHighSpeedVideoSizes = com.microblink.blinkid.results.ocr.OcrFont.OCR_FONT_ANY;
                }
            }
        }
        return this.getHighSpeedVideoSizes;
    }

    public int getHeight() {
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.getHighSpeedVideoFpsRanges = java.lang.Integer.valueOf(nativeGetHeight(this.getHighResolutionOutputSizeshNQ4ISI));
        }
        return this.getHighSpeedVideoFpsRanges.intValue();
    }

    final void getHighSpeedVideoSizes() {
        this.getOutputMinFrameDuration = null;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getInputFormats = null;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizes = null;
        this.getHighResolutionOutputSizeshNQ4ISI = 0L;
    }

    public com.microblink.blinkid.geometry.Rectangle getPosition() {
        if (this.Camera2StreamConfigurationMap == null) {
            long j = this.getHighResolutionOutputSizeshNQ4ISI;
            if (j != 0) {
                nativeGetRectangle(j, new short[4]);
                this.Camera2StreamConfigurationMap = new com.microblink.blinkid.geometry.Rectangle(r2[0], r2[1], r2[2], r2[3]);
            }
        }
        return this.Camera2StreamConfigurationMap;
    }

    public int getQuality() {
        if (this.getInputFormats == null) {
            this.getInputFormats = java.lang.Integer.valueOf(nativeGetQuality(this.getHighResolutionOutputSizeshNQ4ISI));
        }
        return this.getInputFormats.intValue();
    }

    public char getValue() {
        if (this.getOutputMinFrameDuration == null) {
            this.getOutputMinFrameDuration = java.lang.Character.valueOf(nativeGetValue(this.getHighResolutionOutputSizeshNQ4ISI));
        }
        return this.getOutputMinFrameDuration.charValue();
    }

    public boolean isUncertain() {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = java.lang.Boolean.valueOf(nativeIsUncertain(this.getHighResolutionOutputSizeshNQ4ISI));
        }
        return this.getHighSpeedVideoFpsRangesFor.booleanValue();
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(getValue());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeCharArray(new char[]{getValue()});
        parcel.writeInt(getHeight());
        parcel.writeInt(getQuality());
        parcel.writeParcelable(getPosition(), i);
        parcel.writeByte(isUncertain() ? (byte) 1 : (byte) 0);
        com.microblink.blinkid.results.ocr.OcrFont font = getFont();
        parcel.writeInt(font == null ? -1 : font.ordinal());
    }

    OcrChar(android.os.Parcel parcel) {
        this.getOutputMinFrameDuration = null;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getInputFormats = null;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizes = null;
        this.getHighResolutionOutputSizeshNQ4ISI = 0L;
        char[] cArr = new char[1];
        parcel.readCharArray(cArr);
        this.getOutputMinFrameDuration = java.lang.Character.valueOf(cArr[0]);
        this.getHighSpeedVideoFpsRanges = java.lang.Integer.valueOf(parcel.readInt());
        this.getInputFormats = java.lang.Integer.valueOf(parcel.readInt());
        this.Camera2StreamConfigurationMap = (com.microblink.blinkid.geometry.Rectangle) parcel.readParcelable(com.microblink.blinkid.geometry.Rectangle.class.getClassLoader());
        this.getHighSpeedVideoFpsRangesFor = java.lang.Boolean.valueOf(parcel.readByte() == 1);
        int readInt = parcel.readInt();
        if (readInt == -1) {
            this.getHighSpeedVideoSizes = null;
        } else {
            this.getHighSpeedVideoSizes = com.microblink.blinkid.results.ocr.OcrFont.values()[readInt];
        }
    }
}
