package V2;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Q2.b f3236a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3237b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3238c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f3239d;

    public e(Q2.b bVar, String str) {
        this.f3236a = bVar;
        this.f3237b = str;
        this.f3238c = ((bVar.hashCode() ^ 1000003) * 1000003) ^ str.hashCode();
    }

    public static e a(Q2.b bVar, String str) {
        if (str == null) {
            str = "";
        }
        return new e(bVar, str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f3236a.equals(eVar.f3236a) && this.f3237b.equals(eVar.f3237b);
    }

    public final int hashCode() {
        return this.f3238c;
    }

    public final String toString() {
        return this.f3237b;
    }
}
