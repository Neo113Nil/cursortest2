package i4;

import n1.C1450e;
import n4.C1473g;
import n4.I;
import v4.r;

/* renamed from: i4.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1274k {

    /* renamed from: a, reason: collision with root package name */
    public final C1450e f14004a;

    /* renamed from: b, reason: collision with root package name */
    public final C1473g f14005b;

    public C1274k(r rVar) {
        C1450e c1450e = new C1450e(rVar, 18);
        C1473g c1473g = new C1473g("");
        this.f14004a = c1450e;
        this.f14005b = c1473g;
        new I(c1473g).g(((r) c1450e.f15308b).g(c1473g).getValue());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1274k) {
            C1274k c1274k = (C1274k) obj;
            if (this.f14004a.equals(c1274k.f14004a) && this.f14005b.equals(c1274k.f14005b)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        v4.c B7 = this.f14005b.B();
        StringBuilder sb = new StringBuilder("MutableData { key = ");
        sb.append(B7 != null ? B7.f17173a : "<none>");
        sb.append(", value = ");
        sb.append(((r) this.f14004a.f15308b).u(true));
        sb.append(" }");
        return sb.toString();
    }
}
