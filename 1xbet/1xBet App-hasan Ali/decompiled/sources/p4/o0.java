package p4;

/* loaded from: classes.dex */
public final class o0 extends u4.p {

    /* renamed from: o, reason: collision with root package name */
    public final ThreadLocal f18813o;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o0(a4.c cVar, a4.h hVar) {
        super(cVar, hVar.l(r0) == null ? hVar.m(r0) : hVar);
        p0 p0Var = p0.f18816k;
        this.f18813o = new ThreadLocal();
        if (cVar.getContext().l(a4.d.f6648k) instanceof AbstractC2277q) {
            return;
        }
        Object l5 = u4.a.l(hVar, null);
        u4.a.g(hVar, l5);
        g0(hVar, l5);
    }

    public final boolean f0() {
        boolean z3 = this.threadLocalIsSet && this.f18813o.get() == null;
        this.f18813o.remove();
        return !z3;
    }

    public final void g0(a4.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f18813o.set(new W3.h(hVar, obj));
    }

    @Override // u4.p, p4.b0
    public final void x(Object obj) {
        if (this.threadLocalIsSet) {
            W3.h hVar = (W3.h) this.f18813o.get();
            if (hVar != null) {
                u4.a.g((a4.h) hVar.f6036k, hVar.f6037l);
            }
            this.f18813o.remove();
        }
        Object r5 = AbstractC2282w.r(obj);
        a4.c cVar = this.f20111n;
        a4.h context = cVar.getContext();
        Object l5 = u4.a.l(context, null);
        o0 v4 = l5 != u4.a.f20078d ? AbstractC2282w.v(cVar, context, l5) : null;
        try {
            this.f20111n.resumeWith(r5);
            if (v4 == null || v4.f0()) {
                u4.a.g(context, l5);
            }
        } catch (Throwable th) {
            if (v4 == null || v4.f0()) {
                u4.a.g(context, l5);
            }
            throw th;
        }
    }
}
