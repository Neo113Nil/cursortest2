package k4;

import E3.F;
import G4.C0270c;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: k4.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1343e implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1341c f14775a;

    public C1343e(List list, Comparator comparator) {
        Map emptyMap = Collections.emptyMap();
        this.f14775a = list.size() < 25 ? C1340b.G(list, emptyMap, comparator) : k1.g.h(list, emptyMap, comparator);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1343e) {
            return this.f14775a.equals(((C1343e) obj).f14775a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14775a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new F(this.f14775a.iterator(), 1);
    }

    public final C1343e l(Object obj) {
        return new C1343e(this.f14775a.D(obj, null));
    }

    public final F m(C0270c c0270c) {
        return new F(this.f14775a.E(c0270c), 1);
    }

    public final C1343e t(Object obj) {
        AbstractC1341c abstractC1341c = this.f14775a;
        AbstractC1341c F7 = abstractC1341c.F(obj);
        return F7 == abstractC1341c ? this : new C1343e(F7);
    }

    public C1343e(AbstractC1341c abstractC1341c) {
        this.f14775a = abstractC1341c;
    }
}
