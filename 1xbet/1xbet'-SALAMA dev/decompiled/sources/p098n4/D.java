package p098n4;

import android.support.v4.media.session.t;
import com.google.android.gms.common.internal.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p046g0.g;
import p114p4.a;
import p120q4.c;
import p120q4.k;
import p134s4.h;
import v4.r;

/* JADX INFO: loaded from: classes2.dex */
public final class D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f15366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f15367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f15368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f15369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C f15370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f15371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f15372h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f15373i = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f15365a = c.f15860d;

    public D(C0932e c0932e, a aVar, C c3) {
        M m7 = new M();
        m7.f15389a = C0929b.f15397b;
        m7.f15390b = new ArrayList();
        m7.f15391c = -1L;
        this.f15366b = m7;
        this.f15367c = new HashMap();
        this.f15368d = new HashMap();
        this.f15369e = new HashSet();
        this.f15370f = c3;
        this.f15371g = aVar;
        this.f15372h = c0932e.c("SyncTree");
    }

    public static ArrayList a(D d7, g gVar) {
        c cVar = d7.f15365a;
        C0934g c0934g = C0934g.f15421d;
        M m7 = d7.f15366b;
        m7.getClass();
        return d7.f(gVar, cVar, null, new w(13, c0934g, m7));
    }

    public static ArrayList b(D d7, h hVar, g gVar) {
        d7.getClass();
        c cVar = d7.f15365a;
        C0934g c0934g = hVar.f16178a;
        s sVar = (s) cVar.y(c0934g);
        k.b("Missing sync point for query tag that we're tracking", sVar != null);
        M m7 = d7.f15366b;
        m7.getClass();
        return sVar.a(gVar, new w(13, c0934g, m7), null);
    }

    public static void j(c cVar, ArrayList arrayList) {
        s sVar = (s) cVar.f15861a;
        if (sVar != null && sVar.g()) {
            arrayList.add(sVar.d());
            return;
        }
        if (sVar != null) {
            arrayList.addAll(sVar.e());
        }
        Iterator it = cVar.f15862b.iterator();
        while (it.hasNext()) {
            j((c) ((Map.Entry) it.next()).getValue(), arrayList);
        }
    }

    public static h k(h hVar) {
        return (!hVar.f16179b.h() || hVar.c()) ? hVar : h.a(hVar.f16178a);
    }

    public final List c(long j, boolean z4, boolean z7, p120q4.a aVar) {
        return (List) this.f15371g.j(new z(this, z7, j, z4, aVar));
    }

    public final List d(AbstractC0933f abstractC0933f, boolean z4) {
        return (List) this.f15371g.j(new u(this, abstractC0933f, z4));
    }

    public final ArrayList e(g gVar, c cVar, r rVar, w wVar) {
        s sVar = (s) cVar.f15861a;
        if (rVar == null && sVar != null) {
            rVar = sVar.c(C0934g.f15421d);
        }
        ArrayList arrayList = new ArrayList();
        cVar.f15862b.B(new w(this, rVar, wVar, gVar, arrayList));
        if (sVar != null) {
            arrayList.addAll(sVar.a(gVar, wVar, rVar));
        }
        return arrayList;
    }

    public final ArrayList f(g gVar, c cVar, r rVar, w wVar) {
        C0934g c0934g = (C0934g) gVar.f13027c;
        if (c0934g.isEmpty()) {
            return e(gVar, cVar, rVar, wVar);
        }
        s sVar = (s) cVar.f15861a;
        if (rVar == null && sVar != null) {
            rVar = sVar.c(C0934g.f15421d);
        }
        ArrayList arrayList = new ArrayList();
        v4.c cVarB = c0934g.B();
        g gVarA = gVar.a(cVarB);
        c cVar2 = (c) cVar.f15862b.m(cVarB);
        if (cVar2 != null && gVarA != null) {
            arrayList.addAll(f(gVarA, cVar2, rVar != null ? rVar.o(cVarB) : null, new w(13, ((C0934g) wVar.f11335b).t(cVarB), (M) wVar.f11336c)));
        }
        if (sVar != null) {
            arrayList.addAll(sVar.a(gVar, wVar, rVar));
        }
        return arrayList;
    }

    public final List g(C0934g c0934g, r rVar) {
        return (List) this.f15371g.j(new A(this, c0934g, rVar));
    }

    public final List h(C0934g c0934g, r rVar, r rVar2, long j, boolean z4, boolean z7) {
        k.b("We shouldn't be persisting non-visible writes.", z4 || !z7);
        return (List) this.f15371g.j(new x(this, z7, c0934g, rVar, j, rVar2, z4));
    }

    public final r i(C0934g c0934g, ArrayList arrayList) {
        c cVarZ = this.f15365a;
        C0934g c0934gT = C0934g.f15421d;
        r rVarC = null;
        C0934g c0934gE = c0934g;
        do {
            v4.c cVarB = c0934gE.B();
            c0934gE = c0934gE.E();
            c0934gT = c0934gT.t(cVarB);
            C0934g c0934gD = C0934g.D(c0934gT, c0934g);
            cVarZ = cVarB != null ? cVarZ.z(cVarB) : c.f15860d;
            s sVar = (s) cVarZ.f15861a;
            if (sVar != null) {
                rVarC = sVar.c(c0934gD);
            }
            if (c0934gE.isEmpty()) {
                break;
            }
        } while (rVarC == null);
        return this.f15366b.a(c0934g, rVarC, arrayList, true);
    }

    public final List l(h hVar, AbstractC0933f abstractC0933f, p063i4.c cVar, boolean z4) {
        return (List) this.f15371g.j(new v(this, hVar, abstractC0933f, cVar, z4));
    }

    public final E m(h hVar) {
        return (E) this.f15368d.get(hVar);
    }
}
