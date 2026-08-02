package com.daon.dmds.managers;

/* loaded from: classes7.dex */
public class DMDSMetadataProvider {
    private com.daon.dmds.managers.DMDSFaceQualityInfoListener getHighResolutionOutputSizeshNQ4ISI;
    private com.daon.dmds.managers.DMDSDocumentQualityInfoListener getHighSpeedVideoSizes;

    public com.daon.dmds.managers.DMDSDocumentQualityInfoListener getDocumentQualityInfoListener() {
        return this.getHighSpeedVideoSizes;
    }

    public com.daon.dmds.managers.DMDSFaceQualityInfoListener getFaceQualityInfoListener() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setDocumentQualityInfoListener(com.daon.dmds.managers.DMDSDocumentQualityInfoListener dMDSDocumentQualityInfoListener) {
        this.getHighSpeedVideoSizes = dMDSDocumentQualityInfoListener;
    }

    public void setFaceQualityInfoListener(com.daon.dmds.managers.DMDSFaceQualityInfoListener dMDSFaceQualityInfoListener) {
        this.getHighResolutionOutputSizeshNQ4ISI = dMDSFaceQualityInfoListener;
    }
}
