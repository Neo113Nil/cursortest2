package T7;

import T7.c0;
import j8.C7306a;
import j8.C7307b;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class Y extends AbstractC4020b {

    /* renamed from: a, reason: collision with root package name */
    private final c0 f26781a;

    /* renamed from: b, reason: collision with root package name */
    private final C7307b f26782b;

    /* renamed from: c, reason: collision with root package name */
    private final C7306a f26783c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f26784d;

    private Y(c0 c0Var, C7307b c7307b, C7306a c7306a, Integer num) {
        this.f26781a = c0Var;
        this.f26782b = c7307b;
        this.f26783c = c7306a;
        this.f26784d = num;
    }

    public static Y g(c0.a aVar, C7307b c7307b, Integer num) throws GeneralSecurityException {
        C7306a b11;
        c0.a aVar2 = c0.a.f26792d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (c7307b.c() != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + c7307b.c());
        }
        c0 b12 = c0.b(aVar);
        if (b12.c() == aVar2) {
            b11 = com.google.crypto.tink.internal.v.f59296a;
        } else if (b12.c() == c0.a.f26791c) {
            b11 = com.google.crypto.tink.internal.v.a(num.intValue());
        } else {
            if (b12.c() != c0.a.f26790b) {
                throw new IllegalStateException("Unknown Variant: " + b12.c());
            }
            b11 = com.google.crypto.tink.internal.v.b(num.intValue());
        }
        return new Y(b12, c7307b, b11, num);
    }

    @Override // He.g
    public final Integer c() {
        return this.f26784d;
    }

    @Override // T7.AbstractC4020b, He.g
    public final S7.q d() {
        return this.f26781a;
    }

    @Override // T7.AbstractC4020b
    public final C7306a e() {
        return this.f26783c;
    }

    @Override // T7.AbstractC4020b
    /* renamed from: f */
    public final AbstractC4021c d() {
        return this.f26781a;
    }

    public final C7307b h() {
        return this.f26782b;
    }

    public final c0 i() {
        return this.f26781a;
    }
}
