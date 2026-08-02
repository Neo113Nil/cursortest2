package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class M implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final C4252fp f29443a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f29444b;

    public M(C4252fp c4252fp, Pc.a aVar) {
        this.f29443a = c4252fp;
        this.f29444b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        Yn fingerprintInteractor = (Yn) this.f29443a.get();
        Vm sPayDataContract = (Vm) this.f29444b.get();
        Intrinsics.checkNotNullParameter(fingerprintInteractor, "fingerprintInteractor");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        return new Dk(fingerprintInteractor, sPayDataContract);
    }
}
