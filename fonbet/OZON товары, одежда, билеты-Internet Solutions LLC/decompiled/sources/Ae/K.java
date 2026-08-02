package Ae;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class K implements InterfaceC2395h<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f827a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f828b;

    /* JADX WARN: Multi-variable type inference failed */
    public K(InterfaceC2395h interfaceC2395h, Function2 function2) {
        this.f827a = interfaceC2395h;
        this.f828b = (kotlin.coroutines.jvm.internal.j) function2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    @Override // Ae.InterfaceC2395h
    public final Object collect(InterfaceC2397i<? super Object> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        Object collect = this.f827a.collect(new L(new kotlin.jvm.internal.I(), interfaceC2397i, this.f828b), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
