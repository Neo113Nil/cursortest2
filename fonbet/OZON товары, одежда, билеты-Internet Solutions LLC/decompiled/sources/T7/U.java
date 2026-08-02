package T7;

import T7.X;
import j8.C7306a;
import j8.C7307b;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class U extends AbstractC4020b {

    /* renamed from: a, reason: collision with root package name */
    private final X f26770a;

    /* renamed from: b, reason: collision with root package name */
    private final C7307b f26771b;

    /* renamed from: c, reason: collision with root package name */
    private final C7306a f26772c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f26773d;

    private U(X x11, C7307b c7307b, C7306a c7306a, Integer num) {
        this.f26770a = x11;
        this.f26771b = c7307b;
        this.f26772c = c7306a;
        this.f26773d = num;
    }

    public static U g(X x11, C7307b c7307b, Integer num) throws GeneralSecurityException {
        C7306a b11;
        X.a d11 = x11.d();
        X.a aVar = X.a.f26779c;
        if (d11 != aVar && num == null) {
            throw new GeneralSecurityException("For given Variant " + x11.d() + " the value of idRequirement must be non-null");
        }
        if (x11.d() == aVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (c7307b.c() != 32) {
            throw new GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + c7307b.c());
        }
        if (x11.d() == aVar) {
            b11 = com.google.crypto.tink.internal.v.f59296a;
        } else {
            if (x11.d() != X.a.f26778b) {
                throw new IllegalStateException("Unknown Variant: " + x11.d());
            }
            b11 = com.google.crypto.tink.internal.v.b(num.intValue());
        }
        return new U(x11, c7307b, b11, num);
    }

    @Override // He.g
    public final Integer c() {
        return this.f26773d;
    }

    @Override // T7.AbstractC4020b, He.g
    public final S7.q d() {
        return this.f26770a;
    }

    @Override // T7.AbstractC4020b
    public final C7306a e() {
        return this.f26772c;
    }

    @Override // T7.AbstractC4020b
    /* renamed from: f */
    public final AbstractC4021c d() {
        return this.f26770a;
    }

    public final C7307b h() {
        return this.f26771b;
    }

    public final X i() {
        return this.f26770a;
    }
}
