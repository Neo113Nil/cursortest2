package Ve;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import xe.C10727i;

/* loaded from: classes10.dex */
public final class Bj extends M1.b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4524p8 f28714a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4793yk f28715b;

    /* renamed from: c, reason: collision with root package name */
    public final Y9 f28716c;

    /* renamed from: d, reason: collision with root package name */
    public final C4248fl f28717d;

    /* renamed from: e, reason: collision with root package name */
    public final Vl f28718e;

    public Bj(InterfaceC4524p8 sPayRepository, InterfaceC4793yk commonRepository, Y9 sPaySdkReducer, C4248fl featuresHandler, Vl sPaySdkConfigRepository) {
        Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
        Intrinsics.checkNotNullParameter(commonRepository, "commonRepository");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        Intrinsics.checkNotNullParameter(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        this.f28714a = sPayRepository;
        this.f28715b = commonRepository;
        this.f28716c = sPaySdkReducer;
        this.f28717d = featuresHandler;
        this.f28718e = sPaySdkConfigRepository;
    }

    @Override // M1.b
    public final Object f(Object obj, xe.I i11, kotlin.coroutines.d dVar) {
        Object f7 = C10727i.f(i11.plus(xe.X0.b()), new Wi(this, (Al) obj, i11, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }
}
