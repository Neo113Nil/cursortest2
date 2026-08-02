package o1;

/* renamed from: o1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1501k extends AbstractC1499i {
    public final boolean i(Object obj) {
        if (obj == null) {
            obj = AbstractC1499i.f15566x;
        }
        if (!AbstractC1499i.f15565f.g(this, null, obj)) {
            return false;
        }
        AbstractC1499i.b(this);
        return true;
    }

    public final boolean j(Throwable th) {
        if (!AbstractC1499i.f15565f.g(this, null, new C1493c(th))) {
            return false;
        }
        AbstractC1499i.b(this);
        return true;
    }

    public final boolean k(I3.b bVar) {
        C1493c c1493c;
        bVar.getClass();
        Object obj = this.f15567a;
        if (obj == null) {
            if (bVar.isDone()) {
                if (!AbstractC1499i.f15565f.g(this, null, AbstractC1499i.e(bVar))) {
                    return false;
                }
                AbstractC1499i.b(this);
            } else {
                RunnableC1496f runnableC1496f = new RunnableC1496f(this, bVar);
                if (AbstractC1499i.f15565f.g(this, null, runnableC1496f)) {
                    try {
                        bVar.addListener(runnableC1496f, EnumC1500j.f15570a);
                    } catch (Throwable th) {
                        try {
                            c1493c = new C1493c(th);
                        } catch (Throwable unused) {
                            c1493c = C1493c.f15548b;
                        }
                        AbstractC1499i.f15565f.g(this, runnableC1496f, c1493c);
                    }
                } else {
                    obj = this.f15567a;
                }
            }
            return true;
        }
        if (!(obj instanceof C1491a)) {
            return false;
        }
        bVar.cancel(((C1491a) obj).f15545a);
        return false;
    }
}
