package b8;

import S7.q;
import b8.j;
import com.google.crypto.tink.internal.v;
import j8.C7306a;
import j8.C7307b;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class g extends l {

    /* renamed from: a, reason: collision with root package name */
    private final j f55680a;

    /* renamed from: b, reason: collision with root package name */
    private final C7307b f55681b;

    /* renamed from: c, reason: collision with root package name */
    private final C7306a f55682c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f55683d;

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private j f55684a = null;

        /* renamed from: b, reason: collision with root package name */
        private C7307b f55685b = null;

        /* renamed from: c, reason: collision with root package name */
        private Integer f55686c = null;

        a() {
        }

        public final g a() throws GeneralSecurityException {
            C7306a a11;
            j jVar = this.f55684a;
            if (jVar == null || this.f55685b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (jVar.e() != this.f55685b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f55684a.a() && this.f55686c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f55684a.a() && this.f55686c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.f55684a.g() == j.c.f55710e) {
                a11 = v.f59296a;
            } else if (this.f55684a.g() == j.c.f55709d || this.f55684a.g() == j.c.f55708c) {
                a11 = v.a(this.f55686c.intValue());
            } else {
                if (this.f55684a.g() != j.c.f55707b) {
                    throw new IllegalStateException("Unknown HmacParameters.Variant: " + this.f55684a.g());
                }
                a11 = v.b(this.f55686c.intValue());
            }
            return new g(this.f55684a, this.f55685b, a11, this.f55686c);
        }

        public final void b(Integer num) {
            this.f55686c = num;
        }

        public final void c(C7307b c7307b) {
            this.f55685b = c7307b;
        }

        public final void d(j jVar) {
            this.f55684a = jVar;
        }
    }

    g(j jVar, C7307b c7307b, C7306a c7306a, Integer num) {
        this.f55680a = jVar;
        this.f55681b = c7307b;
        this.f55682c = c7306a;
        this.f55683d = num;
    }

    public static a g() {
        return new a();
    }

    @Override // He.g
    public final Integer c() {
        return this.f55683d;
    }

    @Override // b8.l, He.g
    public final q d() {
        return this.f55680a;
    }

    @Override // b8.l
    public final C7306a e() {
        return this.f55682c;
    }

    @Override // b8.l
    /* renamed from: f */
    public final Y7.g d() {
        return this.f55680a;
    }

    public final C7307b h() {
        return this.f55681b;
    }

    public final j i() {
        return this.f55680a;
    }
}
