package com.google.android.gms.auth.api.proxy;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes3.dex */
public interface ProxyClient extends com.google.android.gms.common.api.HasApiKey<com.google.android.gms.auth.api.AuthProxyOptions> {
    com.google.android.gms.tasks.Task<java.lang.String> getSpatulaHeader();

    com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.proxy.ProxyResponse> performProxyRequest(com.google.android.gms.auth.api.proxy.ProxyRequest proxyRequest);
}
