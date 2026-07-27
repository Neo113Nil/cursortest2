package M2;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public List f1916a;

    /* renamed from: b, reason: collision with root package name */
    public String f1917b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        return this.f1916a.equals(uVar.f1916a) && this.f1917b.equals(uVar.f1917b);
    }

    public final int hashCode() {
        return Objects.hash(this.f1916a, this.f1917b);
    }
}
