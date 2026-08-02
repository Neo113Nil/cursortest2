package M;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f3332a = i0.p.f17293g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            return i0.p.c(this.f3332a, ((f0) obj).f3332a);
        }
        return false;
    }

    public final int hashCode() {
        return i0.p.i(this.f3332a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) i0.p.j(this.f3332a)) + ", rippleAlpha=null)";
    }
}
