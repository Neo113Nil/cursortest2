package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
abstract class zzbv implements com.google.android.gms.internal.mlkit_vision_barcode.zzdg {

    @javax.annotation.CheckForNull
    private transient java.util.Collection zza;

    @javax.annotation.CheckForNull
    private transient java.util.Set zzb;

    @javax.annotation.CheckForNull
    private transient java.util.Map zzc;

    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzdg) {
            return zzv().equals(((com.google.android.gms.internal.mlkit_vision_barcode.zzdg) obj).zzv());
        }
        return false;
    }

    public final int hashCode() {
        return zzv().hashCode();
    }

    public final java.lang.String toString() {
        return zzv().toString();
    }

    abstract java.util.Collection zzi();

    abstract java.util.Iterator zzl();

    abstract java.util.Map zzo();

    abstract java.util.Set zzp();

    public final java.util.Collection zzu() {
        java.util.Collection collection = this.zza;
        if (collection != null) {
            return collection;
        }
        java.util.Collection zzi = zzi();
        this.zza = zzi;
        return zzi;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdg
    public final java.util.Map zzv() {
        java.util.Map map = this.zzc;
        if (map != null) {
            return map;
        }
        java.util.Map zzo = zzo();
        this.zzc = zzo;
        return zzo;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdg
    public final java.util.Set zzw() {
        java.util.Set set = this.zzb;
        if (set != null) {
            return set;
        }
        java.util.Set zzp = zzp();
        this.zzb = zzp;
        return zzp;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdg
    public final boolean zzx(@javax.annotation.CheckForNull java.lang.Object obj, @javax.annotation.CheckForNull java.lang.Object obj2) {
        java.util.Collection collection = ((com.google.android.gms.internal.mlkit_vision_barcode.zzbi) zzv()).get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdg
    public final boolean zzy(@javax.annotation.CheckForNull java.lang.Object obj, @javax.annotation.CheckForNull java.lang.Object obj2) {
        java.util.Collection collection = ((com.google.android.gms.internal.mlkit_vision_barcode.zzbi) zzv()).get(obj);
        return collection != null && collection.remove(obj2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdg
    public boolean zzt(java.lang.Object obj, java.lang.Object obj2) {
        throw null;
    }

    zzbv() {
    }
}
