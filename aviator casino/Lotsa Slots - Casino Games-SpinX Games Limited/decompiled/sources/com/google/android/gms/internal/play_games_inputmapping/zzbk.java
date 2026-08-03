package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public final class zzbk {
    private static final com.google.android.gms.internal.play_games_inputmapping.zzbn zza = new com.google.android.gms.internal.play_games_inputmapping.zzbi();
    private static final com.google.android.gms.internal.play_games_inputmapping.zzbm zzb = new com.google.android.gms.internal.play_games_inputmapping.zzbj();
    private final com.google.android.gms.internal.play_games_inputmapping.zzbn zze;
    private final java.util.Map zzc = new java.util.HashMap();
    private final java.util.Map zzd = new java.util.HashMap();
    private com.google.android.gms.internal.play_games_inputmapping.zzbm zzf = null;

    public final com.google.android.gms.internal.play_games_inputmapping.zzbk zza(com.google.android.gms.internal.play_games_inputmapping.zzbm zzbmVar) {
        this.zzf = zzbmVar;
        return this;
    }

    final void zzb(com.google.android.gms.internal.play_games_inputmapping.zzar zzarVar) {
        com.google.android.gms.internal.play_games_inputmapping.zzds.zza(zzarVar, com.ironsource.X3.i.W);
        if (!zzarVar.zzf()) {
            com.google.android.gms.internal.play_games_inputmapping.zzbn zzbnVar = zza;
            com.google.android.gms.internal.play_games_inputmapping.zzds.zza(zzarVar, com.ironsource.X3.i.W);
            this.zzd.remove(zzarVar);
            this.zzc.put(zzarVar, zzbnVar);
            return;
        }
        com.google.android.gms.internal.play_games_inputmapping.zzbm zzbmVar = zzb;
        com.google.android.gms.internal.play_games_inputmapping.zzds.zza(zzarVar, com.ironsource.X3.i.W);
        com.google.android.gms.internal.play_games_inputmapping.zzds.zzb(zzarVar.zzf(), "key must be repeating");
        this.zzc.remove(zzarVar);
        this.zzd.put(zzarVar, zzbmVar);
    }

    public final com.google.android.gms.internal.play_games_inputmapping.zzbo zzc() {
        return new com.google.android.gms.internal.play_games_inputmapping.zzbl(this, null);
    }
}
