package Ve;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import xe.C10727i;

/* loaded from: classes10.dex */
public final class Wh extends M1.b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4524p8 f30279a;

    /* renamed from: b, reason: collision with root package name */
    public final Y9 f30280b;

    /* renamed from: c, reason: collision with root package name */
    public final C4248fl f30281c;

    /* renamed from: d, reason: collision with root package name */
    public final Vm f30282d;

    /* renamed from: e, reason: collision with root package name */
    public final Dk f30283e;

    /* renamed from: f, reason: collision with root package name */
    public final Vi f30284f;

    public Wh(InterfaceC4524p8 sPayRepository, Y9 sPaySdkReducer, C4248fl featuresHandler, Vm sPayDataContract, Dk getDeviceInfoUseCase, Vi fraudMonResultHandler) {
        Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(getDeviceInfoUseCase, "getDeviceInfoUseCase");
        Intrinsics.checkNotNullParameter(fraudMonResultHandler, "fraudMonResultHandler");
        this.f30279a = sPayRepository;
        this.f30280b = sPaySdkReducer;
        this.f30281c = featuresHandler;
        this.f30282d = sPayDataContract;
        this.f30283e = getDeviceInfoUseCase;
        this.f30284f = fraudMonResultHandler;
    }

    @Override // M1.b
    public final Object f(Object obj, xe.I i11, kotlin.coroutines.d dVar) {
        Object f7 = C10727i.f(i11.plus(xe.X0.b()), new C4734wh(this, (Al) obj, i11, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }
}
