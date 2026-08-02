package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class S {

    public static class a<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        public final List<F> a;
        public final com.google.common.base.f<? super F, ? extends T> b;

        /* renamed from: com.google.common.collect.S$a$a, reason: collision with other inner class name */
        public class C0132a extends w0<F, T> {
            public C0132a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // com.google.common.collect.v0
            public final T a(F f) {
                return a.this.b.apply(f);
            }
        }

        public a(List<F> list, com.google.common.base.f<? super F, ? extends T> fVar) {
            list.getClass();
            this.a = list;
            this.b = fVar;
        }

        @Override // java.util.AbstractList, java.util.List
        public final T get(int i) {
            return this.b.apply(this.a.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new C0132a(this.a.listIterator(i));
        }

        @Override // java.util.AbstractList, java.util.List
        public final T remove(int i) {
            return this.b.apply(this.a.remove(i));
        }

        @Override // java.util.AbstractList
        public final void removeRange(int i, int i2) {
            this.a.subList(i, i2).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.a.size();
        }
    }

    public static class b<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;
        public final List<F> a;
        public final com.google.common.base.f<? super F, ? extends T> b;

        public class a extends w0<F, T> {
            public a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // com.google.common.collect.v0
            public final T a(F f) {
                return b.this.b.apply(f);
            }
        }

        public b(List<F> list, com.google.common.base.f<? super F, ? extends T> fVar) {
            list.getClass();
            this.a = list;
            this.b = fVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new a(this.a.listIterator(i));
        }

        @Override // java.util.AbstractList
        public final void removeRange(int i, int i2) {
            this.a.subList(i, i2).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.a.size();
        }
    }

    @SafeVarargs
    public static <E> ArrayList<E> a(E... eArr) {
        int length = eArr.length;
        C0965m.b(length, "arraySize");
        ArrayList<E> arrayList = new ArrayList<>(com.google.common.primitives.c.f(length + 5 + (length / 10)));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    public static AbstractList b(List list, com.google.common.base.f fVar) {
        return list instanceof RandomAccess ? new a(list, fVar) : new b(list, fVar);
    }
}
