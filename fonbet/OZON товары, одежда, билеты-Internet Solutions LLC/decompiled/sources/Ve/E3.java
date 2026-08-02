package Ve;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import kotlin.Unit;

/* loaded from: classes10.dex */
public final class E3 implements InterfaceC2395h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f28897a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4318i4 f28898b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Vm f28899c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Vl f28900d;

    public E3(Ae.M0 m02, C4318i4 c4318i4, Vm vm, Vl vl) {
        this.f28897a = m02;
        this.f28898b = c4318i4;
        this.f28899c = vm;
        this.f28900d = vl;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(InterfaceC2397i interfaceC2397i, kotlin.coroutines.d dVar) {
        Object collect = this.f28897a.collect(new C4115b3(interfaceC2397i, this.f28898b, this.f28899c, this.f28900d), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
