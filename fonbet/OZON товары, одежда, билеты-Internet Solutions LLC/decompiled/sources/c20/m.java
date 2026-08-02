package c20;

import B0.A0;
import Sc.InterfaceC3999a;
import a00.C4908c;
import android.view.View;
import androidx.collection.C;
import androidx.collection.C5150t;
import androidx.collection.F;
import androidx.lifecycle.AbstractC5434v;
import c20.k;
import c20.r;
import d20.AbstractC6065b;
import e20.C6283a;
import ed.InterfaceC6346b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m20.InterfaceC8046a;
import n10.InterfaceC8418b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final l10.i f56404a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final n20.k<? extends InterfaceC8046a<?, ? extends l20.c>> f56405b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8418b f56406c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final i f56407d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final b[] f56408e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final b.e f56409f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C<F<a>> f56410g;

    @InterfaceC6346b
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final AbstractC6065b<l20.c> f56411a;

        private /* synthetic */ a(AbstractC6065b abstractC6065b) {
            this.f56411a = abstractC6065b;
        }

        public static final /* synthetic */ a a(AbstractC6065b abstractC6065b) {
            return new a(abstractC6065b);
        }

        public final /* synthetic */ AbstractC6065b b() {
            return this.f56411a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return Intrinsics.d(this.f56411a, ((a) obj).f56411a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f56411a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "OverlayWidgetData(holder=" + this.f56411a + ")";
        }
    }

    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final m f56412a;

        public static final class a extends b {
            @Override // c20.m.b
            public final void a(@NotNull r<Object, l20.c> viewItemMapper, @NotNull ru.ozon.composer.ui.widget.l viewItem) {
                Intrinsics.checkNotNullParameter(viewItemMapper, "viewItemMapper");
                Intrinsics.checkNotNullParameter(viewItem, "viewItem");
                AbstractC6065b<l20.c> f7 = f(viewItem);
                if (f7 == null) {
                    m.a(c(), k.a.EnumC0848a.INSERT, viewItemMapper, viewItem);
                    return;
                }
                ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.DEBUG;
                if (H00.b.c()) {
                    H00.b.b().e(cVar, Pk0.g.c(Thread.currentThread(), ": ", A0.b("update widget [new=[", C5735c.a(viewItem), "]]")), "OverlayWidgetContainer", null, Boolean.TRUE);
                }
                f7.removeView();
                f7.addView();
                f7.bind$composer_recycler_ui_release(viewItem, viewItem.d());
            }

            @NotNull
            public final String toString() {
                return "Change";
            }
        }

        /* renamed from: c20.m$b$b, reason: collision with other inner class name */
        public static final class C0849b extends b {
            @Override // c20.m.b
            public final void a(@NotNull r<Object, l20.c> viewItemMapper, @NotNull ru.ozon.composer.ui.widget.l viewItem) {
                Intrinsics.checkNotNullParameter(viewItemMapper, "viewItemMapper");
                Intrinsics.checkNotNullParameter(viewItem, "viewItem");
                AbstractC6065b<l20.c> f7 = f(viewItem);
                if (f7 == null) {
                    return;
                }
                f7.dispatchLifecycleEvent$composer_recycler_ui_release(AbstractC5434v.a.ON_DESTROY);
                ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.DEBUG;
                if (H00.b.c()) {
                    ru.ozon.android.ozonLogger.core.h b11 = H00.b.b();
                    Thread currentThread = Thread.currentThread();
                    ru.ozon.composer.ui.widget.l viewItem2 = f7.getViewItem();
                    b11.e(cVar, Pk0.g.c(currentThread, ": ", A0.b("delete widget item=[", viewItem2 != null ? C5735c.a(viewItem2) : null, "]")), "OverlayWidgetContainer", null, Boolean.TRUE);
                }
            }

            @NotNull
            public final String toString() {
                return "Delete";
            }
        }

        public static final class c extends b {
            @Override // c20.m.b
            public final void a(@NotNull r<Object, l20.c> viewItemMapper, @NotNull ru.ozon.composer.ui.widget.l viewItem) {
                Intrinsics.checkNotNullParameter(viewItemMapper, "viewItemMapper");
                Intrinsics.checkNotNullParameter(viewItem, "viewItem");
                AbstractC6065b<l20.c> f7 = f(viewItem);
                if (f7 == null) {
                    m.a(c(), k.a.EnumC0848a.INSERT, viewItemMapper, viewItem);
                    return;
                }
                ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.DEBUG;
                if (H00.b.c()) {
                    H00.b.b().e(cVar, Thread.currentThread() + ": reAdd widget view", "OverlayWidgetContainer", null, Boolean.TRUE);
                }
                f7.removeView();
                f7.addView();
            }

            @NotNull
            public final String toString() {
                return "Equal";
            }
        }

        public static final class d extends b {
            @Override // c20.m.b
            public final void a(@NotNull r<Object, l20.c> viewItemMapper, @NotNull ru.ozon.composer.ui.widget.l lVar) {
                ru.ozon.composer.ui.widget.l viewItem = lVar;
                Intrinsics.checkNotNullParameter(viewItemMapper, "viewItemMapper");
                Intrinsics.checkNotNullParameter(viewItem, "viewItem");
                C<F<a>> e11 = e();
                int j11 = viewItem.j();
                F<a> c11 = e11.c(j11);
                if (c11 == null) {
                    int i11 = C5150t.f38742b;
                    c11 = new F<>((Object) null);
                    e11.j(j11, c11);
                }
                F<a> f7 = c11;
                if (f7.f38740e == 0 || viewItemMapper.getViewType() != r.a.SINGLE) {
                    a c12 = f7.c(viewItem.f());
                    if ((c12 != null ? c12.b() : null) != null) {
                        ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.DEBUG;
                        if (H00.b.c()) {
                            H00.b.b().e(cVar, Thread.currentThread() + ": WTF bind widget inside INSERT strategy", "OverlayWidgetContainer", null, Boolean.TRUE);
                            return;
                        }
                        return;
                    }
                    long nanoTime = System.nanoTime();
                    AbstractC6065b<l20.c> holder = viewItemMapper.createHolder(b());
                    AbstractC6065b.INSTANCE.getClass();
                    if (holder == AbstractC6065b.UNSPECIFIED) {
                        ru.ozon.android.ozonLogger.core.c cVar2 = ru.ozon.android.ozonLogger.core.c.DEBUG;
                        if (H00.b.c()) {
                            H00.b.b().e(cVar2, Pk0.g.c(Thread.currentThread(), ": ", A0.b("fail to create widget: cause Unspecified viewHolder for item=[", C5735c.a(viewItem), "]")), "OverlayWidgetContainer", null, Boolean.TRUE);
                            return;
                        }
                        return;
                    }
                    long f11 = viewItem.f();
                    Intrinsics.checkNotNullParameter(holder, "holder");
                    f7.h(f11, a.a(holder));
                    holder.dispatchCreate$composer_recycler_ui_release(viewItem, viewItem.d());
                    ru.ozon.android.ozonLogger.core.c cVar3 = ru.ozon.android.ozonLogger.core.c.DEBUG;
                    if (H00.b.c()) {
                        H00.b.b().e(cVar3, Pk0.g.c(Thread.currentThread(), ": ", A0.b("create widget item=[", C5735c.a(viewItem), "]")), "OverlayWidgetContainer", null, Boolean.TRUE);
                    }
                    long nanoTime2 = System.nanoTime();
                    long nanoTime3 = System.nanoTime();
                    holder.bind$composer_recycler_ui_release(viewItem, viewItem.d());
                    long nanoTime4 = System.nanoTime() - nanoTime3;
                    View metricView = holder.getMetricView();
                    if (metricView == null) {
                        InterfaceC8418b interfaceC8418b = c().f56406c;
                        if (interfaceC8418b != null) {
                            interfaceC8418b.onOverlayMetricsReady(holder, viewItem, new C6283a(nanoTime2 - nanoTime, nanoTime4, 0L));
                        }
                    } else if (metricView.isAttachedToWindow()) {
                        q qVar = new q(this, holder, viewItem, nanoTime, nanoTime2, nanoTime4, System.nanoTime());
                        holder = holder;
                        metricView.addOnLayoutChangeListener(qVar);
                        viewItem = lVar;
                    } else {
                        viewItem = lVar;
                        metricView.addOnAttachStateChangeListener(new o(metricView, this, holder, lVar, nanoTime, nanoTime2, nanoTime4));
                    }
                    C4908c g10 = b().Q().g();
                    n nVar = new n(holder, 0);
                    holder.getLifecycleOwner().getLifecycle().a(new p(this, viewItem, holder, f7, g10, nVar));
                    g10.getLifecycle().a(nVar);
                }
            }

            @NotNull
            public final String toString() {
                return "Insert";
            }
        }

        @InterfaceC3999a
        public static final class e {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final m f56413a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final Object f56414b;

            public /* synthetic */ class a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f56415a;

                static {
                    int[] iArr = new int[k.a.EnumC0848a.values().length];
                    try {
                        iArr[k.a.EnumC0848a.INSERT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[k.a.EnumC0848a.CHANGE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[k.a.EnumC0848a.EQUAL.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[k.a.EnumC0848a.DELETE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f56415a = iArr;
                }
            }

            /* renamed from: c20.m$b$e$b, reason: collision with other inner class name */
            static final class C0850b extends AbstractC7737t implements Function0<LinkedHashSet<s<Object, l20.c>>> {

                /* renamed from: b, reason: collision with root package name */
                public static final C0850b f56416b = new C0850b(0);

                @Override // kotlin.jvm.functions.Function0
                public final LinkedHashSet<s<Object, l20.c>> invoke() {
                    return new LinkedHashSet<>();
                }
            }

            public e(@NotNull m registry) {
                Intrinsics.checkNotNullParameter(registry, "registry");
                this.f56413a = registry;
                this.f56414b = Sc.k.a(Sc.n.NONE, C0850b.f56416b);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
            @InterfaceC3999a
            public final void a() {
                ?? r02 = this.f56414b;
                if (((LinkedHashSet) r02.getValue()).isEmpty()) {
                    return;
                }
                Iterator it = ((LinkedHashSet) r02.getValue()).iterator();
                while (it.hasNext()) {
                    ((s) it.next()).safeAfterChange$composer_recycler_ui_release(this.f56413a.f56404a);
                }
                ((LinkedHashSet) r02.getValue()).clear();
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [Sc.j, java.lang.Object] */
            @InterfaceC3999a
            public final void b(@NotNull s<Object, l20.c> viewItemMapper, @NotNull k.a chunk) {
                Intrinsics.checkNotNullParameter(viewItemMapper, "viewItemMapper");
                Intrinsics.checkNotNullParameter(chunk, "chunk");
                int i11 = a.f56415a[chunk.c().ordinal()];
                ?? r22 = this.f56414b;
                m mVar = this.f56413a;
                if (i11 == 1 || i11 == 2 || i11 == 3) {
                    if (!((LinkedHashSet) r22.getValue()).contains(viewItemMapper)) {
                        viewItemMapper.beforeChange(mVar.f56404a);
                        ((LinkedHashSet) r22.getValue()).add(viewItemMapper);
                    }
                    viewItemMapper.setItem(mVar.f56404a, chunk.b());
                    return;
                }
                if (i11 != 4) {
                    throw new Sc.o();
                }
                if (!((LinkedHashSet) r22.getValue()).contains(viewItemMapper)) {
                    viewItemMapper.beforeChange(mVar.f56404a);
                    ((LinkedHashSet) r22.getValue()).add(viewItemMapper);
                }
                viewItemMapper.removeItem(mVar.f56404a, chunk.b());
            }
        }

        public b(m mVar) {
            this.f56412a = mVar;
        }

        public abstract void a(@NotNull r<Object, l20.c> rVar, @NotNull ru.ozon.composer.ui.widget.l lVar);

        @NotNull
        protected final l10.i b() {
            return this.f56412a.f56404a;
        }

        @NotNull
        protected final m c() {
            return this.f56412a;
        }

        @NotNull
        protected final i d() {
            return this.f56412a.f56407d;
        }

        @NotNull
        protected final C<F<a>> e() {
            return this.f56412a.f56410g;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final AbstractC6065b<l20.c> f(@NotNull ru.ozon.composer.ui.widget.l item) {
            a aVar;
            Intrinsics.checkNotNullParameter(item, "item");
            F f7 = (F) this.f56412a.f56410g.c(item.j());
            if (f7 == null || (aVar = (a) f7.c(item.f())) == null) {
                return null;
            }
            return aVar.b();
        }
    }

    public m(@NotNull l10.i container, @NotNull n20.k<? extends InterfaceC8046a<?, ? extends l20.c>> widgetStore, InterfaceC8418b interfaceC8418b, @NotNull i trackingQueue) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
        Intrinsics.checkNotNullParameter(trackingQueue, "trackingQueue");
        this.f56404a = container;
        this.f56405b = widgetStore;
        this.f56406c = interfaceC8418b;
        this.f56407d = trackingQueue;
        Intrinsics.checkNotNullParameter(this, "registry");
        b.d dVar = new b.d(this);
        Intrinsics.checkNotNullParameter(this, "registry");
        b.a aVar = new b.a(this);
        Intrinsics.checkNotNullParameter(this, "registry");
        b.C0849b c0849b = new b.C0849b(this);
        Intrinsics.checkNotNullParameter(this, "registry");
        this.f56408e = new b[]{dVar, aVar, c0849b, new b.c(this)};
        this.f56409f = new b.e(this);
        this.f56410g = new C<>();
    }

    public static final void a(m mVar, k.a.EnumC0848a enumC0848a, r rVar, ru.ozon.composer.ui.widget.l lVar) {
        mVar.f56408e[enumC0848a.a()].a(rVar, lVar);
    }

    public final void f(@NotNull List<? extends k.a> patch) {
        Intrinsics.checkNotNullParameter(patch, "patch");
        Iterator<? extends k.a> it = patch.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            b.e eVar = this.f56409f;
            if (!hasNext) {
                eVar.a();
                return;
            }
            k.a next = it.next();
            InterfaceC8046a<?, ? extends l20.c> viewMapper = this.f56405b.getViewMapper(next.b().j());
            if (!(viewMapper instanceof r)) {
                viewMapper = null;
            }
            r<Object, l20.c> rVar = (r) viewMapper;
            if (rVar != null) {
                if (rVar instanceof s) {
                    ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.DEBUG;
                    if (H00.b.c()) {
                        H00.b.b().e(cVar, Pk0.g.c(Thread.currentThread(), ": ", "---- apply old strategy [chunk=" + next + "]"), "OverlayWidgetContainer", null, Boolean.TRUE);
                    }
                    eVar.b((s) rVar, next);
                } else {
                    b bVar = this.f56408e[next.c().a()];
                    ru.ozon.android.ozonLogger.core.c cVar2 = ru.ozon.android.ozonLogger.core.c.DEBUG;
                    if (H00.b.c()) {
                        H00.b.b().e(cVar2, Pk0.g.c(Thread.currentThread(), ": ", "---- apply chunk [strategy=" + bVar + ", chunk=" + next + "]"), "OverlayWidgetContainer", null, Boolean.TRUE);
                    }
                    bVar.a(rVar, next.b());
                }
            }
        }
    }

    public final void g(int i11) {
        InterfaceC8046a<?, ? extends l20.c> viewMapper = this.f56405b.getViewMapper(i11);
        if (!(viewMapper instanceof r)) {
            viewMapper = null;
        }
        I00.d dVar = (r) viewMapper;
        if (dVar == null) {
            return;
        }
        if (dVar instanceof InterfaceC5736d) {
            ((InterfaceC5736d) dVar).onRefresh(this.f56404a);
        }
        F<a> c11 = this.f56410g.c(i11);
        if (c11 == null) {
            return;
        }
        Object[] objArr = c11.f38738c;
        long[] jArr = c11.f38736a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            long j11 = jArr[i12];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i12 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j11) < 128) {
                        ((a) objArr[(i12 << 3) + i14]).b().onRefresh();
                    }
                    j11 >>= 8;
                }
                if (i13 != 8) {
                    return;
                }
            }
            if (i12 == length) {
                return;
            } else {
                i12++;
            }
        }
    }
}
