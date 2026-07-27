package Y1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public String f1656a;

    /* renamed from: b, reason: collision with root package name */
    public String f1657b;

    /* renamed from: c, reason: collision with root package name */
    public v f1658c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && G.class == obj.getClass()) {
            G g3 = (G) obj;
            if (this.f1656a.equals(g3.f1656a) && Objects.equals(this.f1657b, g3.f1657b) && this.f1658c.equals(g3.f1658c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1656a, this.f1657b, this.f1658c);
    }
}
