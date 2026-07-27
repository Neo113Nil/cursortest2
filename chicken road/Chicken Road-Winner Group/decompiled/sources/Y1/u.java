package Y1;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public n f1728a;

    /* renamed from: b, reason: collision with root package name */
    public List f1729b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (this.f1728a.equals(uVar.f1728a) && this.f1729b.equals(uVar.f1729b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1728a, this.f1729b);
    }
}
