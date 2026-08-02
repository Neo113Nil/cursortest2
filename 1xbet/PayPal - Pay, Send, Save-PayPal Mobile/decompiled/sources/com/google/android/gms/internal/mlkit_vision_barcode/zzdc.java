package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
class zzdc extends com.google.android.gms.internal.mlkit_vision_barcode.zzdr {
    final java.util.Map zzb;

    zzdc(java.util.Map map) {
        this.zzb = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.zzb.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        return this.zzb.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.zzb.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzcz(this.zzb.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (!contains(obj)) {
            return false;
        }
        this.zzb.remove(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzb.size();
    }
}
