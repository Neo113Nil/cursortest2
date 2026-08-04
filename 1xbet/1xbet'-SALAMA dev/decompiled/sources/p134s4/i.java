package p134s4;

import com.google.android.gms.common.api.internal.C0800v;
import com.google.android.gms.common.internal.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p033e3.h;
import p072k1.g;
import p098n4.AbstractC0933f;
import p098n4.C0934g;
import p136t.e;
import p141t4.b;
import v4.c;
import v4.j;
import v4.k;
import v4.l;
import v4.p;
import v4.r;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f16180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f16181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w f16182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f16183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f16184e;

    public i(h hVar, w wVar) {
        b gVar;
        this.f16180a = hVar;
        g gVar2 = hVar.f16179b;
        h hVar2 = new h(gVar2.f16176g);
        if (gVar2.h()) {
            gVar = new h(gVar2.f16176g);
        } else if (gVar2.d()) {
            C0800v c0800v = new C0800v();
            c0800v.f11196c = new g(gVar2);
            c0800v.f11197d = gVar2.f16176g;
            if (!gVar2.d()) {
                throw new IllegalArgumentException("Cannot get limit if limit has not been set");
            }
            c0800v.f11194a = gVar2.f16170a.intValue();
            c0800v.f11195b = !gVar2.g();
            gVar = c0800v;
        } else {
            gVar = new g(gVar2);
        }
        this.f16181b = new j(gVar);
        a aVar = (a) wVar.f11336c;
        l lVar = new l(j.f17190e, hVar.f16179b.f16176g);
        l lVar2 = aVar.f16153a;
        hVar2.C(lVar, lVar2, null);
        a aVar2 = (a) wVar.f11335b;
        l lVarC = gVar.C(lVar, aVar2.f16153a, null);
        this.f16182c = new w(18, new a(lVarC, aVar2.f16154b, gVar.l()), new a(lVar2, aVar.f16154b, false));
        this.f16183d = new ArrayList();
        this.f16184e = new w(hVar);
    }

    public final ArrayList a(ArrayList arrayList, l lVar, AbstractC0933f abstractC0933f) {
        List listAsList = abstractC0933f == null ? this.f16183d : Arrays.asList(abstractC0933f);
        w wVar = this.f16184e;
        wVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (e.b(cVar.f16159a, 4)) {
                r rVar = cVar.f16161c.f17192a;
                r rVar2 = cVar.f16160b.f17192a;
                k kVar = (k) wVar.f11336c;
                c cVar2 = c.f17175b;
                if (kVar.compare(new p(cVar2, rVar), new p(cVar2, rVar2)) != 0) {
                    arrayList3.add(new c(3, cVar.f16160b, cVar.f16162d, null, null));
                }
            }
        }
        List list = listAsList;
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
    public final List b(AbstractC0933f abstractC0933f, p063i4.c cVar) {
        ?? EmptyList;
        ArrayList arrayList = this.f16183d;
        int i7 = 0;
        if (cVar != null) {
            EmptyList = new ArrayList();
            p120q4.k.b("A cancel should cancel all event registrations", abstractC0933f == null);
            C0934g c0934g = this.f16180a.f16178a;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                EmptyList.add(new b((AbstractC0933f) it.next(), cVar, c0934g));
            }
        } else {
            EmptyList = Collections.emptyList();
        }
        if (abstractC0933f != null) {
            int i8 = -1;
            while (true) {
                if (i7 >= arrayList.size()) {
                    i7 = i8;
                    break;
                }
                AbstractC0933f abstractC0933f2 = (AbstractC0933f) arrayList.get(i7);
                if (abstractC0933f2.f(abstractC0933f)) {
                    if (abstractC0933f2.f15418a.get()) {
                        break;
                    }
                    i8 = i7;
                }
                i7++;
            }
            if (i7 != -1) {
                AbstractC0933f abstractC0933f3 = (AbstractC0933f) arrayList.get(i7);
                arrayList.remove(i7);
                abstractC0933f3.h();
            }
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((AbstractC0933f) it2.next()).h();
            }
            arrayList.clear();
        }
        return EmptyList;
    }
}
