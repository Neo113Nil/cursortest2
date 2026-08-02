package Q3;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Class f5818a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f5819b;

    public m(Class cls, Class cls2) {
        this.f5818a = cls;
        this.f5819b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return mVar.f5818a.equals(this.f5818a) && mVar.f5819b.equals(this.f5819b);
    }

    public final int hashCode() {
        return Objects.hash(this.f5818a, this.f5819b);
    }

    public final String toString() {
        return this.f5818a.getSimpleName() + " with primitive type: " + this.f5819b.getSimpleName();
    }
}
