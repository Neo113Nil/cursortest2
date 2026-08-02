package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.a1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4084a1 implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final C4609s7 f30622a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f30623b;

    public C4084a1(C4609s7 c4609s7, Pc.a aVar) {
        this.f30622a = c4609s7;
        this.f30623b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        InterfaceC4524p8 sPayRepository = (InterfaceC4524p8) this.f30622a.get();
        Vm sPayDataContract = (Vm) this.f30623b.get();
        Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        return new Ar(sPayRepository, sPayDataContract);
    }
}
