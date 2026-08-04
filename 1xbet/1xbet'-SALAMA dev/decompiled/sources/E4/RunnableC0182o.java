package E4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: E4.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0182o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f2213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D f2214c;

    public /* synthetic */ RunnableC0182o(t tVar, D d7, int i7) {
        this.f2212a = i7;
        this.f2213b = tVar;
        this.f2214c = d7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i8;
        boolean z4;
        switch (this.f2212a) {
            case 0:
                p151v2.n nVar = this.f2213b.j;
                nVar.getClass();
                D d7 = this.f2214c;
                C c3 = d7.f2100a;
                HashMap map = (HashMap) nVar.f17144c;
                C0175h c0175h = (C0175h) map.get(c3);
                if (c0175h != null) {
                    ArrayList arrayList = c0175h.f2185a;
                    arrayList.remove(d7);
                    if (arrayList.isEmpty()) {
                        i7 = d7.a() ? 1 : 2;
                    } else {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((D) it.next()).a()) {
                                }
                            } else if (d7.a()) {
                                i7 = 3;
                            }
                            i7 = 4;
                        }
                    }
                    int iE = p136t.e.e(i7);
                    H h6 = (H) nVar.f17143b;
                    if (iE == 0) {
                        map.remove(c3);
                        h6.k(c3, true);
                        break;
                    } else if (iE == 1) {
                        map.remove(c3);
                        h6.k(c3, false);
                        break;
                    } else if (iE == 2) {
                        h6.a("stopListeningToRemoteStore");
                        E e7 = (E) h6.f2113c.get(c3);
                        p113p3.f.O("Trying to stop listening to a query not found", e7 != null, new Object[0]);
                        int i9 = e7.f2107b;
                        List list = (List) h6.f2114d.get(Integer.valueOf(i9));
                        list.remove(c3);
                        if (list.isEmpty()) {
                            h6.f2112b.q(i9);
                        }
                        break;
                    }
                }
                break;
            default:
                p151v2.n nVar2 = this.f2213b.j;
                nVar2.getClass();
                D d8 = this.f2214c;
                C c4 = d8.f2100a;
                HashMap map2 = (HashMap) nVar2.f17144c;
                C0175h c0175h2 = (C0175h) map2.get(c4);
                if (c0175h2 == null) {
                    c0175h2 = new C0175h();
                    map2.put(c4, c0175h2);
                    i8 = d8.a() ? 1 : 2;
                } else {
                    Iterator it2 = c0175h2.f2185a.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((D) it2.next()).a()) {
                            }
                        } else if (d8.a()) {
                            i8 = 3;
                        }
                        i8 = 4;
                    }
                }
                c0175h2.f2185a.add(d8);
                int i10 = nVar2.f17142a;
                d8.f2104e = i10;
                O o7 = d8.f2105f;
                if (o7 == null || d8.f2103d || !d8.d(o7, i10)) {
                    z4 = false;
                } else {
                    d8.c(d8.f2105f);
                    z4 = true;
                }
                p113p3.f.O("onOnlineStateChanged() shouldn't raise an event for brand-new listeners.", !z4, new Object[0]);
                O o8 = c0175h2.f2186b;
                if (o8 != null && d8.b(o8)) {
                    nVar2.h();
                }
                int iE2 = p136t.e.e(i8);
                H h7 = (H) nVar2.f17143b;
                if (iE2 == 0) {
                    h7.d(c4, true);
                    break;
                } else if (iE2 == 1) {
                    h7.d(c4, false);
                    break;
                } else if (iE2 == 2) {
                    h7.a("listenToRemoteStore");
                    p113p3.f.O("This is the first listen to query: %s", h7.f2113c.containsKey(c4), c4);
                    h7.f2112b.g(h7.f2111a.a(c4.i()));
                    break;
                }
                break;
        }
    }
}
