package Y1;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public String f1648a;

    /* renamed from: b, reason: collision with root package name */
    public String f1649b;

    /* renamed from: c, reason: collision with root package name */
    public String f1650c;

    /* renamed from: d, reason: collision with root package name */
    public List f1651d;

    /* renamed from: e, reason: collision with root package name */
    public List f1652e;
    public o f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && E.class == obj.getClass()) {
            E e3 = (E) obj;
            if (this.f1648a.equals(e3.f1648a) && Objects.equals(this.f1649b, e3.f1649b) && this.f1650c.equals(e3.f1650c) && this.f1651d.equals(e3.f1651d) && this.f1652e.equals(e3.f1652e) && Objects.equals(this.f, e3.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1648a, this.f1649b, this.f1650c, this.f1651d, this.f1652e, this.f);
    }
}
