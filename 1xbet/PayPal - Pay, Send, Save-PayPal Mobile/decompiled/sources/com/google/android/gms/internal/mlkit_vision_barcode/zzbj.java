package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
abstract class zzbj implements java.util.Iterator {
    final java.util.Iterator zza;

    @javax.annotation.CheckForNull
    java.lang.Object zzb;

    @javax.annotation.CheckForNull
    java.util.Collection zzc;
    java.util.Iterator zzd;
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_barcode.zzbr zze;

    zzbj(com.google.android.gms.internal.mlkit_vision_barcode.zzbr zzbrVar) {
        java.util.Map map;
        this.zze = zzbrVar;
        map = zzbrVar.zza;
        this.zza = map.entrySet().iterator();
        this.zzb = null;
        this.zzc = null;
        this.zzd = com.google.android.gms.internal.mlkit_vision_barcode.zzcw.INSTANCE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzd.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!this.zzd.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) this.zza.next();
            this.zzb = entry.getKey();
            java.util.Collection collection = (java.util.Collection) entry.getValue();
            this.zzc = collection;
            this.zzd = collection.iterator();
        }
        return zza(this.zzb, this.zzd.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        this.zzd.remove();
        if (((java.util.Collection) java.util.Objects.requireNonNull(this.zzc)).isEmpty()) {
            this.zza.remove();
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzbr zzbrVar = this.zze;
        i = zzbrVar.zzb;
        zzbrVar.zzb = i - 1;
    }

    abstract java.lang.Object zza(java.lang.Object obj, java.lang.Object obj2);
}
