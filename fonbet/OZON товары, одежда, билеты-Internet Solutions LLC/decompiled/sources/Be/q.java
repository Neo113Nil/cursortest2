package Be;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import fd.InterfaceC6511n;
import kotlin.Unit;
import xe.N;

/* loaded from: classes10.dex */
public final class q implements InterfaceC2395h<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f3644a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f3645b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f3646c;

    /* JADX WARN: Multi-variable type inference failed */
    public q(InterfaceC2395h interfaceC2395h, InterfaceC2395h interfaceC2395h2, InterfaceC6511n interfaceC6511n) {
        this.f3644a = interfaceC2395h;
        this.f3645b = interfaceC2395h2;
        this.f3646c = (kotlin.coroutines.jvm.internal.j) interfaceC6511n;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
    @Override // Ae.InterfaceC2395h
    public final Object collect(InterfaceC2397i<? super Object> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        Object d11 = N.d(new r(this.f3644a, this.f3645b, interfaceC2397i, this.f3646c, null), dVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }
}
