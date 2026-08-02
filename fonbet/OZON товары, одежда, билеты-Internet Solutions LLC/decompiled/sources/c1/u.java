package c1;

import S0.B0;
import S0.v1;
import gd.InterfaceC6714c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7728j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class u<T> implements InterfaceC5704H, List<T>, RandomAccess, InterfaceC6714c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private a f56270a;

    public static final class a<T> extends AbstractC5706J {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private V0.c<? extends T> f56271c;

        /* renamed from: d, reason: collision with root package name */
        private int f56272d;

        /* renamed from: e, reason: collision with root package name */
        private int f56273e;

        public a(@NotNull V0.c<? extends T> cVar) {
            this.f56271c = cVar;
        }

        @Override // c1.AbstractC5706J
        public final void a(@NotNull AbstractC5706J abstractC5706J) {
            Object obj;
            obj = v.f56277a;
            synchronized (obj) {
                Intrinsics.g(abstractC5706J, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
                this.f56271c = ((a) abstractC5706J).f56271c;
                this.f56272d = ((a) abstractC5706J).f56272d;
                this.f56273e = ((a) abstractC5706J).f56273e;
                Unit unit = Unit.f71690a;
            }
        }

        @Override // c1.AbstractC5706J
        @NotNull
        public final AbstractC5706J b() {
            return new a(this.f56271c);
        }

        @NotNull
        public final V0.c<T> g() {
            return this.f56271c;
        }

        public final int h() {
            return this.f56272d;
        }

        public final int i() {
            return this.f56273e;
        }

        public final void j(@NotNull V0.c<? extends T> cVar) {
            this.f56271c = cVar;
        }

        public final void k(int i11) {
            this.f56272d = i11;
        }

        public final void l(int i11) {
            this.f56273e = i11;
        }
    }

    /* loaded from: classes8.dex */
    static final class b extends AbstractC7737t implements Function1<List<T>, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f56274b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Collection<T> f56275c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(int i11, Collection<? extends T> collection) {
            super(1);
            this.f56274b = i11;
            this.f56275c = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(((List) obj).addAll(this.f56274b, this.f56275c));
        }
    }

    /* loaded from: classes8.dex */
    static final class c extends AbstractC7737t implements Function1<List<T>, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Collection<T> f56276b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Collection<? extends T> collection) {
            super(1);
            this.f56276b = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(((List) obj).retainAll(this.f56276b));
        }
    }

    public u() {
        W0.j jVar;
        v1 v1Var;
        jVar = W0.j.f33185c;
        a aVar = new a(jVar);
        v1Var = C5721l.f56251b;
        if (v1Var.a() != null) {
            a aVar2 = new a(jVar);
            aVar2.f(1);
            aVar.e(aVar2);
        }
        this.f56270a = aVar;
    }

    private final boolean h(Function1<? super List<T>, Boolean> function1) {
        Object obj;
        int h11;
        V0.c<T> g10;
        Boolean invoke;
        AbstractC5715f C11;
        Object obj2;
        boolean z11;
        do {
            obj = v.f56277a;
            synchronized (obj) {
                a aVar = this.f56270a;
                Intrinsics.g(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) C5721l.A(aVar);
                h11 = aVar2.h();
                g10 = aVar2.g();
                Unit unit = Unit.f71690a;
            }
            Intrinsics.f(g10);
            W0.f d11 = g10.d();
            invoke = function1.invoke(d11);
            V0.c<? extends T> e11 = d11.e();
            if (Intrinsics.d(e11, g10)) {
                break;
            }
            a aVar3 = this.f56270a;
            Intrinsics.g(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C5721l.D()) {
                C11 = C5721l.C();
                a aVar4 = (a) C5721l.Q(aVar3, this, C11);
                obj2 = v.f56277a;
                synchronized (obj2) {
                    if (aVar4.h() == h11) {
                        aVar4.j(e11);
                        z11 = true;
                        aVar4.k(aVar4.h() + 1);
                        aVar4.l(aVar4.i() + 1);
                    } else {
                        z11 = false;
                    }
                }
            }
            C5721l.H(C11, this);
        } while (!z11);
        return invoke.booleanValue();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t2) {
        Object obj;
        int h11;
        V0.c<T> g10;
        boolean z11;
        AbstractC5715f C11;
        Object obj2;
        do {
            obj = v.f56277a;
            synchronized (obj) {
                a aVar = this.f56270a;
                Intrinsics.g(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) C5721l.A(aVar);
                h11 = aVar2.h();
                g10 = aVar2.g();
                Unit unit = Unit.f71690a;
            }
            Intrinsics.f(g10);
            V0.c<T> add = g10.add((V0.c<T>) t2);
            z11 = false;
            if (add.equals(g10)) {
                return false;
            }
            a aVar3 = this.f56270a;
            Intrinsics.g(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C5721l.D()) {
                C11 = C5721l.C();
                a aVar4 = (a) C5721l.Q(aVar3, this, C11);
                obj2 = v.f56277a;
                synchronized (obj2) {
                    if (aVar4.h() == h11) {
                        aVar4.j(add);
                        aVar4.l(aVar4.i() + 1);
                        aVar4.k(aVar4.h() + 1);
                        z11 = true;
                    }
                }
            }
            C5721l.H(C11, this);
        } while (!z11);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i11, @NotNull Collection<? extends T> collection) {
        return h(new b(i11, collection));
    }

    @Override // c1.InterfaceC5704H
    public final void b(@NotNull AbstractC5706J abstractC5706J) {
        abstractC5706J.e(this.f56270a);
        this.f56270a = (a) abstractC5706J;
    }

    @NotNull
    public final a<T> c() {
        a aVar = this.f56270a;
        Intrinsics.g(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (a) C5721l.M(aVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        AbstractC5715f C11;
        Object obj;
        W0.j jVar;
        a aVar = this.f56270a;
        Intrinsics.g(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (C5721l.D()) {
            C11 = C5721l.C();
            a aVar2 = (a) C5721l.Q(aVar, this, C11);
            obj = v.f56277a;
            synchronized (obj) {
                jVar = W0.j.f33185c;
                aVar2.j(jVar);
                aVar2.k(aVar2.h() + 1);
                aVar2.l(aVar2.i() + 1);
            }
        }
        C5721l.H(C11, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return c().g().contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(@NotNull Collection<? extends Object> collection) {
        return c().g().containsAll(collection);
    }

    public final int e() {
        a aVar = this.f56270a;
        Intrinsics.g(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((a) C5721l.A(aVar)).i();
    }

    @Override // java.util.List
    public final T get(int i11) {
        return c().g().get(i11);
    }

    public final void i(int i11, int i12) {
        Object obj;
        int h11;
        V0.c<T> g10;
        AbstractC5715f C11;
        Object obj2;
        boolean z11;
        do {
            obj = v.f56277a;
            synchronized (obj) {
                a aVar = this.f56270a;
                Intrinsics.g(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) C5721l.A(aVar);
                h11 = aVar2.h();
                g10 = aVar2.g();
                Unit unit = Unit.f71690a;
            }
            Intrinsics.f(g10);
            W0.f d11 = g10.d();
            d11.subList(i11, i12).clear();
            V0.c<? extends T> e11 = d11.e();
            if (Intrinsics.d(e11, g10)) {
                return;
            }
            a aVar3 = this.f56270a;
            Intrinsics.g(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C5721l.D()) {
                C11 = C5721l.C();
                a aVar4 = (a) C5721l.Q(aVar3, this, C11);
                obj2 = v.f56277a;
                synchronized (obj2) {
                    if (aVar4.h() == h11) {
                        aVar4.j(e11);
                        z11 = true;
                        aVar4.k(aVar4.h() + 1);
                        aVar4.l(aVar4.i() + 1);
                    } else {
                        z11 = false;
                    }
                }
            }
            C5721l.H(C11, this);
        } while (!z11);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return c().g().indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return c().g().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // c1.InterfaceC5704H
    @NotNull
    public final AbstractC5706J k() {
        return this.f56270a;
    }

    public final int l(int i11, @NotNull Collection collection, int i12) {
        Object obj;
        int h11;
        V0.c<T> g10;
        AbstractC5715f C11;
        Object obj2;
        boolean z11;
        int size = size();
        do {
            obj = v.f56277a;
            synchronized (obj) {
                a aVar = this.f56270a;
                Intrinsics.g(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) C5721l.A(aVar);
                h11 = aVar2.h();
                g10 = aVar2.g();
                Unit unit = Unit.f71690a;
            }
            Intrinsics.f(g10);
            W0.f d11 = g10.d();
            d11.subList(i11, i12).retainAll(collection);
            V0.c<? extends T> e11 = d11.e();
            if (Intrinsics.d(e11, g10)) {
                break;
            }
            a aVar3 = this.f56270a;
            Intrinsics.g(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C5721l.D()) {
                C11 = C5721l.C();
                a aVar4 = (a) C5721l.Q(aVar3, this, C11);
                obj2 = v.f56277a;
                synchronized (obj2) {
                    if (aVar4.h() == h11) {
                        aVar4.j(e11);
                        z11 = true;
                        aVar4.k(aVar4.h() + 1);
                        aVar4.l(aVar4.i() + 1);
                    } else {
                        z11 = false;
                    }
                }
            }
            C5721l.H(C11, this);
        } while (!z11);
        return size - size();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return c().g().lastIndexOf(obj);
    }

    @Override // java.util.List
    @NotNull
    public final ListIterator<T> listIterator() {
        return new C5698B(this, 0);
    }

    @Override // java.util.List
    public final T remove(int i11) {
        Object obj;
        int h11;
        V0.c<T> g10;
        AbstractC5715f C11;
        Object obj2;
        boolean z11;
        T t2 = get(i11);
        do {
            obj = v.f56277a;
            synchronized (obj) {
                a aVar = this.f56270a;
                Intrinsics.g(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) C5721l.A(aVar);
                h11 = aVar2.h();
                g10 = aVar2.g();
                Unit unit = Unit.f71690a;
            }
            Intrinsics.f(g10);
            V0.c<T> d12 = g10.d1(i11);
            if (d12.equals(g10)) {
                break;
            }
            a aVar3 = this.f56270a;
            Intrinsics.g(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C5721l.D()) {
                C11 = C5721l.C();
                a aVar4 = (a) C5721l.Q(aVar3, this, C11);
                obj2 = v.f56277a;
                synchronized (obj2) {
                    if (aVar4.h() == h11) {
                        aVar4.j(d12);
                        z11 = true;
                        aVar4.l(aVar4.i() + 1);
                        aVar4.k(aVar4.h() + 1);
                    } else {
                        z11 = false;
                    }
                }
            }
            C5721l.H(C11, this);
        } while (!z11);
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(@NotNull Collection<? extends Object> collection) {
        Object obj;
        int h11;
        V0.c<T> g10;
        boolean z11;
        AbstractC5715f C11;
        Object obj2;
        do {
            obj = v.f56277a;
            synchronized (obj) {
                a aVar = this.f56270a;
                Intrinsics.g(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) C5721l.A(aVar);
                h11 = aVar2.h();
                g10 = aVar2.g();
                Unit unit = Unit.f71690a;
            }
            Intrinsics.f(g10);
            V0.c<T> removeAll = g10.removeAll((Collection<? extends T>) collection);
            z11 = false;
            if (Intrinsics.d(removeAll, g10)) {
                return false;
            }
            a aVar3 = this.f56270a;
            Intrinsics.g(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C5721l.D()) {
                C11 = C5721l.C();
                a aVar4 = (a) C5721l.Q(aVar3, this, C11);
                obj2 = v.f56277a;
                synchronized (obj2) {
                    if (aVar4.h() == h11) {
                        aVar4.j(removeAll);
                        aVar4.l(aVar4.i() + 1);
                        aVar4.k(aVar4.h() + 1);
                        z11 = true;
                    }
                }
            }
            C5721l.H(C11, this);
        } while (!z11);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(@NotNull Collection<? extends Object> collection) {
        return h(new c(collection));
    }

    @Override // java.util.List
    public final T set(int i11, T t2) {
        Object obj;
        int h11;
        V0.c<T> g10;
        AbstractC5715f C11;
        Object obj2;
        boolean z11;
        T t11 = get(i11);
        do {
            obj = v.f56277a;
            synchronized (obj) {
                a aVar = this.f56270a;
                Intrinsics.g(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) C5721l.A(aVar);
                h11 = aVar2.h();
                g10 = aVar2.g();
                Unit unit = Unit.f71690a;
            }
            Intrinsics.f(g10);
            V0.c<T> cVar = g10.set(i11, (int) t2);
            if (cVar.equals(g10)) {
                break;
            }
            a aVar3 = this.f56270a;
            Intrinsics.g(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C5721l.D()) {
                C11 = C5721l.C();
                a aVar4 = (a) C5721l.Q(aVar3, this, C11);
                obj2 = v.f56277a;
                synchronized (obj2) {
                    if (aVar4.h() == h11) {
                        aVar4.j(cVar);
                        z11 = true;
                        aVar4.k(aVar4.h() + 1);
                    } else {
                        z11 = false;
                    }
                }
            }
            C5721l.H(C11, this);
        } while (!z11);
        return t11;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return c().g().size();
    }

    @Override // java.util.List
    @NotNull
    public final List<T> subList(int i11, int i12) {
        if (i11 >= 0 && i11 <= i12 && i12 <= size()) {
            return new C5707K(this, i11, i12);
        }
        B0.a("fromIndex or toIndex are out of bounds");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return C7728j.a(this);
    }

    @NotNull
    public final String toString() {
        a aVar = this.f56270a;
        Intrinsics.g(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((a) C5721l.A(aVar)).g() + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(@NotNull Collection<? extends T> collection) {
        Object obj;
        int h11;
        V0.c<T> g10;
        boolean z11;
        AbstractC5715f C11;
        Object obj2;
        do {
            obj = v.f56277a;
            synchronized (obj) {
                a aVar = this.f56270a;
                Intrinsics.g(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) C5721l.A(aVar);
                h11 = aVar2.h();
                g10 = aVar2.g();
                Unit unit = Unit.f71690a;
            }
            Intrinsics.f(g10);
            V0.c<T> addAll = g10.addAll(collection);
            z11 = false;
            if (Intrinsics.d(addAll, g10)) {
                return false;
            }
            a aVar3 = this.f56270a;
            Intrinsics.g(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C5721l.D()) {
                C11 = C5721l.C();
                a aVar4 = (a) C5721l.Q(aVar3, this, C11);
                obj2 = v.f56277a;
                synchronized (obj2) {
                    if (aVar4.h() == h11) {
                        aVar4.j(addAll);
                        aVar4.l(aVar4.i() + 1);
                        aVar4.k(aVar4.h() + 1);
                        z11 = true;
                    }
                }
            }
            C5721l.H(C11, this);
        } while (!z11);
        return true;
    }

    @Override // java.util.List
    @NotNull
    public final ListIterator<T> listIterator(int i11) {
        return new C5698B(this, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C7728j.b(this, tArr);
    }

    @Override // java.util.List
    public final void add(int i11, T t2) {
        Object obj;
        int h11;
        V0.c<T> g10;
        AbstractC5715f C11;
        Object obj2;
        boolean z11;
        do {
            obj = v.f56277a;
            synchronized (obj) {
                a aVar = this.f56270a;
                Intrinsics.g(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) C5721l.A(aVar);
                h11 = aVar2.h();
                g10 = aVar2.g();
                Unit unit = Unit.f71690a;
            }
            Intrinsics.f(g10);
            V0.c<T> add = g10.add(i11, (int) t2);
            if (add.equals(g10)) {
                return;
            }
            a aVar3 = this.f56270a;
            Intrinsics.g(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C5721l.D()) {
                C11 = C5721l.C();
                a aVar4 = (a) C5721l.Q(aVar3, this, C11);
                obj2 = v.f56277a;
                synchronized (obj2) {
                    if (aVar4.h() == h11) {
                        aVar4.j(add);
                        z11 = true;
                        aVar4.l(aVar4.i() + 1);
                        aVar4.k(aVar4.h() + 1);
                    } else {
                        z11 = false;
                    }
                }
            }
            C5721l.H(C11, this);
        } while (!z11);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        Object obj2;
        int h11;
        V0.c<T> g10;
        boolean z11;
        AbstractC5715f C11;
        Object obj3;
        do {
            obj2 = v.f56277a;
            synchronized (obj2) {
                a aVar = this.f56270a;
                Intrinsics.g(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) C5721l.A(aVar);
                h11 = aVar2.h();
                g10 = aVar2.g();
                Unit unit = Unit.f71690a;
            }
            Intrinsics.f(g10);
            V0.c<T> remove = g10.remove((V0.c<T>) obj);
            z11 = false;
            if (Intrinsics.d(remove, g10)) {
                return false;
            }
            a aVar3 = this.f56270a;
            Intrinsics.g(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C5721l.D()) {
                C11 = C5721l.C();
                a aVar4 = (a) C5721l.Q(aVar3, this, C11);
                obj3 = v.f56277a;
                synchronized (obj3) {
                    if (aVar4.h() == h11) {
                        aVar4.j(remove);
                        aVar4.l(aVar4.i() + 1);
                        aVar4.k(aVar4.h() + 1);
                        z11 = true;
                    }
                }
            }
            C5721l.H(C11, this);
        } while (!z11);
        return true;
    }
}
