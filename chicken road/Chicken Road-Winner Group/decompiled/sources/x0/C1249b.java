package x0;

/* renamed from: x0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1249b {

    /* renamed from: a, reason: collision with root package name */
    public final String f10539a;

    public C1249b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f10539a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1249b)) {
            return false;
        }
        return this.f10539a.equals(((C1249b) obj).f10539a);
    }

    public final int hashCode() {
        return this.f10539a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return B0.c.l(new StringBuilder("Encoding{name=\""), this.f10539a, "\"}");
    }
}
