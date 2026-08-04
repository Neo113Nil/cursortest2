package p083l4;

import Y4.D;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f14981b;

    public r(ArrayList arrayList, HashMap map) {
        this.f14980a = arrayList;
        this.f14981b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f14980a.equals(rVar.f14980a)) {
            return this.f14981b.equals(rVar.f14981b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14981b.hashCode() + (this.f14980a.hashCode() * 31);
    }

    public final String toString() {
        return D.M(this.f14980a) + " (params: " + this.f14981b + ")";
    }
}
