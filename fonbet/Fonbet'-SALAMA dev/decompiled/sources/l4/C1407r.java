package l4;

import Y4.D;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: l4.r, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1407r {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14974a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f14975b;

    public C1407r(ArrayList arrayList, HashMap hashMap) {
        this.f14974a = arrayList;
        this.f14975b = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1407r)) {
            return false;
        }
        C1407r c1407r = (C1407r) obj;
        if (this.f14974a.equals(c1407r.f14974a)) {
            return this.f14975b.equals(c1407r.f14975b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14975b.hashCode() + (this.f14974a.hashCode() * 31);
    }

    public final String toString() {
        return D.M(this.f14974a) + " (params: " + this.f14975b + ")";
    }
}
