package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public abstract class zzcb {
    private static java.lang.String zza = "com.google.android.gms.internal.play_games_inputmapping.zzcj";
    private static java.lang.String zzb = "com.google.common.flogger.backend.google.GooglePlatform";
    private static java.lang.String zzc = "com.google.common.flogger.backend.system.DefaultPlatform";
    private static final java.lang.String[] zzd = {"com.google.android.gms.internal.play_games_inputmapping.zzcj", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.flogger.backend.system.DefaultPlatform"};

    public static int zza() {
        return com.google.android.gms.internal.play_games_inputmapping.zzdu.zza();
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzca zzb() {
        com.google.android.gms.internal.play_games_inputmapping.zzcb zzcbVar;
        zzcbVar = com.google.android.gms.internal.play_games_inputmapping.zzbz.zza;
        return zzcbVar.zzc();
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzbc zzd(java.lang.String str) {
        com.google.android.gms.internal.play_games_inputmapping.zzcb zzcbVar;
        zzcbVar = com.google.android.gms.internal.play_games_inputmapping.zzbz.zza;
        return zzcbVar.zze(str);
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzcs zzf() {
        com.google.android.gms.internal.play_games_inputmapping.zzcb zzcbVar;
        zzcbVar = com.google.android.gms.internal.play_games_inputmapping.zzbz.zza;
        return zzcbVar.zzg();
    }

    public static boolean zzh(java.lang.String str, java.util.logging.Level level, boolean z) {
        zzf().zzb(str, level, z);
        return false;
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzdf zzi() {
        return zzf().zzc();
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzbg zzj() {
        return zzf().zzd();
    }

    public static long zzk() {
        com.google.android.gms.internal.play_games_inputmapping.zzcb zzcbVar;
        zzcbVar = com.google.android.gms.internal.play_games_inputmapping.zzbz.zza;
        return zzcbVar.zzl();
    }

    public static java.lang.String zzm() {
        com.google.android.gms.internal.play_games_inputmapping.zzcb zzcbVar;
        zzcbVar = com.google.android.gms.internal.play_games_inputmapping.zzbz.zza;
        return zzcbVar.zzn();
    }

    protected abstract com.google.android.gms.internal.play_games_inputmapping.zzca zzc();

    protected abstract com.google.android.gms.internal.play_games_inputmapping.zzbc zze(java.lang.String str);

    protected com.google.android.gms.internal.play_games_inputmapping.zzcs zzg() {
        return com.google.android.gms.internal.play_games_inputmapping.zzcs.zze();
    }

    protected long zzl() {
        return java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(java.lang.System.currentTimeMillis());
    }

    protected abstract java.lang.String zzn();
}
