package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
abstract class zzdb extends com.google.android.gms.internal.mlkit_vision_barcode.zzdr {
    zzdb() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        zza().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object key = entry.getKey();
            java.lang.Object zza = com.google.android.gms.internal.mlkit_vision_barcode.zzdf.zza(zza(), key);
            if (com.google.android.gms.internal.mlkit_vision_barcode.zzax.zza(zza, entry.getValue())) {
                return zza != null || com.google.android.gms.internal.mlkit_vision_barcode.zzdf.zzb(((com.google.android.gms.internal.mlkit_vision_barcode.zzbi) zza()).zza, key);
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return zza().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (contains(obj) && (obj instanceof java.util.Map.Entry)) {
            return ((com.google.android.gms.internal.mlkit_vision_barcode.zzbi) zza()).zzb.zzw().remove(((java.util.Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return zza().size();
    }

    abstract java.util.Map zza();

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection collection) {
        int ceil;
        collection.getClass();
        try {
            java.util.Collection collection2 = collection;
            return super.retainAll(collection);
        } catch (java.lang.UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                com.google.android.gms.internal.mlkit_vision_barcode.zzby.zza(size, "expectedSize");
                ceil = size + 1;
            } else {
                ceil = size < 1073741824 ? (int) java.lang.Math.ceil(size / 0.75d) : Integer.MAX_VALUE;
            }
            java.util.HashSet hashSet = new java.util.HashSet(ceil);
            for (java.lang.Object obj : collection) {
                if (contains(obj) && (obj instanceof java.util.Map.Entry)) {
                    hashSet.add(((java.util.Map.Entry) obj).getKey());
                }
            }
            return ((com.google.android.gms.internal.mlkit_vision_barcode.zzbi) zza()).zzb.zzw().retainAll(hashSet);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdr, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        try {
            java.util.Collection collection2 = collection;
            return com.google.android.gms.internal.mlkit_vision_barcode.zzds.zzc(this, collection);
        } catch (java.lang.UnsupportedOperationException unused) {
            return com.google.android.gms.internal.mlkit_vision_barcode.zzds.zzd(this, collection.iterator());
        }
    }
}
