package com.visa.cbp.mpqr.facade;

/* loaded from: classes16.dex */
public class ChannelSecurityContext {
    private com.visa.cbp.mpqr.facade.ChannelInfo channelInfo;
    private java.util.List<com.visa.cbp.mpqr.facade.DeviceCert> deviceCerts;
    private java.util.List<com.visa.cbp.mpqr.facade.VtsCert> vtsCerts = new java.util.ArrayList();

    public void init(java.util.List<com.visa.cbp.mpqr.facade.VtsCert> list, com.visa.cbp.mpqr.facade.ChannelInfo channelInfo, java.util.List<com.visa.cbp.mpqr.facade.DeviceCert> list2) {
        this.vtsCerts = list;
        this.channelInfo = channelInfo;
        this.deviceCerts = list2;
    }

    public java.util.List<com.visa.cbp.mpqr.facade.VtsCert> getVtsCerts() {
        return this.vtsCerts;
    }

    public void setVtsCerts(java.util.List<com.visa.cbp.mpqr.facade.VtsCert> list) {
        this.vtsCerts = list;
    }

    public com.visa.cbp.mpqr.facade.ChannelInfo getChannelInfo() {
        return this.channelInfo;
    }

    public void setChannelInfo(com.visa.cbp.mpqr.facade.ChannelInfo channelInfo) {
        this.channelInfo = channelInfo;
    }

    public java.util.List<com.visa.cbp.mpqr.facade.DeviceCert> getDeviceCerts() {
        return this.deviceCerts;
    }

    public void setDeviceCerts(java.util.List<com.visa.cbp.mpqr.facade.DeviceCert> list) {
        this.deviceCerts = list;
    }
}
