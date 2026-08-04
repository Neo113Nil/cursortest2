package I6;

import D6.AbstractC0109a;
import D6.E;

/* JADX INFO: loaded from: classes2.dex */
public class t extends AbstractC0109a implements p077k6.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p065i6.d f3757d;

    public t(p065i6.d dVar, p065i6.i iVar) {
        super(iVar, true);
        this.f3757d = dVar;
    }

    @Override // D6.s0
    public final boolean B() {
        return true;
    }

    @Override // p077k6.d
    public final p077k6.d getCallerFrame() {
        p065i6.d dVar = this.f3757d;
        if (dVar instanceof p077k6.d) {
            return (p077k6.d) dVar;
        }
        return null;
    }

    @Override // D6.s0
    public void h(Object obj) {
        a.h(P6.b.v(this.f3757d), E.r(obj), null);
    }

    @Override // D6.s0
    public void i(Object obj) {
        this.f3757d.resumeWith(E.r(obj));
    }
}
