package Y1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public n f1686a;

    /* renamed from: b, reason: collision with root package name */
    public String f1687b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f1686a.equals(kVar.f1686a) && this.f1687b.equals(kVar.f1687b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1686a, this.f1687b);
    }
}
