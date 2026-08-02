package n4;

import i4.C1266c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import k4.C1349k;

/* loaded from: classes2.dex */
public final class v implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s4.h f15484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC1472f f15485b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1266c f15486c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f15487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D f15488e;

    public v(D d7, s4.h hVar, AbstractC1472f abstractC1472f, C1266c c1266c, boolean z4) {
        this.f15488e = d7;
        this.f15484a = hVar;
        this.f15485b = abstractC1472f;
        this.f15486c = c1266c;
        this.f15487d = z4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z4;
        Object obj;
        s4.h hVar = this.f15484a;
        C1473g c1473g = hVar.f16172a;
        D d7 = this.f15488e;
        s sVar = (s) d7.f15359a.y(c1473g);
        ArrayList arrayList = new ArrayList();
        if (sVar != null && (hVar.c() || sVar.h(hVar) != null)) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            boolean g3 = sVar.g();
            boolean c3 = hVar.c();
            HashMap hashMap = sVar.f15474a;
            C1266c c1266c = this.f15486c;
            AbstractC1472f abstractC1472f = this.f15485b;
            if (c3) {
                Iterator it = hashMap.entrySet().iterator();
                while (it.hasNext()) {
                    s4.i iVar = (s4.i) ((Map.Entry) it.next()).getValue();
                    arrayList3.addAll(iVar.b(abstractC1472f, c1266c));
                    if (iVar.f16177d.isEmpty()) {
                        it.remove();
                        s4.h hVar2 = iVar.f16174a;
                        if (!hVar2.f16173b.h()) {
                            arrayList2.add(hVar2);
                        }
                    }
                }
            } else {
                s4.g gVar = hVar.f16173b;
                s4.i iVar2 = (s4.i) hashMap.get(gVar);
                if (iVar2 != null) {
                    arrayList3.addAll(iVar2.b(abstractC1472f, c1266c));
                    if (iVar2.f16177d.isEmpty()) {
                        hashMap.remove(gVar);
                        s4.h hVar3 = iVar2.f16174a;
                        if (!hVar3.f16173b.h()) {
                            arrayList2.add(hVar3);
                        }
                    }
                }
            }
            if (g3 && !sVar.g()) {
                arrayList2.add(s4.h.a(hVar.f16172a));
            }
            if (hashMap.isEmpty()) {
                d7.f15359a = d7.f15359a.B(c1473g);
            }
            Iterator it2 = arrayList2.iterator();
            loop1: while (true) {
                z4 = false;
                while (it2.hasNext()) {
                    s4.h hVar4 = (s4.h) it2.next();
                    d7.f15365g.i(hVar);
                    if (z4 || hVar4.f16173b.h()) {
                        z4 = true;
                    }
                }
            }
            if (this.f15487d) {
                return null;
            }
            q4.c cVar = d7.f15359a;
            Object obj2 = cVar.f15855a;
            boolean z7 = obj2 != null && ((s) obj2).g();
            C1349k c1349k = new C1349k(c1473g);
            while (c1349k.hasNext()) {
                cVar = cVar.z((v4.c) c1349k.next());
                z7 = z7 || ((obj = cVar.f15855a) != null && ((s) obj).g());
                if (z7 || cVar.isEmpty()) {
                    break;
                }
            }
            C c4 = d7.f15364f;
            if (z4 && !z7) {
                q4.c F7 = d7.f15359a.F(c1473g);
                if (!F7.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    D.j(F7, arrayList4);
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        s4.i iVar3 = (s4.i) it3.next();
                        M m7 = new M(d7, iVar3);
                        c4.f(D.k(iVar3.f16174a), (E) m7.f15384b, m7, m7);
                    }
                }
            }
            if (!z7 && !arrayList2.isEmpty() && c1266c == null) {
                if (z4) {
                    c4.d(D.k(hVar));
                } else {
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        s4.h hVar5 = (s4.h) it4.next();
                        q4.k.c(d7.m(hVar5) != null);
                        c4.d(D.k(hVar5));
                    }
                }
            }
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                s4.h hVar6 = (s4.h) it5.next();
                if (!hVar6.f16173b.h()) {
                    E m8 = d7.m(hVar6);
                    q4.k.c(m8 != null);
                    d7.f15362d.remove(hVar6);
                    d7.f15361c.remove(m8);
                }
            }
            arrayList = arrayList3;
        }
        return arrayList;
    }
}
