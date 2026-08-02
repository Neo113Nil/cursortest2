package com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis;

/* loaded from: classes10.dex */
public final class ImageAnalysisResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisResult> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisResult>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisResult.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisResult createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisResult[] newArray(int i) {
            return new com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisResult[i];
        }
    };
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisDetectionStatus Camera2StreamConfigurationMap;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisDetectionStatus getHighSpeedVideoFpsRanges;
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.DocumentImageColorStatus getHighSpeedVideoFpsRangesFor;
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardOrientation getHighSpeedVideoSizes;
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation getHighSpeedVideoSizesFor;
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisDetectionStatus getInputFormats;
    private final boolean getInputSizeshNQ4ISI;
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisDetectionStatus getOutputFormats;
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisDetectionStatus getOutputMinFrameDuration;

    private ImageAnalysisResult(boolean z, boolean z2, com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.DocumentImageColorStatus documentImageColorStatus, com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisDetectionStatus imageAnalysisDetectionStatus, com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisDetectionStatus imageAnalysisDetectionStatus2, com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisDetectionStatus imageAnalysisDetectionStatus3, com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisDetectionStatus imageAnalysisDetectionStatus4, com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisDetectionStatus imageAnalysisDetectionStatus5, com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardOrientation cardOrientation, com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation cardRotation) {
        this.getInputSizeshNQ4ISI = z;
        this.getHighResolutionOutputSizeshNQ4ISI = z2;
        this.getHighSpeedVideoFpsRangesFor = documentImageColorStatus;
        this.getOutputMinFrameDuration = imageAnalysisDetectionStatus;
        this.getHighSpeedVideoFpsRanges = imageAnalysisDetectionStatus2;
        this.getInputFormats = imageAnalysisDetectionStatus3;
        this.getOutputFormats = imageAnalysisDetectionStatus4;
        this.Camera2StreamConfigurationMap = imageAnalysisDetectionStatus5;
        this.getHighSpeedVideoSizes = cardOrientation;
        this.getHighSpeedVideoSizesFor = cardRotation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisDetectionStatus getBarcodeDetectionStatus() {
        return this.getOutputFormats;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardOrientation getCardOrientation() {
        return this.getHighSpeedVideoSizes;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation getCardRotation() {
        return this.getHighSpeedVideoSizesFor;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.DocumentImageColorStatus getDocumentImageColorStatus() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisDetectionStatus getDocumentImageMoireStatus() {
        return this.getOutputMinFrameDuration;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisDetectionStatus getFaceDetectionStatus() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisDetectionStatus getMrzDetectionStatus() {
        return this.getInputFormats;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisDetectionStatus getRealIdDetectionStatus() {
        return this.Camera2StreamConfigurationMap;
    }

    public final boolean isBlurDetected() {
        return this.getInputSizeshNQ4ISI;
    }

    public final boolean isGlareDetected() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeByte(this.getInputSizeshNQ4ISI ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.getHighResolutionOutputSizeshNQ4ISI ? (byte) 1 : (byte) 0);
        parcel.writeSerializable(this.getHighSpeedVideoFpsRangesFor);
        parcel.writeSerializable(this.getOutputMinFrameDuration);
        parcel.writeSerializable(this.getHighSpeedVideoFpsRanges);
        parcel.writeSerializable(this.getInputFormats);
        parcel.writeSerializable(this.getOutputFormats);
        parcel.writeSerializable(this.Camera2StreamConfigurationMap);
        parcel.writeSerializable(this.getHighSpeedVideoSizes);
        parcel.writeSerializable(this.getHighSpeedVideoSizesFor);
    }

    public static com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisResult createFromNative(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return new com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisResult(z, z2, com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.DocumentImageColorStatus.values()[i], com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisDetectionStatus.values()[i2], com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisDetectionStatus.values()[i3], com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisDetectionStatus.values()[i4], com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisDetectionStatus.values()[i5], com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisDetectionStatus.values()[i6], com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardOrientation.values()[i7], i8 == -1 ? null : com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.values()[i8]);
    }

    ImageAnalysisResult(android.os.Parcel parcel) {
        this.getInputSizeshNQ4ISI = parcel.readByte() == 1;
        this.getHighResolutionOutputSizeshNQ4ISI = parcel.readByte() == 1;
        this.getHighSpeedVideoFpsRangesFor = (com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.DocumentImageColorStatus) parcel.readSerializable();
        this.getOutputMinFrameDuration = (com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisDetectionStatus) parcel.readSerializable();
        this.getHighSpeedVideoFpsRanges = (com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisDetectionStatus) parcel.readSerializable();
        this.getInputFormats = (com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisDetectionStatus) parcel.readSerializable();
        this.getOutputFormats = (com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisDetectionStatus) parcel.readSerializable();
        this.Camera2StreamConfigurationMap = (com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisDetectionStatus) parcel.readSerializable();
        this.getHighSpeedVideoSizes = (com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardOrientation) parcel.readSerializable();
        this.getHighSpeedVideoSizesFor = (com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation) parcel.readSerializable();
    }
}
