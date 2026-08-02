package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
final class zzbr extends com.google.android.gms.internal.maps.zzbm {
    private final transient com.google.android.gms.internal.maps.zzbl zza;
    private final transient com.google.android.gms.internal.maps.zzbi zzb;

    zzbr(com.google.android.gms.internal.maps.zzbl zzblVar, com.google.android.gms.internal.maps.zzbi zzbiVar) {
        this.zza = zzblVar;
        this.zzb = zzbiVar;
    }

    @Override // com.google.android.gms.internal.maps.zzbf, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.maps.zzbm, com.google.android.gms.internal.maps.zzbf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.maps.zzbf
    final int zza(java.lang.Object[] objArr, int i) {
        return this.zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.maps.zzbm, com.google.android.gms.internal.maps.zzbf
    /* renamed from: zzd */
    public final com.google.android.gms.internal.maps.zzbx iterator() {
        return this.zzb.listIterator(0);
    }
}
