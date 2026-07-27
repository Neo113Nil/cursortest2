package com.ironsource;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.B;
import com.ironsource.C4612r0;
import com.ironsource.Df;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes6.dex */
public abstract class B implements AdapterAdListener, NetworkInitializationListener {
    static final /* synthetic */ KProperty<Object>[] y = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(B.class, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "getListener()Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/listeners/AdInstanceListener;", 0))};

    /* renamed from: a, reason: collision with root package name */
    private final T0 f7557a;
    private final C b;
    private final I c;
    private final Df d;
    private final ReadWriteProperty e;
    private G f;
    private final BaseAdAdapter<?, ?> g;
    private C4385e5 h;
    private Df.a i;
    private final Map<String, Object> j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private final AdData o;
    private final C4561o2 p;
    private final boolean q;
    private final String r;
    private final int s;
    private final String t;
    private final IronSource.a u;
    private final int v;
    private final J w;
    private final boolean x;

    static final class a extends Lambda implements Function0<Unit> {
        a() {
            super(0);
        }

        public final void a() {
            long a2 = C4385e5.a(B.this.h);
            IronLog ironLog = IronLog.INTERNAL;
            B b = B.this;
            ironLog.verbose(b.a("Load duration = " + a2 + ", isBidder = " + b.v()));
            B.this.n = true;
            B.this.f().f().e().a(a2, 1025, false, B.this.A());
            B.this.f().f().e().a(a2, 1025, "time out", false, B.this.A());
            B b2 = B.this;
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("time out");
            Intrinsics.checkNotNullExpressionValue(buildLoadFailedError, "buildLoadFailedError(errorMessage)");
            b2.a(buildLoadFailedError);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public B(T0 adTools, C instanceData, I adInstancePayload, Df taskScheduler, F f) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        Intrinsics.checkNotNullParameter(taskScheduler, "taskScheduler");
        this.f7557a = adTools;
        this.b = instanceData;
        this.c = adInstancePayload;
        this.d = taskScheduler;
        this.e = Z6.a(f);
        this.j = new LinkedHashMap();
        this.o = instanceData.h();
        this.p = instanceData.q();
        this.q = instanceData.k().j();
        this.r = instanceData.s();
        this.s = instanceData.t();
        this.t = instanceData.x();
        this.u = instanceData.i();
        this.v = instanceData.w();
        this.w = instanceData.u();
        this.x = instanceData.y();
        BaseAdAdapter<?, ?> a2 = a(instanceData);
        this.g = a2;
        adTools.f().a(new D(adTools, instanceData, a2));
        adTools.f().a(new U1(instanceData.l()));
    }

    private final void D() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        I();
        a(new c());
    }

    private final void E() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        this.f7557a.f().a().a(k());
        F s = s();
        if (s != null) {
            s.a(this);
        }
    }

    private final void F() {
        IronLog ironLog = IronLog.INTERNAL;
        G g = null;
        ironLog.verbose(a(this, (String) null, 1, (Object) null));
        J();
        this.k = false;
        if (this.n) {
            c();
            this.f7557a.f().h().f("instance load success after it was already failed");
            return;
        }
        if (this.l) {
            this.f7557a.f().h().f("instance load success after it was already loaded");
            return;
        }
        this.l = true;
        long a2 = C4385e5.a(this.h);
        ironLog.verbose(a("Load duration = " + a2));
        this.f7557a.f().e().a(a2, false, this.x);
        a(C4612r0.a.LoadedSuccessfully);
        G g2 = this.f;
        if (g2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadListener");
        } else {
            g = g2;
        }
        g.b(this);
    }

    private final void G() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        if (this.m) {
            this.f7557a.f().h().f("instance opened after it was already opened");
            return;
        }
        this.m = true;
        this.f7557a.f().a().g(k());
        a(C4612r0.a.ShowedSuccessfully);
        F s = s();
        if (s != null) {
            s.b(this);
        }
    }

    private final void H() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        J();
        if (this.n) {
            return;
        }
        D();
    }

    private final void I() {
        J();
        Df df = this.d;
        com.ironsource.environment.thread.a a2 = a();
        Duration.Companion companion = Duration.INSTANCE;
        this.i = df.b(a2, DurationKt.toDuration(o(), DurationUnit.SECONDS));
    }

    private final void J() {
        Df.a aVar = this.i;
        if (aVar != null) {
            aVar.a();
        }
        this.i = null;
    }

    private final int o() {
        Integer f = h().f();
        return (f == null || f.intValue() <= 0) ? this.b.j().h() : f.intValue();
    }

    public final boolean A() {
        return this.x;
    }

    public boolean B() {
        return this.l;
    }

    protected abstract void C();

    public abstract void a(K k);

    public void b() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        J();
        this.f7557a.f().e().a(this.v);
    }

    public void c() {
    }

    public final IronSource.a d() {
        return this.u;
    }

    public LevelPlayAdInfo e() {
        String uuid = this.b.j().b().b().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "instanceData.adUnitData.…roperties.adId.toString()");
        String c2 = this.b.j().b().c();
        String aVar = this.b.i().toString();
        Intrinsics.checkNotNullExpressionValue(aVar, "instanceData.adFormat.toString()");
        return new LevelPlayAdInfo(uuid, c2, aVar, h(), null, this.b.j().l(), MapsKt.toMap(this.j));
    }

    public final T0 f() {
        return this.f7557a;
    }

    public final BaseAdAdapter<?, ?> g() {
        return this.g;
    }

    public final C4561o2 h() {
        return this.b.o();
    }

    protected final AdData i() {
        return this.o;
    }

    protected final C4411fd j() {
        return this.b.j().b().f();
    }

    protected final String k() {
        return this.b.j().l();
    }

    protected final Map<String, Object> l() {
        return this.j;
    }

    public final C4561o2 m() {
        return this.p;
    }

    protected final C n() {
        return this.b;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        this.f7557a.a(new Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                B.b(B.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(final AdapterErrorType adapterErrorType, final int i, final String errorMessage) {
        Intrinsics.checkNotNullParameter(adapterErrorType, "adapterErrorType");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f7557a.a(new Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                B.b(B.this, adapterErrorType, i, errorMessage);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        onAdLoadSuccess(new LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        onAdOpened(new LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(final int i, final String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f7557a.a(new Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                B.b(B.this, i, errorMessage);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(final int i, final String str) {
        this.f7557a.a(new Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                B.c(B.this, i, str);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        this.f7557a.a(new Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                B.c(B.this);
            }
        });
    }

    public final String p() {
        return this.r;
    }

    public final String q() {
        return this.t;
    }

    public final int r() {
        return this.s;
    }

    public final F s() {
        return (F) this.e.getValue(this, y[0]);
    }

    public final J t() {
        return this.w;
    }

    public final int u() {
        return this.v;
    }

    public final boolean v() {
        return this.q;
    }

    public final boolean w() {
        return this.n;
    }

    public final boolean x() {
        return this.l;
    }

    public final boolean y() {
        return this.k;
    }

    public final boolean z() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(B this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.H();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess(final Map<String, Object> extraData) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f7557a.a(new Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                B.a(B.this, extraData);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(final Map<String, Object> extraData) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f7557a.a(new Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                B.b(B.this, extraData);
            }
        });
    }

    static final class c extends Lambda implements Function0<Unit> {
        c() {
            super(0);
        }

        public final void a() {
            try {
                B.this.C();
            } catch (Throwable th) {
                T0 f = B.this.f();
                final B b = B.this;
                f.a(new Runnable() { // from class: com.ironsource.B$c$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        B.c.a(th, b);
                    }
                });
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Throwable t, B this$0) {
            Intrinsics.checkNotNullParameter(t, "$t");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            C4491k4.d().a(t);
            String str = "unexpected error while calling adapter.loadAd() - " + t.getMessage();
            IronLog.INTERNAL.error(this$0.a(str));
            this$0.f().f().h().g(str);
            this$0.a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(B this$0, int i, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.b(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(int i, String str) {
        IronLog.INTERNAL.verbose(a("error = " + i + ", " + str));
        J();
        this.n = true;
        a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i, str, C4385e5.a(this.h));
        a(new IronSourceError(i, str));
    }

    public final void a(F f) {
        this.e.setValue(this, y[0], f);
    }

    public final void a(C4561o2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.b.a(value);
    }

    protected final void a(C4612r0.a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        this.b.a(performance);
    }

    public final void a(boolean z) {
        this.f7557a.f().a().a(z);
    }

    private final BaseAdAdapter<?, ?> a(C c2) {
        if (c2.j().e().q()) {
            return this.c.b();
        }
        return this.f7557a.a(c2);
    }

    public final void a(G listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        this.f = listener;
        this.k = true;
        this.f7557a.f().e().a(false, this.x);
        this.h = new C4385e5();
        I();
        a(new b());
    }

    static final class b extends Lambda implements Function0<Unit> {
        b() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
        public final void a() {
            try {
                BaseAdAdapter<?, ?> g = B.this.g();
                Intrinsics.checkNotNull(g);
                ?? networkAdapter = g.getNetworkAdapter();
                if (networkAdapter != 0) {
                    networkAdapter.init(B.this.n().h(), ContextProvider.getInstance().getApplicationContext(), B.this);
                } else {
                    T0 f = B.this.f();
                    final B b = B.this;
                    f.a(new Runnable() { // from class: com.ironsource.B$b$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            B.b.a(B.this);
                        }
                    });
                }
            } catch (Throwable th) {
                T0 f2 = B.this.f();
                final B b2 = B.this;
                f2.a(new Runnable() { // from class: com.ironsource.B$b$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        B.b.a(th, b2);
                    }
                });
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(B this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            String str = "loadAd - network adapter not available " + this$0.q();
            IronLog.INTERNAL.error(this$0.a(str));
            this$0.b(A0.c(this$0.n().i()), str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Throwable t, B this$0) {
            Intrinsics.checkNotNullParameter(t, "$t");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            C4491k4.d().a(t);
            String str = "loadAd - exception = " + t.getLocalizedMessage();
            IronLog.INTERNAL.error(this$0.a(str));
            this$0.f().f().h().g(str);
            this$0.b(A0.c(this$0.n().i()), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(B this$0, AdapterErrorType adapterErrorType, int i, String errorMessage) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adapterErrorType, "$adapterErrorType");
        Intrinsics.checkNotNullParameter(errorMessage, "$errorMessage");
        this$0.a(adapterErrorType, i, errorMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(B this$0, int i, String errorMessage) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(errorMessage, "$errorMessage");
        this$0.a(i, errorMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(B this$0, Map extraData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(extraData, "$extraData");
        this$0.j.putAll(extraData);
        this$0.G();
    }

    public final void a(final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (Ib.v.d().h().D()) {
            Hf.f7662a.b(new Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    B.b(Function0.this);
                }
            });
        } else {
            block.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(B this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.E();
    }

    public static /* synthetic */ String a(B b2, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return b2.a(str);
    }

    protected final String a(String str) {
        return this.f7557a.a(str, this.t);
    }

    private final com.ironsource.environment.thread.a a() {
        return com.ironsource.environment.thread.a.f8176a.a(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(IronSourceError ironSourceError) {
        a(C4612r0.a.FailedToLoad);
        G g = this.f;
        if (g == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadListener");
            g = null;
        }
        g.a(ironSourceError, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(AdapterErrorType adapterErrorType, int i, String str) {
        long a2 = C4385e5.a(this.h);
        IronLog.INTERNAL.verbose(a("Load duration = " + a2 + ", error = " + i + ", " + str));
        J();
        this.k = false;
        if (this.n) {
            c();
            a(adapterErrorType, i, str, a2);
        } else {
            if (this.l) {
                a(adapterErrorType);
                return;
            }
            this.n = true;
            c();
            a(adapterErrorType, i, str, a2);
            a(new IronSourceError(i, str));
        }
    }

    protected final void a(int i, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        IronLog.INTERNAL.verbose(a("Show error = " + i + ", " + errorMessage));
        this.n = true;
        this.f7557a.f().a().a(k(), i, errorMessage, null);
        a(C4612r0.a.FailedToShow);
        F s = s();
        if (s != null) {
            s.a(this, new IronSourceError(i, errorMessage));
        }
        c();
    }

    private final void a(AdapterErrorType adapterErrorType) {
        if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
            this.f7557a.f().h().a("");
        } else {
            this.f7557a.f().h().f("instance load failed after it was already loaded");
        }
    }

    public /* synthetic */ B(T0 t0, C c2, I i, Df df, F f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(t0, c2, i, (i2 & 8) != 0 ? new Cf(null, null, null, 7, null) : df, (i2 & 16) != 0 ? null : f);
    }

    private final void a(AdapterErrorType adapterErrorType, int i, String str, long j) {
        if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
            this.f7557a.f().e().b(j, i, this.x);
        } else if (str != null && str.length() != 0) {
            this.f7557a.f().e().a(j, i, str, false, this.x);
        } else {
            this.f7557a.f().e().a(j, i, false, this.x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(B this$0, Map extraData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(extraData, "$extraData");
        this$0.j.putAll(extraData);
        this$0.F();
    }
}
