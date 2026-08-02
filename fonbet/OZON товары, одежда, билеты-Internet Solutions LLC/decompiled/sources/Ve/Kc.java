package Ve;

import Ae.InterfaceC2397i;
import kotlin.Unit;
import spay.sdk.domain.model.PayStrategy;

/* loaded from: classes10.dex */
public final class Kc implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4817zg f29346a;

    public Kc(C4817zg c4817zg) {
        this.f29346a = c4817zg;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        PayStrategy payStrategy = (PayStrategy) obj;
        X4.a aVar = this.f29346a.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        ((Z4) aVar).f30562c.setPayStrategy(payStrategy);
        return Unit.f71690a;
    }
}
