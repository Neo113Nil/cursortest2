package I4;

import com.google.firebase.Timestamp;

/* loaded from: classes2.dex */
public final class e extends h {
    @Override // I4.h
    public final f a(H4.k kVar, f fVar, Timestamp timestamp) {
        j(kVar);
        if (!this.f3671b.b(kVar)) {
            return fVar;
        }
        kVar.b(kVar.f3325c);
        kVar.f3328f = 1;
        kVar.f3325c = H4.n.f3332b;
        return null;
    }

    @Override // I4.h
    public final void b(H4.k kVar, k kVar2) {
        j(kVar);
        p3.f.O("Transform results received by DeleteMutation.", kVar2.f3684b.isEmpty(), new Object[0]);
        kVar.b(kVar2.f3683a);
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
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        return e((e) obj);
    }

    public final int hashCode() {
        return f();
    }

    public final String toString() {
        return "DeleteMutation{" + g() + "}";
    }
}
