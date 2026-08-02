package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class T4 implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final C4627sp f30015a;

    /* renamed from: b, reason: collision with root package name */
    public final R6 f30016b;

    /* renamed from: c, reason: collision with root package name */
    public final Pc.a f30017c;

    /* renamed from: d, reason: collision with root package name */
    public final B6 f30018d;

    public T4(C4627sp c4627sp, X7 x72, R6 r62, Pc.a aVar, B6 b62) {
        this.f30015a = c4627sp;
        this.f30016b = r62;
        this.f30017c = aVar;
        this.f30018d = b62;
    }

    @Override // Pc.a
    public final Object get() {
        npi.spay.Kq sdkFlowSPayApi = (npi.spay.Kq) this.f30015a.get();
        C4131bj networkErrorHandler = new C4131bj();
        X3 apiResponseErrorHandler = (X3) this.f30016b.get();
        Vm sPayDataContract = (Vm) this.f30017c.get();
        C4131bj networkErrorHandlerImpl = new C4131bj();
        Xh apiResponseErrorHandlerImpl = new Xh();
        Te metricFacade = (Te) this.f30018d.get();
        Intrinsics.checkNotNullParameter(sdkFlowSPayApi, "sdkFlowSPayApi");
        Intrinsics.checkNotNullParameter(networkErrorHandler, "networkErrorHandler");
        Intrinsics.checkNotNullParameter(apiResponseErrorHandler, "apiResponseErrorHandler");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(networkErrorHandlerImpl, "networkErrorHandlerImpl");
        Intrinsics.checkNotNullParameter(apiResponseErrorHandlerImpl, "apiResponseErrorHandlerImpl");
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        return new C4249fm(sdkFlowSPayApi, networkErrorHandler, metricFacade, apiResponseErrorHandler, sPayDataContract, networkErrorHandlerImpl, apiResponseErrorHandlerImpl);
    }
}
