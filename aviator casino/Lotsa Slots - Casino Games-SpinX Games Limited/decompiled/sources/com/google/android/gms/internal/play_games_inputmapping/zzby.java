package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public abstract class zzby {
    private static final com.google.android.gms.internal.play_games_inputmapping.zzby zza = new com.google.android.gms.internal.play_games_inputmapping.zzbs();

    /* synthetic */ zzby(com.google.android.gms.internal.play_games_inputmapping.zzbs zzbsVar) {
    }

    public abstract void zza(com.google.android.gms.internal.play_games_inputmapping.zzbo zzboVar, java.lang.Object obj);

    public abstract int zzb();

    public abstract java.util.Set zzc();

    public static com.google.android.gms.internal.play_games_inputmapping.zzby zzh(com.google.android.gms.internal.play_games_inputmapping.zzbg zzbgVar, com.google.android.gms.internal.play_games_inputmapping.zzbg zzbgVar2) {
        int zza2 = zzbgVar2.zza();
        if (zza2 == 0) {
            return zza;
        }
        com.google.android.gms.internal.play_games_inputmapping.zzbs zzbsVar = null;
        return zza2 <= 28 ? new com.google.android.gms.internal.play_games_inputmapping.zzbw(zzbgVar, zzbgVar2, zzbsVar) : new com.google.android.gms.internal.play_games_inputmapping.zzbx(zzbgVar, zzbgVar2, zzbsVar);
    }
}
