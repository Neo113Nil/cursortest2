package M2;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public r f1813a;

    /* renamed from: b, reason: collision with root package name */
    public List f1814b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C.class != obj.getClass()) {
            return false;
        }
        C c2 = (C) obj;
        return this.f1813a.equals(c2.f1813a) && this.f1814b.equals(c2.f1814b);
    }

    public final int hashCode() {
        return Objects.hash(this.f1813a, this.f1814b);
    }
}
