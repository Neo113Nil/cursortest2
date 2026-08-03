package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public final class zzce {
    private static final java.util.Set zza;
    private static final com.google.android.gms.internal.play_games_inputmapping.zzbb zzb;

    static {
        java.util.Set singleton = java.util.Collections.singleton(com.google.android.gms.internal.play_games_inputmapping.zzaa.zza);
        zza = singleton;
        zzb = new com.google.android.gms.internal.play_games_inputmapping.zzcd(singleton);
    }

    public static java.lang.StringBuilder zza(com.google.android.gms.internal.play_games_inputmapping.zzby zzbyVar, com.google.android.gms.internal.play_games_inputmapping.zzbo zzboVar, java.lang.StringBuilder sb) {
        com.google.android.gms.internal.play_games_inputmapping.zzaz zzazVar = new com.google.android.gms.internal.play_games_inputmapping.zzaz("[CONTEXT ", " ]", sb);
        zzbyVar.zza(zzboVar, zzazVar);
        zzazVar.zzb();
        return sb;
    }

    public static java.lang.String zzb(com.google.android.gms.internal.play_games_inputmapping.zzba zzbaVar) {
        return com.google.android.gms.internal.play_games_inputmapping.zzbe.zza(zzbaVar.zzj());
    }

    public static boolean zzc(com.google.android.gms.internal.play_games_inputmapping.zzba zzbaVar, com.google.android.gms.internal.play_games_inputmapping.zzby zzbyVar, java.util.Set set) {
        return (zzbaVar.zzh() == null && zzbyVar.zzb() <= set.size() && set.containsAll(zzbyVar.zzc())) ? false : true;
    }
}
