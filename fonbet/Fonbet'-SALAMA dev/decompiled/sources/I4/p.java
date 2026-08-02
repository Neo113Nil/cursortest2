package I4;

import com.google.firebase.Timestamp;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class p extends h {

    /* renamed from: d, reason: collision with root package name */
    public final H4.l f3692d;

    public p(H4.h hVar, H4.l lVar, n nVar, List list) {
        super(hVar, nVar, list);
        this.f3692d = lVar;
    }

    @Override // I4.h
    public final f a(H4.k kVar, f fVar, Timestamp timestamp) {
        j(kVar);
        if (!this.f3671b.b(kVar)) {
            return fVar;
        }
        HashMap h6 = h(timestamp, kVar);
        H4.l lVar = new H4.l(this.f3692d.b());
        lVar.h(h6);
        kVar.a(kVar.f3325c, lVar);
        kVar.f3328f = 1;
        kVar.f3325c = H4.n.f3332b;
        return null;
    }

    @Override // I4.h
    public final void b(H4.k kVar, k kVar2) {
        j(kVar);
        H4.l lVar = new H4.l(this.f3692d.b());
        lVar.h(i(kVar, kVar2.f3684b));
        kVar.a(kVar2.f3683a, lVar);
        kVar.f3328f = 2;
    }

    @Override // I4.h
    public final f d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return e(pVar) && this.f3692d.equals(pVar.f3692d) && this.f3672c.equals(pVar.f3672c);
    }

    public final int hashCode() {
        return this.f3692d.hashCode() + (f() * 31);
    }

    public final String toString() {
        return "SetMutation{" + g() + ", value=" + this.f3692d + "}";
    }
}
