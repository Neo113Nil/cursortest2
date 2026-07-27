package y2;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f10622a;

    public g(Throwable th) {
        this.f10622a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return kotlin.jvm.internal.j.a(this.f10622a, ((g) obj).f10622a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f10622a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // y2.h
    public final String toString() {
        return "Closed(" + this.f10622a + ')';
    }
}
