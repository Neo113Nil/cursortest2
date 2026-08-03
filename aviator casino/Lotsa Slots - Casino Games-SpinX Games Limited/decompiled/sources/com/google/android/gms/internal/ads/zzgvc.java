package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
abstract class zzgvc extends com.google.android.gms.internal.ads.zzgvf implements java.io.Serializable {
    private final transient java.util.Map zza;
    private transient int zzb;

    protected zzgvc(java.util.Map map) {
        com.google.android.gms.internal.ads.zzgtj.zza(map.isEmpty());
        this.zza = map;
    }

    java.util.Collection zza(java.util.Collection collection) {
        throw null;
    }

    java.util.Collection zzb(java.lang.Object obj, java.util.Collection collection) {
        throw null;
    }

    abstract java.util.Collection zzc();

    @Override // com.google.android.gms.internal.ads.zzgxu
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgvf, com.google.android.gms.internal.ads.zzgxu
    public final boolean zze(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Map map = this.zza;
        java.util.Collection collection = (java.util.Collection) map.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.zzb++;
            return true;
        }
        java.util.Collection zzc = zzc();
        if (!zzc.add(obj2)) {
            throw new java.lang.AssertionError("New Collection violated the Collection spec");
        }
        this.zzb++;
        map.put(obj, zzc);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgxu
    public final void zzf() {
        java.util.Map map = this.zza;
        java.util.Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((java.util.Collection) it.next()).clear();
        }
        map.clear();
        this.zzb = 0;
    }

    final java.util.List zzg(java.lang.Object obj, java.util.List list, com.google.android.gms.internal.ads.zzguz zzguzVar) {
        return list instanceof java.util.RandomAccess ? new com.google.android.gms.internal.ads.zzguv(this, obj, list, zzguzVar) : new com.google.android.gms.internal.ads.zzgvb(this, obj, list, zzguzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgvf
    java.util.Set zzh() {
        throw null;
    }

    final java.util.Set zzi() {
        java.util.Map map = this.zza;
        return map instanceof java.util.NavigableMap ? new com.google.android.gms.internal.ads.zzguu(this, (java.util.NavigableMap) map) : map instanceof java.util.SortedMap ? new com.google.android.gms.internal.ads.zzgux(this, (java.util.SortedMap) map) : new com.google.android.gms.internal.ads.zzgus(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzgvf
    final java.util.Collection zzj() {
        return new com.google.android.gms.internal.ads.zzgve(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgvf
    final java.util.Iterator zzk() {
        return new com.google.android.gms.internal.ads.zzgum(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgvf
    java.util.Map zzl() {
        throw null;
    }

    final java.util.Map zzm() {
        java.util.Map map = this.zza;
        return map instanceof java.util.NavigableMap ? new com.google.android.gms.internal.ads.zzgut(this, (java.util.NavigableMap) map) : map instanceof java.util.SortedMap ? new com.google.android.gms.internal.ads.zzguw(this, (java.util.SortedMap) map) : new com.google.android.gms.internal.ads.zzgup(this, map);
    }

    final /* synthetic */ void zzn(java.lang.Object obj) {
        java.lang.Object obj2;
        try {
            obj2 = this.zza.remove(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            obj2 = null;
        }
        java.util.Collection collection = (java.util.Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.zzb -= size;
        }
    }

    final /* synthetic */ java.util.Map zzo() {
        return this.zza;
    }

    final /* synthetic */ int zzp() {
        return this.zzb;
    }

    final /* synthetic */ void zzq(int i) {
        this.zzb = i;
    }
}
