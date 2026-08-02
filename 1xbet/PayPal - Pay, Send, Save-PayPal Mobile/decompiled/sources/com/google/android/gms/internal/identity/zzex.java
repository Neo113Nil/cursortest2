package com.google.android.gms.internal.identity;

/* loaded from: classes.dex */
public abstract class zzex extends com.google.android.gms.internal.identity.zzeu implements java.util.List, java.util.RandomAccess {
    private static final com.google.android.gms.internal.identity.zzfa zza = new com.google.android.gms.internal.identity.zzev(com.google.android.gms.internal.identity.zzey.zza, 0);

    zzex() {
    }

    public static com.google.android.gms.internal.identity.zzex zzi() {
        return com.google.android.gms.internal.identity.zzey.zza;
    }

    public static com.google.android.gms.internal.identity.zzex zzj(java.util.Collection collection) {
        if (collection instanceof com.google.android.gms.internal.identity.zzeu) {
            com.google.android.gms.internal.identity.zzex zze = ((com.google.android.gms.internal.identity.zzeu) collection).zze();
            if (!zze.zzf()) {
                return zze;
            }
            java.lang.Object[] array = zze.toArray();
            return zzk(array, array.length);
        }
        java.lang.Object[] array2 = collection.toArray();
        int length = array2.length;
        for (int i = 0; i < length; i++) {
            if (array2[i] == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 9);
                sb.append("at index ");
                sb.append(i);
                throw new java.lang.NullPointerException(sb.toString());
            }
        }
        return zzk(array2, length);
    }

    static com.google.android.gms.internal.identity.zzex zzk(java.lang.Object[] objArr, int i) {
        return i == 0 ? com.google.android.gms.internal.identity.zzey.zza : new com.google.android.gms.internal.identity.zzey(objArr, i);
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
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
                if (!com.google.android.gms.internal.identity.zzeq.zza(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        java.util.Iterator it = iterator();
        java.util.Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !com.google.android.gms.internal.identity.zzeq.zza(it.next(), it2.next())) {
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
    public final int indexOf(@javax.annotation.CheckForNull java.lang.Object obj) {
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

    @Override // com.google.android.gms.internal.identity.zzeu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object obj) {
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

    @Override // com.google.android.gms.internal.identity.zzeu
    /* renamed from: zza */
    public final com.google.android.gms.internal.identity.zzez iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    @java.lang.Deprecated
    public final com.google.android.gms.internal.identity.zzex zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    int zzg(java.lang.Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.identity.zzex subList(int i, int i2) {
        com.google.android.gms.internal.identity.zzer.zze(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? com.google.android.gms.internal.identity.zzey.zza : new com.google.android.gms.internal.identity.zzew(this, i, i3);
    }

    @Override // java.util.List
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.identity.zzfa listIterator(int i) {
        com.google.android.gms.internal.identity.zzer.zzd(i, size(), "index");
        return isEmpty() ? zza : new com.google.android.gms.internal.identity.zzev(this, i);
    }
}
