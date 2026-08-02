package com.google.android.gms.auth.api;

/* loaded from: classes8.dex */
public final class AuthProxy {
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.AuthProxyOptions> API;
    public static final com.google.android.gms.auth.api.proxy.ProxyApi ProxyApi;
    public static final com.google.android.gms.common.api.Api.ClientKey zza;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zzb;

    static {
        com.google.android.gms.common.api.Api.ClientKey clientKey = new com.google.android.gms.common.api.Api.ClientKey();
        zza = clientKey;
        com.google.android.gms.auth.api.zza zzaVar = new com.google.android.gms.auth.api.zza();
        zzb = zzaVar;
        API = new com.google.android.gms.common.api.Api<>("Auth.PROXY_API", zzaVar, clientKey);
        ProxyApi = new com.google.android.gms.internal.auth.zzbt();
    }

    public static com.google.android.gms.auth.api.proxy.ProxyClient getClient(android.app.Activity activity, com.google.android.gms.auth.api.AuthProxyOptions authProxyOptions) {
        return new com.google.android.gms.internal.auth.zzbo(activity, authProxyOptions);
    }

    public static com.google.android.gms.auth.api.proxy.ProxyClient getClient(android.content.Context context, com.google.android.gms.auth.api.AuthProxyOptions authProxyOptions) {
        return new com.google.android.gms.internal.auth.zzbo(context, authProxyOptions);
    }
}
