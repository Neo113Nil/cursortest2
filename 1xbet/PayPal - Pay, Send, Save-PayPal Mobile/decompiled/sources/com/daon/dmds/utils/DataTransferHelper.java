package com.daon.dmds.utils;

/* loaded from: classes7.dex */
public class DataTransferHelper {
    private static com.daon.dmds.utils.DataTransferHelper getHighResolutionOutputSizeshNQ4ISI;
    private android.graphics.Bitmap Camera2StreamConfigurationMap;
    private android.graphics.Bitmap getHighSpeedVideoFpsRanges;
    private android.graphics.Bitmap getHighSpeedVideoFpsRangesFor;
    private android.graphics.Bitmap getHighSpeedVideoSizes;
    private android.graphics.Bitmap getHighSpeedVideoSizesFor;
    private android.graphics.Bitmap getInputFormats;
    private android.graphics.Bitmap getInputSizeshNQ4ISI;
    private android.graphics.Bitmap getOutputFormats;
    private android.graphics.Bitmap getOutputMinFrameDuration;

    public static com.daon.dmds.utils.DataTransferHelper getInstance() {
        if (getHighResolutionOutputSizeshNQ4ISI == null) {
            getHighResolutionOutputSizeshNQ4ISI = new com.daon.dmds.utils.DataTransferHelper();
        }
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public void pickFaceImage(com.daon.dmds.models.DMDSFace dMDSFace) {
        dMDSFace.setFaceImage(this.getHighSpeedVideoFpsRanges);
    }

    public void pickImages(com.daon.dmds.models.DMDSDocument dMDSDocument) {
        dMDSDocument.setProcessedImage(this.getInputSizeshNQ4ISI);
        dMDSDocument.setProcessedBackImage(this.getHighSpeedVideoFpsRangesFor);
        dMDSDocument.setUnprocessedImage(this.getOutputMinFrameDuration);
        dMDSDocument.setUnprocessedBackImage(this.getOutputFormats);
        dMDSDocument.setSignatureImage(this.getInputFormats);
        dMDSDocument.setUnprocessedBarcodeImage(this.getHighSpeedVideoSizesFor);
        dMDSDocument.setFrontQualityImage(this.Camera2StreamConfigurationMap);
        dMDSDocument.setBackQualityImage(this.getHighSpeedVideoSizes);
    }

    public void setFaceImage(com.daon.dmds.models.DMDSFace dMDSFace) {
        this.getHighSpeedVideoFpsRanges = dMDSFace.getFaceImage();
    }

    public void setImages(com.daon.dmds.models.DMDSDocument dMDSDocument) {
        this.getInputSizeshNQ4ISI = dMDSDocument.getProcessedImage();
        this.getHighSpeedVideoFpsRangesFor = dMDSDocument.getProcessedBackImage();
        this.getOutputMinFrameDuration = dMDSDocument.getUnprocessedImage();
        this.getOutputFormats = dMDSDocument.getUnprocessedBackImage();
        this.getInputFormats = dMDSDocument.getSignatureImage();
        this.getHighSpeedVideoSizesFor = dMDSDocument.getUnprocessedBarcodeImage();
        this.Camera2StreamConfigurationMap = dMDSDocument.getFrontQualityImage();
        this.getHighSpeedVideoSizes = dMDSDocument.getBackQualityImage();
    }
}
