package com.google.common.collect;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class b0 extends d0<Comparable<?>> implements Serializable {
    public static final b0 a = new b0();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return a;
    }

    @Override // com.google.common.collect.d0
    public final <S extends Comparable<?>> d0<S> b() {
        return l0.a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
