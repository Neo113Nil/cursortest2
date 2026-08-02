package K0;

/* renamed from: K0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0209n extends AbstractC0210o {

    /* renamed from: a, reason: collision with root package name */
    public final String f2844a;

    /* renamed from: b, reason: collision with root package name */
    public final M f2845b;

    public C0209n(String str, M m5) {
        this.f2844a = str;
        this.f2845b = m5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0209n)) {
            return false;
        }
        C0209n c0209n = (C0209n) obj;
        if (!kotlin.jvm.internal.l.a(this.f2844a, c0209n.f2844a)) {
            return false;
        }
        if (!kotlin.jvm.internal.l.a(this.f2845b, c0209n.f2845b)) {
            return false;
        }
        c0209n.getClass();
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f2844a.hashCode() * 31;
        M m5 = this.f2845b;
        return (hashCode + (m5 != null ? m5.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return L1.a.p(new StringBuilder("LinkAnnotation.Url(url="), this.f2844a, ')');
    }
}
