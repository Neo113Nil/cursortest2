package com.google.android.gms.auth.api.proxy;

/* loaded from: classes8.dex */
public interface ProxyClient extends com.google.android.gms.common.api.HasApiKey<com.google.android.gms.auth.api.AuthProxyOptions> {
    com.google.android.gms.tasks.Task<java.lang.String> getSpatulaHeader();

    com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.proxy.ProxyResponse> performProxyRequest(com.google.android.gms.auth.api.proxy.ProxyRequest proxyRequest);
}
