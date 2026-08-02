package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public abstract class zzcc extends com.google.android.gms.internal.fido.zzby implements java.util.List, java.util.RandomAccess {
    private static final com.google.android.gms.internal.fido.zzdd zza = new com.google.android.gms.internal.fido.zzbz(com.google.android.gms.internal.fido.zzct.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    zzcc() {
    }

    static com.google.android.gms.internal.fido.zzcc zzh(java.lang.Object[] objArr, int i) {
        return i == 0 ? com.google.android.gms.internal.fido.zzct.zza : new com.google.android.gms.internal.fido.zzct(objArr, i);
    }

    public static com.google.android.gms.internal.fido.zzcc zzi(java.lang.Object[] objArr) {
        if (objArr.length == 0) {
            return com.google.android.gms.internal.fido.zzct.zza;
        }
        java.lang.Object[] objArr2 = (java.lang.Object[]) objArr.clone();
        int length = objArr2.length;
        com.google.android.gms.internal.fido.zzcr.zzb(objArr2, length);
        return zzh(objArr2, length);
    }

    public static com.google.android.gms.internal.fido.zzcc zzj(java.lang.Object obj) {
        java.lang.Object[] objArr = {obj};
        com.google.android.gms.internal.fido.zzcr.zzb(objArr, 1);
        return zzh(objArr, 1);
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

    @Override // com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
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
                if (!com.google.android.gms.internal.fido.zzbk.zza(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        java.util.Iterator it = iterator();
        java.util.Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !com.google.android.gms.internal.fido.zzbk.zza(it.next(), it2.next())) {
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

    public int indexOf(@javax.annotation.CheckForNull java.lang.Object obj) {
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

    @Override // com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object obj) {
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

    @Override // com.google.android.gms.internal.fido.zzby
    int zza(java.lang.Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    /* renamed from: zzd */
    public final com.google.android.gms.internal.fido.zzdc iterator() {
        return listIterator(0);
    }

    public com.google.android.gms.internal.fido.zzcc zzf() {
        return size() <= 1 ? this : new com.google.android.gms.internal.fido.zzca(this);
    }

    @Override // java.util.List
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.fido.zzcc subList(int i, int i2) {
        com.google.android.gms.internal.fido.zzbm.zze(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? com.google.android.gms.internal.fido.zzct.zza : new com.google.android.gms.internal.fido.zzcb(this, i, i3);
    }

    @Override // java.util.List
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.fido.zzdd listIterator(int i) {
        com.google.android.gms.internal.fido.zzbm.zzb(i, size(), "index");
        return isEmpty() ? zza : new com.google.android.gms.internal.fido.zzbz(this, i);
    }
}
