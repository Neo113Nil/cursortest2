package Y1;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public Long f1747a;

    /* renamed from: b, reason: collision with root package name */
    public Long f1748b;

    /* renamed from: c, reason: collision with root package name */
    public String f1749c;

    /* renamed from: d, reason: collision with root package name */
    public String f1750d;

    /* renamed from: e, reason: collision with root package name */
    public String f1751e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public List f1752g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x.class == obj.getClass()) {
            x xVar = (x) obj;
            if (this.f1747a.equals(xVar.f1747a) && this.f1748b.equals(xVar.f1748b) && Objects.equals(this.f1749c, xVar.f1749c) && this.f1750d.equals(xVar.f1750d) && this.f1751e.equals(xVar.f1751e) && this.f.equals(xVar.f) && this.f1752g.equals(xVar.f1752g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1747a, this.f1748b, this.f1749c, this.f1750d, this.f1751e, this.f, this.f1752g);
    }
}
