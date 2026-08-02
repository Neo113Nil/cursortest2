package R6;

import R6.k;

/* loaded from: classes9.dex */
final class e extends k {

    /* renamed from: a, reason: collision with root package name */
    private final k.b f24708a;

    /* renamed from: b, reason: collision with root package name */
    private final R6.a f24709b;

    static final class a extends k.a {

        /* renamed from: a, reason: collision with root package name */
        private k.b f24710a;

        /* renamed from: b, reason: collision with root package name */
        private R6.a f24711b;

        @Override // R6.k.a
        public final k a() {
            return new e(this.f24710a, this.f24711b);
        }

        @Override // R6.k.a
        public final k.a b(R6.a aVar) {
            this.f24711b = aVar;
            return this;
        }

        @Override // R6.k.a
        public final k.a c(k.b bVar) {
            this.f24710a = bVar;
            return this;
        }
    }

    e(k.b bVar, R6.a aVar) {
        this.f24708a = bVar;
        this.f24709b = aVar;
    }

    @Override // R6.k
    public final R6.a b() {
        return this.f24709b;
    }

    @Override // R6.k
    public final k.b c() {
        return this.f24708a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        k.b bVar = this.f24708a;
        if (bVar == null) {
            if (kVar.c() != null) {
                return false;
            }
        } else if (!bVar.equals(kVar.c())) {
            return false;
        }
        R6.a aVar = this.f24709b;
        return aVar == null ? kVar.b() == null : aVar.equals(kVar.b());
    }

    public final int hashCode() {
        k.b bVar = this.f24708a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        R6.a aVar = this.f24709b;
        return (aVar != null ? aVar.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f24708a + ", androidClientInfo=" + this.f24709b + "}";
    }
}
