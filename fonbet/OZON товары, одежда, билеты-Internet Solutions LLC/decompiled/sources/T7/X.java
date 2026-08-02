package T7;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class X extends AbstractC4021c {

    /* renamed from: a, reason: collision with root package name */
    private final a f26776a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26777b;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f26778b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f26779c = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f26780a;

        private a(String str) {
            this.f26780a = str;
        }

        public final String toString() {
            return this.f26780a;
        }
    }

    private X(a aVar, int i11) {
        this.f26776a = aVar;
        this.f26777b = i11;
    }

    public static X b(a aVar, int i11) throws GeneralSecurityException {
        if (i11 < 8 || i11 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new X(aVar, i11);
    }

    @Override // S7.q
    public final boolean a() {
        return this.f26776a != a.f26779c;
    }

    public final int c() {
        return this.f26777b;
    }

    public final a d() {
        return this.f26776a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof X)) {
            return false;
        }
        X x11 = (X) obj;
        return x11.f26776a == this.f26776a && x11.f26777b == this.f26777b;
    }

    public final int hashCode() {
        return Objects.hash(X.class, this.f26776a, Integer.valueOf(this.f26777b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("X-AES-GCM Parameters (variant: ");
        sb2.append(this.f26776a);
        sb2.append("salt_size_bytes: ");
        return K00.b.e(this.f26777b, ")", sb2);
    }
}
