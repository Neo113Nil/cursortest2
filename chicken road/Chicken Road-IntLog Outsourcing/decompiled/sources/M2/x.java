package M2;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public String f1925a;

    /* renamed from: b, reason: collision with root package name */
    public String f1926b;

    /* renamed from: c, reason: collision with root package name */
    public String f1927c;

    /* renamed from: d, reason: collision with root package name */
    public z f1928d;

    /* renamed from: e, reason: collision with root package name */
    public String f1929e;

    /* renamed from: f, reason: collision with root package name */
    public t f1930f;

    /* renamed from: g, reason: collision with root package name */
    public List f1931g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        return this.f1925a.equals(xVar.f1925a) && this.f1926b.equals(xVar.f1926b) && this.f1927c.equals(xVar.f1927c) && this.f1928d.equals(xVar.f1928d) && this.f1929e.equals(xVar.f1929e) && Objects.equals(this.f1930f, xVar.f1930f) && Objects.equals(this.f1931g, xVar.f1931g);
    }

    public final int hashCode() {
        return Objects.hash(this.f1925a, this.f1926b, this.f1927c, this.f1928d, this.f1929e, this.f1930f, this.f1931g);
    }
}
