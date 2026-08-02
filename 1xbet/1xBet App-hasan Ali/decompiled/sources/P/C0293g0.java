package P;

/* renamed from: P.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0293g0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4470a;

    public C0293g0(String str) {
        this.f4470a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0293g0) && kotlin.jvm.internal.l.a(this.f4470a, ((C0293g0) obj).f4470a);
    }

    public final int hashCode() {
        return this.f4470a.hashCode();
    }

    public final String toString() {
        return L1.a.p(new StringBuilder("OpaqueKey(key="), this.f4470a, ')');
    }
}
