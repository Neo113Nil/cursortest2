package T7;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r extends AbstractC4021c {

    /* renamed from: a, reason: collision with root package name */
    private final int f26871a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26872b;

    /* renamed from: c, reason: collision with root package name */
    private final int f26873c;

    /* renamed from: d, reason: collision with root package name */
    private final b f26874d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f26875a = null;

        /* renamed from: b, reason: collision with root package name */
        private Integer f26876b = null;

        /* renamed from: c, reason: collision with root package name */
        private Integer f26877c = null;

        /* renamed from: d, reason: collision with root package name */
        private b f26878d = b.f26881d;

        a() {
        }

        public final r a() throws GeneralSecurityException {
            Integer num = this.f26875a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f26876b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f26877c != null) {
                return new r(num.intValue(), this.f26876b.intValue(), this.f26877c.intValue(), this.f26878d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public final void b() throws GeneralSecurityException {
            this.f26876b = 12;
        }

        public final void c(int i11) throws GeneralSecurityException {
            if (i11 != 16 && i11 != 24 && i11 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i11)));
            }
            this.f26875a = Integer.valueOf(i11);
        }

        public final void d() throws GeneralSecurityException {
            this.f26877c = 16;
        }

        public final void e(b bVar) {
            this.f26878d = bVar;
        }
    }

    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f26879b = new b("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final b f26880c = new b("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final b f26881d = new b("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f26882a;

        private b(String str) {
            this.f26882a = str;
        }

        public final String toString() {
            return this.f26882a;
        }
    }

    r(int i11, int i12, int i13, b bVar) {
        this.f26871a = i11;
        this.f26872b = i12;
        this.f26873c = i13;
        this.f26874d = bVar;
    }

    public static a b() {
        return new a();
    }

    @Override // S7.q
    public final boolean a() {
        return this.f26874d != b.f26881d;
    }

    public final int c() {
        return this.f26872b;
    }

    public final int d() {
        return this.f26871a;
    }

    public final int e() {
        return this.f26873c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return rVar.f26871a == this.f26871a && rVar.f26872b == this.f26872b && rVar.f26873c == this.f26873c && rVar.f26874d == this.f26874d;
    }

    public final b f() {
        return this.f26874d;
    }

    public final int hashCode() {
        return Objects.hash(r.class, Integer.valueOf(this.f26871a), Integer.valueOf(this.f26872b), Integer.valueOf(this.f26873c), this.f26874d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AesGcm Parameters (variant: ");
        sb2.append(this.f26874d);
        sb2.append(", ");
        sb2.append(this.f26872b);
        sb2.append("-byte IV, ");
        sb2.append(this.f26873c);
        sb2.append("-byte tag, and ");
        return K00.b.e(this.f26871a, "-byte key)", sb2);
    }
}
