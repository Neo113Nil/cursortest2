package p098n4;

import com.google.android.gms.common.internal.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import p120q4.c;
import p120q4.k;
import p134s4.a;
import p134s4.g;
import p134s4.h;
import p134s4.i;
import v4.j;
import v4.l;
import v4.p;
import v4.r;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0933f f15487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D f15489c;

    public u(D d7, AbstractC0933f abstractC0933f, boolean z4) {
        this.f15489c = d7;
        this.f15487a = abstractC0933f;
        this.f15488b = z4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        a aVarU;
        r rVarC;
        AbstractC0933f abstractC0933f = this.f15487a;
        h hVarE = abstractC0933f.e();
        C0934g c0934g = hVarE.f16178a;
        D d7 = this.f15489c;
        c cVarZ = d7.f15365a;
        C0934g c0934gE = c0934g;
        boolean z4 = false;
        r rVarC2 = null;
        while (!cVarZ.isEmpty()) {
            s sVar = (s) cVarZ.f15861a;
            if (sVar != null) {
                if (rVarC2 == null) {
                    rVarC2 = sVar.c(c0934gE);
                }
                z4 = z4 || sVar.g();
            }
            cVarZ = cVarZ.z(c0934gE.isEmpty() ? v4.c.b("") : c0934gE.B());
            c0934gE = c0934gE.E();
        }
        s sVar2 = (s) d7.f15365a.y(c0934g);
        p114p4.a aVar = d7.f15371g;
        if (sVar2 == null) {
            sVar2 = new s(aVar);
            d7.f15365a = d7.f15365a.D(c0934g, sVar2);
        } else {
            z4 = z4 || sVar2.g();
            if (rVarC2 == null) {
                rVarC2 = sVar2.c(C0934g.f15421d);
            }
        }
        aVar.n(hVarE);
        g gVar = hVarE.f16179b;
        if (rVarC2 != null) {
            aVarU = new a(new l(rVarC2, gVar.f16176g), true, false);
        } else {
            aVarU = aVar.u(hVarE);
            if (!aVarU.f16154b) {
                r rVarS = j.f17190e;
                for (Map.Entry entry : d7.f15365a.F(c0934g).f15862b) {
                    s sVar3 = (s) ((c) entry.getValue()).f15861a;
                    if (sVar3 != null && (rVarC = sVar3.c(C0934g.f15421d)) != null) {
                        rVarS = rVarS.s((v4.c) entry.getKey(), rVarC);
                    }
                }
                for (p pVar : aVarU.f16153a.f17192a) {
                    if (!rVarS.i(pVar.f17201a)) {
                        rVarS = rVarS.s(pVar.f17201a, pVar.f17202b);
                    }
                }
                aVarU = new a(new l(rVarS, gVar.f16176g), false, false);
            }
        }
        boolean z7 = sVar2.h(hVarE) != null;
        if (!z7 && !gVar.h()) {
            HashMap map = d7.f15368d;
            k.b("View does not exist but we have a tag", !map.containsKey(hVarE));
            long j = d7.f15373i;
            d7.f15373i = j + 1;
            E e7 = new E(j);
            map.put(hVarE, e7);
            d7.f15367c.put(e7, hVarE);
        }
        M m7 = d7.f15366b;
        m7.getClass();
        w wVar = new w(13, c0934g, m7);
        h hVarE2 = abstractC0933f.e();
        i iVarF = sVar2.f(hVarE2, wVar, aVarU);
        g gVar2 = hVarE2.f16179b;
        if (!gVar2.h()) {
            HashSet hashSet = new HashSet();
            Iterator it = ((a) iVarF.f16182c.f11335b).f16153a.f17192a.iterator();
            while (it.hasNext()) {
                hashSet.add(((p) it.next()).f17201a);
            }
            sVar2.f15481b.h(hVarE2, hashSet);
        }
        HashMap map2 = sVar2.f15480a;
        if (!map2.containsKey(gVar2)) {
            map2.put(gVar2, iVarF);
        }
        map2.put(gVar2, iVarF);
        iVarF.f16183d.add(abstractC0933f);
        a aVar2 = (a) iVarF.f16182c.f11335b;
        ArrayList arrayList = new ArrayList();
        for (p pVar2 : aVar2.f16153a.f17192a) {
            arrayList.add(new p134s4.c(2, l.m(pVar2.f17202b), pVar2.f17201a, null, null));
        }
        boolean z8 = aVar2.f16154b;
        l lVar = aVar2.f16153a;
        if (z8) {
            arrayList.add(new p134s4.c(5, lVar, null, null, null));
        }
        ArrayList arrayListA = iVarF.a(arrayList, lVar, abstractC0933f);
        if (!z7 && !z4 && !this.f15488b) {
            i iVarH = sVar2.h(hVarE);
            E eM = d7.m(hVarE);
            M m8 = new M(d7, iVarH);
            d7.f15370f.f(D.k(hVarE), eM, m8, m8);
            c cVarF = d7.f15365a.F(hVarE.f16178a);
            if (eM != null) {
                k.b("If we're adding a query, it shouldn't be shadowed", !((s) cVarF.f15861a).g());
            } else {
                p145u1.c cVar = new p145u1.c(d7, 23);
                cVarF.getClass();
                cVarF.t(C0934g.f15421d, cVar, null);
            }
        }
        return arrayListA;
    }
}
