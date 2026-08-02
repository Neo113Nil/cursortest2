package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
final class zzbq extends com.google.android.gms.internal.maps.zzbm {
    private final transient com.google.android.gms.internal.maps.zzbl zza;
    private final transient java.lang.Object[] zzb;
    private final transient int zzc;

    zzbq(com.google.android.gms.internal.maps.zzbl zzblVar, java.lang.Object[] objArr, int i, int i2) {
        this.zza = zzblVar;
        this.zzb = objArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.maps.zzbf, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object key = entry.getKey();
        java.lang.Object value = entry.getValue();
        return value != null && value.equals(this.zza.get(key));
    }

    @Override // com.google.android.gms.internal.maps.zzbm, com.google.android.gms.internal.maps.zzbf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return zzg().listIterator(0);
    }

    @Override // com.google.android.gms.internal.maps.zzbf
    final int zza(java.lang.Object[] objArr, int i) {
        return zzg().zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.maps.zzbm, com.google.android.gms.internal.maps.zzbf
    /* renamed from: zzd */
    public final com.google.android.gms.internal.maps.zzbx iterator() {
        return zzg().listIterator(0);
    }

    @Override // com.google.android.gms.internal.maps.zzbm
    final com.google.android.gms.internal.maps.zzbi zzh() {
        return new com.google.android.gms.internal.maps.zzbp(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }
}
