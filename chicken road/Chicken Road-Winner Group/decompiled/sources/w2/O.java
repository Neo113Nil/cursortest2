package w2;

import d2.C0279i;

/* loaded from: classes.dex */
public final class O extends U {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10476e;
    public final Object f;

    public /* synthetic */ O(int i3, Object obj) {
        this.f10476e = i3;
        this.f = obj;
    }

    @Override // o2.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f10476e) {
            case 0:
                j((Throwable) obj);
                break;
            default:
                j((Throwable) obj);
                break;
        }
        return C0279i.f4852a;
    }

    @Override // w2.U
    public final void j(Throwable th) {
        switch (this.f10476e) {
            case 0:
                ((o2.l) this.f).invoke(th);
                break;
            default:
                Object C2 = i().C();
                boolean z3 = C2 instanceof C1235n;
                V v3 = (V) this.f;
                if (!z3) {
                    v3.e(AbstractC1242v.l(C2));
                    break;
                } else {
                    v3.e(X0.a.n(((C1235n) C2).f10517a));
                    break;
                }
        }
    }
}
