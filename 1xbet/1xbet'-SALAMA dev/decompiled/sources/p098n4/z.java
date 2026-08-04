package p098n4;

import Y4.D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import p120q4.a;
import p120q4.c;
import p120q4.k;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f15513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f15514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f15515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f15516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D f15517e;

    public z(D d7, boolean z4, long j, boolean z7, a aVar) {
        this.f15517e = d7;
        this.f15513a = z4;
        this.f15514b = j;
        this.f15515c = z7;
        this.f15516d = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:98:0x00c4 A[SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        H h6;
        H h7;
        C0934g c0934g;
        boolean z4;
        boolean z7 = this.f15513a;
        long j = this.f15514b;
        D d7 = this.f15517e;
        if (z7) {
            d7.f15371g.d(j);
        }
        Iterator it = ((ArrayList) d7.f15366b.f15390b).iterator();
        do {
            h6 = null;
            if (!it.hasNext()) {
                h7 = null;
                break;
            }
            h7 = (H) it.next();
        } while (h7.f15375a != j);
        M m7 = d7.f15366b;
        boolean z8 = false;
        int i7 = 0;
        for (H h8 : (ArrayList) m7.f15390b) {
            if (h8.f15375a == j) {
                h6 = h8;
                break;
            }
            i7++;
        }
        k.b("removeWrite called with nonexistent writeId", h6 != null);
        ((ArrayList) m7.f15390b).remove(h6);
        boolean z9 = h6.f15379e;
        int size = ((ArrayList) m7.f15390b).size() - 1;
        boolean z10 = false;
        while (true) {
            c0934g = h6.f15376b;
            if (!z9 || size < 0) {
                break;
            }
            H h9 = (H) ((ArrayList) m7.f15390b).get(size);
            if (h9.f15379e) {
                C0934g c0934g2 = h9.f15376b;
                if (size >= i7) {
                    if (!h9.c()) {
                        Iterator it2 = h9.a().f15398a.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z4 = false;
                                break;
                            }
                            if (c0934g2.m((C0934g) ((Map.Entry) it2.next()).getKey()).z(c0934g)) {
                                z4 = true;
                                break;
                            }
                        }
                    } else {
                        z4 = c0934g2.z(c0934g);
                    }
                    if (z4) {
                        z9 = false;
                    } else if (c0934g.z(c0934g2)) {
                        z10 = true;
                    }
                } else if (c0934g.z(c0934g2)) {
                    z10 = true;
                }
            }
            size--;
        }
        if (z9) {
            if (z10) {
                m7.f15389a = M.c((ArrayList) m7.f15390b, M.f15388d, C0934g.f15421d);
                if (((ArrayList) m7.f15390b).size() > 0) {
                    ArrayList arrayList = (ArrayList) m7.f15390b;
                    m7.f15391c = Long.valueOf(((H) arrayList.get(arrayList.size() - 1)).f15375a);
                } else {
                    m7.f15391c = -1L;
                }
            } else if (h6.c()) {
                C0929b c0929b = (C0929b) m7.f15389a;
                c0929b.getClass();
                m7.f15389a = c0934g.isEmpty() ? C0929b.f15397b : new C0929b(c0929b.f15398a.E(c0934g, c.f15860d));
            } else {
                Iterator it3 = h6.a().f15398a.iterator();
                while (it3.hasNext()) {
                    C0934g c0934g3 = (C0934g) ((Map.Entry) it3.next()).getKey();
                    C0929b c0929b2 = (C0929b) m7.f15389a;
                    C0934g c0934gM = c0934g.m(c0934g3);
                    c0929b2.getClass();
                    m7.f15389a = c0934gM.isEmpty() ? C0929b.f15397b : new C0929b(c0929b2.f15398a.E(c0934gM, c.f15860d));
                }
            }
            z8 = true;
        }
        boolean z11 = h7.f15379e;
        boolean z12 = this.f15515c;
        C0934g c0934g4 = h7.f15376b;
        if (z11 && !z12) {
            HashMap mapP = D.p(this.f15516d);
            boolean zC = h7.c();
            p114p4.a aVar = d7.f15371g;
            if (zC) {
                aVar.e(c0934g4, D.Q(h7.b(), new K(d7, c0934g4), mapP));
            } else {
                aVar.y(c0934g4, D.P(h7.a(), d7, c0934g4, mapP));
            }
        }
        if (!z8) {
            return Collections.emptyList();
        }
        c cVarD = c.f15860d;
        if (h7.c()) {
            cVarD = cVarD.D(C0934g.f15421d, Boolean.TRUE);
        } else {
            Iterator it4 = h7.a().f15398a.iterator();
            while (it4.hasNext()) {
                cVarD = cVarD.D((C0934g) ((Map.Entry) it4.next()).getKey(), Boolean.TRUE);
            }
        }
        return D.a(d7, new p106o4.a(c0934g4, cVarD, z12));
    }
}
