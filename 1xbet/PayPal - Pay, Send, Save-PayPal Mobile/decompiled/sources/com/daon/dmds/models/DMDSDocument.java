package com.daon.dmds.models;

/* loaded from: classes7.dex */
public class DMDSDocument implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.daon.dmds.models.DMDSDocument> CREATOR = new android.os.Parcelable.Creator<com.daon.dmds.models.DMDSDocument>() { // from class: com.daon.dmds.models.DMDSDocument.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.daon.dmds.models.DMDSDocument createFromParcel(android.os.Parcel parcel) {
            return new com.daon.dmds.models.DMDSDocument(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.daon.dmds.models.DMDSDocument[] newArray(int i) {
            return new com.daon.dmds.models.DMDSDocument[i];
        }
    };
    private android.graphics.Bitmap Camera2StreamConfigurationMap;
    private java.util.Map<java.lang.String, java.lang.String> coroutineBoundary;
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges;
    private java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRangesFor;
    private com.daon.dmds.models.DMDSDocumentCaptureType getHighSpeedVideoSizes;
    private android.graphics.Bitmap getHighSpeedVideoSizesFor;
    private android.graphics.Bitmap getInputFormats;
    private com.daon.dmds.models.DMDSQuadrangle getInputSizeshNQ4ISI;
    private java.util.Map<java.lang.String, java.lang.String> getOutputFormats;
    private java.util.Map<java.lang.String, java.lang.String> getOutputMinFrameDuration;
    private com.daon.dmds.models.DMDSQuadrangle getOutputMinFrameDurationlomOqCM;
    private android.graphics.Bitmap getOutputSizes;
    private com.daon.dmds.models.DMDSRecognitionMode getOutputSizeshNQ4ISI;
    private com.daon.dmds.models.DMDSDocumentResultQuality getOutputStallDuration;
    private com.daon.dmds.models.DMDSDocumentResultQuality getOutputStallDurationlomOqCM;
    private android.graphics.Bitmap getValidOutputFormatsForInputhNQ4ISI;
    private android.graphics.Bitmap isOutputSupportedFor;
    private android.graphics.Bitmap isOutputSupportedForhNQ4ISI;
    private android.graphics.Bitmap toString;
    private java.util.Map<java.lang.String, java.lang.String> unwrapAs;

    public DMDSDocument() {
        this.coroutineBoundary = new java.util.HashMap();
        this.getOutputFormats = new java.util.HashMap();
        this.getHighSpeedVideoFpsRangesFor = new java.util.HashMap();
        this.getOutputMinFrameDuration = new java.util.HashMap();
        this.getHighSpeedVideoFpsRanges = new java.util.HashMap();
        this.unwrapAs = new java.util.HashMap();
    }

    public void clearAllData() {
        android.graphics.Bitmap bitmap = this.getOutputSizes;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.getOutputSizes.recycle();
        }
        android.graphics.Bitmap bitmap2 = this.getInputFormats;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            this.getInputFormats.recycle();
        }
        android.graphics.Bitmap bitmap3 = this.getValidOutputFormatsForInputhNQ4ISI;
        if (bitmap3 != null && !bitmap3.isRecycled()) {
            this.getValidOutputFormatsForInputhNQ4ISI.recycle();
        }
        android.graphics.Bitmap bitmap4 = this.isOutputSupportedForhNQ4ISI;
        if (bitmap4 != null && !bitmap4.isRecycled()) {
            this.isOutputSupportedForhNQ4ISI.recycle();
        }
        android.graphics.Bitmap bitmap5 = this.isOutputSupportedFor;
        if (bitmap5 != null && !bitmap5.isRecycled()) {
            this.isOutputSupportedFor.recycle();
        }
        java.util.Map<java.lang.String, java.lang.String> map = this.coroutineBoundary;
        if (map != null && !map.isEmpty()) {
            this.coroutineBoundary.clear();
        }
        java.util.Map<java.lang.String, java.lang.String> map2 = this.getOutputFormats;
        if (map2 != null && !map2.isEmpty()) {
            this.getOutputFormats.clear();
        }
        java.util.Map<java.lang.String, java.lang.String> map3 = this.getHighSpeedVideoFpsRangesFor;
        if (map3 != null && !map3.isEmpty()) {
            this.getHighSpeedVideoFpsRangesFor.clear();
        }
        java.util.Map<java.lang.String, java.lang.String> map4 = this.getOutputMinFrameDuration;
        if (map4 != null && !map4.isEmpty()) {
            this.getOutputMinFrameDuration.clear();
        }
        java.util.Map<java.lang.String, java.lang.String> map5 = this.unwrapAs;
        if (map5 != null && !map5.isEmpty()) {
            this.unwrapAs.clear();
        }
        java.util.Map<java.lang.String, java.lang.String> map6 = this.getHighSpeedVideoFpsRanges;
        if (map6 != null && !map6.isEmpty()) {
            this.getHighSpeedVideoFpsRanges.clear();
        }
        if (this.getOutputStallDuration != null) {
            this.getOutputStallDuration = null;
        }
        if (this.getOutputStallDurationlomOqCM != null) {
            this.getOutputStallDurationlomOqCM = null;
        }
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
        com.daon.dmds.models.DMDSDocument dMDSDocument = (com.daon.dmds.models.DMDSDocument) obj;
        return java.util.Objects.equals(dMDSDocument.getOutputStallDuration, this.getOutputStallDuration) && java.util.Objects.equals(dMDSDocument.getOutputStallDurationlomOqCM, this.getOutputStallDurationlomOqCM) && java.util.Objects.equals(this.unwrapAs, dMDSDocument.unwrapAs) && java.util.Objects.equals(this.coroutineBoundary, dMDSDocument.coroutineBoundary) && java.util.Objects.equals(this.getOutputFormats, dMDSDocument.getOutputFormats) && java.util.Objects.equals(this.getHighSpeedVideoFpsRangesFor, dMDSDocument.getHighSpeedVideoFpsRangesFor) && java.util.Objects.equals(this.getOutputMinFrameDuration, dMDSDocument.getOutputMinFrameDuration) && java.util.Objects.equals(this.getHighSpeedVideoFpsRanges, dMDSDocument.getHighSpeedVideoFpsRanges) && java.util.Objects.equals(this.getHighResolutionOutputSizeshNQ4ISI, dMDSDocument.getHighResolutionOutputSizeshNQ4ISI) && java.util.Objects.equals(this.getOutputMinFrameDurationlomOqCM, dMDSDocument.getOutputMinFrameDurationlomOqCM) && java.util.Objects.equals(this.getInputSizeshNQ4ISI, dMDSDocument.getInputSizeshNQ4ISI) && java.util.Objects.equals(this.getHighSpeedVideoSizes, dMDSDocument.getHighSpeedVideoSizes);
    }

    public android.graphics.Bitmap getBackQualityImage() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.util.Map<java.lang.String, java.lang.String> getBackVisualResult() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.util.Map<java.lang.String, java.lang.String> getBarcodeResult() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public com.daon.dmds.models.DMDSDocumentCaptureType getDocumentCaptureType() {
        return this.getHighSpeedVideoSizes;
    }

    public java.lang.String getDocumentType() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public android.graphics.Bitmap getFrontQualityImage() {
        return this.getHighSpeedVideoSizesFor;
    }

    public java.util.Map<java.lang.String, java.lang.String> getFrontVisualResult() {
        return this.getOutputFormats;
    }

    public java.util.Map<java.lang.String, java.lang.String> getMrzResult() {
        return this.getOutputMinFrameDuration;
    }

    public com.daon.dmds.models.DMDSQuadrangle getProcessedBackDocumentCoordinates() {
        return this.getInputSizeshNQ4ISI;
    }

    public android.graphics.Bitmap getProcessedBackImage() {
        return this.getInputFormats;
    }

    public com.daon.dmds.models.DMDSQuadrangle getProcessedDocumentCoordinates() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public android.graphics.Bitmap getProcessedImage() {
        return this.getOutputSizes;
    }

    public com.daon.dmds.models.DMDSDocumentResultQuality getQualityData() {
        return this.getOutputStallDuration;
    }

    public com.daon.dmds.models.DMDSDocumentResultQuality getQualityDataBack() {
        return this.getOutputStallDurationlomOqCM;
    }

    public com.daon.dmds.models.DMDSRecognitionMode getRecognitionMode() {
        return this.getOutputSizeshNQ4ISI;
    }

    public android.graphics.Bitmap getSignatureImage() {
        return this.toString;
    }

    public java.util.Map<java.lang.String, java.lang.String> getTextExtracted() {
        return this.unwrapAs;
    }

    public android.graphics.Bitmap getUnprocessedBackImage() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    public android.graphics.Bitmap getUnprocessedBarcodeImage() {
        return this.isOutputSupportedFor;
    }

    public android.graphics.Bitmap getUnprocessedImage() {
        return this.getValidOutputFormatsForInputhNQ4ISI;
    }

    public java.util.Map<java.lang.String, java.lang.String> getVisualResult() {
        return this.coroutineBoundary;
    }

    public boolean hasOcrData() {
        java.util.Map<java.lang.String, java.lang.String> map = this.unwrapAs;
        if (map != null && !map.isEmpty()) {
            return true;
        }
        java.util.Map<java.lang.String, java.lang.String> map2 = this.coroutineBoundary;
        if (map2 != null && !map2.isEmpty()) {
            return true;
        }
        java.util.Map<java.lang.String, java.lang.String> map3 = this.getOutputFormats;
        if (map3 != null && !map3.isEmpty()) {
            return true;
        }
        java.util.Map<java.lang.String, java.lang.String> map4 = this.getHighSpeedVideoFpsRangesFor;
        if (map4 != null && !map4.isEmpty()) {
            return true;
        }
        java.util.Map<java.lang.String, java.lang.String> map5 = this.getOutputMinFrameDuration;
        if (map5 != null && !map5.isEmpty()) {
            return true;
        }
        java.util.Map<java.lang.String, java.lang.String> map6 = this.getHighSpeedVideoFpsRanges;
        return (map6 == null || map6.isEmpty()) ? false : true;
    }

    public void setBackQualityImage(android.graphics.Bitmap bitmap) {
        this.Camera2StreamConfigurationMap = bitmap;
    }

    public void setBackVisualResult(java.util.Map<java.lang.String, java.lang.String> map) {
        this.getHighSpeedVideoFpsRangesFor = map;
    }

    public void setBarcodeResult(java.util.Map<java.lang.String, java.lang.String> map) {
        this.getHighSpeedVideoFpsRanges = map;
    }

    public void setDocumentCaptureType(com.daon.dmds.models.DMDSDocumentCaptureType dMDSDocumentCaptureType) {
        this.getHighSpeedVideoSizes = dMDSDocumentCaptureType;
    }

    public void setDocumentType(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    public void setFrontQualityImage(android.graphics.Bitmap bitmap) {
        this.getHighSpeedVideoSizesFor = bitmap;
    }

    public void setFrontVisualResult(java.util.Map<java.lang.String, java.lang.String> map) {
        this.getOutputFormats = map;
    }

    public void setMrzResult(java.util.Map<java.lang.String, java.lang.String> map) {
        this.getOutputMinFrameDuration = map;
    }

    public void setProcessedBackDocumentCoordinates(com.daon.dmds.models.DMDSQuadrangle dMDSQuadrangle) {
        this.getInputSizeshNQ4ISI = dMDSQuadrangle;
    }

    public void setProcessedBackImage(android.graphics.Bitmap bitmap) {
        this.getInputFormats = bitmap;
    }

    public void setProcessedDocumentCoordinates(com.daon.dmds.models.DMDSQuadrangle dMDSQuadrangle) {
        this.getOutputMinFrameDurationlomOqCM = dMDSQuadrangle;
    }

    public void setProcessedImage(android.graphics.Bitmap bitmap) {
        this.getOutputSizes = bitmap;
    }

    public void setQualityData(com.daon.dmds.models.DMDSDocumentResultQuality dMDSDocumentResultQuality) {
        this.getOutputStallDuration = dMDSDocumentResultQuality;
    }

    public void setQualityDataBack(com.daon.dmds.models.DMDSDocumentResultQuality dMDSDocumentResultQuality) {
        this.getOutputStallDurationlomOqCM = dMDSDocumentResultQuality;
    }

    public void setRecognitionMode(com.daon.dmds.models.DMDSRecognitionMode dMDSRecognitionMode) {
        this.getOutputSizeshNQ4ISI = dMDSRecognitionMode;
    }

    public void setSignatureImage(android.graphics.Bitmap bitmap) {
        this.toString = bitmap;
    }

    public void setTextExtracted(java.util.Map<java.lang.String, java.lang.String> map) {
        this.unwrapAs = map;
    }

    public void setUnprocessedBackImage(android.graphics.Bitmap bitmap) {
        this.isOutputSupportedForhNQ4ISI = bitmap;
    }

    public void setUnprocessedBarcodeImage(android.graphics.Bitmap bitmap) {
        this.isOutputSupportedFor = bitmap;
    }

    public void setUnprocessedImage(android.graphics.Bitmap bitmap) {
        this.getValidOutputFormatsForInputhNQ4ISI = bitmap;
    }

    public void setVisualResult(java.util.Map<java.lang.String, java.lang.String> map) {
        this.coroutineBoundary = map;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DMDSDocument{visualResult=");
        sb.append(this.coroutineBoundary);
        sb.append(", frontVisualResult=");
        sb.append(this.getOutputFormats);
        sb.append(", backVisualResult=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", mrzResult=");
        sb.append(this.getOutputMinFrameDuration);
        sb.append(", barcodeResult=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", textExtracted=");
        sb.append(this.unwrapAs);
        sb.append(", qualityData=");
        sb.append(this.getOutputStallDuration);
        sb.append(", qualityDataBack=");
        sb.append(this.getOutputStallDurationlomOqCM);
        sb.append(", documentType='");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append("', processedDocumentCoordinates=");
        sb.append(this.getOutputMinFrameDurationlomOqCM);
        sb.append(", processedBackDocumentCoordinates=");
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append(", documentCaptureType=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", recognitionMode=");
        sb.append(this.getOutputSizeshNQ4ISI);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.unwrapAs.size());
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.unwrapAs.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeInt(this.coroutineBoundary.size());
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry2 : this.coroutineBoundary.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeString(entry2.getValue());
        }
        parcel.writeInt(this.getOutputFormats.size());
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry3 : this.getOutputFormats.entrySet()) {
            parcel.writeString(entry3.getKey());
            parcel.writeString(entry3.getValue());
        }
        parcel.writeInt(this.getHighSpeedVideoFpsRangesFor.size());
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry4 : this.getHighSpeedVideoFpsRangesFor.entrySet()) {
            parcel.writeString(entry4.getKey());
            parcel.writeString(entry4.getValue());
        }
        parcel.writeInt(this.getOutputMinFrameDuration.size());
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry5 : this.getOutputMinFrameDuration.entrySet()) {
            parcel.writeString(entry5.getKey());
            parcel.writeString(entry5.getValue());
        }
        parcel.writeInt(this.getHighSpeedVideoFpsRanges.size());
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry6 : this.getHighSpeedVideoFpsRanges.entrySet()) {
            parcel.writeString(entry6.getKey());
            parcel.writeString(entry6.getValue());
        }
        parcel.writeParcelable(this.getOutputStallDuration, i);
        parcel.writeParcelable(this.getOutputStallDurationlomOqCM, i);
        parcel.writeString(this.getHighResolutionOutputSizeshNQ4ISI);
        parcel.writeParcelable(this.getOutputMinFrameDurationlomOqCM, i);
        parcel.writeParcelable(this.getInputSizeshNQ4ISI, i);
        com.daon.dmds.models.DMDSDocumentCaptureType dMDSDocumentCaptureType = this.getHighSpeedVideoSizes;
        parcel.writeInt(dMDSDocumentCaptureType == null ? -1 : dMDSDocumentCaptureType.ordinal());
        com.daon.dmds.models.DMDSRecognitionMode dMDSRecognitionMode = this.getOutputSizeshNQ4ISI;
        parcel.writeInt(dMDSRecognitionMode != null ? dMDSRecognitionMode.ordinal() : -1);
        com.daon.dmds.utils.DataTransferHelper.getInstance().setImages(this);
    }

    public DMDSDocument(com.daon.dmds.models.DMDSDocument dMDSDocument) {
        this.coroutineBoundary = new java.util.HashMap();
        this.getOutputFormats = new java.util.HashMap();
        this.getHighSpeedVideoFpsRangesFor = new java.util.HashMap();
        this.getOutputMinFrameDuration = new java.util.HashMap();
        this.getHighSpeedVideoFpsRanges = new java.util.HashMap();
        this.unwrapAs = new java.util.HashMap();
        setBackVisualResult(dMDSDocument.getBackVisualResult());
        setBarcodeResult(dMDSDocument.getBarcodeResult());
        setDocumentCaptureType(dMDSDocument.getDocumentCaptureType());
        setDocumentType(dMDSDocument.getDocumentType());
        setFrontVisualResult(dMDSDocument.getFrontVisualResult());
        setMrzResult(dMDSDocument.getMrzResult());
        setProcessedBackDocumentCoordinates(dMDSDocument.getProcessedBackDocumentCoordinates());
        setProcessedBackImage(dMDSDocument.getProcessedBackImage());
        setProcessedDocumentCoordinates(dMDSDocument.getProcessedDocumentCoordinates());
        setProcessedImage(dMDSDocument.getProcessedImage());
        setRecognitionMode(dMDSDocument.getRecognitionMode());
        setSignatureImage(dMDSDocument.getSignatureImage());
        setTextExtracted(dMDSDocument.getTextExtracted());
        setUnprocessedBackImage(dMDSDocument.getUnprocessedBackImage());
        setUnprocessedImage(dMDSDocument.getUnprocessedImage());
        setUnprocessedBarcodeImage(dMDSDocument.getUnprocessedBarcodeImage());
        setVisualResult(dMDSDocument.getVisualResult());
        setFrontQualityImage(dMDSDocument.getFrontQualityImage());
        setBackQualityImage(dMDSDocument.getBackQualityImage());
        setQualityData(dMDSDocument.getQualityData());
        setQualityDataBack(dMDSDocument.getQualityDataBack());
    }

    protected DMDSDocument(android.os.Parcel parcel) {
        this.coroutineBoundary = new java.util.HashMap();
        this.getOutputFormats = new java.util.HashMap();
        this.getHighSpeedVideoFpsRangesFor = new java.util.HashMap();
        this.getOutputMinFrameDuration = new java.util.HashMap();
        this.getHighSpeedVideoFpsRanges = new java.util.HashMap();
        this.unwrapAs = new java.util.HashMap();
        int readInt = parcel.readInt();
        this.unwrapAs = new java.util.HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            this.unwrapAs.put(parcel.readString(), parcel.readString());
        }
        int readInt2 = parcel.readInt();
        this.coroutineBoundary = new java.util.HashMap(readInt2);
        for (int i2 = 0; i2 < readInt2; i2++) {
            this.coroutineBoundary.put(parcel.readString(), parcel.readString());
        }
        int readInt3 = parcel.readInt();
        this.getOutputFormats = new java.util.HashMap(readInt3);
        for (int i3 = 0; i3 < readInt3; i3++) {
            this.getOutputFormats.put(parcel.readString(), parcel.readString());
        }
        int readInt4 = parcel.readInt();
        this.getHighSpeedVideoFpsRangesFor = new java.util.HashMap(readInt4);
        for (int i4 = 0; i4 < readInt4; i4++) {
            this.getHighSpeedVideoFpsRangesFor.put(parcel.readString(), parcel.readString());
        }
        int readInt5 = parcel.readInt();
        this.getOutputMinFrameDuration = new java.util.HashMap(readInt5);
        for (int i5 = 0; i5 < readInt5; i5++) {
            this.getOutputMinFrameDuration.put(parcel.readString(), parcel.readString());
        }
        int readInt6 = parcel.readInt();
        this.getHighSpeedVideoFpsRanges = new java.util.HashMap(readInt6);
        for (int i6 = 0; i6 < readInt6; i6++) {
            this.getHighSpeedVideoFpsRanges.put(parcel.readString(), parcel.readString());
        }
        this.getOutputStallDuration = (com.daon.dmds.models.DMDSDocumentResultQuality) parcel.readParcelable(com.daon.dmds.models.DMDSDocumentResultQuality.class.getClassLoader());
        this.getOutputStallDurationlomOqCM = (com.daon.dmds.models.DMDSDocumentResultQuality) parcel.readParcelable(com.daon.dmds.models.DMDSDocumentResultQuality.class.getClassLoader());
        this.getHighResolutionOutputSizeshNQ4ISI = parcel.readString();
        this.getOutputMinFrameDurationlomOqCM = (com.daon.dmds.models.DMDSQuadrangle) parcel.readParcelable(com.daon.dmds.models.DMDSQuadrangle.class.getClassLoader());
        this.getInputSizeshNQ4ISI = (com.daon.dmds.models.DMDSQuadrangle) parcel.readParcelable(com.daon.dmds.models.DMDSQuadrangle.class.getClassLoader());
        int readInt7 = parcel.readInt();
        this.getHighSpeedVideoSizes = readInt7 == -1 ? null : com.daon.dmds.models.DMDSDocumentCaptureType.values()[readInt7];
        int readInt8 = parcel.readInt();
        this.getOutputSizeshNQ4ISI = readInt8 != -1 ? com.daon.dmds.models.DMDSRecognitionMode.values()[readInt8] : null;
        com.daon.dmds.utils.DataTransferHelper.getInstance().pickImages(this);
    }
}
