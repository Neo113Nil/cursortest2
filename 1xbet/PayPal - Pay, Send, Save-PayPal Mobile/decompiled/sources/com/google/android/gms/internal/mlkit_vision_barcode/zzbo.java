package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
class zzbo extends java.util.AbstractCollection {
    final java.lang.Object zza;
    java.util.Collection zzb;

    @javax.annotation.CheckForNull
    final com.google.android.gms.internal.mlkit_vision_barcode.zzbo zzc;

    @javax.annotation.CheckForNull
    final java.util.Collection zzd;
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_barcode.zzbr zze;

    zzbo(com.google.android.gms.internal.mlkit_vision_barcode.zzbr zzbrVar, java.lang.Object obj, @javax.annotation.CheckForNull java.util.Collection collection, com.google.android.gms.internal.mlkit_vision_barcode.zzbo zzboVar) {
        this.zze = zzbrVar;
        this.zza = obj;
        this.zzb = collection;
        this.zzc = zzboVar;
        this.zzd = zzboVar == null ? null : zzboVar.zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        int i;
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        boolean add = this.zzb.add(obj);
        if (add) {
            com.google.android.gms.internal.mlkit_vision_barcode.zzbr zzbrVar = this.zze;
            i = zzbrVar.zzb;
            zzbrVar.zzb = i + 1;
            if (isEmpty) {
                zza();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        int i;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.zzb.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.zzb.size();
        com.google.android.gms.internal.mlkit_vision_barcode.zzbr zzbrVar = this.zze;
        i = zzbrVar.zzb;
        zzbrVar.zzb = i + (size2 - size);
        if (size != 0) {
            return addAll;
        }
        zza();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i;
        int size = size();
        if (size == 0) {
            return;
        }
        this.zzb.clear();
        com.google.android.gms.internal.mlkit_vision_barcode.zzbr zzbrVar = this.zze;
        i = zzbrVar.zzb;
        zzbrVar.zzb = i - size;
        zzc();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        zzb();
        return this.zzb.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        zzb();
        return this.zzb.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.zzb.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.zzb.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        zzb();
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzbn(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object obj) {
        int i;
        zzb();
        boolean remove = this.zzb.remove(obj);
        if (remove) {
            com.google.android.gms.internal.mlkit_vision_barcode.zzbr zzbrVar = this.zze;
            i = zzbrVar.zzb;
            zzbrVar.zzb = i - 1;
            zzc();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        int i;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.zzb.removeAll(collection);
        if (removeAll) {
            int size2 = this.zzb.size();
            com.google.android.gms.internal.mlkit_vision_barcode.zzbr zzbrVar = this.zze;
            i = zzbrVar.zzb;
            zzbrVar.zzb = i + (size2 - size);
            zzc();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.zzb.size();
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        zzb();
        return this.zzb.toString();
    }

    final void zza() {
        java.util.Map map;
        com.google.android.gms.internal.mlkit_vision_barcode.zzbo zzboVar = this.zzc;
        if (zzboVar != null) {
            zzboVar.zza();
            return;
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzbr zzbrVar = this.zze;
        java.lang.Object obj = this.zza;
        map = zzbrVar.zza;
        map.put(obj, this.zzb);
    }

    final void zzb() {
        java.util.Map map;
        com.google.android.gms.internal.mlkit_vision_barcode.zzbo zzboVar = this.zzc;
        if (zzboVar != null) {
            zzboVar.zzb();
            com.google.android.gms.internal.mlkit_vision_barcode.zzbo zzboVar2 = this.zzc;
            if (zzboVar2.zzb != this.zzd) {
                throw new java.util.ConcurrentModificationException();
            }
            return;
        }
        if (this.zzb.isEmpty()) {
            com.google.android.gms.internal.mlkit_vision_barcode.zzbr zzbrVar = this.zze;
            java.lang.Object obj = this.zza;
            map = zzbrVar.zza;
            java.util.Collection collection = (java.util.Collection) map.get(obj);
            if (collection != null) {
                this.zzb = collection;
            }
        }
    }

    final void zzc() {
        java.util.Map map;
        com.google.android.gms.internal.mlkit_vision_barcode.zzbo zzboVar = this.zzc;
        if (zzboVar != null) {
            zzboVar.zzc();
        } else if (this.zzb.isEmpty()) {
            com.google.android.gms.internal.mlkit_vision_barcode.zzbr zzbrVar = this.zze;
            java.lang.Object obj = this.zza;
            map = zzbrVar.zza;
            map.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        int i;
        collection.getClass();
        int size = size();
        boolean retainAll = this.zzb.retainAll(collection);
        if (retainAll) {
            int size2 = this.zzb.size();
            com.google.android.gms.internal.mlkit_vision_barcode.zzbr zzbrVar = this.zze;
            i = zzbrVar.zzb;
            zzbrVar.zzb = i + (size2 - size);
            zzc();
        }
        return retainAll;
    }
}
