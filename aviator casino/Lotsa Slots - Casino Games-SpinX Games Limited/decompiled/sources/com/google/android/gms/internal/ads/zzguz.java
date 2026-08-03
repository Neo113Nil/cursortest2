package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
class zzguz extends java.util.AbstractCollection {
    final java.lang.Object zza;
    java.util.Collection zzb;
    final com.google.android.gms.internal.ads.zzguz zzc;
    final java.util.Collection zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzgvc zze;

    zzguz(com.google.android.gms.internal.ads.zzgvc zzgvcVar, java.lang.Object obj, java.util.Collection collection, com.google.android.gms.internal.ads.zzguz zzguzVar) {
        java.util.Objects.requireNonNull(zzgvcVar);
        this.zze = zzgvcVar;
        this.zza = obj;
        this.zzb = collection;
        this.zzc = zzguzVar;
        this.zzd = zzguzVar == null ? null : zzguzVar.zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        zza();
        boolean isEmpty = this.zzb.isEmpty();
        boolean add = this.zzb.add(obj);
        if (add) {
            com.google.android.gms.internal.ads.zzgvc zzgvcVar = this.zze;
            zzgvcVar.zzq(zzgvcVar.zzp() + 1);
            if (isEmpty) {
                zzc();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.zzb.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.zzb.size();
        com.google.android.gms.internal.ads.zzgvc zzgvcVar = this.zze;
        zzgvcVar.zzq(zzgvcVar.zzp() + (size2 - size));
        if (size != 0) {
            return addAll;
        }
        zzc();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.zzb.clear();
        com.google.android.gms.internal.ads.zzgvc zzgvcVar = this.zze;
        zzgvcVar.zzq(zzgvcVar.zzp() - size);
        zzb();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        zza();
        return this.zzb.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        zza();
        return this.zzb.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        zza();
        return this.zzb.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zza();
        return this.zzb.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        zza();
        return new com.google.android.gms.internal.ads.zzguy(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        zza();
        boolean remove = this.zzb.remove(obj);
        if (remove) {
            this.zze.zzq(r0.zzp() - 1);
            zzb();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.zzb.removeAll(collection);
        if (removeAll) {
            int size2 = this.zzb.size();
            com.google.android.gms.internal.ads.zzgvc zzgvcVar = this.zze;
            zzgvcVar.zzq(zzgvcVar.zzp() + (size2 - size));
            zzb();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zza();
        return this.zzb.size();
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        zza();
        return this.zzb.toString();
    }

    final void zza() {
        com.google.android.gms.internal.ads.zzguz zzguzVar = this.zzc;
        if (zzguzVar != null) {
            zzguzVar.zza();
            if (zzguzVar.zzb != this.zzd) {
                throw new java.util.ConcurrentModificationException();
            }
            return;
        }
        if (this.zzb.isEmpty()) {
            com.google.android.gms.internal.ads.zzgvc zzgvcVar = this.zze;
            java.util.Collection collection = (java.util.Collection) zzgvcVar.zzo().get(this.zza);
            if (collection != null) {
                this.zzb = collection;
            }
        }
    }

    final void zzb() {
        com.google.android.gms.internal.ads.zzguz zzguzVar = this.zzc;
        if (zzguzVar != null) {
            zzguzVar.zzb();
        } else if (this.zzb.isEmpty()) {
            com.google.android.gms.internal.ads.zzgvc zzgvcVar = this.zze;
            zzgvcVar.zzo().remove(this.zza);
        }
    }

    final void zzc() {
        com.google.android.gms.internal.ads.zzguz zzguzVar = this.zzc;
        if (zzguzVar != null) {
            zzguzVar.zzc();
            return;
        }
        com.google.android.gms.internal.ads.zzgvc zzgvcVar = this.zze;
        zzgvcVar.zzo().put(this.zza, this.zzb);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.zzb.retainAll(collection);
        if (retainAll) {
            int size2 = this.zzb.size();
            com.google.android.gms.internal.ads.zzgvc zzgvcVar = this.zze;
            zzgvcVar.zzq(zzgvcVar.zzp() + (size2 - size));
            zzb();
        }
        return retainAll;
    }
}
