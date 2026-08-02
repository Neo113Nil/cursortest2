package com.google.android.libraries.places.internal;

/* loaded from: classes.dex */
public abstract class zzvn {
    private static java.lang.String zza = "com.google.android.libraries.places.internal.zzvt";
    private static java.lang.String zzb = "com.google.common.flogger.backend.google.GooglePlatform";
    private static java.lang.String zzc = "com.google.common.flogger.backend.system.DefaultPlatform";
    private static final java.lang.String[] zzd = {"com.google.android.libraries.places.internal.zzvt", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.flogger.backend.system.DefaultPlatform"};

    public static int zza() {
        return com.google.android.libraries.places.internal.zzxd.zza();
    }

    public static com.google.android.libraries.places.internal.zzvm zzb() {
        com.google.android.libraries.places.internal.zzvn zzvnVar;
        zzvnVar = com.google.android.libraries.places.internal.zzvl.zza;
        return zzvnVar.zzc();
    }

    public static com.google.android.libraries.places.internal.zzup zzd(java.lang.String str) {
        com.google.android.libraries.places.internal.zzvn zzvnVar;
        zzvnVar = com.google.android.libraries.places.internal.zzvl.zza;
        return zzvnVar.zze(str);
    }

    public static com.google.android.libraries.places.internal.zzwd zzf() {
        com.google.android.libraries.places.internal.zzvn zzvnVar;
        zzvnVar = com.google.android.libraries.places.internal.zzvl.zza;
        return zzvnVar.zzg();
    }

    public static boolean zzh(java.lang.String str, java.util.logging.Level level, boolean z) {
        zzf().zzb(str, level, z);
        return false;
    }

    public static com.google.android.libraries.places.internal.zzwo zzi() {
        return zzf().zzc();
    }

    public static com.google.android.libraries.places.internal.zzut zzj() {
        return zzf().zzd();
    }

    public static long zzk() {
        com.google.android.libraries.places.internal.zzvn zzvnVar;
        zzvnVar = com.google.android.libraries.places.internal.zzvl.zza;
        return zzvnVar.zzl();
    }

    public static java.lang.String zzm() {
        com.google.android.libraries.places.internal.zzvn zzvnVar;
        zzvnVar = com.google.android.libraries.places.internal.zzvl.zza;
        return zzvnVar.zzn();
    }

    protected abstract com.google.android.libraries.places.internal.zzvm zzc();

    protected abstract com.google.android.libraries.places.internal.zzup zze(java.lang.String str);

    protected com.google.android.libraries.places.internal.zzwd zzg() {
        return com.google.android.libraries.places.internal.zzwd.zze();
    }

    protected long zzl() {
        return java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(java.lang.System.currentTimeMillis());
    }

    protected abstract java.lang.String zzn();
}
