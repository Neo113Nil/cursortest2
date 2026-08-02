package Ve;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import xe.C10727i;

/* renamed from: Ve.dd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4183dd extends M1.b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4524p8 f30870a;

    /* renamed from: b, reason: collision with root package name */
    public final Y9 f30871b;

    /* renamed from: c, reason: collision with root package name */
    public final Vi f30872c;

    /* renamed from: d, reason: collision with root package name */
    public final C4248fl f30873d;

    public C4183dd(InterfaceC4524p8 sPayRepository, Y9 sPaySdkReducer, Vi fraudMonResultHandler, C4248fl featuresHandler) {
        Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(fraudMonResultHandler, "fraudMonResultHandler");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        this.f30870a = sPayRepository;
        this.f30871b = sPaySdkReducer;
        this.f30872c = fraudMonResultHandler;
        this.f30873d = featuresHandler;
    }

    @Override // M1.b
    public final Object f(Object obj, xe.I i11, kotlin.coroutines.d dVar) {
        Object f7 = C10727i.f(i11.plus(xe.X0.b()), new Ac(this, (Hd) obj, i11, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }
}
