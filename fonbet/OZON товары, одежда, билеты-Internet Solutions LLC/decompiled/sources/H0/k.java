package H0;

import B1.B;
import D1.AbstractC2810k0;
import K1.K;
import l1.C7786D;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final k f10421c = new k(null, null);

    /* renamed from: a, reason: collision with root package name */
    private final B f10422a;

    /* renamed from: b, reason: collision with root package name */
    private final K f10423b;

    public k(B b11, K k11) {
        this.f10422a = b11;
        this.f10423b = k11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [B1.B] */
    public static k b(k kVar, AbstractC2810k0 abstractC2810k0, K k11, int i11) {
        AbstractC2810k0 abstractC2810k02 = abstractC2810k0;
        if ((i11 & 1) != 0) {
            abstractC2810k02 = kVar.f10422a;
        }
        if ((i11 & 2) != 0) {
            k11 = kVar.f10423b;
        }
        kVar.getClass();
        return new k(abstractC2810k02, k11);
    }

    public final B c() {
        return this.f10422a;
    }

    public final C7786D d(int i11, int i12) {
        K k11 = this.f10423b;
        if (k11 != null) {
            return k11.y(i11, i12);
        }
        return null;
    }

    public final boolean e() {
        K k11 = this.f10423b;
        return (k11 == null || k11.k().f() == 3 || !k11.h()) ? false : true;
    }

    public final K f() {
        return this.f10423b;
    }
}
