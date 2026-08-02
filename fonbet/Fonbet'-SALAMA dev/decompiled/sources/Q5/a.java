package Q5;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f5843a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        return this.f5843a.equals(((a) obj).f5843a);
    }

    public final int hashCode() {
        return Objects.hash(this.f5843a);
    }
}
