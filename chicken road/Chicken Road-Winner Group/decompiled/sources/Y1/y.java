package Y1;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public n f1753a;

    /* renamed from: b, reason: collision with root package name */
    public List f1754b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y.class == obj.getClass()) {
            y yVar = (y) obj;
            if (this.f1753a.equals(yVar.f1753a) && this.f1754b.equals(yVar.f1754b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1753a, this.f1754b);
    }
}
