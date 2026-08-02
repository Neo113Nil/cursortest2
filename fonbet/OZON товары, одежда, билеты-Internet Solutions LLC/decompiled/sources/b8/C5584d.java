package b8;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* renamed from: b8.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5584d extends Y7.g {

    /* renamed from: a, reason: collision with root package name */
    private final int f55667a;

    /* renamed from: b, reason: collision with root package name */
    private final int f55668b;

    /* renamed from: c, reason: collision with root package name */
    private final b f55669c;

    /* renamed from: b8.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f55670a = null;

        /* renamed from: b, reason: collision with root package name */
        private Integer f55671b = null;

        /* renamed from: c, reason: collision with root package name */
        private b f55672c = b.f55676e;

        a() {
        }

        public final C5584d a() throws GeneralSecurityException {
            Integer num = this.f55670a;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.f55671b != null) {
                return new C5584d(num.intValue(), this.f55671b.intValue(), this.f55672c);
            }
            throw new GeneralSecurityException("tag size not set");
        }

        public final void b(int i11) throws GeneralSecurityException {
            if (i11 != 16 && i11 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i11 * 8)));
            }
            this.f55670a = Integer.valueOf(i11);
        }

        public final void c(int i11) throws GeneralSecurityException {
            if (i11 < 10 || 16 < i11) {
                throw new GeneralSecurityException(Ej.b.a(i11, "Invalid tag size for AesCmacParameters: "));
            }
            this.f55671b = Integer.valueOf(i11);
        }

        public final void d(b bVar) {
            this.f55672c = bVar;
        }
    }

    /* renamed from: b8.d$b */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f55673b = new b("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final b f55674c = new b("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final b f55675d = new b("LEGACY");

        /* renamed from: e, reason: collision with root package name */
        public static final b f55676e = new b("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f55677a;

        private b(String str) {
            this.f55677a = str;
        }

        public final String toString() {
            return this.f55677a;
        }
    }

    C5584d(int i11, int i12, b bVar) {
        this.f55667a = i11;
        this.f55668b = i12;
        this.f55669c = bVar;
    }

    public static a b() {
        return new a();
    }

    @Override // S7.q
    public final boolean a() {
        return this.f55669c != b.f55676e;
    }

    public final int c() {
        return this.f55668b;
    }

    public final int d() {
        return this.f55667a;
    }

    public final int e() {
        b bVar = b.f55676e;
        int i11 = this.f55668b;
        b bVar2 = this.f55669c;
        if (bVar2 == bVar) {
            return i11;
        }
        if (bVar2 != b.f55673b && bVar2 != b.f55674c && bVar2 != b.f55675d) {
            throw new IllegalStateException("Unknown variant");
        }
        return i11 + 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5584d)) {
            return false;
        }
        C5584d c5584d = (C5584d) obj;
        return c5584d.f55667a == this.f55667a && c5584d.e() == e() && c5584d.f55669c == this.f55669c;
    }

    public final b f() {
        return this.f55669c;
    }

    public final int hashCode() {
        return Objects.hash(C5584d.class, Integer.valueOf(this.f55667a), Integer.valueOf(this.f55668b), this.f55669c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb2.append(this.f55669c);
        sb2.append(", ");
        sb2.append(this.f55668b);
        sb2.append("-byte tags, and ");
        return K00.b.e(this.f55667a, "-byte key)", sb2);
    }
}
