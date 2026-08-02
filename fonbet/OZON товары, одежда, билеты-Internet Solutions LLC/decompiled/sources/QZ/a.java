package QZ;

import Sc.InterfaceC4008j;
import f20.C6408c;
import g20.d;
import h10.AbstractC6779a;
import i10.C6997c;
import j10.InterfaceC7238a;
import j10.h;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.C7854a;
import m20.InterfaceC8046a;
import n10.InterfaceC8418b;
import n20.i;
import n20.k;
import n20.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.o;
import z00.h;

/* loaded from: classes7.dex */
public final class a<I extends C7854a> {

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private static final i[] f23138t;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6997c<I> f23139a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final K00.a f23140b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final k<? extends InterfaceC8046a<?, ? extends l20.c>> f23141c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final o f23142d;

    /* renamed from: e, reason: collision with root package name */
    private final K00.i<I> f23143e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ArrayList f23144f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ArrayList f23145g;

    /* renamed from: h, reason: collision with root package name */
    private final RZ.a f23146h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final h<I> f23147i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final A00.b f23148j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC8418b f23149k;

    /* renamed from: l, reason: collision with root package name */
    private final E00.a f23150l;

    /* renamed from: m, reason: collision with root package name */
    private final C00.a f23151m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final bk0.c f23152n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f23153o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f23154p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f23155q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f23156r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f23157s;

    /* renamed from: QZ.a$a, reason: collision with other inner class name */
    public static final class C0454a<I extends C7854a> {

        /* renamed from: a, reason: collision with root package name */
        private C6997c<I> f23158a;

        /* renamed from: b, reason: collision with root package name */
        private K00.a f23159b;

        /* renamed from: c, reason: collision with root package name */
        private k<? extends InterfaceC8046a<?, ? extends l20.c>> f23160c;

        /* renamed from: d, reason: collision with root package name */
        private K00.i<I> f23161d;

        /* renamed from: e, reason: collision with root package name */
        private o f23162e;

        /* renamed from: f, reason: collision with root package name */
        private RZ.a f23163f;

        /* renamed from: g, reason: collision with root package name */
        private h<I> f23164g;

        /* renamed from: h, reason: collision with root package name */
        private A00.b f23165h;

        /* renamed from: i, reason: collision with root package name */
        private InterfaceC8418b f23166i;

        /* renamed from: k, reason: collision with root package name */
        private E00.a f23168k;

        /* renamed from: l, reason: collision with root package name */
        private C00.a f23169l;

        /* renamed from: j, reason: collision with root package name */
        @NotNull
        private final ArrayList f23167j = new ArrayList();

        /* renamed from: m, reason: collision with root package name */
        @NotNull
        private final ArrayList f23170m = new ArrayList();

        @NotNull
        public final void a(@NotNull AbstractC6779a reducer) {
            Intrinsics.checkNotNullParameter(reducer, "reducer");
            this.f23170m.add(reducer);
        }

        @NotNull
        public final void b(@NotNull E00.a errorStateFactory) {
            Intrinsics.checkNotNullParameter(errorStateFactory, "errorStateFactory");
            this.f23168k = errorStateFactory;
        }

        @NotNull
        public final void c(@NotNull C00.a initialWidgetsProvider) {
            Intrinsics.checkNotNullParameter(initialWidgetsProvider, "initialWidgetsProvider");
            this.f23169l = initialWidgetsProvider;
        }

        @NotNull
        public final void d(@NotNull g interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.f23167j.add(interceptor);
        }

        @NotNull
        public final void e(@NotNull RZ.a analytics) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            this.f23163f = analytics;
        }

        @NotNull
        public final a<I> f() {
            C6997c<I> c6997c = this.f23158a;
            if (c6997c == null) {
                throw new IllegalArgumentException("page must not be null");
            }
            K00.a aVar = this.f23159b;
            if (aVar == null) {
                throw new IllegalArgumentException("network must not be null");
            }
            k<? extends InterfaceC8046a<?, ? extends l20.c>> kVar = this.f23160c;
            if (kVar == null) {
                throw new IllegalArgumentException("widget store must not be null");
            }
            o oVar = this.f23162e;
            if (oVar == null) {
                throw new IllegalArgumentException("viewItemProcessorFactory must not be null");
            }
            K00.i<I> iVar = this.f23161d;
            ArrayList arrayList = this.f23167j;
            ArrayList arrayList2 = this.f23170m;
            RZ.a aVar2 = this.f23163f;
            h<I> hVar = this.f23164g;
            if (hVar == null) {
                hVar = new h<>();
            }
            h<I> hVar2 = hVar;
            A00.b bVar = this.f23165h;
            if (bVar == null) {
                bVar = A00.c.a();
            }
            return new a<>(c6997c, aVar, kVar, oVar, iVar, arrayList, arrayList2, aVar2, hVar2, bVar, this.f23166i, this.f23168k, this.f23169l);
        }

        @NotNull
        public final void g(@NotNull A00.b eventLoadingCallback) {
            Intrinsics.checkNotNullParameter(eventLoadingCallback, "eventLoadingCallback");
            this.f23165h = eventLoadingCallback;
        }

        @NotNull
        public final void h(@NotNull C6997c state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.f23158a = state;
        }

        @NotNull
        public final void i(@NotNull K00.a network) {
            Intrinsics.checkNotNullParameter(network, "network");
            this.f23159b = network;
        }

        @NotNull
        public final void j(@NotNull h pageIssueFactory) {
            Intrinsics.checkNotNullParameter(pageIssueFactory, "pageIssueFactory");
            this.f23164g = pageIssueFactory;
        }

        @NotNull
        public final void k(@NotNull InterfaceC8418b pageReadyCallback) {
            Intrinsics.checkNotNullParameter(pageReadyCallback, "pageReadyCallback");
            this.f23166i = pageReadyCallback;
        }

        @NotNull
        public final void l(@NotNull K00.i repository) {
            Intrinsics.checkNotNullParameter(repository, "repository");
            this.f23161d = repository;
        }

        @NotNull
        public final void m(@NotNull ArrayList reducers) {
            Intrinsics.checkNotNullParameter(reducers, "reducers");
            ArrayList arrayList = this.f23170m;
            arrayList.clear();
            arrayList.addAll(reducers);
        }

        @NotNull
        public final void n(@NotNull o viewItemProcessorFactory) {
            Intrinsics.checkNotNullParameter(viewItemProcessorFactory, "viewItemProcessorFactory");
            this.f23162e = viewItemProcessorFactory;
        }

        @NotNull
        public final void o(@NotNull k widgetStore) {
            Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
            this.f23160c = widgetStore;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f23171a = new b();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private static final InterfaceC4008j f23172b = Sc.k.b(C0455a.f23174b);

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private static final InterfaceC4008j f23173c = Sc.k.b(C0456b.f23175b);

        /* renamed from: QZ.a$b$a, reason: collision with other inner class name */
        static final class C0455a extends AbstractC7737t implements Function0<D00.c> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0455a f23174b = new C0455a(0);

            @Override // kotlin.jvm.functions.Function0
            public final D00.c invoke() {
                return new D00.c();
            }
        }

        /* renamed from: QZ.a$b$b, reason: collision with other inner class name */
        static final class C0456b extends AbstractC7737t implements Function0<D00.f> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0456b f23175b = new C0456b(0);

            @Override // kotlin.jvm.functions.Function0
            public final D00.f invoke() {
                D00.d mapper = new D00.d();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                return new D00.f();
            }
        }

        @NotNull
        public static D00.a a() {
            return (D00.a) f23172b.getValue();
        }

        @NotNull
        public static D00.e b() {
            return (D00.e) f23173c.getValue();
        }
    }

    static {
        int i11 = g20.d.f63722b;
        g20.c a11 = d.a.a(new g20.e());
        int i12 = C6408c.f62494b;
        f23138t = new i[]{a11, C6408c.a.a(new f20.d())};
    }

    private a() {
        throw null;
    }

    public a(C6997c c6997c, K00.a aVar, k kVar, o oVar, K00.i iVar, ArrayList arrayList, ArrayList arrayList2, RZ.a aVar2, h hVar, A00.b bVar, InterfaceC8418b interfaceC8418b, E00.a aVar3, C00.a aVar4) {
        this.f23139a = c6997c;
        this.f23140b = aVar;
        this.f23141c = kVar;
        this.f23142d = oVar;
        this.f23143e = iVar;
        this.f23144f = arrayList;
        this.f23145g = arrayList2;
        this.f23146h = aVar2;
        this.f23147i = hVar;
        this.f23148j = bVar;
        this.f23149k = interfaceC8418b;
        this.f23150l = aVar3;
        this.f23151m = aVar4;
        this.f23152n = new bk0.c();
        l.a(kVar, f23138t);
        this.f23153o = Sc.k.b(new f(this));
        this.f23154p = Sc.k.b(new e(this));
        this.f23155q = Sc.k.b(new QZ.b(this));
        this.f23156r = Sc.k.b(new c(this));
        this.f23157s = Sc.k.b(new d(this));
    }

    @NotNull
    public final InterfaceC7851b o() {
        return (InterfaceC7851b) this.f23155q.getValue();
    }

    @NotNull
    public final h.b<I> p() {
        return (h.b) this.f23156r.getValue();
    }

    @NotNull
    public final h.a<I> q() {
        return (h.a) this.f23157s.getValue();
    }

    @NotNull
    public final InterfaceC7238a<I> r() {
        return (InterfaceC7238a) this.f23154p.getValue();
    }

    @NotNull
    public final I00.a<I> s() {
        return (I00.a) this.f23153o.getValue();
    }
}
