package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.qu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1491qu implements Serializable, InterfaceC1446pu {

    /* renamed from: k, reason: collision with root package name */
    public final List f15184k;

    public final boolean equals(Object obj) {
        if (obj instanceof C1491qu) {
            return this.f15184k.equals(((C1491qu) obj).f15184k);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15184k.hashCode() + 306654252;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1446pu
    public final boolean k(Object obj) {
        int i = 0;
        while (true) {
            List list = this.f15184k;
            if (i >= list.size()) {
                return true;
            }
            if (!((InterfaceC1446pu) list.get(i)).k(obj)) {
                return false;
            }
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z3 = true;
        for (Object obj : this.f15184k) {
            if (!z3) {
                sb.append(',');
            }
            sb.append(obj);
            z3 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
