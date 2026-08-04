package E3;

import java.util.Iterator;
import java.util.Map;
import p098n4.C0934g;
import p098n4.C0940m;

/* JADX INFO: loaded from: classes2.dex */
public final class F implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1994b;

    public /* synthetic */ F(Object obj, int i7) {
        this.f1993a = i7;
        this.f1994b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1993a) {
            case 0:
                return ((Iterator) this.f1994b).hasNext();
            case 1:
                return ((Iterator) this.f1994b).hasNext();
            case 2:
                return ((Iterator) this.f1994b).hasNext();
            default:
                return ((p063i4.a) this.f1994b).f13989a.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1993a) {
            case 0:
                return ((Map.Entry) ((Iterator) this.f1994b).next()).getValue();
            case 1:
                return ((Map.Entry) ((Iterator) this.f1994b).next()).getKey();
            case 2:
                Map.Entry entry = (Map.Entry) ((Iterator) this.f1994b).next();
                return new v4.p((v4.c) entry.getKey(), (v4.r) entry.getValue());
            default:
                p063i4.a aVar = (p063i4.a) this.f1994b;
                v4.p pVar = (v4.p) aVar.f13989a.next();
                p063i4.f fVar = aVar.f13990b.f13992b;
                String str = pVar.f17201a.f17179a;
                if (str == null) {
                    fVar.getClass();
                    throw new NullPointerException("Can't pass null for argument 'pathString' in child()");
                }
                C0934g c0934g = (C0934g) fVar.f1725d;
                if (c0934g.isEmpty()) {
                    p120q4.l.d(str);
                } else {
                    p120q4.l.c(str);
                }
                return new p063i4.b(new p063i4.f((C0940m) fVar.f1723b, c0934g.m(new C0934g(str))), v4.l.m(pVar.f17202b));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1993a) {
            case 0:
                ((Iterator) this.f1994b).remove();
                return;
            case 1:
                ((Iterator) this.f1994b).remove();
                return;
            case 2:
                ((Iterator) this.f1994b).remove();
                return;
            default:
                throw new UnsupportedOperationException("remove called on immutable collection");
        }
    }

    public F(Iterator it) {
        this.f1993a = 0;
        it.getClass();
        this.f1994b = it;
    }
}
