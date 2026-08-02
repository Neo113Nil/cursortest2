package T7;

import T7.C4043z;
import j8.C7306a;
import j8.C7307b;
import java.security.GeneralSecurityException;

/* renamed from: T7.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4040w extends AbstractC4020b {

    /* renamed from: a, reason: collision with root package name */
    private final C4043z f26902a;

    /* renamed from: b, reason: collision with root package name */
    private final C7307b f26903b;

    /* renamed from: c, reason: collision with root package name */
    private final C7306a f26904c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f26905d;

    private C4040w(C4043z c4043z, C7307b c7307b, C7306a c7306a, Integer num) {
        this.f26902a = c4043z;
        this.f26903b = c7307b;
        this.f26904c = c7306a;
        this.f26905d = num;
    }

    public static C4040w g(C4043z.a aVar, C7307b c7307b, Integer num) throws GeneralSecurityException {
        C7306a b11;
        C4043z.a aVar2 = C4043z.a.f26912d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (c7307b.c() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + c7307b.c());
        }
        C4043z b12 = C4043z.b(aVar);
        if (b12.c() == aVar2) {
            b11 = com.google.crypto.tink.internal.v.f59296a;
        } else if (b12.c() == C4043z.a.f26911c) {
            b11 = com.google.crypto.tink.internal.v.a(num.intValue());
        } else {
            if (b12.c() != C4043z.a.f26910b) {
                throw new IllegalStateException("Unknown Variant: " + b12.c());
            }
            b11 = com.google.crypto.tink.internal.v.b(num.intValue());
        }
        return new C4040w(b12, c7307b, b11, num);
    }

    @Override // He.g
    public final Integer c() {
        return this.f26905d;
    }

    @Override // T7.AbstractC4020b, He.g
    public final S7.q d() {
        return this.f26902a;
    }

    @Override // T7.AbstractC4020b
    public final C7306a e() {
        return this.f26904c;
    }

    @Override // T7.AbstractC4020b
    /* renamed from: f */
    public final AbstractC4021c d() {
        return this.f26902a;
    }

    public final C7307b h() {
        return this.f26903b;
    }

    public final C4043z i() {
        return this.f26902a;
    }
}
