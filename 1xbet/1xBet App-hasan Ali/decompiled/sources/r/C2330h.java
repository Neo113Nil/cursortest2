package r;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import r0.AbstractC2346c;

/* renamed from: r.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2330h implements Set, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f19007k;

    /* renamed from: l, reason: collision with root package name */
    public final C2321G f19008l;

    public C2330h(C2321G c2321g, int i) {
        this.f19007k = i;
        switch (i) {
            case 1:
                kotlin.jvm.internal.l.f("parent", c2321g);
                this.f19008l = c2321g;
                break;
            default:
                kotlin.jvm.internal.l.f("parent", c2321g);
                this.f19008l = c2321g;
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f19007k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f19007k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f19007k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f19007k) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.l.f("element", entry);
                return kotlin.jvm.internal.l.a(this.f19008l.g(entry.getKey()), entry.getValue());
            default:
                return this.f19008l.c(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f19007k) {
            case 0:
                kotlin.jvm.internal.l.f("elements", collection);
                Collection<Map.Entry> collection2 = collection;
                if (!collection2.isEmpty()) {
                    for (Map.Entry entry : collection2) {
                        if (!kotlin.jvm.internal.l.a(this.f19008l.g(entry.getKey()), entry.getValue())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                kotlin.jvm.internal.l.f("elements", collection);
                Collection collection3 = collection;
                if (!collection3.isEmpty()) {
                    Iterator it = collection3.iterator();
                    while (it.hasNext()) {
                        if (!this.f19008l.c(it.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f19007k) {
        }
        return this.f19008l.i();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f19007k) {
            case 0:
                return AbstractC2346c.z(new C2329g(this, null));
            default:
                return AbstractC2346c.z(new C2336n(this, null));
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f19007k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f19007k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f19007k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f19007k) {
        }
        return this.f19008l.f18932e;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f19007k) {
        }
        return kotlin.jvm.internal.k.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f19007k) {
            case 0:
                kotlin.jvm.internal.l.f("array", objArr);
                break;
            default:
                kotlin.jvm.internal.l.f("array", objArr);
                break;
        }
        return kotlin.jvm.internal.k.b(this, objArr);
    }
}
