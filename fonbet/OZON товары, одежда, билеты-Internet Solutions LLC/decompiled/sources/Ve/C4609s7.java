package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.s7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4609s7 implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final Pc.a f32025a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f32026b;

    /* renamed from: c, reason: collision with root package name */
    public final Pc.a f32027c;

    /* renamed from: d, reason: collision with root package name */
    public final B6 f32028d;

    /* renamed from: e, reason: collision with root package name */
    public final X7 f32029e;

    public C4609s7(Pc.a aVar, Pc.a aVar2, Pc.a aVar3, B6 b62, X7 x72) {
        this.f32025a = aVar;
        this.f32026b = aVar2;
        this.f32027c = aVar3;
        this.f32028d = b62;
        this.f32029e = x72;
    }

    @Override // Pc.a
    public final Object get() {
        Un sPayDataSource = (Un) this.f32025a.get();
        Vm sPayDataContract = (Vm) this.f32026b.get();
        C4248fl featuresHandler = (C4248fl) this.f32027c.get();
        Te metricFacade = (Te) this.f32028d.get();
        this.f32029e.getClass();
        C4131bj networkErrorHandler = new C4131bj();
        C4131bj networkErrorHandlerImpl = new C4131bj();
        Xh apiResponseErrorHandlerImpl = new Xh();
        Intrinsics.checkNotNullParameter(sPayDataSource, "sPayDataSource");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(networkErrorHandler, "networkErrorHandler");
        Intrinsics.checkNotNullParameter(networkErrorHandlerImpl, "networkErrorHandlerImpl");
        Intrinsics.checkNotNullParameter(apiResponseErrorHandlerImpl, "apiResponseErrorHandlerImpl");
        return new C4710vl(sPayDataSource, sPayDataContract, featuresHandler, metricFacade, networkErrorHandler, networkErrorHandlerImpl, apiResponseErrorHandlerImpl);
    }
}
