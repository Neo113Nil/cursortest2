package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public class ChannelSecurityContext {
    private com.visa.cbp.external.common.ChannelInfo channelInfo;
    private java.util.List<com.visa.cbp.external.common.DeviceCert> deviceCerts;
    private java.util.List<com.visa.cbp.external.common.VtsCert> vtsCerts = new java.util.ArrayList();

    public void init(java.util.List<com.visa.cbp.external.common.VtsCert> list, com.visa.cbp.external.common.ChannelInfo channelInfo, java.util.List<com.visa.cbp.external.common.DeviceCert> list2) {
        this.vtsCerts = list;
        this.channelInfo = channelInfo;
        this.deviceCerts = list2;
    }

    public java.util.List<com.visa.cbp.external.common.VtsCert> getVtsCerts() {
        return this.vtsCerts;
    }

    public void setVtsCerts(java.util.List<com.visa.cbp.external.common.VtsCert> list) {
        this.vtsCerts = list;
    }

    public com.visa.cbp.external.common.ChannelInfo getChannelInfo() {
        return this.channelInfo;
    }

    public void setChannelInfo(com.visa.cbp.external.common.ChannelInfo channelInfo) {
        this.channelInfo = channelInfo;
    }

    public java.util.List<com.visa.cbp.external.common.DeviceCert> getDeviceCerts() {
        return this.deviceCerts;
    }

    public void setDeviceCerts(java.util.List<com.visa.cbp.external.common.DeviceCert> list) {
        this.deviceCerts = list;
    }
}
