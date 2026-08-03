package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzguu extends com.google.android.gms.internal.ads.zzgux implements java.util.NavigableSet {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgvc zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzguu(com.google.android.gms.internal.ads.zzgvc zzgvcVar, java.util.NavigableMap navigableMap) {
        super(zzgvcVar, navigableMap);
        java.util.Objects.requireNonNull(zzgvcVar);
        this.zzb = zzgvcVar;
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object ceiling(java.lang.Object obj) {
        return ((java.util.NavigableMap) ((java.util.SortedMap) this.zzd)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final java.util.Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet descendingSet() {
        return new com.google.android.gms.internal.ads.zzguu(this.zzb, ((java.util.NavigableMap) ((java.util.SortedMap) this.zzd)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object floor(java.lang.Object obj) {
        return ((java.util.NavigableMap) ((java.util.SortedMap) this.zzd)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgux, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ java.util.SortedSet headSet(java.lang.Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object higher(java.lang.Object obj) {
        return ((java.util.NavigableMap) ((java.util.SortedMap) this.zzd)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object lower(java.lang.Object obj) {
        return ((java.util.NavigableMap) ((java.util.SortedMap) this.zzd)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object pollFirst() {
        return com.google.android.gms.internal.ads.zzgxf.zza(iterator());
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object pollLast() {
        return com.google.android.gms.internal.ads.zzgxf.zza(descendingIterator());
    }

    @Override // com.google.android.gms.internal.ads.zzgux, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzgux, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ java.util.SortedSet tailSet(java.lang.Object obj) {
        return tailSet(obj, true);
    }

    @Override // com.google.android.gms.internal.ads.zzgux
    final /* synthetic */ java.util.SortedMap zza() {
        return (java.util.NavigableMap) ((java.util.SortedMap) this.zzd);
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet headSet(java.lang.Object obj, boolean z) {
        return new com.google.android.gms.internal.ads.zzguu(this.zzb, ((java.util.NavigableMap) ((java.util.SortedMap) this.zzd)).headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet subSet(java.lang.Object obj, boolean z, java.lang.Object obj2, boolean z2) {
        return new com.google.android.gms.internal.ads.zzguu(this.zzb, ((java.util.NavigableMap) ((java.util.SortedMap) this.zzd)).subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet tailSet(java.lang.Object obj, boolean z) {
        return new com.google.android.gms.internal.ads.zzguu(this.zzb, ((java.util.NavigableMap) ((java.util.SortedMap) this.zzd)).tailMap(obj, z));
    }
}
