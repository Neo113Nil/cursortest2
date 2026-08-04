package p063i4;

import p096n1.e;
import p098n4.C0934g;
import p098n4.I;
import v4.c;
import v4.r;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f14010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0934g f14011b;

    public k(r rVar) {
        e eVar = new e(rVar, 18);
        C0934g c0934g = new C0934g("");
        this.f14010a = eVar;
        this.f14011b = c0934g;
        new I(c0934g).g(((r) eVar.f15314b).g(c0934g).getValue());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f14010a.equals(kVar.f14010a) && this.f14011b.equals(kVar.f14011b)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        c cVarB = this.f14011b.B();
        StringBuilder sb = new StringBuilder("MutableData { key = ");
        sb.append(cVarB != null ? cVarB.f17179a : "<none>");
        sb.append(", value = ");
        sb.append(((r) this.f14010a.f15314b).u(true));
        sb.append(" }");
        return sb.toString();
    }
}
