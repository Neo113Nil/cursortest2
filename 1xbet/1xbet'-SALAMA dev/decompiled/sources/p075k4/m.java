package p075k4;

import H4.k;
import Q0.a;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f14793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparator f14794b;

    public m(h hVar, Comparator comparator) {
        this.f14793a = hVar;
        this.f14794b = comparator;
    }

    @Override // p075k4.c
    public final Object A(Object obj) {
        h hVarA = this.f14793a;
        h hVar = null;
        while (!hVarA.isEmpty()) {
            int iCompare = this.f14794b.compare(obj, hVarA.getKey());
            if (iCompare == 0) {
                if (hVarA.a().isEmpty()) {
                    if (hVar != null) {
                        return hVar.getKey();
                    }
                    return null;
                }
                h hVarA2 = hVarA.a();
                while (!hVarA2.g().isEmpty()) {
                    hVarA2 = hVarA2.g();
                }
                return hVarA2.getKey();
            }
            if (iCompare < 0) {
                hVarA = hVarA.a();
            } else {
                hVar = hVarA;
                hVarA = hVarA.g();
            }
        }
        throw new IllegalArgumentException("Couldn't find predecessor key of non-present key: " + obj);
    }

    @Override // p075k4.c
    public final void B(a aVar) {
        this.f14793a.c(aVar);
    }

    @Override // p075k4.c
    public final int C(k kVar) {
        h hVarA = this.f14793a;
        int i7 = 0;
        while (!hVarA.isEmpty()) {
            int iCompare = this.f14794b.compare(kVar, hVarA.getKey());
            if (iCompare == 0) {
                return hVarA.a().size() + i7;
            }
            if (iCompare < 0) {
                hVarA = hVarA.a();
            } else {
                int size = hVarA.a().size() + 1 + i7;
                hVarA = hVarA.g();
                i7 = size;
            }
        }
        return -1;
    }

    @Override // p075k4.c
    public final c D(Object obj, Object obj2) {
        h hVar = this.f14793a;
        Comparator comparator = this.f14794b;
        return new m(((j) hVar.b(obj, obj2, comparator)).f(2, null, null), comparator);
    }

    @Override // p075k4.c
    public final Iterator E(Object obj) {
        return new d(this.f14793a, obj, this.f14794b, false);
    }

    @Override // p075k4.c
    public final c F(Object obj) {
        if (!l(obj)) {
            return this;
        }
        h hVar = this.f14793a;
        Comparator comparator = this.f14794b;
        return new m(hVar.d(obj, comparator).f(2, null, null), comparator);
    }

    public final h G(Object obj) {
        h hVarA = this.f14793a;
        while (!hVarA.isEmpty()) {
            int iCompare = this.f14794b.compare(obj, hVarA.getKey());
            if (iCompare < 0) {
                hVarA = hVarA.a();
            } else {
                if (iCompare == 0) {
                    return hVarA;
                }
                hVarA = hVarA.g();
            }
        }
        return null;
    }

    @Override // p075k4.c
    public final boolean isEmpty() {
        return this.f14793a.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d(this.f14793a, null, this.f14794b, false);
    }

    @Override // p075k4.c
    public final boolean l(Object obj) {
        return G(obj) != null;
    }

    @Override // p075k4.c
    public final Object m(Comparable comparable) {
        h hVarG = G(comparable);
        if (hVarG != null) {
            return hVarG.getValue();
        }
        return null;
    }

    @Override // p075k4.c
    public final int size() {
        return this.f14793a.size();
    }

    @Override // p075k4.c
    public final Comparator t() {
        return this.f14794b;
    }

    @Override // p075k4.c
    public final Iterator w() {
        return new d(this.f14793a, null, this.f14794b, true);
    }

    @Override // p075k4.c
    public final Object y() {
        return this.f14793a.i().getKey();
    }

    @Override // p075k4.c
    public final Object z() {
        return this.f14793a.h().getKey();
    }
}
