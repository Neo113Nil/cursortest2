package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class B4 implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final C4609s7 f28662a;

    /* renamed from: b, reason: collision with root package name */
    public final T4 f28663b;

    /* renamed from: c, reason: collision with root package name */
    public final Pc.a f28664c;

    /* renamed from: d, reason: collision with root package name */
    public final Pc.a f28665d;

    /* renamed from: e, reason: collision with root package name */
    public final Pc.a f28666e;

    /* renamed from: f, reason: collision with root package name */
    public final Pc.a f28667f;

    public B4(C4609s7 c4609s7, T4 t42, Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4) {
        this.f28662a = c4609s7;
        this.f28663b = t42;
        this.f28664c = aVar;
        this.f28665d = aVar2;
        this.f28666e = aVar3;
        this.f28667f = aVar4;
    }

    @Override // Pc.a
    public final Object get() {
        InterfaceC4524p8 sPayRepository = (InterfaceC4524p8) this.f28662a.get();
        InterfaceC4793yk commonRepository = (InterfaceC4793yk) this.f28663b.get();
        Y9 sPaySdkReducer = (Y9) this.f28664c.get();
        Vm sPayDataContract = (Vm) this.f28665d.get();
        C4248fl featuresHandler = (C4248fl) this.f28666e.get();
        Vl sPaySdkConfigRepository = (Vl) this.f28667f.get();
        Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
        Intrinsics.checkNotNullParameter(commonRepository, "commonRepository");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        Intrinsics.checkNotNullParameter(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        return new C4790yh(sPayRepository, commonRepository, sPaySdkReducer, sPayDataContract, featuresHandler, sPaySdkConfigRepository);
    }
}
