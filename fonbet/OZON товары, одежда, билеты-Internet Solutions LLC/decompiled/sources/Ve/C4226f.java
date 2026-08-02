package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4226f implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final C4609s7 f30959a;

    /* renamed from: b, reason: collision with root package name */
    public final T4 f30960b;

    /* renamed from: c, reason: collision with root package name */
    public final Pc.a f30961c;

    /* renamed from: d, reason: collision with root package name */
    public final Pc.a f30962d;

    /* renamed from: e, reason: collision with root package name */
    public final Pc.a f30963e;

    public C4226f(C4609s7 c4609s7, T4 t42, Pc.a aVar, Pc.a aVar2, Pc.a aVar3) {
        this.f30959a = c4609s7;
        this.f30960b = t42;
        this.f30961c = aVar;
        this.f30962d = aVar2;
        this.f30963e = aVar3;
    }

    @Override // Pc.a
    public final Object get() {
        InterfaceC4524p8 sPayRepository = (InterfaceC4524p8) this.f30959a.get();
        InterfaceC4793yk commonRepository = (InterfaceC4793yk) this.f30960b.get();
        Y9 sPaySdkReducer = (Y9) this.f30961c.get();
        C4248fl featuresHandler = (C4248fl) this.f30962d.get();
        Vl sPaySdkConfigRepository = (Vl) this.f30963e.get();
        Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
        Intrinsics.checkNotNullParameter(commonRepository, "commonRepository");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        Intrinsics.checkNotNullParameter(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        return new Bj(sPayRepository, commonRepository, sPaySdkReducer, featuresHandler, sPaySdkConfigRepository);
    }
}
