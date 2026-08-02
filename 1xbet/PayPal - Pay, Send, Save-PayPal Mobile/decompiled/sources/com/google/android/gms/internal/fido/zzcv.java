package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzcv extends com.google.android.gms.internal.fido.zzck {
    static final com.google.android.gms.internal.fido.zzcv zzc;
    final transient com.google.android.gms.internal.fido.zzcc zzd;

    static {
        int i = com.google.android.gms.internal.fido.zzcc.zzd;
        zzc = new com.google.android.gms.internal.fido.zzcv(com.google.android.gms.internal.fido.zzct.zza, com.google.android.gms.internal.fido.zzcq.zza);
    }

    zzcv(com.google.android.gms.internal.fido.zzcc zzccVar, java.util.Comparator comparator) {
        super(comparator);
        this.zzd = zzccVar;
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.NavigableSet
    @javax.annotation.CheckForNull
    public final java.lang.Object ceiling(java.lang.Object obj) {
        com.google.android.gms.internal.fido.zzcc zzccVar = this.zzd;
        int zzv = zzv(obj, true);
        if (zzv == zzccVar.size()) {
            return null;
        }
        return this.zzd.get(zzv);
    }

    @Override // com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return java.util.Collections.binarySearch(this.zzd, obj, this.zza) >= 0;
        } catch (java.lang.ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection collection) {
        if (collection instanceof com.google.android.gms.internal.fido.zzcp) {
            collection = ((com.google.android.gms.internal.fido.zzcp) collection).zza();
        }
        if (!com.google.android.gms.internal.fido.zzdb.zza(((com.google.android.gms.internal.fido.zzck) this).zza, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        com.google.android.gms.internal.fido.zzdd listIterator = this.zzd.listIterator(0);
        java.util.Iterator it = collection.iterator();
        if (!listIterator.hasNext()) {
            return false;
        }
        java.lang.Object next = it.next();
        E next2 = listIterator.next();
        while (true) {
            try {
                int compare = ((com.google.android.gms.internal.fido.zzck) this).zza.compare(next2, next);
                if (compare >= 0) {
                    if (compare != 0) {
                        break;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else {
                    if (!listIterator.hasNext()) {
                        return false;
                    }
                    next2 = listIterator.next();
                }
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.fido.zzcf, java.util.Collection, java.util.Set
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set = (java.util.Set) obj;
        if (this.zzd.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!com.google.android.gms.internal.fido.zzdb.zza(this.zza, set)) {
            return containsAll(set);
        }
        java.util.Iterator it = set.iterator();
        try {
            com.google.android.gms.internal.fido.zzdd listIterator = this.zzd.listIterator(0);
            while (listIterator.hasNext()) {
                E next = listIterator.next();
                java.lang.Object next2 = it.next();
                if (next2 == null || ((com.google.android.gms.internal.fido.zzck) this).zza.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.ClassCastException | java.util.NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.SortedSet
    public final java.lang.Object first() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        return this.zzd.get(0);
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.NavigableSet
    @javax.annotation.CheckForNull
    public final java.lang.Object floor(java.lang.Object obj) {
        int zzu = zzu(obj, true) - 1;
        if (zzu == -1) {
            return null;
        }
        return this.zzd.get(zzu);
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.NavigableSet
    @javax.annotation.CheckForNull
    public final java.lang.Object higher(java.lang.Object obj) {
        com.google.android.gms.internal.fido.zzcc zzccVar = this.zzd;
        int zzv = zzv(obj, false);
        if (zzv == zzccVar.size()) {
            return null;
        }
        return this.zzd.get(zzv);
    }

    @Override // com.google.android.gms.internal.fido.zzck, com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return this.zzd.listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.SortedSet
    public final java.lang.Object last() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        return this.zzd.get(r0.size() - 1);
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.NavigableSet
    @javax.annotation.CheckForNull
    public final java.lang.Object lower(java.lang.Object obj) {
        int zzu = zzu(obj, false) - 1;
        if (zzu == -1) {
            return null;
        }
        return this.zzd.get(zzu);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzd.size();
    }

    @Override // com.google.android.gms.internal.fido.zzby
    final int zza(java.lang.Object[] objArr, int i) {
        return this.zzd.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    final int zzb() {
        return this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.fido.zzby
    final int zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.fido.zzck, com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby
    /* renamed from: zzd */
    public final com.google.android.gms.internal.fido.zzdc iterator() {
        return this.zzd.listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    @javax.annotation.CheckForNull
    final java.lang.Object[] zze() {
        return this.zzd.zze();
    }

    @Override // com.google.android.gms.internal.fido.zzck
    final com.google.android.gms.internal.fido.zzck zzf() {
        java.util.Comparator reverseOrder = java.util.Collections.reverseOrder(this.zza);
        return isEmpty() ? zzs(reverseOrder) : new com.google.android.gms.internal.fido.zzcv(this.zzd.zzf(), reverseOrder);
    }

    @Override // com.google.android.gms.internal.fido.zzck
    final com.google.android.gms.internal.fido.zzck zzo(java.lang.Object obj, boolean z) {
        return zzw(0, zzu(obj, z));
    }

    @Override // com.google.android.gms.internal.fido.zzck
    final com.google.android.gms.internal.fido.zzck zzq(java.lang.Object obj, boolean z, java.lang.Object obj2, boolean z2) {
        return zzr(obj, z).zzo(obj2, z2);
    }

    @Override // com.google.android.gms.internal.fido.zzck
    final com.google.android.gms.internal.fido.zzck zzr(java.lang.Object obj, boolean z) {
        return zzw(zzv(obj, z), this.zzd.size());
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.NavigableSet
    /* renamed from: zzt */
    public final com.google.android.gms.internal.fido.zzdc descendingIterator() {
        return this.zzd.zzf().listIterator(0);
    }

    final com.google.android.gms.internal.fido.zzcv zzw(int i, int i2) {
        if (i == 0) {
            if (i2 == this.zzd.size()) {
                return this;
            }
            i = 0;
        }
        if (i >= i2) {
            return zzs(this.zza);
        }
        com.google.android.gms.internal.fido.zzcc zzccVar = this.zzd;
        return new com.google.android.gms.internal.fido.zzcv(zzccVar.subList(i, i2), this.zza);
    }

    final int zzu(java.lang.Object obj, boolean z) {
        obj.getClass();
        int binarySearch = java.util.Collections.binarySearch(this.zzd, obj, ((com.google.android.gms.internal.fido.zzck) this).zza);
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    final int zzv(java.lang.Object obj, boolean z) {
        obj.getClass();
        int binarySearch = java.util.Collections.binarySearch(this.zzd, obj, ((com.google.android.gms.internal.fido.zzck) this).zza);
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    public final com.google.android.gms.internal.fido.zzcc zzi() {
        return this.zzd;
    }
}
