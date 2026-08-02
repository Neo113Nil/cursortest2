package T7;

import T7.C4039v;
import j8.C7306a;
import j8.C7307b;
import java.security.GeneralSecurityException;

/* renamed from: T7.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4036s extends AbstractC4020b {

    /* renamed from: a, reason: collision with root package name */
    private final C4039v f26883a;

    /* renamed from: b, reason: collision with root package name */
    private final C7307b f26884b;

    /* renamed from: c, reason: collision with root package name */
    private final C7306a f26885c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f26886d;

    /* renamed from: T7.s$a */
    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private C4039v f26887a = null;

        /* renamed from: b, reason: collision with root package name */
        private C7307b f26888b = null;

        /* renamed from: c, reason: collision with root package name */
        private Integer f26889c = null;

        a() {
        }

        public final C4036s a() throws GeneralSecurityException {
            C7306a b11;
            C4039v c4039v = this.f26887a;
            if (c4039v == null || this.f26888b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c4039v.c() != this.f26888b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f26887a.a() && this.f26889c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f26887a.a() && this.f26889c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.f26887a.d() == C4039v.b.f26900d) {
                b11 = com.google.crypto.tink.internal.v.f59296a;
            } else if (this.f26887a.d() == C4039v.b.f26899c) {
                b11 = com.google.crypto.tink.internal.v.a(this.f26889c.intValue());
            } else {
                if (this.f26887a.d() != C4039v.b.f26898b) {
                    throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + this.f26887a.d());
                }
                b11 = com.google.crypto.tink.internal.v.b(this.f26889c.intValue());
            }
            return new C4036s(this.f26887a, this.f26888b, b11, this.f26889c);
        }

        public final void b(Integer num) {
            this.f26889c = num;
        }

        public final void c(C7307b c7307b) {
            this.f26888b = c7307b;
        }

        public final void d(C4039v c4039v) {
            this.f26887a = c4039v;
        }
    }

    C4036s(C4039v c4039v, C7307b c7307b, C7306a c7306a, Integer num) {
        this.f26883a = c4039v;
        this.f26884b = c7307b;
        this.f26885c = c7306a;
        this.f26886d = num;
    }

    public static a g() {
        return new a();
    }

    @Override // He.g
    public final Integer c() {
        return this.f26886d;
    }

    @Override // T7.AbstractC4020b, He.g
    public final S7.q d() {
        return this.f26883a;
    }

    @Override // T7.AbstractC4020b
    public final C7306a e() {
        return this.f26885c;
    }

    @Override // T7.AbstractC4020b
    /* renamed from: f */
    public final AbstractC4021c d() {
        return this.f26883a;
    }

    public final C7307b h() {
        return this.f26884b;
    }

    public final C4039v i() {
        return this.f26883a;
    }
}
