package RZ;

import Sc.InterfaceC4008j;
import Sc.k;
import VZ.h;
import WZ.l;
import WZ.r;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.collections.M;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private boolean f24874a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f24875b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Sg.a f24876c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Sg.a f24877d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f24878e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f24879f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f24880g;

    /* renamed from: RZ.a$a, reason: collision with other inner class name */
    public static final class C0494a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final UZ.b f24881a;

        /* renamed from: b, reason: collision with root package name */
        private ExecutorService f24882b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private Set<YZ.a> f24883c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private Set<String> f24884d;

        /* renamed from: e, reason: collision with root package name */
        private b f24885e;

        public C0494a(@NotNull UZ.b analyticsEventController) {
            Intrinsics.checkNotNullParameter(analyticsEventController, "analyticsEventController");
            this.f24881a = analyticsEventController;
            M m11 = M.f71699a;
            this.f24883c = m11;
            this.f24884d = m11;
        }

        @NotNull
        public final a a() {
            ExecutorService executorService = this.f24882b;
            Set<YZ.a> set = this.f24883c;
            Set<String> set2 = this.f24884d;
            b bVar = this.f24885e;
            if (bVar == null) {
                int i11 = Sg.a.f26232a;
                bVar = new b(new Sg.c(), Sg.d.f26237b, new VZ.b(null));
            }
            return new a(executorService, set, this.f24881a, set2, bVar);
        }

        @NotNull
        public final void b(@NotNull ExecutorService executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.f24882b = executor;
        }

        @NotNull
        public final void c(@NotNull Set pages) {
            Intrinsics.checkNotNullParameter(pages, "pages");
            this.f24884d = pages;
        }

        @NotNull
        public final void d(@NotNull b pageAnalyticsDependencies) {
            Intrinsics.checkNotNullParameter(pageAnalyticsDependencies, "pageAnalyticsDependencies");
            this.f24885e = pageAnalyticsDependencies;
        }

        @NotNull
        public final void e(@NotNull Set supportedTypes) {
            Intrinsics.checkNotNullParameter(supportedTypes, "supportedTypes");
            this.f24883c = supportedTypes;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Sg.a f24886a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Sg.a f24887b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final VZ.a f24888c;

        public b(@NotNull Sg.a currentScreenAnalyticsScreenStorage, @NotNull Sg.a applicationAnalyticsScreenStorage, @NotNull VZ.a analyticsScreenFactory) {
            Intrinsics.checkNotNullParameter(currentScreenAnalyticsScreenStorage, "currentScreenAnalyticsScreenStorage");
            Intrinsics.checkNotNullParameter(applicationAnalyticsScreenStorage, "applicationAnalyticsScreenStorage");
            Intrinsics.checkNotNullParameter(analyticsScreenFactory, "analyticsScreenFactory");
            this.f24886a = currentScreenAnalyticsScreenStorage;
            this.f24887b = applicationAnalyticsScreenStorage;
            this.f24888c = analyticsScreenFactory;
        }

        @NotNull
        public final VZ.a a() {
            return this.f24888c;
        }

        @NotNull
        public final Sg.a b() {
            return this.f24887b;
        }

        @NotNull
        public final Sg.a c() {
            return this.f24886a;
        }
    }

    static final class c extends AbstractC7737t implements Function0<SZ.b> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExecutorService f24889b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ExecutorService executorService) {
            super(0);
            this.f24889b = executorService;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SZ.b invoke() {
            ExecutorService executorService = this.f24889b;
            if (executorService == null) {
                executorService = Executors.newSingleThreadExecutor();
            }
            Intrinsics.f(executorService);
            return new SZ.b(executorService);
        }
    }

    static final class d extends AbstractC7737t implements Function0<TZ.e> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ UZ.b f24891c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Set<String> f24892d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(UZ.b bVar, Set<String> set) {
            super(0);
            this.f24891c = bVar;
            this.f24892d = set;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TZ.e invoke() {
            a aVar = a.this;
            return new TZ.e(aVar, this.f24891c, new TZ.f(aVar.b(), this.f24892d), aVar.a());
        }
    }

    static final class e extends AbstractC7737t implements Function0<h> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ UZ.b f24893b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f24894c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f24895d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(UZ.b bVar, b bVar2, a aVar) {
            super(0);
            this.f24893b = bVar;
            this.f24894c = bVar2;
            this.f24895d = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final h invoke() {
            b bVar = this.f24894c;
            VZ.a a11 = bVar.a();
            a aVar = this.f24895d;
            return new h(this.f24893b, a11, aVar.b(), bVar.b(), aVar.a());
        }
    }

    static final class f extends AbstractC7737t implements Function0<r> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ UZ.b f24896b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f24897c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Set<YZ.a> f24898d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(a aVar, UZ.b bVar, Set set) {
            super(0);
            this.f24896b = bVar;
            this.f24897c = aVar;
            this.f24898d = set;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r invoke() {
            a aVar = this.f24897c;
            return new r(this.f24896b, aVar.b(), new XZ.a(aVar.b(), this.f24898d), aVar.a());
        }
    }

    private a() {
        throw null;
    }

    public a(ExecutorService executorService, Set set, UZ.b bVar, Set set2, b bVar2) {
        this.f24874a = true;
        this.f24875b = k.b(new c(executorService));
        this.f24876c = bVar2.c();
        this.f24877d = bVar2.b();
        this.f24878e = k.b(new e(bVar, bVar2, this));
        this.f24879f = k.b(new f(this, bVar, set));
        this.f24880g = k.b(new d(bVar, set2));
    }

    @NotNull
    public final SZ.a a() {
        return (SZ.a) this.f24875b.getValue();
    }

    @NotNull
    public final Sg.a b() {
        return this.f24876c;
    }

    @NotNull
    public final Sg.a c() {
        return this.f24877d;
    }

    @NotNull
    public final TZ.a d() {
        return (TZ.a) this.f24880g.getValue();
    }

    @NotNull
    public final VZ.c e() {
        return (VZ.c) this.f24878e.getValue();
    }

    @NotNull
    public final l f() {
        return (l) this.f24879f.getValue();
    }

    public final boolean g() {
        return this.f24874a;
    }

    public final void h(boolean z11) {
        this.f24874a = z11;
    }
}
