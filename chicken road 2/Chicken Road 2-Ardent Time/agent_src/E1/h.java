package E1;

/* loaded from: classes.dex */
public final class h extends z1.A implements m1.InterfaceC0932c, k1.d {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f274h = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(E1.h.class, java.lang.Object.class, "_reusableCancellableContinuation");
    private volatile java.lang.Object _reusableCancellableContinuation;

    /* renamed from: d, reason: collision with root package name */
    public final z1.AbstractC1065s f275d;

    /* renamed from: e, reason: collision with root package name */
    public final m1.AbstractC0931b f276e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f277f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f278g;

    public h(z1.AbstractC1065s abstractC1065s, m1.AbstractC0931b abstractC0931b) {
        super(-1);
        this.f275d = abstractC1065s;
        this.f276e = abstractC0931b;
        this.f277f = E1.AbstractC0000a.f263c;
        this.f278g = E1.AbstractC0000a.l(abstractC0931b.getContext());
    }

    @Override // z1.A
    public final void b(java.lang.Object obj, java.util.concurrent.CancellationException cancellationException) {
        if (obj instanceof z1.C1062o) {
            ((z1.C1062o) obj).f8583b.invoke(cancellationException);
        }
    }

    @Override // m1.InterfaceC0932c
    public final m1.InterfaceC0932c f() {
        m1.AbstractC0931b abstractC0931b = this.f276e;
        if (abstractC0931b != null) {
            return abstractC0931b;
        }
        return null;
    }

    @Override // k1.d
    public final k1.i getContext() {
        return this.f276e.getContext();
    }

    @Override // z1.A
    public final java.lang.Object j() {
        java.lang.Object obj = this.f277f;
        this.f277f = E1.AbstractC0000a.f263c;
        return obj;
    }

    @Override // k1.d
    public final void l(java.lang.Object obj) {
        m1.AbstractC0931b abstractC0931b = this.f276e;
        k1.i context = abstractC0931b.getContext();
        java.lang.Throwable a2 = h1.AbstractC0174f.a(obj);
        java.lang.Object c1061n = a2 == null ? obj : new z1.C1061n(a2, false);
        z1.AbstractC1065s abstractC1065s = this.f275d;
        if (abstractC1065s.n()) {
            this.f277f = c1061n;
            this.f8520c = 0;
            abstractC1065s.l(context, this);
            return;
        }
        z1.H a3 = z1.h0.a();
        if (a3.f8529c >= 4294967296L) {
            this.f277f = c1061n;
            this.f8520c = 0;
            i1.C0188g c0188g = a3.f8531e;
            if (c0188g == null) {
                c0188g = new i1.C0188g();
                a3.f8531e = c0188g;
            }
            c0188g.addLast(this);
            return;
        }
        a3.q(true);
        try {
            k1.i context2 = abstractC0931b.getContext();
            java.lang.Object m2 = E1.AbstractC0000a.m(context2, this.f278g);
            try {
                abstractC0931b.l(obj);
                while (a3.s()) {
                }
            } finally {
                E1.AbstractC0000a.g(context2, m2);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final java.lang.String toString() {
        return "DispatchedContinuation[" + this.f275d + ", " + z1.AbstractC1068v.k(this.f276e) + ']';
    }

    @Override // z1.A
    public final k1.d e() {
        return this;
    }
}
