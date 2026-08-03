package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
class zzguw extends com.google.android.gms.internal.ads.zzgup implements java.util.SortedMap {
    java.util.SortedSet zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzgvc zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzguw(com.google.android.gms.internal.ads.zzgvc zzgvcVar, java.util.SortedMap sortedMap) {
        super(zzgvcVar, sortedMap);
        java.util.Objects.requireNonNull(zzgvcVar);
        this.zze = zzgvcVar;
    }

    @Override // java.util.SortedMap
    public final java.util.Comparator comparator() {
        return zzg().comparator();
    }

    @Override // java.util.SortedMap
    public final java.lang.Object firstKey() {
        return zzg().firstKey();
    }

    public java.util.SortedMap headMap(java.lang.Object obj) {
        return new com.google.android.gms.internal.ads.zzguw(this.zze, zzg().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final java.lang.Object lastKey() {
        return zzg().lastKey();
    }

    public java.util.SortedMap subMap(java.lang.Object obj, java.lang.Object obj2) {
        return new com.google.android.gms.internal.ads.zzguw(this.zze, zzg().subMap(obj, obj2));
    }

    public java.util.SortedMap tailMap(java.lang.Object obj) {
        return new com.google.android.gms.internal.ads.zzguw(this.zze, zzg().tailMap(obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgxs
    /* renamed from: zze */
    public java.util.SortedSet zzh() {
        return new com.google.android.gms.internal.ads.zzgux(this.zze, zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzgup, com.google.android.gms.internal.ads.zzgxs, java.util.AbstractMap, java.util.Map
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public java.util.SortedSet keySet() {
        java.util.SortedSet sortedSet = this.zzd;
        if (sortedSet != null) {
            return sortedSet;
        }
        java.util.SortedSet zzh = zzh();
        this.zzd = zzh;
        return zzh;
    }

    java.util.SortedMap zzg() {
        return (java.util.SortedMap) this.zza;
    }
}
