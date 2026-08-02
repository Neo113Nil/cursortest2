package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
abstract class zzde extends java.util.AbstractMap {

    @javax.annotation.CheckForNull
    private transient java.util.Set zza;

    @javax.annotation.CheckForNull
    private transient java.util.Set zzb;

    @javax.annotation.CheckForNull
    private transient java.util.Collection zzc;

    zzde() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        java.util.Set set = this.zza;
        if (set != null) {
            return set;
        }
        java.util.Set zzb = zzb();
        this.zza = zzb;
        return zzb;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set keySet() {
        java.util.Set set = this.zzb;
        if (set != null) {
            return set;
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzdc zzdcVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzdc(this);
        this.zzb = zzdcVar;
        return zzdcVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection values() {
        java.util.Collection collection = this.zzc;
        if (collection != null) {
            return collection;
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzdd zzddVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzdd(this);
        this.zzc = zzddVar;
        return zzddVar;
    }

    abstract java.util.Set zzb();
}
