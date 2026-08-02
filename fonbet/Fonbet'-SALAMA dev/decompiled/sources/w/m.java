package w;

import e6.C1054c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import v.AbstractC1660k;
import v.C1654e;
import v.C1655f;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static int f17243f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f17244a;

    /* renamed from: b, reason: collision with root package name */
    public int f17245b;

    /* renamed from: c, reason: collision with root package name */
    public int f17246c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f17247d;

    /* renamed from: e, reason: collision with root package name */
    public int f17248e;

    public final void a(ArrayList arrayList) {
        int size = this.f17244a.size();
        if (this.f17248e != -1 && size > 0) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                m mVar = (m) arrayList.get(i7);
                if (this.f17248e == mVar.f17245b) {
                    c(this.f17246c, mVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(t.c cVar, int i7) {
        int n2;
        int n7;
        ArrayList arrayList = this.f17244a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C1655f c1655f = (C1655f) ((C1654e) arrayList.get(0)).f16938V;
        cVar.t();
        c1655f.b(cVar, false);
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            ((C1654e) arrayList.get(i8)).b(cVar, false);
        }
        if (i7 == 0 && c1655f.f16990D0 > 0) {
            AbstractC1660k.a(c1655f, cVar, arrayList, 0);
        }
        if (i7 == 1 && c1655f.f16991E0 > 0) {
            AbstractC1660k.a(c1655f, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        this.f17247d = new ArrayList();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            C1654e c1654e = (C1654e) arrayList.get(i9);
            C1054c c1054c = new C1054c(26);
            new WeakReference(c1654e);
            t.c.n(c1654e.f16926J);
            t.c.n(c1654e.f16927K);
            t.c.n(c1654e.f16928L);
            t.c.n(c1654e.f16929M);
            t.c.n(c1654e.f16930N);
            this.f17247d.add(c1054c);
        }
        if (i7 == 0) {
            n2 = t.c.n(c1655f.f16926J);
            n7 = t.c.n(c1655f.f16928L);
            cVar.t();
        } else {
            n2 = t.c.n(c1655f.f16927K);
            n7 = t.c.n(c1655f.f16929M);
            cVar.t();
        }
        return n7 - n2;
    }

    public final void c(int i7, m mVar) {
        Iterator it = this.f17244a.iterator();
        while (it.hasNext()) {
            C1654e c1654e = (C1654e) it.next();
            ArrayList arrayList = mVar.f17244a;
            if (!arrayList.contains(c1654e)) {
                arrayList.add(c1654e);
            }
            int i8 = mVar.f17245b;
            if (i7 == 0) {
                c1654e.f16978s0 = i8;
            } else {
                c1654e.f16980t0 = i8;
            }
        }
        this.f17248e = mVar.f17245b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i7 = this.f17246c;
        sb.append(i7 == 0 ? "Horizontal" : i7 == 1 ? "Vertical" : i7 == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String g3 = e1.k.g(sb, this.f17245b, "] <");
        Iterator it = this.f17244a.iterator();
        while (it.hasNext()) {
            C1654e c1654e = (C1654e) it.next();
            StringBuilder d7 = t.e.d(g3, " ");
            d7.append(c1654e.f16962k0);
            g3 = d7.toString();
        }
        return e1.k.e(g3, " >");
    }
}
