package Pf;

import Pf.f;
import Pf.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class n implements Cloneable {

    /* renamed from: c, reason: collision with root package name */
    static final List<n> f22484c = Collections.EMPTY_LIST;

    /* renamed from: a, reason: collision with root package name */
    h f22485a;

    /* renamed from: b, reason: collision with root package name */
    int f22486b;

    protected n() {
    }

    private void E(int i11) {
        int h11 = h();
        if (h11 == 0) {
            return;
        }
        List<n> n11 = n();
        while (i11 < h11) {
            n11.get(i11).f22486b = i11;
            i11++;
        }
    }

    abstract void A(Of.b bVar, f.a aVar);

    public h B() {
        return this.f22485a;
    }

    public final h C() {
        return this.f22485a;
    }

    public final n D() {
        h hVar = this.f22485a;
        if (hVar == null || this.f22486b <= 0) {
            return null;
        }
        return (n) ((ArrayList) hVar.n()).get(this.f22486b - 1);
    }

    public final void F() {
        h hVar = this.f22485a;
        if (hVar != null) {
            hVar.G(this);
        }
    }

    protected void G(n nVar) {
        Nf.b.a(nVar.f22485a == this);
        int i11 = nVar.f22486b;
        ((ArrayList) n()).remove(i11);
        E(i11);
        nVar.f22485a = null;
    }

    public final void H(n nVar) {
        Nf.b.d(nVar);
        if (this.f22485a == null) {
            this.f22485a = nVar.f22485a;
        }
        Nf.b.d(this.f22485a);
        h hVar = this.f22485a;
        hVar.getClass();
        Nf.b.a(this.f22485a == hVar);
        if (this == nVar) {
            return;
        }
        h hVar2 = nVar.f22485a;
        if (hVar2 != null) {
            hVar2.G(nVar);
        }
        int i11 = this.f22486b;
        ((ArrayList) hVar.n()).set(i11, nVar);
        nVar.f22485a = hVar;
        nVar.f22486b = i11;
        this.f22485a = null;
    }

    public n I() {
        n nVar = this;
        while (true) {
            h hVar = nVar.f22485a;
            if (hVar == null) {
                return nVar;
            }
            nVar = hVar;
        }
    }

    public final void J(String str) {
        Nf.b.d(str);
        m(str);
    }

    public final int K() {
        return this.f22486b;
    }

    public String a(String str) {
        Nf.b.b(str);
        return (r() && e().n(str)) ? Of.k.n(f(), e().l(str)) : "";
    }

    protected final void b(int i11, n... nVarArr) {
        if (nVarArr.length == 0) {
            return;
        }
        List<n> n11 = n();
        h B11 = nVarArr[0].B();
        if (B11 != null && B11.f22472e.size() == nVarArr.length) {
            List<n> n12 = B11.n();
            int length = nVarArr.length;
            while (true) {
                int i12 = length - 1;
                if (length <= 0) {
                    boolean z11 = h() == 0;
                    Iterator<n> it = B11.f22472e.iterator();
                    while (it.hasNext()) {
                        it.next().f22485a = null;
                    }
                    B11.f22472e.clear();
                    n11.addAll(i11, Arrays.asList(nVarArr));
                    int length2 = nVarArr.length;
                    while (true) {
                        int i13 = length2 - 1;
                        if (length2 <= 0) {
                            break;
                        }
                        nVarArr[i13].f22485a = (h) this;
                        length2 = i13;
                    }
                    if (z11 && nVarArr[0].f22486b == 0) {
                        return;
                    }
                    E(i11);
                    return;
                }
                if (nVarArr[i12] != ((ArrayList) n12).get(i12)) {
                    break;
                } else {
                    length = i12;
                }
            }
        }
        for (n nVar : nVarArr) {
            if (nVar == null) {
                throw new Nf.c("Array must not contain any null objects");
            }
        }
        for (n nVar2 : nVarArr) {
            nVar2.getClass();
            h hVar = nVar2.f22485a;
            if (hVar != null) {
                hVar.G(nVar2);
            }
            nVar2.f22485a = (h) this;
        }
        n11.addAll(i11, Arrays.asList(nVarArr));
        E(i11);
    }

    public String c(String str) {
        Nf.b.d(str);
        if (!r()) {
            return "";
        }
        String l11 = e().l(str);
        return l11.length() > 0 ? l11 : str.startsWith("abs:") ? a(str.substring(4)) : "";
    }

    public abstract b e();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public abstract String f();

    public final n g(int i11) {
        return n().get(i11);
    }

    public abstract int h();

    public final List<n> i() {
        if (((h) this).f22472e.size() == 0) {
            return f22484c;
        }
        ArrayList arrayList = (ArrayList) n();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        arrayList2.addAll(arrayList);
        return Collections.unmodifiableList(arrayList2);
    }

    @Override // 
    public n k() {
        n l11 = l(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(l11);
        while (!linkedList.isEmpty()) {
            n nVar = (n) linkedList.remove();
            int h11 = nVar.h();
            for (int i11 = 0; i11 < h11; i11++) {
                List<n> n11 = nVar.n();
                n l12 = n11.get(i11).l(nVar);
                n11.set(i11, l12);
                linkedList.add(l12);
            }
        }
        return l11;
    }

    protected n l(n nVar) {
        try {
            n nVar2 = (n) super.clone();
            nVar2.f22485a = (h) nVar;
            nVar2.f22486b = nVar == null ? 0 : this.f22486b;
            if (nVar == null && !(this instanceof f)) {
                n I11 = I();
                f fVar = I11 instanceof f ? (f) I11 : null;
                if (fVar != null) {
                    f f02 = fVar.f0();
                    nVar2.f22485a = f02;
                    ((ArrayList) f02.n()).add(nVar2);
                }
            }
            return nVar2;
        } catch (CloneNotSupportedException e11) {
            throw new RuntimeException(e11);
        }
    }

    protected abstract void m(String str);

    protected abstract List<n> n();

    public final n o() {
        if (h() == 0) {
            return null;
        }
        return n().get(0);
    }

    public final boolean q(String str) {
        Nf.b.d(str);
        if (!r()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String substring = str.substring(4);
            if (e().n(substring) && !a(substring).isEmpty()) {
                return true;
            }
        }
        return e().n(str);
    }

    protected abstract boolean r();

    public final boolean s() {
        return this.f22485a != null;
    }

    public final boolean t(String str) {
        return x().equals(str);
    }

    public String toString() {
        return z();
    }

    public final h u() {
        n nVar = this;
        do {
            nVar = nVar.v();
            if (nVar == null) {
                return null;
            }
        } while (!(nVar instanceof h));
        return (h) nVar;
    }

    public final n v() {
        h hVar = this.f22485a;
        if (hVar == null) {
            return null;
        }
        List<n> n11 = hVar.n();
        int i11 = this.f22486b + 1;
        ArrayList arrayList = (ArrayList) n11;
        if (arrayList.size() > i11) {
            return (n) arrayList.get(i11);
        }
        return null;
    }

    public abstract String w();

    public String x() {
        return w();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [Pf.p] */
    /* JADX WARN: Type inference failed for: r3v3, types: [Qf.g] */
    /* JADX WARN: Type inference failed for: r3v4, types: [Pf.p, Pf.p$a] */
    public String z() {
        ?? pVar;
        StringBuilder b11 = Of.k.b();
        Of.b d11 = Of.b.d(b11);
        n I11 = I();
        f fVar = I11 instanceof f ? (f) I11 : null;
        if (fVar == null) {
            fVar = new f();
        }
        f.a a02 = fVar.a0();
        a02.getClass();
        if (a02.f()) {
            pVar = new p.a(this, d11, a02);
            pVar.f22496d = false;
            n nVar = this;
            while (true) {
                if (nVar != null) {
                    if ((nVar instanceof h) && ((h) nVar).f22471d.c(64)) {
                        pVar.f22496d = true;
                        break;
                    }
                    nVar = nVar.f22485a;
                } else {
                    break;
                }
            }
        } else {
            pVar = new p(this, d11, a02);
        }
        pVar.c(this);
        return Of.k.l(b11);
    }
}
