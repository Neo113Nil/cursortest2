package A0;

import android.content.Context;
import l.s0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public Context f72a;

    public m a() {
        Context context = this.f72a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        m mVar = new m();
        mVar.f73a = C0.a.a(o.f80a);
        b0.i iVar = new b0.i(1, context);
        mVar.f74b = iVar;
        mVar.f75c = C0.a.a(new a1.e(iVar, 3, new B0.f(iVar, 0)));
        b0.i iVar2 = mVar.f74b;
        mVar.f76d = new J1.i(3, iVar2);
        c2.a a3 = C0.a.a(new a1.e(mVar.f76d, 6, C0.a.a(new B0.f(iVar2, 1))));
        mVar.f77e = a3;
        P0.j jVar = new P0.j(2);
        b0.i iVar3 = mVar.f74b;
        j jVar2 = new j(iVar3, a3, jVar, 4);
        c2.a aVar = mVar.f73a;
        c2.a aVar2 = mVar.f75c;
        A.e eVar = new A.e(aVar, aVar2, jVar2, a3, a3);
        s0 s0Var = new s0();
        s0Var.f9878a = iVar3;
        s0Var.f9879b = aVar2;
        s0Var.f9880c = a3;
        s0Var.f9881d = jVar2;
        s0Var.f9882e = aVar;
        s0Var.f = a3;
        s0Var.f9883g = a3;
        mVar.f = C0.a.a(new j(eVar, s0Var, new D0.a(aVar, a3, jVar2, a3), 3));
        return mVar;
    }
}
