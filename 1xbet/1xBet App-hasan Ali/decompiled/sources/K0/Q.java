package K0;

/* loaded from: classes.dex */
public final class Q implements InterfaceC0198c {

    /* renamed from: a, reason: collision with root package name */
    public final String f2809a;

    public Q(String str) {
        this.f2809a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Q) {
            return kotlin.jvm.internal.l.a(this.f2809a, ((Q) obj).f2809a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2809a.hashCode();
    }

    public final String toString() {
        return L1.a.p(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f2809a, ')');
    }
}
