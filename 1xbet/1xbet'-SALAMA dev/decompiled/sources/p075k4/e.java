package p075k4;

import E3.F;
import G4.C0270c;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p072k1.g;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f14781a;

    public e(List list, Comparator comparator) {
        Map mapEmptyMap = Collections.emptyMap();
        this.f14781a = list.size() < 25 ? b.G(list, mapEmptyMap, comparator) : g.h(list, mapEmptyMap, comparator);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f14781a.equals(((e) obj).f14781a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14781a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new F(this.f14781a.iterator(), 1);
    }

    public final e l(Object obj) {
        return new e(this.f14781a.D(obj, null));
    }

    public final F m(C0270c c0270c) {
        return new F(this.f14781a.E(c0270c), 1);
    }

    public final e t(Object obj) {
        c cVar = this.f14781a;
        c cVarF = cVar.F(obj);
        return cVarF == cVar ? this : new e(cVarF);
    }

    public e(c cVar) {
        this.f14781a = cVar;
    }
}
