package Ve;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import kotlin.Unit;

/* renamed from: Ve.o5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4492o5 implements InterfaceC2395h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A3 f31707a;

    public C4492o5(A3 a32) {
        this.f31707a = a32;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(InterfaceC2397i interfaceC2397i, kotlin.coroutines.d dVar) {
        Object collect = this.f31707a.collect(new I4(interfaceC2397i, 0), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
