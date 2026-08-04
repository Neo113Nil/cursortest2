package D6;

/* JADX INFO: loaded from: classes2.dex */
public final class G0 extends I6.t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ThreadLocal f1792e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public G0(p065i6.d dVar, p065i6.i iVar) {
        H0 h6 = H0.f1793a;
        super(dVar, iVar.get(h6) == null ? iVar.plus(h6) : iVar);
        this.f1792e = new ThreadLocal();
        if (dVar.getContext().get(p065i6.e.f14073a) instanceof A) {
            return;
        }
        Object objM = I6.a.m(iVar, null);
        I6.a.g(iVar, objM);
        S(iVar, objM);
    }

    public final boolean R() {
        boolean z4 = this.threadLocalIsSet && this.f1792e.get() == null;
        this.f1792e.remove();
        return !z4;
    }

    public final void S(p065i6.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f1792e.set(new p044f6.d(iVar, obj));
    }

    @Override // I6.t, D6.s0
    public final void i(Object obj) {
        if (this.threadLocalIsSet) {
            p044f6.d dVar = (p044f6.d) this.f1792e.get();
            if (dVar != null) {
                I6.a.g((p065i6.i) dVar.f13006a, dVar.f13007b);
            }
            this.f1792e.remove();
        }
        Object objR = E.r(obj);
        p065i6.d dVar2 = this.f3757d;
        p065i6.i context = dVar2.getContext();
        Object objM = I6.a.m(context, null);
        G0 g0W = objM != I6.a.f3721f ? E.w(dVar2, context, objM) : null;
        try {
            this.f3757d.resumeWith(objR);
        } finally {
            if (g0W == null || g0W.R()) {
                I6.a.g(context, objM);
            }
        }
    }
}
