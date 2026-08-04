package v4;

import com.google.android.gms.common.internal.D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements Iterable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p075k4.e f17191d = new p075k4.e(Collections.emptyList(), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f17192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p075k4.e f17193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f17194c;

    public l(r rVar, k kVar) {
        this.f17194c = kVar;
        this.f17192a = rVar;
        this.f17193b = null;
    }

    public static l m(r rVar) {
        return new l(rVar, t.f17205a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        l();
        return D.m(this.f17193b, f17191d) ? this.f17192a.iterator() : this.f17193b.iterator();
    }

    public final void l() {
        if (this.f17193b == null) {
            m mVar = m.f17195a;
            k kVar = this.f17194c;
            boolean zEquals = kVar.equals(mVar);
            p075k4.e eVar = f17191d;
            if (zEquals) {
                this.f17193b = eVar;
                return;
            }
            ArrayList arrayList = new ArrayList();
            boolean z4 = false;
            for (p pVar : this.f17192a) {
                z4 = z4 || kVar.b(pVar.f17202b);
                arrayList.add(new p(pVar.f17201a, pVar.f17202b));
            }
            if (z4) {
                this.f17193b = new p075k4.e(arrayList, kVar);
            } else {
                this.f17193b = eVar;
            }
        }
    }

    public final l t(c cVar, r rVar) {
        r rVar2 = this.f17192a;
        r rVarS = rVar2.s(cVar, rVar);
        p075k4.e eVar = this.f17193b;
        p075k4.e eVar2 = f17191d;
        boolean zM = D.m(eVar, eVar2);
        k kVar = this.f17194c;
        if (zM && !kVar.b(rVar)) {
            return new l(rVarS, kVar, eVar2);
        }
        p075k4.e eVar3 = this.f17193b;
        if (eVar3 == null || D.m(eVar3, eVar2)) {
            return new l(rVarS, kVar, null);
        }
        p075k4.e eVarT = this.f17193b.t(new p(cVar, rVar2.o(cVar)));
        if (!rVar.isEmpty()) {
            eVarT = eVarT.l(new p(cVar, rVar));
        }
        return new l(rVarS, kVar, eVarT);
    }

    public l(r rVar, k kVar, p075k4.e eVar) {
        this.f17194c = kVar;
        this.f17192a = rVar;
        this.f17193b = eVar;
    }
}
