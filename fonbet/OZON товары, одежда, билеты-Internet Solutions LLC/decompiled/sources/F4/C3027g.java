package F4;

import F4.C3034n;
import F4.F;
import F4.M;
import F4.x;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

/* renamed from: F4.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C3027g<K, V> extends F<V> implements C3034n.a<V> {

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final M<K, V> f8888k;

    /* renamed from: l, reason: collision with root package name */
    private final F.a<V> f8889l;

    /* renamed from: m, reason: collision with root package name */
    private final K f8890m;

    /* renamed from: n, reason: collision with root package name */
    private int f8891n;

    /* renamed from: o, reason: collision with root package name */
    private int f8892o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f8893p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f8894q;

    /* renamed from: r, reason: collision with root package name */
    private int f8895r;

    /* renamed from: s, reason: collision with root package name */
    private int f8896s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f8897t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f8898u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final C3034n<K, V> f8899v;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.paging.ContiguousPagedList$tryDispatchBoundaryCallbacks$1", f = "ContiguousPagedList.kt", l = {}, m = "invokeSuspend")
    /* renamed from: F4.g$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3027g<K, V> f8900d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f8901e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f8902f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C3027g<K, V> c3027g, boolean z11, boolean z12, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f8900d = c3027g;
            this.f8901e = z11;
            this.f8902f = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f8900d, this.f8901e, this.f8902f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            this.f8900d.H(this.f8901e, this.f8902f);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3027g(@NotNull M<K, V> pagingSource, @NotNull xe.M coroutineScope, @NotNull xe.I notifyDispatcher, @NotNull xe.I backgroundDispatcher, F.a<V> aVar, @NotNull F.c config, @NotNull M.b.C0187b<K, V> initialPage, K k11) {
        super(pagingSource, coroutineScope, notifyDispatcher, new K(), config);
        Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(notifyDispatcher, "notifyDispatcher");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(initialPage, "initialPage");
        this.f8888k = pagingSource;
        this.f8889l = aVar;
        this.f8890m = k11;
        this.f8895r = Integer.MAX_VALUE;
        this.f8896s = LinearLayoutManager.INVALID_OFFSET;
        this.f8898u = false;
        this.f8899v = new C3034n<>(coroutineScope, config, pagingSource, notifyDispatcher, backgroundDispatcher, this, o());
        if (config.f8790c) {
            K<V> o11 = o();
            int d11 = initialPage.d() != Integer.MIN_VALUE ? initialPage.d() : 0;
            int c11 = initialPage.c() != Integer.MIN_VALUE ? initialPage.c() : 0;
            if (initialPage.d() != Integer.MIN_VALUE && initialPage.c() != Integer.MIN_VALUE) {
                r10 = 1;
            }
            o11.o(d11, initialPage, c11, 0, this, r10);
        } else {
            o().o(0, initialPage, 0, initialPage.d() != Integer.MIN_VALUE ? initialPage.d() : 0, this, false);
        }
        M(y.REFRESH, initialPage.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(boolean z11, boolean z12) {
        F.a<V> aVar = this.f8889l;
        if (z11) {
            Intrinsics.f(aVar);
            aVar.b(o().b());
        }
        if (z12) {
            Intrinsics.f(aVar);
            aVar.a(o().f());
        }
    }

    private final void M(y yVar, List<? extends V> list) {
        if (this.f8889l != null) {
            boolean z11 = o().getSize() == 0;
            boolean z12 = !z11 && yVar == y.PREPEND && list.isEmpty();
            boolean z13 = !z11 && yVar == y.APPEND && list.isEmpty();
            if (this.f8895r == Integer.MAX_VALUE) {
                this.f8895r = o().getSize();
            }
            if (this.f8896s == Integer.MIN_VALUE) {
                this.f8896s = 0;
            }
            if (z11 || z12 || z13) {
                C10727i.c(h(), k(), null, new C3026f(z11, this, z12, z13, null), 2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(boolean z11) {
        boolean z12 = this.f8893p && this.f8895r <= g().f8789b;
        boolean z13 = this.f8894q && this.f8896s >= (size() - 1) - g().f8789b;
        if (z12 || z13) {
            if (z12) {
                this.f8893p = false;
            }
            if (z13) {
                this.f8894q = false;
            }
            if (z11) {
                C10727i.c(h(), k(), null, new a(this, z12, z13, null), 2);
            } else {
                H(z12, z13);
            }
        }
    }

    @Override // F4.F
    public final void B(@NotNull y loadType, @NotNull x.b loadState) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(loadState, "loadState");
        this.f8899v.e().e(loadType, loadState);
    }

    public final F.a<V> I() {
        return this.f8889l;
    }

    public final void J(int i11) {
        w(0, i11);
        this.f8897t = o().k() > 0 || o().i() > 0;
    }

    public final void K(int i11, int i12, int i13) {
        v(i11, i12);
        w(0, i13);
        this.f8895r += i13;
        this.f8896s += i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0065, code lost:
    
        if (r0.isEmpty() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008c, code lost:
    
        if (r0.isEmpty() == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean L(@NotNull y type, @NotNull M.b.C0187b<?, V> page) {
        boolean z11;
        y yVar;
        x.c cVar;
        x.c cVar2;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(page, "page");
        List<? extends V> b11 = page.b();
        boolean z12 = true;
        boolean z13 = s() > o().g();
        boolean z14 = this.f8898u;
        if (z14) {
            K<V> o11 = o();
            g().getClass();
            if (o11.t(n(), b11.size())) {
                z11 = true;
                yVar = y.APPEND;
                if (type == yVar) {
                    if (type != y.PREPEND) {
                        throw new IllegalArgumentException(Intrinsics.l(type, "unexpected result type "));
                    }
                    if (z11 && z13) {
                        this.f8891n = 0;
                    } else {
                        o().r(page, this);
                        int size = this.f8891n - b11.size();
                        this.f8891n = size;
                        if (size > 0) {
                        }
                    }
                    z12 = false;
                    if (z14) {
                    }
                    M(type, b11);
                    return z12;
                }
                if (!z11 || z13) {
                    o().a(page, this);
                    int size2 = this.f8892o - b11.size();
                    this.f8892o = size2;
                    if (size2 > 0) {
                    }
                } else {
                    this.f8892o = 0;
                }
                z12 = false;
                if (z14) {
                    C3034n<K, V> c3034n = this.f8899v;
                    if (z13) {
                        if (!(c3034n.e().c() instanceof x.b)) {
                            K<V> o12 = o();
                            boolean z15 = this.f8897t;
                            g().getClass();
                            if (o12.w(z15, n(), this)) {
                                C3035o e11 = c3034n.e();
                                y yVar2 = y.PREPEND;
                                cVar2 = x.c.f8978c;
                                e11.e(yVar2, cVar2);
                            }
                        }
                    } else if (!(c3034n.e().b() instanceof x.b)) {
                        K<V> o13 = o();
                        boolean z16 = this.f8897t;
                        g().getClass();
                        if (o13.v(z16, n(), this)) {
                            C3035o e12 = c3034n.e();
                            cVar = x.c.f8978c;
                            e12.e(yVar, cVar);
                        }
                    }
                }
                M(type, b11);
                return z12;
            }
        }
        z11 = false;
        yVar = y.APPEND;
        if (type == yVar) {
        }
    }

    @Override // F4.F
    public final void e(@NotNull Function2<? super y, ? super x, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f8899v.e().a(callback);
    }

    @Override // F4.F
    public final K i() {
        N<?, V> m11 = o().m(g());
        K b11 = m11 == null ? null : this.f8888k.b(m11);
        return b11 == null ? this.f8890m : b11;
    }

    @Override // F4.F
    @NotNull
    public final M<K, V> m() {
        return this.f8888k;
    }

    @Override // F4.F
    public final boolean q() {
        return this.f8899v.h();
    }

    @Override // F4.F
    public final void u(int i11) {
        int k11 = g().f8789b - (i11 - o().k());
        int i12 = g().f8789b;
        int i13 = i12 + i11 + 1;
        int n11 = i13 - (o().n() + o().k());
        int max = Math.max(k11, this.f8891n);
        this.f8891n = max;
        C3034n<K, V> c3034n = this.f8899v;
        if (max > 0) {
            c3034n.m();
        }
        int max2 = Math.max(n11, this.f8892o);
        this.f8892o = max2;
        if (max2 > 0) {
            c3034n.l();
        }
        this.f8895r = Math.min(this.f8895r, i11);
        this.f8896s = Math.max(this.f8896s, i11);
        N(true);
    }
}
