package b8;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j extends Y7.g {

    /* renamed from: a, reason: collision with root package name */
    private final int f55693a;

    /* renamed from: b, reason: collision with root package name */
    private final int f55694b;

    /* renamed from: c, reason: collision with root package name */
    private final c f55695c;

    /* renamed from: d, reason: collision with root package name */
    private final b f55696d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f55697a = null;

        /* renamed from: b, reason: collision with root package name */
        private Integer f55698b = null;

        /* renamed from: c, reason: collision with root package name */
        private b f55699c = null;

        /* renamed from: d, reason: collision with root package name */
        private c f55700d = c.f55710e;

        a() {
        }

        public final j a() throws GeneralSecurityException {
            Integer num = this.f55697a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.f55698b == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f55699c == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f55697a));
            }
            Integer num2 = this.f55698b;
            int intValue = num2.intValue();
            b bVar = this.f55699c;
            if (intValue < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
            }
            if (bVar == b.f55701b) {
                if (intValue > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
                }
            } else if (bVar == b.f55702c) {
                if (intValue > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
                }
            } else if (bVar == b.f55703d) {
                if (intValue > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
                }
            } else if (bVar == b.f55704e) {
                if (intValue > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
                }
            } else {
                if (bVar != b.f55705f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (intValue > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
                }
            }
            return new j(this.f55697a.intValue(), this.f55698b.intValue(), this.f55700d, this.f55699c);
        }

        public final void b(b bVar) {
            this.f55699c = bVar;
        }

        public final void c(int i11) throws GeneralSecurityException {
            this.f55697a = Integer.valueOf(i11);
        }

        public final void d(int i11) throws GeneralSecurityException {
            this.f55698b = Integer.valueOf(i11);
        }

        public final void e(c cVar) {
            this.f55700d = cVar;
        }
    }

    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f55701b = new b("SHA1");

        /* renamed from: c, reason: collision with root package name */
        public static final b f55702c = new b("SHA224");

        /* renamed from: d, reason: collision with root package name */
        public static final b f55703d = new b("SHA256");

        /* renamed from: e, reason: collision with root package name */
        public static final b f55704e = new b("SHA384");

        /* renamed from: f, reason: collision with root package name */
        public static final b f55705f = new b("SHA512");

        /* renamed from: a, reason: collision with root package name */
        private final String f55706a;

        private b(String str) {
            this.f55706a = str;
        }

        public final String toString() {
            return this.f55706a;
        }
    }

    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f55707b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f55708c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f55709d = new c("LEGACY");

        /* renamed from: e, reason: collision with root package name */
        public static final c f55710e = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f55711a;

        private c(String str) {
            this.f55711a = str;
        }

        public final String toString() {
            return this.f55711a;
        }
    }

    j(int i11, int i12, c cVar, b bVar) {
        this.f55693a = i11;
        this.f55694b = i12;
        this.f55695c = cVar;
        this.f55696d = bVar;
    }

    public static a b() {
        return new a();
    }

    @Override // S7.q
    public final boolean a() {
        return this.f55695c != c.f55710e;
    }

    public final int c() {
        return this.f55694b;
    }

    public final b d() {
        return this.f55696d;
    }

    public final int e() {
        return this.f55693a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jVar.f55693a == this.f55693a && jVar.f() == f() && jVar.f55695c == this.f55695c && jVar.f55696d == this.f55696d;
    }

    public final int f() {
        c cVar = c.f55710e;
        int i11 = this.f55694b;
        c cVar2 = this.f55695c;
        if (cVar2 == cVar) {
            return i11;
        }
        if (cVar2 != c.f55707b && cVar2 != c.f55708c && cVar2 != c.f55709d) {
            throw new IllegalStateException("Unknown variant");
        }
        return i11 + 5;
    }

    public final c g() {
        return this.f55695c;
    }

    public final int hashCode() {
        return Objects.hash(j.class, Integer.valueOf(this.f55693a), Integer.valueOf(this.f55694b), this.f55695c, this.f55696d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HMAC Parameters (variant: ");
        sb2.append(this.f55695c);
        sb2.append(", hashType: ");
        sb2.append(this.f55696d);
        sb2.append(", ");
        sb2.append(this.f55694b);
        sb2.append("-byte tags, and ");
        return K00.b.e(this.f55693a, "-byte key)", sb2);
    }
}
