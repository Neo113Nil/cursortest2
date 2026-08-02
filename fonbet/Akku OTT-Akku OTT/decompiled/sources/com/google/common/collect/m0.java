package com.google.common.collect;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class m0<T> extends d0<T> implements Serializable {
    private static final long serialVersionUID = 0;
    public final d0<? super T> a;

    public m0(d0<? super T> d0Var) {
        this.a = d0Var;
    }

    @Override // com.google.common.collect.d0
    public final <S extends T> d0<S> b() {
        return this.a;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return this.a.compare(t2, t);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m0) {
            return this.a.equals(((m0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        return this.a + ".reverse()";
    }
}
