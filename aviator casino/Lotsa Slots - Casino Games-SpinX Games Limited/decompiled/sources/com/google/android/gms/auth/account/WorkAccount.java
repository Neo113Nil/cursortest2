package com.google.android.gms.auth.account;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes3.dex */
public class WorkAccount {
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> API;

    @java.lang.Deprecated
    public static final com.google.android.gms.auth.account.WorkAccountApi WorkAccountApi;
    private static final com.google.android.gms.common.api.Api.ClientKey zza;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zzb;

    static {
        com.google.android.gms.common.api.Api.ClientKey clientKey = new com.google.android.gms.common.api.Api.ClientKey();
        zza = clientKey;
        com.google.android.gms.auth.account.zzf zzfVar = new com.google.android.gms.auth.account.zzf();
        zzb = zzfVar;
        API = new com.google.android.gms.common.api.Api<>("WorkAccount.API", zzfVar, clientKey);
        WorkAccountApi = new com.google.android.gms.internal.auth.zzal();
    }

    private WorkAccount() {
    }

    public static com.google.android.gms.auth.account.WorkAccountClient getClient(android.app.Activity activity) {
        return new com.google.android.gms.auth.account.WorkAccountClient(activity);
    }

    public static com.google.android.gms.auth.account.WorkAccountClient getClient(android.content.Context context) {
        return new com.google.android.gms.auth.account.WorkAccountClient(context);
    }
}
