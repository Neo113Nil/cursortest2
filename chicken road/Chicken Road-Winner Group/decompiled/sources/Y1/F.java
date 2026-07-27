package Y1;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public String f1653a;

    /* renamed from: b, reason: collision with root package name */
    public String f1654b;

    /* renamed from: c, reason: collision with root package name */
    public List f1655c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && F.class == obj.getClass()) {
            F f = (F) obj;
            if (Objects.equals(this.f1653a, f.f1653a) && this.f1654b.equals(f.f1654b) && this.f1655c.equals(f.f1655c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1653a, this.f1654b, this.f1655c);
    }
}
