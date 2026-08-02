package F4;

import F4.F;
import F4.M;
import F4.x;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

/* renamed from: F4.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3034n<K, V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final xe.M f8924a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final F.c f8925b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final M<K, V> f8926c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final xe.I f8927d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final xe.I f8928e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C3027g f8929f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final K f8930g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f8931h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private C3035o f8932i;

    /* renamed from: F4.n$a */
    public interface a<V> {
    }

    /* renamed from: F4.n$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8933a;

        static {
            int[] iArr = new int[y.values().length];
            iArr[y.PREPEND.ordinal()] = 1;
            iArr[y.APPEND.ordinal()] = 2;
            f8933a = iArr;
        }
    }

    public C3034n(@NotNull xe.M pagedListScope, @NotNull F.c config, @NotNull M source, @NotNull xe.I notifyDispatcher, @NotNull xe.I fetchDispatcher, @NotNull C3027g pageConsumer, @NotNull K keyProvider) {
        Intrinsics.checkNotNullParameter(pagedListScope, "pagedListScope");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(notifyDispatcher, "notifyDispatcher");
        Intrinsics.checkNotNullParameter(fetchDispatcher, "fetchDispatcher");
        Intrinsics.checkNotNullParameter(pageConsumer, "pageConsumer");
        Intrinsics.checkNotNullParameter(keyProvider, "keyProvider");
        this.f8924a = pagedListScope;
        this.f8925b = config;
        this.f8926c = source;
        this.f8927d = notifyDispatcher;
        this.f8928e = fetchDispatcher;
        this.f8929f = pageConsumer;
        this.f8930g = keyProvider;
        this.f8931h = new AtomicBoolean(false);
        this.f8932i = new C3035o(this);
    }

    public static final void b(C3034n c3034n, y yVar) {
        if (c3034n.f8931h.get()) {
            return;
        }
        c3034n.f8932i.e(yVar, new x.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(y yVar, M.b.C0187b<K, V> c0187b) {
        if (this.f8931h.get()) {
            return;
        }
        if (!this.f8929f.L(yVar, c0187b)) {
            this.f8932i.e(yVar, c0187b.b().isEmpty() ? x.c.f8977b : x.c.f8978c);
            return;
        }
        int i11 = b.f8933a[yVar.ordinal()];
        if (i11 == 1) {
            k();
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("Can only fetch more during append/prepend");
            }
            j();
        }
    }

    private final void j() {
        M.b.C0187b<K, V> c0187b;
        Object h11 = this.f8930g.h();
        if (h11 == null) {
            y yVar = y.APPEND;
            c0187b = M.b.C0187b.f8827f;
            i(yVar, c0187b);
            return;
        }
        C3035o c3035o = this.f8932i;
        y yVar2 = y.APPEND;
        c3035o.e(yVar2, x.b.f8976b);
        F.c cVar = this.f8925b;
        C3036p c3036p = new C3036p(this, new M.a.C0186a(cVar.f8790c, cVar.f8788a, h11), yVar2, null);
        C10727i.c(this.f8924a, this.f8928e, null, c3036p, 2);
    }

    private final void k() {
        M.b.C0187b<K, V> c0187b;
        Object l11 = this.f8930g.l();
        if (l11 == null) {
            y yVar = y.PREPEND;
            c0187b = M.b.C0187b.f8827f;
            i(yVar, c0187b);
            return;
        }
        C3035o c3035o = this.f8932i;
        y yVar2 = y.PREPEND;
        c3035o.e(yVar2, x.b.f8976b);
        F.c cVar = this.f8925b;
        C3036p c3036p = new C3036p(this, new M.a.b(cVar.f8790c, cVar.f8788a, l11), yVar2, null);
        C10727i.c(this.f8924a, this.f8928e, null, c3036p, 2);
    }

    public final void d() {
        this.f8931h.set(true);
    }

    @NotNull
    public final C3035o e() {
        return this.f8932i;
    }

    @NotNull
    public final a<V> f() {
        return this.f8929f;
    }

    @NotNull
    public final M<K, V> g() {
        return this.f8926c;
    }

    public final boolean h() {
        return this.f8931h.get();
    }

    public final void l() {
        x b11 = this.f8932i.b();
        if (!(b11 instanceof x.c) || b11.a()) {
            return;
        }
        j();
    }

    public final void m() {
        x c11 = this.f8932i.c();
        if (!(c11 instanceof x.c) || c11.a()) {
            return;
        }
        k();
    }
}
