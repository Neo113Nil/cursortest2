package com.ironsource;

import android.app.Activity;
import com.ironsource.Df;
import com.ironsource.E0;
import com.ironsource.InterfaceC4516lb;
import com.ironsource.InterfaceC4527m4;
import com.ironsource.S4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: com.ironsource.o6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4565o6 implements InterfaceC4440h6 {

    /* renamed from: a, reason: collision with root package name */
    private final Ib f8464a;
    private final T0 b;
    private final AbstractC4720x0 c;
    private InterfaceC4618r6 d;
    private final W8 e;
    private final Function2<C, I, C4422g6> f;
    private final Df g;
    private final InterfaceC4527m4 h;
    private C4458i6 i;
    private b j;
    private a k;
    private final Hg l;
    private Df.a m;
    private Long n;

    /* renamed from: com.ironsource.o6$a */
    public interface a {
        void a(C4565o6 c4565o6, IronSourceError ironSourceError);

        void a(C4565o6 c4565o6, LevelPlayAdInfo levelPlayAdInfo);
    }

    /* renamed from: com.ironsource.o6$b */
    public interface b {
        void a(C4565o6 c4565o6);

        void b(C4565o6 c4565o6, IronSourceError ironSourceError);

        void b(C4565o6 c4565o6, LevelPlayAdInfo levelPlayAdInfo);

        void c(C4565o6 c4565o6, LevelPlayAdInfo levelPlayAdInfo);
    }

    /* renamed from: com.ironsource.o6$c */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8465a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8465a = iArr;
        }
    }

    /* renamed from: com.ironsource.o6$e */
    /* synthetic */ class e extends FunctionReferenceImpl implements Function2<C, I, C4422g6> {
        e(Object obj) {
            super(2, obj, C4565o6.class, "createAdInstance", "createAdInstance(Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstanceData;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstancePayload;)Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/FullscreenAdInstance;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4422g6 invoke(C p0, I p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return ((C4565o6) this.receiver).a(p0, p1);
        }
    }

    /* renamed from: com.ironsource.o6$f */
    static final class f extends Lambda implements Function1<C4565o6, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f8467a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j) {
            super(1);
            this.f8467a = j;
        }

        public final void a(C4565o6 weakScheduleOnLevelPlay) {
            Intrinsics.checkNotNullParameter(weakScheduleOnLevelPlay, "$this$weakScheduleOnLevelPlay");
            b bVar = weakScheduleOnLevelPlay.j;
            if (bVar != null) {
                bVar.a(weakScheduleOnLevelPlay);
            }
            weakScheduleOnLevelPlay.l.a(new S4.a(this.f8467a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4565o6 c4565o6) {
            a(c4565o6);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4565o6(Ib mediationServices, T0 adUnitTools, AbstractC4720x0 adUnitData, InterfaceC4618r6 fullscreenListener, W8 impressionDataListenerHolder, Jg jg, Function2<? super C, ? super I, C4422g6> function2, Df taskScheduler, InterfaceC4527m4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(mediationServices, "mediationServices");
        Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(fullscreenListener, "fullscreenListener");
        Intrinsics.checkNotNullParameter(impressionDataListenerHolder, "impressionDataListenerHolder");
        Intrinsics.checkNotNullParameter(taskScheduler, "taskScheduler");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f8464a = mediationServices;
        this.b = adUnitTools;
        this.c = adUnitData;
        this.d = fullscreenListener;
        this.e = impressionDataListenerHolder;
        this.f = function2;
        this.g = taskScheduler;
        this.h = currentTimeProvider;
        this.l = a(jg);
    }

    private final void i() {
        String c2 = c();
        if (c2.length() > 0) {
            this.f8464a.b().b(c2, b());
            D3 a2 = this.f8464a.p().a(c2, b());
            if (a2.d()) {
                this.b.f().a().b(c2, a2.e());
            }
        }
    }

    protected final void finalize() {
        IronLog.INTERNAL.verbose(C4577p0.a(this.b, "finalizing ad unit", (String) null, 2, (Object) null));
        Df.a aVar = this.m;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B b(C4565o6 this$0, C instanceData, I adInstancePayload) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        Function2 function2 = this$0.f;
        if (function2 == null) {
            function2 = new e(this$0);
        }
        C4422g6 c4422g6 = (C4422g6) function2.invoke(instanceData, adInstancePayload);
        c4422g6.a(this$0);
        return c4422g6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c() {
        return this.c.l();
    }

    private final InterfaceC4697vd f() {
        int i = c.f8465a[b().ordinal()];
        if (i == 1) {
            return this.f8464a.B();
        }
        if (i != 2) {
            return null;
        }
        return this.f8464a.G();
    }

    private final InterfaceC4516lb<Unit> g() {
        if (!this.l.g()) {
            return new InterfaceC4516lb.a(new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "show called while ad unit is not ready to show"));
        }
        if (this.f8464a.p().a(c(), b()).d()) {
            return new InterfaceC4516lb.a(new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, "placement " + c() + " is capped"));
        }
        if (!this.f8464a.g().a(this.c.b().c()).d()) {
            return new InterfaceC4516lb.b(Unit.INSTANCE);
        }
        return new InterfaceC4516lb.a(new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, "adUnitId " + this.c.b().c() + " is capped"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        Df.a aVar = this.m;
        if (aVar != null) {
            aVar.a();
        }
        long b2 = this.b.b(b());
        IronLog.INTERNAL.verbose(C4577p0.a(this.b, "scheduling load expiration for " + b() + " in " + b2 + " ms", (String) null, 2, (Object) null));
        Df df = this.g;
        Duration.Companion companion = Duration.INSTANCE;
        this.m = df.a(this, DurationKt.toDuration(b2, DurationUnit.MILLISECONDS), new f(b2));
    }

    public final InterfaceC4618r6 d() {
        return this.d;
    }

    public final LevelPlayAdInfo e() {
        B d2 = this.l.d();
        if (d2 != null) {
            return d2.e();
        }
        return null;
    }

    public final void a(InterfaceC4618r6 interfaceC4618r6) {
        Intrinsics.checkNotNullParameter(interfaceC4618r6, "<set-?>");
        this.d = interfaceC4618r6;
    }

    public final void a(b loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        IronLog.INTERNAL.verbose(C4577p0.a(this.b, (String) null, (String) null, 3, (Object) null));
        this.j = loadListener;
        this.n = Long.valueOf(this.h.a());
        this.b.a(new C4630s0(this.c.b()));
        E e2 = new E() { // from class: com.ironsource.o6$$ExternalSyntheticLambda0
            @Override // com.ironsource.E
            public final B a(C c2, I i) {
                B b2;
                b2 = C4565o6.b(C4565o6.this, c2, i);
                return b2;
            }
        };
        this.b.f().e().a(this.c.u());
        this.l.a(e2);
    }

    @Override // com.ironsource.F
    public void b(B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.l.d(instance);
        this.e.a(instance.e());
        this.b.f().a().g(c());
        this.f8464a.i().b(com.unity3d.mediation.a.a(b()));
    }

    /* renamed from: com.ironsource.o6$d */
    public static final class d implements Pg {
        d() {
        }

        @Override // com.ironsource.Pg
        public void a(int i, String errorReason) {
            Long l;
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            Long l2 = C4565o6.this.n;
            if (l2 != null) {
                l = Long.valueOf(C4565o6.this.h.a() - l2.longValue());
            } else {
                l = null;
            }
            C4565o6.this.b.f().e().a(l != null ? l.longValue() : 0L, i, errorReason, C4565o6.this.c.u());
            b bVar = C4565o6.this.j;
            if (bVar != null) {
                bVar.b(C4565o6.this, new IronSourceError(i, errorReason));
            }
        }

        @Override // com.ironsource.Pg
        public void b(B instance) {
            Long l;
            Intrinsics.checkNotNullParameter(instance, "instance");
            Long l2 = C4565o6.this.n;
            if (l2 != null) {
                l = Long.valueOf(C4565o6.this.h.a() - l2.longValue());
            } else {
                l = null;
            }
            C4565o6.this.b.f().e().a(l != null ? l.longValue() : 0L, C4565o6.this.c.u());
            C4565o6.this.h();
            b bVar = C4565o6.this.j;
            if (bVar != null) {
                bVar.b(C4565o6.this, instance.e());
            }
        }

        @Override // com.ironsource.Pg
        public void a(B instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            C4565o6.this.b.f().a().e(C4565o6.this.c());
            C4565o6.this.h();
            b bVar = C4565o6.this.j;
            if (bVar != null) {
                bVar.c(C4565o6.this, instance.e());
            }
        }
    }

    @Override // com.ironsource.InterfaceC4440h6
    public void b(C4422g6 fullscreenInstance) {
        InterfaceC4697vd f2;
        Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        if (fullscreenInstance.A() && (f2 = f()) != null) {
            f2.a(this.c.b().c(), true);
        }
        this.b.f().a().b(c());
        this.l.b();
        this.i = null;
        this.d.onClosed();
    }

    public /* synthetic */ C4565o6(Ib ib, T0 t0, AbstractC4720x0 abstractC4720x0, InterfaceC4618r6 interfaceC4618r6, W8 w8, Jg jg, Function2 function2, Df df, InterfaceC4527m4 interfaceC4527m4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ib, t0, abstractC4720x0, interfaceC4618r6, w8, (i & 32) != 0 ? null : jg, (i & 64) != 0 ? null : function2, (i & 128) != 0 ? new Cf(null, null, null, 7, null) : df, (i & 256) != 0 ? new InterfaceC4527m4.a() : interfaceC4527m4);
    }

    private final LevelPlay.AdFormat b() {
        return this.c.b().e();
    }

    public final void a(Activity activity, a displayListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(displayListener, "displayListener");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(C4577p0.a(this.b, (String) null, (String) null, 3, (Object) null));
        this.k = displayListener;
        this.b.f().a().a(activity, c());
        InterfaceC4516lb<Unit> g = g();
        if (g instanceof InterfaceC4516lb.a) {
            IronSourceError b2 = ((InterfaceC4516lb.a) g).b();
            ironLog.verbose(C4577p0.a(this.b, b2.getErrorMessage(), (String) null, 2, (Object) null));
            this.b.f().a().a(c(), b2.getErrorCode(), b2.getErrorMessage(), this.l.f());
            displayListener.a(this, b2);
            return;
        }
        Df.a aVar = this.m;
        if (aVar != null) {
            aVar.a();
        }
        C4458i6 c4458i6 = new C4458i6(activity);
        this.i = c4458i6;
        this.l.a((K) c4458i6, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4422g6 a(C c2, I i) {
        return new C4422g6(new T0(this.b, E0.b.PROVIDER), c2, i);
    }

    private final Hg a(Jg jg) {
        Pg a2 = a();
        if (jg != null) {
            return jg.a(a2, this);
        }
        return new Hg(this.b, this.c, Ib.v.c().h().v(), a2, f(), this);
    }

    private final Pg a() {
        return new d();
    }

    @Override // com.ironsource.InterfaceC4440h6
    public void a(C4422g6 fullscreenInstance) {
        Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        this.l.b();
        this.i = null;
        a aVar = this.k;
        if (aVar != null) {
            aVar.a(this, fullscreenInstance.e());
        }
        i();
        this.f8464a.l().b(this.c.b().c());
    }

    @Override // com.ironsource.F
    public void a(B instance, IronSourceError error) {
        InterfaceC4697vd f2;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.INTERNAL.verbose(C4577p0.a(this.b, error.toString(), (String) null, 2, (Object) null));
        if (instance.A() && (f2 = f()) != null) {
            f2.a(this.c.b().c(), true);
        }
        C4458i6 c4458i6 = this.i;
        Md f3 = this.l.f();
        a(f3);
        if (f3 == Md.CAN_RECOVER && c4458i6 != null) {
            this.l.a((K) c4458i6, true);
            return;
        }
        this.l.b();
        this.i = null;
        this.b.f().a().a(c(), error.getErrorCode(), error.getErrorMessage(), f3);
        a aVar = this.k;
        if (aVar != null) {
            aVar.a(this, error);
        }
    }

    private final void a(Md md) {
        if (md == Md.CAN_RECOVER || md == Md.NO_LOADED_ADS) {
            this.b.f().h().a(md);
        }
    }

    @Override // com.ironsource.InterfaceC4440h6
    public void a(C4422g6 fullscreenInstance, LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        Intrinsics.checkNotNullParameter(reward, "reward");
        IronLog.INTERNAL.verbose(C4577p0.a(this.b, fullscreenInstance.q(), (String) null, 2, (Object) null));
        this.d.a(reward);
    }

    @Override // com.ironsource.F
    public void a(B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.b.f().a().a(c());
        this.d.e();
    }
}
