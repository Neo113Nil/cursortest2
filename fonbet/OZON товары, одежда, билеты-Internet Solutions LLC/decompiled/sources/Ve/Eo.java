package Ve;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import kotlin.Unit;

/* loaded from: classes10.dex */
public final class Eo implements InterfaceC2395h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4822zl f28945a;

    public Eo(C4822zl c4822zl) {
        this.f28945a = c4822zl;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(InterfaceC2397i interfaceC2397i, kotlin.coroutines.d dVar) {
        Object collect = this.f28945a.collect(new C4230f3(interfaceC2397i, 1), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
