package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzbg extends com.google.android.gms.internal.mlkit_vision_barcode.zzdb {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_barcode.zzbi zza;

    zzbg(com.google.android.gms.internal.mlkit_vision_barcode.zzbi zzbiVar) {
        this.zza = zzbiVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdb, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        java.util.Set entrySet = this.zza.zza.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzbh(this.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdb, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (!contains(obj)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) java.util.Objects.requireNonNull((java.util.Map.Entry) obj);
        com.google.android.gms.internal.mlkit_vision_barcode.zzbi zzbiVar = this.zza;
        com.google.android.gms.internal.mlkit_vision_barcode.zzbr.zzr(zzbiVar.zzb, entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdb
    final java.util.Map zza() {
        return this.zza;
    }
}
