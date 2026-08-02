package Ve;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import xe.C10727i;

/* renamed from: Ve.a8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4091a8 extends M1.b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4524p8 f30642a;

    /* renamed from: b, reason: collision with root package name */
    public final Y9 f30643b;

    /* renamed from: c, reason: collision with root package name */
    public final C4248fl f30644c;

    /* renamed from: d, reason: collision with root package name */
    public int f30645d;

    public C4091a8(InterfaceC4524p8 sPayRepository, Y9 sPaySdkReducer, C4248fl featuresHandler) {
        Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        this.f30642a = sPayRepository;
        this.f30643b = sPaySdkReducer;
        this.f30644c = featuresHandler;
    }

    @Override // M1.b
    public final Object f(Object obj, xe.I i11, kotlin.coroutines.d dVar) {
        Object f7 = C10727i.f(i11.plus(xe.X0.b()), new U6(this, (D8) obj, i11, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }
}
