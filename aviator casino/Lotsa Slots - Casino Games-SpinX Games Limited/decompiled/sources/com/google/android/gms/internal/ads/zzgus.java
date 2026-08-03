package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
class zzgus extends com.google.android.gms.internal.ads.zzgxq {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgvc zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgus(com.google.android.gms.internal.ads.zzgvc zzgvcVar, java.util.Map map) {
        super(map);
        java.util.Objects.requireNonNull(zzgvcVar);
        this.zza = zzgvcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxq, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        com.google.android.gms.internal.ads.zzgxf.zzb(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection collection) {
        return this.zzd.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        return this == obj || this.zzd.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zzd.keySet().hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.ads.zzgur(this, this.zzd.entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.zzgxq, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        java.util.Collection collection = (java.util.Collection) this.zzd.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        com.google.android.gms.internal.ads.zzgvc zzgvcVar = this.zza;
        zzgvcVar.zzq(zzgvcVar.zzp() - size);
        return size > 0;
    }
}
