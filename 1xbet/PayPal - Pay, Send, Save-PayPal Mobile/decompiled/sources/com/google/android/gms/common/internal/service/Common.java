package com.google.android.gms.common.internal.service;

/* loaded from: classes8.dex */
public final class Common {
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> API;
    public static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.common.internal.service.zah> CLIENT_KEY;
    public static final com.google.android.gms.common.internal.service.zae zaa;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zab;

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.common.internal.service.zah> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        com.google.android.gms.common.internal.service.zab zabVar = new com.google.android.gms.common.internal.service.zab();
        zab = zabVar;
        API = new com.google.android.gms.common.api.Api<>("Common.API", zabVar, clientKey);
        zaa = new com.google.android.gms.common.internal.service.zae();
    }
}
