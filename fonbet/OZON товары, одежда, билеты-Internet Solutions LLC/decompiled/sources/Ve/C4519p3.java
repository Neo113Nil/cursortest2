package Ve;

import fd.InterfaceC6511n;
import kotlin.Unit;

/* renamed from: Ve.p3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4519p3 extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Jj f31759d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Jj f31760e;

    public C4519p3() {
        super(3, null);
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C4519p3 c4519p3 = new C4519p3(3, (kotlin.coroutines.d) obj3);
        c4519p3.f31759d = (Jj) obj;
        c4519p3.f31760e = (Jj) obj2;
        return c4519p3.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        Jj jj2 = this.f31759d;
        return jj2 == null ? this.f31760e : jj2;
    }
}
