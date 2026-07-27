package Y1;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public n f1636a;

    /* renamed from: b, reason: collision with root package name */
    public List f1637b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && A.class == obj.getClass()) {
            A a3 = (A) obj;
            if (this.f1636a.equals(a3.f1636a) && this.f1637b.equals(a3.f1637b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1636a, this.f1637b);
    }
}
