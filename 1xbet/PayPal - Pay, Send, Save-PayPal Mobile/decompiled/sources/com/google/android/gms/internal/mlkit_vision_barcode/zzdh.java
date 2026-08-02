package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
abstract class zzdh extends java.util.AbstractCollection {
    zzdh() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        zza().zzs();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return zza().zzx(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return zza().zzy(entry.getKey(), entry.getValue());
    }

    abstract com.google.android.gms.internal.mlkit_vision_barcode.zzdg zza();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return zza().zzh();
    }
}
