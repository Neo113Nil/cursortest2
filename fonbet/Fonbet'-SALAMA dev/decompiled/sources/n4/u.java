package n4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import p4.InterfaceC1538a;
import s4.C1593a;
import s4.C1595c;

/* loaded from: classes2.dex */
public final class u implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC1472f f15481a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15482b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D f15483c;

    public u(D d7, AbstractC1472f abstractC1472f, boolean z4) {
        this.f15483c = d7;
        this.f15481a = abstractC1472f;
        this.f15482b = z4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1593a u4;
        v4.r c3;
        AbstractC1472f abstractC1472f = this.f15481a;
        s4.h e7 = abstractC1472f.e();
        C1473g c1473g = e7.f16172a;
        D d7 = this.f15483c;
        q4.c cVar = d7.f15359a;
        C1473g c1473g2 = c1473g;
        boolean z4 = false;
        v4.r rVar = null;
        while (!cVar.isEmpty()) {
            s sVar = (s) cVar.f15855a;
            if (sVar != null) {
                if (rVar == null) {
                    rVar = sVar.c(c1473g2);
                }
                z4 = z4 || sVar.g();
            }
            cVar = cVar.z(c1473g2.isEmpty() ? v4.c.b("") : c1473g2.B());
            c1473g2 = c1473g2.E();
        }
        s sVar2 = (s) d7.f15359a.y(c1473g);
        InterfaceC1538a interfaceC1538a = d7.f15365g;
        if (sVar2 == null) {
            sVar2 = new s(interfaceC1538a);
            d7.f15359a = d7.f15359a.D(c1473g, sVar2);
        } else {
            z4 = z4 || sVar2.g();
            if (rVar == null) {
                rVar = sVar2.c(C1473g.f15415d);
            }
        }
        interfaceC1538a.n(e7);
        s4.g gVar = e7.f16173b;
        if (rVar != null) {
            u4 = new C1593a(new v4.l(rVar, gVar.f16170g), true, false);
        } else {
            u4 = interfaceC1538a.u(e7);
            if (!u4.f16148b) {
                v4.r rVar2 = v4.j.f17184e;
                for (Map.Entry entry : d7.f15359a.F(c1473g).f15856b) {
                    s sVar3 = (s) ((q4.c) entry.getValue()).f15855a;
                    if (sVar3 != null && (c3 = sVar3.c(C1473g.f15415d)) != null) {
                        rVar2 = rVar2.s((v4.c) entry.getKey(), c3);
                    }
                }
                for (v4.p pVar : u4.f16147a.f17186a) {
                    if (!rVar2.i(pVar.f17195a)) {
                        rVar2 = rVar2.s(pVar.f17195a, pVar.f17196b);
                    }
                }
                u4 = new C1593a(new v4.l(rVar2, gVar.f16170g), false, false);
            }
        }
        boolean z7 = sVar2.h(e7) != null;
        if (!z7 && !gVar.h()) {
            HashMap hashMap = d7.f15362d;
            q4.k.b("View does not exist but we have a tag", !hashMap.containsKey(e7));
            long j = d7.f15367i;
            d7.f15367i = j + 1;
            E e8 = new E(j);
            hashMap.put(e7, e8);
            d7.f15361c.put(e8, e7);
        }
        M m7 = d7.f15360b;
        m7.getClass();
        com.google.android.gms.common.internal.w wVar = new com.google.android.gms.common.internal.w(13, c1473g, m7);
        s4.h e9 = abstractC1472f.e();
        s4.i f7 = sVar2.f(e9, wVar, u4);
        s4.g gVar2 = e9.f16173b;
        if (!gVar2.h()) {
            HashSet hashSet = new HashSet();
            Iterator it = ((C1593a) f7.f16176c.f11335b).f16147a.f17186a.iterator();
            while (it.hasNext()) {
                hashSet.add(((v4.p) it.next()).f17195a);
            }
            sVar2.f15475b.h(e9, hashSet);
        }
        HashMap hashMap2 = sVar2.f15474a;
        if (!hashMap2.containsKey(gVar2)) {
            hashMap2.put(gVar2, f7);
        }
        hashMap2.put(gVar2, f7);
        f7.f16177d.add(abstractC1472f);
        C1593a c1593a = (C1593a) f7.f16176c.f11335b;
        ArrayList arrayList = new ArrayList();
        for (v4.p pVar2 : c1593a.f16147a.f17186a) {
            arrayList.add(new C1595c(2, v4.l.m(pVar2.f17196b), pVar2.f17195a, null, null));
        }
        boolean z8 = c1593a.f16148b;
        v4.l lVar = c1593a.f16147a;
        if (z8) {
            arrayList.add(new C1595c(5, lVar, null, null, null));
        }
        ArrayList a2 = f7.a(arrayList, lVar, abstractC1472f);
        if (!z7 && !z4 && !this.f15482b) {
            s4.i h6 = sVar2.h(e7);
            E m8 = d7.m(e7);
            M m9 = new M(d7, h6);
            d7.f15364f.f(D.k(e7), m8, m9, m9);
            q4.c F7 = d7.f15359a.F(e7.f16172a);
            if (m8 != null) {
                q4.k.b("If we're adding a query, it shouldn't be shadowed", !((s) F7.f15855a).g());
            } else {
                u1.c cVar2 = new u1.c(d7, 23);
                F7.getClass();
                F7.t(C1473g.f15415d, cVar2, null);
            }
        }
        return a2;
    }
}
