package r4;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f19143a;

    public h(Throwable th) {
        this.f19143a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return kotlin.jvm.internal.l.a(this.f19143a, ((h) obj).f19143a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f19143a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // r4.i
    public final String toString() {
        return "Closed(" + this.f19143a + ')';
    }
}
