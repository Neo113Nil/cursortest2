package com.gemalto.mfs.mwsdk.provisioning.listener;

/* loaded from: classes3.dex */
public interface PushServiceListener {
    void onComplete();

    void onError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError);

    void onServerMessage(java.lang.String str, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceMessage provisioningServiceMessage);

    void onUnsupportedPushContent(android.os.Bundle bundle);
}
