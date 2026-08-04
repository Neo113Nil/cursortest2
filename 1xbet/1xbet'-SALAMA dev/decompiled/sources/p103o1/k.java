package p103o1;

import I3.b;

/* JADX INFO: loaded from: classes.dex */
public final class k extends i {
    public final boolean i(Object obj) {
        if (obj == null) {
            obj = i.f15572x;
        }
        if (!i.f15571f.g(this, null, obj)) {
            return false;
        }
        i.b(this);
        return true;
    }

    public final boolean j(Throwable th) {
        if (!i.f15571f.g(this, null, new c(th))) {
            return false;
        }
        i.b(this);
        return true;
    }

    public final boolean k(b bVar) {
        c cVar;
        bVar.getClass();
        Object obj = this.f15573a;
        if (obj == null) {
            if (bVar.isDone()) {
                if (!i.f15571f.g(this, null, i.e(bVar))) {
                    return false;
                }
                i.b(this);
            } else {
                f fVar = new f(this, bVar);
                if (i.f15571f.g(this, null, fVar)) {
                    try {
                        bVar.addListener(fVar, j.f15576a);
                    } catch (Throwable th) {
                        try {
                            cVar = new c(th);
                        } catch (Throwable unused) {
                            cVar = c.f15554b;
                        }
                        i.f15571f.g(this, fVar, cVar);
                    }
                } else {
                    obj = this.f15573a;
                }
            }
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        bVar.cancel(((a) obj).f15551a);
        return false;
    }
}
