package com.daon.dmds.models;

/* loaded from: classes7.dex */
public class DMDSFaceResultQuality implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.daon.dmds.models.DMDSFaceResultQuality> CREATOR = new android.os.Parcelable.Creator<com.daon.dmds.models.DMDSFaceResultQuality>() { // from class: com.daon.dmds.models.DMDSFaceResultQuality.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.daon.dmds.models.DMDSFaceResultQuality createFromParcel(android.os.Parcel parcel) {
            return new com.daon.dmds.models.DMDSFaceResultQuality(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.daon.dmds.models.DMDSFaceResultQuality[] newArray(int i) {
            return new com.daon.dmds.models.DMDSFaceResultQuality[i];
        }
    };
    private float Camera2StreamConfigurationMap;
    private float getHighResolutionOutputSizeshNQ4ISI;
    private float getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private float getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private int getInputSizeshNQ4ISI;
    private float getOutputFormats;
    private int getOutputMinFrameDuration;
    private int getOutputMinFrameDurationlomOqCM;
    private float getOutputStallDuration;

    public static class Builder {
        private int Camera2StreamConfigurationMap;
        private float getHighResolutionOutputSizeshNQ4ISI;
        private float getHighSpeedVideoFpsRanges;
        private float getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;
        private float getHighSpeedVideoSizesFor;
        private int getInputFormats;
        private int getInputSizeshNQ4ISI;
        private int getOutputFormats;
        private float getOutputMinFrameDuration;
        private float getOutputSizeshNQ4ISI;
        private int getOutputStallDurationlomOqCM;

        public com.daon.dmds.models.DMDSFaceResultQuality build() {
            return new com.daon.dmds.models.DMDSFaceResultQuality(this, (byte) 0);
        }

        public com.daon.dmds.models.DMDSFaceResultQuality.Builder setExposure(int i) {
            this.Camera2StreamConfigurationMap = i;
            return this;
        }

        public com.daon.dmds.models.DMDSFaceResultQuality.Builder setEyeDistance(int i) {
            this.getHighSpeedVideoSizes = i;
            return this;
        }

        public com.daon.dmds.models.DMDSFaceResultQuality.Builder setEyesFoundConfidence(float f) {
            this.getHighSpeedVideoFpsRanges = f;
            return this;
        }

        public com.daon.dmds.models.DMDSFaceResultQuality.Builder setEyesOpenConfidence(float f) {
            this.getHighSpeedVideoFpsRangesFor = f;
            return this;
        }

        public com.daon.dmds.models.DMDSFaceResultQuality.Builder setFaceFoundConfidence(float f) {
            this.getHighResolutionOutputSizeshNQ4ISI = f;
            return this;
        }

        public com.daon.dmds.models.DMDSFaceResultQuality.Builder setFaceFrontalConfidence(float f) {
            this.getOutputMinFrameDuration = f;
            return this;
        }

        public com.daon.dmds.models.DMDSFaceResultQuality.Builder setFaceRotation(int i) {
            this.getOutputFormats = i;
            return this;
        }

        public com.daon.dmds.models.DMDSFaceResultQuality.Builder setGlobalScore(float f) {
            this.getHighSpeedVideoSizesFor = f;
            return this;
        }

        public com.daon.dmds.models.DMDSFaceResultQuality.Builder setGrayscaleDensity(int i) {
            this.getInputSizeshNQ4ISI = i;
            return this;
        }

        public com.daon.dmds.models.DMDSFaceResultQuality.Builder setPoseAngle(int i) {
            this.getInputFormats = i;
            return this;
        }

        public com.daon.dmds.models.DMDSFaceResultQuality.Builder setSharpness(int i) {
            this.getOutputStallDurationlomOqCM = i;
            return this;
        }

        public com.daon.dmds.models.DMDSFaceResultQuality.Builder setUniformLightingConfidence(float f) {
            this.getOutputSizeshNQ4ISI = f;
            return this;
        }
    }

    /* synthetic */ DMDSFaceResultQuality(com.daon.dmds.models.DMDSFaceResultQuality.Builder builder, byte b) {
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
        com.daon.dmds.models.DMDSFaceResultQuality dMDSFaceResultQuality = (com.daon.dmds.models.DMDSFaceResultQuality) obj;
        return this.getInputSizeshNQ4ISI == dMDSFaceResultQuality.getInputSizeshNQ4ISI && java.lang.Float.compare(dMDSFaceResultQuality.Camera2StreamConfigurationMap, this.Camera2StreamConfigurationMap) == 0 && java.lang.Float.compare(dMDSFaceResultQuality.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRanges) == 0 && java.lang.Float.compare(dMDSFaceResultQuality.getHighResolutionOutputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI) == 0 && java.lang.Float.compare(dMDSFaceResultQuality.getOutputStallDuration, this.getOutputStallDuration) == 0 && java.lang.Float.compare(dMDSFaceResultQuality.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizesFor) == 0 && this.getHighSpeedVideoFpsRangesFor == dMDSFaceResultQuality.getHighSpeedVideoFpsRangesFor && this.getInputFormats == dMDSFaceResultQuality.getInputFormats && this.getOutputMinFrameDurationlomOqCM == dMDSFaceResultQuality.getOutputMinFrameDurationlomOqCM && this.getHighSpeedVideoSizes == dMDSFaceResultQuality.getHighSpeedVideoSizes && this.getOutputMinFrameDuration == dMDSFaceResultQuality.getOutputMinFrameDuration && java.lang.Float.compare(dMDSFaceResultQuality.getOutputFormats, this.getOutputFormats) == 0;
    }

    public int getExposure() {
        return this.getHighSpeedVideoSizes;
    }

    public int getEyeDistance() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public float getEyesFoundConfidence() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public float getEyesOpenConfidence() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public float getFaceFoundConfidence() {
        return this.Camera2StreamConfigurationMap;
    }

    public float getFaceFrontalConfidence() {
        return this.getHighSpeedVideoSizesFor;
    }

    public int getFaceRotation() {
        return this.getInputSizeshNQ4ISI;
    }

    public float getGlobalScore() {
        return this.getOutputFormats;
    }

    public int getGrayscaleDensity() {
        return this.getOutputMinFrameDuration;
    }

    public int getPoseAngle() {
        return this.getInputFormats;
    }

    public int getSharpness() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public float getUniformLightingConfidence() {
        return this.getOutputStallDuration;
    }

    public int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.getInputSizeshNQ4ISI), java.lang.Float.valueOf(this.Camera2StreamConfigurationMap), java.lang.Float.valueOf(this.getHighSpeedVideoFpsRanges), java.lang.Float.valueOf(this.getHighResolutionOutputSizeshNQ4ISI), java.lang.Float.valueOf(this.getOutputStallDuration), java.lang.Float.valueOf(this.getHighSpeedVideoSizesFor), java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor), java.lang.Integer.valueOf(this.getInputFormats), java.lang.Integer.valueOf(this.getOutputMinFrameDurationlomOqCM), java.lang.Integer.valueOf(this.getHighSpeedVideoSizes), java.lang.Integer.valueOf(this.getOutputMinFrameDuration), java.lang.Float.valueOf(this.getOutputFormats));
    }

    public void readFromParcel(android.os.Parcel parcel) {
        this.getInputSizeshNQ4ISI = parcel.readInt();
        this.Camera2StreamConfigurationMap = parcel.readFloat();
        this.getHighSpeedVideoFpsRanges = parcel.readFloat();
        this.getHighResolutionOutputSizeshNQ4ISI = parcel.readFloat();
        this.getOutputStallDuration = parcel.readFloat();
        this.getHighSpeedVideoSizesFor = parcel.readFloat();
        this.getHighSpeedVideoFpsRangesFor = parcel.readInt();
        this.getInputFormats = parcel.readInt();
        this.getOutputMinFrameDurationlomOqCM = parcel.readInt();
        this.getHighSpeedVideoSizes = parcel.readInt();
        this.getOutputMinFrameDuration = parcel.readInt();
        this.getOutputFormats = parcel.readFloat();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DMDSFaceResultQuality{faceRotation=");
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append(", faceFoundConfidence=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", eyesFoundConfidence=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", eyesOpenConfidence=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", uniformLightingConfidence=");
        sb.append(this.getOutputStallDuration);
        sb.append(", faceFrontalConfidence=");
        sb.append(this.getHighSpeedVideoSizesFor);
        sb.append(", eyeDistance=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", poseAngle=");
        sb.append(this.getInputFormats);
        sb.append(", sharpness=");
        sb.append(this.getOutputMinFrameDurationlomOqCM);
        sb.append(", exposure=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", grayscaleDensity=");
        sb.append(this.getOutputMinFrameDuration);
        sb.append(", globalScore=");
        sb.append(this.getOutputFormats);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.getInputSizeshNQ4ISI);
        parcel.writeFloat(this.Camera2StreamConfigurationMap);
        parcel.writeFloat(this.getHighSpeedVideoFpsRanges);
        parcel.writeFloat(this.getHighResolutionOutputSizeshNQ4ISI);
        parcel.writeFloat(this.getOutputStallDuration);
        parcel.writeFloat(this.getHighSpeedVideoSizesFor);
        parcel.writeInt(this.getHighSpeedVideoFpsRangesFor);
        parcel.writeInt(this.getInputFormats);
        parcel.writeInt(this.getOutputMinFrameDurationlomOqCM);
        parcel.writeInt(this.getHighSpeedVideoSizes);
        parcel.writeInt(this.getOutputMinFrameDuration);
        parcel.writeFloat(this.getOutputFormats);
    }

    private DMDSFaceResultQuality(com.daon.dmds.models.DMDSFaceResultQuality.Builder builder) {
        this.getInputSizeshNQ4ISI = builder.getOutputFormats;
        this.Camera2StreamConfigurationMap = builder.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRanges = builder.getHighSpeedVideoFpsRanges;
        this.getHighResolutionOutputSizeshNQ4ISI = builder.getHighSpeedVideoFpsRangesFor;
        this.getOutputStallDuration = builder.getOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizesFor = builder.getOutputMinFrameDuration;
        this.getHighSpeedVideoFpsRangesFor = builder.getHighSpeedVideoSizes;
        this.getInputFormats = builder.getInputFormats;
        this.getOutputMinFrameDurationlomOqCM = builder.getOutputStallDurationlomOqCM;
        this.getHighSpeedVideoSizes = builder.Camera2StreamConfigurationMap;
        this.getOutputMinFrameDuration = builder.getInputSizeshNQ4ISI;
        this.getOutputFormats = builder.getHighSpeedVideoSizesFor;
    }

    protected DMDSFaceResultQuality(android.os.Parcel parcel) {
        this.getInputSizeshNQ4ISI = parcel.readInt();
        this.Camera2StreamConfigurationMap = parcel.readFloat();
        this.getHighSpeedVideoFpsRanges = parcel.readFloat();
        this.getHighResolutionOutputSizeshNQ4ISI = parcel.readFloat();
        this.getOutputStallDuration = parcel.readFloat();
        this.getHighSpeedVideoSizesFor = parcel.readFloat();
        this.getHighSpeedVideoFpsRangesFor = parcel.readInt();
        this.getInputFormats = parcel.readInt();
        this.getOutputMinFrameDurationlomOqCM = parcel.readInt();
        this.getHighSpeedVideoSizes = parcel.readInt();
        this.getOutputMinFrameDuration = parcel.readInt();
        this.getOutputFormats = parcel.readFloat();
    }
}
