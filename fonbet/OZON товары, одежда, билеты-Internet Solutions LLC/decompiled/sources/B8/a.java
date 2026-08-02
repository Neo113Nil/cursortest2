package B8;

import B8.c;
import B8.d;
import C.o0;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
final class a extends d {

    /* renamed from: b, reason: collision with root package name */
    private final String f3019b;

    /* renamed from: c, reason: collision with root package name */
    private final c.a f3020c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3021d;

    /* renamed from: e, reason: collision with root package name */
    private final String f3022e;

    /* renamed from: f, reason: collision with root package name */
    private final long f3023f;

    /* renamed from: g, reason: collision with root package name */
    private final long f3024g;

    /* renamed from: h, reason: collision with root package name */
    private final String f3025h;

    /* renamed from: B8.a$a, reason: collision with other inner class name */
    static final class C0075a extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f3026a;

        /* renamed from: b, reason: collision with root package name */
        private c.a f3027b;

        /* renamed from: c, reason: collision with root package name */
        private String f3028c;

        /* renamed from: d, reason: collision with root package name */
        private String f3029d;

        /* renamed from: e, reason: collision with root package name */
        private Long f3030e;

        /* renamed from: f, reason: collision with root package name */
        private Long f3031f;

        /* renamed from: g, reason: collision with root package name */
        private String f3032g;

        C0075a(d dVar) {
            this.f3026a = dVar.c();
            this.f3027b = dVar.f();
            this.f3028c = dVar.a();
            this.f3029d = dVar.e();
            this.f3030e = Long.valueOf(dVar.b());
            this.f3031f = Long.valueOf(dVar.g());
            this.f3032g = dVar.d();
        }

        @Override // B8.d.a
        public final d a() {
            String str = this.f3027b == null ? " registrationStatus" : "";
            if (this.f3030e == null) {
                str = str.concat(" expiresInSecs");
            }
            if (this.f3031f == null) {
                str = U7.d.e(str, " tokenCreationEpochInSecs");
            }
            if (str.isEmpty()) {
                return new a(this.f3026a, this.f3027b, this.f3028c, this.f3029d, this.f3030e.longValue(), this.f3031f.longValue(), this.f3032g);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // B8.d.a
        public final d.a b(String str) {
            this.f3028c = str;
            return this;
        }

        @Override // B8.d.a
        public final d.a c(long j11) {
            this.f3030e = Long.valueOf(j11);
            return this;
        }

        @Override // B8.d.a
        public final d.a d(String str) {
            this.f3026a = str;
            return this;
        }

        @Override // B8.d.a
        public final d.a e(String str) {
            this.f3032g = str;
            return this;
        }

        @Override // B8.d.a
        public final d.a f(String str) {
            this.f3029d = str;
            return this;
        }

        @Override // B8.d.a
        public final d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f3027b = aVar;
            return this;
        }

        @Override // B8.d.a
        public final d.a h(long j11) {
            this.f3031f = Long.valueOf(j11);
            return this;
        }
    }

    a(String str, c.a aVar, String str2, String str3, long j11, long j12, String str4) {
        this.f3019b = str;
        this.f3020c = aVar;
        this.f3021d = str2;
        this.f3022e = str3;
        this.f3023f = j11;
        this.f3024g = j12;
        this.f3025h = str4;
    }

    @Override // B8.d
    public final String a() {
        return this.f3021d;
    }

    @Override // B8.d
    public final long b() {
        return this.f3023f;
    }

    @Override // B8.d
    public final String c() {
        return this.f3019b;
    }

    @Override // B8.d
    public final String d() {
        return this.f3025h;
    }

    @Override // B8.d
    public final String e() {
        return this.f3022e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f3019b;
        if (str == null) {
            if (dVar.c() != null) {
                return false;
            }
        } else if (!str.equals(dVar.c())) {
            return false;
        }
        if (!this.f3020c.equals(dVar.f())) {
            return false;
        }
        String str2 = this.f3021d;
        if (str2 == null) {
            if (dVar.a() != null) {
                return false;
            }
        } else if (!str2.equals(dVar.a())) {
            return false;
        }
        String str3 = this.f3022e;
        if (str3 == null) {
            if (dVar.e() != null) {
                return false;
            }
        } else if (!str3.equals(dVar.e())) {
            return false;
        }
        if (this.f3023f != dVar.b() || this.f3024g != dVar.g()) {
            return false;
        }
        String str4 = this.f3025h;
        return str4 == null ? dVar.d() == null : str4.equals(dVar.d());
    }

    @Override // B8.d
    @NonNull
    public final c.a f() {
        return this.f3020c;
    }

    @Override // B8.d
    public final long g() {
        return this.f3024g;
    }

    @Override // B8.d
    public final d.a h() {
        return new C0075a(this);
    }

    public final int hashCode() {
        String str = this.f3019b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f3020c.hashCode()) * 1000003;
        String str2 = this.f3021d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f3022e;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j11 = this.f3023f;
        int i11 = (hashCode3 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f3024g;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str4 = this.f3025h;
        return (str4 != null ? str4.hashCode() : 0) ^ i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f3019b);
        sb2.append(", registrationStatus=");
        sb2.append(this.f3020c);
        sb2.append(", authToken=");
        sb2.append(this.f3021d);
        sb2.append(", refreshToken=");
        sb2.append(this.f3022e);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f3023f);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f3024g);
        sb2.append(", fisError=");
        return o0.c(sb2, this.f3025h, "}");
    }
}
