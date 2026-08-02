package T7;

import T7.C4027i;
import j8.C7306a;
import j8.C7307b;
import java.security.GeneralSecurityException;

/* renamed from: T7.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4023e extends AbstractC4020b {

    /* renamed from: a, reason: collision with root package name */
    private final C4027i f26801a;

    /* renamed from: b, reason: collision with root package name */
    private final C7307b f26802b;

    /* renamed from: c, reason: collision with root package name */
    private final C7307b f26803c;

    /* renamed from: d, reason: collision with root package name */
    private final C7306a f26804d;

    /* renamed from: e, reason: collision with root package name */
    private final Integer f26805e;

    /* renamed from: T7.e$a */
    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private C4027i f26806a = null;

        /* renamed from: b, reason: collision with root package name */
        private C7307b f26807b = null;

        /* renamed from: c, reason: collision with root package name */
        private C7307b f26808c = null;

        /* renamed from: d, reason: collision with root package name */
        private Integer f26809d = null;

        a() {
        }

        public final C4023e a() throws GeneralSecurityException {
            C7306a b11;
            C4027i c4027i = this.f26806a;
            if (c4027i == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            if (this.f26807b == null || this.f26808c == null) {
                throw new GeneralSecurityException("Cannot build without key material");
            }
            if (c4027i.c() != this.f26807b.c()) {
                throw new GeneralSecurityException("AES key size mismatch");
            }
            if (this.f26806a.e() != this.f26808c.c()) {
                throw new GeneralSecurityException("HMAC key size mismatch");
            }
            if (this.f26806a.a() && this.f26809d == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f26806a.a() && this.f26809d != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.f26806a.h() == C4027i.c.f26835d) {
                b11 = com.google.crypto.tink.internal.v.f59296a;
            } else if (this.f26806a.h() == C4027i.c.f26834c) {
                b11 = com.google.crypto.tink.internal.v.a(this.f26809d.intValue());
            } else {
                if (this.f26806a.h() != C4027i.c.f26833b) {
                    throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: " + this.f26806a.h());
                }
                b11 = com.google.crypto.tink.internal.v.b(this.f26809d.intValue());
            }
            return new C4023e(this.f26806a, this.f26807b, this.f26808c, b11, this.f26809d);
        }

        public final void b(C7307b c7307b) {
            this.f26807b = c7307b;
        }

        public final void c(C7307b c7307b) {
            this.f26808c = c7307b;
        }

        public final void d(Integer num) {
            this.f26809d = num;
        }

        public final void e(C4027i c4027i) {
            this.f26806a = c4027i;
        }
    }

    C4023e(C4027i c4027i, C7307b c7307b, C7307b c7307b2, C7306a c7306a, Integer num) {
        this.f26801a = c4027i;
        this.f26802b = c7307b;
        this.f26803c = c7307b2;
        this.f26804d = c7306a;
        this.f26805e = num;
    }

    public static a g() {
        return new a();
    }

    @Override // He.g
    public final Integer c() {
        return this.f26805e;
    }

    @Override // T7.AbstractC4020b, He.g
    public final S7.q d() {
        return this.f26801a;
    }

    @Override // T7.AbstractC4020b
    public final C7306a e() {
        return this.f26804d;
    }

    @Override // T7.AbstractC4020b
    /* renamed from: f */
    public final AbstractC4021c d() {
        return this.f26801a;
    }

    public final C7307b h() {
        return this.f26802b;
    }

    public final C7307b i() {
        return this.f26803c;
    }

    public final C4027i j() {
        return this.f26801a;
    }
}
