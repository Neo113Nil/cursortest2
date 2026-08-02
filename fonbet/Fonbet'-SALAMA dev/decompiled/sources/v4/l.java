package v4;

import com.google.android.gms.common.internal.D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import k4.C1343e;

/* loaded from: classes2.dex */
public final class l implements Iterable {

    /* renamed from: d, reason: collision with root package name */
    public static final C1343e f17185d = new C1343e(Collections.emptyList(), null);

    /* renamed from: a, reason: collision with root package name */
    public final r f17186a;

    /* renamed from: b, reason: collision with root package name */
    public C1343e f17187b;

    /* renamed from: c, reason: collision with root package name */
    public final k f17188c;

    public l(r rVar, k kVar) {
        this.f17188c = kVar;
        this.f17186a = rVar;
        this.f17187b = null;
    }

    public static l m(r rVar) {
        return new l(rVar, t.f17199a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        l();
        return D.m(this.f17187b, f17185d) ? this.f17186a.iterator() : this.f17187b.iterator();
    }

    public final void l() {
        if (this.f17187b == null) {
            m mVar = m.f17189a;
            k kVar = this.f17188c;
            boolean equals = kVar.equals(mVar);
            C1343e c1343e = f17185d;
            if (equals) {
                this.f17187b = c1343e;
                return;
            }
            ArrayList arrayList = new ArrayList();
            boolean z4 = false;
            for (p pVar : this.f17186a) {
                z4 = z4 || kVar.b(pVar.f17196b);
                arrayList.add(new p(pVar.f17195a, pVar.f17196b));
            }
            if (z4) {
                this.f17187b = new C1343e(arrayList, kVar);
            } else {
                this.f17187b = c1343e;
            }
        }
    }

    public final l t(c cVar, r rVar) {
        r rVar2 = this.f17186a;
        r s7 = rVar2.s(cVar, rVar);
        C1343e c1343e = this.f17187b;
        C1343e c1343e2 = f17185d;
        boolean m7 = D.m(c1343e, c1343e2);
        k kVar = this.f17188c;
        if (m7 && !kVar.b(rVar)) {
            return new l(s7, kVar, c1343e2);
        }
        C1343e c1343e3 = this.f17187b;
        if (c1343e3 == null || D.m(c1343e3, c1343e2)) {
            return new l(s7, kVar, null);
        }
        C1343e t7 = this.f17187b.t(new p(cVar, rVar2.o(cVar)));
        if (!rVar.isEmpty()) {
            t7 = t7.l(new p(cVar, rVar));
        }
        return new l(s7, kVar, t7);
    }

    public l(r rVar, k kVar, C1343e c1343e) {
        this.f17188c = kVar;
        this.f17186a = rVar;
        this.f17187b = c1343e;
    }
}
