package k4;

import java.util.Comparator;
import java.util.Iterator;

/* renamed from: k4.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1351m extends AbstractC1341c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1346h f14787a;

    /* renamed from: b, reason: collision with root package name */
    public final Comparator f14788b;

    public C1351m(InterfaceC1346h interfaceC1346h, Comparator comparator) {
        this.f14787a = interfaceC1346h;
        this.f14788b = comparator;
    }

    @Override // k4.AbstractC1341c
    public final Object A(Object obj) {
        InterfaceC1346h interfaceC1346h = this.f14787a;
        InterfaceC1346h interfaceC1346h2 = null;
        while (!interfaceC1346h.isEmpty()) {
            int compare = this.f14788b.compare(obj, interfaceC1346h.getKey());
            if (compare == 0) {
                if (interfaceC1346h.a().isEmpty()) {
                    if (interfaceC1346h2 != null) {
                        return interfaceC1346h2.getKey();
                    }
                    return null;
                }
                InterfaceC1346h a2 = interfaceC1346h.a();
                while (!a2.g().isEmpty()) {
                    a2 = a2.g();
                }
                return a2.getKey();
            }
            if (compare < 0) {
                interfaceC1346h = interfaceC1346h.a();
            } else {
                interfaceC1346h2 = interfaceC1346h;
                interfaceC1346h = interfaceC1346h.g();
            }
        }
        throw new IllegalArgumentException("Couldn't find predecessor key of non-present key: " + obj);
    }

    @Override // k4.AbstractC1341c
    public final void B(Q0.a aVar) {
        this.f14787a.c(aVar);
    }

    @Override // k4.AbstractC1341c
    public final int C(H4.k kVar) {
        InterfaceC1346h interfaceC1346h = this.f14787a;
        int i7 = 0;
        while (!interfaceC1346h.isEmpty()) {
            int compare = this.f14788b.compare(kVar, interfaceC1346h.getKey());
            if (compare == 0) {
                return interfaceC1346h.a().size() + i7;
            }
            if (compare < 0) {
                interfaceC1346h = interfaceC1346h.a();
            } else {
                int size = interfaceC1346h.a().size() + 1 + i7;
                interfaceC1346h = interfaceC1346h.g();
                i7 = size;
            }
        }
        return -1;
    }

    @Override // k4.AbstractC1341c
    public final AbstractC1341c D(Object obj, Object obj2) {
        InterfaceC1346h interfaceC1346h = this.f14787a;
        Comparator comparator = this.f14788b;
        return new C1351m(((AbstractC1348j) interfaceC1346h.b(obj, obj2, comparator)).f(2, null, null), comparator);
    }

    @Override // k4.AbstractC1341c
    public final Iterator E(Object obj) {
        return new C1342d(this.f14787a, obj, this.f14788b, false);
    }

    @Override // k4.AbstractC1341c
    public final AbstractC1341c F(Object obj) {
        if (!l(obj)) {
            return this;
        }
        InterfaceC1346h interfaceC1346h = this.f14787a;
        Comparator comparator = this.f14788b;
        return new C1351m(interfaceC1346h.d(obj, comparator).f(2, null, null), comparator);
    }

    public final InterfaceC1346h G(Object obj) {
        InterfaceC1346h interfaceC1346h = this.f14787a;
        while (!interfaceC1346h.isEmpty()) {
            int compare = this.f14788b.compare(obj, interfaceC1346h.getKey());
            if (compare < 0) {
                interfaceC1346h = interfaceC1346h.a();
            } else {
                if (compare == 0) {
                    return interfaceC1346h;
                }
                interfaceC1346h = interfaceC1346h.g();
            }
        }
        return null;
    }

    @Override // k4.AbstractC1341c
    public final boolean isEmpty() {
        return this.f14787a.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1342d(this.f14787a, null, this.f14788b, false);
    }

    @Override // k4.AbstractC1341c
    public final boolean l(Object obj) {
        return G(obj) != null;
    }

    @Override // k4.AbstractC1341c
    public final Object m(Comparable comparable) {
        InterfaceC1346h G2 = G(comparable);
        if (G2 != null) {
            return G2.getValue();
        }
        return null;
    }

    @Override // k4.AbstractC1341c
    public final int size() {
        return this.f14787a.size();
    }

    @Override // k4.AbstractC1341c
    public final Comparator t() {
        return this.f14788b;
    }

    @Override // k4.AbstractC1341c
    public final Iterator w() {
        return new C1342d(this.f14787a, null, this.f14788b, true);
    }

    @Override // k4.AbstractC1341c
    public final Object y() {
        return this.f14787a.i().getKey();
    }

    @Override // k4.AbstractC1341c
    public final Object z() {
        return this.f14787a.h().getKey();
    }
}
