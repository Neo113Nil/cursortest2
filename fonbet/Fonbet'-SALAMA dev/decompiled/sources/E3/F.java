package E3;

import i4.C1264a;
import i4.C1265b;
import i4.C1269f;
import java.util.Iterator;
import java.util.Map;
import n4.C1473g;
import n4.C1479m;

/* loaded from: classes2.dex */
public final class F implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1993a;

    /* renamed from: b, reason: collision with root package name */
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
                return ((C1264a) this.f1994b).f13983a.hasNext();
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
                C1264a c1264a = (C1264a) this.f1994b;
                v4.p pVar = (v4.p) c1264a.f13983a.next();
                C1269f c1269f = c1264a.f13984b.f13986b;
                String str = pVar.f17195a.f17173a;
                if (str == null) {
                    c1269f.getClass();
                    throw new NullPointerException("Can't pass null for argument 'pathString' in child()");
                }
                C1473g c1473g = (C1473g) c1269f.f1725d;
                if (c1473g.isEmpty()) {
                    q4.l.d(str);
                } else {
                    q4.l.c(str);
                }
                return new C1265b(new C1269f((C1479m) c1269f.f1723b, c1473g.m(new C1473g(str))), v4.l.m(pVar.f17196b));
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
