package Ve;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import xe.C10727i;

/* renamed from: Ve.c9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4150c9 extends M1.b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4524p8 f30786a;

    /* renamed from: b, reason: collision with root package name */
    public final Y9 f30787b;

    public C4150c9(InterfaceC4524p8 sPayRepository, Y9 sPaySdkReducer) {
        Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        this.f30786a = sPayRepository;
        this.f30787b = sPaySdkReducer;
    }

    @Override // M1.b
    public final Object f(Object obj, xe.I i11, kotlin.coroutines.d dVar) {
        Object f7 = C10727i.f(i11.plus(xe.X0.b()), new C4781y8(this, (E9) obj, i11, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }
}
