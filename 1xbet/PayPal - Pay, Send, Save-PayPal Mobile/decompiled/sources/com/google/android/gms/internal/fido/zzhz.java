package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzhz implements com.google.android.gms.internal.fido.zzhy {
    public static final com.google.android.gms.internal.fido.zzaq zza;
    public static final com.google.android.gms.internal.fido.zzaq zzb;
    public static final com.google.android.gms.internal.fido.zzaq zzc;
    public static final com.google.android.gms.internal.fido.zzaq zzd;
    public static final com.google.android.gms.internal.fido.zzaq zze;
    public static final com.google.android.gms.internal.fido.zzaq zzf;
    public static final com.google.android.gms.internal.fido.zzaq zzg;

    static {
        com.google.android.gms.internal.fido.zzay zzd2 = new com.google.android.gms.internal.fido.zzay("com.google.android.gms.fido").zze(com.google.android.gms.internal.fido.zzcf.zzl("FIDO")).zzd();
        zza = zzd2.zzc("Hybrid__client_enabled", false);
        zzb = zzd2.zzc("Hybrid__disavow_location_permissions", true);
        zzc = zzd2.zza("Hybrid__number_of_seconds_to_wait_for_bt_scanning_radio_to_be_ready", 3L);
        zzd = zzd2.zza("Hybrid__number_of_seconds_to_wait_for_bt_scanning_turning_on", 3L);
        zze = zzd2.zzc("Hybrid__prf_eval_during_create", true);
        zzf = zzd2.zzc("Hybrid__use_hybrid_for_server_link", false);
        zzg = zzd2.zzc("Hybrid__websocket_close_socket", true);
    }

    @Override // com.google.android.gms.internal.fido.zzhy
    public final boolean zza() {
        return ((java.lang.Boolean) zza.zza()).booleanValue();
    }
}
