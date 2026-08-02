package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: com.google.common.collect.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0972u<T> extends d0<T> implements Serializable {
    private static final long serialVersionUID = 0;
    public final Comparator<T> a;

    public C0972u(Comparator<T> comparator) {
        this.a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return this.a.compare(t, t2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0972u) {
            return this.a.equals(((C0972u) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
