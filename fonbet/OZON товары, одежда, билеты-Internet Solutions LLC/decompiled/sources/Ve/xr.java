package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class xr implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final C4609s7 f32513a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f32514b;

    /* renamed from: c, reason: collision with root package name */
    public final Pc.a f32515c;

    /* renamed from: d, reason: collision with root package name */
    public final Pc.a f32516d;

    /* renamed from: e, reason: collision with root package name */
    public final M f32517e;

    public xr(C4609s7 c4609s7, Pc.a aVar, Pc.a aVar2, Pc.a aVar3, M m11, C4542pq c4542pq) {
        this.f32513a = c4609s7;
        this.f32514b = aVar;
        this.f32515c = aVar2;
        this.f32516d = aVar3;
        this.f32517e = m11;
    }

    @Override // Pc.a
    public final Object get() {
        InterfaceC4524p8 sPayRepository = (InterfaceC4524p8) this.f32513a.get();
        Y9 sPaySdkReducer = (Y9) this.f32514b.get();
        C4248fl featuresHandler = (C4248fl) this.f32515c.get();
        Vm sPayDataContract = (Vm) this.f32516d.get();
        Dk getDeviceInfoUseCase = (Dk) this.f32517e.get();
        Vi fraudMonResultHandler = new Vi();
        Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(getDeviceInfoUseCase, "getDeviceInfoUseCase");
        Intrinsics.checkNotNullParameter(fraudMonResultHandler, "fraudMonResultHandler");
        return new Wh(sPayRepository, sPaySdkReducer, featuresHandler, sPayDataContract, getDeviceInfoUseCase, fraudMonResultHandler);
    }
}
