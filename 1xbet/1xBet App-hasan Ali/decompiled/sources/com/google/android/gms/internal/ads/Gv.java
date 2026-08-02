package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public class Gv extends AbstractCollection implements Set {

    /* renamed from: k, reason: collision with root package name */
    public final Set f9284k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC1446pu f9285l;

    public Gv(Set set, InterfaceC1446pu interfaceC1446pu) {
        this.f9284k = set;
        this.f9285l = interfaceC1446pu;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        AbstractC1400ot.W(this.f9285l.k(obj));
        return this.f9284k.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC1400ot.W(this.f9285l.k(it.next()));
        }
        return this.f9284k.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f9284k;
        boolean z3 = set instanceof RandomAccess;
        InterfaceC1446pu interfaceC1446pu = this.f9285l;
        if (!z3 || !(set instanceof List)) {
            Iterator it = set.iterator();
            interfaceC1446pu.getClass();
            while (it.hasNext()) {
                if (interfaceC1446pu.k(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        interfaceC1446pu.getClass();
        int i = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            Object obj = list.get(i5);
            if (!interfaceC1446pu.k(obj)) {
                if (i5 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        AbstractC0952et.P(list, interfaceC1446pu, i, i5);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        AbstractC0952et.P(list, interfaceC1446pu, i, i5);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean z3;
        Set set = this.f9284k;
        set.getClass();
        try {
            z3 = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z3 = false;
        }
        if (z3) {
            return this.f9285l.k(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return AbstractC0952et.U(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC0952et.d(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f9284k.iterator();
        InterfaceC1446pu interfaceC1446pu = this.f9285l;
        AbstractC1400ot.M("predicate", interfaceC1446pu);
        int i = 0;
        while (it.hasNext()) {
            if (interfaceC1446pu.k(it.next())) {
                return i == -1;
            }
            i++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f9284k.iterator();
        it.getClass();
        InterfaceC1446pu interfaceC1446pu = this.f9285l;
        interfaceC1446pu.getClass();
        return new C1222kv(it, interfaceC1446pu);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f9284k.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f9284k.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f9285l.k(next) && collection.contains(next)) {
                it.remove();
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f9284k.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f9285l.k(next) && !collection.contains(next)) {
                it.remove();
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f9284k.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f9285l.k(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        C1222kv c1222kv = (C1222kv) it;
        while (c1222kv.hasNext()) {
            arrayList.add(c1222kv.next());
        }
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        C1222kv c1222kv = (C1222kv) it;
        while (c1222kv.hasNext()) {
            arrayList.add(c1222kv.next());
        }
        return arrayList.toArray(objArr);
    }
}
