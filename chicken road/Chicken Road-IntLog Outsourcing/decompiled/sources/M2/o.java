package M2;

import java.util.Objects;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public r f1886a;

    /* renamed from: b, reason: collision with root package name */
    public String f1887b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return this.f1886a.equals(oVar.f1886a) && this.f1887b.equals(oVar.f1887b);
    }

    public final int hashCode() {
        return Objects.hash(this.f1886a, this.f1887b);
    }
}
