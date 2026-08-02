package com.visa.cbp.sdk.facade.data;

/* loaded from: classes5.dex */
public enum CVMPriority {
    OCS("OCS"),
    OSC("OSC"),
    COS("COS"),
    CSO("CSO"),
    SCO("SCO"),
    SOC("SOC");

    private final java.lang.String value;

    CVMPriority(java.lang.String str) {
        this.value = str;
    }

    public final java.lang.String getValue() {
        return this.value;
    }
}
