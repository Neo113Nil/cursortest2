package Y1;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public List f1714a;

    /* renamed from: b, reason: collision with root package name */
    public String f1715b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f1714a.equals(qVar.f1714a) && this.f1715b.equals(qVar.f1715b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1714a, this.f1715b);
    }
}
