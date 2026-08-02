package com.microblink.blinkid.entities.parsers.config.fieldbyfield;

/* loaded from: classes9.dex */
public class FieldByFieldElement implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldElement> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldElement>() { // from class: com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldElement.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldElement createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldElement(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldElement[] newArray(int i) {
            return new com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldElement[i];
        }
    };
    private java.lang.Float Camera2StreamConfigurationMap;
    com.microblink.blinkid.entities.parsers.Parser getHighResolutionOutputSizeshNQ4ISI;
    private float getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizes;
    private java.lang.Float getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private java.lang.String getInputSizeshNQ4ISI;
    private float getOutputFormats;
    private boolean getOutputMinFrameDuration;

    public FieldByFieldElement(int i, int i2, com.microblink.blinkid.entities.parsers.Parser<?> parser) {
        this.getOutputFormats = 0.9f;
        this.getHighSpeedVideoFpsRanges = 0.8f;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizesFor = null;
        this.getInputFormats = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = parser;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public com.microblink.blinkid.entities.parsers.Parser<?> getParser() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public float getScanRegionRelativeHeight() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public float getScanRegionRelativeWidth() {
        return this.getOutputFormats;
    }

    public float getShownScanRegionRelativeHeight() {
        java.lang.Float f = this.getHighSpeedVideoSizesFor;
        return f == null ? this.getHighSpeedVideoFpsRanges : f.floatValue();
    }

    public float getShownScanRegionRelativeWidth() {
        java.lang.Float f = this.Camera2StreamConfigurationMap;
        return f == null ? this.getOutputFormats : f.floatValue();
    }

    public java.lang.String getText(android.content.Context context) {
        if (this.getHighSpeedVideoSizes == null) {
            this.getHighSpeedVideoSizes = context.getString(this.getHighSpeedVideoFpsRangesFor);
        }
        return this.getHighSpeedVideoSizes;
    }

    public int getTextResource() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.lang.String getTitle(android.content.Context context) {
        if (this.getInputSizeshNQ4ISI == null) {
            this.getInputSizeshNQ4ISI = context.getString(this.getInputFormats);
        }
        return this.getInputSizeshNQ4ISI;
    }

    public int getTitleResource() {
        return this.getInputFormats;
    }

    public boolean isOptional() {
        return this.getOutputMinFrameDuration;
    }

    public void setOptional(boolean z) {
        this.getOutputMinFrameDuration = z;
    }

    public void setParser(com.microblink.blinkid.entities.parsers.Parser<?> parser) {
        this.getHighResolutionOutputSizeshNQ4ISI = parser;
    }

    public void setScanRegionRelativeHeight(float f) {
        if (f > 0.0f && f <= 1.0f) {
            this.getHighSpeedVideoFpsRanges = f;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Relative height must be from interval <0.0, 1.0], argument value is: ");
        sb.append(f);
        sb.append("!");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public void setScanRegionRelativeWidth(float f) {
        if (f > 0.0f && f <= 1.0f) {
            this.getOutputFormats = f;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Relative width must be from interval <0.0, 1.0], argument value is: ");
        sb.append(f);
        sb.append("!");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public void setShownScanRegionRelativeHeight(float f) {
        if (f > 0.0f && f <= 1.0f) {
            this.getHighSpeedVideoSizesFor = java.lang.Float.valueOf(f);
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Relative height must be from interval <0.0, 1.0], argument value is: ");
        sb.append(f);
        sb.append("!");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public void setShownScanRegionRelativeWidth(float f) {
        if (f > 0.0f && f <= 1.0f) {
            this.Camera2StreamConfigurationMap = java.lang.Float.valueOf(f);
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Relative width must be from interval <0.0, 1.0], argument value is: ");
        sb.append(f);
        sb.append("!");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public void setText(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
    }

    public void setTextResource(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public void setTitle(java.lang.String str) {
        this.getInputSizeshNQ4ISI = str;
    }

    public void setTitleResource(int i) {
        this.getInputFormats = i;
    }

    public java.lang.String toString() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.getInputFormats);
        parcel.writeInt(this.getHighSpeedVideoFpsRangesFor);
        parcel.writeParcelable(this.getHighResolutionOutputSizeshNQ4ISI, i);
        java.lang.String str = this.getInputSizeshNQ4ISI;
        if (str == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(str);
        }
        java.lang.String str2 = this.getHighSpeedVideoSizes;
        if (str2 == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(str2);
        }
        parcel.writeByte(this.getOutputMinFrameDuration ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.getOutputFormats);
        parcel.writeFloat(this.getHighSpeedVideoFpsRanges);
        java.lang.Float f = this.getHighSpeedVideoSizesFor;
        if (f == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeFloat(f.floatValue());
        }
        java.lang.Float f2 = this.Camera2StreamConfigurationMap;
        if (f2 == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeFloat(f2.floatValue());
        }
    }

    public FieldByFieldElement(java.lang.String str, java.lang.String str2, com.microblink.blinkid.entities.parsers.Parser<?> parser) {
        this.getOutputFormats = 0.9f;
        this.getHighSpeedVideoFpsRanges = 0.8f;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizesFor = null;
        this.getInputSizeshNQ4ISI = str;
        this.getHighSpeedVideoSizes = str2;
        this.getHighResolutionOutputSizeshNQ4ISI = parser;
    }

    FieldByFieldElement(android.os.Parcel parcel) {
        this.getOutputFormats = 0.9f;
        this.getHighSpeedVideoFpsRanges = 0.8f;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizesFor = null;
        this.getInputFormats = parcel.readInt();
        this.getHighSpeedVideoFpsRangesFor = parcel.readInt();
        this.getHighResolutionOutputSizeshNQ4ISI = (com.microblink.blinkid.entities.parsers.Parser) parcel.readParcelable(com.microblink.blinkid.entities.parsers.Parser.class.getClassLoader());
        this.getInputSizeshNQ4ISI = parcel.readByte() == 1 ? parcel.readString() : null;
        this.getHighSpeedVideoSizes = parcel.readByte() == 1 ? parcel.readString() : null;
        this.getOutputMinFrameDuration = parcel.readByte() == 1;
        this.getOutputFormats = parcel.readFloat();
        this.getHighSpeedVideoFpsRanges = parcel.readFloat();
        this.getHighSpeedVideoSizesFor = parcel.readByte() == 0 ? null : java.lang.Float.valueOf(parcel.readFloat());
        this.Camera2StreamConfigurationMap = parcel.readByte() != 0 ? java.lang.Float.valueOf(parcel.readFloat()) : null;
    }
}
