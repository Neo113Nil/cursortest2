package K0;

/* renamed from: K0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0208m extends AbstractC0210o {

    /* renamed from: a, reason: collision with root package name */
    public final String f2842a;

    /* renamed from: b, reason: collision with root package name */
    public final M f2843b;

    public C0208m(String str, M m5) {
        this.f2842a = str;
        this.f2843b = m5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0208m)) {
            return false;
        }
        C0208m c0208m = (C0208m) obj;
        if (!kotlin.jvm.internal.l.a(this.f2842a, c0208m.f2842a)) {
            return false;
        }
        if (!kotlin.jvm.internal.l.a(this.f2843b, c0208m.f2843b)) {
            return false;
        }
        c0208m.getClass();
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f2842a.hashCode() * 31;
        M m5 = this.f2843b;
        return (hashCode + (m5 != null ? m5.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return L1.a.p(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f2842a, ')');
    }
}
