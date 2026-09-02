package g1;

import a.AbstractC0009a;
import b1.AbstractC0013a;
import b1.C0023k;

/* loaded from: classes.dex */
public class t extends AbstractC0013a implements O0.c {

    /* renamed from: d, reason: collision with root package name */
    public final O0.g f1177d;

    public t(M0.i iVar, O0.g gVar) {
        super(iVar, true);
        this.f1177d = gVar;
    }

    @Override // O0.c
    public final O0.c c() {
        O0.g gVar = this.f1177d;
        if (gVar != null) {
            return gVar;
        }
        return null;
    }

    @Override // b1.S
    public final void l(Object obj) {
        M0.d r2 = AbstractC0009a.r(this.f1177d);
        if (obj instanceof C0023k) {
            obj = V.a.k(((C0023k) obj).f668a);
        }
        a.i(r2, obj, null);
    }

    @Override // b1.S
    public final void m(Object obj) {
        O0.g gVar = this.f1177d;
        if (obj instanceof C0023k) {
            obj = V.a.k(((C0023k) obj).f668a);
        }
        gVar.f(obj);
    }
}
