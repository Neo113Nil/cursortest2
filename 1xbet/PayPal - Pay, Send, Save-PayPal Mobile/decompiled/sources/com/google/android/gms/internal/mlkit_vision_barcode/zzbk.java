package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzbk implements java.util.Iterator {

    @javax.annotation.CheckForNull
    java.util.Map.Entry zza;
    final /* synthetic */ java.util.Iterator zzb;
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_barcode.zzbl zzc;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.util.Map.Entry entry = (java.util.Map.Entry) this.zzb.next();
        this.zza = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        com.google.android.gms.internal.mlkit_vision_barcode.zzaz.zzf(this.zza != null, "no calls to next() since the last call to remove()");
        java.util.Collection collection = (java.util.Collection) this.zza.getValue();
        this.zzb.remove();
        com.google.android.gms.internal.mlkit_vision_barcode.zzbr zzbrVar = this.zzc.zza;
        i = zzbrVar.zzb;
        zzbrVar.zzb = i - collection.size();
        collection.clear();
        this.zza = null;
    }

    zzbk(com.google.android.gms.internal.mlkit_vision_barcode.zzbl zzblVar, java.util.Iterator it) {
        this.zzb = it;
        this.zzc = zzblVar;
    }
}
