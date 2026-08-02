package T7;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* renamed from: T7.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4039v extends AbstractC4021c {

    /* renamed from: a, reason: collision with root package name */
    private final int f26894a;

    /* renamed from: b, reason: collision with root package name */
    private final b f26895b;

    /* renamed from: T7.v$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f26896a = null;

        /* renamed from: b, reason: collision with root package name */
        private b f26897b = b.f26900d;

        a() {
        }

        public final C4039v a() throws GeneralSecurityException {
            Integer num = this.f26896a;
            if (num != null) {
                return new C4039v(num.intValue(), this.f26897b);
            }
            throw new GeneralSecurityException("Key size is not set");
        }

        public final void b(int i11) throws GeneralSecurityException {
            if (i11 != 16 && i11 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i11)));
            }
            this.f26896a = Integer.valueOf(i11);
        }

        public final void c(b bVar) {
            this.f26897b = bVar;
        }
    }

    /* renamed from: T7.v$b */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f26898b = new b("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final b f26899c = new b("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final b f26900d = new b("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f26901a;

        private b(String str) {
            this.f26901a = str;
        }

        public final String toString() {
            return this.f26901a;
        }
    }

    C4039v(int i11, b bVar) {
        this.f26894a = i11;
        this.f26895b = bVar;
    }

    public static a b() {
        return new a();
    }

    @Override // S7.q
    public final boolean a() {
        return this.f26895b != b.f26900d;
    }

    public final int c() {
        return this.f26894a;
    }

    public final b d() {
        return this.f26895b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4039v)) {
            return false;
        }
        C4039v c4039v = (C4039v) obj;
        return c4039v.f26894a == this.f26894a && c4039v.f26895b == this.f26895b;
    }

    public final int hashCode() {
        return Objects.hash(C4039v.class, Integer.valueOf(this.f26894a), this.f26895b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb2.append(this.f26895b);
        sb2.append(", ");
        return K00.b.e(this.f26894a, "-byte key)", sb2);
    }
}
