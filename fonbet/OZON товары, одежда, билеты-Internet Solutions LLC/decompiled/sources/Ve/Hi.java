package Ve;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Hi extends M1.b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4524p8 f29162a;

    public Hi(InterfaceC4524p8 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f29162a = repository;
    }

    @Override // M1.b
    public final Object f(Object obj, xe.I i11, kotlin.coroutines.d dVar) {
        ((AbstractC4332ij) obj).getClass();
        Object q11 = ((C4710vl) this.f29162a).q(null, dVar);
        return q11 == Wc.a.COROUTINE_SUSPENDED ? q11 : Unit.f71690a;
    }
}
