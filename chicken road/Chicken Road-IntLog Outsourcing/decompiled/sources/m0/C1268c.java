package m0;

/* renamed from: m0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1268c {

    /* renamed from: a, reason: collision with root package name */
    public final j0.b f11098a;

    /* renamed from: b, reason: collision with root package name */
    public final C1267b f11099b;

    /* renamed from: c, reason: collision with root package name */
    public final C1267b f11100c;

    public C1268c(j0.b bVar, C1267b c1267b, C1267b c1267b2) {
        this.f11098a = bVar;
        this.f11099b = c1267b;
        this.f11100c = c1267b2;
        if (bVar.b() == 0 && bVar.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (bVar.f10441a != 0 && bVar.f10442b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1268c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        C1268c c1268c = (C1268c) obj;
        return kotlin.jvm.internal.i.a(this.f11098a, c1268c.f11098a) && kotlin.jvm.internal.i.a(this.f11099b, c1268c.f11099b) && kotlin.jvm.internal.i.a(this.f11100c, c1268c.f11100c);
    }

    public final int hashCode() {
        return this.f11100c.hashCode() + ((this.f11099b.hashCode() + (this.f11098a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return C1268c.class.getSimpleName() + " { " + this.f11098a + ", type=" + this.f11099b + ", state=" + this.f11100c + " }";
    }
}
