package com.google.common.base;

/* loaded from: classes4.dex */
public final class a<T> extends j<T> {
    public static final a<Object> a = new a<>();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return a;
    }

    @Override // com.google.common.base.j
    public final T a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.common.base.j
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
