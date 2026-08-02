package com.gemalto.mfs.mwsdk.provisioning.sdkconfig;

/* loaded from: classes3.dex */
public interface EnrollingBusinessService extends com.gemalto.mfs.mwsdk.sdkconfig.BusinessService {
    void continueEnrollment(java.lang.String str, com.gemalto.mfs.mwsdk.provisioning.listener.EnrollingServiceListener enrollingServiceListener);

    void continueEnrollment(java.lang.String str, com.gemalto.mfs.mwsdk.provisioning.listener.EnrollingServiceListener enrollingServiceListener, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServicePinType provisioningServicePinType);

    void enroll(java.lang.String str, java.lang.String str2, java.lang.String str3, com.gemalto.mfs.mwsdk.provisioning.listener.EnrollingServiceListener enrollingServiceListener);

    void enroll(java.lang.String str, java.lang.String str2, java.lang.String str3, com.gemalto.mfs.mwsdk.provisioning.listener.EnrollingServiceListener enrollingServiceListener, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServicePinType provisioningServicePinType);

    com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceCodeType getCodeType();

    com.gemalto.mfs.mwsdk.provisioning.model.EnrollmentStatus isEnrolled();
}
