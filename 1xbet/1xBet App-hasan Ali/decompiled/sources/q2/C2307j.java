package q2;

/* renamed from: q2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2307j extends AbstractC2305h {
    public final boolean j(Object obj) {
        if (obj == null) {
            obj = AbstractC2305h.f18880q;
        }
        if (!AbstractC2305h.f18879p.p(this, null, obj)) {
            return false;
        }
        AbstractC2305h.c(this);
        return true;
    }

    public final boolean k(Throwable th) {
        if (!AbstractC2305h.f18879p.p(this, null, new C2299b(th))) {
            return false;
        }
        AbstractC2305h.c(this);
        return true;
    }

    public final boolean l(E3.a aVar) {
        C2299b c2299b;
        aVar.getClass();
        Object obj = this.f18881k;
        if (obj == null) {
            if (aVar.isDone()) {
                if (AbstractC2305h.f18879p.p(this, null, AbstractC2305h.f(aVar))) {
                    AbstractC2305h.c(this);
                    return true;
                }
                return false;
            }
            RunnableC2302e runnableC2302e = new RunnableC2302e(this, aVar);
            if (AbstractC2305h.f18879p.p(this, null, runnableC2302e)) {
                try {
                    aVar.a(runnableC2302e, EnumC2306i.f18884k);
                    return true;
                } catch (Throwable th) {
                    try {
                        c2299b = new C2299b(th);
                    } catch (Throwable unused) {
                        c2299b = C2299b.f18861b;
                    }
                    AbstractC2305h.f18879p.p(this, runnableC2302e, c2299b);
                    return true;
                }
            }
            obj = this.f18881k;
        }
        if (obj instanceof C2298a) {
            aVar.cancel(((C2298a) obj).f18859a);
        }
        return false;
    }
}
