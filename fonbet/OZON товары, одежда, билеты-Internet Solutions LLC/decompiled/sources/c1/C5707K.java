package c1;

import S0.B0;
import gd.InterfaceC6712a;
import gd.InterfaceC6714c;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.Q;
import kotlin.jvm.internal.C7728j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: c1.K, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5707K<T> implements List<T>, InterfaceC6714c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final u<T> f56192a;

    /* renamed from: b, reason: collision with root package name */
    private final int f56193b;

    /* renamed from: c, reason: collision with root package name */
    private int f56194c;

    /* renamed from: d, reason: collision with root package name */
    private int f56195d;

    /* renamed from: c1.K$a */
    public static final class a implements ListIterator<T>, InterfaceC6712a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.K f56196a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5707K<T> f56197b;

        a(kotlin.jvm.internal.K k11, C5707K<T> c5707k) {
            this.f56196a = k11;
            this.f56197b = c5707k;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f56196a.f71785a < this.f56197b.size() - 1;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f56196a.f71785a >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            kotlin.jvm.internal.K k11 = this.f56196a;
            int i11 = k11.f71785a + 1;
            C5707K<T> c5707k = this.f56197b;
            v.b(i11, c5707k.size());
            k11.f71785a = i11;
            return c5707k.get(i11);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f56196a.f71785a + 1;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            kotlin.jvm.internal.K k11 = this.f56196a;
            int i11 = k11.f71785a;
            C5707K<T> c5707k = this.f56197b;
            v.b(i11, c5707k.size());
            k11.f71785a = i11 - 1;
            return c5707k.get(i11);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f56196a.f71785a;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public C5707K(@NotNull u<T> uVar, int i11, int i12) {
        this.f56192a = uVar;
        this.f56193b = i11;
        this.f56194c = uVar.e();
        this.f56195d = i12 - i11;
    }

    private final void b() {
        if (this.f56192a.e() != this.f56194c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t2) {
        b();
        int i11 = this.f56193b + this.f56195d;
        u<T> uVar = this.f56192a;
        uVar.add(i11, t2);
        this.f56195d++;
        this.f56194c = uVar.e();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(@NotNull Collection<? extends T> collection) {
        return addAll(this.f56195d, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f56195d > 0) {
            b();
            int i11 = this.f56195d;
            int i12 = this.f56193b;
            u<T> uVar = this.f56192a;
            uVar.i(i12, i11 + i12);
            this.f56195d = 0;
            this.f56194c = uVar.e();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(@NotNull Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final T get(int i11) {
        b();
        v.b(i11, this.f56195d);
        return this.f56192a.get(this.f56193b + i11);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        int i11 = this.f56195d;
        int i12 = this.f56193b;
        Iterator<Integer> it = kotlin.ranges.h.o(i12, i11 + i12).iterator();
        while (it.hasNext()) {
            int b11 = ((Q) it).b();
            if (Intrinsics.d(obj, this.f56192a.get(b11))) {
                return b11 - i12;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f56195d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        int i11 = this.f56195d;
        int i12 = this.f56193b;
        for (int i13 = (i11 + i12) - 1; i13 >= i12; i13--) {
            if (Intrinsics.d(obj, this.f56192a.get(i13))) {
                return i13 - i12;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @NotNull
    public final ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(@NotNull Collection<? extends Object> collection) {
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z11 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z11) {
                    z11 = true;
                }
            }
            return z11;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(@NotNull Collection<? extends Object> collection) {
        b();
        int i11 = this.f56195d;
        int i12 = this.f56193b;
        u<T> uVar = this.f56192a;
        int l11 = uVar.l(i12, collection, i11 + i12);
        if (l11 > 0) {
            this.f56194c = uVar.e();
            this.f56195d -= l11;
        }
        return l11 > 0;
    }

    @Override // java.util.List
    public final T set(int i11, T t2) {
        v.b(i11, this.f56195d);
        b();
        int i12 = i11 + this.f56193b;
        u<T> uVar = this.f56192a;
        T t11 = uVar.set(i12, t2);
        this.f56194c = uVar.e();
        return t11;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f56195d;
    }

    @Override // java.util.List
    @NotNull
    public final List<T> subList(int i11, int i12) {
        if (!(i11 >= 0 && i11 <= i12 && i12 <= this.f56195d)) {
            B0.a("fromIndex or toIndex are out of bounds");
            throw null;
        }
        b();
        int i13 = this.f56193b;
        return new C5707K(this.f56192a, i11 + i13, i12 + i13);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return C7728j.a(this);
    }

    @Override // java.util.List
    @NotNull
    public final ListIterator<T> listIterator(int i11) {
        b();
        kotlin.jvm.internal.K k11 = new kotlin.jvm.internal.K();
        k11.f71785a = i11 - 1;
        return new a(k11, this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C7728j.b(this, tArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i11, @NotNull Collection<? extends T> collection) {
        b();
        int i12 = i11 + this.f56193b;
        u<T> uVar = this.f56192a;
        boolean addAll = uVar.addAll(i12, collection);
        if (addAll) {
            this.f56195d = collection.size() + this.f56195d;
            this.f56194c = uVar.e();
        }
        return addAll;
    }

    @Override // java.util.List
    public final T remove(int i11) {
        b();
        int i12 = this.f56193b + i11;
        u<T> uVar = this.f56192a;
        T remove = uVar.remove(i12);
        this.f56195d--;
        this.f56194c = uVar.e();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i11, T t2) {
        b();
        int i12 = this.f56193b + i11;
        u<T> uVar = this.f56192a;
        uVar.add(i12, t2);
        this.f56195d++;
        this.f56194c = uVar.e();
    }
}
