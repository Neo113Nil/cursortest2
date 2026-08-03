package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public final class zzl extends com.google.android.gms.internal.play_games_inputmapping.zzfc implements com.google.android.gms.internal.play_games_inputmapping.zzgf {
    private static final com.google.android.gms.internal.play_games_inputmapping.zzl zzf;
    private com.google.android.gms.internal.play_games_inputmapping.zzfh zzb = zzt();
    private com.google.android.gms.internal.play_games_inputmapping.zzo zze;

    static {
        com.google.android.gms.internal.play_games_inputmapping.zzl zzlVar = new com.google.android.gms.internal.play_games_inputmapping.zzl();
        zzf = zzlVar;
        com.google.android.gms.internal.play_games_inputmapping.zzfc.zzo(com.google.android.gms.internal.play_games_inputmapping.zzl.class, zzlVar);
    }

    private zzl() {
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzk zza() {
        return (com.google.android.gms.internal.play_games_inputmapping.zzk) zzf.zzj();
    }

    static /* synthetic */ void zzc(com.google.android.gms.internal.play_games_inputmapping.zzl zzlVar, com.google.android.gms.internal.play_games_inputmapping.zzi zziVar) {
        zziVar.getClass();
        com.google.android.gms.internal.play_games_inputmapping.zzfh zzfhVar = zzlVar.zzb;
        if (!zzfhVar.zza()) {
            zzlVar.zzb = com.google.android.gms.internal.play_games_inputmapping.zzfc.zzu(zzfhVar);
        }
        zzlVar.zzb.add(zziVar);
    }

    static /* synthetic */ void zzd(com.google.android.gms.internal.play_games_inputmapping.zzl zzlVar, com.google.android.gms.internal.play_games_inputmapping.zzo zzoVar) {
        zzoVar.getClass();
        zzlVar.zze = zzoVar;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzfc
    protected final java.lang.Object zzf(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzp(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\t", new java.lang.Object[]{"zzb", com.google.android.gms.internal.play_games_inputmapping.zzi.class, "zze"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_games_inputmapping.zzl();
        }
        com.google.android.gms.internal.play_games_inputmapping.zzj zzjVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_games_inputmapping.zzk(zzjVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzf;
    }
}
