package com.google.android.play.integrity.internal;

/* loaded from: classes9.dex */
public abstract class ar extends com.google.android.play.integrity.internal.ao implements java.util.List, java.util.RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.integrity.internal.aw f3848a = new com.google.android.play.integrity.internal.ap(com.google.android.play.integrity.internal.at.f3850a, 0);
    public static final /* synthetic */ int d = 0;

    ar() {
    }

    @Override // com.google.android.play.integrity.internal.ao
    int a(java.lang.Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
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

    @Override // com.google.android.play.integrity.internal.ao
    /* renamed from: d */
    public final com.google.android.play.integrity.internal.av iterator() {
        return listIterator(0);
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
                if (!com.google.android.play.integrity.internal.ak.a(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        java.util.Iterator it = iterator();
        java.util.Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !com.google.android.play.integrity.internal.ak.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.google.android.play.integrity.internal.ar subList(int i, int i2) {
        com.google.android.play.integrity.internal.al.c(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? com.google.android.play.integrity.internal.at.f3850a : new com.google.android.play.integrity.internal.aq(this, i, i3);
    }

    @Override // java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final com.google.android.play.integrity.internal.aw listIterator(int i) {
        com.google.android.play.integrity.internal.al.b(i, size(), "index");
        return isEmpty() ? f3848a : new com.google.android.play.integrity.internal.ap(this, i);
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

    @Override // com.google.android.play.integrity.internal.ao, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
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
}
