package R6;

import R6.o;

/* loaded from: classes9.dex */
final class i extends o {

    /* renamed from: a, reason: collision with root package name */
    private final o.c f24741a;

    /* renamed from: b, reason: collision with root package name */
    private final o.b f24742b;

    static final class a extends o.a {

        /* renamed from: a, reason: collision with root package name */
        private o.c f24743a;

        /* renamed from: b, reason: collision with root package name */
        private o.b f24744b;

        @Override // R6.o.a
        public final o a() {
            return new i(this.f24743a, this.f24744b);
        }

        @Override // R6.o.a
        public final o.a b(o.b bVar) {
            this.f24744b = bVar;
            return this;
        }

        @Override // R6.o.a
        public final o.a c(o.c cVar) {
            this.f24743a = cVar;
            return this;
        }
    }

    i(o.c cVar, o.b bVar) {
        this.f24741a = cVar;
        this.f24742b = bVar;
    }

    @Override // R6.o
    public final o.b b() {
        return this.f24742b;
    }

    @Override // R6.o
    public final o.c c() {
        return this.f24741a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.c cVar = this.f24741a;
        if (cVar == null) {
            if (oVar.c() != null) {
                return false;
            }
        } else if (!cVar.equals(oVar.c())) {
            return false;
        }
        o.b bVar = this.f24742b;
        return bVar == null ? oVar.b() == null : bVar.equals(oVar.b());
    }

    public final int hashCode() {
        o.c cVar = this.f24741a;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f24742b;
        return (bVar != null ? bVar.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f24741a + ", mobileSubtype=" + this.f24742b + "}";
    }
}
