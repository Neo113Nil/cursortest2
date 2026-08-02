package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public abstract class zzbi extends com.google.android.gms.internal.maps.zzbf implements java.util.List, java.util.RandomAccess {
    private static final com.google.android.gms.internal.maps.zzby zza = new com.google.android.gms.internal.maps.zzbg(com.google.android.gms.internal.maps.zzbo.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    zzbi() {
    }

    static com.google.android.gms.internal.maps.zzbi zzg(java.lang.Object[] objArr, int i) {
        return i == 0 ? com.google.android.gms.internal.maps.zzbo.zza : new com.google.android.gms.internal.maps.zzbo(objArr, i);
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final void add(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final boolean addAll(int i, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.maps.zzbf, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.List)) {
            return false;
        }
        java.util.List list = (java.util.List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof java.util.RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!java.util.Objects.equals(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        java.util.Iterator it = iterator();
        java.util.Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !java.util.Objects.equals(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.maps.zzbf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final java.lang.Object remove(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final java.lang.Object set(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.maps.zzbf
    int zza(java.lang.Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.maps.zzbf
    /* renamed from: zzd */
    public final com.google.android.gms.internal.maps.zzbx iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.maps.zzbi subList(int i, int i2) {
        com.google.android.gms.internal.maps.zzba.zzc(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? com.google.android.gms.internal.maps.zzbo.zza : new com.google.android.gms.internal.maps.zzbh(this, i, i3);
    }

    @Override // java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.maps.zzby listIterator(int i) {
        com.google.android.gms.internal.maps.zzba.zzb(i, size(), "index");
        return isEmpty() ? zza : new com.google.android.gms.internal.maps.zzbg(this, i);
    }
}
