package Ve;

import Ae.C2399j;
import kotlin.jvm.internal.Intrinsics;
import xe.C10727i;

/* loaded from: classes6.dex */
public final class Se extends AbstractC4599rq {

    /* renamed from: d, reason: collision with root package name */
    public final Ib f29971d;

    /* renamed from: e, reason: collision with root package name */
    public final C4700vb f29972e;

    /* renamed from: f, reason: collision with root package name */
    public final Ae.x0 f29973f;

    /* renamed from: g, reason: collision with root package name */
    public final Ae.M0 f29974g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Se(Te metricFacade, Vm sPayDataContract, Y9 sPaySdkReducer, Ib sPayStorage, C4700vb logFileManager) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        Intrinsics.checkNotNullParameter(logFileManager, "logFileManager");
        this.f29971d = sPayStorage;
        this.f29972e = logFileManager;
        Ae.x0 a11 = Ae.O0.a(null);
        this.f29973f = a11;
        this.f29974g = C2399j.b(a11);
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new C4530pe(this, null), 3);
    }
}
