package Ve;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import kotlin.Unit;

/* renamed from: Ve.er, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4225er implements InterfaceC2395h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f30958a;

    public C4225er(Ae.M0 m02) {
        this.f30958a = m02;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(InterfaceC2397i interfaceC2397i, kotlin.coroutines.d dVar) {
        Object collect = this.f30958a.collect(new Aq(interfaceC2397i), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
