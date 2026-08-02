package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public abstract class zzby extends java.util.AbstractCollection implements java.io.Serializable {
    private static final java.lang.Object[] zzn = new java.lang.Object[0];

    zzby() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(@javax.annotation.CheckForNull java.lang.Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Spliterator spliterator() {
        return java.util.Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
        return toArray(zzn);
    }

    int zza(java.lang.Object[] objArr, int i) {
        com.google.android.gms.internal.fido.zzdc it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            objArr[i2] = it.next();
            i2++;
        }
        return i2;
    }

    int zzb() {
        throw new java.lang.UnsupportedOperationException();
    }

    int zzc() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public abstract com.google.android.gms.internal.fido.zzdc iterator();

    @javax.annotation.CheckForNull
    java.lang.Object[] zze() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            java.lang.Object[] zze = zze();
            if (zze != null) {
                return java.util.Arrays.copyOfRange(zze, zzc(), zzb(), objArr.getClass());
            }
            if (length != 0) {
                objArr = java.util.Arrays.copyOf(objArr, 0);
            }
            objArr = java.util.Arrays.copyOf(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        zza(objArr, 0);
        return objArr;
    }
}
