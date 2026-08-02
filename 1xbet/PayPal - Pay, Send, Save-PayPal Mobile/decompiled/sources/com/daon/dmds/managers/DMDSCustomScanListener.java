package com.daon.dmds.managers;

/* loaded from: classes7.dex */
public interface DMDSCustomScanListener {
    void barcodeScanningStarted();

    void detectionTimeOut(com.daon.dmds.models.DMDSError dMDSError);

    void documentDetected(com.daon.dmds.models.DMDSDocumentDetectionMetadata dMDSDocumentDetectionMetadata);

    void documentDetectionStatus(com.daon.dmds.models.DMDSDocumentDetectionStatus dMDSDocumentDetectionStatus);

    @java.lang.Deprecated
    void documentScanFailed(com.daon.dmds.models.DMDSError dMDSError);

    void documentScanned(com.daon.dmds.models.DMDSResult dMDSResult);

    void documentScannedFailed(com.daon.dmds.models.DMDSError dMDSError, com.daon.dmds.models.DMDSResult dMDSResult);

    void fallingBackToEdgeDetection();

    void firstSideRecognitionFinished(com.daon.dmds.models.DMDSRecognitionMode dMDSRecognitionMode);

    @java.lang.Deprecated
    void mrzDetected(com.daon.dmds.models.DMDSMrzDetectionMetadata dMDSMrzDetectionMetadata);

    @java.lang.Deprecated
    void notificationMessage(java.lang.String str);

    @java.lang.Deprecated
    void orientationAboutToChange(com.daon.dmds.models.DMDSOrientation dMDSOrientation, com.daon.dmds.models.DMDSOrientation dMDSOrientation2);

    @java.lang.Deprecated
    void orientationChange(com.daon.dmds.models.DMDSOrientation dMDSOrientation);
}
