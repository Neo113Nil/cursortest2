package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzbi extends com.google.android.gms.internal.mlkit_vision_barcode.zzde {
    final transient java.util.Map zza;
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_barcode.zzbr zzb;

    zzbi(com.google.android.gms.internal.mlkit_vision_barcode.zzbr zzbrVar, java.util.Map map) {
        this.zzb = zzbrVar;
        this.zza = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        java.util.Map map;
        com.google.android.gms.internal.mlkit_vision_barcode.zzbr zzbrVar = this.zzb;
        java.util.Map map2 = this.zza;
        map = zzbrVar.zza;
        if (map2 == map) {
            zzbrVar.zzs();
        } else {
            com.google.android.gms.internal.mlkit_vision_barcode.zzcx.zza(new com.google.android.gms.internal.mlkit_vision_barcode.zzbh(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@javax.annotation.CheckForNull java.lang.Object obj) {
        return com.google.android.gms.internal.mlkit_vision_barcode.zzdf.zzb(this.zza, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        return this == obj || this.zza.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzde, java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
        return this.zzb.zzw();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @javax.annotation.CheckForNull
    public final /* synthetic */ java.lang.Object remove(@javax.annotation.CheckForNull java.lang.Object obj) {
        int i;
        java.util.Collection collection = (java.util.Collection) this.zza.remove(obj);
        if (collection == null) {
            return null;
        }
        java.util.Collection zza = this.zzb.zza();
        zza.addAll(collection);
        com.google.android.gms.internal.mlkit_vision_barcode.zzbr zzbrVar = this.zzb;
        i = zzbrVar.zzb;
        zzbrVar.zzb = i - collection.size();
        collection.clear();
        return zza;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zza.size();
    }

    @Override // java.util.AbstractMap
    public final java.lang.String toString() {
        return this.zza.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @javax.annotation.CheckForNull
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final java.util.Collection get(@javax.annotation.CheckForNull java.lang.Object obj) {
        java.util.Collection collection = (java.util.Collection) com.google.android.gms.internal.mlkit_vision_barcode.zzdf.zza(this.zza, obj);
        if (collection == null) {
            return null;
        }
        return this.zzb.zzd(obj, collection);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzde
    protected final java.util.Set zzb() {
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzbg(this);
    }
}
