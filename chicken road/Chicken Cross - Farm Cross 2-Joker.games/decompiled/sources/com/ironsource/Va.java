package com.ironsource;

import android.app.Activity;
import com.ironsource.C4386e6;
import com.ironsource.C4577p0;
import com.ironsource.E0;
import com.ironsource.InterfaceC4487k0;
import com.ironsource.V0;
import com.ironsource.Va;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Va implements InterfaceC4368d6 {
    public static final a p = new a(null);
    public static final String q = "Fullscreen Ad Internal";

    /* renamed from: a, reason: collision with root package name */
    private final LevelPlay.AdFormat f7968a;
    private final String b;
    private final b c;
    private final C4577p0 d;
    private final C4350c6 e;
    private final X0 f;
    private final InterfaceC4738y0 g;
    private final F7 h;
    private final InterfaceC4527m4 i;
    private C4332b6 j;
    private Wa k;
    private final W8 l;
    private final UUID m;
    private InterfaceC4547n6 n;
    private C4385e5 o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(final String placementName, LevelPlay.AdFormat adFormat) {
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            final C4577p0 a2 = C4577p0.a.a(com.unity3d.mediation.a.a(adFormat), E0.b.MEDIATION);
            if (!a2.a()) {
                a2.a(new Runnable() { // from class: com.ironsource.Va$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Va.a.a(C4577p0.this, placementName);
                    }
                });
                return false;
            }
            final D3 a3 = Ib.v.d().p().a(placementName, adFormat);
            final boolean d = a3.d();
            a2.a(new Runnable() { // from class: com.ironsource.Va$a$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    Va.a.a(C4577p0.this, placementName, a3, d);
                }
            });
            return d;
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4577p0 adTools, String placementName) {
            Intrinsics.checkNotNullParameter(adTools, "$adTools");
            Intrinsics.checkNotNullParameter(placementName, "$placementName");
            adTools.f().a().a(placementName, W0.b, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4577p0 adTools, String placementName, D3 cappingStatus, boolean z) {
            Intrinsics.checkNotNullParameter(adTools, "$adTools");
            Intrinsics.checkNotNullParameter(placementName, "$placementName");
            Intrinsics.checkNotNullParameter(cappingStatus, "$cappingStatus");
            adTools.f().a().a(placementName, cappingStatus.e(), z);
        }
    }

    public interface b {
        Double getBidFloor();
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final C4577p0 f7969a;
        private final C4350c6 b;
        private final F7 c;
        private final InterfaceC4527m4 d;
        private final C4637s7 e;
        private final b f;
        private final X0 g;

        public c(C4577p0 adTools, C4350c6 adControllerFactory, F7 provider, InterfaceC4527m4 currentTimeProvider, C4637s7 idFactory, b config, X0 adUnitValidator) {
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
            Intrinsics.checkNotNullParameter(idFactory, "idFactory");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(adUnitValidator, "adUnitValidator");
            this.f7969a = adTools;
            this.b = adControllerFactory;
            this.c = provider;
            this.d = currentTimeProvider;
            this.e = idFactory;
            this.f = config;
            this.g = adUnitValidator;
        }

        public final C4350c6 a() {
            return this.b;
        }

        public final C4577p0 b() {
            return this.f7969a;
        }

        public final X0 c() {
            return this.g;
        }

        public final b d() {
            return this.f;
        }

        public final InterfaceC4527m4 e() {
            return this.d;
        }

        public final C4637s7 f() {
            return this.e;
        }

        public final F7 g() {
            return this.c;
        }
    }

    public static final class d implements InterfaceC4583p6 {
        final /* synthetic */ C4434h0 b;

        d(C4434h0 c4434h0) {
            this.b = c4434h0;
        }

        @Override // com.ironsource.InterfaceC4583p6
        public C4565o6 a(boolean z, InterfaceC4618r6 listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            AbstractC4720x0 a2 = Va.this.g().a(z, this.b);
            return new C4565o6(Ib.v.c(), new T0(Va.this.f(), a2, E0.b.MEDIATION), a2, listener, Va.this.l, null, null, null, null, 480, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Va(LevelPlay.AdFormat adFormat, String adUnitId, b config, C4577p0 adTools, C4350c6 fullscreenAdControllerFactory, X0 adUnitValidator, InterfaceC4738y0 adUnitDataFactory, F7 mediationServicesProvider, InterfaceC4527m4 currentTimeProvider, C4637s7 idFactory) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(fullscreenAdControllerFactory, "fullscreenAdControllerFactory");
        Intrinsics.checkNotNullParameter(adUnitValidator, "adUnitValidator");
        Intrinsics.checkNotNullParameter(adUnitDataFactory, "adUnitDataFactory");
        Intrinsics.checkNotNullParameter(mediationServicesProvider, "mediationServicesProvider");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(idFactory, "idFactory");
        this.f7968a = adFormat;
        this.b = adUnitId;
        this.c = config;
        this.d = adTools;
        this.e = fullscreenAdControllerFactory;
        this.f = adUnitValidator;
        this.g = adUnitDataFactory;
        this.h = mediationServicesProvider;
        this.i = currentTimeProvider;
        this.l = new W8(adTools);
        this.m = idFactory.a();
        this.n = new C4386e6(this, null, 2, 0 == true ? 1 : 0);
        adTools.a(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                Va.a(Va.this);
            }
        });
    }

    private final void p() {
        Double bidFloor = this.c.getBidFloor();
        if (bidFloor != null) {
            this.d.f().f().a(bidFloor.doubleValue());
        }
    }

    public final void a(Wa wa) {
        this.k = wa;
    }

    public final C4332b6 c() {
        C4332b6 c4332b6 = this.j;
        if (c4332b6 != null) {
            return c4332b6;
        }
        C4332b6 b2 = b();
        this.j = b2;
        return b2;
    }

    public final LevelPlay.AdFormat d() {
        return this.f7968a;
    }

    public final UUID e() {
        return this.m;
    }

    public final C4577p0 f() {
        return this.d;
    }

    public final InterfaceC4738y0 g() {
        return this.g;
    }

    public final String h() {
        return this.b;
    }

    public final b i() {
        return this.c;
    }

    public final InterfaceC4527m4 j() {
        return this.i;
    }

    public final Wa k() {
        return this.k;
    }

    public final F7 l() {
        return this.h;
    }

    public final boolean m() {
        final InterfaceC4487k0 c2 = this.n.c();
        this.d.a(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                Va.a(InterfaceC4487k0.this, this);
            }
        });
        return c2.a();
    }

    public final void n() {
        this.o = new C4385e5();
        this.d.a(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                Va.c(Va.this);
            }
        });
    }

    public final void o() {
        a(new C4493k6(this, this.i));
        c().b();
    }

    @Override // com.ironsource.InterfaceC4368d6
    public void onAdClicked() {
        this.n.onAdClicked();
    }

    @Override // com.ironsource.InterfaceC4368d6
    public void onAdClosed() {
        this.n.onAdClosed();
    }

    @Override // com.ironsource.InterfaceC4368d6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.n.onAdDisplayed(adInfo);
    }

    @Override // com.ironsource.InterfaceC4368d6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.n.onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.InterfaceC4368d6
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.n.onAdLoadFailed(error);
    }

    @Override // com.ironsource.InterfaceC4368d6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.n.onAdLoaded(adInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Va this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.d.f().a(new C4540n(com.unity3d.mediation.a.a(this$0.f7968a), this$0.m, this$0.b));
        this$0.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Va this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.d.f().f().a();
        this$0.n.loadAd();
    }

    public final void b(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.d.f().h().f("Fullscreen Ad Internal - " + message);
    }

    private final C4332b6 b() {
        C4434h0 c4434h0 = new C4434h0(com.unity3d.mediation.a.a(this.f7968a), this.m, this.b, null, this.h.A().a(), this.c.getBidFloor(), 8, null);
        d dVar = new d(c4434h0);
        C4725x5 f = this.d.f();
        C4577p0 c4577p0 = this.d;
        f.a(new C0(c4577p0, c4434h0, c4577p0.b(this.f7968a, this.b).b().b()));
        return this.e.a(this, this.d, c4434h0, dVar);
    }

    public final void a(InterfaceC4547n6 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.n = state;
    }

    public final void a(final LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        IronLog.INTERNAL.verbose(C4577p0.a(this.d, "setImpressionDataListener listener: " + levelPlayImpressionDataListener, (String) null, 2, (Object) null));
        this.d.a(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                Va.a(Va.this, levelPlayImpressionDataListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Va this$0, LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.l.a(levelPlayImpressionDataListener);
    }

    public final void a(final Activity activity, final String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.d.a(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Va.a(activity, this, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Activity activity, Va this$0, String str) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ContextProvider.getInstance().updateActivity(activity);
        this$0.d.f().h().c();
        this$0.n.a(activity, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4487k0 status, Va this$0) {
        Intrinsics.checkNotNullParameter(status, "$status");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.d.f().e().a(Boolean.valueOf(status.a()), status instanceof InterfaceC4487k0.a ? ((InterfaceC4487k0.a) status).c() : null);
    }

    public final void a(C4386e6.a status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.n = new C4386e6(this, status);
    }

    @Override // com.ironsource.InterfaceC4368d6
    public void a(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.n.a(error);
    }

    @Override // com.ironsource.InterfaceC4368d6
    public void a() {
        this.n.a();
    }

    @Override // com.ironsource.InterfaceC4368d6
    public void a(final LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        final LevelPlayAdInfo b2 = this.n.b();
        IronLog.INTERNAL.verbose(C4577p0.a(this.d, "onAdRewarded adInfo: " + b2 + " reward: " + reward, (String) null, 2, (Object) null));
        this.d.b(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                Va.a(Va.this, reward, b2);
            }
        });
    }

    public /* synthetic */ Va(LevelPlay.AdFormat adFormat, String str, b bVar, C4577p0 c4577p0, C4350c6 c4350c6, X0 x0, InterfaceC4738y0 interfaceC4738y0, F7 f7, InterfaceC4527m4 interfaceC4527m4, C4637s7 c4637s7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(adFormat, str, bVar, c4577p0, c4350c6, x0, interfaceC4738y0, (i & 128) != 0 ? Ib.v.d() : f7, interfaceC4527m4, c4637s7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Va this$0, LevelPlayReward reward, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(reward, "$reward");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Wa wa = this$0.k;
        if (wa != null) {
            wa.onAdRewarded(reward, adInfo);
        }
    }

    public final void a(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        IronLog.INTERNAL.verbose(C4577p0.a(this.d, "onAdLoaded adInfo: " + adInfo, (String) null, 2, (Object) null));
        final long a2 = C4385e5.a(this.o);
        this.d.a(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Va.a(Va.this, a2);
            }
        });
        this.d.b(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                Va.a(Va.this, adInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Va this$0, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.d.f().f().a(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Va this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Wa wa = this$0.k;
        if (wa != null) {
            wa.onAdLoaded(adInfo);
        }
    }

    public static /* synthetic */ void a(Va va, LevelPlayAdError levelPlayAdError, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        va.a(levelPlayAdError, j);
    }

    public final void a(final LevelPlayAdError levelPlayAdError, final long j) {
        IronLog.INTERNAL.verbose(C4577p0.a(this.d, "onAdLoadFailed error: " + levelPlayAdError, (String) null, 2, (Object) null));
        this.d.a(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                Va.a(Va.this, j, levelPlayAdError);
            }
        });
        this.d.b(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                Va.a(LevelPlayAdError.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Va this$0, long j, LevelPlayAdError levelPlayAdError) {
        String str;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Sc f = this$0.d.f().f();
        int errorCode = levelPlayAdError != null ? levelPlayAdError.getErrorCode() : 0;
        if (levelPlayAdError == null || (str = levelPlayAdError.getErrorMessage()) == null) {
            str = "";
        }
        f.a(j, errorCode, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdError levelPlayAdError, Va this$0) {
        Wa wa;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (levelPlayAdError == null || (wa = this$0.k) == null) {
            return;
        }
        wa.onAdLoadFailed(levelPlayAdError);
    }

    public final void a(final LevelPlayAdError error, final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        IronLog.INTERNAL.verbose(C4577p0.a(this.d, "onAdDisplayFailed error: " + error + ", adInfo: " + adInfo, (String) null, 2, (Object) null));
        this.d.a(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                Va.a(Va.this, error);
            }
        });
        this.d.b(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                Va.a(Va.this, error, adInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Va this$0, LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.d.f().h().a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Va this$0, LevelPlayAdError error, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Wa wa = this$0.k;
        if (wa != null) {
            wa.onAdDisplayFailed(error, adInfo);
        }
    }

    public final LevelPlayReward a(final String str) {
        L7 D = this.h.D();
        F8 f = this.h.f();
        final Sc f2 = this.d.f().f();
        final V0 a2 = this.f.a(this.b, this.f7968a, f);
        if (a2 instanceof V0.a) {
            IronLog.INTERNAL.warning(C4577p0.a(this.d, "getReward() returned a default reward. Reason: " + ((V0.a) a2).b(), (String) null, 2, (Object) null));
            final LevelPlayReward levelPlayReward = new LevelPlayReward("", 0);
            this.d.a(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    Va.a(Sc.this, levelPlayReward, str, a2);
                }
            });
            return levelPlayReward;
        }
        final LevelPlayReward a3 = D.a(str, this.b);
        this.d.a(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                Va.a(Sc.this, a3, str);
            }
        });
        return a3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Sc operationalEventSender, LevelPlayReward defaultReward, String str, V0 validationResult) {
        Intrinsics.checkNotNullParameter(operationalEventSender, "$operationalEventSender");
        Intrinsics.checkNotNullParameter(defaultReward, "$defaultReward");
        Intrinsics.checkNotNullParameter(validationResult, "$validationResult");
        operationalEventSender.a(defaultReward, str, ((V0.a) validationResult).b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Sc operationalEventSender, LevelPlayReward reward, String str) {
        Intrinsics.checkNotNullParameter(operationalEventSender, "$operationalEventSender");
        Intrinsics.checkNotNullParameter(reward, "$reward");
        Sc.a(operationalEventSender, reward, str, null, 4, null);
    }
}
