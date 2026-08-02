package F4;

import F4.x;
import Sc.InterfaceC3999a;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

@InterfaceC3999a
/* loaded from: classes8.dex */
public abstract class F<T> extends AbstractList<T> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f8778j = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final M<?, T> f8779a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final xe.M f8780b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final xe.I f8781c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final K<T> f8782d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final c f8783e;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f8784f;

    /* renamed from: g, reason: collision with root package name */
    private final int f8785g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ArrayList f8786h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final ArrayList f8787i;

    public static abstract class a<T> {
        public abstract void a(@NotNull T t2);

        public abstract void b(@NotNull T t2);

        public abstract void c();
    }

    public static abstract class b {
        public abstract void a(int i11, int i12);

        public abstract void b(int i11, int i12);

        public abstract void c(int i11, int i12);
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f8788a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8789b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f8790c;

        /* renamed from: d, reason: collision with root package name */
        public final int f8791d;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private int f8792a = -1;

            /* renamed from: b, reason: collision with root package name */
            private int f8793b = -1;

            /* renamed from: c, reason: collision with root package name */
            private int f8794c = -1;

            /* renamed from: d, reason: collision with root package name */
            private boolean f8795d = true;

            @NotNull
            public final c a() {
                if (this.f8793b < 0) {
                    this.f8793b = this.f8792a;
                }
                if (this.f8794c < 0) {
                    this.f8794c = this.f8792a * 3;
                }
                boolean z11 = this.f8795d;
                if (z11 || this.f8793b != 0) {
                    return new c(this.f8792a, this.f8793b, this.f8794c, z11);
                }
                throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in the PagedList, so either placeholders must be enabled, or prefetch distance must be > 0.");
            }

            @NotNull
            public final void b(boolean z11) {
                this.f8795d = z11;
            }

            @NotNull
            public final void c(int i11) {
                this.f8794c = i11;
            }

            @NotNull
            public final void d(int i11) {
                if (i11 < 1) {
                    throw new IllegalArgumentException("Page size must be a positive number");
                }
                this.f8792a = i11;
            }

            @NotNull
            public final void e(int i11) {
                this.f8793b = i11;
            }
        }

        public c(int i11, int i12, int i13, boolean z11) {
            this.f8788a = i11;
            this.f8789b = i12;
            this.f8790c = z11;
            this.f8791d = i13;
        }
    }

    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private x f8796a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private x f8797b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private x f8798c;

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f8799a;

            static {
                int[] iArr = new int[y.values().length];
                iArr[y.REFRESH.ordinal()] = 1;
                iArr[y.PREPEND.ordinal()] = 2;
                iArr[y.APPEND.ordinal()] = 3;
                f8799a = iArr;
            }
        }

        public d() {
            x.c cVar;
            x.c cVar2;
            x.c cVar3;
            cVar = x.c.f8978c;
            this.f8796a = cVar;
            cVar2 = x.c.f8978c;
            this.f8797b = cVar2;
            cVar3 = x.c.f8978c;
            this.f8798c = cVar3;
        }

        public final void a(@NotNull Function2<? super y, ? super x, Unit> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            C3022b c3022b = (C3022b) callback;
            c3022b.invoke(y.REFRESH, this.f8796a);
            c3022b.invoke(y.PREPEND, this.f8797b);
            c3022b.invoke(y.APPEND, this.f8798c);
        }

        @NotNull
        public final x b() {
            return this.f8798c;
        }

        @NotNull
        public final x c() {
            return this.f8797b;
        }

        public abstract void d(@NotNull y yVar, @NotNull x xVar);

        public final void e(@NotNull y type, @NotNull x state) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(state, "state");
            int i11 = a.f8799a[type.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        if (Intrinsics.d(this.f8798c, state)) {
                            return;
                        } else {
                            this.f8798c = state;
                        }
                    }
                } else if (Intrinsics.d(this.f8797b, state)) {
                    return;
                } else {
                    this.f8797b = state;
                }
            } else if (Intrinsics.d(this.f8796a, state)) {
                return;
            } else {
                this.f8796a = state;
            }
            d(type, state);
        }
    }

    static final class e extends AbstractC7737t implements Function1<WeakReference<b>, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f8800b = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(WeakReference<b> weakReference) {
            WeakReference<b> it = weakReference;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.get() == null);
        }
    }

    static final class f extends AbstractC7737t implements Function1<WeakReference<Function2<? super y, ? super x, ? extends Unit>>, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f8801b = new f(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(WeakReference<Function2<? super y, ? super x, ? extends Unit>> weakReference) {
            WeakReference<Function2<? super y, ? super x, ? extends Unit>> it = weakReference;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.get() == null);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.paging.PagedList$dispatchStateChangeAsync$1", f = "PagedList.kt", l = {}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ F<T> f8802d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ y f8803e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ x f8804f;

        static final class a extends AbstractC7737t implements Function1<WeakReference<Function2<? super y, ? super x, ? extends Unit>>, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f8805b = new a(1);

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(WeakReference<Function2<? super y, ? super x, ? extends Unit>> weakReference) {
                WeakReference<Function2<? super y, ? super x, ? extends Unit>> it = weakReference;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.get() == null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(F<T> f7, y yVar, x xVar, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f8802d = f7;
            this.f8803e = yVar;
            this.f8804f = xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new g(this.f8802d, this.f8803e, this.f8804f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            F<T> f7 = this.f8802d;
            kotlin.collections.C.h(((F) f7).f8787i, a.f8805b);
            Iterator it = ((F) f7).f8787i.iterator();
            while (it.hasNext()) {
                Function2 function2 = (Function2) ((WeakReference) it.next()).get();
                if (function2 != null) {
                    function2.invoke(this.f8803e, this.f8804f);
                }
            }
            return Unit.f71690a;
        }
    }

    static final class h extends AbstractC7737t implements Function1<WeakReference<Function2<? super y, ? super x, ? extends Unit>>, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<y, x, Unit> f8806b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(Function2<? super y, ? super x, Unit> function2) {
            super(1);
            this.f8806b = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(WeakReference<Function2<? super y, ? super x, ? extends Unit>> weakReference) {
            WeakReference<Function2<? super y, ? super x, ? extends Unit>> it = weakReference;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.get() == null || it.get() == this.f8806b);
        }
    }

    public F(@NotNull M<?, T> pagingSource, @NotNull xe.M coroutineScope, @NotNull xe.I notifyDispatcher, @NotNull K<T> storage, @NotNull c config) {
        Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(notifyDispatcher, "notifyDispatcher");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f8779a = pagingSource;
        this.f8780b = coroutineScope;
        this.f8781c = notifyDispatcher;
        this.f8782d = storage;
        this.f8783e = config;
        this.f8785g = (config.f8789b * 2) + config.f8788a;
        this.f8786h = new ArrayList();
        this.f8787i = new ArrayList();
    }

    public final void A(@NotNull Function2<? super y, ? super x, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        kotlin.collections.C.h(this.f8787i, new h(listener));
    }

    public void B(@NotNull y loadType, @NotNull x.b loadState) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(loadState, "loadState");
    }

    public final void C(Runnable runnable) {
        this.f8784f = runnable;
    }

    public final void b(@NotNull b callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ArrayList arrayList = this.f8786h;
        kotlin.collections.C.h(arrayList, e.f8800b);
        arrayList.add(new WeakReference(callback));
    }

    public final void c(@NotNull Function2<? super y, ? super x, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ArrayList arrayList = this.f8787i;
        kotlin.collections.C.h(arrayList, f.f8801b);
        arrayList.add(new WeakReference(listener));
        e(listener);
    }

    public abstract void e(@NotNull Function2<? super y, ? super x, Unit> function2);

    public final void f(@NotNull y type, @NotNull x state) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        C10727i.c(this.f8780b, this.f8781c, null, new g(this, type, state, null), 2);
    }

    @NotNull
    public final c g() {
        return this.f8783e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i11) {
        return this.f8782d.get(i11);
    }

    @NotNull
    public final xe.M h() {
        return this.f8780b;
    }

    public abstract Object i();

    @NotNull
    public final xe.I k() {
        return this.f8781c;
    }

    @NotNull
    public final K l() {
        return this.f8782d;
    }

    @NotNull
    public M<?, T> m() {
        return this.f8779a;
    }

    public final int n() {
        return this.f8785g;
    }

    @NotNull
    public final K<T> o() {
        return this.f8782d;
    }

    public abstract boolean q();

    public boolean r() {
        return q();
    }

    public final int s() {
        return this.f8782d.e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8782d.getSize();
    }

    public final void t(int i11) {
        K<T> k11 = this.f8782d;
        if (i11 < 0 || i11 >= k11.getSize()) {
            StringBuilder f7 = P4.f.f(i11, "Index: ", ", Size: ");
            f7.append(k11.getSize());
            throw new IndexOutOfBoundsException(f7.toString());
        }
        k11.s(i11);
        u(i11);
    }

    public abstract void u(int i11);

    public final void v(int i11, int i12) {
        if (i12 == 0) {
            return;
        }
        Iterator<T> it = C7714v.z0(this.f8786h).iterator();
        while (it.hasNext()) {
            b bVar = (b) ((WeakReference) it.next()).get();
            if (bVar != null) {
                bVar.a(i11, i12);
            }
        }
    }

    public final void w(int i11, int i12) {
        if (i12 == 0) {
            return;
        }
        Iterator<T> it = C7714v.z0(this.f8786h).iterator();
        while (it.hasNext()) {
            b bVar = (b) ((WeakReference) it.next()).get();
            if (bVar != null) {
                bVar.b(i11, i12);
            }
        }
    }

    public final void x(int i11, int i12) {
        if (i12 == 0) {
            return;
        }
        Iterator<T> it = C7714v.z0(this.f8786h).iterator();
        while (it.hasNext()) {
            b bVar = (b) ((WeakReference) it.next()).get();
            if (bVar != null) {
                bVar.c(i11, i12);
            }
        }
    }

    public final void z(@NotNull C3024d callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        kotlin.collections.C.h(this.f8786h, new H(callback));
    }
}
