package com.daon.dmds.utils.idcapture;

/* loaded from: classes7.dex */
public interface IdCaptureResultListener {
    void onFailure(com.daon.dmds.models.DMDSDocumentQualityInfo dMDSDocumentQualityInfo);

    void onSuccess(com.daon.dmds.models.DMDSIDCaptureResult dMDSIDCaptureResult);
}
