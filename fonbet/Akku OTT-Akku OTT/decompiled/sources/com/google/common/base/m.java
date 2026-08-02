package com.google.common.base;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes4.dex */
public final class m<T> implements l<T>, Serializable {
    private static final long serialVersionUID = 0;
    public final List<? extends l<? super T>> a;

    public m() {
        throw null;
    }

    public m(List list) {
        this.a = list;
    }

    @Override // com.google.common.base.l
    public final boolean apply(T t) {
        int i = 0;
        while (true) {
            List<? extends l<? super T>> list = this.a;
            if (i >= list.size()) {
                return true;
            }
            if (!list.get(i).apply(t)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.a.equals(((m) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (T t : this.a) {
            if (!z) {
                sb.append(',');
            }
            sb.append(t);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
