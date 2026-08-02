package com.google.android.gms.internal.p000authapi;

/* loaded from: classes8.dex */
public abstract class zbbg extends java.util.AbstractCollection implements java.io.Serializable {
    private static final java.lang.Object[] zba = new java.lang.Object[0];

    zbbg() {
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
    @java.lang.Deprecated
    public final boolean remove(java.lang.Object obj) {
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
        return toArray(zba);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zba, reason: merged with bridge method [inline-methods] */
    public abstract com.google.android.gms.internal.p000authapi.zbbl iterator();

    abstract boolean zbf();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            java.lang.Object[] zbb = zbb();
            if (zbb != null) {
                return java.util.Arrays.copyOfRange(zbb, zbc(), zbd(), objArr.getClass());
            }
            if (length != 0) {
                objArr = java.util.Arrays.copyOf(objArr, 0);
            }
            objArr = java.util.Arrays.copyOf(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        zbg(objArr, 0);
        return objArr;
    }

    int zbg(java.lang.Object[] objArr, int i) {
        throw null;
    }

    public com.google.android.gms.internal.p000authapi.zbbj zbe() {
        throw null;
    }

    int zbd() {
        throw null;
    }

    int zbc() {
        throw null;
    }

    java.lang.Object[] zbb() {
        throw null;
    }
}
