package Ve;

import kotlin.jvm.internal.Intrinsics;
import xe.C10727i;

/* loaded from: classes10.dex */
public final class Dk extends E {

    /* renamed from: a, reason: collision with root package name */
    public final Yn f28873a;

    /* renamed from: b, reason: collision with root package name */
    public final Vm f28874b;

    public Dk(Yn fingerprintInteractor, Vm sPayDataContract) {
        Intrinsics.checkNotNullParameter(fingerprintInteractor, "fingerprintInteractor");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        this.f28873a = fingerprintInteractor;
        this.f28874b = sPayDataContract;
    }

    public final Object i(He.b bVar, kotlin.coroutines.jvm.internal.c cVar) {
        return C10727i.f(bVar, new C4161ck(this, null), cVar);
    }
}
