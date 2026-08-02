package Y7;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: a, reason: collision with root package name */
    private final int f34760a;

    /* renamed from: b, reason: collision with root package name */
    private final b f34761b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f34762a = null;

        /* renamed from: b, reason: collision with root package name */
        private b f34763b = b.f34766d;

        a() {
        }

        public final d a() throws GeneralSecurityException {
            Integer num = this.f34762a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f34763b != null) {
                return new d(num.intValue(), this.f34763b);
            }
            throw new GeneralSecurityException("Variant is not set");
        }

        public final void b(int i11) throws GeneralSecurityException {
            if (i11 != 32 && i11 != 48 && i11 != 64) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(i11)));
            }
            this.f34762a = Integer.valueOf(i11);
        }

        public final void c(b bVar) {
            this.f34763b = bVar;
        }
    }

    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f34764b = new b("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final b f34765c = new b("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final b f34766d = new b("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f34767a;

        private b(String str) {
            this.f34767a = str;
        }

        public final String toString() {
            return this.f34767a;
        }
    }

    d(int i11, b bVar) {
        this.f34760a = i11;
        this.f34761b = bVar;
    }

    public static a b() {
        return new a();
    }

    @Override // S7.q
    public final boolean a() {
        return this.f34761b != b.f34766d;
    }

    public final int c() {
        return this.f34760a;
    }

    public final b d() {
        return this.f34761b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f34760a == this.f34760a && dVar.f34761b == this.f34761b;
    }

    public final int hashCode() {
        return Objects.hash(d.class, Integer.valueOf(this.f34760a), this.f34761b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AesSiv Parameters (variant: ");
        sb2.append(this.f34761b);
        sb2.append(", ");
        return K00.b.e(this.f34760a, "-byte key)", sb2);
    }
}
