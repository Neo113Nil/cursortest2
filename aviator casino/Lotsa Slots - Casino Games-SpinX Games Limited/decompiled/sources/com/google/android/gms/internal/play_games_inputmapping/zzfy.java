package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public final class zzfy extends java.util.LinkedHashMap {
    private static final com.google.android.gms.internal.play_games_inputmapping.zzfy zzb;
    private boolean zza;

    static {
        com.google.android.gms.internal.play_games_inputmapping.zzfy zzfyVar = new com.google.android.gms.internal.play_games_inputmapping.zzfy();
        zzb = zzfyVar;
        zzfyVar.zza = false;
    }

    private zzfy() {
        this.zza = true;
    }

    private static int zze(java.lang.Object obj) {
        if (obj instanceof byte[]) {
            return com.google.android.gms.internal.play_games_inputmapping.zzfi.zzg((byte[]) obj);
        }
        if (obj instanceof com.google.android.gms.internal.play_games_inputmapping.zzfe) {
            throw new java.lang.UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private final void zzf() {
        if (!this.zza) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzf();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        return isEmpty() ? java.util.Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        java.util.Map map = (java.util.Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        java.util.Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            java.lang.Object value = entry.getValue();
            java.lang.Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? java.util.Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        java.util.Iterator it = entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            i += zze(entry.getValue()) ^ zze(entry.getKey());
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        zzf();
        com.google.android.gms.internal.play_games_inputmapping.zzfi.zza(obj);
        com.google.android.gms.internal.play_games_inputmapping.zzfi.zza(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        zzf();
        for (java.lang.Object obj : map.keySet()) {
            com.google.android.gms.internal.play_games_inputmapping.zzfi.zza(obj);
            com.google.android.gms.internal.play_games_inputmapping.zzfi.zza(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        zzf();
        return super.remove(obj);
    }

    public final void zza(com.google.android.gms.internal.play_games_inputmapping.zzfy zzfyVar) {
        zzf();
        if (zzfyVar.isEmpty()) {
            return;
        }
        putAll(zzfyVar);
    }

    public final com.google.android.gms.internal.play_games_inputmapping.zzfy zzb() {
        return isEmpty() ? new com.google.android.gms.internal.play_games_inputmapping.zzfy() : new com.google.android.gms.internal.play_games_inputmapping.zzfy(this);
    }

    public final void zzc() {
        this.zza = false;
    }

    public final boolean zzd() {
        return this.zza;
    }

    private zzfy(java.util.Map map) {
        super(map);
        this.zza = true;
    }
}
