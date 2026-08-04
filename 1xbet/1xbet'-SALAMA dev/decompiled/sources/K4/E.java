package K4;

import U5.l0;
import com.google.protobuf.AbstractC0867k;
import com.google.protobuf.I;

/* JADX INFO: loaded from: classes2.dex */
public final class E extends P6.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F f3973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I f3974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC0867k f3975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l0 f3976f;

    public E(F f7, I i7, AbstractC0867k abstractC0867k, l0 l0Var) {
        p113p3.f.O("Got cause for a target change that was not a removal", l0Var == null || f7 == F.f3979c, new Object[0]);
        this.f3973c = f7;
        this.f3974d = i7;
        this.f3975e = abstractC0867k;
        if (l0Var == null || l0Var.e()) {
            this.f3976f = null;
        } else {
            this.f3976f = l0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || E.class != obj.getClass()) {
            return false;
        }
        E e7 = (E) obj;
        if (this.f3973c != e7.f3973c) {
            return false;
        }
        if (!((com.google.protobuf.G) this.f3974d).equals(e7.f3974d) || !this.f3975e.equals(e7.f3975e)) {
            return false;
        }
        l0 l0Var = e7.f3976f;
        l0 l0Var2 = this.f3976f;
        if (l0Var2 != null) {
            return l0Var != null && l0Var2.f6547a.equals(l0Var.f6547a);
        }
        return l0Var == null;
    }

    public final int hashCode() {
        int iHashCode = (this.f3975e.hashCode() + ((((com.google.protobuf.G) this.f3974d).hashCode() + (this.f3973c.hashCode() * 31)) * 31)) * 31;
        l0 l0Var = this.f3976f;
        return iHashCode + (l0Var != null ? l0Var.f6547a.hashCode() : 0);
    }

    public final String toString() {
        return "WatchTargetChange{changeType=" + this.f3973c + ", targetIds=" + this.f3974d + '}';
    }
}
