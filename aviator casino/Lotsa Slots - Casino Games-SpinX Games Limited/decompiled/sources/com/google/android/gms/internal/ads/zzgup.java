package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
class zzgup extends com.google.android.gms.internal.ads.zzgxs {
    final transient java.util.Map zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzgvc zzb;

    zzgup(com.google.android.gms.internal.ads.zzgvc zzgvcVar, java.util.Map map) {
        java.util.Objects.requireNonNull(zzgvcVar);
        this.zzb = zzgvcVar;
        this.zza = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        com.google.android.gms.internal.ads.zzgvc zzgvcVar = this.zzb;
        if (this.zza == zzgvcVar.zzo()) {
            zzgvcVar.zzf();
        } else {
            com.google.android.gms.internal.ads.zzgxf.zzb(new com.google.android.gms.internal.ads.zzguo(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        java.util.Map map = this.zza;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        return this == obj || this.zza.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        java.util.Collection collection = (java.util.Collection) com.google.android.gms.internal.ads.zzgxt.zza(this.zza, obj);
        if (collection == null) {
            return null;
        }
        return this.zzb.zzb(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzgxs, java.util.AbstractMap, java.util.Map
    public java.util.Set keySet() {
        return this.zzb.zzs();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object remove(java.lang.Object obj) {
        java.util.Collection collection = (java.util.Collection) this.zza.remove(obj);
        if (collection == null) {
            return null;
        }
        com.google.android.gms.internal.ads.zzgvc zzgvcVar = this.zzb;
        java.util.Collection zzc = zzgvcVar.zzc();
        zzc.addAll(collection);
        zzgvcVar.zzq(zzgvcVar.zzp() - collection.size());
        collection.clear();
        return zzc;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zza.size();
    }

    @Override // java.util.AbstractMap
    public final java.lang.String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgxs
    protected final java.util.Set zza() {
        return new com.google.android.gms.internal.ads.zzgun(this);
    }

    final java.util.Map.Entry zzb(java.util.Map.Entry entry) {
        java.lang.Object key = entry.getKey();
        return new java.util.AbstractMap.SimpleImmutableEntry(key, this.zzb.zzb(key, (java.util.Collection) entry.getValue()));
    }
}
