package Ve;

import Ae.InterfaceC2397i;
import kotlin.Unit;

/* loaded from: classes10.dex */
public final class S1 implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S0 f29939a;

    public S1(S0 s02) {
        this.f29939a = s02;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        Fi fi2 = (Fi) obj;
        S0 s02 = this.f29939a;
        if (fi2 != null) {
            s02.f29938n.setSpasiboButtonState(fi2);
            s02.f29938n.b();
        } else {
            s02.f29938n.a();
        }
        return Unit.f71690a;
    }
}
