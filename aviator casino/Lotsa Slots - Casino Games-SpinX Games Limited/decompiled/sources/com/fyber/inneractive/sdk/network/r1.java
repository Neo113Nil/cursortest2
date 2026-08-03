package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public enum r1 {
    EVENT_TABLE("sdk_event_"),
    ERROR_TABLE("sdk_error_");

    private final java.lang.String tableName;

    r1(java.lang.String str) {
        this.tableName = str;
    }

    public final java.lang.String a() {
        return this.tableName;
    }
}
