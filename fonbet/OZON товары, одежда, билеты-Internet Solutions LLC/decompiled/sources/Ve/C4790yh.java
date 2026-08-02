package Ve;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import xe.C10727i;

/* renamed from: Ve.yh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4790yh extends M1.b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4524p8 f32574a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4793yk f32575b;

    /* renamed from: c, reason: collision with root package name */
    public final Y9 f32576c;

    /* renamed from: d, reason: collision with root package name */
    public final Vm f32577d;

    /* renamed from: e, reason: collision with root package name */
    public final C4248fl f32578e;

    /* renamed from: f, reason: collision with root package name */
    public final Vl f32579f;

    public C4790yh(InterfaceC4524p8 sPayRepository, InterfaceC4793yk commonRepository, Y9 sPaySdkReducer, Vm sPayDataContract, C4248fl featuresHandler, Vl sPaySdkConfigRepository) {
        Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
        Intrinsics.checkNotNullParameter(commonRepository, "commonRepository");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        Intrinsics.checkNotNullParameter(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        this.f32574a = sPayRepository;
        this.f32575b = commonRepository;
        this.f32576c = sPaySdkReducer;
        this.f32577d = sPayDataContract;
        this.f32578e = featuresHandler;
        this.f32579f = sPaySdkConfigRepository;
    }

    @Override // M1.b
    public final Object f(Object obj, xe.I i11, kotlin.coroutines.d dVar) {
        Object f7 = C10727i.f(i11.plus(xe.X0.b()), new Sg(this, (Yh) obj, i11, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }
}
