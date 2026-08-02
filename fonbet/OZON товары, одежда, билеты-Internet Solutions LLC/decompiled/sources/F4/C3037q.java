package F4;

import F4.AbstractC3028h;
import F4.M;
import Sc.InterfaceC4003e;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

/* renamed from: F4.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3037q<Key, Value> extends M<Key, Value> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final xe.I f8943b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AbstractC3028h<Key, Value> f8944c;

    /* renamed from: d, reason: collision with root package name */
    private int f8945d;

    /* renamed from: F4.q$a */
    /* synthetic */ class a implements AbstractC3028h.c, InterfaceC7732n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3037q<Key, Value> f8946a;

        a(C3037q<Key, Value> c3037q) {
            this.f8946a = c3037q;
        }

        @Override // F4.AbstractC3028h.c
        public final void a() {
            this.f8946a.c();
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof AbstractC3028h.c) && (obj instanceof InterfaceC7732n)) {
                return getFunctionDelegate().equals(((InterfaceC7732n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC7732n
        @NotNull
        public final InterfaceC4003e<?> getFunctionDelegate() {
            return new C7735q(0, this.f8946a, C3037q.class, "invalidate", "invalidate()V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: F4.q$b */
    static final class b extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3037q<Key, Value> f8947b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3037q<Key, Value> c3037q) {
            super(0);
            this.f8947b = c3037q;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C3037q<Key, Value> c3037q = this.f8947b;
            c3037q.g().g(new r(c3037q));
            c3037q.g().d();
            return Unit.f71690a;
        }
    }

    /* renamed from: F4.q$c */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8948a;

        static {
            int[] iArr = new int[AbstractC3028h.d.values().length];
            iArr[AbstractC3028h.d.POSITIONAL.ordinal()] = 1;
            iArr[AbstractC3028h.d.PAGE_KEYED.ordinal()] = 2;
            iArr[AbstractC3028h.d.ITEM_KEYED.ordinal()] = 3;
            f8948a = iArr;
        }
    }

    public C3037q(@NotNull xe.I fetchDispatcher, @NotNull AbstractC3028h<Key, Value> dataSource) {
        Intrinsics.checkNotNullParameter(fetchDispatcher, "fetchDispatcher");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f8943b = fetchDispatcher;
        this.f8944c = dataSource;
        this.f8945d = LinearLayoutManager.INVALID_OFFSET;
        dataSource.a(new a(this));
        e(new b(this));
    }

    @Override // F4.M
    public final Key b(@NotNull N<Key, Value> state) {
        int i11;
        Key f7;
        Value b11;
        Intrinsics.checkNotNullParameter(state, "state");
        AbstractC3028h<Key, Value> abstractC3028h = this.f8944c;
        int i12 = c.f8948a[abstractC3028h.c().ordinal()];
        if (i12 == 1) {
            Integer d11 = state.d();
            if (d11 != null) {
                int intValue = d11.intValue();
                i11 = ((N) state).f8837d;
                int i13 = intValue - i11;
                for (int i14 = 0; i14 < C7714v.P(state.e()) && i13 > C7714v.P(state.e().get(i14).b()); i14++) {
                    i13 -= state.e().get(i14).b().size();
                }
                M.b.C0187b<Key, Value> c11 = state.c(intValue);
                if (c11 == null || (f7 = c11.f()) == null) {
                    f7 = (Key) 0;
                }
                return (Key) Integer.valueOf(f7.intValue() + i13);
            }
        } else if (i12 != 2) {
            if (i12 != 3) {
                throw new Sc.o();
            }
            Integer d12 = state.d();
            if (d12 != null && (b11 = state.b(d12.intValue())) != null) {
                abstractC3028h.b(b11);
                throw null;
            }
        }
        return null;
    }

    @Override // F4.M
    public final Object d(@NotNull M.a aVar, @NotNull kotlin.coroutines.jvm.internal.j jVar) {
        y yVar;
        boolean z11 = aVar instanceof M.a.c;
        if (z11) {
            yVar = y.REFRESH;
        } else if (aVar instanceof M.a.C0186a) {
            yVar = y.APPEND;
        } else {
            if (!(aVar instanceof M.a.b)) {
                throw new Sc.o();
            }
            yVar = y.PREPEND;
        }
        y yVar2 = yVar;
        if (this.f8945d == Integer.MIN_VALUE) {
            System.out.println((Object) "WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould've been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106");
            this.f8945d = (z11 && aVar.b() % 3 == 0) ? aVar.b() / 3 : aVar.b();
        }
        return C10727i.f(this.f8943b, new C3038s(this, new AbstractC3028h.e(yVar2, aVar.a(), aVar.b(), aVar.c(), this.f8945d), aVar, null), jVar);
    }

    @NotNull
    public final AbstractC3028h<Key, Value> g() {
        return this.f8944c;
    }

    public final void h(int i11) {
        int i12 = this.f8945d;
        if (!(i12 == Integer.MIN_VALUE || i11 == i12)) {
            throw new IllegalStateException(Ek.a.d(new StringBuilder("Page size is already set to "), this.f8945d, '.').toString());
        }
        this.f8945d = i11;
    }
}
