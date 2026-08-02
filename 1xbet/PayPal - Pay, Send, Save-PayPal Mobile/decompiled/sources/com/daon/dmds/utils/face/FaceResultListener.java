package com.daon.dmds.utils.face;

/* loaded from: classes7.dex */
public interface FaceResultListener {
    void onFailure(com.daon.dmds.models.DMDSFaceQualityInfo dMDSFaceQualityInfo);

    void onSuccess(com.daon.dmds.models.DMDSFace dMDSFace);
}
