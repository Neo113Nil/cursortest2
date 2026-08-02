package com.google.common.collect;

import java.util.Comparator;

/* loaded from: classes4.dex */
public abstract class d0<T> implements Comparator<T> {
    public static <T> d0<T> a(Comparator<T> comparator) {
        return comparator instanceof d0 ? (d0) comparator : new C0972u(comparator);
    }

    public <S extends T> d0<S> b() {
        return new m0(this);
    }
}
