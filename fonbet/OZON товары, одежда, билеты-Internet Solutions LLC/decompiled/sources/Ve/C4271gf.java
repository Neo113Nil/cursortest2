package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.gf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4271gf implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final B6 f31109a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f31110b;

    /* renamed from: c, reason: collision with root package name */
    public final Pc.a f31111c;

    public C4271gf(Pc.a aVar, Pc.a aVar2, B6 b62) {
        this.f31109a = b62;
        this.f31110b = aVar;
        this.f31111c = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        Te metricFacade = (Te) this.f31109a.get();
        Vm sPayDataContract = (Vm) this.f31110b.get();
        Y9 sPaySdkReducer = (Y9) this.f31111c.get();
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        return new Ce(metricFacade, sPayDataContract, sPaySdkReducer);
    }
}
