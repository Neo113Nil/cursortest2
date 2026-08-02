package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class K5 implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final C4609s7 f29334a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f29335b;

    public K5(C4609s7 c4609s7, Pc.a aVar) {
        this.f29334a = c4609s7;
        this.f29335b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        InterfaceC4524p8 sPayRepository = (InterfaceC4524p8) this.f29334a.get();
        Y9 sPaySdkReducer = (Y9) this.f29335b.get();
        Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        return new C4177d7(sPayRepository, sPaySdkReducer);
    }
}
