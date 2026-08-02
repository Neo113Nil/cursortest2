package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public abstract class zzeg {
    private static java.lang.String zza = "com.google.android.gms.internal.fido.zzel";
    private static java.lang.String zzb = "com.google.common.flogger.backend.google.GooglePlatform";
    private static java.lang.String zzc = "com.google.common.flogger.backend.system.DefaultPlatform";
    private static final java.lang.String[] zzd = {"com.google.android.gms.internal.fido.zzel", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.flogger.backend.system.DefaultPlatform"};

    public static int zza() {
        return com.google.android.gms.internal.fido.zzfm.zza();
    }

    public static long zzb() {
        com.google.android.gms.internal.fido.zzeg zzegVar;
        zzegVar = com.google.android.gms.internal.fido.zzee.zza;
        return zzegVar.zzc();
    }

    public static com.google.android.gms.internal.fido.zzdp zzd(java.lang.String str) {
        com.google.android.gms.internal.fido.zzeg zzegVar;
        zzegVar = com.google.android.gms.internal.fido.zzee.zza;
        return zzegVar.zze(str);
    }

    public static com.google.android.gms.internal.fido.zzdr zzf() {
        return zzi().zza();
    }

    public static com.google.android.gms.internal.fido.zzef zzg() {
        com.google.android.gms.internal.fido.zzeg zzegVar;
        zzegVar = com.google.android.gms.internal.fido.zzee.zza;
        return zzegVar.zzh();
    }

    public static com.google.android.gms.internal.fido.zzev zzi() {
        com.google.android.gms.internal.fido.zzeg zzegVar;
        zzegVar = com.google.android.gms.internal.fido.zzee.zza;
        return zzegVar.zzj();
    }

    public static com.google.android.gms.internal.fido.zzfi zzk() {
        return zzi().zzc();
    }

    public static java.lang.String zzl() {
        com.google.android.gms.internal.fido.zzeg zzegVar;
        zzegVar = com.google.android.gms.internal.fido.zzee.zza;
        return zzegVar.zzm();
    }

    public static boolean zzn(java.lang.String str, java.util.logging.Level level, boolean z) {
        zzi().zzd(str, level, z);
        return false;
    }

    protected long zzc() {
        return java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(java.lang.System.currentTimeMillis());
    }

    protected abstract com.google.android.gms.internal.fido.zzdp zze(java.lang.String str);

    protected abstract com.google.android.gms.internal.fido.zzef zzh();

    protected com.google.android.gms.internal.fido.zzev zzj() {
        return com.google.android.gms.internal.fido.zzev.zze();
    }

    protected abstract java.lang.String zzm();
}
