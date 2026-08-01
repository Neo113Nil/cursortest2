package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.view.SurfaceView;
import com.chartboost.sdk.impl.fk;
import com.chartboost.sdk.impl.hk;
import com.chartboost.sdk.impl.yj;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import com.chartboost.sdk.internal.Networking.okhttp.OkHttpNetworkClient;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class s1 implements q1 {
    public final Lazy A;
    public final Lazy B;
    public final Lazy C;
    public final Lazy D;
    public final Lazy E;
    public final Lazy F;
    public final Lazy G;
    public final Lazy H;
    public final Lazy I;
    public final Lazy J;
    public final Lazy K;
    public final Lazy L;
    public final Lazy M;

    /* renamed from: a, reason: collision with root package name */
    public final m1 f5004a;
    public final l7 b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;
    public final Lazy m;
    public final Lazy n;
    public final Lazy o;
    public final Lazy p;
    public final Lazy q;
    public final Lazy r;
    public final Lazy s;
    public final Lazy t;
    public final Lazy u;
    public final Lazy v;
    public final Lazy w;
    public final Lazy x;
    public final Lazy y;
    public final Lazy z;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5005a;

        static {
            int[] iArr = new int[fk.b.values().length];
            try {
                iArr[fk.b.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fk.b.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5005a = iArr;
        }
    }

    public s1(m1 androidComponent, final o7 executorComponent, final ye privacyComponent, final Function1 sdkConfigFactory, final wh trackerComponent) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        Intrinsics.checkNotNullParameter(executorComponent, "executorComponent");
        Intrinsics.checkNotNullParameter(privacyComponent, "privacyComponent");
        Intrinsics.checkNotNullParameter(sdkConfigFactory, "sdkConfigFactory");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        this.f5004a = androidComponent;
        this.b = new zg(new Supplier() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda39
            @Override // java.util.function.Supplier
            public final Object get() {
                return s1.a(wh.this);
            }
        });
        this.c = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.p(s1.this);
            }
        });
        this.d = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.Q();
            }
        });
        this.e = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.a(ye.this);
            }
        });
        this.f = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.a(s1.this, privacyComponent);
            }
        });
        this.g = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.d(s1.this);
            }
        });
        this.h = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.h(s1.this);
            }
        });
        this.i = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.e(s1.this);
            }
        });
        this.j = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.b(o7.this, this);
            }
        });
        this.k = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.T();
            }
        });
        this.l = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.s(s1.this);
            }
        });
        this.m = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda41
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.q(s1.this);
            }
        });
        this.n = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.l(s1.this);
            }
        });
        this.o = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda43
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.j(s1.this);
            }
        });
        this.p = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.a(Function1.this, this);
            }
        });
        this.q = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.R();
            }
        });
        this.r = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.a(o7.this, this);
            }
        });
        this.s = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.x();
            }
        });
        this.t = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.S();
            }
        });
        this.u = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.y();
            }
        });
        this.v = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.i(s1.this);
            }
        });
        this.w = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.n(s1.this);
            }
        });
        this.x = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.x(s1.this);
            }
        });
        this.y = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.a(s1.this, executorComponent);
            }
        });
        this.z = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.y(s1.this);
            }
        });
        this.A = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.w(s1.this);
            }
        });
        this.B = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.b(s1.this);
            }
        });
        this.C = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.a(s1.this);
            }
        });
        this.D = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.V();
            }
        });
        this.E = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.U();
            }
        });
        this.F = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.m(s1.this);
            }
        });
        this.G = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.k(s1.this);
            }
        });
        this.H = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.c(s1.this);
            }
        });
        this.I = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.o(s1.this);
            }
        });
        this.J = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.u(s1.this);
            }
        });
        this.K = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.v(s1.this);
            }
        });
        this.L = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.t(s1.this);
            }
        });
        this.M = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s1.r(s1.this);
            }
        });
    }

    public static final OkHttpNetworkClient Q() {
        return new OkHttpNetworkClient(0L, 0L, 0L, 7, null);
    }

    public static final nd R() {
        return new nd();
    }

    public static final nh S() {
        return new nh();
    }

    public static final ph T() {
        return new ph();
    }

    public static final Function4 U() {
        return new Function4() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return s1.a((wj) obj, (yj.b) obj2, (CoroutineDispatcher) obj3, (k8) obj4);
            }
        };
    }

    public static final Function3 V() {
        return new Function3() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return s1.a((g1) obj, (hk.b) obj2, (oi) obj3);
            }
        };
    }

    public static final h7 a(wh whVar) {
        return whVar.a();
    }

    public static final e3 b(o7 o7Var, s1 s1Var) {
        return new e3(o7Var.b(), s1Var.F(), s1Var.g(), s1Var.u(), s1Var.f5004a.i(), o7Var.a(), s1Var.b);
    }

    public static final x5 e(final s1 s1Var) {
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
        p6 p6Var = new p6(n4.a(), Dispatchers.getIO(), null, 4, null);
        sd sdVar = new sd(new OkHttpClient(), Dispatchers.getIO());
        u5 u5Var = new u5(CoroutineScope);
        return new x5(CoroutineScope, p6Var, sdVar, new v5(p6Var, u5Var, Dispatchers.getIO()), u5Var, Dispatchers.getIO(), new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(s1.f(s1.this));
            }
        }, 52428800L, new Function0() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(s1.g(s1.this));
            }
        });
    }

    public static final long g(s1 s1Var) {
        return ((com.chartboost.sdk.internal.Model.a) s1Var.b().get()).F;
    }

    public static final y6 h(s1 s1Var) {
        Object obj = s1Var.b().get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return new y6((com.chartboost.sdk.internal.Model.a) obj);
    }

    public static final z7 i(s1 s1Var) {
        return new z7(s1Var.c());
    }

    public static final u2 l(s1 s1Var) {
        return new u2(s1Var.f5004a.getContext(), s1Var.f5004a.d(), s1Var.E(), s1Var.f5004a.a(), null, 16, null);
    }

    public static final qd o(s1 s1Var) {
        return new qd(s1Var.f5004a.getContext());
    }

    public static final te p(s1 s1Var) {
        return new te(s1Var.p(), s1Var.q(), s1Var.e(), s1Var.n(), s1Var.b(), s1Var.b, s1Var.r(), s1Var.h());
    }

    public static final f3 q(s1 s1Var) {
        return new f3(s1Var.f5004a.getContext());
    }

    public static final v3 x() {
        return new v3();
    }

    public static final u7 y() {
        return new u7(null, 1, null);
    }

    public final Function5 A() {
        return (Function5) this.B.getValue();
    }

    public final j1 B() {
        return (j1) this.H.getValue();
    }

    public z7 C() {
        return (z7) this.v.getValue();
    }

    public final r8 D() {
        return (r8) this.G.getValue();
    }

    public final a9 E() {
        return (a9) this.F.getValue();
    }

    public final nd F() {
        return (nd) this.q.getValue();
    }

    public qd G() {
        return (qd) this.I.getValue();
    }

    @Override // com.chartboost.sdk.impl.q1
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public bg n() {
        return (bg) this.f.getValue();
    }

    public mh I() {
        return (mh) this.J.getValue();
    }

    public nh J() {
        return (nh) this.t.getValue();
    }

    public ai K() {
        return (ai) this.K.getValue();
    }

    public final Function4 L() {
        return (Function4) this.E.getValue();
    }

    public final fk.b M() {
        return (fk.b) this.x.getValue();
    }

    public final Function3 N() {
        return (Function3) this.D.getValue();
    }

    public final lk O() {
        return (lk) this.z.getValue();
    }

    public final lk P() {
        return (lk) this.y.getValue();
    }

    @Override // com.chartboost.sdk.impl.q1
    public s7 c() {
        return (s7) this.u.getValue();
    }

    @Override // com.chartboost.sdk.impl.q1
    public ld d() {
        return (ld) this.d.getValue();
    }

    @Override // com.chartboost.sdk.impl.q1
    public w6 f() {
        return (w6) this.i.getValue();
    }

    @Override // com.chartboost.sdk.impl.q1
    public h6 j() {
        return (h6) this.g.getValue();
    }

    @Override // com.chartboost.sdk.impl.q1
    public u2 k() {
        return (u2) this.n.getValue();
    }

    @Override // com.chartboost.sdk.impl.q1
    public v3 m() {
        return (v3) this.s.getValue();
    }

    @Override // com.chartboost.sdk.impl.q1
    public EndpointRepository r() {
        return (EndpointRepository) this.h.getValue();
    }

    @Override // com.chartboost.sdk.impl.q1
    public te s() {
        return (te) this.c.getValue();
    }

    @Override // com.chartboost.sdk.impl.q1
    public kh t() {
        return (kh) this.L.getValue();
    }

    @Override // com.chartboost.sdk.impl.q1
    public ph u() {
        return (ph) this.k.getValue();
    }

    @Override // com.chartboost.sdk.impl.q1
    public va v() {
        return (va) this.w.getValue();
    }

    @Override // com.chartboost.sdk.impl.q1
    public lk w() {
        lk P;
        int i = a.f5005a[M().ordinal()];
        if (i == 1) {
            P = P();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            P = O();
        }
        mb.a("Video repository: " + P, (Throwable) null, 2, (Object) null);
        return P;
    }

    public final Function5 z() {
        return (Function5) this.C.getValue();
    }

    public static final j1 c(s1 s1Var) {
        return new j1(s1Var.f5004a.getContext(), s1Var.f5004a.b());
    }

    public static final h6 d(s1 s1Var) {
        return new h6(s1Var.f5004a.getContext(), s1Var.f5004a.k(), s1Var.f5004a.e());
    }

    public static final long f(s1 s1Var) {
        return ((com.chartboost.sdk.internal.Model.a) s1Var.b().get()).E;
    }

    public static final k8 j(s1 s1Var) {
        return new k8(s1Var.f5004a.getContext(), s1Var.b());
    }

    public static final r8 k(s1 s1Var) {
        return new r8(s1Var.f5004a.getContext());
    }

    public static final a9 m(s1 s1Var) {
        return new a9(s1Var.D(), s1Var.B(), null, 4, null);
    }

    public static final va n(s1 s1Var) {
        PackageManager packageManager = s1Var.f5004a.getContext().getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        return new va(packageManager, null, 2, null);
    }

    public static final a6 r(s1 s1Var) {
        return new a6(null, b4.b.g().a(), s1Var.k(), 1, null);
    }

    public static final sg s(s1 s1Var) {
        return new sg(s1Var.f5004a.g());
    }

    public static final kh t(s1 s1Var) {
        return new kh(s1Var.I(), s1Var.G(), null, 0L, 0, s1Var.K(), 0, 92, null);
    }

    public static final mh u(s1 s1Var) {
        return new mh(s1Var.d(), new qb(null, 1, null), null, 4, null);
    }

    public static final ci v(s1 s1Var) {
        return new ci(s1Var.b());
    }

    public static final fk.b x(s1 s1Var) {
        fk.b bVar;
        fk e;
        com.chartboost.sdk.internal.Model.a aVar = (com.chartboost.sdk.internal.Model.a) s1Var.b().get();
        if (aVar == null || (e = aVar.e()) == null || (bVar = e.h()) == null) {
            bVar = fk.b.d;
        }
        mb.a("Video player type: " + bVar, (Throwable) null, 2, (Object) null);
        return bVar;
    }

    public static final mk y(s1 s1Var) {
        return new mk(s1Var.l(), s1Var.c(), null, null, 12, null);
    }

    @Override // com.chartboost.sdk.impl.q1
    public ve a() {
        return (ve) this.e.getValue();
    }

    @Override // com.chartboost.sdk.impl.q1
    public f3 g() {
        return (f3) this.m.getValue();
    }

    @Override // com.chartboost.sdk.impl.q1
    public sf o() {
        return (sf) this.M.getValue();
    }

    @Override // com.chartboost.sdk.impl.q1
    public k8 q() {
        return (k8) this.o.getValue();
    }

    public static final ve a(ye yeVar) {
        return yeVar.a();
    }

    public static final bg a(s1 s1Var, ye yeVar) {
        return new bg(s1Var.f5004a.getContext(), s1Var.k(), s1Var.g(), s1Var.b(), s1Var.f5004a.g(), s1Var.u(), s1Var.m(), s1Var.h(), yeVar.a(), null, s1Var.j());
    }

    @Override // com.chartboost.sdk.impl.q1
    public sg h() {
        return (sg) this.l.getValue();
    }

    @Override // com.chartboost.sdk.impl.q1
    public Function5 i() {
        int i = a.f5005a[M().ordinal()];
        if (i == 1) {
            return A();
        }
        if (i == 2) {
            return z();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.chartboost.sdk.impl.q1
    public ak l() {
        return (ak) this.A.getValue();
    }

    public static final ak w(s1 s1Var) {
        fk fkVar = new fk(0L, 0, 0, 0L, 0L, 0L, 0, null, 255, null);
        return new ak(fkVar.b(), fkVar.c(), fkVar.d(), fkVar.e(), fkVar.f(), fkVar.g(), fkVar.a(), s1Var.g());
    }

    @Override // com.chartboost.sdk.impl.q1
    public AtomicReference b() {
        return (AtomicReference) this.p.getValue();
    }

    public static final Function5 b(final s1 s1Var) {
        return new Function5() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function5
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return s1.b(s1.this, (Context) obj, (SurfaceView) obj2, (g1) obj3, (oi) obj4, (k8) obj5);
            }
        };
    }

    @Override // com.chartboost.sdk.impl.q1
    public v6 p() {
        return (v6) this.r.getValue();
    }

    public static final e1 b(s1 s1Var, Context context, SurfaceView s, g1 g1Var, oi h, k8 fc) {
        Intrinsics.checkNotNullParameter(context, "<unused var>");
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(h, "h");
        Intrinsics.checkNotNullParameter(fc, "fc");
        return new e1(null, s, g1Var, h, s1Var.N(), s1Var.L(), null, fc, 65, null);
    }

    public static final AtomicReference a(Function1 function1, s1 s1Var) {
        return new AtomicReference(function1.invoke(s1Var.f5004a));
    }

    public static final v6 a(o7 o7Var, s1 s1Var) {
        return new v6(o7Var.b(), s1Var.q(), s1Var.e(), s1Var.g(), s1Var.b(), s1Var.u(), s1Var.b);
    }

    public static final nk a(s1 s1Var, o7 o7Var) {
        return new nk(s1Var.e(), s1Var.l(), s1Var.g(), s1Var.q(), s1Var.J(), o7Var.b());
    }

    public static final Function5 a(final s1 s1Var) {
        return new Function5() { // from class: com.chartboost.sdk.impl.s1$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function5
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return s1.a(s1.this, (Context) obj, (SurfaceView) obj2, (g1) obj3, (oi) obj4, (k8) obj5);
            }
        };
    }

    public static final c1 a(s1 s1Var, Context cxt, SurfaceView s, g1 g1Var, oi h, k8 k8Var) {
        Intrinsics.checkNotNullParameter(cxt, "cxt");
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(h, "h");
        Intrinsics.checkNotNullParameter(k8Var, "<unused var>");
        return new c1(cxt, null, s1Var.C(), s, g1Var, h, s1Var.N(), 2, null);
    }

    public static final ik a(g1 g1Var, hk.b vp, oi oiVar) {
        Intrinsics.checkNotNullParameter(vp, "vp");
        Intrinsics.checkNotNullParameter(oiVar, "<unused var>");
        return new ik(g1Var, vp, null, 4, null);
    }

    public static final yj a(wj va, yj.b l, CoroutineDispatcher d, k8 k8Var) {
        Intrinsics.checkNotNullParameter(va, "va");
        Intrinsics.checkNotNullParameter(l, "l");
        Intrinsics.checkNotNullParameter(d, "d");
        return new yj(va, l, 0.0f, null, k8Var, d, null, 76, null);
    }

    @Override // com.chartboost.sdk.impl.q1
    public e3 e() {
        return (e3) this.j.getValue();
    }

    public /* synthetic */ s1(m1 m1Var, o7 o7Var, ye yeVar, Function1 function1, wh whVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(m1Var, o7Var, yeVar, (i & 8) != 0 ? r1.f4989a : function1, whVar);
    }
}
