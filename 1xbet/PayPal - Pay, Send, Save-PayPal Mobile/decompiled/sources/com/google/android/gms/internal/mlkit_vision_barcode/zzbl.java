package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzbl extends com.google.android.gms.internal.mlkit_vision_barcode.zzdc {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_barcode.zzbr zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbl(com.google.android.gms.internal.mlkit_vision_barcode.zzbr zzbrVar, java.util.Map map) {
        super(map);
        this.zza = zzbrVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdc, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzcx.zza(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection collection) {
        return this.zzb.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        return this == obj || this.zzb.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zzb.keySet().hashCode();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdc, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzbk(this, this.zzb.entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdc, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object obj) {
        int i;
        java.util.Collection collection = (java.util.Collection) this.zzb.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        com.google.android.gms.internal.mlkit_vision_barcode.zzbr zzbrVar = this.zza;
        i = zzbrVar.zzb;
        zzbrVar.zzb = i - size;
        return size > 0;
    }
}
