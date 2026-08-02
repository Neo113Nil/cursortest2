package Ve;

import fd.InterfaceC6511n;
import kotlin.Unit;

/* loaded from: classes10.dex */
public final class B0 extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ String f28654d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Fh f28655e;

    public B0() {
        super(3, null);
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        B0 b02 = new B0(3, (kotlin.coroutines.d) obj3);
        b02.f28654d = (String) obj;
        b02.f28655e = (Fh) obj2;
        return b02.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        String str = this.f28654d;
        AbstractC4245fi abstractC4245fi = this.f28655e.f29004a;
        if (abstractC4245fi instanceof Bq) {
            M9 m92 = ((Bq) abstractC4245fi).f28729a;
            if ((m92 instanceof W6) || (m92 instanceof G8)) {
                return M1.b.n(str);
            }
        }
        if ((abstractC4245fi instanceof Lk) || (abstractC4245fi instanceof F7) || (abstractC4245fi instanceof N8)) {
            return M1.b.n(str);
        }
        return null;
    }
}
