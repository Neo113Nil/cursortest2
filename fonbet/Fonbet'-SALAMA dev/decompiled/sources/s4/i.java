package s4;

import com.google.android.gms.common.api.internal.C0844v;
import com.google.android.gms.common.internal.w;
import e3.C1023h;
import i4.C1266c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n4.AbstractC1472f;
import n4.C1473g;
import t4.InterfaceC1610b;
import v4.k;
import v4.l;
import v4.p;
import v4.r;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final h f16174a;

    /* renamed from: b, reason: collision with root package name */
    public final j f16175b;

    /* renamed from: c, reason: collision with root package name */
    public w f16176c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f16177d;

    /* renamed from: e, reason: collision with root package name */
    public final w f16178e;

    public i(h hVar, w wVar) {
        InterfaceC1610b interfaceC1610b;
        this.f16174a = hVar;
        g gVar = hVar.f16173b;
        C1023h c1023h = new C1023h(gVar.f16170g);
        if (gVar.h()) {
            interfaceC1610b = new C1023h(gVar.f16170g);
        } else if (gVar.d()) {
            C0844v c0844v = new C0844v();
            c0844v.f11196c = new k1.g(gVar);
            c0844v.f11197d = gVar.f16170g;
            if (!gVar.d()) {
                throw new IllegalArgumentException("Cannot get limit if limit has not been set");
            }
            c0844v.f11194a = gVar.f16164a.intValue();
            c0844v.f11195b = !gVar.g();
            interfaceC1610b = c0844v;
        } else {
            interfaceC1610b = new k1.g(gVar);
        }
        this.f16175b = new j(interfaceC1610b);
        C1593a c1593a = (C1593a) wVar.f11336c;
        l lVar = new l(v4.j.f17184e, hVar.f16173b.f16170g);
        l lVar2 = c1593a.f16147a;
        c1023h.C(lVar, lVar2, null);
        C1593a c1593a2 = (C1593a) wVar.f11335b;
        l C3 = interfaceC1610b.C(lVar, c1593a2.f16147a, null);
        this.f16176c = new w(18, new C1593a(C3, c1593a2.f16148b, interfaceC1610b.l()), new C1593a(lVar2, c1593a.f16148b, false));
        this.f16177d = new ArrayList();
        this.f16178e = new w(hVar);
    }

    public final ArrayList a(ArrayList arrayList, l lVar, AbstractC1472f abstractC1472f) {
        List asList = abstractC1472f == null ? this.f16177d : Arrays.asList(abstractC1472f);
        w wVar = this.f16178e;
        wVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1595c c1595c = (C1595c) it.next();
            if (t.e.b(c1595c.f16153a, 4)) {
                r rVar = c1595c.f16155c.f17186a;
                r rVar2 = c1595c.f16154b.f17186a;
                k kVar = (k) wVar.f11336c;
                v4.c cVar = v4.c.f17169b;
                if (kVar.compare(new p(cVar, rVar), new p(cVar, rVar2)) != 0) {
                    arrayList3.add(new C1595c(3, c1595c.f16154b, c1595c.f16156d, null, null));
                }
            }
        }
        List list = asList;
        wVar.B(arrayList2, 1, arrayList, list, lVar);
        wVar.B(arrayList2, 2, arrayList, list, lVar);
        wVar.B(arrayList2, 3, arrayList3, list, lVar);
        wVar.B(arrayList2, 4, arrayList, list, lVar);
        wVar.B(arrayList2, 5, arrayList, list, lVar);
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    public final List b(AbstractC1472f abstractC1472f, C1266c c1266c) {
        ?? emptyList;
        ArrayList arrayList = this.f16177d;
        int i7 = 0;
        if (c1266c != null) {
            emptyList = new ArrayList();
            q4.k.b("A cancel should cancel all event registrations", abstractC1472f == null);
            C1473g c1473g = this.f16174a.f16172a;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                emptyList.add(new C1594b((AbstractC1472f) it.next(), c1266c, c1473g));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        if (abstractC1472f != null) {
            int i8 = -1;
            while (true) {
                if (i7 >= arrayList.size()) {
                    i7 = i8;
                    break;
                }
                AbstractC1472f abstractC1472f2 = (AbstractC1472f) arrayList.get(i7);
                if (abstractC1472f2.f(abstractC1472f)) {
                    if (abstractC1472f2.f15412a.get()) {
                        break;
                    }
                    i8 = i7;
                }
                i7++;
            }
            if (i7 != -1) {
                AbstractC1472f abstractC1472f3 = (AbstractC1472f) arrayList.get(i7);
                arrayList.remove(i7);
                abstractC1472f3.h();
            }
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((AbstractC1472f) it2.next()).h();
            }
            arrayList.clear();
        }
        return emptyList;
    }
}
