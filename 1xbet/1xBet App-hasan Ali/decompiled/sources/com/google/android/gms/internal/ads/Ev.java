package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class Ev extends AbstractC1716vv implements Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return C1112iH.f13929j.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Ev)) {
            return false;
        }
        Vu vu = C1112iH.f13929j;
        ((Ev) obj).getClass();
        return vu.equals(vu);
    }

    public final int hashCode() {
        return -C1112iH.f13929j.hashCode();
    }

    public final String toString() {
        return C1112iH.f13929j.toString().concat(".reverse()");
    }
}
