package b8;

import S7.q;
import b8.C5584d;
import com.google.crypto.tink.internal.v;
import j8.C7306a;
import j8.C7307b;
import java.security.GeneralSecurityException;

/* renamed from: b8.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5581a extends l {

    /* renamed from: a, reason: collision with root package name */
    private final C5584d f55656a;

    /* renamed from: b, reason: collision with root package name */
    private final C7307b f55657b;

    /* renamed from: c, reason: collision with root package name */
    private final C7306a f55658c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f55659d;

    /* renamed from: b8.a$a, reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static class C0831a {

        /* renamed from: a, reason: collision with root package name */
        private C5584d f55660a = null;

        /* renamed from: b, reason: collision with root package name */
        private C7307b f55661b = null;

        /* renamed from: c, reason: collision with root package name */
        private Integer f55662c = null;

        C0831a() {
        }

        public final C5581a a() throws GeneralSecurityException {
            C7306a a11;
            C5584d c5584d = this.f55660a;
            if (c5584d == null || this.f55661b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c5584d.d() != this.f55661b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f55660a.a() && this.f55662c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f55660a.a() && this.f55662c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.f55660a.f() == C5584d.b.f55676e) {
                a11 = v.f59296a;
            } else if (this.f55660a.f() == C5584d.b.f55675d || this.f55660a.f() == C5584d.b.f55674c) {
                a11 = v.a(this.f55662c.intValue());
            } else {
                if (this.f55660a.f() != C5584d.b.f55673b) {
                    throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + this.f55660a.f());
                }
                a11 = v.b(this.f55662c.intValue());
            }
            return new C5581a(this.f55660a, this.f55661b, a11, this.f55662c);
        }

        public final void b(C7307b c7307b) throws GeneralSecurityException {
            this.f55661b = c7307b;
        }

        public final void c(Integer num) {
            this.f55662c = num;
        }

        public final void d(C5584d c5584d) {
            this.f55660a = c5584d;
        }
    }

    C5581a(C5584d c5584d, C7307b c7307b, C7306a c7306a, Integer num) {
        this.f55656a = c5584d;
        this.f55657b = c7307b;
        this.f55658c = c7306a;
        this.f55659d = num;
    }

    public static C0831a g() {
        return new C0831a();
    }

    @Override // He.g
    public final Integer c() {
        return this.f55659d;
    }

    @Override // b8.l, He.g
    public final q d() {
        return this.f55656a;
    }

    @Override // b8.l
    public final C7306a e() {
        return this.f55658c;
    }

    @Override // b8.l
    /* renamed from: f */
    public final Y7.g d() {
        return this.f55656a;
    }

    public final C7307b h() {
        return this.f55657b;
    }

    public final C5584d i() {
        return this.f55656a;
    }
}
