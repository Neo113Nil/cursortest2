package u4;

import c4.InterfaceC0543d;
import p4.AbstractC2261a;
import p4.AbstractC2282w;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public class p extends AbstractC2261a implements InterfaceC0543d {

    /* renamed from: n, reason: collision with root package name */
    public final a4.c f20111n;

    public p(a4.c cVar, a4.h hVar) {
        super(hVar, true);
        this.f20111n = cVar;
    }

    @Override // p4.b0
    public final boolean P() {
        return true;
    }

    @Override // c4.InterfaceC0543d
    public final InterfaceC0543d getCallerFrame() {
        a4.c cVar = this.f20111n;
        if (cVar instanceof InterfaceC0543d) {
            return (InterfaceC0543d) cVar;
        }
        return null;
    }

    @Override // p4.b0
    public void w(Object obj) {
        a.h(AbstractC2346c.v(this.f20111n), AbstractC2282w.r(obj));
    }

    @Override // p4.b0
    public void x(Object obj) {
        this.f20111n.resumeWith(AbstractC2282w.r(obj));
    }
}
