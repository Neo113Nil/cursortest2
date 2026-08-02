package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
final class zzbw extends com.google.android.gms.internal.maps.zzbm {
    final transient java.lang.Object zza;

    zzbw(java.lang.Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.maps.zzbf, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.maps.zzbm, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        return "[" + this.zza.toString() + "]";
    }

    @Override // com.google.android.gms.internal.maps.zzbf
    final int zza(java.lang.Object[] objArr, int i) {
        objArr[0] = this.zza;
        return 1;
    }

    @Override // com.google.android.gms.internal.maps.zzbm, com.google.android.gms.internal.maps.zzbf
    /* renamed from: zzd */
    public final com.google.android.gms.internal.maps.zzbx iterator() {
        return new com.google.android.gms.internal.maps.zzbn(this.zza);
    }

    @Override // com.google.android.gms.internal.maps.zzbm, com.google.android.gms.internal.maps.zzbf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return new com.google.android.gms.internal.maps.zzbn(this.zza);
    }
}
