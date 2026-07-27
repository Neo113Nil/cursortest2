package Y1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public m f1707a;

    /* renamed from: b, reason: collision with root package name */
    public String f1708b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (this.f1707a.equals(nVar.f1707a) && this.f1708b.equals(nVar.f1708b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1707a, this.f1708b);
    }
}
