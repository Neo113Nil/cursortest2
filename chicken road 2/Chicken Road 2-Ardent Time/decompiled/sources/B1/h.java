package B1;

/* loaded from: classes.dex */
public final class h extends B1.i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Throwable f44a;

    public h(java.lang.Throwable th) {
        this.f44a = th;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof B1.h) {
            if (kotlin.jvm.internal.i.a(this.f44a, ((B1.h) obj).f44a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Throwable th = this.f44a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // B1.i
    public final java.lang.String toString() {
        return "Closed(" + this.f44a + ')';
    }
}
