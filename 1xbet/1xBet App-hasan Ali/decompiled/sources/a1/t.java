package a1;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6429a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6430b;

    /* renamed from: c, reason: collision with root package name */
    public final B f6431c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6432d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6433e;
    public final String f;

    public t() {
        B b3 = B.f6375k;
        this.f6429a = true;
        this.f6430b = true;
        this.f6431c = b3;
        this.f6432d = true;
        this.f6433e = true;
        this.f = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f6429a == tVar.f6429a && this.f6430b == tVar.f6430b && this.f6431c == tVar.f6431c && this.f6432d == tVar.f6432d && this.f6433e == tVar.f6433e;
    }

    public final int hashCode() {
        return ((((this.f6431c.hashCode() + ((((this.f6429a ? 1231 : 1237) * 31) + (this.f6430b ? 1231 : 1237)) * 31)) * 31) + (this.f6432d ? 1231 : 1237)) * 31) + (this.f6433e ? 1231 : 1237);
    }
}
