package w;

import h0.C1988b;

/* loaded from: classes.dex */
public final class k extends l {

    /* renamed from: a, reason: collision with root package name */
    public final long f20477a;

    public k(long j5) {
        this.f20477a = j5;
        if (!G4.d.C(j5)) {
            throw new IllegalStateException("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        return C1988b.b(this.f20477a, ((k) obj).f20477a);
    }

    public final int hashCode() {
        return C1988b.f(this.f20477a);
    }

    public final String toString() {
        return "Open(offset=" + ((Object) C1988b.j(this.f20477a)) + ')';
    }
}
