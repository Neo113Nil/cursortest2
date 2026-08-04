package p098n4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import p063i4.c;
import p075k4.k;
import p134s4.g;
import p134s4.h;
import p134s4.i;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f15490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0933f f15491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f15492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f15493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D f15494e;

    public v(D d7, h hVar, AbstractC0933f abstractC0933f, c cVar, boolean z4) {
        this.f15494e = d7;
        this.f15490a = hVar;
        this.f15491b = abstractC0933f;
        this.f15492c = cVar;
        this.f15493d = z4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z4;
        Object obj;
        h hVar = this.f15490a;
        C0934g c0934g = hVar.f16178a;
        D d7 = this.f15494e;
        s sVar = (s) d7.f15365a.y(c0934g);
        ArrayList arrayList = new ArrayList();
        if (sVar != null && (hVar.c() || sVar.h(hVar) != null)) {
            ArrayList<h> arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            boolean zG = sVar.g();
            boolean zC = hVar.c();
            HashMap map = sVar.f15480a;
            c cVar = this.f15492c;
            AbstractC0933f abstractC0933f = this.f15491b;
            if (zC) {
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    i iVar = (i) ((Map.Entry) it.next()).getValue();
                    arrayList3.addAll(iVar.b(abstractC0933f, cVar));
                    if (iVar.f16183d.isEmpty()) {
                        it.remove();
                        h hVar2 = iVar.f16180a;
                        if (!hVar2.f16179b.h()) {
                            arrayList2.add(hVar2);
                        }
                    }
                }
            } else {
                g gVar = hVar.f16179b;
                i iVar2 = (i) map.get(gVar);
                if (iVar2 != null) {
                    arrayList3.addAll(iVar2.b(abstractC0933f, cVar));
                    if (iVar2.f16183d.isEmpty()) {
                        map.remove(gVar);
                        h hVar3 = iVar2.f16180a;
                        if (!hVar3.f16179b.h()) {
                            arrayList2.add(hVar3);
                        }
                    }
                }
            }
            if (zG && !sVar.g()) {
                arrayList2.add(h.a(hVar.f16178a));
            }
            if (map.isEmpty()) {
                d7.f15365a = d7.f15365a.B(c0934g);
            }
            Iterator it2 = arrayList2.iterator();
            loop1: while (true) {
                while (true) {
                    if (!it2.hasNext()) {
                        break loop1;
                    }
                    h hVar4 = (h) it2.next();
                    d7.f15371g.i(hVar);
                    z4 = z4 || hVar4.f16179b.h();
                }
            }
            if (this.f15493d) {
                return null;
            }
            p120q4.c cVarZ = d7.f15365a;
            Object obj2 = cVarZ.f15861a;
            boolean z7 = obj2 != null && ((s) obj2).g();
            k kVar = new k(c0934g);
            while (kVar.hasNext()) {
                cVarZ = cVarZ.z((v4.c) kVar.next());
                z7 = z7 || ((obj = cVarZ.f15861a) != null && ((s) obj).g());
                if (z7 || cVarZ.isEmpty()) {
                    break;
                }
            }
            C c3 = d7.f15370f;
            if (z4 && !z7) {
                p120q4.c cVarF = d7.f15365a.F(c0934g);
                if (!cVarF.isEmpty()) {
                    ArrayList<i> arrayList4 = new ArrayList();
                    D.j(cVarF, arrayList4);
                    for (i iVar3 : arrayList4) {
                        M m7 = new M(d7, iVar3);
                        c3.f(D.k(iVar3.f16180a), (E) m7.f15390b, m7, m7);
                    }
                }
            }
            if (!z7 && !arrayList2.isEmpty() && cVar == null) {
                if (z4) {
                    c3.d(D.k(hVar));
                } else {
                    for (h hVar5 : arrayList2) {
                        p120q4.k.c(d7.m(hVar5) != null);
                        c3.d(D.k(hVar5));
                    }
                }
            }
            for (h hVar6 : arrayList2) {
                if (!hVar6.f16179b.h()) {
                    E eM = d7.m(hVar6);
                    p120q4.k.c(eM != null);
                    d7.f15368d.remove(hVar6);
                    d7.f15367c.remove(eM);
                }
            }
            arrayList = arrayList3;
        }
        return arrayList;
    }
}
