package o0;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f1087a;

    public h(Throwable th) {
        this.f1087a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return g0.h.a(this.f1087a, ((h) obj).f1087a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f1087a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // o0.i
    public final String toString() {
        return "Closed(" + this.f1087a + ')';
    }
}
