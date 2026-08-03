package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgut extends com.google.android.gms.internal.ads.zzguw implements java.util.NavigableMap {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgvc zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgut(com.google.android.gms.internal.ads.zzgvc zzgvcVar, java.util.NavigableMap navigableMap) {
        super(zzgvcVar, navigableMap);
        java.util.Objects.requireNonNull(zzgvcVar);
        this.zzc = zzgvcVar;
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry ceilingEntry(java.lang.Object obj) {
        java.util.Map.Entry ceilingEntry = ((java.util.NavigableMap) ((java.util.SortedMap) this.zza)).ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return zzb(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final java.lang.Object ceilingKey(java.lang.Object obj) {
        return ((java.util.NavigableMap) ((java.util.SortedMap) this.zza)).ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableSet descendingKeySet() {
        return (java.util.NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableMap descendingMap() {
        return new com.google.android.gms.internal.ads.zzgut(this.zzc, ((java.util.NavigableMap) ((java.util.SortedMap) this.zza)).descendingMap());
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry firstEntry() {
        java.util.Map.Entry firstEntry = ((java.util.NavigableMap) ((java.util.SortedMap) this.zza)).firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return zzb(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry floorEntry(java.lang.Object obj) {
        java.util.Map.Entry floorEntry = ((java.util.NavigableMap) ((java.util.SortedMap) this.zza)).floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return zzb(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final java.lang.Object floorKey(java.lang.Object obj) {
        return ((java.util.NavigableMap) ((java.util.SortedMap) this.zza)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzguw, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ java.util.SortedMap headMap(java.lang.Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry higherEntry(java.lang.Object obj) {
        java.util.Map.Entry higherEntry = ((java.util.NavigableMap) ((java.util.SortedMap) this.zza)).higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return zzb(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final java.lang.Object higherKey(java.lang.Object obj) {
        return ((java.util.NavigableMap) ((java.util.SortedMap) this.zza)).higherKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzguw, com.google.android.gms.internal.ads.zzgup, com.google.android.gms.internal.ads.zzgxs, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ java.util.Set keySet() {
        return (java.util.NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry lastEntry() {
        java.util.Map.Entry lastEntry = ((java.util.NavigableMap) ((java.util.SortedMap) this.zza)).lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return zzb(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry lowerEntry(java.lang.Object obj) {
        java.util.Map.Entry lowerEntry = ((java.util.NavigableMap) ((java.util.SortedMap) this.zza)).lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return zzb(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final java.lang.Object lowerKey(java.lang.Object obj) {
        return ((java.util.NavigableMap) ((java.util.SortedMap) this.zza)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableSet navigableKeySet() {
        return (java.util.NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry pollFirstEntry() {
        return zzc(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry pollLastEntry() {
        return zzc(descendingMap().entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.zzguw, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ java.util.SortedMap subMap(java.lang.Object obj, java.lang.Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzguw, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ java.util.SortedMap tailMap(java.lang.Object obj) {
        return tailMap(obj, true);
    }

    final java.util.Map.Entry zzc(java.util.Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
        com.google.android.gms.internal.ads.zzgvc zzgvcVar = this.zzc;
        java.util.Collection zzc = zzgvcVar.zzc();
        zzc.addAll((java.util.Collection) entry.getValue());
        it.remove();
        return new java.util.AbstractMap.SimpleImmutableEntry(entry.getKey(), zzgvcVar.zza(zzc));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzguw, com.google.android.gms.internal.ads.zzgxs
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final java.util.NavigableSet zzh() {
        return new com.google.android.gms.internal.ads.zzguu(this.zzc, (java.util.NavigableMap) ((java.util.SortedMap) this.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzguw
    /* renamed from: zzf */
    public final /* synthetic */ java.util.SortedSet keySet() {
        return (java.util.NavigableSet) super.keySet();
    }

    @Override // com.google.android.gms.internal.ads.zzguw
    final /* synthetic */ java.util.SortedMap zzg() {
        return (java.util.NavigableMap) ((java.util.SortedMap) this.zza);
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableMap headMap(java.lang.Object obj, boolean z) {
        return new com.google.android.gms.internal.ads.zzgut(this.zzc, ((java.util.NavigableMap) ((java.util.SortedMap) this.zza)).headMap(obj, z));
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableMap subMap(java.lang.Object obj, boolean z, java.lang.Object obj2, boolean z2) {
        return new com.google.android.gms.internal.ads.zzgut(this.zzc, ((java.util.NavigableMap) ((java.util.SortedMap) this.zza)).subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableMap tailMap(java.lang.Object obj, boolean z) {
        return new com.google.android.gms.internal.ads.zzgut(this.zzc, ((java.util.NavigableMap) ((java.util.SortedMap) this.zza)).tailMap(obj, z));
    }
}
