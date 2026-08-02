package com.google.common.base;

/* loaded from: classes4.dex */
public final class n<T> extends j<T> {
    private static final long serialVersionUID = 0;
    public final T a;

    public n(T t) {
        this.a = t;
    }

    @Override // com.google.common.base.j
    public final T a() {
        return this.a;
    }

    @Override // com.google.common.base.j
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.a.equals(((n) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.a + ")";
    }
}
