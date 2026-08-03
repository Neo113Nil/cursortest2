package com.helpshift.network;

/* loaded from: classes2.dex */
public class HSRequestData {
    public final java.util.Map<java.lang.String, java.lang.String> body;
    public final java.util.Map<java.lang.String, java.lang.String> headers;

    public HSRequestData(java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2) {
        this.headers = map;
        this.body = map2;
    }
}
