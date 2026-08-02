package com.daon.dmds.models;

/* loaded from: classes7.dex */
public class DMDSMrzDetectionMetadata {
    private com.daon.dmds.models.DMDSQuadrangle Camera2StreamConfigurationMap;

    public DMDSMrzDetectionMetadata(com.daon.dmds.models.DMDSQuadrangle dMDSQuadrangle) {
        setDetectionLocation(dMDSQuadrangle);
    }

    public com.daon.dmds.models.DMDSQuadrangle getDetectionLocation() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setDetectionLocation(com.daon.dmds.models.DMDSQuadrangle dMDSQuadrangle) {
        this.Camera2StreamConfigurationMap = dMDSQuadrangle;
    }
}
