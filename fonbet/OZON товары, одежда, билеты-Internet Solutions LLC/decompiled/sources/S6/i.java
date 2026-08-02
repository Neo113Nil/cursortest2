package S6;

import S6.q;

/* loaded from: classes9.dex */
final class i extends q {

    /* renamed from: a, reason: collision with root package name */
    private final r f25905a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25906b;

    /* renamed from: c, reason: collision with root package name */
    private final Q6.d<?> f25907c;

    /* renamed from: d, reason: collision with root package name */
    private final Q6.g<?, byte[]> f25908d;

    /* renamed from: e, reason: collision with root package name */
    private final Q6.c f25909e;

    static final class a extends q.a {

        /* renamed from: a, reason: collision with root package name */
        private r f25910a;

        /* renamed from: b, reason: collision with root package name */
        private String f25911b;

        /* renamed from: c, reason: collision with root package name */
        private Q6.d<?> f25912c;

        /* renamed from: d, reason: collision with root package name */
        private Q6.g<?, byte[]> f25913d;

        /* renamed from: e, reason: collision with root package name */
        private Q6.c f25914e;

        public final i a() {
            String str = this.f25910a == null ? " transportContext" : "";
            if (this.f25911b == null) {
                str = str.concat(" transportName");
            }
            if (this.f25912c == null) {
                str = U7.d.e(str, " event");
            }
            if (this.f25913d == null) {
                str = U7.d.e(str, " transformer");
            }
            if (this.f25914e == null) {
                str = U7.d.e(str, " encoding");
            }
            if (str.isEmpty()) {
                return new i(this.f25910a, this.f25911b, this.f25912c, this.f25913d, this.f25914e);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        final q.a b(Q6.c cVar) {
            this.f25914e = cVar;
            return this;
        }

        final q.a c(Q6.d<?> dVar) {
            if (dVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f25912c = dVar;
            return this;
        }

        final q.a d(Q6.g<?, byte[]> gVar) {
            if (gVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f25913d = gVar;
            return this;
        }

        public final q.a e(r rVar) {
            this.f25910a = rVar;
            return this;
        }

        public final q.a f(String str) {
            this.f25911b = str;
            return this;
        }
    }

    i(r rVar, String str, Q6.d dVar, Q6.g gVar, Q6.c cVar) {
        this.f25905a = rVar;
        this.f25906b = str;
        this.f25907c = dVar;
        this.f25908d = gVar;
        this.f25909e = cVar;
    }

    @Override // S6.q
    public final Q6.c a() {
        return this.f25909e;
    }

    @Override // S6.q
    final Q6.d<?> b() {
        return this.f25907c;
    }

    @Override // S6.q
    final Q6.g<?, byte[]> c() {
        return this.f25908d;
    }

    @Override // S6.q
    public final r d() {
        return this.f25905a;
    }

    @Override // S6.q
    public final String e() {
        return this.f25906b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f25905a.equals(qVar.d()) && this.f25906b.equals(qVar.e()) && this.f25907c.equals(qVar.b()) && this.f25908d.equals(qVar.c()) && this.f25909e.equals(qVar.a());
    }

    public final int hashCode() {
        return ((((((((this.f25905a.hashCode() ^ 1000003) * 1000003) ^ this.f25906b.hashCode()) * 1000003) ^ this.f25907c.hashCode()) * 1000003) ^ this.f25908d.hashCode()) * 1000003) ^ this.f25909e.hashCode();
    }

    public final String toString() {
        return "SendRequest{transportContext=" + this.f25905a + ", transportName=" + this.f25906b + ", event=" + this.f25907c + ", transformer=" + this.f25908d + ", encoding=" + this.f25909e + "}";
    }
}
