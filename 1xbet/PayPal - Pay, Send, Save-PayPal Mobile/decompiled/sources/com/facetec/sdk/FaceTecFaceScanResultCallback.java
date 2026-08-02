package com.facetec.sdk;

/* loaded from: classes8.dex */
public interface FaceTecFaceScanResultCallback {
    void cancel();

    boolean proceedToNextStep(java.lang.String str);

    boolean proceedToNextStep(java.lang.String str, com.facetec.sdk.FaceTecIDScanNextStep faceTecIDScanNextStep);

    @java.lang.Deprecated
    void retry();

    @java.lang.Deprecated
    void succeed();

    @java.lang.Deprecated
    void succeed(com.facetec.sdk.FaceTecIDScanNextStep faceTecIDScanNextStep);

    void uploadMessageOverride(java.lang.String str);

    void uploadProgress(float f);
}
