package com.google.common.collect;

import android.R;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.common.collect.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C0966n<E> extends AbstractCollection<E> {
    public final Collection<E> a;
    public final com.google.common.base.l<? super E> b;

    public C0966n(Collection<E> collection, com.google.common.base.l<? super E> lVar) {
        this.a = collection;
        this.b = lVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e) {
        com.google.common.base.k.c(this.b.apply(e));
        return this.a.add(e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            com.google.common.base.k.c(this.b.apply(it.next()));
        }
        return this.a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        Collection<E> collection = this.a;
        boolean z = collection instanceof RandomAccess;
        com.google.common.base.l<? super E> lVar = this.b;
        if (!z || !(collection instanceof List)) {
            Iterator<T> it = collection.iterator();
            lVar.getClass();
            while (it.hasNext()) {
                if (lVar.apply((Object) it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) collection;
        lVar.getClass();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            R.array arrayVar = (Object) list.get(i2);
            if (!lVar.apply(arrayVar)) {
                if (i2 > i) {
                    try {
                        list.set(i, arrayVar);
                    } catch (IllegalArgumentException unused) {
                        N.d(list, lVar, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        N.d(list, lVar, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        boolean z;
        Collection<E> collection = this.a;
        collection.getClass();
        try {
            z = collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z = false;
        }
        if (z) {
            return this.b.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        Iterator<T> it = this.a.iterator();
        com.google.common.base.l<? super E> lVar = this.b;
        com.google.common.base.k.f(lVar, "predicate");
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (lVar.apply((Object) it.next())) {
                break;
            }
            i++;
        }
        return true ^ (i != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it = this.a.iterator();
        it.getClass();
        com.google.common.base.l<? super E> lVar = this.b;
        lVar.getClass();
        return new O(it, lVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<E> it = this.a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.b.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        Iterator<E> it = this.a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.b.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator<E> it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.b.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        Iterator<E> it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            AbstractC0954b abstractC0954b = (AbstractC0954b) it;
            if (!abstractC0954b.hasNext()) {
                return arrayList.toArray();
            }
            arrayList.add(abstractC0954b.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        Iterator<E> it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            AbstractC0954b abstractC0954b = (AbstractC0954b) it;
            if (abstractC0954b.hasNext()) {
                arrayList.add(abstractC0954b.next());
            } else {
                return (T[]) arrayList.toArray(tArr);
            }
        }
    }
}
