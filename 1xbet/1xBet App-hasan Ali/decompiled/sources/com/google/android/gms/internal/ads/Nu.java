package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class Nu extends AbstractCollection implements List {

    /* renamed from: k, reason: collision with root package name */
    public final Object f10863k;

    /* renamed from: l, reason: collision with root package name */
    public Collection f10864l;

    /* renamed from: m, reason: collision with root package name */
    public final Nu f10865m;

    /* renamed from: n, reason: collision with root package name */
    public final Collection f10866n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1581sv f10867o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1581sv f10868p;

    public Nu(C1581sv c1581sv, Object obj, List list, Nu nu) {
        this.f10868p = c1581sv;
        this.f10867o = c1581sv;
        this.f10863k = obj;
        this.f10864l = list;
        this.f10865m = nu;
        this.f10866n = nu == null ? null : nu.f10864l;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        d();
        boolean isEmpty = this.f10864l.isEmpty();
        ((List) this.f10864l).add(i, obj);
        this.f10868p.f15614o++;
        if (isEmpty) {
            c();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f10864l).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        this.f10868p.f15614o += this.f10864l.size() - size;
        if (size != 0) {
            return addAll;
        }
        c();
        return true;
    }

    public final void c() {
        Nu nu = this.f10865m;
        if (nu != null) {
            nu.c();
            return;
        }
        this.f10867o.f15613n.put(this.f10863k, this.f10864l);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f10864l.clear();
        this.f10867o.f15614o -= size;
        e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        d();
        return this.f10864l.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        d();
        return this.f10864l.containsAll(collection);
    }

    public final void d() {
        Collection collection;
        Nu nu = this.f10865m;
        if (nu != null) {
            nu.d();
            if (nu.f10864l != this.f10866n) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f10864l.isEmpty() || (collection = (Collection) this.f10867o.f15613n.get(this.f10863k)) == null) {
                return;
            }
            this.f10864l = collection;
        }
    }

    public final void e() {
        Nu nu = this.f10865m;
        if (nu != null) {
            nu.e();
        } else if (this.f10864l.isEmpty()) {
            this.f10867o.f15613n.remove(this.f10863k);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        d();
        return this.f10864l.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        d();
        return ((List) this.f10864l).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        d();
        return this.f10864l.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        d();
        return ((List) this.f10864l).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        d();
        return new Du(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        d();
        return ((List) this.f10864l).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        d();
        return new Mu(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        d();
        Object remove = ((List) this.f10864l).remove(i);
        C1581sv c1581sv = this.f10868p;
        c1581sv.f15614o--;
        e();
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f10864l.removeAll(collection);
        if (removeAll) {
            this.f10867o.f15614o += this.f10864l.size() - size;
            e();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f10864l.retainAll(collection);
        if (retainAll) {
            this.f10867o.f15614o += this.f10864l.size() - size;
            e();
        }
        return retainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        d();
        return ((List) this.f10864l).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        d();
        return this.f10864l.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i5) {
        d();
        List subList = ((List) this.f10864l).subList(i, i5);
        Nu nu = this.f10865m;
        if (nu == null) {
            nu = this;
        }
        C1581sv c1581sv = this.f10868p;
        c1581sv.getClass();
        boolean z3 = subList instanceof RandomAccess;
        Object obj = this.f10863k;
        return z3 ? new Iu(c1581sv, obj, subList, nu) : new Nu(c1581sv, obj, subList, nu);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        d();
        return this.f10864l.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        d();
        return new Mu(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        d();
        boolean remove = this.f10864l.remove(obj);
        if (remove) {
            C1581sv c1581sv = this.f10867o;
            c1581sv.f15614o--;
            e();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d();
        boolean isEmpty = this.f10864l.isEmpty();
        boolean add = this.f10864l.add(obj);
        if (add) {
            this.f10867o.f15614o++;
            if (isEmpty) {
                c();
                return true;
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
        boolean addAll = this.f10864l.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        this.f10867o.f15614o += this.f10864l.size() - size;
        if (size != 0) {
            return addAll;
        }
        c();
        return true;
    }
}
