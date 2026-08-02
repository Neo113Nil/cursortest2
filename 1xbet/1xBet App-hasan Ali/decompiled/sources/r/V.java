package r;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public final class V implements Collection, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f18978k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final Object f18979l;

    public V() {
        int i = N.f18956a;
        this.f18979l = new C2318D(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f18978k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((C2318D) this.f18979l).a(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f18978k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.f18978k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((C2318D) this.f18979l).b();
                return;
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f18978k) {
            case 0:
                return ((C2321G) this.f18979l).d(obj);
            default:
                return ((C2318D) this.f18979l).c(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f18978k) {
            case 0:
                kotlin.jvm.internal.l.f("elements", collection);
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!((C2321G) this.f18979l).d(it.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!((C2318D) this.f18979l).c(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.f18978k) {
            case 0:
                return ((C2321G) this.f18979l).i();
            default:
                return ((C2318D) this.f18979l).f18916g == 0;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f18978k) {
            case 0:
                return AbstractC2346c.z(new U(this, null));
            default:
                C2318D c2318d = (C2318D) this.f18979l;
                c2318d.getClass();
                return new V.c(new C2320F(c2318d));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f18978k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((C2318D) this.f18979l).g(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f18978k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((C2318D) this.f18979l).g(collection);
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.f18978k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f18978k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((C2318D) this.f18979l).i(collection);
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.f18978k) {
            case 0:
                return ((C2321G) this.f18979l).f18932e;
            default:
                return ((C2318D) this.f18979l).f18916g;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.f18978k) {
        }
        return kotlin.jvm.internal.k.a(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f18978k) {
            case 0:
                kotlin.jvm.internal.l.f("array", objArr);
                break;
        }
        return kotlin.jvm.internal.k.b(this, objArr);
    }

    public V(C2321G c2321g) {
        kotlin.jvm.internal.l.f("parent", c2321g);
        this.f18979l = c2321g;
    }
}
