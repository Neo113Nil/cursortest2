package com.daon.dmds.models;

/* loaded from: classes7.dex */
public class DMDSDefaultUiOptions implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.daon.dmds.models.DMDSDefaultUiOptions> CREATOR = new android.os.Parcelable.Creator<com.daon.dmds.models.DMDSDefaultUiOptions>() { // from class: com.daon.dmds.models.DMDSDefaultUiOptions.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.daon.dmds.models.DMDSDefaultUiOptions createFromParcel(android.os.Parcel parcel) {
            return new com.daon.dmds.models.DMDSDefaultUiOptions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.daon.dmds.models.DMDSDefaultUiOptions[] newArray(int i) {
            return new com.daon.dmds.models.DMDSDefaultUiOptions[i];
        }
    };
    private int Camera2StreamConfigurationMap;
    private boolean accessartificialFrame;
    private boolean coroutineBoundary;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private java.lang.String getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private int getInputSizeshNQ4ISI;
    private java.lang.String getOutputFormats;
    private com.daon.dmds.models.DMDSRect getOutputMinFrameDuration;
    private int getOutputMinFrameDurationlomOqCM;
    private int getOutputSizes;
    private com.daon.dmds.models.DMDSRect getOutputSizeshNQ4ISI;
    private int getOutputStallDuration;
    private boolean getOutputStallDurationlomOqCM;
    private int getValidOutputFormatsForInputhNQ4ISI;
    private boolean isOutputSupportedFor;
    private boolean isOutputSupportedForhNQ4ISI;
    private boolean toString;
    private int unwrapAs;

    public DMDSDefaultUiOptions() {
        this.toString = true;
        this.getHighSpeedVideoFpsRangesFor = false;
        this.getHighSpeedVideoFpsRanges = false;
        this.getOutputStallDurationlomOqCM = true;
        this.getOutputSizeshNQ4ISI = new com.daon.dmds.models.DMDSRect(0.05f, 0.22f, 0.9f, 0.36f);
        this.getOutputMinFrameDuration = new com.daon.dmds.models.DMDSRect(0.15f, 0.05f, 0.65f, 0.77f);
        this.isOutputSupportedFor = true;
        this.accessartificialFrame = true;
        this.isOutputSupportedForhNQ4ISI = true;
        this.coroutineBoundary = true;
        this.getOutputSizes = -14513374;
        this.getOutputStallDuration = -1;
        this.getValidOutputFormatsForInputhNQ4ISI = 3;
        this.getOutputMinFrameDurationlomOqCM = 16;
        this.getInputFormats = 14;
        this.getHighSpeedVideoSizesFor = "";
        this.getOutputFormats = "";
        this.getInputSizeshNQ4ISI = -1;
        this.getHighResolutionOutputSizeshNQ4ISI = 14;
        this.getHighSpeedVideoSizes = -1;
        this.Camera2StreamConfigurationMap = -16777216;
        this.unwrapAs = -1308622848;
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
        com.daon.dmds.models.DMDSDefaultUiOptions dMDSDefaultUiOptions = (com.daon.dmds.models.DMDSDefaultUiOptions) obj;
        if (isShowScanCompleteVisualFeedback() == dMDSDefaultUiOptions.isShowScanCompleteVisualFeedback() && isAllowManualCroppingDocumentRecognition() == dMDSDefaultUiOptions.isAllowManualCroppingDocumentRecognition() && isAllowManualCroppingEdgeDetection() == dMDSDefaultUiOptions.isAllowManualCroppingEdgeDetection() && isPlayScanCompleteVisualAudioFeedback() == dMDSDefaultUiOptions.isPlayScanCompleteVisualAudioFeedback() && isShowBoundary() == dMDSDefaultUiOptions.isShowBoundary() && isShowScanningFeedback() == dMDSDefaultUiOptions.isShowScanningFeedback() && isShowCancelButton() == dMDSDefaultUiOptions.isShowCancelButton() && isShowTorchButton() == dMDSDefaultUiOptions.isShowTorchButton() && getOverlayColor() == dMDSDefaultUiOptions.getOverlayColor() && getRectangleColor() == dMDSDefaultUiOptions.getRectangleColor() && getRectangleCornerThickness() == dMDSDefaultUiOptions.getRectangleCornerThickness() && getRectangleCornerLength() == dMDSDefaultUiOptions.getRectangleCornerLength() && getMessageTextFontSize() == dMDSDefaultUiOptions.getMessageTextFontSize() && getMessageTextColor() == dMDSDefaultUiOptions.getMessageTextColor() && getCancelButtonTextFontSize() == dMDSDefaultUiOptions.getCancelButtonTextFontSize() && getCancelButtonTextColor() == dMDSDefaultUiOptions.getCancelButtonTextColor() && getBottomBarColor() == dMDSDefaultUiOptions.getBottomBarColor() && getScanningBorderColor() == dMDSDefaultUiOptions.getScanningBorderColor() && getPortraitScanningRegion().equals(dMDSDefaultUiOptions.getPortraitScanningRegion()) && getLandscapeScanningRegion().equals(dMDSDefaultUiOptions.getLandscapeScanningRegion()) && getInstructionMessage().equals(dMDSDefaultUiOptions.getInstructionMessage())) {
            return getCaptureMessage().equals(dMDSDefaultUiOptions.getCaptureMessage());
        }
        return false;
    }

    public int getBottomBarColor() {
        return this.Camera2StreamConfigurationMap;
    }

    public int getCancelButtonTextColor() {
        return this.getHighSpeedVideoSizes;
    }

    public int getCancelButtonTextFontSize() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.lang.String getCaptureMessage() {
        return this.getOutputFormats;
    }

    public java.lang.String getInstructionMessage() {
        return this.getHighSpeedVideoSizesFor;
    }

    public com.daon.dmds.models.DMDSRect getLandscapeScanningRegion() {
        return this.getOutputMinFrameDuration;
    }

    public int getMessageTextColor() {
        return this.getInputSizeshNQ4ISI;
    }

    public int getMessageTextFontSize() {
        return this.getInputFormats;
    }

    public int getOverlayColor() {
        return this.getOutputSizes;
    }

    public com.daon.dmds.models.DMDSRect getPortraitScanningRegion() {
        return this.getOutputSizeshNQ4ISI;
    }

    public int getRectangleColor() {
        return this.getOutputStallDuration;
    }

    public int getRectangleCornerLength() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public int getRectangleCornerThickness() {
        return this.getValidOutputFormatsForInputhNQ4ISI;
    }

    public int getScanningBorderColor() {
        return this.unwrapAs;
    }

    public boolean isAllowManualCroppingDocumentRecognition() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean isAllowManualCroppingEdgeDetection() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public boolean isPlayScanCompleteVisualAudioFeedback() {
        return this.getOutputStallDurationlomOqCM;
    }

    public boolean isShowBoundary() {
        return this.isOutputSupportedFor;
    }

    public boolean isShowCancelButton() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    public boolean isShowScanCompleteVisualFeedback() {
        return this.toString;
    }

    public boolean isShowScanningFeedback() {
        return this.accessartificialFrame;
    }

    public boolean isShowTorchButton() {
        return this.coroutineBoundary;
    }

    public void setAllowManualCroppingDocumentRecognition(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    public void setAllowManualCroppingEdgeDetection(boolean z) {
        this.getHighSpeedVideoFpsRanges = z;
    }

    public void setBottomBarColor(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    public void setCancelButtonTextColor(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    public void setCancelButtonTextFontSize(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public void setCaptureMessage(java.lang.String str) {
        this.getOutputFormats = str;
    }

    public void setInstructionMessage(java.lang.String str) {
        this.getHighSpeedVideoSizesFor = str;
    }

    public void setLandscapeScanningRegion(com.daon.dmds.models.DMDSRect dMDSRect) {
        this.getOutputMinFrameDuration = dMDSRect;
    }

    public void setMessageTextColor(int i) {
        this.getInputSizeshNQ4ISI = i;
    }

    public void setMessageTextFontSize(int i) {
        this.getInputFormats = i;
    }

    public void setOverlayColor(int i) {
        this.getOutputSizes = i;
    }

    public void setPlayScanCompleteVisualAudioFeedback(boolean z) {
        this.getOutputStallDurationlomOqCM = z;
    }

    public void setPortraitScanningRegion(com.daon.dmds.models.DMDSRect dMDSRect) {
        this.getOutputSizeshNQ4ISI = dMDSRect;
    }

    public void setRectangleColor(int i) {
        this.getOutputStallDuration = i;
    }

    public void setRectangleCornerLength(int i) {
        this.getOutputMinFrameDurationlomOqCM = i;
    }

    public void setRectangleCornerThickness(int i) {
        this.getValidOutputFormatsForInputhNQ4ISI = i;
    }

    public void setScanningBorderColor(int i) {
        this.unwrapAs = i;
    }

    public void setShowBoundary(boolean z) {
        this.isOutputSupportedFor = z;
    }

    public void setShowCancelButton(boolean z) {
        this.isOutputSupportedForhNQ4ISI = z;
    }

    public void setShowScanCompleteVisualFeedback(boolean z) {
        this.toString = z;
    }

    public void setShowScanningFeedback(boolean z) {
        this.accessartificialFrame = z;
    }

    public void setShowTorchButton(boolean z) {
        this.coroutineBoundary = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeByte(this.toString ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.getHighSpeedVideoFpsRangesFor ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.getHighSpeedVideoFpsRanges ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.getOutputStallDurationlomOqCM ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.getOutputSizeshNQ4ISI, i);
        parcel.writeParcelable(this.getOutputMinFrameDuration, i);
        parcel.writeByte(this.isOutputSupportedFor ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.accessartificialFrame ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isOutputSupportedForhNQ4ISI ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.coroutineBoundary ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.getOutputSizes);
        parcel.writeInt(this.getOutputStallDuration);
        parcel.writeInt(this.getValidOutputFormatsForInputhNQ4ISI);
        parcel.writeInt(this.getOutputMinFrameDurationlomOqCM);
        parcel.writeInt(this.getInputFormats);
        parcel.writeString(this.getHighSpeedVideoSizesFor);
        parcel.writeString(this.getOutputFormats);
        parcel.writeInt(this.getInputSizeshNQ4ISI);
        parcel.writeInt(this.getHighResolutionOutputSizeshNQ4ISI);
        parcel.writeInt(this.getHighSpeedVideoSizes);
        parcel.writeInt(this.Camera2StreamConfigurationMap);
        parcel.writeInt(this.unwrapAs);
    }

    protected DMDSDefaultUiOptions(android.os.Parcel parcel) {
        this.toString = true;
        this.getHighSpeedVideoFpsRangesFor = false;
        this.getHighSpeedVideoFpsRanges = false;
        this.getOutputStallDurationlomOqCM = true;
        this.getOutputSizeshNQ4ISI = new com.daon.dmds.models.DMDSRect(0.05f, 0.22f, 0.9f, 0.36f);
        this.getOutputMinFrameDuration = new com.daon.dmds.models.DMDSRect(0.15f, 0.05f, 0.65f, 0.77f);
        this.isOutputSupportedFor = true;
        this.accessartificialFrame = true;
        this.isOutputSupportedForhNQ4ISI = true;
        this.coroutineBoundary = true;
        this.getOutputSizes = -14513374;
        this.getOutputStallDuration = -1;
        this.getValidOutputFormatsForInputhNQ4ISI = 3;
        this.getOutputMinFrameDurationlomOqCM = 16;
        this.getInputFormats = 14;
        this.getHighSpeedVideoSizesFor = "";
        this.getOutputFormats = "";
        this.getInputSizeshNQ4ISI = -1;
        this.getHighResolutionOutputSizeshNQ4ISI = 14;
        this.getHighSpeedVideoSizes = -1;
        this.Camera2StreamConfigurationMap = -16777216;
        this.unwrapAs = -1308622848;
        this.toString = parcel.readByte() != 0;
        this.getHighSpeedVideoFpsRangesFor = parcel.readByte() != 0;
        this.getHighSpeedVideoFpsRanges = parcel.readByte() != 0;
        this.getOutputStallDurationlomOqCM = parcel.readByte() != 0;
        this.getOutputSizeshNQ4ISI = (com.daon.dmds.models.DMDSRect) parcel.readParcelable(com.daon.dmds.models.DMDSRect.class.getClassLoader());
        this.getOutputMinFrameDuration = (com.daon.dmds.models.DMDSRect) parcel.readParcelable(com.daon.dmds.models.DMDSRect.class.getClassLoader());
        this.isOutputSupportedFor = parcel.readByte() != 0;
        this.accessartificialFrame = parcel.readByte() != 0;
        this.isOutputSupportedForhNQ4ISI = parcel.readByte() != 0;
        this.coroutineBoundary = parcel.readByte() != 0;
        this.getOutputSizes = parcel.readInt();
        this.getOutputStallDuration = parcel.readInt();
        this.getValidOutputFormatsForInputhNQ4ISI = parcel.readInt();
        this.getOutputMinFrameDurationlomOqCM = parcel.readInt();
        this.getInputFormats = parcel.readInt();
        this.getHighSpeedVideoSizesFor = parcel.readString();
        this.getOutputFormats = parcel.readString();
        this.getInputSizeshNQ4ISI = parcel.readInt();
        this.getHighResolutionOutputSizeshNQ4ISI = parcel.readInt();
        this.getHighSpeedVideoSizes = parcel.readInt();
        this.Camera2StreamConfigurationMap = parcel.readInt();
        this.unwrapAs = parcel.readInt();
    }
}
