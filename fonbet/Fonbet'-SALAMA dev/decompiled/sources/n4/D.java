package n4;

import g0.AbstractC1125g;
import i4.C1266c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4.InterfaceC1538a;
import q4.InterfaceC1556a;

/* loaded from: classes2.dex */
public final class D {

    /* renamed from: b, reason: collision with root package name */
    public final M f15360b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f15361c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f15362d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f15363e;

    /* renamed from: f, reason: collision with root package name */
    public final C f15364f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1538a f15365g;

    /* renamed from: h, reason: collision with root package name */
    public final android.support.v4.media.session.t f15366h;

    /* renamed from: i, reason: collision with root package name */
    public long f15367i = 1;

    /* renamed from: a, reason: collision with root package name */
    public q4.c f15359a = q4.c.f15854d;

    public D(C1471e c1471e, InterfaceC1538a interfaceC1538a, C c3) {
        M m7 = new M();
        m7.f15383a = C1468b.f15391b;
        m7.f15384b = new ArrayList();
        m7.f15385c = -1L;
        this.f15360b = m7;
        this.f15361c = new HashMap();
        this.f15362d = new HashMap();
        this.f15363e = new HashSet();
        this.f15364f = c3;
        this.f15365g = interfaceC1538a;
        this.f15366h = c1471e.c("SyncTree");
    }

    public static ArrayList a(D d7, AbstractC1125g abstractC1125g) {
        q4.c cVar = d7.f15359a;
        C1473g c1473g = C1473g.f15415d;
        M m7 = d7.f15360b;
        m7.getClass();
        return d7.f(abstractC1125g, cVar, null, new com.google.android.gms.common.internal.w(13, c1473g, m7));
    }

    public static ArrayList b(D d7, s4.h hVar, AbstractC1125g abstractC1125g) {
        d7.getClass();
        q4.c cVar = d7.f15359a;
        C1473g c1473g = hVar.f16172a;
        s sVar = (s) cVar.y(c1473g);
        q4.k.b("Missing sync point for query tag that we're tracking", sVar != null);
        M m7 = d7.f15360b;
        m7.getClass();
        return sVar.a(abstractC1125g, new com.google.android.gms.common.internal.w(13, c1473g, m7), null);
    }

    public static void j(q4.c cVar, ArrayList arrayList) {
        s sVar = (s) cVar.f15855a;
        if (sVar != null && sVar.g()) {
            arrayList.add(sVar.d());
            return;
        }
        if (sVar != null) {
            arrayList.addAll(sVar.e());
        }
        Iterator it = cVar.f15856b.iterator();
        while (it.hasNext()) {
            j((q4.c) ((Map.Entry) it.next()).getValue(), arrayList);
        }
    }

    public static s4.h k(s4.h hVar) {
        return (!hVar.f16173b.h() || hVar.c()) ? hVar : s4.h.a(hVar.f16172a);
    }

    public final List c(long j, boolean z4, boolean z7, InterfaceC1556a interfaceC1556a) {
        return (List) this.f15365g.j(new z(this, z7, j, z4, interfaceC1556a));
    }

    public final List d(AbstractC1472f abstractC1472f, boolean z4) {
        return (List) this.f15365g.j(new u(this, abstractC1472f, z4));
    }

    public final ArrayList e(AbstractC1125g abstractC1125g, q4.c cVar, v4.r rVar, com.google.android.gms.common.internal.w wVar) {
        s sVar = (s) cVar.f15855a;
        if (rVar == null && sVar != null) {
            rVar = sVar.c(C1473g.f15415d);
        }
        ArrayList arrayList = new ArrayList();
        cVar.f15856b.B(new w(this, rVar, wVar, abstractC1125g, arrayList));
        if (sVar != null) {
            arrayList.addAll(sVar.a(abstractC1125g, wVar, rVar));
        }
        return arrayList;
    }

    public final ArrayList f(AbstractC1125g abstractC1125g, q4.c cVar, v4.r rVar, com.google.android.gms.common.internal.w wVar) {
        C1473g c1473g = (C1473g) abstractC1125g.f13021c;
        if (c1473g.isEmpty()) {
            return e(abstractC1125g, cVar, rVar, wVar);
        }
        s sVar = (s) cVar.f15855a;
        if (rVar == null && sVar != null) {
            rVar = sVar.c(C1473g.f15415d);
        }
        ArrayList arrayList = new ArrayList();
        v4.c B7 = c1473g.B();
        AbstractC1125g a2 = abstractC1125g.a(B7);
        q4.c cVar2 = (q4.c) cVar.f15856b.m(B7);
        if (cVar2 != null && a2 != null) {
            arrayList.addAll(f(a2, cVar2, rVar != null ? rVar.o(B7) : null, new com.google.android.gms.common.internal.w(13, ((C1473g) wVar.f11335b).t(B7), (M) wVar.f11336c)));
        }
        if (sVar != null) {
            arrayList.addAll(sVar.a(abstractC1125g, wVar, rVar));
        }
        return arrayList;
    }

    public final List g(C1473g c1473g, v4.r rVar) {
        return (List) this.f15365g.j(new CallableC1465A(this, c1473g, rVar));
    }

    public final List h(C1473g c1473g, v4.r rVar, v4.r rVar2, long j, boolean z4, boolean z7) {
        q4.k.b("We shouldn't be persisting non-visible writes.", z4 || !z7);
        return (List) this.f15365g.j(new x(this, z7, c1473g, rVar, j, rVar2, z4));
    }

    public final v4.r i(C1473g c1473g, ArrayList arrayList) {
        q4.c cVar = this.f15359a;
        C1473g c1473g2 = C1473g.f15415d;
        v4.r rVar = null;
        C1473g c1473g3 = c1473g;
        do {
            v4.c B7 = c1473g3.B();
            c1473g3 = c1473g3.E();
            c1473g2 = c1473g2.t(B7);
            C1473g D7 = C1473g.D(c1473g2, c1473g);
            cVar = B7 != null ? cVar.z(B7) : q4.c.f15854d;
            s sVar = (s) cVar.f15855a;
            if (sVar != null) {
                rVar = sVar.c(D7);
            }
            if (c1473g3.isEmpty()) {
                break;
            }
        } while (rVar == null);
        return this.f15360b.a(c1473g, rVar, arrayList, true);
    }

    public final List l(s4.h hVar, AbstractC1472f abstractC1472f, C1266c c1266c, boolean z4) {
        return (List) this.f15365g.j(new v(this, hVar, abstractC1472f, c1266c, z4));
    }

    public final E m(s4.h hVar) {
        return (E) this.f15362d.get(hVar);
    }
}
