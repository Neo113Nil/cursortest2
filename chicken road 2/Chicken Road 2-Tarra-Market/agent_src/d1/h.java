package d1;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f938a;

    public h(Throwable th) {
        this.f938a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (kotlin.jvm.internal.j.a(this.f938a, ((h) obj).f938a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f938a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // d1.i
    public final String toString() {
        return "Closed(" + this.f938a + ')';
    }
}
