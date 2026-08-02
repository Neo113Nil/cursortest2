package com.gemalto.mfs.mwsdk.provisioning.listener;

/* loaded from: classes8.dex */
public interface ReplenishmentPrepListener {
    void onPreparationComplete();

    void onPreparationFailed(com.gemalto.mfs.mwsdk.sdkconfig.SDKError<com.gemalto.mfs.mwsdk.provisioning.model.ReplenishmentPrepStatus> sDKError);

    void onPreparationProgressUpdate(com.gemalto.mfs.mwsdk.provisioning.model.ReplenishmentPrepStatus replenishmentPrepStatus, java.lang.String str);
}
