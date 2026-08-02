package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzch extends java.util.AbstractCollection {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_barcode.zzci zza;

    zzch(com.google.android.gms.internal.mlkit_vision_barcode.zzci zzciVar) {
        this.zza = zzciVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzci zzciVar = this.zza;
        java.util.Map zzl = zzciVar.zzl();
        return zzl != null ? zzl.values().iterator() : new com.google.android.gms.internal.mlkit_vision_barcode.zzcb(zzciVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}
