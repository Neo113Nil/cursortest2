package v4;

import C0.C0090i;
import E3.F;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p098n4.C0934g;

/* JADX INFO: loaded from: classes2.dex */
public class f implements r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0090i f17183d = new C0090i(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p075k4.c f17184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f17185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f17186c;

    public f() {
        this.f17186c = null;
        this.f17184a = new p075k4.b(f17183d);
        this.f17185b = j.f17190e;
    }

    @Override // v4.r
    public r e() {
        return this.f17185b;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!e().equals(fVar.e())) {
            return false;
        }
        p075k4.c cVar = this.f17184a;
        int size = cVar.size();
        p075k4.c cVar2 = fVar.f17184a;
        if (size != cVar2.size()) {
            return false;
        }
        Iterator it = cVar.iterator();
        Iterator it2 = cVar2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            if (!((c) entry.getKey()).equals(entry2.getKey()) || !((r) entry.getValue()).equals(entry2.getValue())) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            throw new IllegalStateException("Something went wrong internally.");
        }
        return true;
    }

    @Override // v4.r
    public r g(C0934g c0934g) {
        c cVarB = c0934g.B();
        return cVarB == null ? this : o(cVarB).g(c0934g.E());
    }

    @Override // v4.r
    public Object getValue() {
        return u(false);
    }

    public int hashCode() {
        Iterator it = iterator();
        int iD = 0;
        while (it.hasNext()) {
            p pVar = (p) it.next();
            iD = p150v0.a.d(iD * 31, 17, pVar.f17201a.f17179a) + pVar.f17202b.hashCode();
        }
        return iD;
    }

    @Override // v4.r
    public boolean i(c cVar) {
        return !o(cVar).isEmpty();
    }

    @Override // v4.r
    public boolean isEmpty() {
        return this.f17184a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new F(this.f17184a.iterator(), 2);
    }

    @Override // v4.r
    public String j(int i7) {
        boolean z4;
        if (i7 != 1) {
            throw new IllegalArgumentException("Hashes on children nodes only supported for V1");
        }
        StringBuilder sb = new StringBuilder();
        r rVar = this.f17185b;
        if (!rVar.isEmpty()) {
            sb.append("priority:");
            sb.append(rVar.j(1));
            sb.append(":");
        }
        ArrayList<p> arrayList = new ArrayList();
        Iterator it = iterator();
        loop0: while (true) {
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                p pVar = (p) it.next();
                arrayList.add(pVar);
                z4 = z4 || !pVar.f17202b.e().isEmpty();
            }
        }
        if (z4) {
            Collections.sort(arrayList, t.f17205a);
        }
        for (p pVar2 : arrayList) {
            String strX = pVar2.f17202b.x();
            if (!strX.equals("")) {
                sb.append(":");
                sb.append(pVar2.f17201a.f17179a);
                sb.append(":");
                sb.append(strX);
            }
        }
        return sb.toString();
    }

    @Override // v4.r
    public int k() {
        return this.f17184a.size();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: l */
    public int compareTo(r rVar) {
        if (isEmpty()) {
            return rVar.isEmpty() ? 0 : -1;
        }
        if (rVar.r() || rVar.isEmpty()) {
            return 1;
        }
        return rVar == r.f17203u ? -1 : 0;
    }

    public final void m(e eVar, boolean z4) {
        p075k4.c cVar = this.f17184a;
        if (!z4 || e().isEmpty()) {
            cVar.B(eVar);
        } else {
            cVar.B(new d(this, eVar));
        }
    }

    @Override // v4.r
    public c n(c cVar) {
        return (c) this.f17184a.A(cVar);
    }

    @Override // v4.r
    public r o(c cVar) {
        if (cVar.equals(c.f17177d)) {
            r rVar = this.f17185b;
            if (!rVar.isEmpty()) {
                return rVar;
            }
        }
        p075k4.c cVar2 = this.f17184a;
        return cVar2.l(cVar) ? (r) cVar2.m(cVar) : j.f17190e;
    }

    @Override // v4.r
    public r q(C0934g c0934g, r rVar) {
        c cVarB = c0934g.B();
        if (cVarB == null) {
            return rVar;
        }
        if (!cVarB.equals(c.f17177d)) {
            return s(cVarB, o(cVarB).q(c0934g.E(), rVar));
        }
        p120q4.k.c(p115p6.c.j(rVar));
        return v(rVar);
    }

    @Override // v4.r
    public boolean r() {
        return false;
    }

    @Override // v4.r
    public r s(c cVar, r rVar) {
        if (cVar.equals(c.f17177d)) {
            return v(rVar);
        }
        p075k4.c cVarD = this.f17184a;
        if (cVarD.l(cVar)) {
            cVarD = cVarD.F(cVar);
        }
        if (!rVar.isEmpty()) {
            cVarD = cVarD.D(cVar, rVar);
        }
        return cVarD.isEmpty() ? j.f17190e : new f(cVarD, this.f17185b);
    }

    public final void t(int i7, StringBuilder sb) {
        int i8;
        p075k4.c cVar = this.f17184a;
        boolean zIsEmpty = cVar.isEmpty();
        r rVar = this.f17185b;
        if (zIsEmpty && rVar.isEmpty()) {
            sb.append("{ }");
            return;
        }
        sb.append("{\n");
        Iterator it = cVar.iterator();
        while (true) {
            i8 = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int i9 = i7 + 2;
            while (i8 < i9) {
                sb.append(" ");
                i8++;
            }
            sb.append(((c) entry.getKey()).f17179a);
            sb.append("=");
            if (entry.getValue() instanceof f) {
                ((f) entry.getValue()).t(i9, sb);
            } else {
                sb.append(((r) entry.getValue()).toString());
            }
            sb.append("\n");
        }
        if (!rVar.isEmpty()) {
            int i10 = i7 + 2;
            for (int i11 = 0; i11 < i10; i11++) {
                sb.append(" ");
            }
            sb.append(".priority=");
            sb.append(rVar.toString());
            sb.append("\n");
        }
        while (i8 < i7) {
            sb.append(" ");
            i8++;
        }
        sb.append("}");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        t(0, sb);
        return sb.toString();
    }

    @Override // v4.r
    public Object u(boolean z4) {
        Integer numG;
        if (isEmpty()) {
            return null;
        }
        HashMap map = new HashMap();
        boolean z7 = true;
        int i7 = 0;
        int iIntValue = 0;
        for (Map.Entry entry : this.f17184a) {
            String str = ((c) entry.getKey()).f17179a;
            map.put(str, ((r) entry.getValue()).u(z4));
            i7++;
            if (z7) {
                if ((str.length() > 1 && str.charAt(0) == '0') || (numG = p120q4.k.g(str)) == null || numG.intValue() < 0) {
                    z7 = false;
                } else if (numG.intValue() > iIntValue) {
                    iIntValue = numG.intValue();
                }
            }
        }
        if (z4 || !z7 || iIntValue >= i7 * 2) {
            if (z4) {
                r rVar = this.f17185b;
                if (!rVar.isEmpty()) {
                    map.put(".priority", rVar.getValue());
                }
            }
            return map;
        }
        ArrayList arrayList = new ArrayList(iIntValue + 1);
        for (int i8 = 0; i8 <= iIntValue; i8++) {
            arrayList.add(map.get("" + i8));
        }
        return arrayList;
    }

    @Override // v4.r
    public r v(r rVar) {
        p075k4.c cVar = this.f17184a;
        return cVar.isEmpty() ? j.f17190e : new f(cVar, rVar);
    }

    @Override // v4.r
    public Iterator w() {
        return new F(this.f17184a.w(), 2);
    }

    @Override // v4.r
    public String x() {
        if (this.f17186c == null) {
            String strJ = j(1);
            this.f17186c = strJ.isEmpty() ? "" : p120q4.k.e(strJ);
        }
        return this.f17186c;
    }

    public f(p075k4.c cVar, r rVar) {
        this.f17186c = null;
        if (cVar.isEmpty() && !rVar.isEmpty()) {
            throw new IllegalArgumentException("Can't create empty ChildrenNode with priority!");
        }
        this.f17185b = rVar;
        this.f17184a = cVar;
    }
}
