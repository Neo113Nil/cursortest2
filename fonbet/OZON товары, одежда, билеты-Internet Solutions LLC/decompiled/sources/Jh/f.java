package Jh;

import A00.a;
import A00.b;
import H00.d;
import Ih.b;
import L00.g;
import P00.k;
import Qj0.AbstractC3880a;
import Qj0.B;
import Qj0.C3884d;
import Qj0.C3885e;
import Qj0.C3887g;
import Qj0.C3899t;
import Qj0.C3900u;
import Qj0.C3903x;
import Qj0.InterfaceC3892l;
import Qj0.U;
import Qj0.x0;
import Sc.InterfaceC3999a;
import Sc.o;
import We.F;
import We.L;
import a10.C4916d;
import a10.C4919g;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import di0.C6201a;
import di0.C6203c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import k10.EnumC7467b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.tracker.BxPerformanceTraceHandler;
import ru.ozon.tracker.performance.Metric;
import ru.ozon.tracker.performance.MetricType;
import ru.ozon.tracker.performance.NavigationType;
import ru.ozon.tracker.performance.ObjectTypes;
import ve.EnumC10311b;

/* loaded from: classes6.dex */
public final class f implements Ih.b {

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final C3887g f14779i = new C3887g("REDIRECT_TIME_302");

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final BxPerformanceTraceHandler f14780a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final RZ.a f14781b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Sg.a f14782c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final SZ.a f14783d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Jh.d f14784e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Jh.a f14785f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final b.a f14786g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Jh.c f14787h;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14788a;

        static {
            int[] iArr = new int[F.values().length];
            try {
                iArr[F.HTTP_1_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[F.HTTP_1_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[F.QUIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[F.HTTP_2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f14788a = iArr;
        }
    }

    static final class b extends AbstractC7737t implements Function1<U, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A00.a f14789b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f14790c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f14791d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ T00.a f14792e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ObjectTypes f14793f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ S00.a f14794g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ k<? extends C7854a> f14795h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(A00.a aVar, f fVar, String str, T00.a aVar2, ObjectTypes objectTypes, S00.a aVar3, k<? extends C7854a> kVar) {
            super(1);
            this.f14789b = aVar;
            this.f14790c = fVar;
            this.f14791d = str;
            this.f14792e = aVar2;
            this.f14793f = objectTypes;
            this.f14794g = aVar3;
            this.f14795h = kVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(U u11) {
            NavigationType.Name name;
            long j11;
            U beginTrace = u11;
            Intrinsics.checkNotNullParameter(beginTrace, "$this$beginTrace");
            A00.a aVar = this.f14789b;
            boolean z11 = aVar instanceof a.u;
            String str = this.f14791d;
            f fVar = this.f14790c;
            if (z11) {
                fVar.f14785f.l(beginTrace);
                fVar.f14787h.f(str);
            }
            fVar.getClass();
            ObjectTypes objectTypes = this.f14793f;
            B b11 = new B(objectTypes);
            int i11 = U.f23535i;
            beginTrace.n(b11, true);
            T00.a aVar2 = this.f14792e;
            String c11 = aVar2.c();
            if (c11 == null) {
                c11 = "";
            }
            beginTrace.n(new C3885e(c11), true);
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            if (z11) {
                a.u uVar = (a.u) aVar;
                if (Intrinsics.d(uVar, a.u.C0013a.f242a)) {
                    name = NavigationType.Name.INITIAL;
                } else if (uVar instanceof a.u.b) {
                    name = ((a.u.b) aVar).k() ? NavigationType.Name.REFRESH_MULTIPLE_PAGES : NavigationType.Name.REFRESH;
                } else {
                    if (!Intrinsics.d(uVar, a.u.c.f253a)) {
                        throw new o();
                    }
                    name = NavigationType.Name.PULL_TO_REFRESH;
                }
            } else {
                name = null;
            }
            if (name != null) {
                beginTrace.n(new NavigationType(name), true);
            }
            String n11 = aVar2.n();
            if (n11 != null) {
                beginTrace.n(new x0(n11), true);
            }
            T00.e h11 = aVar2.h();
            if (h11 != null) {
                String f7 = h11.f();
                if (f7 != null) {
                    beginTrace.n(new C3884d(f7), true);
                }
                Integer c12 = h11.c();
                if (c12 != null) {
                    beginTrace.n(new C3899t(String.valueOf(c12.intValue())), true);
                }
                Integer d11 = h11.d();
                if (d11 != null) {
                    beginTrace.n(new C3900u(String.valueOf(d11.intValue())), true);
                }
            }
            f.p(fVar, beginTrace, this.f14794g, str);
            k<? extends C7854a> kVar = this.f14795h;
            boolean z12 = kVar.g().f() == null;
            if (z12) {
                U.p(beginTrace, MetricType.PROTOCOL_VERSION, -1L, false, 4);
            } else {
                Object g10 = kVar.g().g();
                L l11 = g10 instanceof L ? (L) g10 : null;
                F B11 = l11 != null ? l11.B() : null;
                int i12 = B11 == null ? -1 : a.f14788a[B11.ordinal()];
                if (i12 == 1) {
                    j11 = 0;
                } else if (i12 == 2) {
                    j11 = 1;
                } else if (i12 == 3) {
                    j11 = 3;
                } else if (i12 == 4) {
                    j11 = 2;
                }
                U.p(beginTrace, MetricType.PROTOCOL_VERSION, j11, false, 4);
            }
            if (H00.d.b()) {
                HashMap a11 = H00.d.a();
                Object obj = a11.get(str);
                if (obj == null) {
                    obj = new d.a(str);
                    a11.put(str, obj);
                }
                d.a aVar3 = (d.a) obj;
                aVar3.a(objectTypes.name(), AppMeasurementSdk.ConditionalUserProperty.NAME);
                T00.e h12 = aVar2.h();
                String f11 = h12 != null ? h12.f() : null;
                aVar3.a(f11 != null ? f11 : "", "pageType");
                aVar3.a(Integer.valueOf(z12 ? fVar.f14786g.a() : kVar.g().b()), "statusCode");
            }
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function1<U, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f14796b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<U, Unit> f14797c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f14798d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(String str, Function1<? super U, Unit> function1, f fVar) {
            super(1);
            this.f14796b = str;
            this.f14797c = function1;
            this.f14798d = fVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(U u11) {
            U runTrace = u11;
            Intrinsics.checkNotNullParameter(runTrace, "$this$runTrace");
            AbstractC3880a d11 = runTrace.d(B.class);
            if (!(d11 instanceof B)) {
                d11 = null;
            }
            B b11 = (B) d11;
            ObjectTypes a11 = b11 != null ? b11.a() : null;
            ObjectTypes objectTypes = ObjectTypes.PAGE_PART;
            String str = this.f14796b;
            if (a11 == objectTypes) {
                long nanoTime = System.nanoTime();
                runTrace.o(MetricType.LOADER_TIME_START, nanoTime, false);
                U.p(runTrace, MetricType.LOADER_TIME_END, nanoTime, false, 4);
                C6201a beginTrace = C6203c.f61631a.beginTrace(str);
                beginTrace.e(EnumC7467b.LOADER_TIME_START, nanoTime, false);
                C6201a.f(beginTrace, EnumC7467b.LOADER_TIME_END, 0L, false, 6);
            }
            U.p(runTrace, MetricType.LAYOUT_TIME_END, 0L, false, 6);
            U.p(runTrace, MetricType.TOTAL_TIME_END, 0L, false, 6);
            this.f14797c.invoke(runTrace);
            f fVar = this.f14798d;
            if (fVar.f14786g.d().getValue().booleanValue()) {
                Jh.b.c(str, runTrace);
            }
            f.o(fVar, runTrace, str, fVar.f14786g.c());
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function1<U, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f14799b = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(U u11) {
            U beginTrace = u11;
            Intrinsics.checkNotNullParameter(beginTrace, "$this$beginTrace");
            U.p(beginTrace, MetricType.LAYOUT_TIME_START, 0L, false, 2);
            return Unit.f71690a;
        }
    }

    public f(@NotNull BxPerformanceTraceHandler traceHandler, @NotNull RZ.a composerAnalytics, @NotNull Sg.a analyticsScreenStorage, @NotNull SZ.a analyticsEventExecutor, @NotNull Jh.d pageLoaderTracker, @NotNull Jh.a composerMetricHandler, @NotNull b.a configuration, @NotNull Jh.c screenCreateTimeHolder) {
        Intrinsics.checkNotNullParameter(traceHandler, "traceHandler");
        Intrinsics.checkNotNullParameter(composerAnalytics, "composerAnalytics");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        Intrinsics.checkNotNullParameter(analyticsEventExecutor, "analyticsEventExecutor");
        Intrinsics.checkNotNullParameter(pageLoaderTracker, "pageLoaderTracker");
        Intrinsics.checkNotNullParameter(composerMetricHandler, "composerMetricHandler");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(screenCreateTimeHolder, "screenCreateTimeHolder");
        this.f14780a = traceHandler;
        this.f14781b = composerAnalytics;
        this.f14782c = analyticsScreenStorage;
        this.f14783d = analyticsEventExecutor;
        this.f14784e = pageLoaderTracker;
        this.f14785f = composerMetricHandler;
        this.f14786g = configuration;
        this.f14787h = screenCreateTimeHolder;
        C6203c c6203c = C6203c.f61631a;
        C6203c.d(configuration.d().getValue().booleanValue());
    }

    public static Unit k(f fVar, U u11) {
        String g10;
        Rg.a a11 = fVar.f14782c.a();
        if (a11 != null && (g10 = a11.g()) != null) {
            Qj0.F f7 = new Qj0.F(g10);
            int i11 = U.f23535i;
            u11.n(f7, true);
        }
        return Unit.f71690a;
    }

    public static final void o(f fVar, U u11, String str, String str2) {
        double d11;
        long j11;
        C3887g c3887g;
        C3887g c3887g2;
        long value;
        fVar.getClass();
        if (H00.d.b()) {
            HashMap a11 = H00.d.a();
            Object obj = a11.get(str);
            if (obj == null) {
                obj = new d.a(str);
                a11.put(str, obj);
            }
            d.a aVar = (d.a) obj;
            boolean booleanValue = fVar.f14786g.d().getValue().booleanValue();
            Iterator it = u11.j().iterator();
            long j12 = 0;
            long j13 = 0;
            long j14 = 0;
            long j15 = 0;
            long j16 = 0;
            long j17 = 0;
            long j18 = 0;
            long j19 = 0;
            long j21 = 0;
            long j22 = 0;
            long j23 = 0;
            long j24 = 0;
            long j25 = 0;
            long j26 = 0;
            long j27 = 0;
            long j28 = 0;
            long j29 = 0;
            long j31 = 0;
            long j32 = 0;
            long j33 = 0;
            long j34 = 0;
            while (it.hasNext()) {
                Metric metric = (Metric) it.next();
                boolean z11 = booleanValue;
                InterfaceC3892l type = metric.getType();
                Iterator it2 = it;
                if (type == MetricType.REQUEST_PREPARE_TIME_START) {
                    j14 = metric.getValue();
                } else if (type == MetricType.REQUEST_PREPARE_TIME_END) {
                    j13 = metric.getValue();
                } else if (type == MetricType.ST_TOTAL) {
                    j17 = metric.getValue();
                } else if (type == MetricType.TIME_TO_LAST_BYTE_START) {
                    j16 = metric.getValue();
                } else if (type == MetricType.TIME_TO_LAST_BYTE_END) {
                    j15 = metric.getValue();
                } else if (type == MetricType.REDIRECT_TIME) {
                    if (z11) {
                        j25 = metric.getValue();
                    } else {
                        value = metric.getValue();
                        j26 = value + j26;
                    }
                } else if (type == MetricType.DECODING_TIME_START) {
                    j19 = metric.getValue();
                } else if (type == MetricType.DECODING_TIME_END) {
                    j18 = metric.getValue();
                } else if (type == MetricType.LAYOUT_TIME_START) {
                    j22 = metric.getValue();
                } else if (type == MetricType.LAYOUT_TIME_END) {
                    j21 = metric.getValue();
                } else if (type == MetricType.TOTAL_TIME_START) {
                    j24 = metric.getValue();
                } else if (type == MetricType.TOTAL_TIME_END) {
                    j23 = metric.getValue();
                } else if (type == MetricType.ADDITIONAL_REQUESTS_TIME_START) {
                    j29 = metric.getValue();
                } else if (type == MetricType.ADDITIONAL_REQUESTS_TIME_END) {
                    j28 = metric.getValue();
                } else if (type == MetricType.PREPARE_PRESENTATION_DATA_TIME_START) {
                    j33 = metric.getValue();
                } else if (type == MetricType.PREPARE_PRESENTATION_DATA_TIME_END) {
                    j32 = metric.getValue();
                } else if (type == MetricType.PRESENTATION_TIME) {
                    j34 = metric.getValue();
                } else if (type == MetricType.FETCH_TIME) {
                    j27 = metric.getValue();
                } else if (type == MetricType.PREPARE_PAGE_TIME) {
                    j31 = metric.getValue();
                } else {
                    c3887g = Jh.a.f14753k;
                    if (Intrinsics.d(type, c3887g)) {
                        j12 = metric.getValue();
                    } else {
                        c3887g2 = Jh.a.f14754l;
                        if (Intrinsics.d(type, c3887g2)) {
                            value = metric.getValue();
                            j26 = value + j26;
                        }
                    }
                }
                booleanValue = z11;
                it = it2;
            }
            boolean z12 = booleanValue;
            b.Companion companion = kotlin.time.b.INSTANCE;
            long j35 = j13 - j14;
            if (j35 < 0) {
                j35 = 0;
            }
            EnumC10311b enumC10311b = EnumC10311b.NANOSECONDS;
            long h11 = kotlin.time.c.h(j35, enumC10311b);
            EnumC10311b enumC10311b2 = EnumC10311b.MILLISECONDS;
            double m11 = kotlin.time.b.m(h11, enumC10311b2);
            double m12 = kotlin.time.b.m(kotlin.time.c.h(j15 - j16, enumC10311b), enumC10311b2);
            double d12 = j17;
            double d13 = m12 - d12;
            if (d13 < 0.0d) {
                d13 = 0.0d;
            }
            double m13 = kotlin.time.b.m(kotlin.time.c.h(j18 - j19, enumC10311b), enumC10311b2);
            double m14 = kotlin.time.b.m(kotlin.time.c.h(j21 - j22, enumC10311b), enumC10311b2);
            double m15 = kotlin.time.b.m(kotlin.time.c.h(j23 - j24, enumC10311b), enumC10311b2);
            if (z12) {
                j11 = 0;
                d11 = m15;
            } else {
                d11 = m15;
                j11 = j12;
            }
            double d14 = d11 + j11;
            double d15 = d12 + m11 + d13 + m13 + m14 + j12;
            double d16 = d14 - d15;
            if (!z12) {
                j25 = j26;
            }
            aVar.a(Double.valueOf(d15), "sumOfSegments");
            aVar.a(Double.valueOf(d16), "(total-sum)");
            aVar.b("screenCreateTime", Long.valueOf(j12));
            aVar.b("requestPrepare", Double.valueOf(m11));
            aVar.b("stTotal", Long.valueOf(j17));
            aVar.b("networkOverhead", Double.valueOf(d13));
            aVar.b("redirect", Long.valueOf(j25));
            aVar.b("decoding", Double.valueOf(m13));
            aVar.b("layout", Double.valueOf(m14));
            aVar.b("total", Double.valueOf(d14));
            if (z12) {
                aVar.b("fetchTime", Long.valueOf(j27));
                aVar.b("additionalRequestsTime", Double.valueOf(kotlin.time.b.m(kotlin.time.c.h(j28 - j29, enumC10311b), enumC10311b2)));
                aVar.b("preparePageTime", Long.valueOf(j31));
                aVar.b("preparePresentationTime", Double.valueOf(kotlin.time.b.m(kotlin.time.c.h(j32 - j33, enumC10311b), enumC10311b2)));
                aVar.b("presentationTime", Long.valueOf(j34));
            }
            aVar.c(str2);
        }
    }

    public static final void p(f fVar, U u11, S00.a aVar, String str) {
        fVar.getClass();
        C4919g e11 = aVar.e();
        U.p(u11, MetricType.REDIRECT_TIME, (long) e11.c(), false, 4);
        C4919g.a b11 = e11.b();
        if (b11 != null && !fVar.f14786g.d().getValue().booleanValue()) {
            long a11 = (long) b11.a();
            C3887g c3887g = f14779i;
            U.p(u11, c3887g, a11, false, 4);
            u11.c(new C3903x(MetricType.TOTAL_TIME_END, c3887g, true));
        }
        U.p(u11, MetricType.DECODING_TIME_START, aVar.c(), false, 4);
        U.p(u11, MetricType.DECODING_TIME_END, 0L, false, 6);
        fVar.f14784e.c(str, u11);
    }

    @Override // Ih.b
    public final void a(long j11) {
        this.f14785f.i(j11);
        this.f14787h.c(j11);
    }

    @Override // Ih.b
    public final void b(long j11) {
        this.f14785f.f(j11);
        this.f14787h.b(j11);
    }

    @Override // Ih.b
    public final void c(String str) {
        if (str != null) {
            this.f14780a.removeTrace(str);
            C6203c.f61631a.removeTrace(str);
        }
    }

    @Override // Ih.b
    public final void d(long j11) {
        this.f14785f.g(j11);
    }

    @Override // Ih.b
    public final void e(@NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        BxPerformanceTraceHandler bxPerformanceTraceHandler = this.f14780a;
        if (bxPerformanceTraceHandler.hasTrace(uuid)) {
            U beginTrace = bxPerformanceTraceHandler.beginTrace(uuid);
            d dVar = d.f14799b;
            if (dVar != null) {
                dVar.invoke(beginTrace);
            }
        }
    }

    @Override // Ih.b
    public final void f(@NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        BxPerformanceTraceHandler bxPerformanceTraceHandler = this.f14780a;
        if (bxPerformanceTraceHandler.hasTrace(uuid)) {
            final U beginTrace = bxPerformanceTraceHandler.beginTrace(uuid);
            this.f14783d.execute(new Callable() { // from class: Jh.e
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return f.k(f.this, beginTrace);
                }
            });
        }
    }

    @Override // Ih.b
    public final void g(@NotNull String uuid, Function1<? super U, Unit> function1) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        BxPerformanceTraceHandler bxPerformanceTraceHandler = this.f14780a;
        if (bxPerformanceTraceHandler.hasTrace(uuid)) {
            new c(uuid, function1, this).invoke(bxPerformanceTraceHandler.beginTrace(uuid));
            bxPerformanceTraceHandler.endTrace(uuid);
        }
    }

    @Override // Ih.b
    public final void h() {
        this.f14784e.b();
    }

    @Override // Ih.b
    public final void i(long j11) {
        this.f14785f.e(j11);
        this.f14787h.a(j11);
    }

    @Override // Ih.b
    public final void j(long j11) {
        this.f14785f.j(j11);
        this.f14787h.d(j11);
    }

    @Override // A00.b
    public final void onLoadCanceled(@NotNull A00.a event, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.f14780a.removeTrace(uuid);
        this.f14785f.c();
    }

    @Override // A00.b
    public final void onLoadCompleted(@NotNull A00.a event, @NotNull String uuid, @NotNull k<? extends C7854a> response) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(response, "response");
        boolean f7 = this.f14781b.e().f();
        BxPerformanceTraceHandler bxPerformanceTraceHandler = this.f14780a;
        if (f7) {
            new b(event, this, uuid, response.f(), event instanceof a.r ? ObjectTypes.PAGE_PART : ObjectTypes.PAGE, response.e(), response).invoke(bxPerformanceTraceHandler.beginTrace(uuid));
        } else {
            bxPerformanceTraceHandler.removeTrace(uuid);
        }
    }

    @Override // A00.b
    @InterfaceC3999a
    public final void onLoadFailed(@NotNull A00.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        b.a.a(event);
    }

    @Override // A00.b
    public final void onLoadStarted(@NotNull A00.a event, @NotNull g request) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f14785f.h(System.nanoTime());
    }

    @Override // A00.b
    public final void onLoadFailed(@NotNull A00.a event, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        b.a.b(this, event, throwable);
        this.f14784e.a();
        boolean z11 = throwable instanceof C4916d;
        Jh.a aVar = this.f14785f;
        if (z11) {
            aVar.k();
            this.f14787h.e();
        } else {
            aVar.d();
        }
    }
}
