package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
public final class zzhv implements com.google.android.gms.internal.auth.zzhu {
    public static final com.google.android.gms.internal.auth.zzdc zza;
    public static final com.google.android.gms.internal.auth.zzdc zzb;
    public static final com.google.android.gms.internal.auth.zzdc zzc;
    public static final com.google.android.gms.internal.auth.zzdc zzd;
    public static final com.google.android.gms.internal.auth.zzdc zze;

    static {
        com.google.android.gms.internal.auth.zzcz zza2 = new com.google.android.gms.internal.auth.zzcz(com.google.android.gms.internal.auth.zzcr.zza("com.google.android.gms.auth_account")).zzb().zza();
        zza = zza2.zze("Aang__create_auth_exception_with_pending_intent", false);
        zzb = zza2.zze("Aang__enable_add_account_restrictions", false);
        zzc = zza2.zze("Aang__log_missing_gaia_id_event", true);
        zzd = zza2.zze("Aang__log_obfuscated_gaiaid_status", true);
        zze = zza2.zze("Aang__switch_clear_token_to_aang", false);
    }

    @Override // com.google.android.gms.internal.auth.zzhu
    public final boolean zza() {
        return ((java.lang.Boolean) zza.zzb()).booleanValue();
    }
}
