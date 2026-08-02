package v4;

import C0.C0090i;
import E3.F;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import k4.AbstractC1341c;
import k4.C1340b;
import n4.C1473g;
import v0.AbstractC1663a;

/* loaded from: classes2.dex */
public class f implements r {

    /* renamed from: d, reason: collision with root package name */
    public static final C0090i f17177d = new C0090i(6);

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1341c f17178a;

    /* renamed from: b, reason: collision with root package name */
    public final r f17179b;

    /* renamed from: c, reason: collision with root package name */
    public String f17180c;

    public f() {
        this.f17180c = null;
        this.f17178a = new C1340b(f17177d);
        this.f17179b = j.f17184e;
    }

    @Override // v4.r
    public r e() {
        return this.f17179b;
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
        AbstractC1341c abstractC1341c = this.f17178a;
        int size = abstractC1341c.size();
        AbstractC1341c abstractC1341c2 = fVar.f17178a;
        if (size != abstractC1341c2.size()) {
            return false;
        }
        Iterator it = abstractC1341c.iterator();
        Iterator it2 = abstractC1341c2.iterator();
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
    public r g(C1473g c1473g) {
        c B7 = c1473g.B();
        return B7 == null ? this : o(B7).g(c1473g.E());
    }

    @Override // v4.r
    public Object getValue() {
        return u(false);
    }

    public int hashCode() {
        Iterator it = iterator();
        int i7 = 0;
        while (it.hasNext()) {
            p pVar = (p) it.next();
            i7 = AbstractC1663a.d(i7 * 31, 17, pVar.f17195a.f17173a) + pVar.f17196b.hashCode();
        }
        return i7;
    }

    @Override // v4.r
    public boolean i(c cVar) {
        return !o(cVar).isEmpty();
    }

    @Override // v4.r
    public boolean isEmpty() {
        return this.f17178a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new F(this.f17178a.iterator(), 2);
    }

    @Override // v4.r
    public String j(int i7) {
        boolean z4;
        if (i7 != 1) {
            throw new IllegalArgumentException("Hashes on children nodes only supported for V1");
        }
        StringBuilder sb = new StringBuilder();
        r rVar = this.f17179b;
        if (!rVar.isEmpty()) {
            sb.append("priority:");
            sb.append(rVar.j(1));
            sb.append(":");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        loop0: while (true) {
            z4 = false;
            while (it.hasNext()) {
                p pVar = (p) it.next();
                arrayList.add(pVar);
                if (z4 || !pVar.f17196b.e().isEmpty()) {
                    z4 = true;
                }
            }
        }
        if (z4) {
            Collections.sort(arrayList, t.f17199a);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            p pVar2 = (p) it2.next();
            String x4 = pVar2.f17196b.x();
            if (!x4.equals("")) {
                sb.append(":");
                sb.append(pVar2.f17195a.f17173a);
                sb.append(":");
                sb.append(x4);
            }
        }
        return sb.toString();
    }

    @Override // v4.r
    public int k() {
        return this.f17178a.size();
    }

    @Override // java.lang.Comparable
    /* renamed from: l */
    public int compareTo(r rVar) {
        if (isEmpty()) {
            return rVar.isEmpty() ? 0 : -1;
        }
        if (rVar.r() || rVar.isEmpty()) {
            return 1;
        }
        return rVar == r.f17197u ? -1 : 0;
    }

    public final void m(e eVar, boolean z4) {
        AbstractC1341c abstractC1341c = this.f17178a;
        if (!z4 || e().isEmpty()) {
            abstractC1341c.B(eVar);
        } else {
            abstractC1341c.B(new d(this, eVar));
        }
    }

    @Override // v4.r
    public c n(c cVar) {
        return (c) this.f17178a.A(cVar);
    }

    @Override // v4.r
    public r o(c cVar) {
        if (cVar.equals(c.f17171d)) {
            r rVar = this.f17179b;
            if (!rVar.isEmpty()) {
                return rVar;
            }
        }
        AbstractC1341c abstractC1341c = this.f17178a;
        return abstractC1341c.l(cVar) ? (r) abstractC1341c.m(cVar) : j.f17184e;
    }

    @Override // v4.r
    public r q(C1473g c1473g, r rVar) {
        c B7 = c1473g.B();
        if (B7 == null) {
            return rVar;
        }
        if (!B7.equals(c.f17171d)) {
            return s(B7, o(B7).q(c1473g.E(), rVar));
        }
        q4.k.c(p6.c.j(rVar));
        return v(rVar);
    }

    @Override // v4.r
    public boolean r() {
        return false;
    }

    @Override // v4.r
    public r s(c cVar, r rVar) {
        if (cVar.equals(c.f17171d)) {
            return v(rVar);
        }
        AbstractC1341c abstractC1341c = this.f17178a;
        if (abstractC1341c.l(cVar)) {
            abstractC1341c = abstractC1341c.F(cVar);
        }
        if (!rVar.isEmpty()) {
            abstractC1341c = abstractC1341c.D(cVar, rVar);
        }
        return abstractC1341c.isEmpty() ? j.f17184e : new f(abstractC1341c, this.f17179b);
    }

    public final void t(int i7, StringBuilder sb) {
        int i8;
        AbstractC1341c abstractC1341c = this.f17178a;
        boolean isEmpty = abstractC1341c.isEmpty();
        r rVar = this.f17179b;
        if (isEmpty && rVar.isEmpty()) {
            sb.append("{ }");
            return;
        }
        sb.append("{\n");
        Iterator it = abstractC1341c.iterator();
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
            sb.append(((c) entry.getKey()).f17173a);
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
        Integer g3;
        if (isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        boolean z7 = true;
        int i7 = 0;
        int i8 = 0;
        for (Map.Entry entry : this.f17178a) {
            String str = ((c) entry.getKey()).f17173a;
            hashMap.put(str, ((r) entry.getValue()).u(z4));
            i7++;
            if (z7) {
                if ((str.length() > 1 && str.charAt(0) == '0') || (g3 = q4.k.g(str)) == null || g3.intValue() < 0) {
                    z7 = false;
                } else if (g3.intValue() > i8) {
                    i8 = g3.intValue();
                }
            }
        }
        if (z4 || !z7 || i8 >= i7 * 2) {
            if (z4) {
                r rVar = this.f17179b;
                if (!rVar.isEmpty()) {
                    hashMap.put(".priority", rVar.getValue());
                }
            }
            return hashMap;
        }
        ArrayList arrayList = new ArrayList(i8 + 1);
        for (int i9 = 0; i9 <= i8; i9++) {
            arrayList.add(hashMap.get("" + i9));
        }
        return arrayList;
    }

    @Override // v4.r
    public r v(r rVar) {
        AbstractC1341c abstractC1341c = this.f17178a;
        return abstractC1341c.isEmpty() ? j.f17184e : new f(abstractC1341c, rVar);
    }

    @Override // v4.r
    public Iterator w() {
        return new F(this.f17178a.w(), 2);
    }

    @Override // v4.r
    public String x() {
        if (this.f17180c == null) {
            String j = j(1);
            this.f17180c = j.isEmpty() ? "" : q4.k.e(j);
        }
        return this.f17180c;
    }

    public f(AbstractC1341c abstractC1341c, r rVar) {
        this.f17180c = null;
        if (abstractC1341c.isEmpty() && !rVar.isEmpty()) {
            throw new IllegalArgumentException("Can't create empty ChildrenNode with priority!");
        }
        this.f17179b = rVar;
        this.f17178a = abstractC1341c;
    }
}
