package com.unity3d.services.core.log;

/* loaded from: classes6.dex */
public class DeviceLogLevel {
    private static final java.lang.String LOG_TAG = "UnityAds";
    private java.lang.String _receivingMethodName;

    public DeviceLogLevel(java.lang.String str) {
        this._receivingMethodName = str;
    }

    public java.lang.String getLogTag() {
        return "UnityAds";
    }

    public java.lang.String getReceivingMethodName() {
        return this._receivingMethodName;
    }
}
