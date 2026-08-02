package com.gemalto.mfs.mwsdk.provisioning.listener;

/* loaded from: classes3.dex */
public interface DataPreparationListener {
    void onError(java.lang.String str, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError);

    void onSuccess(java.lang.String str, com.gemalto.mfs.mwsdk.provisioning.model.DataPreparationResponse dataPreparationResponse);
}
