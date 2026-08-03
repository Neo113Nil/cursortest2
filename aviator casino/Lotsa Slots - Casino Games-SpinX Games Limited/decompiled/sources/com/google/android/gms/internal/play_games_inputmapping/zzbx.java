package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzbx extends com.google.android.gms.internal.play_games_inputmapping.zzby {
    private final java.util.Map zza;

    /* synthetic */ zzbx(com.google.android.gms.internal.play_games_inputmapping.zzbg zzbgVar, com.google.android.gms.internal.play_games_inputmapping.zzbg zzbgVar2, com.google.android.gms.internal.play_games_inputmapping.zzbs zzbsVar) {
        super(null);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        zzd(linkedHashMap, zzbgVar);
        zzd(linkedHashMap, zzbgVar2);
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            if (((com.google.android.gms.internal.play_games_inputmapping.zzar) entry.getKey()).zzf()) {
                entry.setValue(java.util.Collections.unmodifiableList((java.util.List) entry.getValue()));
            }
        }
        this.zza = java.util.Collections.unmodifiableMap(linkedHashMap);
    }

    private static void zzd(java.util.Map map, com.google.android.gms.internal.play_games_inputmapping.zzbg zzbgVar) {
        for (int i = 0; i < zzbgVar.zza(); i++) {
            com.google.android.gms.internal.play_games_inputmapping.zzar zzb = zzbgVar.zzb(i);
            java.lang.Object obj = map.get(zzb);
            if (zzb.zzf()) {
                java.util.List list = (java.util.List) obj;
                if (list == null) {
                    list = new java.util.ArrayList();
                    map.put(zzb, list);
                }
                list.add(zzb.zze(zzbgVar.zzc(i)));
            } else {
                map.put(zzb, zzb.zze(zzbgVar.zzc(i)));
            }
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzby
    public final void zza(com.google.android.gms.internal.play_games_inputmapping.zzbo zzboVar, java.lang.Object obj) {
        for (java.util.Map.Entry entry : this.zza.entrySet()) {
            com.google.android.gms.internal.play_games_inputmapping.zzar zzarVar = (com.google.android.gms.internal.play_games_inputmapping.zzar) entry.getKey();
            java.lang.Object value = entry.getValue();
            if (zzarVar.zzf()) {
                zzboVar.zzb(zzarVar, ((java.util.List) value).iterator(), obj);
            } else {
                zzboVar.zza(zzarVar, value, obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzby
    public final int zzb() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzby
    public final java.util.Set zzc() {
        return this.zza.keySet();
    }
}
