package Y1;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public String f1722a;

    /* renamed from: b, reason: collision with root package name */
    public String f1723b;

    /* renamed from: c, reason: collision with root package name */
    public String f1724c;

    /* renamed from: d, reason: collision with root package name */
    public v f1725d;

    /* renamed from: e, reason: collision with root package name */
    public String f1726e;
    public p f;

    /* renamed from: g, reason: collision with root package name */
    public List f1727g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (this.f1722a.equals(tVar.f1722a) && this.f1723b.equals(tVar.f1723b) && this.f1724c.equals(tVar.f1724c) && this.f1725d.equals(tVar.f1725d) && this.f1726e.equals(tVar.f1726e) && Objects.equals(this.f, tVar.f) && Objects.equals(this.f1727g, tVar.f1727g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1722a, this.f1723b, this.f1724c, this.f1725d, this.f1726e, this.f, this.f1727g);
    }
}
