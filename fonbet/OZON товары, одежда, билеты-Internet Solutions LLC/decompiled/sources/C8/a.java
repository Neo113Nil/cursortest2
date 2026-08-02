package C8;

import C8.d;

/* loaded from: classes9.dex */
final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final String f4470a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4471b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4472c;

    /* renamed from: d, reason: collision with root package name */
    private final f f4473d;

    /* renamed from: e, reason: collision with root package name */
    private final d.b f4474e;

    /* renamed from: C8.a$a, reason: collision with other inner class name */
    static final class C0110a extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f4475a;

        /* renamed from: b, reason: collision with root package name */
        private String f4476b;

        /* renamed from: c, reason: collision with root package name */
        private String f4477c;

        /* renamed from: d, reason: collision with root package name */
        private f f4478d;

        /* renamed from: e, reason: collision with root package name */
        private d.b f4479e;

        @Override // C8.d.a
        public final d a() {
            return new a(this.f4475a, this.f4476b, this.f4477c, this.f4478d, this.f4479e);
        }

        @Override // C8.d.a
        public final d.a b(f fVar) {
            this.f4478d = fVar;
            return this;
        }

        @Override // C8.d.a
        public final d.a c(String str) {
            this.f4476b = str;
            return this;
        }

        @Override // C8.d.a
        public final d.a d(String str) {
            this.f4477c = str;
            return this;
        }

        @Override // C8.d.a
        public final d.a e(d.b bVar) {
            this.f4479e = bVar;
            return this;
        }

        @Override // C8.d.a
        public final d.a f(String str) {
            this.f4475a = str;
            return this;
        }
    }

    a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f4470a = str;
        this.f4471b = str2;
        this.f4472c = str3;
        this.f4473d = fVar;
        this.f4474e = bVar;
    }

    @Override // C8.d
    public final f b() {
        return this.f4473d;
    }

    @Override // C8.d
    public final String c() {
        return this.f4471b;
    }

    @Override // C8.d
    public final String d() {
        return this.f4472c;
    }

    @Override // C8.d
    public final d.b e() {
        return this.f4474e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f4470a;
        if (str == null) {
            if (dVar.f() != null) {
                return false;
            }
        } else if (!str.equals(dVar.f())) {
            return false;
        }
        String str2 = this.f4471b;
        if (str2 == null) {
            if (dVar.c() != null) {
                return false;
            }
        } else if (!str2.equals(dVar.c())) {
            return false;
        }
        String str3 = this.f4472c;
        if (str3 == null) {
            if (dVar.d() != null) {
                return false;
            }
        } else if (!str3.equals(dVar.d())) {
            return false;
        }
        f fVar = this.f4473d;
        if (fVar == null) {
            if (dVar.b() != null) {
                return false;
            }
        } else if (!fVar.equals(dVar.b())) {
            return false;
        }
        d.b bVar = this.f4474e;
        return bVar == null ? dVar.e() == null : bVar.equals(dVar.e());
    }

    @Override // C8.d
    public final String f() {
        return this.f4470a;
    }

    public final int hashCode() {
        String str = this.f4470a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f4471b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f4472c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f4473d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f4474e;
        return (bVar != null ? bVar.hashCode() : 0) ^ hashCode4;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.f4470a + ", fid=" + this.f4471b + ", refreshToken=" + this.f4472c + ", authToken=" + this.f4473d + ", responseCode=" + this.f4474e + "}";
    }
}
