package s4;

import G4.C0286t;
import android.support.v4.media.session.t;
import com.google.android.gms.common.internal.w;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import n4.C1468b;
import n4.C1473g;
import n4.M;
import q4.k;
import t4.InterfaceC1609a;
import t4.InterfaceC1610b;
import v4.l;
import v4.m;
import v4.r;
import w1.C1722m0;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final C1722m0 f16179b = new C1722m0(23);

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1610b f16180a;

    public j(InterfaceC1610b interfaceC1610b) {
        this.f16180a = interfaceC1610b;
    }

    public final w a(w wVar, C1473g c1473g, C1468b c1468b, w wVar2, r rVar, boolean z4, C0286t c0286t) {
        w wVar3;
        v4.c cVar;
        w wVar4 = wVar;
        C1468b c1468b2 = c1468b;
        boolean isEmpty = ((C1593a) wVar4.f11336c).f16147a.f17186a.isEmpty();
        C1593a c1593a = (C1593a) wVar4.f11336c;
        if (isEmpty && !c1593a.f16148b) {
            return wVar4;
        }
        k.b("Can't have a merge that is an overwrite", ((r) c1468b2.f15392a.f15855a) == null);
        if (!c1473g.isEmpty()) {
            c1468b2 = C1468b.f15391b.m(c1473g, c1468b2);
        }
        r rVar2 = c1593a.f16147a.f17186a;
        c1468b2.getClass();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : c1468b2.f15392a.f15856b) {
            hashMap.put((v4.c) entry.getKey(), new C1468b((q4.c) entry.getValue()));
        }
        loop1: while (true) {
            wVar3 = wVar4;
            for (Map.Entry entry2 : hashMap.entrySet()) {
                cVar = (v4.c) entry2.getKey();
                if (rVar2.i(cVar)) {
                    break;
                }
            }
            wVar4 = b(wVar3, new C1473g(cVar), ((C1468b) entry2.getValue()).t(rVar2.o(cVar)), wVar2, rVar, z4, c0286t);
        }
        w wVar5 = wVar3;
        for (Map.Entry entry3 : hashMap.entrySet()) {
            v4.c cVar2 = (v4.c) entry3.getKey();
            boolean z7 = !c1593a.a(cVar2) && ((r) ((C1468b) entry3.getValue()).f15392a.f15855a) == null;
            if (!rVar2.i(cVar2) && !z7) {
                wVar5 = b(wVar5, new C1473g(cVar2), ((C1468b) entry3.getValue()).t(rVar2.o(cVar2)), wVar2, rVar, z4, c0286t);
            }
        }
        return wVar5;
    }

    public final w b(w wVar, C1473g c1473g, r rVar, w wVar2, r rVar2, boolean z4, C0286t c0286t) {
        l D7;
        C1593a c1593a = (C1593a) wVar.f11336c;
        InterfaceC1610b interfaceC1610b = this.f16180a;
        if (!z4) {
            interfaceC1610b = interfaceC1610b.i();
        }
        boolean isEmpty = c1473g.isEmpty();
        l lVar = c1593a.f16147a;
        boolean z7 = true;
        if (isEmpty) {
            D7 = interfaceC1610b.C(lVar, new l(rVar, interfaceC1610b.N()), null);
        } else {
            if (!interfaceC1610b.l() || c1593a.f16149c) {
                v4.c B7 = c1473g.B();
                if (!c1593a.b(c1473g) && c1473g.size() > 1) {
                    return wVar;
                }
                C1473g E7 = c1473g.E();
                r q7 = lVar.f17186a.o(B7).q(E7, rVar);
                if (B7.equals(v4.c.f17171d)) {
                    D7 = interfaceC1610b.E(lVar, q7);
                } else {
                    D7 = interfaceC1610b.D(c1593a.f16147a, B7, q7, E7, f16179b, null);
                }
                if (!c1593a.f16148b && !c1473g.isEmpty()) {
                    z7 = false;
                }
                w wVar3 = new w(18, (C1593a) wVar.f11335b, new C1593a(D7, z7, interfaceC1610b.l()));
                return d(wVar3, c1473g, wVar2, new t(wVar2, wVar3, rVar2, 23), c0286t);
            }
            k.b("An empty path should have been caught in the other branch", !c1473g.isEmpty());
            v4.c B8 = c1473g.B();
            D7 = interfaceC1610b.C(lVar, lVar.t(B8, lVar.f17186a.o(B8).q(c1473g.E(), rVar)), null);
        }
        if (!c1593a.f16148b) {
            z7 = false;
        }
        w wVar32 = new w(18, (C1593a) wVar.f11335b, new C1593a(D7, z7, interfaceC1610b.l()));
        return d(wVar32, c1473g, wVar2, new t(wVar2, wVar32, rVar2, 23), c0286t);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w c(w wVar, C1473g c1473g, r rVar, w wVar2, r rVar2, C0286t c0286t) {
        r w7;
        r rVar3;
        r rVar4 = rVar;
        C1593a c1593a = (C1593a) wVar.f11335b;
        t tVar = new t(wVar2, wVar, rVar2, 23);
        boolean isEmpty = c1473g.isEmpty();
        InterfaceC1610b interfaceC1610b = this.f16180a;
        C1593a c1593a2 = (C1593a) wVar.f11335b;
        l lVar = c1593a2.f16147a;
        if (isEmpty) {
            return wVar.N(interfaceC1610b.C(lVar, new l(rVar4, interfaceC1610b.N()), c0286t), true, interfaceC1610b.l());
        }
        v4.c B7 = c1473g.B();
        v4.c cVar = v4.c.f17171d;
        boolean equals = B7.equals(cVar);
        boolean z4 = c1593a.f16148b;
        if (equals) {
            return wVar.N(interfaceC1610b.E(lVar, rVar4), z4, c1593a.f16149c);
        }
        C1473g E7 = c1473g.E();
        r o7 = c1593a.f16147a.f17186a.o(B7);
        if (!E7.isEmpty()) {
            if (c1593a2.a(B7)) {
                w7 = lVar.f17186a.o(B7);
            } else {
                w7 = wVar2.w(B7, rVar2 != null ? new C1593a(new l(rVar2, m.f17189a), true, false) : (C1593a) wVar.f11336c);
            }
            if (w7 == null) {
                rVar4 = v4.j.f17184e;
            } else {
                if (E7.A().equals(cVar) && w7.g(E7.C()).isEmpty()) {
                    rVar3 = w7;
                    return o7.equals(rVar3) ? wVar.N(interfaceC1610b.D(c1593a.f16147a, B7, rVar3, E7, tVar, c0286t), z4, interfaceC1610b.l()) : wVar;
                }
                rVar4 = w7.q(E7, rVar4);
            }
        }
        rVar3 = rVar4;
        if (o7.equals(rVar3)) {
        }
    }

    public final w d(w wVar, C1473g c1473g, w wVar2, InterfaceC1609a interfaceC1609a, C0286t c0286t) {
        r w7;
        l D7;
        r a2;
        C1593a c1593a = (C1593a) wVar.f11335b;
        if (wVar2.M(c1473g) != null) {
            return wVar;
        }
        boolean isEmpty = c1473g.isEmpty();
        InterfaceC1610b interfaceC1610b = this.f16180a;
        C1593a c1593a2 = (C1593a) wVar.f11336c;
        if (isEmpty) {
            k.b("If change path is empty, we must have complete server data", c1593a2.f16148b);
            if (c1593a2.f16149c) {
                r D8 = wVar.D();
                if (!(D8 instanceof v4.f)) {
                    D8 = v4.j.f17184e;
                }
                a2 = wVar2.x(D8);
            } else {
                a2 = ((M) wVar2.f11336c).a((C1473g) wVar2.f11335b, wVar.D(), Collections.emptyList(), false);
            }
            D7 = interfaceC1610b.C(c1593a.f16147a, new l(a2, interfaceC1610b.N()), c0286t);
        } else {
            v4.c B7 = c1473g.B();
            boolean equals = B7.equals(v4.c.f17171d);
            l lVar = c1593a.f16147a;
            l lVar2 = c1593a2.f16147a;
            if (equals) {
                k.b("Can't have a priority with additional path components", c1473g.size() == 1);
                r y4 = wVar2.y(c1473g, lVar.f17186a, lVar2.f17186a);
                if (y4 != null) {
                    D7 = interfaceC1610b.E(lVar, y4);
                }
                D7 = lVar;
            } else {
                C1473g E7 = c1473g.E();
                if (c1593a.a(B7)) {
                    r y5 = wVar2.y(c1473g, lVar.f17186a, lVar2.f17186a);
                    r rVar = lVar.f17186a;
                    w7 = y5 != null ? rVar.o(B7).q(E7, y5) : rVar.o(B7);
                } else {
                    w7 = wVar2.w(B7, c1593a2);
                }
                if (w7 != null) {
                    D7 = interfaceC1610b.D(c1593a.f16147a, B7, w7, E7, interfaceC1609a, c0286t);
                }
                D7 = lVar;
            }
        }
        return wVar.N(D7, c1593a.f16148b || c1473g.isEmpty(), interfaceC1610b.l());
    }
}
