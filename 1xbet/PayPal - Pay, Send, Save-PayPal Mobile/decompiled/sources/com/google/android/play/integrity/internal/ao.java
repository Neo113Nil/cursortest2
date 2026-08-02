package com.google.android.play.integrity.internal;

/* loaded from: classes9.dex */
public abstract class ao extends java.util.AbstractCollection implements java.io.Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.Object[] f3845a = new java.lang.Object[0];

    ao() {
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public abstract com.google.android.play.integrity.internal.av iterator();

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
        return toArray(f3845a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        int size = size();
        int length = objArr.length;
        if (length < size) {
            java.lang.Object[] e = e();
            if (e != null) {
                return java.util.Arrays.copyOfRange(e, c(), b(), objArr.getClass());
            }
            if (length != 0) {
                objArr = java.util.Arrays.copyOf(objArr, 0);
            }
            objArr = java.util.Arrays.copyOf(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        a(objArr, 0);
        return objArr;
    }

    @javax.annotation.CheckForNull
    java.lang.Object[] e() {
        throw null;
    }

    int c() {
        throw null;
    }

    int b() {
        throw null;
    }

    int a(java.lang.Object[] objArr, int i) {
        throw null;
    }
}
