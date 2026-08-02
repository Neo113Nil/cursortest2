package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class WG {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f12034a;

    public final int a(int i) {
        SparseBooleanArray sparseBooleanArray = this.f12034a;
        AbstractC1668us.n(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WG)) {
            return false;
        }
        WG wg = (WG) obj;
        int i = AbstractC1260lo.f14419a;
        SparseBooleanArray sparseBooleanArray = this.f12034a;
        if (i >= 24) {
            return sparseBooleanArray.equals(wg.f12034a);
        }
        if (sparseBooleanArray.size() != wg.f12034a.size()) {
            return false;
        }
        for (int i5 = 0; i5 < sparseBooleanArray.size(); i5++) {
            if (a(i5) != wg.a(i5)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = AbstractC1260lo.f14419a;
        SparseBooleanArray sparseBooleanArray = this.f12034a;
        if (i >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i5 = 0; i5 < sparseBooleanArray.size(); i5++) {
            size = (size * 31) + a(i5);
        }
        return size;
    }
}
