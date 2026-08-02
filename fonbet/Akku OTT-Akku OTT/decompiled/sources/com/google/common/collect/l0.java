package com.google.common.collect;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class l0 extends d0<Comparable<?>> implements Serializable {
    public static final l0 a = new l0();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return a;
    }

    @Override // com.google.common.collect.d0
    public final <S extends Comparable<?>> d0<S> b() {
        return b0.a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
