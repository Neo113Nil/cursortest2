package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
public abstract class zzl extends java.util.AbstractCollection implements java.io.Serializable {
    private static final java.lang.Object[] zza = new java.lang.Object[0];

    zzl() {
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

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
        return toArray(zza);
    }

    int zzb() {
        throw new java.lang.UnsupportedOperationException();
    }

    int zzc() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public abstract com.google.android.gms.internal.mlkit_vision_common.zzab iterator();

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
            objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (length > size) {
            objArr[size] = null;
        }
        zza(objArr, 0);
        return objArr;
    }

    int zza(java.lang.Object[] objArr, int i) {
        throw null;
    }
}
