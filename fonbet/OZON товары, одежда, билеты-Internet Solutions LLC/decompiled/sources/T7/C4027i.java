package T7;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* renamed from: T7.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4027i extends AbstractC4021c {

    /* renamed from: a, reason: collision with root package name */
    private final int f26815a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26816b;

    /* renamed from: c, reason: collision with root package name */
    private final int f26817c;

    /* renamed from: d, reason: collision with root package name */
    private final int f26818d;

    /* renamed from: e, reason: collision with root package name */
    private final c f26819e;

    /* renamed from: f, reason: collision with root package name */
    private final b f26820f;

    /* renamed from: T7.i$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f26821a = null;

        /* renamed from: b, reason: collision with root package name */
        private Integer f26822b = null;

        /* renamed from: c, reason: collision with root package name */
        private Integer f26823c = null;

        /* renamed from: d, reason: collision with root package name */
        private Integer f26824d = null;

        /* renamed from: e, reason: collision with root package name */
        private b f26825e = null;

        /* renamed from: f, reason: collision with root package name */
        private c f26826f = c.f26835d;

        a() {
        }

        public final C4027i a() throws GeneralSecurityException {
            if (this.f26821a == null) {
                throw new GeneralSecurityException("AES key size is not set");
            }
            if (this.f26822b == null) {
                throw new GeneralSecurityException("HMAC key size is not set");
            }
            if (this.f26823c == null) {
                throw new GeneralSecurityException("iv size is not set");
            }
            Integer num = this.f26824d;
            if (num == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f26825e == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            int intValue = num.intValue();
            b bVar = this.f26825e;
            if (bVar == b.f26827b) {
                if (intValue > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
                }
            } else if (bVar == b.f26828c) {
                if (intValue > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
                }
            } else if (bVar == b.f26829d) {
                if (intValue > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
                }
            } else if (bVar == b.f26830e) {
                if (intValue > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
                }
            } else {
                if (bVar != b.f26831f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                }
                if (intValue > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
                }
            }
            return new C4027i(this.f26821a.intValue(), this.f26822b.intValue(), this.f26823c.intValue(), this.f26824d.intValue(), this.f26826f, this.f26825e);
        }

        public final void b(int i11) throws GeneralSecurityException {
            if (i11 != 16 && i11 != 24 && i11 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i11)));
            }
            this.f26821a = Integer.valueOf(i11);
        }

        public final void c(b bVar) {
            this.f26825e = bVar;
        }

        public final void d(int i11) throws GeneralSecurityException {
            if (i11 < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i11)));
            }
            this.f26822b = Integer.valueOf(i11);
        }

        public final void e(int i11) throws GeneralSecurityException {
            if (i11 < 12 || i11 > 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i11)));
            }
            this.f26823c = Integer.valueOf(i11);
        }

        public final void f(int i11) throws GeneralSecurityException {
            if (i11 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i11)));
            }
            this.f26824d = Integer.valueOf(i11);
        }

        public final void g(c cVar) {
            this.f26826f = cVar;
        }
    }

    /* renamed from: T7.i$b */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f26827b = new b("SHA1");

        /* renamed from: c, reason: collision with root package name */
        public static final b f26828c = new b("SHA224");

        /* renamed from: d, reason: collision with root package name */
        public static final b f26829d = new b("SHA256");

        /* renamed from: e, reason: collision with root package name */
        public static final b f26830e = new b("SHA384");

        /* renamed from: f, reason: collision with root package name */
        public static final b f26831f = new b("SHA512");

        /* renamed from: a, reason: collision with root package name */
        private final String f26832a;

        private b(String str) {
            this.f26832a = str;
        }

        public final String toString() {
            return this.f26832a;
        }
    }

    /* renamed from: T7.i$c */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f26833b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f26834c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f26835d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f26836a;

        private c(String str) {
            this.f26836a = str;
        }

        public final String toString() {
            return this.f26836a;
        }
    }

    C4027i(int i11, int i12, int i13, int i14, c cVar, b bVar) {
        this.f26815a = i11;
        this.f26816b = i12;
        this.f26817c = i13;
        this.f26818d = i14;
        this.f26819e = cVar;
        this.f26820f = bVar;
    }

    public static a b() {
        return new a();
    }

    @Override // S7.q
    public final boolean a() {
        return this.f26819e != c.f26835d;
    }

    public final int c() {
        return this.f26815a;
    }

    public final b d() {
        return this.f26820f;
    }

    public final int e() {
        return this.f26816b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4027i)) {
            return false;
        }
        C4027i c4027i = (C4027i) obj;
        return c4027i.f26815a == this.f26815a && c4027i.f26816b == this.f26816b && c4027i.f26817c == this.f26817c && c4027i.f26818d == this.f26818d && c4027i.f26819e == this.f26819e && c4027i.f26820f == this.f26820f;
    }

    public final int f() {
        return this.f26817c;
    }

    public final int g() {
        return this.f26818d;
    }

    public final c h() {
        return this.f26819e;
    }

    public final int hashCode() {
        return Objects.hash(C4027i.class, Integer.valueOf(this.f26815a), Integer.valueOf(this.f26816b), Integer.valueOf(this.f26817c), Integer.valueOf(this.f26818d), this.f26819e, this.f26820f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AesCtrHmacAead Parameters (variant: ");
        sb2.append(this.f26819e);
        sb2.append(", hashType: ");
        sb2.append(this.f26820f);
        sb2.append(", ");
        sb2.append(this.f26817c);
        sb2.append("-byte IV, and ");
        sb2.append(this.f26818d);
        sb2.append("-byte tags, and ");
        sb2.append(this.f26815a);
        sb2.append("-byte AES key, and ");
        return K00.b.e(this.f26816b, "-byte HMAC key)", sb2);
    }
}
