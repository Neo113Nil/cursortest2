package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzcc extends java.util.AbstractSet {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_barcode.zzci zza;

    zzcc(com.google.android.gms.internal.mlkit_vision_barcode.zzci zzciVar) {
        this.zza = zzciVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        int zzw;
        java.util.Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().contains(obj);
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        zzw = this.zza.zzw(entry.getKey());
        return zzw != -1 && com.google.android.gms.internal.mlkit_vision_barcode.zzax.zza(com.google.android.gms.internal.mlkit_vision_barcode.zzci.zzj(this.zza, zzw), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzci zzciVar = this.zza;
        java.util.Map zzl = zzciVar.zzl();
        return zzl != null ? zzl.entrySet().iterator() : new com.google.android.gms.internal.mlkit_vision_barcode.zzca(zzciVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object obj) {
        int zzv;
        java.lang.Object requireNonNull;
        int[] zzA;
        java.lang.Object[] zzB;
        java.lang.Object[] zzC;
        int i;
        java.util.Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().remove(obj);
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        com.google.android.gms.internal.mlkit_vision_barcode.zzci zzciVar = this.zza;
        if (zzciVar.zzr()) {
            return false;
        }
        zzv = zzciVar.zzv();
        java.lang.Object key = entry.getKey();
        java.lang.Object value = entry.getValue();
        com.google.android.gms.internal.mlkit_vision_barcode.zzci zzciVar2 = this.zza;
        requireNonNull = java.util.Objects.requireNonNull(zzciVar2.zze);
        zzA = zzciVar2.zzA();
        zzB = zzciVar2.zzB();
        zzC = zzciVar2.zzC();
        int zzb = com.google.android.gms.internal.mlkit_vision_barcode.zzcj.zzb(key, value, zzv, requireNonNull, zzA, zzB, zzC);
        if (zzb == -1) {
            return false;
        }
        this.zza.zzq(zzb, zzv);
        com.google.android.gms.internal.mlkit_vision_barcode.zzci zzciVar3 = this.zza;
        i = zzciVar3.zzg;
        zzciVar3.zzg = i - 1;
        this.zza.zzo();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
