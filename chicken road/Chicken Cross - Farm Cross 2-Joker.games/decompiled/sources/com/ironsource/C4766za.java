package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ironsource.E0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.mediation.R;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.LevelPlayAdSize;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import java.util.UUID;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.za, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4766za implements InterfaceC4722x2 {
    public static final a o = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final UUID f8795a;
    private final String b;
    private final U2 c;
    private final LevelPlayBannerAdView.Config d;
    private final C4577p0 e;
    private final W8 f;
    private final O8 g;
    private final LevelPlayAdSize h;
    private LevelPlayBannerAdViewListener i;
    private final String j;
    private C4712wa k;
    private Boolean l;
    private C4411fd m;
    private boolean n;

    /* renamed from: com.ironsource.za$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Pair<String, LevelPlayBannerAdView.Config> a(Context context, AttributeSet attributeSet) {
            Intrinsics.checkNotNullParameter(context, "context");
            String str = "";
            if (attributeSet == null) {
                return TuplesKt.to("", LevelPlayBannerAdView.Config.Companion.empty());
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LevelPlayBannerAdView);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…le.LevelPlayBannerAdView)");
            try {
                LevelPlayBannerAdView.Config.Builder builder = new LevelPlayBannerAdView.Config.Builder();
                if (obtainStyledAttributes.hasValue(R.styleable.LevelPlayBannerAdView_bidFloor)) {
                    builder.setBidFloor(obtainStyledAttributes.getFloat(R.styleable.LevelPlayBannerAdView_bidFloor, -1.0f));
                }
                String string = obtainStyledAttributes.getString(R.styleable.LevelPlayBannerAdView_adSize);
                if (string != null) {
                    builder.setAdSize(LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(string));
                }
                String string2 = obtainStyledAttributes.getString(R.styleable.LevelPlayBannerAdView_adUnitId);
                if (string2 != null) {
                    str = string2;
                }
                return TuplesKt.to(str, builder.build());
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        private a() {
        }
    }

    public C4766za(UUID adId, String adUnitId, U2 bannerContainer, LevelPlayBannerAdView.Config config, C4577p0 adTools, W8 impressionDataListenerHolder) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(impressionDataListenerHolder, "impressionDataListenerHolder");
        this.f8795a = adId;
        this.b = adUnitId;
        this.c = bannerContainer;
        this.d = config;
        this.e = adTools;
        this.f = impressionDataListenerHolder;
        this.g = Ib.v.d().A();
        LevelPlayAdSize adSize = config.getAdSize();
        this.h = adSize == null ? LevelPlayAdSize.BANNER : adSize;
        String placementName = config.getPlacementName();
        this.j = placementName == null ? "" : placementName;
        adTools.a(new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                C4766za.a(C4766za.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4766za this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.e.f().a(new C4540n(IronSource.a.BANNER, this$0.f8795a, this$0.b));
        Double bidFloor = this$0.d.getBidFloor();
        if (bidFloor != null) {
            this$0.e.f().f().a(bidFloor.doubleValue());
        }
    }

    private final boolean h() {
        if (this.b.length() == 0) {
            String uuid = this.f8795a.toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "adId.toString()");
            a(new LevelPlayAdError(uuid, this.b, LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"));
            return false;
        }
        if (!this.e.a()) {
            String uuid2 = this.f8795a.toString();
            Intrinsics.checkNotNullExpressionValue(uuid2, "adId.toString()");
            a(new LevelPlayAdError(uuid2, this.b, LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "load must be called after init success callback"));
            return false;
        }
        Sa a2 = Ib.v.d().f().a();
        if (a2 != null && a2.a(this.b, LevelPlay.AdFormat.BANNER)) {
            return true;
        }
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this.i;
        if (levelPlayBannerAdViewListener != null) {
            String uuid3 = this.f8795a.toString();
            Intrinsics.checkNotNullExpressionValue(uuid3, "adId.toString()");
            levelPlayBannerAdViewListener.onAdLoadFailed(new LevelPlayAdError(uuid3, this.b, LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"));
        }
        return false;
    }

    public final void b() {
        IronLog.API.info("LevelPlayBannerAdView.destroyBanner()");
        this.e.a(new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                C4766za.b(C4766za.this);
            }
        });
    }

    public final UUID c() {
        return this.f8795a;
    }

    public final LevelPlayAdSize d() {
        return this.h;
    }

    public final String e() {
        return this.b;
    }

    public final LevelPlayBannerAdViewListener f() {
        return this.i;
    }

    public final String g() {
        return this.j;
    }

    public final void i() {
        IronLog.API.info("LevelPlayBannerAdView.loadAd()");
        this.e.a(new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C4766za.d(C4766za.this);
            }
        });
    }

    public final void j() {
        Unit unit;
        IronLog.API.info("LevelPlayBannerAdView.pauseAutoRefresh()");
        final C4712wa c4712wa = this.k;
        if (c4712wa != null) {
            this.e.a(new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    C4766za.a(C4766za.this, c4712wa);
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.l = Boolean.FALSE;
        }
    }

    public final void k() {
        Unit unit;
        IronLog.API.info("LevelPlayBannerAdView.resumeAutoRefresh()");
        final C4712wa c4712wa = this.k;
        if (c4712wa != null) {
            this.e.a(new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    C4766za.b(C4766za.this, c4712wa);
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.l = Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4766za this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.c.removeAllViews();
        ViewParent parent = this$0.c.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this$0.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C4766za this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.n) {
            IronLog.INTERNAL.warning(C4577p0.a(this$0.e, "Banner load already called", (String) null, 2, (Object) null));
            return;
        }
        this$0.n = true;
        if (this$0.h()) {
            C4712wa a2 = this$0.a();
            this$0.k = a2;
            Boolean bool = this$0.l;
            if (bool != null) {
                if (bool.booleanValue()) {
                    a2.f();
                } else {
                    a2.d();
                }
            }
            a2.b();
        }
    }

    @Override // com.ironsource.InterfaceC4722x2
    public void e(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.b(new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C4766za.c(LevelPlayAdInfo.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final C4766za this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.n) {
            IronLog.INTERNAL.warning(C4577p0.a(this$0.e, "Banner not loaded", (String) null, 2, (Object) null));
            return;
        }
        if (this$0.k == null) {
            IronLog.INTERNAL.warning(C4577p0.a(this$0.e, "Banner already destroyed", (String) null, 2, (Object) null));
            return;
        }
        C4659tb.a(this$0.e, new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                C4766za.c(C4766za.this);
            }
        }, 0L, 2, null);
        C4712wa c4712wa = this$0.k;
        if (c4712wa != null) {
            c4712wa.c();
        }
        this$0.k = null;
        this$0.l = null;
        this$0.i = null;
        this$0.f.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(LevelPlayAdInfo adInfo, C4766za this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenPresented() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.i;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdExpanded(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(LevelPlayAdInfo adInfo, C4766za this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLeftApplication() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.i;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLeftApplication(adInfo);
        }
    }

    public final void a(final LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        IronLog.API.info("LevelPlayBannerAdView.setBannerListener()");
        this.e.a(new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                C4766za.a(C4766za.this, levelPlayBannerAdViewListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4766za this$0, LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.i = levelPlayBannerAdViewListener;
    }

    @Override // com.ironsource.InterfaceC4722x2
    public void c(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.b(new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                C4766za.d(LevelPlayAdInfo.this, this);
            }
        });
    }

    public final void a(final LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        IronLog.API.info("LevelPlayBannerAdView.setImpressionDataListener()");
        this.e.a(new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C4766za.a(C4766za.this, levelPlayImpressionDataListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4766za this$0, LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f.a(levelPlayImpressionDataListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4766za this$0, C4712wa it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.e.f().f().b();
        it.d();
    }

    private final C4712wa a() {
        C4411fd c4411fd;
        this.m = this.e.a(this.j);
        Context context = this.c.getContext();
        if (context instanceof Activity) {
            ContextProvider.getInstance().updateActivity((Activity) context);
        }
        UUID uuid = this.f8795a;
        String str = this.b;
        C4411fd c4411fd2 = this.m;
        C4411fd c4411fd3 = null;
        if (c4411fd2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerPlacement");
            c4411fd = null;
        } else {
            c4411fd = c4411fd2;
        }
        H2 h2 = new H2(uuid, str, c4411fd, this.h, null, null, this.g.a(), this.d.getBidFloor(), 48, null);
        this.e.f().a(new C0(this.e, h2, null, 4, null));
        ISBannerSize a2 = this.e.a(h2.i());
        C4725x5 f = this.e.f();
        C4577p0 c4577p0 = this.e;
        C4411fd c4411fd4 = this.m;
        if (c4411fd4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerPlacement");
        } else {
            c4411fd3 = c4411fd4;
        }
        f.a(new W2(c4577p0, a2, c4411fd3.c()));
        return new C4712wa(this, this.e, h2, this.c, this.f);
    }

    @Override // com.ironsource.InterfaceC4722x2
    public void d(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.b(new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                C4766za.a(LevelPlayAdInfo.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(LevelPlayAdInfo adInfo, C4766za this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenDismissed() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.i;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdCollapsed(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4766za this$0, C4712wa it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.e.f().f().c();
        it.f();
    }

    @Override // com.ironsource.InterfaceC4722x2
    public void b(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.b(new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                C4766za.b(LevelPlayAdInfo.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(LevelPlayAdInfo adInfo, C4766za this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayed() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.i;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayed(adInfo);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C4766za(UUID uuid, String str, U2 u2, LevelPlayBannerAdView.Config config, C4577p0 c4577p0, W8 w8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, str, u2, config, r5, (i & 32) != 0 ? new W8(r5) : w8);
        UUID a2 = (i & 1) != 0 ? C4637s7.f8524a.a() : uuid;
        C4577p0 c4577p02 = (i & 16) != 0 ? new C4577p0(IronSource.a.BANNER, E0.b.MEDIATION) : c4577p0;
    }

    @Override // com.ironsource.InterfaceC4722x2
    public void a(final LevelPlayAdInfo adInfo, final boolean z) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.b(new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                C4766za.a(z, adInfo, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(boolean z, LevelPlayAdInfo adInfo, C4766za this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoaded() isReload: " + z + " adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.i;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoaded(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC4722x2
    public void a(final LevelPlayAdError levelPlayAdError) {
        if (levelPlayAdError != null) {
            this.e.b(new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    C4766za.a(LevelPlayAdError.this, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdError it, C4766za this$0) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoadFailed() error: " + it);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.i;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoadFailed(it);
        }
    }

    @Override // com.ironsource.InterfaceC4722x2
    public void a(final LevelPlayAdInfo adInfo, final LevelPlayAdError levelPlayAdError) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (levelPlayAdError != null) {
            this.e.b(new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C4766za.a(LevelPlayAdInfo.this, levelPlayAdError, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdInfo adInfo, LevelPlayAdError it, C4766za this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayFailed() adInfo " + adInfo + " error: " + it);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.i;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayFailed(adInfo, it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdInfo adInfo, C4766za this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdClicked() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.i;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdClicked(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC4722x2
    public void a(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.b(new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                C4766za.e(LevelPlayAdInfo.this, this);
            }
        });
    }
}
