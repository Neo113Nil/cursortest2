package V0;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    public static final s f5957c = new s(2, false);

    /* renamed from: d, reason: collision with root package name */
    public static final s f5958d = new s(1, true);

    /* renamed from: a, reason: collision with root package name */
    public final int f5959a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5960b;

    public s(int i, boolean z3) {
        this.f5959a = i;
        this.f5960b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f5959a == sVar.f5959a && this.f5960b == sVar.f5960b;
    }

    public final int hashCode() {
        return (this.f5959a * 31) + (this.f5960b ? 1231 : 1237);
    }

    public final String toString() {
        return equals(f5957c) ? "TextMotion.Static" : equals(f5958d) ? "TextMotion.Animated" : "Invalid";
    }
}
