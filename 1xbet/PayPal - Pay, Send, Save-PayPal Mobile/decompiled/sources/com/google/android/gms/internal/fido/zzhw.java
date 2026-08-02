package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzhw implements com.google.android.gms.internal.fido.zzhv {
    public static final com.google.android.gms.internal.fido.zzaq zza;
    public static final com.google.android.gms.internal.fido.zzaq zzb;
    public static final com.google.android.gms.internal.fido.zzaq zzc;
    public static final com.google.android.gms.internal.fido.zzaq zzd;
    public static final com.google.android.gms.internal.fido.zzaq zze;
    public static final com.google.android.gms.internal.fido.zzaq zzf;
    public static final com.google.android.gms.internal.fido.zzaq zzg;
    public static final com.google.android.gms.internal.fido.zzaq zzh;

    static {
        com.google.android.gms.internal.fido.zzay zzd2 = new com.google.android.gms.internal.fido.zzay("com.google.android.gms.fido").zze(com.google.android.gms.internal.fido.zzcf.zzl("FIDO")).zzd();
        zza = zzd2.zzc("Fido2Ctap2Support__disable_transport_comparator", true);
        zzb = zzd2.zzc("Fido2Ctap2Support__enable_cancelling_requests", true);
        zzc = zzd2.zzc("Fido2Ctap2Support__enable_flow_separation_refactor", false);
        zzd = zzd2.zzc("Fido2Ctap2Support__nfc_activity_destroyed_check", true);
        zze = zzd2.zzc("Fido2Ctap2Support__remove_this_device_for_assertions", false);
        zzf = zzd2.zzc("Fido2Ctap2Support__skip_usb_permission_dialog", false);
        zzg = zzd2.zzc("Fido2Ctap2Support__transport_controller_refactor", false);
        zzh = zzd2.zzc("Fido2Ctap2Support__update_user_cancel_response", false);
    }

    @Override // com.google.android.gms.internal.fido.zzhv
    public final boolean zza() {
        return ((java.lang.Boolean) zzc.zza()).booleanValue();
    }
}
