package I;

import h0.C1988b;
import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final E.N f2548a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2549b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2550c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2551d;

    public z(E.N n5, long j5, int i, boolean z3) {
        this.f2548a = n5;
        this.f2549b = j5;
        this.f2550c = i;
        this.f2551d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f2548a == zVar.f2548a && C1988b.b(this.f2549b, zVar.f2549b) && this.f2550c == zVar.f2550c && this.f2551d == zVar.f2551d;
    }

    public final int hashCode() {
        return ((AbstractC2462i.b(this.f2550c) + ((C1988b.f(this.f2549b) + (this.f2548a.hashCode() * 31)) * 31)) * 31) + (this.f2551d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.f2548a);
        sb.append(", position=");
        sb.append((Object) C1988b.j(this.f2549b));
        sb.append(", anchor=");
        int i = this.f2550c;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "Right" : "Middle" : "Left");
        sb.append(", visible=");
        sb.append(this.f2551d);
        sb.append(')');
        return sb.toString();
    }
}
