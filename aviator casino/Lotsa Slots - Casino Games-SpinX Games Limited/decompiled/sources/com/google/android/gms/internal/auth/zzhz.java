package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
public final class zzhz implements com.google.android.gms.internal.auth.zzhx {
    public static final com.google.android.gms.internal.auth.zzdc zza;
    public static final com.google.android.gms.internal.auth.zzdc zzb;
    public static final com.google.android.gms.internal.auth.zzdc zzc;
    public static final com.google.android.gms.internal.auth.zzdc zzd;
    public static final com.google.android.gms.internal.auth.zzdc zze;
    public static final com.google.android.gms.internal.auth.zzdc zzf;
    public static final com.google.android.gms.internal.auth.zzdc zzg;
    public static final com.google.android.gms.internal.auth.zzdc zzh;
    public static final com.google.android.gms.internal.auth.zzdc zzi;
    public static final com.google.android.gms.internal.auth.zzdc zzj;
    public static final com.google.android.gms.internal.auth.zzdc zzk;
    public static final com.google.android.gms.internal.auth.zzdc zzl;
    public static final com.google.android.gms.internal.auth.zzdc zzm;

    static {
        com.google.android.gms.internal.auth.zzcz zza2 = new com.google.android.gms.internal.auth.zzcz(com.google.android.gms.internal.auth.zzcr.zza("com.google.android.gms.auth_account")).zzb().zza();
        zza = zza2.zzc("getTokenRefactor__account_data_service_sample_percentage", 0.0d);
        zzb = zza2.zze("getTokenRefactor__account_data_service_tokenAPI_usable", true);
        zzc = zza2.zzd("getTokenRefactor__account_manager_timeout_seconds", 20L);
        zzd = zza2.zzd("getTokenRefactor__android_id_shift", 0L);
        try {
            zze = zza2.zzf("getTokenRefactor__blocked_packages", com.google.android.gms.internal.auth.zzhs.zzp(android.util.Base64.decode("ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n", 3)), com.google.android.gms.internal.auth.zzhy.zza);
            zzf = zza2.zze("getTokenRefactor__chimera_get_token_evolved", true);
            zzg = zza2.zzd("getTokenRefactor__clear_token_timeout_seconds", 20L);
            zzh = zza2.zzd("getTokenRefactor__default_task_timeout_seconds", 20L);
            zzi = zza2.zze("getTokenRefactor__gaul_accounts_api_evolved", false);
            zzj = zza2.zze("getTokenRefactor__gaul_token_api_evolved", false);
            zzk = zza2.zzd("getTokenRefactor__get_token_timeout_seconds", 120L);
            zzl = zza2.zze("getTokenRefactor__gms_account_authenticator_evolved", true);
            zzm = zza2.zzc("getTokenRefactor__gms_account_authenticator_sample_percentage", 0.0d);
        } catch (java.lang.Exception e) {
            throw new java.lang.AssertionError(e);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzhx
    public final com.google.android.gms.internal.auth.zzhs zza() {
        return (com.google.android.gms.internal.auth.zzhs) zze.zzb();
    }

    @Override // com.google.android.gms.internal.auth.zzhx
    public final boolean zzb() {
        return ((java.lang.Boolean) zzi.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.auth.zzhx
    public final boolean zzc() {
        return ((java.lang.Boolean) zzj.zzb()).booleanValue();
    }
}
