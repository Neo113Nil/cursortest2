package M2;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public r f1820a;

    /* renamed from: b, reason: collision with root package name */
    public List f1821b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || E.class != obj.getClass()) {
            return false;
        }
        E e3 = (E) obj;
        return this.f1820a.equals(e3.f1820a) && this.f1821b.equals(e3.f1821b);
    }

    public final int hashCode() {
        return Objects.hash(this.f1820a, this.f1821b);
    }
}
