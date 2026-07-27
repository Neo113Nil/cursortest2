package Y1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public Long f1709a;

    /* renamed from: b, reason: collision with root package name */
    public Long f1710b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f1709a.equals(oVar.f1709a) && this.f1710b.equals(oVar.f1710b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1709a, this.f1710b);
    }
}
