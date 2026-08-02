package com.visa.cbp.external.common;

/* loaded from: classes16.dex */
public class StaticParamsReperso {

    @com.visa.cbp.external.common.NullValueValidate
    private java.util.List<com.visa.cbp.external.common.AidInfo> aidInfo = new java.util.ArrayList();
    private com.visa.cbp.external.common.QRConsumerDeviceData qrConsumerDeviceData;

    public java.util.List<com.visa.cbp.external.common.AidInfo> getAidInfo() {
        return this.aidInfo;
    }

    public void setAidInfo(java.util.List<com.visa.cbp.external.common.AidInfo> list) {
        this.aidInfo = list;
    }

    public com.visa.cbp.external.common.QRConsumerDeviceData getQrConsumerDeviceData() {
        return this.qrConsumerDeviceData;
    }

    public void setQrConsumerDeviceData(com.visa.cbp.external.common.QRConsumerDeviceData qRConsumerDeviceData) {
        this.qrConsumerDeviceData = qRConsumerDeviceData;
    }
}
