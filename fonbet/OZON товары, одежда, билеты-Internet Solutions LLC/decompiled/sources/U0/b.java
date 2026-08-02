package U0;

import Bl0.j0;
import gd.InterfaceC6712a;
import gd.InterfaceC6714c;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.C7728j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b<T> implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private T[] f27242a;

    /* renamed from: b, reason: collision with root package name */
    private List<T> f27243b;

    /* renamed from: c, reason: collision with root package name */
    private int f27244c = 0;

    private static final class a<T> implements List<T>, InterfaceC6714c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final b<T> f27245a;

        public a(@NotNull b<T> bVar) {
            this.f27245a = bVar;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t2) {
            this.f27245a.b(t2);
            return true;
        }

        @Override // java.util.List
        public final boolean addAll(int i11, @NotNull Collection<? extends T> collection) {
            return this.f27245a.e(i11, collection);
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.f27245a.h();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.f27245a.i(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(@NotNull Collection<? extends Object> collection) {
            b<T> bVar = this.f27245a;
            bVar.getClass();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!bVar.i(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i11) {
            j0.a(i11, this);
            return this.f27245a.l()[i11];
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            return this.f27245a.n(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f27245a.o();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @NotNull
        public final Iterator<T> iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            return this.f27245a.r(obj);
        }

        @Override // java.util.List
        @NotNull
        public final ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.f27245a.s(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(@NotNull Collection<? extends Object> collection) {
            return this.f27245a.t(collection);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(@NotNull Collection<? extends Object> collection) {
            return this.f27245a.w(collection);
        }

        @Override // java.util.List
        public final T set(int i11, T t2) {
            j0.a(i11, this);
            return this.f27245a.x(i11, t2);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f27245a.m();
        }

        @Override // java.util.List
        @NotNull
        public final List<T> subList(int i11, int i12) {
            j0.b(i11, i12, this);
            return new C0550b(this, i11, i12);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return C7728j.a(this);
        }

        @Override // java.util.List
        public final void add(int i11, T t2) {
            this.f27245a.a(i11, t2);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(@NotNull Collection<? extends T> collection) {
            return this.f27245a.f(collection);
        }

        @Override // java.util.List
        @NotNull
        public final ListIterator<T> listIterator(int i11) {
            return new c(this, i11);
        }

        @Override // java.util.List
        public final T remove(int i11) {
            j0.a(i11, this);
            return this.f27245a.u(i11);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) C7728j.b(this, tArr);
        }
    }

    /* renamed from: U0.b$b, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    private static final class C0550b<T> implements List<T>, InterfaceC6714c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Object f27246a;

        /* renamed from: b, reason: collision with root package name */
        private final int f27247b;

        /* renamed from: c, reason: collision with root package name */
        private int f27248c;

        public C0550b(@NotNull List<T> list, int i11, int i12) {
            this.f27246a = list;
            this.f27247b = i11;
            this.f27248c = i12;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean add(T t2) {
            int i11 = this.f27248c;
            this.f27248c = i11 + 1;
            this.f27246a.add(i11, t2);
            return true;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final boolean addAll(int i11, @NotNull Collection<? extends T> collection) {
            this.f27246a.addAll(i11 + this.f27247b, collection);
            this.f27248c = collection.size() + this.f27248c;
            return collection.size() > 0;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i11 = this.f27248c - 1;
            int i12 = this.f27247b;
            if (i12 <= i11) {
                while (true) {
                    this.f27246a.remove(i11);
                    if (i11 == i12) {
                        break;
                    } else {
                        i11--;
                    }
                }
            }
            this.f27248c = i12;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            int i11 = this.f27248c;
            for (int i12 = this.f27247b; i12 < i11; i12++) {
                if (Intrinsics.d(this.f27246a.get(i12), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(@NotNull Collection<? extends Object> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final T get(int i11) {
            j0.a(i11, this);
            return (T) this.f27246a.get(i11 + this.f27247b);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i11 = this.f27248c;
            int i12 = this.f27247b;
            for (int i13 = i12; i13 < i11; i13++) {
                if (Intrinsics.d(this.f27246a.get(i13), obj)) {
                    return i13 - i12;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f27248c == this.f27247b;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @NotNull
        public final Iterator<T> iterator() {
            return new c(this, 0);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i11 = this.f27248c - 1;
            int i12 = this.f27247b;
            if (i12 > i11) {
                return -1;
            }
            while (!Intrinsics.d(this.f27246a.get(i11), obj)) {
                if (i11 == i12) {
                    return -1;
                }
                i11--;
            }
            return i11 - i12;
        }

        @Override // java.util.List
        @NotNull
        public final ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            int i11 = this.f27248c;
            for (int i12 = this.f27247b; i12 < i11; i12++) {
                ?? r22 = this.f27246a;
                if (Intrinsics.d(r22.get(i12), obj)) {
                    r22.remove(i12);
                    this.f27248c--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(@NotNull Collection<? extends Object> collection) {
            int i11 = this.f27248c;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i11 != this.f27248c;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(@NotNull Collection<? extends Object> collection) {
            int i11 = this.f27248c;
            int i12 = i11 - 1;
            int i13 = this.f27247b;
            if (i13 <= i12) {
                while (true) {
                    ?? r32 = this.f27246a;
                    if (!collection.contains(r32.get(i12))) {
                        r32.remove(i12);
                        this.f27248c--;
                    }
                    if (i12 == i13) {
                        break;
                    }
                    i12--;
                }
            }
            return i11 != this.f27248c;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final T set(int i11, T t2) {
            j0.a(i11, this);
            return (T) this.f27246a.set(i11 + this.f27247b, t2);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f27248c - this.f27247b;
        }

        @Override // java.util.List
        @NotNull
        public final List<T> subList(int i11, int i12) {
            j0.b(i11, i12, this);
            return new C0550b(this, i11, i12);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return C7728j.a(this);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final void add(int i11, T t2) {
            this.f27246a.add(i11 + this.f27247b, t2);
            this.f27248c++;
        }

        @Override // java.util.List
        @NotNull
        public final ListIterator<T> listIterator(int i11) {
            return new c(this, i11);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) C7728j.b(this, tArr);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean addAll(@NotNull Collection<? extends T> collection) {
            this.f27246a.addAll(this.f27248c, collection);
            this.f27248c = collection.size() + this.f27248c;
            return collection.size() > 0;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final T remove(int i11) {
            j0.a(i11, this);
            this.f27248c--;
            return (T) this.f27246a.remove(i11 + this.f27247b);
        }
    }

    private static final class c<T> implements ListIterator<T>, InterfaceC6712a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Object f27249a;

        /* renamed from: b, reason: collision with root package name */
        private int f27250b;

        public c(@NotNull List<T> list, int i11) {
            this.f27249a = list;
            this.f27250b = i11;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final void add(T t2) {
            this.f27249a.add(this.f27250b, t2);
            this.f27250b++;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f27250b < this.f27249a.size();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f27250b > 0;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            int i11 = this.f27250b;
            this.f27250b = i11 + 1;
            return (T) this.f27249a.get(i11);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f27250b;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final T previous() {
            int i11 = this.f27250b - 1;
            this.f27250b = i11;
            return (T) this.f27249a.get(i11);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f27250b - 1;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            int i11 = this.f27250b - 1;
            this.f27250b = i11;
            this.f27249a.remove(i11);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final void set(T t2) {
            this.f27249a.set(this.f27250b, t2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull Object[] objArr) {
        this.f27242a = objArr;
    }

    public final void a(int i11, T t2) {
        j(this.f27244c + 1);
        T[] tArr = this.f27242a;
        int i12 = this.f27244c;
        if (i11 != i12) {
            C7705l.r(tArr, i11 + 1, tArr, i11, i12);
        }
        tArr[i11] = t2;
        this.f27244c++;
    }

    public final void b(Object obj) {
        j(this.f27244c + 1);
        Object[] objArr = (T[]) this.f27242a;
        int i11 = this.f27244c;
        objArr[i11] = obj;
        this.f27244c = i11 + 1;
    }

    public final void c(int i11, @NotNull b bVar) {
        if (bVar.o()) {
            return;
        }
        j(this.f27244c + bVar.f27244c);
        T[] tArr = this.f27242a;
        int i12 = this.f27244c;
        if (i11 != i12) {
            C7705l.r(tArr, bVar.f27244c + i11, tArr, i11, i12);
        }
        C7705l.r(bVar.f27242a, i11, tArr, 0, bVar.f27244c);
        this.f27244c += bVar.f27244c;
    }

    public final void d(int i11, @NotNull List list) {
        if (list.isEmpty()) {
            return;
        }
        j(list.size() + this.f27244c);
        T[] tArr = this.f27242a;
        if (i11 != this.f27244c) {
            C7705l.r(tArr, list.size() + i11, tArr, i11, this.f27244c);
        }
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            tArr[i11 + i12] = list.get(i12);
        }
        this.f27244c = list.size() + this.f27244c;
    }

    public final boolean e(int i11, @NotNull Collection<? extends T> collection) {
        int i12 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        j(collection.size() + this.f27244c);
        T[] tArr = this.f27242a;
        if (i11 != this.f27244c) {
            C7705l.r(tArr, collection.size() + i11, tArr, i11, this.f27244c);
        }
        for (T t2 : collection) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            tArr[i12 + i11] = t2;
            i12 = i13;
        }
        this.f27244c = collection.size() + this.f27244c;
        return true;
    }

    public final boolean f(@NotNull Collection<? extends T> collection) {
        return e(this.f27244c, collection);
    }

    @NotNull
    public final List<T> g() {
        List<T> list = this.f27243b;
        if (list != null) {
            return list;
        }
        a aVar = new a(this);
        this.f27243b = aVar;
        return aVar;
    }

    public final void h() {
        T[] tArr = this.f27242a;
        int i11 = this.f27244c;
        while (true) {
            i11--;
            if (-1 >= i11) {
                this.f27244c = 0;
                return;
            }
            tArr[i11] = null;
        }
    }

    public final boolean i(T t2) {
        int i11 = this.f27244c - 1;
        if (i11 >= 0) {
            for (int i12 = 0; !Intrinsics.d(this.f27242a[i12], t2); i12++) {
                if (i12 != i11) {
                }
            }
            return true;
        }
        return false;
    }

    public final void j(int i11) {
        T[] tArr = this.f27242a;
        if (tArr.length < i11) {
            T[] tArr2 = (T[]) Arrays.copyOf(tArr, Math.max(i11, tArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(this, newSize)");
            this.f27242a = tArr2;
        }
    }

    public final T k() {
        if (o()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return this.f27242a[0];
    }

    @NotNull
    public final T[] l() {
        return this.f27242a;
    }

    public final int m() {
        return this.f27244c;
    }

    public final int n(T t2) {
        int i11 = this.f27244c;
        if (i11 <= 0) {
            return -1;
        }
        T[] tArr = this.f27242a;
        int i12 = 0;
        while (!Intrinsics.d(t2, tArr[i12])) {
            i12++;
            if (i12 >= i11) {
                return -1;
            }
        }
        return i12;
    }

    public final boolean o() {
        return this.f27244c == 0;
    }

    public final boolean p() {
        return this.f27244c != 0;
    }

    public final T q() {
        if (o()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return this.f27242a[this.f27244c - 1];
    }

    public final int r(T t2) {
        int i11 = this.f27244c;
        if (i11 <= 0) {
            return -1;
        }
        int i12 = i11 - 1;
        T[] tArr = this.f27242a;
        while (!Intrinsics.d(t2, tArr[i12])) {
            i12--;
            if (i12 < 0) {
                return -1;
            }
        }
        return i12;
    }

    public final boolean s(T t2) {
        int n11 = n(t2);
        if (n11 < 0) {
            return false;
        }
        u(n11);
        return true;
    }

    public final boolean t(@NotNull Collection<? extends T> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int i11 = this.f27244c;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            s(it.next());
        }
        return i11 != this.f27244c;
    }

    public final T u(int i11) {
        T[] tArr = this.f27242a;
        T t2 = tArr[i11];
        int i12 = this.f27244c;
        if (i11 != i12 - 1) {
            C7705l.r(tArr, i11, tArr, i11 + 1, i12);
        }
        int i13 = this.f27244c - 1;
        this.f27244c = i13;
        tArr[i13] = null;
        return t2;
    }

    public final void v(int i11, int i12) {
        if (i12 > i11) {
            int i13 = this.f27244c;
            if (i12 < i13) {
                T[] tArr = this.f27242a;
                C7705l.r(tArr, i11, tArr, i12, i13);
            }
            int i14 = this.f27244c;
            int i15 = i14 - (i12 - i11);
            int i16 = i14 - 1;
            if (i15 <= i16) {
                int i17 = i15;
                while (true) {
                    this.f27242a[i17] = null;
                    if (i17 == i16) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            this.f27244c = i15;
        }
    }

    public final boolean w(@NotNull Collection<? extends T> collection) {
        int i11 = this.f27244c;
        for (int i12 = i11 - 1; -1 < i12; i12--) {
            if (!collection.contains(this.f27242a[i12])) {
                u(i12);
            }
        }
        return i11 != this.f27244c;
    }

    public final T x(int i11, T t2) {
        T[] tArr = this.f27242a;
        T t11 = tArr[i11];
        tArr[i11] = t2;
        return t11;
    }

    public final void y(int i11) {
        this.f27244c = i11;
    }

    public final void z(@NotNull Comparator<T> comparator) {
        T[] tArr = this.f27242a;
        int i11 = this.f27244c;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Arrays.sort(tArr, 0, i11, comparator);
    }
}
