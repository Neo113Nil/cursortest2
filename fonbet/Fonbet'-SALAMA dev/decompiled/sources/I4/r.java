package I4;

import com.google.firebase.Timestamp;

/* loaded from: classes2.dex */
public final class r extends h {
    @Override // I4.h
    public final f a(H4.k kVar, f fVar, Timestamp timestamp) {
        p3.f.F("VerifyMutation should only be used in Transactions.", new Object[0]);
        throw null;
    }

    @Override // I4.h
    public final void b(H4.k kVar, k kVar2) {
        p3.f.F("VerifyMutation should only be used in Transactions.", new Object[0]);
        throw null;
    }

    @Override // I4.h
    public final f d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        return e((r) obj);
    }

    public final int hashCode() {
        return f();
    }

    public final String toString() {
        return "VerifyMutation{" + g() + "}";
    }
}
