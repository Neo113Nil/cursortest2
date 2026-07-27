package D0;

/* loaded from: classes.dex */
public final class k extends i {
    public final boolean k(Object obj) {
        if (obj == null) {
            obj = i.f427g;
        }
        if (!i.f426f.G(this, null, obj)) {
            return false;
        }
        i.d(this);
        return true;
    }

    public final boolean l(Throwable th) {
        if (!i.f426f.G(this, null, new c(th))) {
            return false;
        }
        i.d(this);
        return true;
    }

    public final boolean m(J1.a aVar) {
        c cVar;
        aVar.getClass();
        Object obj = this.f428a;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!i.f426f.G(this, null, i.g(aVar))) {
                    return false;
                }
                i.d(this);
            } else {
                f fVar = new f(this, aVar);
                if (i.f426f.G(this, null, fVar)) {
                    try {
                        aVar.a(fVar, j.f431a);
                    } catch (Throwable th) {
                        try {
                            cVar = new c(th);
                        } catch (Throwable unused) {
                            cVar = c.f408b;
                        }
                        i.f426f.G(this, fVar, cVar);
                    }
                } else {
                    obj = this.f428a;
                }
            }
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        aVar.cancel(((a) obj).f405a);
        return false;
    }
}
