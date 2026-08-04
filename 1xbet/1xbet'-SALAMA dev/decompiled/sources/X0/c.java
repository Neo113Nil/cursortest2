package X0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U0.b f7433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f7434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f7435c;

    public c(U0.b bVar, b bVar2, b bVar3) {
        this.f7433a = bVar;
        this.f7434b = bVar2;
        this.f7435c = bVar3;
        if (bVar.b() == 0 && bVar.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (bVar.f6375a != 0 && bVar.f6376b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean a() {
        b bVar = b.f7423A;
        b bVar2 = this.f7434b;
        if (t6.h.a(bVar2, bVar)) {
            return true;
        }
        if (t6.h.a(bVar2, b.f7430z)) {
            if (t6.h.a(this.f7435c, b.f7429y)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        t6.h.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        c cVar = (c) obj;
        return t6.h.a(this.f7433a, cVar.f7433a) && t6.h.a(this.f7434b, cVar.f7434b) && t6.h.a(this.f7435c, cVar.f7435c);
    }

    public final int hashCode() {
        return this.f7435c.hashCode() + ((this.f7434b.hashCode() + (this.f7433a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return c.class.getSimpleName() + " { " + this.f7433a + ", type=" + this.f7434b + ", state=" + this.f7435c + " }";
    }
}
