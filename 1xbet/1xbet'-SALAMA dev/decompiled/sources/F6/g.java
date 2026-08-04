package F6;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f2821a;

    public g(Throwable th) {
        this.f2821a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (t6.h.a(this.f2821a, ((g) obj).f2821a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f2821a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // F6.h
    public final String toString() {
        return "Closed(" + this.f2821a + ')';
    }
}
