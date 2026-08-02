package Ve;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import xe.C10727i;

/* renamed from: Ve.dh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4187dh extends M1.b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4524p8 f30881a;

    /* renamed from: b, reason: collision with root package name */
    public final Y9 f30882b;

    public C4187dh(InterfaceC4524p8 sPayRepository, Ib sPayStorage, Y9 sPaySdkReducer, Vm sPayDataContract) {
        Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        this.f30881a = sPayRepository;
        this.f30882b = sPaySdkReducer;
    }

    @Override // M1.b
    public final Object f(Object obj, xe.I i11, kotlin.coroutines.d dVar) {
        Object f7 = C10727i.f(i11.plus(xe.X0.b()), new Bg(this, (Jh) obj, i11, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }
}
