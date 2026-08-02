package Ve;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import xe.C10727i;

/* renamed from: Ve.nf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4473nf extends M1.b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4524p8 f31659a;

    /* renamed from: b, reason: collision with root package name */
    public final Y9 f31660b;

    public C4473nf(InterfaceC4524p8 sPayRepository, Y9 sPaySdkReducer) {
        Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        this.f31659a = sPayRepository;
        this.f31660b = sPaySdkReducer;
    }

    @Override // M1.b
    public final Object f(Object obj, xe.I i11, kotlin.coroutines.d dVar) {
        Object f7 = C10727i.f(i11.plus(xe.X0.b()), new Ke(this, (Mf) obj, i11, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }
}
