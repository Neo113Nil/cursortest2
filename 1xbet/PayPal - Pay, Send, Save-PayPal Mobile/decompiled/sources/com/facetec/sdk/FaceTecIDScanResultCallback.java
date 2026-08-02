package com.facetec.sdk;

/* loaded from: classes8.dex */
public interface FaceTecIDScanResultCallback {
    void cancel();

    boolean proceedToNextStep(java.lang.String str);

    void uploadMessageOverride(java.lang.String str);

    void uploadProgress(float f);
}
