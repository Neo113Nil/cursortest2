package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
class zzgz extends java.util.AbstractMap {
    private final int zza;
    private boolean zzd;
    private volatile com.google.android.gms.internal.play_games_inputmapping.zzgy zze;
    private java.util.List zzb = java.util.Collections.emptyList();
    private java.util.Map zzc = java.util.Collections.emptyMap();
    private java.util.Map zzf = java.util.Collections.emptyMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object zzg(int i) {
        zzh();
        java.lang.Object value = ((com.google.android.gms.internal.play_games_inputmapping.zzgw) this.zzb.remove(i)).getValue();
        if (!this.zzc.isEmpty()) {
            java.util.Iterator it = zzn().entrySet().iterator();
            java.util.List list = this.zzb;
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            list.add(new com.google.android.gms.internal.play_games_inputmapping.zzgw(this, (java.lang.Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    private final int zzl(java.lang.Comparable comparable) {
        int size = this.zzb.size();
        int i = size - 1;
        int i2 = 0;
        if (i >= 0) {
            int compareTo = comparable.compareTo(((com.google.android.gms.internal.play_games_inputmapping.zzgw) this.zzb.get(i)).zza());
            if (compareTo > 0) {
                return -(size + 1);
            }
            if (compareTo == 0) {
                return i;
            }
        }
        while (i2 <= i) {
            int i3 = (i2 + i) / 2;
            int compareTo2 = comparable.compareTo(((com.google.android.gms.internal.play_games_inputmapping.zzgw) this.zzb.get(i3)).zza());
            if (compareTo2 < 0) {
                i = i3 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzh() {
        if (this.zzd) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private final java.util.SortedMap zzn() {
        zzh();
        if (this.zzc.isEmpty() && !(this.zzc instanceof java.util.TreeMap)) {
            java.util.TreeMap treeMap = new java.util.TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (java.util.SortedMap) this.zzc;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzh();
        if (!this.zzb.isEmpty()) {
            this.zzb.clear();
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return zzl(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        if (this.zze == null) {
            this.zze = new com.google.android.gms.internal.play_games_inputmapping.zzgy(this, null);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.play_games_inputmapping.zzgz)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.play_games_inputmapping.zzgz zzgzVar = (com.google.android.gms.internal.play_games_inputmapping.zzgz) obj;
        int size = size();
        if (size != zzgzVar.size()) {
            return false;
        }
        int zzc = zzc();
        if (zzc != zzgzVar.zzc()) {
            return entrySet().equals(zzgzVar.entrySet());
        }
        for (int i = 0; i < zzc; i++) {
            if (!zzd(i).equals(zzgzVar.zzd(i))) {
                return false;
            }
        }
        if (zzc != size) {
            return this.zzc.equals(zzgzVar.zzc);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int zzl = zzl(comparable);
        return zzl >= 0 ? ((com.google.android.gms.internal.play_games_inputmapping.zzgw) this.zzb.get(zzl)).getValue() : this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int zzc = zzc();
        int i = 0;
        for (int i2 = 0; i2 < zzc; i2++) {
            i += ((com.google.android.gms.internal.play_games_inputmapping.zzgw) this.zzb.get(i2)).hashCode();
        }
        return this.zzc.size() > 0 ? i + this.zzc.hashCode() : i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        zzh();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int zzl = zzl(comparable);
        if (zzl >= 0) {
            return zzg(zzl);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb.size() + this.zzc.size();
    }

    public void zza() {
        if (this.zzd) {
            return;
        }
        this.zzc = this.zzc.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(this.zzc);
        this.zzf = this.zzf.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(this.zzf);
        this.zzd = true;
    }

    public final boolean zzb() {
        return this.zzd;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    public final java.util.Map.Entry zzd(int i) {
        return (java.util.Map.Entry) this.zzb.get(i);
    }

    public final java.lang.Iterable zze() {
        return this.zzc.isEmpty() ? com.google.android.gms.internal.play_games_inputmapping.zzgv.zza() : this.zzc.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object put(java.lang.Comparable comparable, java.lang.Object obj) {
        zzh();
        int zzl = zzl(comparable);
        if (zzl >= 0) {
            return ((com.google.android.gms.internal.play_games_inputmapping.zzgw) this.zzb.get(zzl)).setValue(obj);
        }
        zzh();
        if (this.zzb.isEmpty() && !(this.zzb instanceof java.util.ArrayList)) {
            this.zzb = new java.util.ArrayList(this.zza);
        }
        int i = -(zzl + 1);
        if (i >= this.zza) {
            return zzn().put(comparable, obj);
        }
        int size = this.zzb.size();
        int i2 = this.zza;
        if (size == i2) {
            com.google.android.gms.internal.play_games_inputmapping.zzgw zzgwVar = (com.google.android.gms.internal.play_games_inputmapping.zzgw) this.zzb.remove(i2 - 1);
            zzn().put(zzgwVar.zza(), zzgwVar.getValue());
        }
        this.zzb.add(i, new com.google.android.gms.internal.play_games_inputmapping.zzgw(this, comparable, obj));
        return null;
    }

    final /* synthetic */ java.util.List zzi() {
        return this.zzb;
    }

    final /* synthetic */ java.util.Map zzj() {
        return this.zzc;
    }
}
