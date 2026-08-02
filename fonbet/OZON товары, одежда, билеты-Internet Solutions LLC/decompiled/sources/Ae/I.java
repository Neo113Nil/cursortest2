package Ae;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class I implements InterfaceC2395h<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f817a;

    public I(InterfaceC2395h interfaceC2395h) {
        this.f817a = interfaceC2395h;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(InterfaceC2397i<? super Object> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        Object collect = this.f817a.collect(new J(new kotlin.jvm.internal.K(), interfaceC2397i), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
