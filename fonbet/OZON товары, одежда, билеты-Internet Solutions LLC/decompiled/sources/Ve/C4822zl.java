package Ve;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import kotlin.Unit;

/* renamed from: Ve.zl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4822zl implements InterfaceC2395h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T1 f32672a;

    public C4822zl(T1 t12) {
        this.f32672a = t12;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(InterfaceC2397i interfaceC2397i, kotlin.coroutines.d dVar) {
        Object collect = this.f32672a.collect(new C4094ab(interfaceC2397i, 2), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
