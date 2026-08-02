package com.google.android.gms.auth.api;

/* loaded from: classes8.dex */
public final class Auth {
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.signin.GoogleSignInOptions> GOOGLE_SIGN_IN_API;
    public static final com.google.android.gms.auth.api.signin.GoogleSignInApi GoogleSignInApi;

    @java.lang.Deprecated
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.AuthProxyOptions> PROXY_API;

    @java.lang.Deprecated
    public static final com.google.android.gms.auth.api.proxy.ProxyApi ProxyApi;
    public static final com.google.android.gms.common.api.Api.ClientKey zba;
    public static final com.google.android.gms.common.api.Api.ClientKey zbb;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zbc;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zbd;

    static {
        com.google.android.gms.common.api.Api.ClientKey clientKey = new com.google.android.gms.common.api.Api.ClientKey();
        zba = clientKey;
        com.google.android.gms.common.api.Api.ClientKey clientKey2 = new com.google.android.gms.common.api.Api.ClientKey();
        zbb = clientKey2;
        com.google.android.gms.auth.api.zba zbaVar = new com.google.android.gms.auth.api.zba();
        zbc = zbaVar;
        com.google.android.gms.auth.api.zbb zbbVar = new com.google.android.gms.auth.api.zbb();
        zbd = zbbVar;
        PROXY_API = com.google.android.gms.auth.api.AuthProxy.API;
        new com.google.android.gms.common.api.Api("Auth.CREDENTIALS_API", zbaVar, clientKey);
        GOOGLE_SIGN_IN_API = new com.google.android.gms.common.api.Api<>("Auth.GOOGLE_SIGN_IN_API", zbbVar, clientKey2);
        ProxyApi = com.google.android.gms.auth.api.AuthProxy.ProxyApi;
        GoogleSignInApi = new com.google.android.gms.auth.api.signin.internal.zbd();
    }

    private Auth() {
    }
}
