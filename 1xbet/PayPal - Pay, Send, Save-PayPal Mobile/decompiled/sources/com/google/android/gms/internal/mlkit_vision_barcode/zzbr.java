package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
abstract class zzbr extends com.google.android.gms.internal.mlkit_vision_barcode.zzbv implements java.io.Serializable {
    private final transient java.util.Map zza;
    private transient int zzb;

    protected zzbr(java.util.Map map) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzaz.zzd(map.isEmpty());
        this.zza = map;
    }

    static /* synthetic */ void zzr(com.google.android.gms.internal.mlkit_vision_barcode.zzbr zzbrVar, java.lang.Object obj) {
        java.lang.Object obj2;
        try {
            obj2 = zzbrVar.zza.remove(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            obj2 = null;
        }
        java.util.Collection collection = (java.util.Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzbrVar.zzb -= size;
        }
    }

    abstract java.util.Collection zza();

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbv
    final java.util.Collection zzi() {
        return this instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzdq ? new com.google.android.gms.internal.mlkit_vision_barcode.zzbu(this) : new com.google.android.gms.internal.mlkit_vision_barcode.zzbt(this);
    }

    public final java.util.Collection zzj(java.lang.Object obj) {
        java.util.Collection collection = (java.util.Collection) this.zza.get(obj);
        if (collection == null) {
            collection = zza();
        }
        return zzd(obj, collection);
    }

    public final java.util.Collection zzk(@javax.annotation.CheckForNull java.lang.Object obj) {
        java.util.Collection collection = (java.util.Collection) this.zza.remove(obj);
        if (collection == null) {
            return zzb();
        }
        java.util.Collection zza = zza();
        zza.addAll(collection);
        this.zzb -= collection.size();
        collection.clear();
        return zzc(zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbv
    final java.util.Iterator zzl() {
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzbf(this);
    }

    final java.util.List zzm(java.lang.Object obj, java.util.List list, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_vision_barcode.zzbo zzboVar) {
        return list instanceof java.util.RandomAccess ? new com.google.android.gms.internal.mlkit_vision_barcode.zzbm(this, obj, list, zzboVar) : new com.google.android.gms.internal.mlkit_vision_barcode.zzbq(this, obj, list, zzboVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbv
    final java.util.Map zzo() {
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzbi(this, this.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbv
    final java.util.Set zzp() {
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzbl(this, this.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdg
    public final void zzs() {
        java.util.Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((java.util.Collection) it.next()).clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbv, com.google.android.gms.internal.mlkit_vision_barcode.zzdg
    public final boolean zzt(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Collection collection = (java.util.Collection) this.zza.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.zzb++;
            return true;
        }
        java.util.Collection zza = zza();
        if (!zza.add(obj2)) {
            throw new java.lang.AssertionError("New Collection violated the Collection spec");
        }
        this.zzb++;
        this.zza.put(obj, zza);
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdg
    public final int zzh() {
        return this.zzb;
    }

    java.util.Collection zzd(java.lang.Object obj, java.util.Collection collection) {
        throw null;
    }

    java.util.Collection zzc(java.util.Collection collection) {
        throw null;
    }

    java.util.Collection zzb() {
        throw null;
    }
}
