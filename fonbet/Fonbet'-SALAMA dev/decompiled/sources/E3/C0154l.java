package E3;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: E3.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0154l extends AbstractCollection implements List {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2055a;

    /* renamed from: b, reason: collision with root package name */
    public Collection f2056b;

    /* renamed from: c, reason: collision with root package name */
    public final C0154l f2057c;

    /* renamed from: d, reason: collision with root package name */
    public final Collection f2058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ H f2059e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ H f2060f;

    public C0154l(H h6, Object obj, List list, C0154l c0154l) {
        this.f2060f = h6;
        this.f2059e = h6;
        this.f2055a = obj;
        this.f2056b = list;
        this.f2057c = c0154l;
        this.f2058d = c0154l == null ? null : c0154l.f2056b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m();
        boolean isEmpty = this.f2056b.isEmpty();
        boolean add = this.f2056b.add(obj);
        if (add) {
            this.f2059e.f1997e++;
            if (isEmpty) {
                l();
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f2056b.addAll(collection);
        if (addAll) {
            this.f2059e.f1997e += this.f2056b.size() - size;
            if (size == 0) {
                l();
            }
        }
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f2056b.clear();
        this.f2059e.f1997e -= size;
        t();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        m();
        return this.f2056b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        m();
        return this.f2056b.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        m();
        return this.f2056b.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i7) {
        m();
        return ((List) this.f2056b).get(i7);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        m();
        return this.f2056b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        m();
        return ((List) this.f2056b).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        m();
        return new C0145c(this);
    }

    public final void l() {
        C0154l c0154l = this.f2057c;
        if (c0154l != null) {
            c0154l.l();
        } else {
            this.f2059e.f1996d.put(this.f2055a, this.f2056b);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        m();
        return ((List) this.f2056b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        m();
        return new C0153k(this);
    }

    public final void m() {
        Collection collection;
        C0154l c0154l = this.f2057c;
        if (c0154l != null) {
            c0154l.m();
            if (c0154l.f2056b != this.f2058d) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f2056b.isEmpty() || (collection = (Collection) this.f2059e.f1996d.get(this.f2055a)) == null) {
                return;
            }
            this.f2056b = collection;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m();
        boolean remove = this.f2056b.remove(obj);
        if (remove) {
            H h6 = this.f2059e;
            h6.f1997e--;
            t();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f2056b.removeAll(collection);
        if (removeAll) {
            this.f2059e.f1997e += this.f2056b.size() - size;
            t();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f2056b.retainAll(collection);
        if (retainAll) {
            this.f2059e.f1997e += this.f2056b.size() - size;
            t();
        }
        return retainAll;
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        m();
        return ((List) this.f2056b).set(i7, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        m();
        return this.f2056b.size();
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        m();
        List subList = ((List) this.f2056b).subList(i7, i8);
        C0154l c0154l = this.f2057c;
        if (c0154l == null) {
            c0154l = this;
        }
        H h6 = this.f2060f;
        h6.getClass();
        boolean z4 = subList instanceof RandomAccess;
        Object obj = this.f2055a;
        return z4 ? new C0150h(h6, obj, subList, c0154l) : new C0154l(h6, obj, subList, c0154l);
    }

    public final void t() {
        C0154l c0154l = this.f2057c;
        if (c0154l != null) {
            c0154l.t();
        } else if (this.f2056b.isEmpty()) {
            this.f2059e.f1996d.remove(this.f2055a);
        }
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m();
        return this.f2056b.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        m();
        return new C0153k(this, i7);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        m();
        Object remove = ((List) this.f2056b).remove(i7);
        H h6 = this.f2060f;
        h6.f1997e--;
        t();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        m();
        boolean isEmpty = this.f2056b.isEmpty();
        ((List) this.f2056b).add(i7, obj);
        this.f2060f.f1997e++;
        if (isEmpty) {
            l();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f2056b).addAll(i7, collection);
        if (addAll) {
            this.f2060f.f1997e += this.f2056b.size() - size;
            if (size == 0) {
                l();
            }
        }
        return addAll;
    }
}
