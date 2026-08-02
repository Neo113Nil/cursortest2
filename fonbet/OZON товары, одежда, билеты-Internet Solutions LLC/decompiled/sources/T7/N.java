package T7;

import T7.O;
import j8.C7306a;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class N extends AbstractC4020b {

    /* renamed from: a, reason: collision with root package name */
    private final O f26732a;

    /* renamed from: b, reason: collision with root package name */
    private final C7306a f26733b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f26734c;

    private N(O o11, C7306a c7306a, Integer num) {
        this.f26732a = o11;
        this.f26733b = c7306a;
        this.f26734c = num;
    }

    public static N g(O o11, Integer num) throws GeneralSecurityException {
        C7306a b11;
        if (o11.d() == O.c.f26751c) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            b11 = com.google.crypto.tink.internal.v.f59296a;
        } else {
            if (o11.d() != O.c.f26750b) {
                throw new GeneralSecurityException("Unknown Variant: " + o11.d());
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            b11 = com.google.crypto.tink.internal.v.b(num.intValue());
        }
        return new N(o11, b11, num);
    }

    @Override // He.g
    public final Integer c() {
        return this.f26734c;
    }

    @Override // T7.AbstractC4020b, He.g
    public final S7.q d() {
        return this.f26732a;
    }

    @Override // T7.AbstractC4020b
    public final C7306a e() {
        return this.f26733b;
    }

    @Override // T7.AbstractC4020b
    /* renamed from: f */
    public final AbstractC4021c d() {
        return this.f26732a;
    }

    public final O h() {
        return this.f26732a;
    }
}
