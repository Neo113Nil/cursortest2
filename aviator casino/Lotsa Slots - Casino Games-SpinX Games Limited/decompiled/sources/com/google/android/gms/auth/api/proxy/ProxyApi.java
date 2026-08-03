package com.google.android.gms.auth.api.proxy;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes3.dex */
public interface ProxyApi {

    /* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
    public interface ProxyResult extends com.google.android.gms.common.api.Result {
        com.google.android.gms.auth.api.proxy.ProxyResponse getResponse();
    }

    /* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
    public interface SpatulaHeaderResult extends com.google.android.gms.common.api.Result {
        java.lang.String getSpatulaHeader();
    }

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.auth.api.proxy.ProxyApi.SpatulaHeaderResult> getSpatulaHeader(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult> performProxyRequest(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.auth.api.proxy.ProxyRequest proxyRequest);
}
