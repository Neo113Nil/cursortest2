package com.gemalto.mfs.mwsdk.provisioning.sdkconfig;

/* loaded from: classes3.dex */
public interface ProvisioningBusinessService extends com.gemalto.mfs.mwsdk.sdkconfig.BusinessService {
    void getAccessToken(java.lang.String str, com.gemalto.mfs.mwsdk.provisioning.model.GetAccessTokenMode getAccessTokenMode, com.gemalto.mfs.mwsdk.provisioning.listener.AccessTokenListener accessTokenListener);

    com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceCodeType getCodeType();

    com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ReplenishmentPrepService getReplenishmentPrepService();

    void processIncomingMessage(android.os.Bundle bundle, com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener pushServiceListener);

    void retrySession(com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener pushServiceListener) throws com.gemalto.mfs.mwsdk.provisioning.exception.ExistingRetrySessionException, com.gemalto.mfs.mwsdk.provisioning.exception.NoSessionException;

    void sendActivationCode(com.gemalto.mfs.mwsdk.provisioning.listener.EnrollingServiceListener enrollingServiceListener);

    void sendActivationCode(com.gemalto.mfs.mwsdk.provisioning.listener.EnrollingServiceListener enrollingServiceListener, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServicePinType provisioningServicePinType);

    void sendRequestForODACertificateRenewal(java.lang.String str, com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener pushServiceListener);

    void sendRequestForODACertificateRenewal(java.lang.String str, boolean z, com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener pushServiceListener);

    void sendRequestForReplenishment(java.lang.String str, com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener pushServiceListener);

    void sendRequestForReplenishment(java.lang.String str, com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener pushServiceListener, boolean z);

    void updatePushToken(java.lang.String str, com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener pushServiceListener);
}
