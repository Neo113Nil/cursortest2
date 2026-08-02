package T7;

import T7.r;
import j8.C7306a;
import j8.C7307b;
import java.security.GeneralSecurityException;

/* renamed from: T7.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4033o extends AbstractC4020b {

    /* renamed from: a, reason: collision with root package name */
    private final r f26859a;

    /* renamed from: b, reason: collision with root package name */
    private final C7307b f26860b;

    /* renamed from: c, reason: collision with root package name */
    private final C7306a f26861c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f26862d;

    /* renamed from: T7.o$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private r f26863a = null;

        /* renamed from: b, reason: collision with root package name */
        private C7307b f26864b = null;

        /* renamed from: c, reason: collision with root package name */
        private Integer f26865c = null;

        a() {
        }

        public final C4033o a() throws GeneralSecurityException {
            C7306a b11;
            r rVar = this.f26863a;
            if (rVar == null || this.f26864b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (rVar.d() != this.f26864b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f26863a.a() && this.f26865c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f26863a.a() && this.f26865c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.f26863a.f() == r.b.f26881d) {
                b11 = com.google.crypto.tink.internal.v.f59296a;
            } else if (this.f26863a.f() == r.b.f26880c) {
                b11 = com.google.crypto.tink.internal.v.a(this.f26865c.intValue());
            } else {
                if (this.f26863a.f() != r.b.f26879b) {
                    throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + this.f26863a.f());
                }
                b11 = com.google.crypto.tink.internal.v.b(this.f26865c.intValue());
            }
            return new C4033o(this.f26863a, this.f26864b, b11, this.f26865c);
        }

        public final void b(Integer num) {
            this.f26865c = num;
        }

        public final void c(C7307b c7307b) {
            this.f26864b = c7307b;
        }

        public final void d(r rVar) {
            this.f26863a = rVar;
        }
    }

    C4033o(r rVar, C7307b c7307b, C7306a c7306a, Integer num) {
        this.f26859a = rVar;
        this.f26860b = c7307b;
        this.f26861c = c7306a;
        this.f26862d = num;
    }

    public static a g() {
        return new a();
    }

    @Override // He.g
    public final Integer c() {
        return this.f26862d;
    }

    @Override // T7.AbstractC4020b, He.g
    public final S7.q d() {
        return this.f26859a;
    }

    @Override // T7.AbstractC4020b
    public final C7306a e() {
        return this.f26861c;
    }

    @Override // T7.AbstractC4020b
    /* renamed from: f */
    public final AbstractC4021c d() {
        return this.f26859a;
    }

    public final C7307b h() {
        return this.f26860b;
    }

    public final r i() {
        return this.f26859a;
    }
}
