package q4;

import n4.C1473g;
import n4.C1480n;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public C1480n f15859a;

    /* renamed from: b, reason: collision with root package name */
    public C1473g f15860b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f15859a.equals(fVar.f15859a)) {
            return this.f15860b.equals(fVar.f15860b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15860b.hashCode() + (this.f15859a.hashCode() * 31);
    }
}
