package Y1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public Long f1711a;

    /* renamed from: b, reason: collision with root package name */
    public String f1712b;

    /* renamed from: c, reason: collision with root package name */
    public String f1713c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f1711a.equals(pVar.f1711a) && this.f1712b.equals(pVar.f1712b) && this.f1713c.equals(pVar.f1713c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1711a, this.f1712b, this.f1713c);
    }
}
