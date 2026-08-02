package D1;

import Bl0.C2646g;
import androidx.compose.ui.e;
import gd.InterfaceC6712a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7728j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: D1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2822w implements List<e.c>, InterfaceC6712a {

    /* renamed from: d, reason: collision with root package name */
    private int f5561d;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private Object[] f5558a = new Object[16];

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private long[] f5559b = new long[16];

    /* renamed from: c, reason: collision with root package name */
    private int f5560c = -1;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5562e = true;

    /* renamed from: D1.w$b */
    /* loaded from: classes8.dex */
    private final class b implements List<e.c>, InterfaceC6712a {

        /* renamed from: a, reason: collision with root package name */
        private final int f5567a;

        /* renamed from: b, reason: collision with root package name */
        private final int f5568b;

        public b(int i11, int i12) {
            this.f5567a = i11;
            this.f5568b = i12;
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ void add(int i11, e.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final boolean addAll(int i11, Collection<? extends e.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return (obj instanceof e.c) && indexOf((e.c) obj) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(@NotNull Collection<? extends Object> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains((e.c) it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final e.c get(int i11) {
            Object obj = C2822w.this.f5558a[i11 + this.f5567a];
            Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (e.c) obj;
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof e.c)) {
                return -1;
            }
            e.c cVar = (e.c) obj;
            int i11 = this.f5567a;
            int i12 = this.f5568b;
            if (i11 <= i12) {
                int i13 = i11;
                while (!Intrinsics.d(C2822w.this.f5558a[i13], cVar)) {
                    if (i13 != i12) {
                        i13++;
                    }
                }
                return i13 - i11;
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @NotNull
        public final Iterator<e.c> iterator() {
            int i11 = this.f5567a;
            return C2822w.this.new a(i11, i11, this.f5568b);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof e.c)) {
                return -1;
            }
            e.c cVar = (e.c) obj;
            int i11 = this.f5568b;
            int i12 = this.f5567a;
            if (i12 <= i11) {
                while (!Intrinsics.d(C2822w.this.f5558a[i11], cVar)) {
                    if (i11 != i12) {
                        i11--;
                    }
                }
                return i11 - i12;
            }
            return -1;
        }

        @Override // java.util.List
        @NotNull
        public final ListIterator<e.c> listIterator() {
            int i11 = this.f5567a;
            return C2822w.this.new a(i11, i11, this.f5568b);
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ e.c remove(int i11) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final void replaceAll(UnaryOperator<e.c> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ e.c set(int i11, e.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f5568b - this.f5567a;
        }

        @Override // java.util.List
        public final void sort(Comparator<? super e.c> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        @NotNull
        public final List<e.c> subList(int i11, int i12) {
            int i13 = this.f5567a;
            return C2822w.this.new b(i11 + i13, i13 + i12);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return C7728j.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends e.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        @NotNull
        public final ListIterator<e.c> listIterator(int i11) {
            int i12 = this.f5567a;
            int i13 = this.f5568b;
            return C2822w.this.new a(i11 + i12, i12, i13);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) C7728j.b(this, tArr);
        }
    }

    private final long i() {
        long c11 = C2646g.c(Float.POSITIVE_INFINITY, false);
        int i11 = this.f5560c + 1;
        int P11 = C7714v.P(this);
        if (i11 <= P11) {
            while (true) {
                long j11 = this.f5559b[i11];
                if (C2818s.a(j11, c11) < 0) {
                    c11 = j11;
                }
                if (Float.intBitsToFloat((int) (c11 >> 32)) < 0.0f && ((int) (4294967295L & c11)) != 0) {
                    return c11;
                }
                if (i11 == P11) {
                    break;
                }
                i11++;
            }
        }
        return c11;
    }

    private final void r() {
        int i11 = this.f5560c + 1;
        int P11 = C7714v.P(this);
        if (i11 <= P11) {
            while (true) {
                this.f5558a[i11] = null;
                if (i11 == P11) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.f5561d = this.f5560c + 1;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i11, e.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i11, Collection<? extends e.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b() {
        this.f5560c = this.f5561d - 1;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f5560c = -1;
        r();
        this.f5562e = true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof e.c) && indexOf((e.c) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(@NotNull Collection<? extends Object> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((e.c) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof e.c)) {
            return -1;
        }
        e.c cVar = (e.c) obj;
        int P11 = C7714v.P(this);
        if (P11 >= 0) {
            int i11 = 0;
            while (!Intrinsics.d(this.f5558a[i11], cVar)) {
                if (i11 != P11) {
                    i11++;
                }
            }
            return i11;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f5561d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator<e.c> iterator() {
        return new a(this, 0, 7);
    }

    @Override // java.util.List
    @NotNull
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final e.c get(int i11) {
        Object obj = this.f5558a[i11];
        Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (e.c) obj;
    }

    public final boolean l() {
        return this.f5562e;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof e.c)) {
            return -1;
        }
        e.c cVar = (e.c) obj;
        for (int P11 = C7714v.P(this); -1 < P11; P11--) {
            if (Intrinsics.d(this.f5558a[P11], cVar)) {
                return P11;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @NotNull
    public final ListIterator<e.c> listIterator() {
        return new a(this, 0, 7);
    }

    public final boolean m() {
        long i11 = i();
        return Float.intBitsToFloat((int) (i11 >> 32)) < 0.0f && ((int) (i11 & 4294967295L)) != 0;
    }

    public final void n(@NotNull e.c cVar, boolean z11, @NotNull Function0<Unit> function0) {
        o(cVar, -1.0f, z11, function0);
        AbstractC2810k0 coordinator$ui_release = cVar.getCoordinator$ui_release();
        if (coordinator$ui_release == null || coordinator$ui_release.F2()) {
            return;
        }
        this.f5562e = false;
    }

    public final void o(@NotNull e.c cVar, float f7, boolean z11, @NotNull Function0<Unit> function0) {
        int i11 = this.f5560c;
        int i12 = i11 + 1;
        this.f5560c = i12;
        Object[] objArr = this.f5558a;
        if (i12 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f5558a = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.f5559b, length);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f5559b = copyOf2;
        }
        Object[] objArr2 = this.f5558a;
        int i13 = this.f5560c;
        objArr2[i13] = cVar;
        this.f5559b[i13] = C2646g.c(f7, z11);
        r();
        function0.invoke();
        this.f5560c = i11;
    }

    public final boolean q(float f7, boolean z11) {
        if (this.f5560c == C7714v.P(this)) {
            return true;
        }
        return C2818s.a(i(), C2646g.c(f7, z11)) > 0;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ e.c remove(int i11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<e.c> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void s(@NotNull e.c cVar, float f7, boolean z11, @NotNull Function0<Unit> function0) {
        if (this.f5560c == C7714v.P(this)) {
            o(cVar, f7, z11, function0);
            if (this.f5560c + 1 == C7714v.P(this)) {
                r();
                return;
            }
            return;
        }
        long i11 = i();
        int i12 = this.f5560c;
        this.f5560c = C7714v.P(this);
        o(cVar, f7, z11, function0);
        if (this.f5560c + 1 < C7714v.P(this) && C2818s.a(i11, i()) > 0) {
            int i13 = this.f5560c + 1;
            int i14 = i12 + 1;
            Object[] objArr = this.f5558a;
            C7705l.r(objArr, i14, objArr, i13, this.f5561d);
            long[] destination = this.f5559b;
            int i15 = this.f5561d;
            Intrinsics.checkNotNullParameter(destination, "<this>");
            Intrinsics.checkNotNullParameter(destination, "destination");
            System.arraycopy(destination, i13, destination, i14, i15 - i13);
            this.f5560c = ((this.f5561d + i12) - this.f5560c) - 1;
        }
        r();
        this.f5560c = i12;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ e.c set(int i11, e.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f5561d;
    }

    @Override // java.util.List
    public final void sort(Comparator<? super e.c> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public final List<e.c> subList(int i11, int i12) {
        return new b(i11, i12);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return C7728j.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends e.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public final ListIterator<e.c> listIterator(int i11) {
        return new a(this, i11, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C7728j.b(this, tArr);
    }

    /* renamed from: D1.w$a */
    /* loaded from: classes8.dex */
    private final class a implements ListIterator<e.c>, InterfaceC6712a {

        /* renamed from: a, reason: collision with root package name */
        private int f5563a;

        /* renamed from: b, reason: collision with root package name */
        private final int f5564b;

        /* renamed from: c, reason: collision with root package name */
        private final int f5565c;

        public a(int i11, int i12, int i13) {
            this.f5563a = i11;
            this.f5564b = i12;
            this.f5565c = i13;
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ void add(e.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f5563a < this.f5565c;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f5563a > this.f5564b;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            Object[] objArr = C2822w.this.f5558a;
            int i11 = this.f5563a;
            this.f5563a = i11 + 1;
            Object obj = objArr[i11];
            Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (e.c) obj;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f5563a - this.f5564b;
        }

        @Override // java.util.ListIterator
        public final e.c previous() {
            Object[] objArr = C2822w.this.f5558a;
            int i11 = this.f5563a - 1;
            this.f5563a = i11;
            Object obj = objArr[i11];
            Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (e.c) obj;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return (this.f5563a - this.f5564b) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ void set(e.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ a(C2822w c2822w, int i11, int i12) {
            this((i12 & 1) != 0 ? 0 : i11, 0, c2822w.size());
        }
    }
}
