package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.dr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4196dr implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final B6 f30896a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f30897b;

    /* renamed from: c, reason: collision with root package name */
    public final Pc.a f30898c;

    public C4196dr(Pc.a aVar, Pc.a aVar2, B6 b62) {
        this.f30896a = b62;
        this.f30897b = aVar;
        this.f30898c = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        Te metricFacade = (Te) this.f30896a.get();
        Vm sPayDataContract = (Vm) this.f30897b.get();
        Y9 sPaySdkReducer = (Y9) this.f30898c.get();
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        return new C4799yq(metricFacade, sPayDataContract, sPaySdkReducer);
    }
}
