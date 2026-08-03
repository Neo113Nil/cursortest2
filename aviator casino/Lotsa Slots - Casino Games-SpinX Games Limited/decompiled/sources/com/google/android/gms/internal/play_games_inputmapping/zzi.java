package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public final class zzi extends com.google.android.gms.internal.play_games_inputmapping.zzfc implements com.google.android.gms.internal.play_games_inputmapping.zzgf {
    private static final com.google.android.gms.internal.play_games_inputmapping.zzi zzf;
    private java.lang.String zzb = "";
    private com.google.android.gms.internal.play_games_inputmapping.zzfh zze = zzt();

    static {
        com.google.android.gms.internal.play_games_inputmapping.zzi zziVar = new com.google.android.gms.internal.play_games_inputmapping.zzi();
        zzf = zziVar;
        com.google.android.gms.internal.play_games_inputmapping.zzfc.zzo(com.google.android.gms.internal.play_games_inputmapping.zzi.class, zziVar);
    }

    private zzi() {
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzh zza() {
        return (com.google.android.gms.internal.play_games_inputmapping.zzh) zzf.zzj();
    }

    static /* synthetic */ void zzc(com.google.android.gms.internal.play_games_inputmapping.zzi zziVar, java.lang.String str) {
        str.getClass();
        zziVar.zzb = str;
    }

    static /* synthetic */ void zzd(com.google.android.gms.internal.play_games_inputmapping.zzi zziVar, com.google.android.gms.internal.play_games_inputmapping.zzc zzcVar) {
        zzcVar.getClass();
        com.google.android.gms.internal.play_games_inputmapping.zzfh zzfhVar = zziVar.zze;
        if (!zzfhVar.zza()) {
            zziVar.zze = com.google.android.gms.internal.play_games_inputmapping.zzfc.zzu(zzfhVar);
        }
        zziVar.zze.add(zzcVar);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzfc
    protected final java.lang.Object zzf(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzp(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new java.lang.Object[]{"zzb", "zze", com.google.android.gms.internal.play_games_inputmapping.zzc.class});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_games_inputmapping.zzi();
        }
        com.google.android.gms.internal.play_games_inputmapping.zzg zzgVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_games_inputmapping.zzh(zzgVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzf;
    }
}
