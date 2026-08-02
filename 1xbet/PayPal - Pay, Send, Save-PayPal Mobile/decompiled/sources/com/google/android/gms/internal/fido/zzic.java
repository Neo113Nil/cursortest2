package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzic implements com.google.android.gms.internal.fido.zzib {
    public static final com.google.android.gms.internal.fido.zzaq zza;
    public static final com.google.android.gms.internal.fido.zzaq zzb;
    public static final com.google.android.gms.internal.fido.zzaq zzc;
    public static final com.google.android.gms.internal.fido.zzaq zzd;
    public static final com.google.android.gms.internal.fido.zzaq zze;
    public static final com.google.android.gms.internal.fido.zzaq zzf;
    public static final com.google.android.gms.internal.fido.zzaq zzg;
    public static final com.google.android.gms.internal.fido.zzaq zzh;
    public static final com.google.android.gms.internal.fido.zzaq zzi;
    public static final com.google.android.gms.internal.fido.zzaq zzj;
    public static final com.google.android.gms.internal.fido.zzaq zzk;
    public static final com.google.android.gms.internal.fido.zzaq zzl;
    public static final com.google.android.gms.internal.fido.zzaq zzm;
    public static final com.google.android.gms.internal.fido.zzaq zzn;
    public static final com.google.android.gms.internal.fido.zzaq zzo;
    public static final com.google.android.gms.internal.fido.zzaq zzp;
    public static final com.google.android.gms.internal.fido.zzaq zzq;
    public static final com.google.android.gms.internal.fido.zzaq zzr;
    public static final com.google.android.gms.internal.fido.zzaq zzs;

    static {
        com.google.android.gms.internal.fido.zzay zzd2 = new com.google.android.gms.internal.fido.zzay("com.google.android.gms.fido").zze(com.google.android.gms.internal.fido.zzcf.zzl("FIDO")).zzd();
        zza = zzd2.zzc("Passkeys__check_all_keys", false);
        zzb = zzd2.zzc("Passkeys__check_sync_status", true);
        zzc = zzd2.zzc("Passkeys__client_data_hash_override_for_security_keys", false);
        zzd = zzd2.zzc("Passkeys__direct_assetlinks", false);
        zze = zzd2.zza("Passkeys__direct_assetlinks_cache_seconds", 604800L);
        zzf = zzd2.zzb("Passkeys__direct_assetlinks_rpids", "*");
        zzg = zzd2.zzc("Passkeys__dispatch_prf_via_credman", true);
        zzh = zzd2.zzb("Passkeys__help_center_url", "https://support.google.com/accounts/answer/6208650");
        zzi = zzd2.zzc("Passkeys__hide_consent_page_in_registration_enabled", false);
        zzj = zzd2.zzc("Passkeys__ignore_stop_during_hybrid_request", false);
        zzk = zzd2.zzc("Passkeys__json_for_parcelables", false);
        zzl = zzd2.zzc("Passkeys__passkey_entries_use_gpm_icon", false);
        zzm = zzd2.zzc("Passkeys__reencrypt_passkey", false);
        zzn = zzd2.zzc("Passkeys__return_cryptauth_status", false);
        zzo = zzd2.zzc("Passkeys__set_key_version", true);
        zzp = zzd2.zza("Passkeys__should_show_welcome_fragment", -1L);
        zzq = zzd2.zzc("Passkeys__skip_consent_after_retrieval", false);
        zzr = zzd2.zzc("Passkeys__skip_consent_screen", false);
        zzs = zzd2.zzc("Passkeys__use_result_receiver", false);
    }

    @Override // com.google.android.gms.internal.fido.zzib
    public final boolean zza() {
        return ((java.lang.Boolean) zzk.zza()).booleanValue();
    }

    @Override // com.google.android.gms.internal.fido.zzib
    public final boolean zzb() {
        return ((java.lang.Boolean) zzs.zza()).booleanValue();
    }
}
