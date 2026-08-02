package K0;

/* loaded from: classes.dex */
public final class P implements InterfaceC0198c {

    /* renamed from: a, reason: collision with root package name */
    public final String f2808a;

    public P(String str) {
        this.f2808a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof P) {
            return kotlin.jvm.internal.l.a(this.f2808a, ((P) obj).f2808a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2808a.hashCode();
    }

    public final String toString() {
        return L1.a.p(new StringBuilder("UrlAnnotation(url="), this.f2808a, ')');
    }
}
