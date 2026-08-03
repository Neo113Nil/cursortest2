package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public abstract class zzai {
    private final java.util.concurrent.ConcurrentHashMap zza = new java.util.concurrent.ConcurrentHashMap();

    protected zzai() {
    }

    protected abstract java.lang.Object zza();

    public final java.lang.Object zzb(com.google.android.gms.internal.play_games_inputmapping.zzag zzagVar, com.google.android.gms.internal.play_games_inputmapping.zzbg zzbgVar) {
        java.lang.Object obj = this.zza.get(zzagVar);
        if (obj != null) {
            return obj;
        }
        java.lang.Object zza = zza();
        java.lang.Object putIfAbsent = this.zza.putIfAbsent(zzagVar, zza);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        int zza2 = zzbgVar.zza();
        com.google.android.gms.internal.play_games_inputmapping.zzah zzahVar = null;
        for (int i = 0; i < zza2; i++) {
            if (com.google.android.gms.internal.play_games_inputmapping.zzaa.zzd.equals(zzbgVar.zzb(i))) {
                java.lang.Object zzc = zzbgVar.zzc(i);
                if (zzc instanceof com.google.android.gms.internal.play_games_inputmapping.zzap) {
                    if (zzahVar == null) {
                        zzahVar = new com.google.android.gms.internal.play_games_inputmapping.zzah(this, zzagVar);
                    }
                    ((com.google.android.gms.internal.play_games_inputmapping.zzap) zzc).zza();
                }
            }
        }
        return zza;
    }
}
