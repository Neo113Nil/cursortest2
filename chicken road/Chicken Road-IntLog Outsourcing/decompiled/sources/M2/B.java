package M2;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public Long f1806a;

    /* renamed from: b, reason: collision with root package name */
    public Long f1807b;

    /* renamed from: c, reason: collision with root package name */
    public String f1808c;

    /* renamed from: d, reason: collision with root package name */
    public String f1809d;

    /* renamed from: e, reason: collision with root package name */
    public String f1810e;

    /* renamed from: f, reason: collision with root package name */
    public String f1811f;

    /* renamed from: g, reason: collision with root package name */
    public List f1812g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || B.class != obj.getClass()) {
            return false;
        }
        B b6 = (B) obj;
        return this.f1806a.equals(b6.f1806a) && this.f1807b.equals(b6.f1807b) && Objects.equals(this.f1808c, b6.f1808c) && this.f1809d.equals(b6.f1809d) && this.f1810e.equals(b6.f1810e) && this.f1811f.equals(b6.f1811f) && this.f1812g.equals(b6.f1812g);
    }

    public final int hashCode() {
        return Objects.hash(this.f1806a, this.f1807b, this.f1808c, this.f1809d, this.f1810e, this.f1811f, this.f1812g);
    }
}
