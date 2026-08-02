package n4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import o4.C1509a;
import p4.InterfaceC1538a;
import q4.InterfaceC1556a;

/* loaded from: classes2.dex */
public final class z implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f15507a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f15508b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f15509c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1556a f15510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D f15511e;

    public z(D d7, boolean z4, long j, boolean z7, InterfaceC1556a interfaceC1556a) {
        this.f15511e = d7;
        this.f15507a = z4;
        this.f15508b = j;
        this.f15509c = z7;
        this.f15510d = interfaceC1556a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        H h6;
        H h7;
        C1473g c1473g;
        boolean z4;
        boolean z7 = this.f15507a;
        long j = this.f15508b;
        D d7 = this.f15511e;
        if (z7) {
            d7.f15365g.d(j);
        }
        Iterator it = ((ArrayList) d7.f15360b.f15384b).iterator();
        while (true) {
            h6 = null;
            if (!it.hasNext()) {
                h7 = null;
                break;
            }
            h7 = (H) it.next();
            if (h7.f15369a == j) {
                break;
            }
        }
        M m7 = d7.f15360b;
        Iterator it2 = ((ArrayList) m7.f15384b).iterator();
        boolean z8 = false;
        int i7 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            H h8 = (H) it2.next();
            if (h8.f15369a == j) {
                h6 = h8;
                break;
            }
            i7++;
        }
        q4.k.b("removeWrite called with nonexistent writeId", h6 != null);
        ((ArrayList) m7.f15384b).remove(h6);
        boolean z9 = h6.f15373e;
        int size = ((ArrayList) m7.f15384b).size() - 1;
        boolean z10 = false;
        while (true) {
            c1473g = h6.f15370b;
            if (!z9 || size < 0) {
                break;
            }
            H h9 = (H) ((ArrayList) m7.f15384b).get(size);
            if (h9.f15373e) {
                C1473g c1473g2 = h9.f15370b;
                if (size >= i7) {
                    if (!h9.c()) {
                        Iterator it3 = h9.a().f15392a.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                z4 = false;
                                break;
                            }
                            if (c1473g2.m((C1473g) ((Map.Entry) it3.next()).getKey()).z(c1473g)) {
                                z4 = true;
                                break;
                            }
                        }
                    } else {
                        z4 = c1473g2.z(c1473g);
                    }
                    if (z4) {
                        z9 = false;
                    }
                }
                if (c1473g.z(c1473g2)) {
                    z10 = true;
                }
            }
            size--;
        }
        if (z9) {
            if (z10) {
                m7.f15383a = M.c((ArrayList) m7.f15384b, M.f15382d, C1473g.f15415d);
                if (((ArrayList) m7.f15384b).size() > 0) {
                    ArrayList arrayList = (ArrayList) m7.f15384b;
                    m7.f15385c = Long.valueOf(((H) arrayList.get(arrayList.size() - 1)).f15369a);
                } else {
                    m7.f15385c = -1L;
                }
            } else if (h6.c()) {
                C1468b c1468b = (C1468b) m7.f15383a;
                c1468b.getClass();
                m7.f15383a = c1473g.isEmpty() ? C1468b.f15391b : new C1468b(c1468b.f15392a.E(c1473g, q4.c.f15854d));
            } else {
                Iterator it4 = h6.a().f15392a.iterator();
                while (it4.hasNext()) {
                    C1473g c1473g3 = (C1473g) ((Map.Entry) it4.next()).getKey();
                    C1468b c1468b2 = (C1468b) m7.f15383a;
                    C1473g m8 = c1473g.m(c1473g3);
                    c1468b2.getClass();
                    m7.f15383a = m8.isEmpty() ? C1468b.f15391b : new C1468b(c1468b2.f15392a.E(m8, q4.c.f15854d));
                }
            }
            z8 = true;
        }
        boolean z11 = h7.f15373e;
        boolean z12 = this.f15509c;
        C1473g c1473g4 = h7.f15370b;
        if (z11 && !z12) {
            HashMap p5 = Y4.D.p(this.f15510d);
            boolean c3 = h7.c();
            InterfaceC1538a interfaceC1538a = d7.f15365g;
            if (c3) {
                interfaceC1538a.e(c1473g4, Y4.D.Q(h7.b(), new K(d7, c1473g4), p5));
            } else {
                interfaceC1538a.y(c1473g4, Y4.D.P(h7.a(), d7, c1473g4, p5));
            }
        }
        if (!z8) {
            return Collections.emptyList();
        }
        q4.c cVar = q4.c.f15854d;
        if (h7.c()) {
            cVar = cVar.D(C1473g.f15415d, Boolean.TRUE);
        } else {
            Iterator it5 = h7.a().f15392a.iterator();
            while (it5.hasNext()) {
                cVar = cVar.D((C1473g) ((Map.Entry) it5.next()).getKey(), Boolean.TRUE);
            }
        }
        return D.a(d7, new C1509a(c1473g4, cVar, z12));
    }
}
