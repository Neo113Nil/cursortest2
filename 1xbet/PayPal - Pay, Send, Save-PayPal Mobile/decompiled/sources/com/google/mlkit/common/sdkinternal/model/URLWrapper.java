package com.google.mlkit.common.sdkinternal.model;

/* loaded from: classes9.dex */
public class URLWrapper {
    private final java.net.URL zza;

    public URLWrapper(java.lang.String str) throws java.net.MalformedURLException {
        this.zza = new java.net.URL(str);
    }

    public java.net.URLConnection openConnection() throws java.io.IOException {
        return this.zza.openConnection();
    }
}
