package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzcf extends java.util.AbstractSet {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_barcode.zzci zza;

    zzcf(com.google.android.gms.internal.mlkit_vision_barcode.zzci zzciVar) {
        this.zza = zzciVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzci zzciVar = this.zza;
        java.util.Map zzl = zzciVar.zzl();
        return zzl != null ? zzl.keySet().iterator() : new com.google.android.gms.internal.mlkit_vision_barcode.zzbz(zzciVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object obj) {
        java.lang.Object zzy;
        java.lang.Object obj2;
        java.util.Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.keySet().remove(obj);
        }
        zzy = this.zza.zzy(obj);
        obj2 = com.google.android.gms.internal.mlkit_vision_barcode.zzci.zzd;
        return zzy != obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
