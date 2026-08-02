package Ae;

import kotlin.Unit;

/* loaded from: classes10.dex */
public final class W implements InterfaceC2395h<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f932a;

    public W(InterfaceC2395h interfaceC2395h) {
        this.f932a = interfaceC2395h;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(InterfaceC2397i<? super Object> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        Object collect = this.f932a.collect(new X(interfaceC2397i), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
