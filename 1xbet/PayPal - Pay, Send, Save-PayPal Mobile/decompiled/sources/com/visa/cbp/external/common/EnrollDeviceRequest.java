package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public class EnrollDeviceRequest {
    private com.visa.cbp.external.common.ChannelSecurityContext channelSecurityContext;
    private com.visa.cbp.external.common.DeviceInfo deviceInfo;

    public com.visa.cbp.external.common.DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public void setDeviceInfo(com.visa.cbp.external.common.DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public com.visa.cbp.external.common.ChannelSecurityContext getChannelSecurityContext() {
        return this.channelSecurityContext;
    }

    public void setChannelSecurityContext(com.visa.cbp.external.common.ChannelSecurityContext channelSecurityContext) {
        this.channelSecurityContext = channelSecurityContext;
    }
}
