package com.google.common.collect;

/* loaded from: classes4.dex */
public final class k0<E> extends M<E> {
    public static final Object[] k;
    public static final k0<Object> l;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int i;
    public final transient int j;

    static {
        Object[] objArr = new Object[0];
        k = objArr;
        l = new k0<>(objArr, 0, objArr, 0, 0);
    }

    public k0(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.d = objArr;
        this.e = i;
        this.f = objArr2;
        this.i = i2;
        this.j = i3;
    }

    @Override // com.google.common.collect.E
    public final int b(int i, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i2 = this.j;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // com.google.common.collect.E
    public final Object[] c() {
        return this.d;
    }

    @Override // com.google.common.collect.E, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int b = C.b(obj);
                while (true) {
                    int i = b & this.i;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    b = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.E
    public final int d() {
        return this.j;
    }

    @Override // com.google.common.collect.E
    public final int e() {
        return 0;
    }

    @Override // com.google.common.collect.E
    public final boolean f() {
        return false;
    }

    @Override // com.google.common.collect.M, com.google.common.collect.E, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: g */
    public final y0<E> iterator() {
        return a().listIterator(0);
    }

    @Override // com.google.common.collect.M, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // com.google.common.collect.M
    public final G<E> l() {
        return G.h(this.j, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.j;
    }

    @Override // com.google.common.collect.M, com.google.common.collect.E
    public Object writeReplace() {
        return super.writeReplace();
    }
}
