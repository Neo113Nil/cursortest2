package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class W3 implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30241a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f30242b;

    /* renamed from: c, reason: collision with root package name */
    public final Pc.a f30243c;

    /* renamed from: d, reason: collision with root package name */
    public final Jb.e f30244d;

    public W3(Pc.a aVar, Pc.a aVar2, B6 b62) {
        this.f30242b = aVar;
        this.f30243c = aVar2;
        this.f30244d = b62;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f30241a) {
            case 0:
                InterfaceC4524p8 sPayRepository = (InterfaceC4524p8) ((C4609s7) this.f30244d).get();
                Y9 sPaySdkReducer = (Y9) this.f30242b.get();
                Vi fraudMonResultHandler = new Vi();
                C4248fl featuresHandler = (C4248fl) this.f30243c.get();
                Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
                Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
                Intrinsics.checkNotNullParameter(fraudMonResultHandler, "fraudMonResultHandler");
                Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
                return new C4183dd(sPayRepository, sPaySdkReducer, fraudMonResultHandler, featuresHandler);
            default:
                Ib sPayStorage = (Ib) this.f30242b.get();
                Vm sPayDataContract = (Vm) this.f30243c.get();
                Te metricFacade = (Te) ((B6) this.f30244d).get();
                Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
                Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
                Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
                return new C4238fb(sPayStorage, sPayDataContract, metricFacade);
        }
    }

    public W3(C4609s7 c4609s7, Pc.a aVar, C4542pq c4542pq, Pc.a aVar2) {
        this.f30244d = c4609s7;
        this.f30242b = aVar;
        this.f30243c = aVar2;
    }
}
