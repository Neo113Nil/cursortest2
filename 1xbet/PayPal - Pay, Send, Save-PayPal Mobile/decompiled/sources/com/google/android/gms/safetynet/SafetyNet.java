package com.google.android.gms.safetynet;

/* loaded from: classes8.dex */
public final class SafetyNet {

    @java.lang.Deprecated
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> API;

    @java.lang.Deprecated
    public static final com.google.android.gms.safetynet.SafetyNetApi SafetyNetApi;
    public static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.safetynet.zzaf> zza;
    public static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.safetynet.zzaf, com.google.android.gms.common.api.Api.ApiOptions.NoOptions> zzb;
    public static final com.google.android.gms.internal.safetynet.zzag zzc;

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.safetynet.zzaf> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        zza = clientKey;
        com.google.android.gms.safetynet.zzk zzkVar = new com.google.android.gms.safetynet.zzk();
        zzb = zzkVar;
        API = new com.google.android.gms.common.api.Api<>("SafetyNet.API", zzkVar, clientKey);
        SafetyNetApi = new com.google.android.gms.internal.safetynet.zzae();
        zzc = new com.google.android.gms.internal.safetynet.zzag();
    }

    public static com.google.android.gms.safetynet.SafetyNetClient getClient(android.app.Activity activity) {
        return new com.google.android.gms.safetynet.SafetyNetClient(activity);
    }

    public static com.google.android.gms.safetynet.SafetyNetClient getClient(android.content.Context context) {
        return new com.google.android.gms.safetynet.SafetyNetClient(context);
    }

    private SafetyNet() {
    }
}
