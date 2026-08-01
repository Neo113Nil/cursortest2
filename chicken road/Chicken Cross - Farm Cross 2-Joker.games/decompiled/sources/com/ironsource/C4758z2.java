package com.ironsource;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.C4758z2;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.ironsource.z2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4758z2 extends B implements BannerAdListener {
    private FrameLayout.LayoutParams A;
    private View z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4758z2(T0 adTools, C instanceData, I adInstancePayload, B2 listener) {
        super(adTools, instanceData, adInstancePayload, null, null, 24, null);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        Intrinsics.checkNotNullParameter(listener, "listener");
        a(listener);
    }

    private final B2 K() {
        F s = s();
        if (s instanceof B2) {
            return (B2) s;
        }
        return null;
    }

    private final ISBannerSize L() {
        T0 f = f();
        AbstractC4720x0 j = n().j();
        Intrinsics.checkNotNull(j, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return f.a(((K2) j).b().i());
    }

    private final void M() {
        C4411fd j = j();
        if (j != null) {
            f().f().a().f(j.c());
        }
        B2 K = K();
        if (K != null) {
            K.a(this);
        }
    }

    private final void N() {
        C4411fd j = j();
        if (j != null) {
            f().f().a().c(j.c());
        }
        B2 K = K();
        if (K != null) {
            K.b(this);
        }
    }

    private final void O() {
        C4411fd j = j();
        if (j != null) {
            f().f().a().h(j.c());
        }
        B2 K = K();
        if (K != null) {
            K.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C4758z2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.O();
    }

    @Override // com.ironsource.B
    protected void C() {
        if (!(g() instanceof AdapterBannerInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
            return;
        }
        AdData i = i();
        ISBannerSize L = L();
        Map<String, Object> adUnitData = i.getAdUnitData();
        Intrinsics.checkNotNullExpressionValue(adUnitData, "adData.adUnitData");
        adUnitData.put(I2.t, new com.ironsource.mediationsdk.o(ContextProvider.getInstance().getApplicationContext(), L));
        Object g = g();
        Intrinsics.checkNotNull(g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
        ((AdapterBannerInterface) g).loadAd(i, ContextProvider.getInstance().getCurrentActiveActivity(), L, this);
    }

    @Override // com.ironsource.B
    public void a(K adInstancePresenter) {
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.a(this);
    }

    @Override // com.ironsource.B
    public void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(q());
        C4659tb.a(f(), new Runnable() { // from class: com.ironsource.z2$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C4758z2.a(C4758z2.this);
            }
        }, 0L, 2, null);
        if (g() == null) {
            ironLog.warning("adapter == null");
        } else {
            c();
            super.b();
        }
    }

    @Override // com.ironsource.B
    public void c() {
        a(new a());
    }

    @Override // com.ironsource.B
    public LevelPlayAdInfo e() {
        String uuid = n().j().b().b().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "instanceData.adUnitData.…roperties.adId.toString()");
        String c = n().j().b().c();
        String aVar = n().i().toString();
        Intrinsics.checkNotNullExpressionValue(aVar, "instanceData.adFormat.toString()");
        C4561o2 o = n().o();
        AbstractC4720x0 j = n().j();
        Intrinsics.checkNotNull(j, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return new LevelPlayAdInfo(uuid, c, aVar, o, ((K2) j).b().i(), n().j().l(), MapsKt.toMap(l()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        f().a(new Runnable() { // from class: com.ironsource.z2$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                C4758z2.b(C4758z2.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(View adView, FrameLayout.LayoutParams frameLayoutParams) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(frameLayoutParams, "frameLayoutParams");
        onAdLoadSuccess(adView, frameLayoutParams, new LinkedHashMap());
    }

    @Override // com.ironsource.B, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(final Map<String, Object> extraData) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        f().a(new Runnable() { // from class: com.ironsource.z2$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                C4758z2.a(C4758z2.this, extraData);
            }
        });
        super.onAdOpened(extraData);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        f().a(new Runnable() { // from class: com.ironsource.z2$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C4758z2.c(C4758z2.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        f().a(new Runnable() { // from class: com.ironsource.z2$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                C4758z2.d(C4758z2.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4758z2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.N();
    }

    public final void a(final Bg viewBinder) {
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        C4659tb.a(f(), new Runnable() { // from class: com.ironsource.z2$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                C4758z2.a(C4758z2.this, viewBinder);
            }
        }, 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(final View adView, final FrameLayout.LayoutParams frameLayoutParams, Map<String, Object> extraData) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(frameLayoutParams, "frameLayoutParams");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        C4659tb.a(f(), new Runnable() { // from class: com.ironsource.z2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4758z2.a(C4758z2.this, adView, frameLayoutParams);
            }
        }, 0L, 2, null);
        super.onAdLoadSuccess(extraData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final C4758z2 this$0, Bg viewBinder) {
        FrameLayout.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewBinder, "$viewBinder");
        View view = this$0.z;
        if (view == null || (layoutParams = this$0.A) == null) {
            return;
        }
        viewBinder.a(view, layoutParams, this$0.f());
        IronLog.INTERNAL.verbose(C4577p0.a(this$0.f(), "Bind banner view", (String) null, 2, (Object) null));
        this$0.f().a(new Runnable() { // from class: com.ironsource.z2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C4758z2.e(C4758z2.this);
            }
        });
    }

    /* renamed from: com.ironsource.z2$a */
    static final class a extends Lambda implements Function0<Unit> {
        a() {
            super(0);
        }

        public final void a() {
            try {
                if (C4758z2.this.g() instanceof AdapterBannerInterface) {
                    Object g = C4758z2.this.g();
                    Intrinsics.checkNotNull(g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<*>");
                    ((AdapterBannerInterface) g).destroyAd(C4758z2.this.i());
                } else {
                    IronLog.INTERNAL.error(C4758z2.this.a("adapter not instance of AdapterBannerInterface"));
                }
            } catch (Throwable th) {
                T0 f = C4758z2.this.f();
                final C4758z2 c4758z2 = C4758z2.this;
                f.a(new Runnable() { // from class: com.ironsource.z2$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4758z2.a.a(th, c4758z2);
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
        public static final void a(Throwable t, C4758z2 this$0) {
            Intrinsics.checkNotNullParameter(t, "$t");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            C4491k4.d().a(t);
            String str = "destroyBanner - exception = " + t.getLocalizedMessage();
            IronLog.INTERNAL.error(this$0.a(str));
            this$0.f().f().h().g(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4758z2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.z = null;
        this$0.A = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4758z2 this$0, View adView, FrameLayout.LayoutParams frameLayoutParams) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adView, "$adView");
        Intrinsics.checkNotNullParameter(frameLayoutParams, "$frameLayoutParams");
        this$0.z = adView;
        this$0.A = frameLayoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C4758z2 this$0) {
        String str;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        O a2 = this$0.f().f().a();
        C4411fd j = this$0.j();
        if (j == null || (str = j.c()) == null) {
            str = "";
        }
        a2.j(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4758z2 this$0, Map extraData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(extraData, "$extraData");
        this$0.l().putAll(extraData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4758z2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.M();
    }
}
