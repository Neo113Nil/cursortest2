package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzbh implements java.util.Iterator {
    final java.util.Iterator zza;

    @javax.annotation.CheckForNull
    java.util.Collection zzb;
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_barcode.zzbi zzc;

    zzbh(com.google.android.gms.internal.mlkit_vision_barcode.zzbi zzbiVar) {
        this.zzc = zzbiVar;
        this.zza = zzbiVar.zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        java.util.Map.Entry entry = (java.util.Map.Entry) this.zza.next();
        this.zzb = (java.util.Collection) entry.getValue();
        java.lang.Object key = entry.getKey();
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzco(key, this.zzc.zzb.zzd(key, (java.util.Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        com.google.android.gms.internal.mlkit_vision_barcode.zzaz.zzf(this.zzb != null, "no calls to next() since the last call to remove()");
        this.zza.remove();
        com.google.android.gms.internal.mlkit_vision_barcode.zzbr zzbrVar = this.zzc.zzb;
        i = zzbrVar.zzb;
        zzbrVar.zzb = i - this.zzb.size();
        this.zzb.clear();
        this.zzb = null;
    }
}
