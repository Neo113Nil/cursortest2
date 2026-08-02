package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.google.common.collect.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0964l<F, T> extends d0<F> implements Serializable {
    private static final long serialVersionUID = 0;
    public final com.google.common.base.f<F, ? extends T> a;
    public final d0<T> b;

    public C0964l(com.google.common.base.f<F, ? extends T> fVar, d0<T> d0Var) {
        this.a = fVar;
        d0Var.getClass();
        this.b = d0Var;
    }

    @Override // java.util.Comparator
    public final int compare(F f, F f2) {
        com.google.common.base.f<F, ? extends T> fVar = this.a;
        return this.b.compare(fVar.apply(f), fVar.apply(f2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0964l) {
            C0964l c0964l = (C0964l) obj;
            if (this.a.equals(c0964l.a) && this.b.equals(c0964l.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return this.b + ".onResultOf(" + this.a + ")";
    }
}
