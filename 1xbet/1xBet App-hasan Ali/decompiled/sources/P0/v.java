package P0;

import a.AbstractC0444a;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class v implements g {

    /* renamed from: a, reason: collision with root package name */
    public final int f4677a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4678b;

    public v(int i, int i5) {
        this.f4677a = i;
        this.f4678b = i5;
    }

    @Override // P0.g
    public final void a(h hVar) {
        int t5 = AbstractC0444a.t(this.f4677a, 0, ((M0.e) hVar.f4655p).c());
        int t6 = AbstractC0444a.t(this.f4678b, 0, ((M0.e) hVar.f4655p).c());
        if (t5 < t6) {
            hVar.h(t5, t6);
        } else {
            hVar.h(t6, t5);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f4677a == vVar.f4677a && this.f4678b == vVar.f4678b;
    }

    public final int hashCode() {
        return (this.f4677a * 31) + this.f4678b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.f4677a);
        sb.append(", end=");
        return AbstractC2107A.t(sb, this.f4678b, ')');
    }
}
