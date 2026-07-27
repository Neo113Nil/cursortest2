package Y1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public String f1638a;

    /* renamed from: b, reason: collision with root package name */
    public v f1639b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && B.class == obj.getClass()) {
            B b3 = (B) obj;
            if (this.f1638a.equals(b3.f1638a) && this.f1639b.equals(b3.f1639b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1638a, this.f1639b);
    }
}
