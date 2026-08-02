package T7;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* renamed from: T7.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4032n extends AbstractC4021c {

    /* renamed from: a, reason: collision with root package name */
    private final int f26847a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26848b;

    /* renamed from: c, reason: collision with root package name */
    private final int f26849c;

    /* renamed from: d, reason: collision with root package name */
    private final b f26850d;

    /* renamed from: T7.n$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f26851a = null;

        /* renamed from: b, reason: collision with root package name */
        private Integer f26852b = null;

        /* renamed from: c, reason: collision with root package name */
        private Integer f26853c = null;

        /* renamed from: d, reason: collision with root package name */
        private b f26854d = b.f26857d;

        a() {
        }

        public final C4032n a() throws GeneralSecurityException {
            Integer num = this.f26851a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f26852b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f26853c != null) {
                return new C4032n(num.intValue(), this.f26852b.intValue(), this.f26853c.intValue(), this.f26854d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public final void b(int i11) throws GeneralSecurityException {
            if (i11 != 12 && i11 != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i11)));
            }
            this.f26852b = Integer.valueOf(i11);
        }

        public final void c(int i11) throws GeneralSecurityException {
            if (i11 != 16 && i11 != 24 && i11 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i11)));
            }
            this.f26851a = Integer.valueOf(i11);
        }

        public final void d() throws GeneralSecurityException {
            this.f26853c = 16;
        }

        public final void e(b bVar) {
            this.f26854d = bVar;
        }
    }

    /* renamed from: T7.n$b */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f26855b = new b("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final b f26856c = new b("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final b f26857d = new b("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f26858a;

        private b(String str) {
            this.f26858a = str;
        }

        public final String toString() {
            return this.f26858a;
        }
    }

    C4032n(int i11, int i12, int i13, b bVar) {
        this.f26847a = i11;
        this.f26848b = i12;
        this.f26849c = i13;
        this.f26850d = bVar;
    }

    public static a b() {
        return new a();
    }

    @Override // S7.q
    public final boolean a() {
        return this.f26850d != b.f26857d;
    }

    public final int c() {
        return this.f26848b;
    }

    public final int d() {
        return this.f26847a;
    }

    public final int e() {
        return this.f26849c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4032n)) {
            return false;
        }
        C4032n c4032n = (C4032n) obj;
        return c4032n.f26847a == this.f26847a && c4032n.f26848b == this.f26848b && c4032n.f26849c == this.f26849c && c4032n.f26850d == this.f26850d;
    }

    public final b f() {
        return this.f26850d;
    }

    public final int hashCode() {
        return Objects.hash(C4032n.class, Integer.valueOf(this.f26847a), Integer.valueOf(this.f26848b), Integer.valueOf(this.f26849c), this.f26850d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AesEax Parameters (variant: ");
        sb2.append(this.f26850d);
        sb2.append(", ");
        sb2.append(this.f26848b);
        sb2.append("-byte IV, ");
        sb2.append(this.f26849c);
        sb2.append("-byte tag, and ");
        return K00.b.e(this.f26847a, "-byte key)", sb2);
    }
}
