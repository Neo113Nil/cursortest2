package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
class zzbn implements java.util.Iterator {
    final java.util.Iterator zza;
    final java.util.Collection zzb;
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_barcode.zzbo zzc;

    zzbn(com.google.android.gms.internal.mlkit_vision_barcode.zzbo zzboVar) {
        this.zzc = zzboVar;
        this.zzb = zzboVar.zzb;
        java.util.Collection collection = zzboVar.zzb;
        this.zza = collection instanceof java.util.List ? ((java.util.List) collection).listIterator() : collection.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        this.zza.remove();
        com.google.android.gms.internal.mlkit_vision_barcode.zzbr zzbrVar = this.zzc.zze;
        i = zzbrVar.zzb;
        zzbrVar.zzb = i - 1;
        this.zzc.zzc();
    }

    final void zza() {
        this.zzc.zzb();
        if (this.zzc.zzb != this.zzb) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    zzbn(com.google.android.gms.internal.mlkit_vision_barcode.zzbo zzboVar, java.util.Iterator it) {
        this.zzc = zzboVar;
        this.zzb = zzboVar.zzb;
        this.zza = it;
    }
}
