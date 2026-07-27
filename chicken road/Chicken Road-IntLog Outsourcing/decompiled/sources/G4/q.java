package G4;

import H4.C0070a;
import M.P;
import M.b0;
import k4.InterfaceC1218d;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class q implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1099a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1100b;

    public /* synthetic */ q(int i2, Object obj) {
        this.f1099a = i2;
        this.f1100b = obj;
    }

    @Override // G4.e
    public final Object b(Object obj, InterfaceC1218d interfaceC1218d) {
        Object e3;
        switch (this.f1099a) {
            case 0:
                ((kotlin.jvm.internal.s) this.f1100b).f10741a = obj;
                throw new C0070a(this);
            case 1:
                P p5 = (P) this.f1100b;
                boolean z = p5.f1620h.f() instanceof b0;
                f4.v vVar = f4.v.f5689a;
                return (z || (e3 = P.e(p5, true, interfaceC1218d)) != EnumC1260a.f11058a) ? vVar : e3;
            default:
                ((m0.i) this.f1100b).accept(obj);
                return f4.v.f5689a;
        }
    }
}
