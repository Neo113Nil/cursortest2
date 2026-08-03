package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
class zzgux extends com.google.android.gms.internal.ads.zzgus implements java.util.SortedSet {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgvc zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgux(com.google.android.gms.internal.ads.zzgvc zzgvcVar, java.util.SortedMap sortedMap) {
        super(zzgvcVar, sortedMap);
        java.util.Objects.requireNonNull(zzgvcVar);
        this.zzc = zzgvcVar;
    }

    @Override // java.util.SortedSet
    public final java.util.Comparator comparator() {
        return zza().comparator();
    }

    @Override // java.util.SortedSet
    public final java.lang.Object first() {
        return zza().firstKey();
    }

    public java.util.SortedSet headSet(java.lang.Object obj) {
        return new com.google.android.gms.internal.ads.zzgux(this.zzc, zza().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final java.lang.Object last() {
        return zza().lastKey();
    }

    public java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        return new com.google.android.gms.internal.ads.zzgux(this.zzc, zza().subMap(obj, obj2));
    }

    public java.util.SortedSet tailSet(java.lang.Object obj) {
        return new com.google.android.gms.internal.ads.zzgux(this.zzc, zza().tailMap(obj));
    }

    java.util.SortedMap zza() {
        return (java.util.SortedMap) this.zzd;
    }
}
