package com.ironsource;

import android.content.Context;
import com.ironsource.B9;
import com.ironsource.C4340be;
import com.ironsource.C4623rb;
import com.ironsource.E0;
import com.ironsource.F8;
import com.ironsource.H7;
import com.ironsource.Ib;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayConfiguration;
import com.unity3d.mediation.LevelPlayInitError;
import com.unity3d.mediation.LevelPlayInitListener;
import com.unity3d.mediation.LevelPlayInitRequest;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.segment.LevelPlaySegment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.json.JSONObject;

/* renamed from: com.ironsource.rb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4623rb {

    /* renamed from: a, reason: collision with root package name */
    public static final C4623rb f8507a = new C4623rb();
    private static final C4659tb b = new C4659tb();

    /* renamed from: com.ironsource.rb$a */
    public static final class a implements InterfaceC4626re {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LevelPlayInitRequest f8508a;
        final /* synthetic */ Context b;
        final /* synthetic */ C4385e5 c;
        final /* synthetic */ LevelPlayInitListener d;

        a(LevelPlayInitRequest levelPlayInitRequest, Context context, C4385e5 c4385e5, LevelPlayInitListener levelPlayInitListener) {
            this.f8508a = levelPlayInitRequest;
            this.b = context;
            this.c = c4385e5;
            this.d = levelPlayInitListener;
        }

        @Override // com.ironsource.InterfaceC4626re
        public void a(final C4519le sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            C4659tb c4659tb = C4623rb.b;
            final LevelPlayInitRequest levelPlayInitRequest = this.f8508a;
            final Context context = this.b;
            final C4385e5 c4385e5 = this.c;
            final LevelPlayInitListener levelPlayInitListener = this.d;
            c4659tb.a(new Runnable() { // from class: com.ironsource.rb$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C4623rb.a.a(C4519le.this, levelPlayInitRequest, context, c4385e5, levelPlayInitListener);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4519le sdkConfig, LevelPlayInitRequest initRequest, Context context, C4385e5 initDuration, LevelPlayInitListener levelPlayInitListener) {
            C4353c9 a2;
            Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(initDuration, "$initDuration");
            C4371d9 f = sdkConfig.f();
            if (f != null && (a2 = f.a()) != null) {
                new C4461i9().a(a2.f(), a2.e().d(), a2.e().e(), a2.e().f(), a2.d());
            }
            C4623rb.f8507a.a(initRequest, sdkConfig, context, initDuration, levelPlayInitListener);
        }

        @Override // com.ironsource.InterfaceC4626re
        public void a(final C4555ne error, C4371d9 c4371d9) {
            Intrinsics.checkNotNullParameter(error, "error");
            C4659tb c4659tb = C4623rb.b;
            final LevelPlayInitListener levelPlayInitListener = this.d;
            final C4385e5 c4385e5 = this.c;
            c4659tb.a(new Runnable() { // from class: com.ironsource.rb$a$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    C4623rb.a.a(LevelPlayInitListener.this, c4385e5, error);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(LevelPlayInitListener levelPlayInitListener, C4385e5 initDuration, C4555ne error) {
            Intrinsics.checkNotNullParameter(initDuration, "$initDuration");
            Intrinsics.checkNotNullParameter(error, "$error");
            C4623rb.f8507a.a(levelPlayInitListener, initDuration, error);
        }
    }

    /* renamed from: com.ironsource.rb$b */
    static final class b extends Lambda implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Sa f8509a;
        final /* synthetic */ C4385e5 b;
        final /* synthetic */ long c;
        final /* synthetic */ LevelPlayInitListener d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Sa sa, C4385e5 c4385e5, long j, LevelPlayInitListener levelPlayInitListener) {
            super(0);
            this.f8509a = sa;
            this.b = c4385e5;
            this.c = j;
            this.d = levelPlayInitListener;
        }

        public final void a() {
            C4623rb.f8507a.a(this.f8509a, this.b, this.c, this.d);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.ironsource.rb$c */
    static final class c extends Lambda implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8510a;
        final /* synthetic */ List<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, List<String> list) {
            super(0);
            this.f8510a = str;
            this.b = list;
        }

        public final void a() {
            com.ironsource.mediationsdk.p.g().a(this.f8510a, this.b);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    private C4623rb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, LevelPlayInitRequest initRequest, LevelPlayInitListener levelPlayInitListener) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        f8507a.c(context, initRequest, levelPlayInitListener);
    }

    public final void c(LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Ib.b bVar = Ib.v;
        if (bVar.d().h().f()) {
            bVar.d().C().a(listener);
        } else {
            b(listener);
        }
    }

    public final void b(LevelPlaySegment segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        com.ironsource.mediationsdk.p.g().a(a(segment));
    }

    public final void b(LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.ironsource.mediationsdk.p.g().a(new Xa(listener));
    }

    public static /* synthetic */ void a(C4623rb c4623rb, Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener, int i, Object obj) {
        if ((i & 4) != 0) {
            levelPlayInitListener = null;
        }
        c4623rb.a(context, levelPlayInitRequest, levelPlayInitListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Class listenerClass) {
        Intrinsics.checkNotNullParameter(listenerClass, "$listenerClass");
        JSONObject b2 = IronSourceUtils.b(false);
        b2.put(IronSourceConstants.EVENTS_EXT1, listenerClass.getName());
        Ib.v.d().q().a(new C4689v5(EnumC4707w5.TROUBLESHOOTING_ILR_SUBSCRIPTION_LEGACY, b2));
    }

    private final void c(Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener) {
        IronLog.API.info("LevelPlay.init() appkey: " + levelPlayInitRequest.getAppKey() + ", userId: " + levelPlayInitRequest.getUserId() + ", legacyAdFormats: " + levelPlayInitRequest.getLegacyAdFormats() + ", context: " + context.getClass().getSimpleName());
        C4385e5 c4385e5 = new C4385e5();
        C4659tb c4659tb = b;
        LevelPlay.AdFormat[] adFormatArr = (LevelPlay.AdFormat[]) levelPlayInitRequest.getLegacyAdFormats().toArray(new LevelPlay.AdFormat[0]);
        Ae.f7554a.a(context, new C4662te(levelPlayInitRequest.getAppKey(), levelPlayInitRequest.getUserId(), ArraysKt.toMutableList(c4659tb.a((LevelPlay.AdFormat[]) Arrays.copyOf(adFormatArr, adFormatArr.length)))), new a(levelPlayInitRequest, context, c4385e5, levelPlayInitListener));
    }

    public final void a(final Context context, final LevelPlayInitRequest initRequest, final LevelPlayInitListener levelPlayInitListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        b.a(new Runnable() { // from class: com.ironsource.rb$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C4623rb.b(context, initRequest, levelPlayInitListener);
            }
        });
    }

    public final void a(LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.ironsource.mediationsdk.p.g().b(new Xa(listener));
        a(listener.getClass());
    }

    public final void a(LevelPlayImpressionDataListener listener, String subscriberId) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(subscriberId, "subscriberId");
        Ib.b bVar = Ib.v;
        if (!bVar.d().h().f()) {
            a(listener);
        } else {
            bVar.d().C().a(subscriberId, listener);
        }
    }

    private final void a(final Class<?> cls) {
        b.a(new Runnable() { // from class: com.ironsource.rb$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4623rb.b(cls);
            }
        });
    }

    private final C4293aa a(LevelPlaySegment levelPlaySegment) {
        C4293aa c4293aa = new C4293aa();
        c4293aa.a(levelPlaySegment.getLevel());
        c4293aa.a(levelPlaySegment.getIapTotal());
        c4293aa.a(levelPlaySegment.isPaying());
        c4293aa.a(levelPlaySegment.getUserCreationDate());
        c4293aa.a(levelPlaySegment.getSegmentName());
        Iterator<T> it = levelPlaySegment.getCustoms$mediationsdk_release().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            c4293aa.a((String) pair.getFirst(), (String) pair.getSecond());
        }
        return c4293aa;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(LevelPlayInitRequest levelPlayInitRequest, C4519le c4519le, Context context, C4385e5 c4385e5, LevelPlayInitListener levelPlayInitListener) {
        Ib.b bVar = Ib.v;
        F8.a F = bVar.a().F();
        Sa sa = new Sa(c4519le);
        if (sa.o()) {
            b.a(context);
        }
        H7.a b2 = bVar.a().b();
        C4659tb c4659tb = b;
        sa.b(c4659tb).a(b2);
        sa.a(c4659tb).a(bVar.a().l());
        sa.c(c4659tb).a(bVar.a().v());
        C4623rb c4623rb = f8507a;
        c4623rb.a(levelPlayInitRequest, sa);
        bVar.d().B().a(sa);
        bVar.d().G().a(sa);
        if (bVar.d().h().f()) {
            bVar.d().C().a(sa.k());
        }
        long o = bVar.d().h().o();
        ContextProvider.getInstance().updateStrategyIfNeeded();
        com.ironsource.mediationsdk.c.d().i();
        c4623rb.a(o, new b(sa, c4385e5, o, levelPlayInitListener));
        F.a(sa);
        if (c4519le.a().f()) {
            new Nd(null, null, null, IronSourceThreadManager.INSTANCE.getThreadPoolExecutor(), 7, null).c(context);
        }
    }

    private final void a(long j, final Function0<Unit> function0) {
        if (!Ib.v.d().f().c() && j > 0) {
            Cf cf = new Cf(null, null, null, 7, null);
            Runnable runnable = new Runnable() { // from class: com.ironsource.rb$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    C4623rb.a(Function0.this);
                }
            };
            Duration.Companion companion = Duration.INSTANCE;
            cf.b(runnable, DurationKt.toDuration(j, DurationUnit.MILLISECONDS));
            return;
        }
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final Sa sa, C4385e5 c4385e5, long j, final LevelPlayInitListener levelPlayInitListener) {
        Ib.v.a().F().d();
        long a2 = C4385e5.a(c4385e5);
        C4659tb c4659tb = b;
        C4659tb.a(c4659tb, a2, sa.g(), j, null, 8, null);
        c4659tb.b(new Runnable() { // from class: com.ironsource.rb$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C4623rb.a(LevelPlayInitListener.this, sa);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayInitListener levelPlayInitListener, Sa levelPlayConfig) {
        Intrinsics.checkNotNullParameter(levelPlayConfig, "$levelPlayConfig");
        IronLog.CALLBACK.info("LevelPlayInitListener.onInitSuccess()");
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitSuccess(new LevelPlayConfiguration(levelPlayConfig.n(), levelPlayConfig.j()));
        }
    }

    private final void a(LevelPlayInitRequest levelPlayInitRequest, Sa sa) {
        LevelPlay.AdFormat adFormat = LevelPlay.AdFormat.REWARDED;
        if (a(levelPlayInitRequest, adFormat) && sa.d().c().f() != null) {
            C4340be.a aVar = C4340be.z;
            IronSource.a aVar2 = IronSource.a.REWARDED_VIDEO;
            C4340be a2 = aVar.a(new C4434h0(aVar2, C4637s7.f8524a.a(), "", null, null, null, 56, null), sa, true);
            List<C4732xc> d = sa.d(adFormat);
            E0.b bVar = E0.b.MEDIATION;
            new Cd(new T0(new C4577p0(aVar2, bVar), a2, bVar), adFormat, d, a2).a();
        }
        LevelPlay.AdFormat adFormat2 = LevelPlay.AdFormat.INTERSTITIAL;
        if (a(levelPlayInitRequest, adFormat2) && sa.d().c().d() != null) {
            B9.a aVar3 = B9.z;
            IronSource.a aVar4 = IronSource.a.INTERSTITIAL;
            B9 a3 = aVar3.a(new C4434h0(aVar4, C4637s7.f8524a.a(), "", null, null, null, 56, null), sa, true);
            List<C4732xc> d2 = sa.d(adFormat2);
            E0.b bVar2 = E0.b.MEDIATION;
            new Cd(new T0(new C4577p0(aVar4, bVar2), a3, bVar2), adFormat2, d2, a3).a();
        }
        LevelPlay.AdFormat adFormat3 = LevelPlay.AdFormat.BANNER;
        if (!a(levelPlayInitRequest, adFormat3) || sa.d().c().c() == null) {
            return;
        }
        K2 a4 = K2.z.a(new H2(), sa, true);
        List<C4732xc> d3 = sa.d(adFormat3);
        IronSource.a aVar5 = IronSource.a.BANNER;
        E0.b bVar3 = E0.b.MEDIATION;
        new Cd(new T0(new C4577p0(aVar5, bVar3), a4, bVar3), adFormat3, d3, a4).a();
    }

    private final boolean a(LevelPlayInitRequest levelPlayInitRequest, LevelPlay.AdFormat adFormat) {
        return !levelPlayInitRequest.getLegacyAdFormats().contains(adFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final LevelPlayInitListener levelPlayInitListener, C4385e5 c4385e5, final C4555ne c4555ne) {
        long a2 = C4385e5.a(c4385e5);
        C4659tb c4659tb = b;
        final C4555ne b2 = c4659tb.b(c4555ne);
        C4659tb.a(c4659tb, b2, a2, null, 4, null);
        c4659tb.b(new Runnable() { // from class: com.ironsource.rb$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C4623rb.a(C4555ne.this, levelPlayInitListener, b2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4555ne error, LevelPlayInitListener levelPlayInitListener, C4555ne eventError) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(eventError, "$eventError");
        IronLog.CALLBACK.info("LevelPlayInitListener.LevelPlayInitError() error: " + error);
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitFailed(new LevelPlayInitError(b.a(eventError)));
        }
    }

    public final void a(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList arrayList = new ArrayList();
        arrayList.add(value);
        a(key, arrayList);
    }

    public final void a(String key, List<String> values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, com.ironsource.environment.thread.a.f8176a.a(new c(key, values)), 0L, 2, null);
    }
}
