package r0;

import a.AbstractC0018a;
import m0.AbstractC0044a;
import m0.C0054k;

/* loaded from: classes.dex */
public class u extends AbstractC0044a implements a0.c {

    /* renamed from: e, reason: collision with root package name */
    public final a0.f f1195e;

    public u(Y.i iVar, a0.f fVar) {
        super(iVar, true);
        this.f1195e = fVar;
    }

    @Override // a0.c
    public final a0.c f() {
        a0.f fVar = this.f1195e;
        if (fVar != null) {
            return fVar;
        }
        return null;
    }

    @Override // m0.T
    public final void m(Object obj) {
        Y.d n2 = AbstractC0018a.n(this.f1195e);
        if (obj instanceof C0054k) {
            obj = AbstractC0018a.h(((C0054k) obj).f934a);
        }
        AbstractC0088a.g(n2, obj);
    }

    @Override // m0.T
    public final void n(Object obj) {
        if (obj instanceof C0054k) {
            obj = AbstractC0018a.h(((C0054k) obj).f934a);
        }
        this.f1195e.k(obj);
    }
}
