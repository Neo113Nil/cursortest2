package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class En implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final C4609s7 f28943a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f28944b;

    public En(C4609s7 c4609s7, Pc.a aVar) {
        this.f28943a = c4609s7;
        this.f28944b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        InterfaceC4524p8 sPayRepository = (InterfaceC4524p8) this.f28943a.get();
        Y9 sPaySdkReducer = (Y9) this.f28944b.get();
        Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        return new C4150c9(sPayRepository, sPaySdkReducer);
    }
}
