package com.facetec.sdk;

/* loaded from: classes8.dex */
public enum og {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);

    public final int h;

    og(int i) {
        this.h = i;
    }

    public static com.facetec.sdk.og a(int i) {
        for (com.facetec.sdk.og ogVar : values()) {
            if (ogVar.h == i) {
                return ogVar;
            }
        }
        return null;
    }
}
