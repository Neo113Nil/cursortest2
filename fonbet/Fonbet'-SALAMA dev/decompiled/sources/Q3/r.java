package Q3;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Class f5831a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f5832b;

    public r(Class cls, Class cls2) {
        this.f5831a = cls;
        this.f5832b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return rVar.f5831a.equals(this.f5831a) && rVar.f5832b.equals(this.f5832b);
    }

    public final int hashCode() {
        return Objects.hash(this.f5831a, this.f5832b);
    }

    public final String toString() {
        return this.f5831a.getSimpleName() + " with serialization type: " + this.f5832b.getSimpleName();
    }
}
