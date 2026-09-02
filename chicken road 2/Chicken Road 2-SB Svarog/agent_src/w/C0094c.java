package w;

/* renamed from: w.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0094c {

    /* renamed from: a, reason: collision with root package name */
    public final t.b f1286a;

    /* renamed from: b, reason: collision with root package name */
    public final C0093b f1287b;

    /* renamed from: c, reason: collision with root package name */
    public final C0093b f1288c;

    public C0094c(t.b bVar, C0093b c0093b, C0093b c0093b2) {
        int i2 = bVar.f1252b;
        this.f1286a = bVar;
        this.f1287b = c0093b;
        this.f1288c = c0093b2;
        int i3 = bVar.f1253c;
        int i4 = bVar.f1251a;
        if (i3 - i4 == 0 && bVar.f1254d - i2 == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (i4 != 0 && i2 != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0094c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        g0.h.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        C0094c c0094c = (C0094c) obj;
        return g0.h.a(this.f1286a, c0094c.f1286a) && g0.h.a(this.f1287b, c0094c.f1287b) && g0.h.a(this.f1288c, c0094c.f1288c);
    }

    public final int hashCode() {
        return this.f1288c.hashCode() + ((this.f1287b.hashCode() + (this.f1286a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return C0094c.class.getSimpleName() + " { " + this.f1286a + ", type=" + this.f1287b + ", state=" + this.f1288c + " }";
    }
}
