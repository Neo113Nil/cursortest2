package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzbdx {
    public static final zzbdi zza = new zzbdi("gads:gma_attestation:click:macro_string", "@click_attok@", 4);
    public static final zzbdi zzb = new zzbdi("gads:gma_attestation:click:query_param", "attok", 4);
    public static final zzbdi zzc = zzbdi.zzb("gads:gma_attestation:click:timeout", 2000);
    public static final zzbdi zzd = zzbdi.zzd("gads:gma_attestation:click:enable", false);
    public static final zzbdi zze = zzbdi.zzb("gads:gma_attestation:click:enable_dynamite_version", 213806100);
    public static final zzbdi zzf = zzbdi.zzd("gads:gma_attestation:click:qualification:enable", true);
    public static final zzbdi zzg = zzbdi.zzd("gads:gma_attestation:image_hash", false);
    public static final zzbdi zzh = zzbdi.zzd("gads:gma_attestation:impression:enable", true);
    public static final zzbdi zzi;

    static {
        zzbdi.zzd("gads:gma_attestation:request:enable_javascript", false);
        zzbdi.zzd("gads:gma_attestation:request:enable", true);
        zzi = zzbdi.zzd("gads:gma_attestation:click:report_error", true);
    }
}
