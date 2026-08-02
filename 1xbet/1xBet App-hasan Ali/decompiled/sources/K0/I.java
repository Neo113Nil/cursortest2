package K0;

/* loaded from: classes.dex */
public final class I implements InterfaceC0198c {

    /* renamed from: a, reason: collision with root package name */
    public final String f2781a;

    public final boolean equals(Object obj) {
        if (obj instanceof I) {
            return kotlin.jvm.internal.l.a(this.f2781a, ((I) obj).f2781a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2781a.hashCode();
    }

    public final String toString() {
        return "StringAnnotation(value=" + this.f2781a + ')';
    }
}
