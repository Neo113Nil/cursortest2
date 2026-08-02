package Ve;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import xe.C10727i;

/* renamed from: Ve.tf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4646tf extends M1.b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4524p8 f32101a;

    /* renamed from: b, reason: collision with root package name */
    public final Y9 f32102b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4686uq f32103c;

    /* renamed from: d, reason: collision with root package name */
    public final Y4 f32104d;

    /* renamed from: e, reason: collision with root package name */
    public final Vi f32105e;

    public C4646tf(InterfaceC4524p8 sPayRepository, Y9 sPaySdkReducer, InterfaceC4686uq authHandler, Y4 setCookieHandler, Vi fraudMonResultHandler) {
        Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(authHandler, "authHandler");
        Intrinsics.checkNotNullParameter(setCookieHandler, "setCookieHandler");
        Intrinsics.checkNotNullParameter(fraudMonResultHandler, "fraudMonResultHandler");
        this.f32101a = sPayRepository;
        this.f32102b = sPaySdkReducer;
        this.f32103c = authHandler;
        this.f32104d = setCookieHandler;
        this.f32105e = fraudMonResultHandler;
    }

    @Override // M1.b
    public final Object f(Object obj, xe.I i11, kotlin.coroutines.d dVar) {
        ((C4238fb) this.f32102b).b(new C4209eb(new G8()));
        Object f7 = C10727i.f(i11, new Qe(this, (Rf) obj, i11, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }
}
