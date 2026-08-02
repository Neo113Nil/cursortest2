package com.daon.dmds.models;

/* loaded from: classes7.dex */
public class DMDSDocumentResultQuality implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.daon.dmds.models.DMDSDocumentResultQuality> CREATOR = new android.os.Parcelable.Creator<com.daon.dmds.models.DMDSDocumentResultQuality>() { // from class: com.daon.dmds.models.DMDSDocumentResultQuality.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.daon.dmds.models.DMDSDocumentResultQuality createFromParcel(android.os.Parcel parcel) {
            return new com.daon.dmds.models.DMDSDocumentResultQuality(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.daon.dmds.models.DMDSDocumentResultQuality[] newArray(int i) {
            return new com.daon.dmds.models.DMDSDocumentResultQuality[i];
        }
    };
    private double Camera2StreamConfigurationMap;
    private double getHighResolutionOutputSizeshNQ4ISI;
    private double getHighSpeedVideoFpsRanges;
    private double getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private double getHighSpeedVideoSizesFor;
    private double getInputFormats;
    private int getInputSizeshNQ4ISI;
    private double getOutputFormats;
    private int getOutputMinFrameDuration;
    private double getOutputMinFrameDurationlomOqCM;
    private double getOutputSizes;
    private double getOutputSizeshNQ4ISI;
    private double getOutputStallDuration;

    public static class Builder {
        private double Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private double getHighSpeedVideoFpsRanges;
        private double getHighSpeedVideoFpsRangesFor;
        private double getHighSpeedVideoSizes;
        private int getHighSpeedVideoSizesFor;
        private double getInputFormats;
        private int getInputSizeshNQ4ISI;
        private double getOutputFormats;
        private double getOutputMinFrameDuration;
        private double getOutputMinFrameDurationlomOqCM;
        private double getOutputSizes;
        private double getOutputSizeshNQ4ISI;
        private double getOutputStallDuration;

        public com.daon.dmds.models.DMDSDocumentResultQuality build() {
            return new com.daon.dmds.models.DMDSDocumentResultQuality(this, (byte) 0);
        }

        public com.daon.dmds.models.DMDSDocumentResultQuality.Builder setAspectRatio(double d) {
            this.getHighSpeedVideoFpsRangesFor = d;
            return this;
        }

        public com.daon.dmds.models.DMDSDocumentResultQuality.Builder setDPISource(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            return this;
        }

        public com.daon.dmds.models.DMDSDocumentResultQuality.Builder setGlareFixed(double d) {
            this.getHighSpeedVideoFpsRanges = d;
            return this;
        }

        public com.daon.dmds.models.DMDSDocumentResultQuality.Builder setGlobalBlur(double d) {
            this.Camera2StreamConfigurationMap = d;
            return this;
        }

        public com.daon.dmds.models.DMDSDocumentResultQuality.Builder setHorizDistort(double d) {
            this.getHighSpeedVideoSizes = d;
            return this;
        }

        public com.daon.dmds.models.DMDSDocumentResultQuality.Builder setIDSourceHeight(int i) {
            this.getHighSpeedVideoSizesFor = i;
            return this;
        }

        public com.daon.dmds.models.DMDSDocumentResultQuality.Builder setIDSourceWidth(int i) {
            this.getInputSizeshNQ4ISI = i;
            return this;
        }

        public com.daon.dmds.models.DMDSDocumentResultQuality.Builder setLocalBlur(double d) {
            this.getInputFormats = d;
            return this;
        }

        public com.daon.dmds.models.DMDSDocumentResultQuality.Builder setMaxInternalAngle(double d) {
            this.getOutputMinFrameDuration = d;
            return this;
        }

        public com.daon.dmds.models.DMDSDocumentResultQuality.Builder setMinInternalAngle(double d) {
            this.getOutputFormats = d;
            return this;
        }

        public com.daon.dmds.models.DMDSDocumentResultQuality.Builder setSize(double d) {
            this.getOutputSizeshNQ4ISI = d;
            return this;
        }

        public com.daon.dmds.models.DMDSDocumentResultQuality.Builder setSumInternalAngle(double d) {
            this.getOutputStallDuration = d;
            return this;
        }

        public com.daon.dmds.models.DMDSDocumentResultQuality.Builder setSummary(double d) {
            this.getOutputSizes = d;
            return this;
        }

        public com.daon.dmds.models.DMDSDocumentResultQuality.Builder setVertDistort(double d) {
            this.getOutputMinFrameDurationlomOqCM = d;
            return this;
        }
    }

    /* synthetic */ DMDSDocumentResultQuality(com.daon.dmds.models.DMDSDocumentResultQuality.Builder builder, byte b) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.daon.dmds.models.DMDSDocumentResultQuality dMDSDocumentResultQuality = (com.daon.dmds.models.DMDSDocumentResultQuality) obj;
        return java.lang.Double.compare(dMDSDocumentResultQuality.getOutputStallDuration, this.getOutputStallDuration) == 0 && java.lang.Double.compare(dMDSDocumentResultQuality.Camera2StreamConfigurationMap, this.Camera2StreamConfigurationMap) == 0 && java.lang.Double.compare(dMDSDocumentResultQuality.getOutputSizeshNQ4ISI, this.getOutputSizeshNQ4ISI) == 0 && java.lang.Double.compare(dMDSDocumentResultQuality.getOutputSizes, this.getOutputSizes) == 0 && java.lang.Double.compare(dMDSDocumentResultQuality.getHighResolutionOutputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI) == 0 && java.lang.Double.compare(dMDSDocumentResultQuality.getOutputFormats, this.getOutputFormats) == 0 && java.lang.Double.compare(dMDSDocumentResultQuality.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizesFor) == 0 && java.lang.Double.compare(dMDSDocumentResultQuality.getOutputMinFrameDurationlomOqCM, this.getOutputMinFrameDurationlomOqCM) == 0 && java.lang.Double.compare(dMDSDocumentResultQuality.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRangesFor) == 0 && java.lang.Double.compare(dMDSDocumentResultQuality.getInputFormats, this.getInputFormats) == 0 && java.lang.Double.compare(dMDSDocumentResultQuality.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRanges) == 0 && this.getInputSizeshNQ4ISI == dMDSDocumentResultQuality.getInputSizeshNQ4ISI && this.getOutputMinFrameDuration == dMDSDocumentResultQuality.getOutputMinFrameDuration && this.getHighSpeedVideoSizes == dMDSDocumentResultQuality.getHighSpeedVideoSizes;
    }

    public double getAspectRatio() {
        return this.Camera2StreamConfigurationMap;
    }

    public int getDPISource() {
        return this.getHighSpeedVideoSizes;
    }

    public double getGlareFixed() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public double getHorizDistort() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int getIDSourceHeight() {
        return this.getOutputMinFrameDuration;
    }

    public int getIDSourceWidth() {
        return this.getInputSizeshNQ4ISI;
    }

    public double getLocalBlur() {
        return this.getInputFormats;
    }

    public double getMaxInternalAngle() {
        return this.getHighSpeedVideoSizesFor;
    }

    public double getMinInternalAngle() {
        return this.getOutputFormats;
    }

    public double getSize() {
        return this.getOutputSizeshNQ4ISI;
    }

    public double getSumInternalAngle() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public double getSummary() {
        return this.getOutputStallDuration;
    }

    public double getVertDistort() {
        return this.getOutputSizes;
    }

    public int hashCode() {
        return java.util.Objects.hash(java.lang.Double.valueOf(this.getOutputStallDuration), java.lang.Double.valueOf(this.Camera2StreamConfigurationMap), java.lang.Double.valueOf(this.getOutputSizeshNQ4ISI), java.lang.Double.valueOf(this.getOutputSizes), java.lang.Double.valueOf(this.getHighResolutionOutputSizeshNQ4ISI), java.lang.Double.valueOf(this.getOutputFormats), java.lang.Double.valueOf(this.getHighSpeedVideoSizesFor), java.lang.Double.valueOf(this.getOutputMinFrameDurationlomOqCM), java.lang.Double.valueOf(this.getHighSpeedVideoFpsRangesFor), java.lang.Double.valueOf(this.getInputFormats), java.lang.Double.valueOf(this.getHighSpeedVideoFpsRanges), java.lang.Integer.valueOf(this.getInputSizeshNQ4ISI), java.lang.Integer.valueOf(this.getOutputMinFrameDuration), java.lang.Integer.valueOf(this.getHighSpeedVideoSizes));
    }

    public void readFromParcel(android.os.Parcel parcel) {
        this.getOutputStallDuration = parcel.readDouble();
        this.Camera2StreamConfigurationMap = parcel.readDouble();
        this.getOutputSizeshNQ4ISI = parcel.readDouble();
        this.getOutputSizes = parcel.readDouble();
        this.getHighResolutionOutputSizeshNQ4ISI = parcel.readDouble();
        this.getOutputFormats = parcel.readDouble();
        this.getHighSpeedVideoSizesFor = parcel.readDouble();
        this.getOutputMinFrameDurationlomOqCM = parcel.readDouble();
        this.getHighSpeedVideoFpsRangesFor = parcel.readDouble();
        this.getInputFormats = parcel.readDouble();
        this.getHighSpeedVideoFpsRanges = parcel.readDouble();
        this.getInputSizeshNQ4ISI = parcel.readInt();
        this.getOutputMinFrameDuration = parcel.readInt();
        this.getHighSpeedVideoSizes = parcel.readInt();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DMDSDocumentResultQuality{summary=");
        sb.append(this.getOutputStallDuration);
        sb.append(", aspectRatio=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", size=");
        sb.append(this.getOutputSizeshNQ4ISI);
        sb.append(", vertDistort=");
        sb.append(this.getOutputSizes);
        sb.append(", horizDistort=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", minInternalAngle=");
        sb.append(this.getOutputFormats);
        sb.append(", maxInternalAngle=");
        sb.append(this.getHighSpeedVideoSizesFor);
        sb.append(", sumInternalAngle=");
        sb.append(this.getOutputMinFrameDurationlomOqCM);
        sb.append(", glareFixed=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", localBlur=");
        sb.append(this.getInputFormats);
        sb.append(", globalBlur=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", idSourceWidth=");
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append(", idSourceHeight=");
        sb.append(this.getOutputMinFrameDuration);
        sb.append(", dpiSource=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeDouble(this.getOutputStallDuration);
        parcel.writeDouble(this.Camera2StreamConfigurationMap);
        parcel.writeDouble(this.getOutputSizeshNQ4ISI);
        parcel.writeDouble(this.getOutputSizes);
        parcel.writeDouble(this.getHighResolutionOutputSizeshNQ4ISI);
        parcel.writeDouble(this.getOutputFormats);
        parcel.writeDouble(this.getHighSpeedVideoSizesFor);
        parcel.writeDouble(this.getOutputMinFrameDurationlomOqCM);
        parcel.writeDouble(this.getHighSpeedVideoFpsRangesFor);
        parcel.writeDouble(this.getInputFormats);
        parcel.writeDouble(this.getHighSpeedVideoFpsRanges);
        parcel.writeInt(this.getInputSizeshNQ4ISI);
        parcel.writeInt(this.getOutputMinFrameDuration);
        parcel.writeInt(this.getHighSpeedVideoSizes);
    }

    private DMDSDocumentResultQuality(com.daon.dmds.models.DMDSDocumentResultQuality.Builder builder) {
        this.getOutputStallDuration = builder.getOutputSizes;
        this.Camera2StreamConfigurationMap = builder.getHighSpeedVideoFpsRangesFor;
        this.getOutputSizeshNQ4ISI = builder.getOutputSizeshNQ4ISI;
        this.getOutputSizes = builder.getOutputMinFrameDurationlomOqCM;
        this.getHighResolutionOutputSizeshNQ4ISI = builder.getHighSpeedVideoSizes;
        this.getOutputFormats = builder.getOutputFormats;
        this.getHighSpeedVideoSizesFor = builder.getOutputMinFrameDuration;
        this.getOutputMinFrameDurationlomOqCM = builder.getOutputStallDuration;
        this.getHighSpeedVideoFpsRangesFor = builder.getHighSpeedVideoFpsRanges;
        this.getInputFormats = builder.getInputFormats;
        this.getHighSpeedVideoFpsRanges = builder.Camera2StreamConfigurationMap;
        this.getInputSizeshNQ4ISI = builder.getInputSizeshNQ4ISI;
        this.getOutputMinFrameDuration = builder.getHighSpeedVideoSizesFor;
        this.getHighSpeedVideoSizes = builder.getHighResolutionOutputSizeshNQ4ISI;
    }

    protected DMDSDocumentResultQuality(android.os.Parcel parcel) {
        this.getOutputStallDuration = parcel.readDouble();
        this.Camera2StreamConfigurationMap = parcel.readDouble();
        this.getOutputSizeshNQ4ISI = parcel.readDouble();
        this.getOutputSizes = parcel.readDouble();
        this.getHighResolutionOutputSizeshNQ4ISI = parcel.readDouble();
        this.getOutputFormats = parcel.readDouble();
        this.getHighSpeedVideoSizesFor = parcel.readDouble();
        this.getOutputMinFrameDurationlomOqCM = parcel.readDouble();
        this.getHighSpeedVideoFpsRangesFor = parcel.readDouble();
        this.getInputFormats = parcel.readDouble();
        this.getHighSpeedVideoFpsRanges = parcel.readDouble();
        this.getInputSizeshNQ4ISI = parcel.readInt();
        this.getOutputMinFrameDuration = parcel.readInt();
        this.getHighSpeedVideoSizes = parcel.readInt();
    }
}
