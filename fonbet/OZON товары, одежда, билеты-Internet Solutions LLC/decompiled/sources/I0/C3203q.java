package I0;

import d2.InterfaceC6040Q;
import e1.InterfaceC6250b;
import org.jetbrains.annotations.NotNull;

/* renamed from: I0.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3203q implements InterfaceC6040Q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6250b f11582a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC3214w f11583b;

    /* renamed from: c, reason: collision with root package name */
    private long f11584c = 0;

    public C3203q(@NotNull InterfaceC6250b interfaceC6250b, @NotNull InterfaceC3214w interfaceC3214w) {
        this.f11582a = interfaceC6250b;
        this.f11583b = interfaceC3214w;
    }

    @Override // d2.InterfaceC6040Q
    /* renamed from: calculatePosition-llwVHH4, reason: not valid java name */
    public final long mo6calculatePositionllwVHH4(@NotNull Z1.o oVar, long j11, @NotNull Z1.s sVar, long j12) {
        long a11 = this.f11583b.a();
        if (!P9.a.d(a11)) {
            a11 = this.f11584c;
        }
        this.f11584c = a11;
        return Z1.m.e(Z1.m.e(oVar.h(), Z1.n.b(a11)), this.f11582a.a(j12, 0L, sVar));
    }
}
