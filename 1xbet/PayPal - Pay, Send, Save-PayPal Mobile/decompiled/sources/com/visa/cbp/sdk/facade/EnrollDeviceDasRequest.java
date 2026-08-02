package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public class EnrollDeviceDasRequest {
    private com.visa.cbp.sdk.facade.DasDeviceInfo deviceInfo;
    private com.visa.cbp.sdk.facade.DeviceProfile deviceProfile;
    private java.lang.String profileAppID;
    private java.util.List<java.lang.String> deviceCertList = null;
    private java.util.List<com.visa.cbp.sdk.facade.VisaCertReferenceList> visaCertReferenceList = null;

    public com.visa.cbp.sdk.facade.DasDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public void setDeviceInfo(com.visa.cbp.sdk.facade.DasDeviceInfo dasDeviceInfo) {
        this.deviceInfo = dasDeviceInfo;
    }

    public com.visa.cbp.sdk.facade.DeviceProfile getDeviceProfile() {
        return this.deviceProfile;
    }

    public void setDeviceProfile(com.visa.cbp.sdk.facade.DeviceProfile deviceProfile) {
        this.deviceProfile = deviceProfile;
    }

    public java.util.List<java.lang.String> getDeviceCertList() {
        return this.deviceCertList;
    }

    public void setDeviceCertList(java.util.List<java.lang.String> list) {
        this.deviceCertList = list;
    }

    public java.util.List<com.visa.cbp.sdk.facade.VisaCertReferenceList> getVisaCertReferenceList() {
        return this.visaCertReferenceList;
    }

    public void setVisaCertReferenceList(java.util.List<com.visa.cbp.sdk.facade.VisaCertReferenceList> list) {
        this.visaCertReferenceList = list;
    }

    public java.lang.String getProfileAppID() {
        return this.profileAppID;
    }

    public void setProfileAppID(java.lang.String str) {
        this.profileAppID = str;
    }
}
