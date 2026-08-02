package Ve;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import kotlin.Unit;

/* renamed from: Ve.r0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4573r0 implements InterfaceC2395h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f31928a;

    public C4573r0(Ae.M0 m02) {
        this.f31928a = m02;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(InterfaceC2397i interfaceC2397i, kotlin.coroutines.d dVar) {
        Object collect = this.f31928a.collect(new J(interfaceC2397i, 0), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
