package com.adjust.sdk.oaid;

/* loaded from: classes2.dex */
public class OaidInfo {
    private java.lang.String oaid;
    private boolean trackingEnabled;

    public OaidInfo(java.lang.String str, boolean z) {
        this.oaid = str;
        this.trackingEnabled = z;
    }

    public java.lang.String getOaid() {
        return this.oaid;
    }

    public boolean isTrackingEnabled() {
        return this.trackingEnabled;
    }
}
