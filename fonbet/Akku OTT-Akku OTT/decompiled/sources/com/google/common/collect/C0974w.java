package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.google.common.collect.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0974w<T> extends d0<T> implements Serializable {
    private static final long serialVersionUID = 0;
    public final Comparator<? super T>[] a;

    public C0974w(C0964l c0964l, C0964l c0964l2) {
        this.a = new Comparator[]{c0964l, c0964l2};
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int i = 0;
        while (true) {
            Comparator<? super T>[] comparatorArr = this.a;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i].compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0974w) {
            return Arrays.equals(this.a, ((C0974w) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return androidx.concurrent.futures.a.a(new StringBuilder("Ordering.compound("), Arrays.toString(this.a), ")");
    }
}
