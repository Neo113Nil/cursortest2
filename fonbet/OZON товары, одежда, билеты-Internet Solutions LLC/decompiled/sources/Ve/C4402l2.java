package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.l2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4402l2 implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final C4609s7 f31495a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f31496b;

    /* renamed from: c, reason: collision with root package name */
    public final Pc.a f31497c;

    /* renamed from: d, reason: collision with root package name */
    public final Pc.a f31498d;

    /* renamed from: e, reason: collision with root package name */
    public final Pc.a f31499e;

    public C4402l2(C4609s7 c4609s7, Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4, C4542pq c4542pq) {
        this.f31495a = c4609s7;
        this.f31496b = aVar;
        this.f31497c = aVar2;
        this.f31498d = aVar3;
        this.f31499e = aVar4;
    }

    @Override // Pc.a
    public final Object get() {
        InterfaceC4524p8 sPayRepository = (InterfaceC4524p8) this.f31495a.get();
        Y9 sPaySdkReducer = (Y9) this.f31496b.get();
        Vm sPayDataContract = (Vm) this.f31497c.get();
        Ib sPayStorage = (Ib) this.f31498d.get();
        C4248fl featuresHandler = (C4248fl) this.f31499e.get();
        Vi fraudMonResultHandler = new Vi();
        Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        Intrinsics.checkNotNullParameter(fraudMonResultHandler, "fraudMonResultHandler");
        return new C4748x3(sPayRepository, sPayDataContract, sPayStorage, sPaySdkReducer, featuresHandler, fraudMonResultHandler);
    }
}
