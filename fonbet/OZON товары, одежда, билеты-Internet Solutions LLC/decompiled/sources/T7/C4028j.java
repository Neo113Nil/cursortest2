package T7;

import T7.C4032n;
import j8.C7306a;
import j8.C7307b;
import java.security.GeneralSecurityException;

/* renamed from: T7.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4028j extends AbstractC4020b {

    /* renamed from: a, reason: collision with root package name */
    private final C4032n f26837a;

    /* renamed from: b, reason: collision with root package name */
    private final C7307b f26838b;

    /* renamed from: c, reason: collision with root package name */
    private final C7306a f26839c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f26840d;

    /* renamed from: T7.j$a */
    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private C4032n f26841a = null;

        /* renamed from: b, reason: collision with root package name */
        private C7307b f26842b = null;

        /* renamed from: c, reason: collision with root package name */
        private Integer f26843c = null;

        a() {
        }

        public final C4028j a() throws GeneralSecurityException {
            C7306a b11;
            C4032n c4032n = this.f26841a;
            if (c4032n == null || this.f26842b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c4032n.d() != this.f26842b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f26841a.a() && this.f26843c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f26841a.a() && this.f26843c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.f26841a.f() == C4032n.b.f26857d) {
                b11 = com.google.crypto.tink.internal.v.f59296a;
            } else if (this.f26841a.f() == C4032n.b.f26856c) {
                b11 = com.google.crypto.tink.internal.v.a(this.f26843c.intValue());
            } else {
                if (this.f26841a.f() != C4032n.b.f26855b) {
                    throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + this.f26841a.f());
                }
                b11 = com.google.crypto.tink.internal.v.b(this.f26843c.intValue());
            }
            return new C4028j(this.f26841a, this.f26842b, b11, this.f26843c);
        }

        public final void b(Integer num) {
            this.f26843c = num;
        }

        public final void c(C7307b c7307b) {
            this.f26842b = c7307b;
        }

        public final void d(C4032n c4032n) {
            this.f26841a = c4032n;
        }
    }

    C4028j(C4032n c4032n, C7307b c7307b, C7306a c7306a, Integer num) {
        this.f26837a = c4032n;
        this.f26838b = c7307b;
        this.f26839c = c7306a;
        this.f26840d = num;
    }

    public static a g() {
        return new a();
    }

    @Override // He.g
    public final Integer c() {
        return this.f26840d;
    }

    @Override // T7.AbstractC4020b, He.g
    public final S7.q d() {
        return this.f26837a;
    }

    @Override // T7.AbstractC4020b
    public final C7306a e() {
        return this.f26839c;
    }

    @Override // T7.AbstractC4020b
    /* renamed from: f */
    public final AbstractC4021c d() {
        return this.f26837a;
    }

    public final C7307b h() {
        return this.f26838b;
    }

    public final C4032n i() {
        return this.f26837a;
    }
}
