package com.datadog.trace.api.gateway;

/* loaded from: classes8.dex */
public class EventType<C> {
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoSizes;

    protected EventType(java.lang.String str, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoSizes = i;
    }

    public java.lang.String getName() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EventType{name='");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append("'}");
        return sb.toString();
    }
}
