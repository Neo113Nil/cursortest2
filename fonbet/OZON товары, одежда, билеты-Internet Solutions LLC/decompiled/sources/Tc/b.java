package Tc;

import gd.InterfaceC6712a;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractC7696c;
import kotlin.collections.AbstractC7699f;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0002\u000b\fJ\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"LTc/b;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/f;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "a", "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b<E> extends AbstractC7699f<E> implements List<E>, RandomAccess, Serializable {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final b f26993d;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private E[] f26994a;

    /* renamed from: b, reason: collision with root package name */
    private int f26995b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f26996c;

    /* loaded from: classes10.dex */
    public static final class a<E> extends AbstractC7699f<E> implements RandomAccess, Serializable {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private E[] f26997a;

        /* renamed from: b, reason: collision with root package name */
        private final int f26998b;

        /* renamed from: c, reason: collision with root package name */
        private int f26999c;

        /* renamed from: d, reason: collision with root package name */
        private final a<E> f27000d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final b<E> f27001e;

        /* renamed from: Tc.b$a$a, reason: collision with other inner class name */
        private static final class C0539a<E> implements ListIterator<E>, InterfaceC6712a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final a<E> f27002a;

            /* renamed from: b, reason: collision with root package name */
            private int f27003b;

            /* renamed from: c, reason: collision with root package name */
            private int f27004c;

            /* renamed from: d, reason: collision with root package name */
            private int f27005d;

            public C0539a(@NotNull a<E> list, int i11) {
                Intrinsics.checkNotNullParameter(list, "list");
                this.f27002a = list;
                this.f27003b = i11;
                this.f27004c = -1;
                this.f27005d = ((AbstractList) list).modCount;
            }

            private final void b() {
                if (((AbstractList) ((a) this.f27002a).f27001e).modCount != this.f27005d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public final void add(E e11) {
                b();
                int i11 = this.f27003b;
                this.f27003b = i11 + 1;
                a<E> aVar = this.f27002a;
                aVar.add(i11, e11);
                this.f27004c = -1;
                this.f27005d = ((AbstractList) aVar).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.f27003b < ((a) this.f27002a).f26999c;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.f27003b > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final E next() {
                b();
                int i11 = this.f27003b;
                a<E> aVar = this.f27002a;
                if (i11 >= ((a) aVar).f26999c) {
                    throw new NoSuchElementException();
                }
                int i12 = this.f27003b;
                this.f27003b = i12 + 1;
                this.f27004c = i12;
                return (E) ((a) aVar).f26997a[((a) aVar).f26998b + this.f27004c];
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.f27003b;
            }

            @Override // java.util.ListIterator
            public final E previous() {
                b();
                int i11 = this.f27003b;
                if (i11 <= 0) {
                    throw new NoSuchElementException();
                }
                int i12 = i11 - 1;
                this.f27003b = i12;
                this.f27004c = i12;
                a<E> aVar = this.f27002a;
                return (E) ((a) aVar).f26997a[((a) aVar).f26998b + this.f27004c];
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return this.f27003b - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                b();
                int i11 = this.f27004c;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                a<E> aVar = this.f27002a;
                aVar.b(i11);
                this.f27003b = this.f27004c;
                this.f27004c = -1;
                this.f27005d = ((AbstractList) aVar).modCount;
            }

            @Override // java.util.ListIterator
            public final void set(E e11) {
                b();
                int i11 = this.f27004c;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.f27002a.set(i11, e11);
            }
        }

        public a(@NotNull E[] backing, int i11, int i12, a<E> aVar, @NotNull b<E> root) {
            Intrinsics.checkNotNullParameter(backing, "backing");
            Intrinsics.checkNotNullParameter(root, "root");
            this.f26997a = backing;
            this.f26998b = i11;
            this.f26999c = i12;
            this.f27000d = aVar;
            this.f27001e = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final E A(int i11) {
            ((AbstractList) this).modCount++;
            a<E> aVar = this.f27000d;
            this.f26999c--;
            return aVar != null ? aVar.A(i11) : (E) this.f27001e.E(i11);
        }

        private final void B(int i11, int i12) {
            if (i12 > 0) {
                ((AbstractList) this).modCount++;
            }
            a<E> aVar = this.f27000d;
            if (aVar != null) {
                aVar.B(i11, i12);
            } else {
                this.f27001e.F(i11, i12);
            }
            this.f26999c -= i12;
        }

        private final int C(int i11, int i12, Collection<? extends E> collection, boolean z11) {
            a<E> aVar = this.f27000d;
            int C11 = aVar != null ? aVar.C(i11, i12, collection, z11) : this.f27001e.G(i11, i12, collection, z11);
            if (C11 > 0) {
                ((AbstractList) this).modCount++;
            }
            this.f26999c -= C11;
            return C11;
        }

        private final void n(int i11, Collection<? extends E> collection, int i12) {
            ((AbstractList) this).modCount++;
            b<E> bVar = this.f27001e;
            a<E> aVar = this.f27000d;
            if (aVar != null) {
                aVar.n(i11, collection, i12);
            } else {
                bVar.A(i11, collection, i12);
            }
            this.f26997a = (E[]) ((b) bVar).f26994a;
            this.f26999c += i12;
        }

        private final void s(int i11, E e11) {
            ((AbstractList) this).modCount++;
            b<E> bVar = this.f27001e;
            a<E> aVar = this.f27000d;
            if (aVar != null) {
                aVar.s(i11, e11);
            } else {
                b.h(bVar, i11, e11);
            }
            this.f26997a = (E[]) ((b) bVar).f26994a;
            this.f26999c++;
        }

        private final void u() {
            if (((AbstractList) this.f27001e).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void v() {
            if (((b) this.f27001e).f26996c) {
                throw new UnsupportedOperationException();
            }
        }

        private final Object writeReplace() {
            if (((b) this.f27001e).f26996c) {
                return new h(0, this);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(E e11) {
            v();
            u();
            s(this.f26998b + this.f26999c, e11);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean addAll(@NotNull Collection<? extends E> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            v();
            u();
            int size = elements.size();
            n(this.f26998b + this.f26999c, elements, size);
            return size > 0;
        }

        @Override // kotlin.collections.AbstractC7699f
        public final E b(int i11) {
            v();
            u();
            AbstractC7696c.Companion companion = AbstractC7696c.INSTANCE;
            int i12 = this.f26999c;
            companion.getClass();
            AbstractC7696c.Companion.a(i11, i12);
            return A(this.f26998b + i11);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            v();
            u();
            B(this.f26998b, this.f26999c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            u();
            if (obj == this) {
                return true;
            }
            if (obj instanceof List) {
                return c.a(this.f26997a, this.f26998b, this.f26999c, (List) obj);
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final E get(int i11) {
            u();
            AbstractC7696c.Companion companion = AbstractC7696c.INSTANCE;
            int i12 = this.f26999c;
            companion.getClass();
            AbstractC7696c.Companion.a(i11, i12);
            return this.f26997a[this.f26998b + i11];
        }

        @Override // kotlin.collections.AbstractC7699f
        /* renamed from: getSize */
        public final int getF26995b() {
            u();
            return this.f26999c;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            u();
            E[] eArr = this.f26997a;
            int i11 = this.f26999c;
            int i12 = 1;
            for (int i13 = 0; i13 < i11; i13++) {
                E e11 = eArr[this.f26998b + i13];
                i12 = (i12 * 31) + (e11 != null ? e11.hashCode() : 0);
            }
            return i12;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            u();
            for (int i11 = 0; i11 < this.f26999c; i11++) {
                if (Intrinsics.d(this.f26997a[this.f26998b + i11], obj)) {
                    return i11;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            u();
            return this.f26999c == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        @NotNull
        public final Iterator<E> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            u();
            for (int i11 = this.f26999c - 1; i11 >= 0; i11--) {
                if (Intrinsics.d(this.f26997a[this.f26998b + i11], obj)) {
                    return i11;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public final ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean remove(Object obj) {
            v();
            u();
            int indexOf = indexOf(obj);
            if (indexOf >= 0) {
                b(indexOf);
            }
            return indexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean removeAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            v();
            u();
            return C(this.f26998b, this.f26999c, elements, false) > 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean retainAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            v();
            u();
            return C(this.f26998b, this.f26999c, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public final E set(int i11, E e11) {
            v();
            u();
            AbstractC7696c.Companion companion = AbstractC7696c.INSTANCE;
            int i12 = this.f26999c;
            companion.getClass();
            AbstractC7696c.Companion.a(i11, i12);
            E[] eArr = this.f26997a;
            int i13 = this.f26998b + i11;
            E e12 = eArr[i13];
            eArr[i13] = e11;
            return e12;
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public final List<E> subList(int i11, int i12) {
            AbstractC7696c.Companion companion = AbstractC7696c.INSTANCE;
            int i13 = this.f26999c;
            companion.getClass();
            AbstractC7696c.Companion.c(i11, i12, i13);
            return new a(this.f26997a, this.f26998b + i11, i12 - i11, this, this.f27001e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        @NotNull
        public final <T> T[] toArray(@NotNull T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            u();
            int length = array.length;
            int i11 = this.f26999c;
            int i12 = this.f26998b;
            if (length < i11) {
                T[] tArr = (T[]) Arrays.copyOfRange(this.f26997a, i12, i11 + i12, array.getClass());
                Intrinsics.checkNotNullExpressionValue(tArr, "copyOfRange(...)");
                return tArr;
            }
            C7705l.r(this.f26997a, 0, array, i12, i11 + i12);
            C7714v.M0(this.f26999c, array);
            return array;
        }

        @Override // java.util.AbstractCollection
        @NotNull
        public final String toString() {
            u();
            return c.b(this.f26997a, this.f26998b, this.f26999c, this);
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public final ListIterator<E> listIterator(int i11) {
            u();
            AbstractC7696c.Companion companion = AbstractC7696c.INSTANCE;
            int i12 = this.f26999c;
            companion.getClass();
            AbstractC7696c.Companion.b(i11, i12);
            return new C0539a(this, i11);
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i11, E e11) {
            v();
            u();
            AbstractC7696c.Companion companion = AbstractC7696c.INSTANCE;
            int i12 = this.f26999c;
            companion.getClass();
            AbstractC7696c.Companion.b(i11, i12);
            s(this.f26998b + i11, e11);
        }

        @Override // java.util.AbstractList, java.util.List
        public final boolean addAll(int i11, @NotNull Collection<? extends E> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            v();
            u();
            AbstractC7696c.Companion companion = AbstractC7696c.INSTANCE;
            int i12 = this.f26999c;
            companion.getClass();
            AbstractC7696c.Companion.b(i11, i12);
            int size = elements.size();
            n(this.f26998b + i11, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        @NotNull
        public final Object[] toArray() {
            u();
            E[] eArr = this.f26997a;
            int i11 = this.f26999c;
            int i12 = this.f26998b;
            return C7705l.w(i12, i11 + i12, eArr);
        }
    }

    /* renamed from: Tc.b$b, reason: collision with other inner class name */
    private static final class C0540b<E> implements ListIterator<E>, InterfaceC6712a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final b<E> f27006a;

        /* renamed from: b, reason: collision with root package name */
        private int f27007b;

        /* renamed from: c, reason: collision with root package name */
        private int f27008c;

        /* renamed from: d, reason: collision with root package name */
        private int f27009d;

        public C0540b(@NotNull b<E> list, int i11) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f27006a = list;
            this.f27007b = i11;
            this.f27008c = -1;
            this.f27009d = ((AbstractList) list).modCount;
        }

        private final void b() {
            if (((AbstractList) this.f27006a).modCount != this.f27009d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public final void add(E e11) {
            b();
            int i11 = this.f27007b;
            this.f27007b = i11 + 1;
            b<E> bVar = this.f27006a;
            bVar.add(i11, e11);
            this.f27008c = -1;
            this.f27009d = ((AbstractList) bVar).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f27007b < ((b) this.f27006a).f26995b;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f27007b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final E next() {
            b();
            int i11 = this.f27007b;
            b<E> bVar = this.f27006a;
            if (i11 >= ((b) bVar).f26995b) {
                throw new NoSuchElementException();
            }
            int i12 = this.f27007b;
            this.f27007b = i12 + 1;
            this.f27008c = i12;
            return (E) ((b) bVar).f26994a[this.f27008c];
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f27007b;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            b();
            int i11 = this.f27007b;
            if (i11 <= 0) {
                throw new NoSuchElementException();
            }
            int i12 = i11 - 1;
            this.f27007b = i12;
            this.f27008c = i12;
            return (E) ((b) this.f27006a).f26994a[this.f27008c];
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f27007b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            b();
            int i11 = this.f27008c;
            if (i11 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            b<E> bVar = this.f27006a;
            bVar.b(i11);
            this.f27007b = this.f27008c;
            this.f27008c = -1;
            this.f27009d = ((AbstractList) bVar).modCount;
        }

        @Override // java.util.ListIterator
        public final void set(E e11) {
            b();
            int i11 = this.f27008c;
            if (i11 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.f27006a.set(i11, e11);
        }
    }

    static {
        b bVar = new b(0);
        bVar.f26996c = true;
        f26993d = bVar;
    }

    public b() {
        this((Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(int i11, Collection<? extends E> collection, int i12) {
        ((AbstractList) this).modCount++;
        D(i11, i12);
        Iterator<? extends E> it = collection.iterator();
        for (int i13 = 0; i13 < i12; i13++) {
            this.f26994a[i11 + i13] = it.next();
        }
    }

    private final void C() {
        if (this.f26996c) {
            throw new UnsupportedOperationException();
        }
    }

    private final void D(int i11, int i12) {
        int i13 = this.f26995b + i12;
        if (i13 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.f26994a;
        if (i13 > eArr.length) {
            AbstractC7696c.Companion companion = AbstractC7696c.INSTANCE;
            int length = eArr.length;
            companion.getClass();
            int d11 = AbstractC7696c.Companion.d(length, i13);
            E[] eArr2 = this.f26994a;
            Intrinsics.checkNotNullParameter(eArr2, "<this>");
            E[] eArr3 = (E[]) Arrays.copyOf(eArr2, d11);
            Intrinsics.checkNotNullExpressionValue(eArr3, "copyOf(...)");
            this.f26994a = eArr3;
        }
        E[] eArr4 = this.f26994a;
        C7705l.r(eArr4, i11 + i12, eArr4, i11, this.f26995b);
        this.f26995b += i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E E(int i11) {
        ((AbstractList) this).modCount++;
        E[] eArr = this.f26994a;
        E e11 = eArr[i11];
        C7705l.r(eArr, i11, eArr, i11 + 1, this.f26995b);
        E[] eArr2 = this.f26994a;
        int i12 = this.f26995b - 1;
        Intrinsics.checkNotNullParameter(eArr2, "<this>");
        eArr2[i12] = null;
        this.f26995b--;
        return e11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(int i11, int i12) {
        if (i12 > 0) {
            ((AbstractList) this).modCount++;
        }
        E[] eArr = this.f26994a;
        C7705l.r(eArr, i11, eArr, i11 + i12, this.f26995b);
        E[] eArr2 = this.f26994a;
        int i13 = this.f26995b;
        c.c(i13 - i12, i13, eArr2);
        this.f26995b -= i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int G(int i11, int i12, Collection<? extends E> collection, boolean z11) {
        int i13 = 0;
        int i14 = 0;
        while (i13 < i12) {
            int i15 = i11 + i13;
            if (collection.contains(this.f26994a[i15]) == z11) {
                E[] eArr = this.f26994a;
                i13++;
                eArr[i14 + i11] = eArr[i15];
                i14++;
            } else {
                i13++;
            }
        }
        int i16 = i12 - i14;
        E[] eArr2 = this.f26994a;
        C7705l.r(eArr2, i11 + i14, eArr2, i12 + i11, this.f26995b);
        E[] eArr3 = this.f26994a;
        int i17 = this.f26995b;
        c.c(i17 - i16, i17, eArr3);
        if (i16 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f26995b -= i16;
        return i16;
    }

    public static final void h(b bVar, int i11, Object obj) {
        ((AbstractList) bVar).modCount++;
        bVar.D(i11, 1);
        ((E[]) bVar.f26994a)[i11] = obj;
    }

    private final Object writeReplace() {
        if (this.f26996c) {
            return new h(0, this);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @NotNull
    public final b B() {
        C();
        this.f26996c = true;
        return this.f26995b > 0 ? this : f26993d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e11) {
        C();
        int i11 = this.f26995b;
        ((AbstractList) this).modCount++;
        D(i11, 1);
        this.f26994a[i11] = e11;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        C();
        int size = elements.size();
        A(this.f26995b, elements, size);
        return size > 0;
    }

    @Override // kotlin.collections.AbstractC7699f
    public final E b(int i11) {
        C();
        AbstractC7696c.Companion companion = AbstractC7696c.INSTANCE;
        int i12 = this.f26995b;
        companion.getClass();
        AbstractC7696c.Companion.a(i11, i12);
        return E(i11);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        C();
        F(0, this.f26995b);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (c.a(this.f26994a, 0, this.f26995b, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i11) {
        AbstractC7696c.Companion companion = AbstractC7696c.INSTANCE;
        int i12 = this.f26995b;
        companion.getClass();
        AbstractC7696c.Companion.a(i11, i12);
        return this.f26994a[i11];
    }

    @Override // kotlin.collections.AbstractC7699f
    /* renamed from: getSize, reason: from getter */
    public final int getF26995b() {
        return this.f26995b;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        E[] eArr = this.f26994a;
        int i11 = this.f26995b;
        int i12 = 1;
        for (int i13 = 0; i13 < i11; i13++) {
            E e11 = eArr[i13];
            i12 = (i12 * 31) + (e11 != null ? e11.hashCode() : 0);
        }
        return i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i11 = 0; i11 < this.f26995b; i11++) {
            if (Intrinsics.d(this.f26994a[i11], obj)) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f26995b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i11 = this.f26995b - 1; i11 >= 0; i11--) {
            if (Intrinsics.d(this.f26994a[i11], obj)) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        C();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            b(indexOf);
        }
        return indexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        C();
        return G(0, this.f26995b, elements, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        C();
        return G(0, this.f26995b, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i11, E e11) {
        C();
        AbstractC7696c.Companion companion = AbstractC7696c.INSTANCE;
        int i12 = this.f26995b;
        companion.getClass();
        AbstractC7696c.Companion.a(i11, i12);
        E[] eArr = this.f26994a;
        E e12 = eArr[i11];
        eArr[i11] = e11;
        return e12;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public final List<E> subList(int i11, int i12) {
        AbstractC7696c.Companion companion = AbstractC7696c.INSTANCE;
        int i13 = this.f26995b;
        companion.getClass();
        AbstractC7696c.Companion.c(i11, i12, i13);
        return new a(this.f26994a, i11, i12 - i11, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public final <T> T[] toArray(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i11 = this.f26995b;
        if (length < i11) {
            T[] tArr = (T[]) Arrays.copyOfRange(this.f26994a, 0, i11, array.getClass());
            Intrinsics.checkNotNullExpressionValue(tArr, "copyOfRange(...)");
            return tArr;
        }
        C7705l.r(this.f26994a, 0, array, 0, i11);
        C7714v.M0(this.f26995b, array);
        return array;
    }

    @Override // java.util.AbstractCollection
    @NotNull
    public final String toString() {
        return c.b(this.f26994a, 0, this.f26995b, this);
    }

    public /* synthetic */ b(Object obj) {
        this(10);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public final ListIterator<E> listIterator(int i11) {
        AbstractC7696c.Companion companion = AbstractC7696c.INSTANCE;
        int i12 = this.f26995b;
        companion.getClass();
        AbstractC7696c.Companion.b(i11, i12);
        return new C0540b(this, i11);
    }

    public b(int i11) {
        if (i11 >= 0) {
            this.f26994a = (E[]) new Object[i11];
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i11, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        C();
        AbstractC7696c.Companion companion = AbstractC7696c.INSTANCE;
        int i12 = this.f26995b;
        companion.getClass();
        AbstractC7696c.Companion.b(i11, i12);
        int size = elements.size();
        A(i11, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public final Object[] toArray() {
        return C7705l.w(0, this.f26995b, this.f26994a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, E e11) {
        C();
        AbstractC7696c.Companion companion = AbstractC7696c.INSTANCE;
        int i12 = this.f26995b;
        companion.getClass();
        AbstractC7696c.Companion.b(i11, i12);
        ((AbstractList) this).modCount++;
        D(i11, 1);
        this.f26994a[i11] = e11;
    }
}
