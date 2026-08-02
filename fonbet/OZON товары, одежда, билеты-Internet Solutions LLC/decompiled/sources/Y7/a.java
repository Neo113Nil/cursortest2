package Y7;

import S7.q;
import Y7.d;
import com.google.crypto.tink.internal.v;
import j8.C7306a;
import j8.C7307b;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final d f34749a;

    /* renamed from: b, reason: collision with root package name */
    private final C7307b f34750b;

    /* renamed from: c, reason: collision with root package name */
    private final C7306a f34751c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f34752d;

    /* renamed from: Y7.a$a, reason: collision with other inner class name */
    public static class C0639a {

        /* renamed from: a, reason: collision with root package name */
        private d f34753a = null;

        /* renamed from: b, reason: collision with root package name */
        private C7307b f34754b = null;

        /* renamed from: c, reason: collision with root package name */
        private Integer f34755c = null;

        C0639a() {
        }

        public final a a() throws GeneralSecurityException {
            C7306a b11;
            d dVar = this.f34753a;
            if (dVar == null || this.f34754b == null) {
                throw new IllegalArgumentException("Cannot build without parameters and/or key material");
            }
            if (dVar.c() != this.f34754b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f34753a.a() && this.f34755c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f34753a.a() && this.f34755c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.f34753a.d() == d.b.f34766d) {
                b11 = v.f59296a;
            } else if (this.f34753a.d() == d.b.f34765c) {
                b11 = v.a(this.f34755c.intValue());
            } else {
                if (this.f34753a.d() != d.b.f34764b) {
                    throw new IllegalStateException("Unknown AesSivParameters.Variant: " + this.f34753a.d());
                }
                b11 = v.b(this.f34755c.intValue());
            }
            return new a(this.f34753a, this.f34754b, b11, this.f34755c);
        }

        public final void b(Integer num) {
            this.f34755c = num;
        }

        public final void c(C7307b c7307b) {
            this.f34754b = c7307b;
        }

        public final void d(d dVar) {
            this.f34753a = dVar;
        }
    }

    a(d dVar, C7307b c7307b, C7306a c7306a, Integer num) {
        this.f34749a = dVar;
        this.f34750b = c7307b;
        this.f34751c = c7306a;
        this.f34752d = num;
    }

    public static C0639a g() {
        return new C0639a();
    }

    @Override // He.g
    public final Integer c() {
        return this.f34752d;
    }

    @Override // Y7.f, He.g
    public final q d() {
        return this.f34749a;
    }

    @Override // Y7.f
    public final C7306a e() {
        return this.f34751c;
    }

    @Override // Y7.f
    /* renamed from: f */
    public final d d() {
        return this.f34749a;
    }

    public final C7307b h() {
        return this.f34750b;
    }

    public final d i() {
        return this.f34749a;
    }
}
