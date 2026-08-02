package G2;

import E2.j;
import E2.o;
import u2.C2498m;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: b, reason: collision with root package name */
    public final int f1977b;

    public a(int i) {
        this.f1977b = i;
        if (i <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // G2.e
    public final f a(C2498m c2498m, j jVar) {
        return !(jVar instanceof o) ? new d(c2498m, jVar) : ((o) jVar).f1479c == v2.e.f20402k ? new d(c2498m, jVar) : new b(c2498m, jVar, this.f1977b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f1977b == ((a) obj).f1977b;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f1977b * 31) + 1237;
    }
}
