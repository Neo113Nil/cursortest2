package H4;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final h f3323a;

    /* renamed from: b, reason: collision with root package name */
    public int f3324b;

    /* renamed from: c, reason: collision with root package name */
    public n f3325c;

    /* renamed from: d, reason: collision with root package name */
    public n f3326d;

    /* renamed from: e, reason: collision with root package name */
    public l f3327e;

    /* renamed from: f, reason: collision with root package name */
    public int f3328f;

    public k(h hVar) {
        this.f3323a = hVar;
        this.f3326d = n.f3332b;
    }

    public static k g(h hVar) {
        n nVar = n.f3332b;
        return new k(hVar, 1, nVar, nVar, new l(), 3);
    }

    public static k h(h hVar, n nVar) {
        k kVar = new k(hVar);
        kVar.b(nVar);
        return kVar;
    }

    public final void a(n nVar, l lVar) {
        this.f3325c = nVar;
        this.f3324b = 2;
        this.f3327e = lVar;
        this.f3328f = 3;
    }

    public final void b(n nVar) {
        this.f3325c = nVar;
        this.f3324b = 3;
        this.f3327e = new l();
        this.f3328f = 3;
    }

    public final boolean c() {
        return t.e.b(this.f3328f, 1);
    }

    public final boolean d() {
        return t.e.b(this.f3324b, 2);
    }

    public final boolean e() {
        return t.e.b(this.f3324b, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f3323a.equals(kVar.f3323a) && this.f3325c.equals(kVar.f3325c) && t.e.b(this.f3324b, kVar.f3324b) && t.e.b(this.f3328f, kVar.f3328f)) {
            return this.f3327e.equals(kVar.f3327e);
        }
        return false;
    }

    public final k f() {
        return new k(this.f3323a, this.f3324b, this.f3325c, this.f3326d, new l(this.f3327e.b()), this.f3328f);
    }

    public final int hashCode() {
        return this.f3323a.f3318a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Document{key=");
        sb.append(this.f3323a);
        sb.append(", version=");
        sb.append(this.f3325c);
        sb.append(", readTime=");
        sb.append(this.f3326d);
        sb.append(", type=");
        int i7 = this.f3324b;
        sb.append(i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "null" : "UNKNOWN_DOCUMENT" : "NO_DOCUMENT" : "FOUND_DOCUMENT" : "INVALID");
        sb.append(", documentState=");
        int i8 = this.f3328f;
        sb.append(i8 != 1 ? i8 != 2 ? i8 != 3 ? "null" : "SYNCED" : "HAS_COMMITTED_MUTATIONS" : "HAS_LOCAL_MUTATIONS");
        sb.append(", value=");
        sb.append(this.f3327e);
        sb.append('}');
        return sb.toString();
    }

    public k(h hVar, int i7, n nVar, n nVar2, l lVar, int i8) {
        this.f3323a = hVar;
        this.f3325c = nVar;
        this.f3326d = nVar2;
        this.f3324b = i7;
        this.f3328f = i8;
        this.f3327e = lVar;
    }
}
