package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class P2 implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final C4609s7 f29663a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f29664b;

    public P2(C4609s7 c4609s7, Pc.a aVar) {
        this.f29663a = c4609s7;
        this.f29664b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        InterfaceC4524p8 sPayRepository = (InterfaceC4524p8) this.f29663a.get();
        Vm sPayDataContract = (Vm) this.f29664b.get();
        Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        return new O5(sPayRepository, sPayDataContract);
    }
}
