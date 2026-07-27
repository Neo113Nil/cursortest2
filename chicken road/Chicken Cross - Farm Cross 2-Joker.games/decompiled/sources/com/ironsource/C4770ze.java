package com.ironsource;

import android.content.Context;
import com.ironsource.C4770ze;
import com.ironsource.Ib;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.ironsource.ze, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4770ze {
    public static final b l = new b(null);
    private static final Lazy<C4770ze> m = LazyKt.lazy(a.f8798a);

    /* renamed from: a, reason: collision with root package name */
    private final Ee f8797a;
    private final Pe b;
    private final Fe c;
    private Xe d;
    private final Lazy e;
    private final String f;
    private final List<InterfaceC4626re> g;
    private C4519le h;
    private C4555ne i;
    private boolean j;
    private long k;

    /* renamed from: com.ironsource.ze$a */
    static final class a extends Lambda implements Function0<C4770ze> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8798a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4770ze invoke() {
            return new C4770ze(null, null, null, 7, null);
        }
    }

    /* renamed from: com.ironsource.ze$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C4770ze a() {
            return (C4770ze) C4770ze.m.getValue();
        }

        private b() {
        }
    }

    /* renamed from: com.ironsource.ze$c */
    static final class c extends Lambda implements Function0<InterfaceC4441h7> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f8799a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4441h7 invoke() {
            return Ib.v.d().k();
        }
    }

    /* renamed from: com.ironsource.ze$d */
    public static final class d implements InterfaceC4626re {
        final /* synthetic */ Context b;

        d(Context context) {
            this.b = context;
        }

        @Override // com.ironsource.InterfaceC4626re
        public void a(final C4519le sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            Ee ee = C4770ze.this.f8797a;
            final C4770ze c4770ze = C4770ze.this;
            final Context context = this.b;
            ee.c(new Runnable() { // from class: com.ironsource.ze$d$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C4770ze.d.a(C4770ze.this, context, sdkConfig);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4770ze this$0, Context applicationContext, C4519le sdkConfig) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            this$0.a(applicationContext, sdkConfig);
        }

        @Override // com.ironsource.InterfaceC4626re
        public void a(final C4555ne error, final C4371d9 c4371d9) {
            Intrinsics.checkNotNullParameter(error, "error");
            Ee ee = C4770ze.this.f8797a;
            final C4770ze c4770ze = C4770ze.this;
            ee.c(new Runnable() { // from class: com.ironsource.ze$d$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    C4770ze.d.a(C4770ze.this, error, c4371d9);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4770ze this$0, C4555ne error, C4371d9 c4371d9) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(error, "$error");
            this$0.a(error, c4371d9);
        }
    }

    public C4770ze() {
        this(null, null, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4770ze this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a(true);
    }

    private final InterfaceC4441h7 c() {
        return (InterfaceC4441h7) this.e.getValue();
    }

    public final void d() {
        this.f8797a.c(new Runnable() { // from class: com.ironsource.ze$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C4770ze.b(C4770ze.this);
            }
        });
    }

    public C4770ze(Ee tools, Pe serverInit, Fe sdkServicesInitializer) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(serverInit, "serverInit");
        Intrinsics.checkNotNullParameter(sdkServicesInitializer, "sdkServicesInitializer");
        this.f8797a = tools;
        this.b = serverInit;
        this.c = sdkServicesInitializer;
        this.e = LazyKt.lazy(c.f8799a);
        this.f = "ze";
        this.g = new ArrayList();
    }

    private final void b(C4519le c4519le) {
        this.h = c4519le;
        a(false);
    }

    private final Be b() {
        if (this.h != null) {
            return Be.INITIATED;
        }
        if (this.i != null) {
            return Be.INIT_FAILED;
        }
        if (this.j) {
            return Be.INIT_IN_PROGRESS;
        }
        return Be.NOT_INIT;
    }

    private final void a(Context context, T9 t9, Te te) {
        t9.i(te.g().h());
        t9.c(te.g().d());
        A1 b2 = te.c().b();
        Intrinsics.checkNotNull(b2);
        t9.a(b2.a());
        t9.d(b2.c().b());
        t9.b(b2.k().b());
        t9.a(Boolean.valueOf(IronSourceUtils.c(context)));
        A1 b3 = te.c().b();
        Intrinsics.checkNotNull(b3);
        t9.b(b3.f().b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(InterfaceC4626re listener, C4519le sdkConfig) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
        listener.a(sdkConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(InterfaceC4626re listener, C4555ne error) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(error, "$error");
        InterfaceC4626re.a(listener, error, null, 2, null);
    }

    private final void b(Context context, C4519le c4519le) {
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        String str3;
        H1 b2;
        Pb e;
        H1 g;
        S2 c2;
        H1 g2;
        D9 d2;
        H1 i;
        C4376de f;
        H1 m2;
        H1 b3;
        Te d3 = c4519le.d();
        A1 b4 = d3.c().b();
        if (b4 == null || (b3 = b4.b()) == null) {
            z = false;
            str = null;
        } else {
            z = b3.l();
            str = b3.d();
        }
        K3 c3 = d3.c();
        if (c3 == null || (f = c3.f()) == null || (m2 = f.m()) == null) {
            z2 = false;
            str2 = null;
        } else {
            boolean l2 = m2.l();
            str2 = m2.d();
            z2 = l2;
        }
        K3 c4 = d3.c();
        if (c4 == null || (d2 = c4.d()) == null || (i = d2.i()) == null) {
            z3 = false;
            str3 = null;
        } else {
            boolean l3 = i.l();
            str3 = i.d();
            z3 = l3;
        }
        K3 c5 = d3.c();
        boolean l4 = (c5 == null || (c2 = c5.c()) == null || (g2 = c2.g()) == null) ? false : g2.l();
        K3 c6 = d3.c();
        boolean l5 = (c6 == null || (e = c6.e()) == null || (g = e.g()) == null) ? false : g.l();
        Ib.b bVar = Ib.v;
        bVar.d().q().b(str, context);
        if (z) {
            A1 b5 = d3.c().b();
            if (b5 != null && (b2 = b5.b()) != null) {
                a(this, bVar.d().q(), b2, context, d3, false, 16, null);
            }
        } else {
            bVar.d().q().a(false);
        }
        C4412fe.i().b(str2, context);
        if (z2) {
            K3 c7 = d3.c();
            C4376de f2 = c7 != null ? c7.f() : null;
            Intrinsics.checkNotNull(f2);
            H1 rewardedVideoConfig = f2.m();
            C4412fe i2 = C4412fe.i();
            Intrinsics.checkNotNullExpressionValue(i2, "getInstance()");
            Intrinsics.checkNotNullExpressionValue(rewardedVideoConfig, "rewardedVideoConfig");
            a(this, i2, rewardedVideoConfig, context, d3, false, 16, null);
        } else {
            C4412fe.i().a(false);
        }
        F9.i().b(str3, context);
        if (z3) {
            K3 c8 = d3.c();
            D9 d4 = c8 != null ? c8.d() : null;
            Intrinsics.checkNotNull(d4);
            H1 interstitialConfig = d4.i();
            F9 i3 = F9.i();
            Intrinsics.checkNotNullExpressionValue(i3, "getInstance()");
            Intrinsics.checkNotNullExpressionValue(interstitialConfig, "interstitialConfig");
            a(this, i3, interstitialConfig, context, d3, false, 16, null);
        } else if (l4) {
            K3 c9 = d3.c();
            S2 c10 = c9 != null ? c9.c() : null;
            Intrinsics.checkNotNull(c10);
            H1 bannerConfig = c10.g();
            F9 i4 = F9.i();
            Intrinsics.checkNotNullExpressionValue(i4, "getInstance()");
            Intrinsics.checkNotNullExpressionValue(bannerConfig, "bannerConfig");
            a(this, i4, bannerConfig, context, d3, false, 16, null);
        } else if (l5) {
            K3 c11 = d3.c();
            Pb e2 = c11 != null ? c11.e() : null;
            Intrinsics.checkNotNull(e2);
            H1 g3 = e2.g();
            F9 i5 = F9.i();
            Intrinsics.checkNotNullExpressionValue(i5, "getInstance()");
            a(this, i5, g3, context, d3, false, 16, null);
        } else {
            F9.i().a(false);
        }
        K3 c12 = d3.c();
        A1 b6 = c12 != null ? c12.b() : null;
        Intrinsics.checkNotNull(b6);
        C4375dd i6 = b6.i();
        boolean a2 = i6.a();
        String b7 = i6.b();
        boolean c13 = i6.c();
        int d5 = i6.d();
        int[] e3 = i6.e();
        int[] f3 = i6.f();
        C4357cd c4357cd = C4357cd.P;
        c4357cd.a(a2);
        c4357cd.b(b7, context);
        if (a2) {
            c4357cd.b(e3, context);
            c4357cd.c(f3, context);
            c4357cd.b(c13);
            c4357cd.c(d5);
        }
    }

    public final void a(final Context context, final C4662te initRequest, final InterfaceC4626re listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        final Context applicationContext = context.getApplicationContext();
        this.f8797a.c(new Runnable() { // from class: com.ironsource.ze$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C4770ze.a(C4770ze.this, listener, context, initRequest, applicationContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4770ze this$0, InterfaceC4626re listener, Context context, C4662te initRequest, Context context2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        C4519le c4519le = this$0.h;
        if (c4519le != null) {
            this$0.a(listener, c4519le);
            return;
        }
        this$0.g.add(listener);
        if (this$0.j) {
            return;
        }
        this$0.i = null;
        this$0.a(true);
        this$0.k = new Date().getTime();
        this$0.b.a(context, initRequest, this$0.f8797a, this$0.new d(context2));
    }

    public /* synthetic */ C4770ze(Ee ee, Pe pe, Fe fe, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new De() : ee, (i & 2) != 0 ? new Oe(null, 1, null) : pe, (i & 4) != 0 ? new Fe(null, null, null, null, null, 31, null) : fe);
    }

    public final void a(final C4680ue serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        this.f8797a.c(new Runnable() { // from class: com.ironsource.ze$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                C4770ze.a(C4680ue.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4680ue serverResponse, C4770ze this$0) {
        Intrinsics.checkNotNullParameter(serverResponse, "$serverResponse");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C4519le c4519le = new C4519le(serverResponse, null, null, 6, null);
        this$0.b(c4519le);
        this$0.a(c4519le);
    }

    public final void a(final C4555ne error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f8797a.c(new Runnable() { // from class: com.ironsource.ze$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                C4770ze.a(C4770ze.this, error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4770ze this$0, C4555ne error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.a(error, (C4371d9) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C4555ne c4555ne, C4371d9 c4371d9) {
        this.i = c4555ne;
        a(false);
        Iterator<InterfaceC4626re> it = this.g.iterator();
        while (it.hasNext()) {
            a(it.next(), c4555ne);
        }
        this.g.clear();
        if (c4371d9 != null) {
            c4371d9.b();
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: " + c4555ne, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, C4519le c4519le) {
        Qe i;
        b(c4519le);
        K1 a2 = c4519le.a();
        T4 t4 = T4.f7904a;
        t4.c(a2.h());
        Ib.b bVar = Ib.v;
        bVar.a().o().a(a2.c());
        if (bVar.d().h().e() && (i = c4519le.i()) != null) {
            this.c.a(context, i);
        }
        C4371d9 f = c4519le.f();
        if (f != null) {
            f.b();
        }
        t4.a(a2.g());
        t4.a(a2.k());
        IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(a2.i());
        c().a(a2);
        a(context, this.f8797a.g(), c4519le.d());
        this.f8797a.a(new Date().getTime() - this.k, c4519le.g());
        Xe xe = new Xe();
        this.d = xe;
        xe.a(c());
        IronSourceUtils.e(context, c4519le.d().toString());
        bVar.d().q().c(true);
        F9.i().c(true);
        C4412fe.i().c(true);
        C4357cd c4357cd = C4357cd.P;
        c4357cd.c(true);
        b(context, c4519le);
        IronSourceLoggerManager.getLogger(0).setDebugLevel(c4519le.e().b());
        D1 b2 = c4519le.b();
        if (b2.f()) {
            this.f8797a.a(b2);
        }
        a(c4519le);
        c4357cd.i();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("parameters for init url: " + Ve.a());
        ironLog.verbose("parameters for init POST data: " + Ve.b());
    }

    private final void a(C4519le c4519le) {
        Iterator<InterfaceC4626re> it = this.g.iterator();
        while (it.hasNext()) {
            a(it.next(), c4519le);
        }
        this.g.clear();
    }

    private final void a(boolean z) {
        this.j = z;
        this.f8797a.a(b());
    }

    private final void a(final InterfaceC4626re interfaceC4626re, final C4519le c4519le) {
        this.f8797a.a(new Runnable() { // from class: com.ironsource.ze$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4770ze.b(InterfaceC4626re.this, c4519le);
            }
        });
    }

    private final void a(final InterfaceC4626re interfaceC4626re, final C4555ne c4555ne) {
        this.f8797a.a(new Runnable() { // from class: com.ironsource.ze$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C4770ze.b(InterfaceC4626re.this, c4555ne);
            }
        });
    }

    static /* synthetic */ void a(C4770ze c4770ze, AbstractC4455i3 abstractC4455i3, H1 h1, Context context, Te te, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = true;
        }
        c4770ze.a(abstractC4455i3, h1, context, te, z);
    }

    private final void a(AbstractC4455i3 abstractC4455i3, H1 h1, Context context, Te te, boolean z) {
        abstractC4455i3.a(z);
        abstractC4455i3.a(h1.c(), context);
        abstractC4455i3.b(h1.d(), context);
        abstractC4455i3.a(h1.f());
        abstractC4455i3.d(h1.e());
        abstractC4455i3.b(h1.a());
        abstractC4455i3.b(h1.i(), context);
        abstractC4455i3.c(h1.h(), context);
        abstractC4455i3.a(h1.j(), context);
        abstractC4455i3.d(h1.g(), context);
        A1 b2 = te.c().b();
        Intrinsics.checkNotNull(b2);
        abstractC4455i3.a(b2.j());
        abstractC4455i3.b(h1.k());
        abstractC4455i3.c(h1.b());
    }
}
