package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.i6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4320i6 implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31268a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f31269b;

    /* renamed from: c, reason: collision with root package name */
    public final Pc.a f31270c;

    public C4320i6(Pc.a aVar, Pc.a aVar2) {
        this.f31269b = aVar;
        this.f31270c = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f31268a) {
            case 0:
                In appTokenStoreSP = (In) this.f31269b.get();
                C4365jn appTokenRepository = (C4365jn) this.f31270c.get();
                Intrinsics.checkNotNullParameter(appTokenStoreSP, "appTokenStoreSP");
                Intrinsics.checkNotNullParameter(appTokenRepository, "appTokenRepository");
                return new C4588rf(appTokenStoreSP, appTokenRepository);
            default:
                InterfaceC4524p8 sPayRepository = (InterfaceC4524p8) ((C4609s7) this.f31270c).get();
                Y9 sPaySdkReducer = (Y9) this.f31269b.get();
                Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
                Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
                return new Z0(sPayRepository, sPaySdkReducer);
        }
    }

    public C4320i6(C4609s7 c4609s7, Pc.a aVar) {
        this.f31270c = c4609s7;
        this.f31269b = aVar;
    }
}
