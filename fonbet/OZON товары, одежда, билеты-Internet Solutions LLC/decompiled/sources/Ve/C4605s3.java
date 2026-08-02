package Ve;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import xe.C10727i;

/* renamed from: Ve.s3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4605s3 extends M1.b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4524p8 f32003a;

    /* renamed from: b, reason: collision with root package name */
    public final Y9 f32004b;

    public C4605s3(InterfaceC4524p8 sPayRepository, Y9 sPaySdkReducer) {
        Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        this.f32003a = sPayRepository;
        this.f32004b = sPaySdkReducer;
    }

    @Override // M1.b
    public final Object f(Object obj, xe.I i11, kotlin.coroutines.d dVar) {
        Object f7 = C10727i.f(i11.plus(xe.X0.b()), new O2(this, (V3) obj, i11, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }
}
