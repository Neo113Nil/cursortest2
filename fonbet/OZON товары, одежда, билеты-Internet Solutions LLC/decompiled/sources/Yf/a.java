package Yf;

import Yf.d;
import Yf.g;
import Yf.k;
import Yf.l;
import Yf.n;
import Yf.o;
import android.content.Context;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f34910a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f34911b;

    /* renamed from: c, reason: collision with root package name */
    private final n f34912c;

    /* renamed from: d, reason: collision with root package name */
    private final o f34913d;

    /* renamed from: e, reason: collision with root package name */
    private final k f34914e;

    /* renamed from: f, reason: collision with root package name */
    private final l f34915f;

    /* renamed from: g, reason: collision with root package name */
    private final g f34916g;

    /* renamed from: h, reason: collision with root package name */
    private final d f34917h;

    public a(Context context, boolean z11) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f34910a = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f34911b = arrayList3;
        arrayList2.addAll(arrayList);
        k kVar = new k(context, this);
        this.f34914e = kVar;
        o oVar = new o(context, this);
        this.f34913d = oVar;
        l lVar = new l(context, this);
        this.f34915f = lVar;
        m mVar = new m(context, this);
        g gVar = new g(context, this);
        this.f34916g = gVar;
        d dVar = new d(context, this);
        this.f34917h = dVar;
        n nVar = new n(context, this);
        this.f34912c = nVar;
        arrayList3.add(kVar);
        arrayList3.add(oVar);
        arrayList3.add(lVar);
        arrayList3.add(mVar);
        arrayList3.add(gVar);
        arrayList3.add(dVar);
        arrayList3.add(nVar);
        if (z11) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (bVar instanceof f) {
                    ((f) bVar).o();
                }
                if (bVar instanceof o) {
                    ((o) bVar).C();
                }
                if (bVar instanceof l) {
                    l lVar2 = (l) bVar;
                    lVar2.w();
                    lVar2.v();
                }
                if (bVar instanceof m) {
                    m mVar2 = (m) bVar;
                    mVar2.w();
                    mVar2.v();
                }
                if (bVar instanceof g) {
                    g gVar2 = (g) bVar;
                    gVar2.p();
                    gVar2.q();
                }
                if (bVar instanceof k) {
                    ((k) bVar).x(15.3f);
                }
            }
        }
    }

    public final ArrayList a() {
        return this.f34911b;
    }

    public final d b() {
        return this.f34917h;
    }

    public final ArrayList c() {
        return this.f34910a;
    }

    public final k d() {
        return this.f34914e;
    }

    public final l e() {
        return this.f34915f;
    }

    public final o f() {
        return this.f34913d;
    }

    public final boolean g(MotionEvent motionEvent) {
        Iterator it = this.f34911b.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (((b) it.next()).f(motionEvent)) {
                z11 = true;
            }
        }
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(d.a aVar) {
        this.f34917h.f34925h = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(g.a aVar) {
        this.f34916g.f34925h = aVar;
    }

    @SafeVarargs
    public final void j(Set<Integer>... setArr) {
        List asList = Arrays.asList(setArr);
        ArrayList arrayList = this.f34910a;
        arrayList.clear();
        arrayList.addAll(asList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(k.a aVar) {
        this.f34914e.f34925h = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(l.a aVar) {
        this.f34915f.f34925h = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(n.c cVar) {
        this.f34912c.f34925h = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(o.c cVar) {
        this.f34913d.f34925h = cVar;
    }
}
