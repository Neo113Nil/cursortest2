package M2;

import java.util.Objects;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public Long f1911a;

    /* renamed from: b, reason: collision with root package name */
    public Long f1912b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return this.f1911a.equals(sVar.f1911a) && this.f1912b.equals(sVar.f1912b);
    }

    public final int hashCode() {
        return Objects.hash(this.f1911a, this.f1912b);
    }
}
