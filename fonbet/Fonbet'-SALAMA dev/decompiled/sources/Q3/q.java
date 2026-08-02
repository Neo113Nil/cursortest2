package Q3;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Class f5829a;

    /* renamed from: b, reason: collision with root package name */
    public final X3.a f5830b;

    public q(Class cls, X3.a aVar) {
        this.f5829a = cls;
        this.f5830b = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.f5829a.equals(this.f5829a) && qVar.f5830b.equals(this.f5830b);
    }

    public final int hashCode() {
        return Objects.hash(this.f5829a, this.f5830b);
    }

    public final String toString() {
        return this.f5829a.getSimpleName() + ", object identifier: " + this.f5830b;
    }
}
