package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzbl extends com.google.android.gms.internal.play_games_inputmapping.zzbo {
    private final java.util.Map zza;
    private final java.util.Map zzb;
    private final com.google.android.gms.internal.play_games_inputmapping.zzbn zzc;
    private final com.google.android.gms.internal.play_games_inputmapping.zzbm zzd;

    /* synthetic */ zzbl(com.google.android.gms.internal.play_games_inputmapping.zzbk zzbkVar, com.google.android.gms.internal.play_games_inputmapping.zzbh zzbhVar) {
        java.util.Map map;
        java.util.Map map2;
        com.google.android.gms.internal.play_games_inputmapping.zzbn zzbnVar;
        com.google.android.gms.internal.play_games_inputmapping.zzbm zzbmVar;
        java.util.HashMap hashMap = new java.util.HashMap();
        this.zza = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        this.zzb = hashMap2;
        map = zzbkVar.zzc;
        hashMap.putAll(map);
        map2 = zzbkVar.zzd;
        hashMap2.putAll(map2);
        zzbnVar = zzbkVar.zze;
        this.zzc = zzbnVar;
        zzbmVar = zzbkVar.zzf;
        this.zzd = zzbmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_games_inputmapping.zzbo
    protected final void zza(com.google.android.gms.internal.play_games_inputmapping.zzar zzarVar, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.play_games_inputmapping.zzbn zzbnVar = (com.google.android.gms.internal.play_games_inputmapping.zzbn) this.zza.get(zzarVar);
        if (zzbnVar != null) {
            zzbnVar.zza(zzarVar, obj, obj2);
        } else {
            zzarVar.zzg(obj, obj2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_games_inputmapping.zzbo
    protected final void zzb(com.google.android.gms.internal.play_games_inputmapping.zzar zzarVar, java.util.Iterator it, java.lang.Object obj) {
        com.google.android.gms.internal.play_games_inputmapping.zzbm zzbmVar = (com.google.android.gms.internal.play_games_inputmapping.zzbm) this.zzb.get(zzarVar);
        if (zzbmVar != null) {
            zzbmVar.zza(zzarVar, it, obj);
        } else if (this.zzd != null && !this.zza.containsKey(zzarVar)) {
            zzarVar.zzh(it, obj);
        } else {
            while (it.hasNext()) {
                zza(zzarVar, it.next(), obj);
            }
        }
    }
}
