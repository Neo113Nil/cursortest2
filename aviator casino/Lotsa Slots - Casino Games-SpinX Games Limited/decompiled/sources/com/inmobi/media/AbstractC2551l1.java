package com.inmobi.media;

/* renamed from: com.inmobi.media.l1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2551l1 extends com.inmobi.media.AbstractC2726ri implements com.inmobi.media.F2, com.inmobi.media.Dk, com.inmobi.media.InterfaceC2842w0, com.inmobi.media.Io {
    public static final /* synthetic */ int E = 0;
    public com.inmobi.ads.WatermarkData A;
    public final kotlin.Lazy B;
    public boolean C;
    public final kotlin.Lazy D;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5305a;
    public volatile byte b;
    public final com.inmobi.media.core.config.models.AdConfig c;
    public java.lang.ref.WeakReference d;
    public com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations e;
    public java.lang.ref.WeakReference f;
    public final com.inmobi.media.Fa g;
    public java.util.concurrent.CopyOnWriteArrayList h;
    public com.inmobi.media.C2799u9 i;
    public android.os.Handler j;
    public boolean k;
    public com.inmobi.media.C2816v0 l;
    public com.inmobi.media.ads.network.common.model.AdResponse m;
    public com.inmobi.media.Fk n;
    public int o;
    public int p;
    public long q;
    public final java.util.TreeSet r;
    public boolean s;
    public java.lang.String t;
    public com.inmobi.media.C2287b0 u;
    public com.inmobi.media.C2586ma v;
    public com.inmobi.media.C2828vc w;
    public final android.os.Handler x;
    public final java.util.LinkedHashMap y;
    public final com.inmobi.media.C2709r1 z;

    public AbstractC2551l1(android.content.Context context, com.inmobi.media.C2816v0 adPlacement, com.inmobi.media.Uk uk) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adPlacement, "adPlacement");
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        this.f5305a = uuid;
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.AdConfig.class, "clazz");
        this.c = (com.inmobi.media.core.config.models.AdConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.AdConfig.class);
        this.g = (com.inmobi.media.Fa) com.inmobi.media.Ga.f4723a.getValue();
        this.h = new java.util.concurrent.CopyOnWriteArrayList();
        this.l = adPlacement;
        this.q = -1L;
        this.r = new java.util.TreeSet();
        this.x = new android.os.Handler(android.os.Looper.getMainLooper());
        this.y = new java.util.LinkedHashMap();
        this.z = new com.inmobi.media.C2709r1(this);
        this.B = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.l1$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.AbstractC2551l1.d(com.inmobi.media.AbstractC2551l1.this);
            }
        });
        this.d = new java.lang.ref.WeakReference(context);
        this.f = new java.lang.ref.WeakReference(uk);
        com.inmobi.media.Ib ib = com.inmobi.media.Sh.f4959a;
        com.inmobi.media.Sh.a(uk, this.i);
        java.lang.ref.WeakReference weakReference = this.f;
        java.lang.String m = m();
        com.inmobi.media.ads.network.common.model.AdSet s = s();
        this.u = new com.inmobi.media.C2287b0(weakReference, m, s != null ? s.getIsRewarded() : false);
        M();
        this.D = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.l1$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.AbstractC2551l1.e(com.inmobi.media.AbstractC2551l1.this);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0021, code lost:
    
        if (r3 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(com.inmobi.media.AbstractC2551l1 abstractC2551l1) {
        com.inmobi.media.core.config.models.AdConfig.OmidConfig omidConfig;
        com.inmobi.media.Kf kf = com.inmobi.media.Jf.f4781a;
        android.content.Context o = abstractC2551l1.o();
        com.inmobi.media.core.config.models.AdConfig adConfig = abstractC2551l1.c;
        kf.getClass();
        try {
            if (!com.iab.omid.library.inmobi.Omid.isActive()) {
                com.iab.omid.library.inmobi.Omid.activate(o);
                return;
            }
            if (adConfig != null) {
                try {
                    com.inmobi.media.core.config.models.AdConfig.ViewabilityConfig viewability = adConfig.getViewability();
                    if (viewability != null) {
                        omidConfig = viewability.getOmidConfig();
                    }
                } catch (java.lang.Exception e) {
                    kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
                    com.inmobi.media.W9.a(new com.inmobi.media.M2(e));
                    return;
                }
            }
            omidConfig = new com.inmobi.media.core.config.models.AdConfig.OmidConfig();
            kf.b = com.iab.omid.library.inmobi.adsession.Partner.createPartner(omidConfig.getPartnerKey(), kf.a());
        } catch (java.lang.Exception e2) {
            kotlin.Lazy lazy2 = com.inmobi.media.W9.f5027a;
            com.inmobi.media.AbstractC2665p9.a(e2);
        }
    }

    public static final com.inmobi.media.Bo d(com.inmobi.media.AbstractC2551l1 abstractC2551l1) {
        return new com.inmobi.media.Bo(abstractC2551l1.i);
    }

    public final boolean A() {
        com.inmobi.media.core.config.models.AdConfig.CacheConfig cacheConfig;
        com.inmobi.media.C2799u9 c2799u9;
        com.inmobi.media.ads.network.common.model.Ad b = b(0);
        if (b == null) {
            return false;
        }
        com.inmobi.media.core.config.models.AdConfig adConfig = this.c;
        if (adConfig != null && (cacheConfig = adConfig.getCacheConfig(m())) != null) {
            r0 = ((b.getExpiryTimestampInMillis() > (-1L) ? 1 : (b.getExpiryTimestampInMillis() == (-1L) ? 0 : -1)) == 0 ? java.util.concurrent.TimeUnit.SECONDS.toMillis(cacheConfig.getTimeToLive()) + b.getInsertionTimestampInMillis() : b.getExpiryTimestampInMillis()) - java.lang.System.currentTimeMillis() < 0;
            if (r0 && (c2799u9 = this.i) != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c2799u9.b("l1", "Top ad has expired, failing show of ad.");
            }
        }
        return r0;
    }

    public final void B() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.a("l1", "initTelemetry " + this);
        }
        this.y.put("AdImpressionSuccessful", this.z);
    }

    public final boolean C() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "isBlockingStateForLoadWithResponse getter " + this + " state=" + ((int) this.b));
        }
        if (!com.inmobi.media.AbstractC2268a7.a()) {
            d();
            b(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED), true, (short) 2141);
            return true;
        }
        if (F()) {
            com.inmobi.media.C2799u9 c2799u92 = this.i;
            if (c2799u92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c2799u92.b("l1", "Some of the dependency libraries for " + m() + " not found");
            }
            b(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return true;
        }
        byte b = this.b;
        if (b == 1) {
            com.inmobi.media.C2799u9 c2799u93 = this.i;
            if (c2799u93 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c2799u93.b("l1", "load with reasponse called while loading");
            }
            b(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING), false, (short) 2001);
            return true;
        }
        if (b != 7) {
            return false;
        }
        com.inmobi.media.C2799u9 c2799u94 = this.i;
        if (c2799u94 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u94.b("l1", "ad active before load");
        }
        b(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2003);
        return true;
    }

    public void D() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "load  " + this);
        }
        com.inmobi.media.C2709r1 c2709r1 = this.z;
        c2709r1.getClass();
        c2709r1.c = android.os.SystemClock.elapsedRealtime();
        a(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.l1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.AbstractC2551l1.a(com.inmobi.media.AbstractC2551l1.this);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.l1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.AbstractC2551l1.a(com.inmobi.media.AbstractC2551l1.this, (com.inmobi.media.EnumC2372e6) obj);
            }
        });
    }

    public final void E() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.a("l1", "makeUnitActive " + this);
        }
        this.k = false;
    }

    public boolean F() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "missingPrerequisitesForAd " + this);
        }
        try {
            kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.browser.customtabs.CustomTabsClient.class).getSimpleName();
            return false;
        } catch (java.lang.NoClassDefFoundError unused) {
            return true;
        }
    }

    public void G() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "onDidParseAfterFetch " + this);
        }
        c((byte) 2);
        android.os.Handler handler = this.j;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.inmobi.media.l1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.inmobi.media.AbstractC2551l1.c(com.inmobi.media.AbstractC2551l1.this);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        if (com.inmobi.media.Xi.f != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.inmobi.media.Te H() {
        boolean z;
        java.lang.Integer num;
        java.lang.Integer num2;
        java.lang.Integer num3;
        com.inmobi.media.core.config.models.AdConfig.RenderingConfig rendering;
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.a("l1", "prepareAdRequest " + this);
        }
        android.content.Context o = o();
        com.inmobi.media.C2619nf c2619nf = o != null ? new com.inmobi.media.C2619nf(o, this.i) : null;
        java.lang.String str = this.l.g;
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        this.l.getClass();
        com.inmobi.media.C2816v0 c2816v0 = this.l;
        java.util.Map map = c2816v0.c;
        long j = c2816v0.f5497a;
        java.lang.String str2 = c2816v0.i;
        java.lang.String m = m();
        java.util.HashMap l = l();
        java.lang.String str3 = this.l.d;
        com.inmobi.media.core.config.models.AdConfig adConfig = this.c;
        if (adConfig != null && (rendering = adConfig.getRendering()) != null) {
            z = true;
            if (rendering.getEnablePubMuteControl()) {
            }
        }
        z = false;
        com.inmobi.media.C2602n0 c2602n0 = new com.inmobi.media.C2602n0(str, map, j, str2, m, l, str3, z);
        com.inmobi.media.C2828vc c2828vc = this.w;
        int i = 15000;
        long intValue = (c2828vc == null || (num3 = c2828vc.d) == null) ? 15000 : num3.intValue();
        com.inmobi.media.C2828vc c2828vc2 = this.w;
        long intValue2 = (c2828vc2 == null || (num2 = c2828vc2.d) == null) ? 15000 : num2.intValue();
        com.inmobi.media.C2828vc c2828vc3 = this.w;
        if (c2828vc3 != null && (num = c2828vc3.d) != null) {
            i = num.intValue();
        }
        com.inmobi.media.Gk gk = new com.inmobi.media.Gk(intValue, intValue2, i);
        com.inmobi.media.core.config.models.AdConfig adConfig2 = this.c;
        java.lang.String url = adConfig2 != null ? adConfig2.getUrl() : null;
        com.inmobi.media.core.config.models.AdConfig adConfig3 = this.c;
        kotlin.jvm.internal.Intrinsics.checkNotNull(adConfig3);
        com.inmobi.media.Rk rk = new com.inmobi.media.Rk(adConfig3.getIncludeIds());
        com.inmobi.media.C2565lf a2 = c2619nf != null ? c2619nf.a() : null;
        com.inmobi.media.C2799u9 c2799u92 = this.i;
        com.inmobi.media.core.config.models.AdConfig adConfig4 = this.c;
        return new com.inmobi.media.C2656p0(url, rk, c2602n0, gk, a2, c2799u92, adConfig4 != null ? adConfig4.getApplyGzipReq() : false).a();
    }

    public final void I() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "printPublisherTestId " + this);
        }
        com.inmobi.media.Qk.b();
    }

    public void J() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.a("l1", "resetContainersForNextAd " + this);
        }
        int size = this.h.size();
        int i = this.p;
        if (size <= i || this.h.get(i) == null) {
            return;
        }
        a(this.p, false);
    }

    public final void K() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.d("l1", "AdUnit " + this + " state - FAILED");
        }
        c((byte) 3);
        b((byte) 1);
    }

    public void L() {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("activity", "monetizationContext");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "setMonetizationContext " + this);
        }
        com.inmobi.media.C2816v0 c2816v0 = this.l;
        c2816v0.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("activity", "<set-?>");
        c2816v0.i = "activity";
    }

    public final void M() {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
        toString();
        this.e = z();
        c((byte) 0);
        this.j = new android.os.Handler(android.os.Looper.getMainLooper());
        this.n = new com.inmobi.media.Fk(this);
    }

    public final boolean N() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "shouldBlockLoadAd " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(0);
        if (b != null && 4 == this.b && !A()) {
            com.inmobi.media.AbstractC2421g1 n = n();
            if (n != null) {
                com.inmobi.media.C2799u9 c2799u92 = this.i;
                if (c2799u92 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                    c2799u92.a("l1", "ad is ready - load success");
                }
                d(n);
            } else {
                c((short) 2188);
            }
            return true;
        }
        if (b == null) {
            b(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2131);
            com.inmobi.media.C2799u9 c2799u93 = this.i;
            if (c2799u93 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c2799u93.b("l1", "ad no longer available");
            }
            return true;
        }
        if (2 == this.b) {
            if (!A()) {
                return false;
            }
            b(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2133);
            com.inmobi.media.C2799u9 c2799u94 = this.i;
            if (c2799u94 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c2799u94.b("l1", "ad is expired");
            }
            return true;
        }
        b(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2132);
        com.inmobi.media.C2799u9 c2799u95 = this.i;
        if (c2799u95 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u95.b("l1", "ad no longer available. state - " + ((int) this.b));
        }
        return true;
    }

    public final void O() {
        java.util.LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        com.inmobi.media.ads.network.common.model.Ad ad;
        int i;
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "startLoadingHTMLAd " + this);
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = null;
        try {
            com.inmobi.media.ads.network.common.model.AdSet s = s();
            com.inmobi.media.ads.network.common.model.Ad ad2 = (s == null || (i = this.o) < 0 || i >= s.getAds().size()) ? null : s.getAds().get(this.o);
            d(this.o);
            com.inmobi.media.C2799u9 c2799u92 = this.i;
            if (c2799u92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                com.inmobi.media.ads.network.common.model.AdSet s2 = s();
                c2799u92.a("l1", "Loading ad with impressionId : " + ((s2 == null || (ads = s2.getAds()) == null || (ad = ads.get(this.o)) == null) ? null : ad.getImpressionId()));
            }
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi2 = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) this.h.get(this.o);
            if (ad2 != null) {
                com.inmobi.media.Pg pubContent = ad2.getPubContent();
                if (pubContent instanceof com.inmobi.media.Y7) {
                    com.inmobi.media.C2799u9 c2799u93 = this.i;
                    if (c2799u93 != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                        c2799u93.a("l1", "Loading HTML content into WebView");
                    }
                    if (gestureDetectorOnGestureListenerC2675pi2 != null) {
                        gestureDetectorOnGestureListenerC2675pi2.i(((com.inmobi.media.Y7) pubContent).f5060a);
                    }
                } else if (pubContent instanceof com.inmobi.media.Z7) {
                    java.lang.String obj = kotlin.text.StringsKt.trim((java.lang.CharSequence) ((com.inmobi.media.Z7) pubContent).f5080a).toString();
                    com.inmobi.media.C2799u9 c2799u94 = this.i;
                    if (c2799u94 != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                        c2799u94.a("l1", "Loading HTML URL into WebView");
                    }
                    if (gestureDetectorOnGestureListenerC2675pi2 != null) {
                        gestureDetectorOnGestureListenerC2675pi2.a(obj, this.c.getRendering().getEnableHtmlUrlPrefetch());
                    }
                }
            }
            if (gestureDetectorOnGestureListenerC2675pi2 == null || !kotlin.jvm.internal.Intrinsics.areEqual(t(), "htmlUrl")) {
                return;
            }
            k(gestureDetectorOnGestureListenerC2675pi2);
        } catch (java.lang.Exception e) {
            com.inmobi.media.C2799u9 c2799u95 = this.i;
            if (c2799u95 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c2799u95.a("l1", "Loading ad markup into container encountered an unexpected error: " + e.getMessage());
            }
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.AbstractC2665p9.a(e);
            int i2 = this.o;
            if (i2 >= 0 && i2 < this.h.size()) {
                gestureDetectorOnGestureListenerC2675pi = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) this.h.get(this.o);
            }
            a(gestureDetectorOnGestureListenerC2675pi, (short) 2135, e((short) 2135));
        }
    }

    public final void P() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "submitAdLoadCalled " + this);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        c(hashMap);
        c("AdLoadCalled", hashMap);
    }

    public final void Q() {
        java.lang.String str;
        com.inmobi.media.ads.network.common.model.MetaInfo metaInfo;
        java.lang.String creativeType;
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "submitAdLoadSuccessfulEvent ADunit markuptype : " + t() + io.ktor.sse.ServerSentEventKt.SPACE + this);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        long j = this.z.c;
        kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2939zl.f5596a;
        hashMap.put("latency", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j));
        hashMap.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad p = p();
        if (p == null || (str = p.getImpressionId()) == null) {
            str = "";
        }
        hashMap.put("impressionId", str);
        com.inmobi.media.ads.network.common.model.Ad p2 = p();
        if (p2 != null && (metaInfo = p2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            hashMap.put("creativeType", creativeType);
        }
        com.inmobi.media.C2586ma c2586ma = this.v;
        if (c2586ma != null) {
            hashMap.put("retryCount", java.lang.Integer.valueOf(c2586ma.b));
        }
        com.inmobi.media.ads.network.common.model.AdSet s = s();
        if (s != null) {
            hashMap.put("isRewarded", java.lang.Boolean.valueOf(s.getIsRewarded()));
        }
        if (y().length() > 0) {
            hashMap.put("metadataBlob", y());
        }
        c(hashMap);
        c("AdLoadSuccessful", hashMap);
    }

    public final void R() {
        java.lang.String str;
        com.inmobi.media.ads.network.common.model.MetaInfo metaInfo;
        java.lang.String creativeType;
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "submitAdShowCalled " + this);
        }
        com.inmobi.media.C2709r1 c2709r1 = this.z;
        c2709r1.getClass();
        c2709r1.f = android.os.SystemClock.elapsedRealtime();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad q = q();
        if (q == null || (str = q.getImpressionId()) == null) {
            str = "";
        }
        hashMap.put("impressionId", str);
        long j = this.z.i;
        kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2939zl.f5596a;
        hashMap.put("latency", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j));
        com.inmobi.media.ads.network.common.model.Ad q2 = q();
        if (q2 != null && (metaInfo = q2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            hashMap.put("creativeType", creativeType);
        }
        com.inmobi.media.ads.network.common.model.AdSet s = s();
        if (s != null) {
            hashMap.put("isRewarded", java.lang.Boolean.valueOf(s.getIsRewarded()));
        }
        if (y().length() > 0) {
            hashMap.put("metadataBlob", y());
        }
        c(hashMap);
        c("AdShowCalled", hashMap);
    }

    public final void S() {
        java.lang.String str;
        com.inmobi.media.ads.network.common.model.MetaInfo metaInfo;
        java.lang.String creativeType;
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "submitAdShowSuccess " + this);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        long j = this.z.f;
        kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2939zl.f5596a;
        hashMap.put("latency", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j));
        hashMap.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad q = q();
        if (q == null || (str = q.getImpressionId()) == null) {
            str = "";
        }
        hashMap.put("impressionId", str);
        com.inmobi.media.ads.network.common.model.Ad q2 = q();
        if (q2 != null && (metaInfo = q2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            hashMap.put("creativeType", creativeType);
        }
        com.inmobi.media.ads.network.common.model.AdSet s = s();
        if (s != null) {
            hashMap.put("isRewarded", java.lang.Boolean.valueOf(s.getIsRewarded()));
        }
        if (y().length() > 0) {
            hashMap.put("metadataBlob", y());
        }
        c(hashMap);
        c("AdShowSuccessful", hashMap);
    }

    public final void T() {
        java.lang.String str;
        com.inmobi.media.ads.network.common.model.MetaInfo metaInfo;
        java.lang.String creativeType;
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "submitRenderSuccessEvent ADunit markuptype : " + t() + io.ktor.sse.ServerSentEventKt.SPACE + this);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        long j = this.z.g;
        kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2939zl.f5596a;
        hashMap.put("latency", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j));
        hashMap.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad q = q();
        if (q == null || (str = q.getImpressionId()) == null) {
            str = "";
        }
        hashMap.put("impressionId", str);
        com.inmobi.media.ads.network.common.model.Ad q2 = q();
        if (q2 != null && (metaInfo = q2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            hashMap.put("creativeType", creativeType);
        }
        com.inmobi.media.C2586ma c2586ma = this.v;
        if (c2586ma != null) {
            hashMap.put("retryCount", java.lang.Integer.valueOf(c2586ma.b));
        }
        hashMap.put("plType", java.lang.Byte.valueOf(u()));
        com.inmobi.media.ads.network.common.model.AdSet s = s();
        if (s != null) {
            hashMap.put("isRewarded", java.lang.Boolean.valueOf(s.getIsRewarded()));
        }
        if (y().length() > 0) {
            hashMap.put("metadataBlob", y());
        }
        c(hashMap);
        a(q(), hashMap);
        c("RenderSuccess", hashMap);
    }

    public final long U() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "timeSincePodShow " + this);
        }
        if (this.s) {
            return java.lang.System.currentTimeMillis() - this.q;
        }
        return -1L;
    }

    public final void V() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.b("l1", "ad unloaded with current state - " + ((int) this.b));
        }
        com.inmobi.media.C2799u9 c2799u92 = this.i;
        if (c2799u92 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u92.d("l1", "AdUnit " + this + " state - UNLOADED");
        }
        c((byte) 8);
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public void a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "onRenderProcessGone didCrash=" + z + " state=" + ((int) this.b));
        }
        byte b = this.b;
        if (b == 0) {
            short s = z ? (short) 2214 : (short) 2213;
            K();
            renderView.a(z, s);
            return;
        }
        if (b == 1) {
            short s2 = z ? (short) 2216 : (short) 2215;
            K();
            c(s2);
            com.inmobi.media.AbstractC2421g1 n = n();
            if (n != null) {
                n.a(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                return;
            }
            return;
        }
        if (b == 3) {
            renderView.a(z, z ? (short) 2226 : (short) 2225);
            return;
        }
        if (b == 2) {
            K();
            c(z ? (short) 2218 : (short) 2217);
            com.inmobi.media.AbstractC2421g1 n2 = n();
            if (n2 != null) {
                n2.a(this, new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                return;
            }
            return;
        }
        if (b == 4 || b == 6 || b == 7 || b != 8) {
            return;
        }
        renderView.a(z, z ? (short) 2240 : (short) 2241);
    }

    public final com.inmobi.media.ads.network.common.model.Ad b(int i) {
        java.lang.Iterable emptyList;
        java.util.LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        java.util.LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads2;
        java.util.LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads3;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
        toString();
        com.inmobi.media.ads.network.common.model.AdSet s = s();
        if (s == null || (ads3 = s.getAds()) == null || (emptyList = kotlin.collections.CollectionsKt.getIndices(ads3)) == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        if (kotlin.collections.CollectionsKt.contains(emptyList, java.lang.Integer.valueOf(i))) {
            com.inmobi.media.ads.network.common.model.AdSet s2 = s();
            if (s2 == null || (ads2 = s2.getAds()) == null) {
                return null;
            }
            return ads2.get(i);
        }
        com.inmobi.media.ads.network.common.model.AdSet s3 = s();
        if (s3 == null || (ads = s3.getAds()) == null) {
            return null;
        }
        return ads.peekFirst();
    }

    public final void e(com.inmobi.media.AbstractC2421g1 abstractC2421g1) {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "adUnitEventListener setter " + this);
        }
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(abstractC2421g1);
        this.f = weakReference;
        com.inmobi.media.ads.network.common.model.AdSet s = s();
        com.inmobi.media.C2287b0 c2287b0 = new com.inmobi.media.C2287b0(weakReference, "int", s != null ? s.getIsRewarded() : false);
        this.u = c2287b0;
        com.inmobi.media.C2799u9 logger = this.i;
        if (logger != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
            c2287b0.f = logger;
        }
    }

    public final void f() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "destroyAllContainer " + this);
        }
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            a(i, true);
        }
    }

    public final void g() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.a("l1", "doAdLoadWork " + this);
        }
        try {
            c((byte) 1);
            com.inmobi.media.C2799u9 c2799u92 = this.i;
            if (c2799u92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c2799u92.d("l1", "AdUnit " + this + " state - LOADING");
            }
            I();
            com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.RootConfig.class, "clazz");
            if (((com.inmobi.media.core.config.models.RootConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.RootConfig.class)).getMonetizationDisabled()) {
                b(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED), (short) 2012);
                com.inmobi.media.C2799u9 c2799u93 = this.i;
                if (c2799u93 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                    c2799u93.b("l1", "Monetization is Disabled");
                    return;
                }
                return;
            }
            if (d((byte) 0)) {
                this.g.a(this.f5305a, new com.inmobi.media.C2447h1(this, null));
                com.inmobi.media.C2799u9 c2799u94 = this.i;
                if (c2799u94 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                    c2799u94.a("l1", "Fresh ad requested");
                }
            }
        } catch (java.lang.Exception e) {
            com.inmobi.media.C2799u9 c2799u95 = this.i;
            if (c2799u95 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c2799u95.b("l1", "Load failed with unexpected error: " + e.getMessage());
            }
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.W9.a(new com.inmobi.media.M2(e));
            a(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2000);
        }
    }

    public final void h() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.a("l1", "fireAdServedBeacon " + this);
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi j = j();
        if (j == null) {
            return;
        }
        j.t();
    }

    public abstract void i();

    @Override // com.inmobi.media.AbstractC2726ri
    public void i(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.a("l1", "RenderView visible, for index " + this.h.indexOf(renderView) + io.ktor.sse.ServerSentEventKt.SPACE + this);
        }
    }

    public final com.inmobi.media.GestureDetectorOnGestureListenerC2675pi j() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "adMarkupContainer getter " + this);
        }
        byte b = this.b;
        java.lang.String t = t();
        if (kotlin.jvm.internal.Intrinsics.areEqual(t, "html")) {
            if (b == 0 || 1 == b || 3 == b || 8 == b) {
                return null;
            }
            return r();
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(t, "htmlUrl") || b == 0 || 1 == b || 3 == b || 8 == b) {
            return null;
        }
        return r();
    }

    public final com.inmobi.ads.AdMetaInfo k() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "adMetaInfo getter " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(0);
        if (b != null) {
            return new com.inmobi.ads.AdMetaInfo(b.getCreativeId(), b.getTransaction());
        }
        return null;
    }

    public java.util.HashMap l() {
        return new java.util.HashMap();
    }

    public abstract java.lang.String m();

    public void m(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi) {
        com.inmobi.media.Ph ph;
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.a("l1", "Render view signaled ad ready, for index " + this.h.indexOf(gestureDetectorOnGestureListenerC2675pi) + io.ktor.sse.ServerSentEventKt.SPACE + this);
        }
        com.inmobi.media.C2799u9 c2799u92 = this.i;
        if (c2799u92 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u92.a("l1", "==== CHECKPOINT REACHED - LOAD SUCCESS ====");
        }
        com.inmobi.media.C2799u9 c2799u93 = this.i;
        if (c2799u93 == null || (ph = c2799u93.f5484a) == null) {
            return;
        }
        ph.a();
    }

    public final com.inmobi.media.AbstractC2421g1 n() {
        com.inmobi.media.C2799u9 c2799u9;
        com.inmobi.media.C2799u9 c2799u92 = this.i;
        if (c2799u92 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u92.c("l1", "adUnitEventListener getter " + this);
        }
        com.inmobi.media.AbstractC2421g1 abstractC2421g1 = (com.inmobi.media.AbstractC2421g1) this.f.get();
        if (abstractC2421g1 == null && (c2799u9 = this.i) != null) {
            c2799u9.b("InMobi", "Listener was garbage collected. Unable to give callback");
        }
        return abstractC2421g1;
    }

    public final android.content.Context o() {
        java.lang.ref.WeakReference weakReference = this.d;
        if (weakReference != null) {
            return (android.content.Context) weakReference.get();
        }
        return null;
    }

    public final com.inmobi.media.ads.network.common.model.Ad p() {
        return this.s ? b(this.o) : b(0);
    }

    public final com.inmobi.media.ads.network.common.model.Ad q() {
        return this.s ? b(this.p) : b(0);
    }

    public abstract com.inmobi.media.GestureDetectorOnGestureListenerC2675pi r();

    public final com.inmobi.media.ads.network.common.model.AdSet s() {
        java.util.List<com.inmobi.media.ads.network.common.model.AdSet> adSets;
        com.inmobi.media.ads.network.common.model.AdResponse adResponse = this.m;
        if (adResponse == null || (adSets = adResponse.getAdSets()) == null) {
            return null;
        }
        return (com.inmobi.media.ads.network.common.model.AdSet) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) adSets);
    }

    public final java.lang.String t() {
        java.lang.String markupType;
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "markupType getter " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(0);
        return (b == null || (markupType = b.getMarkupType()) == null) ? "unknown" : markupType;
    }

    public abstract byte u();

    public final java.lang.String v() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "getPodAdContext " + this);
        }
        if (this.s) {
            return this.t;
        }
        return null;
    }

    public final org.json.JSONArray w() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "getRenderableAdIndexes " + this);
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = this.r.iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            jSONArray.put(((java.lang.Number) next).intValue());
        }
        return jSONArray;
    }

    public final long x() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "getShowTimeStamp " + this);
        }
        if (this.s) {
            return this.q;
        }
        return -1L;
    }

    public final java.lang.String y() {
        java.lang.String telemetryMetadataBlob;
        java.util.LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        com.inmobi.media.ads.network.common.model.AdSet s = s();
        com.inmobi.media.ads.network.common.model.Ad ad = (s == null || (ads = s.getAds()) == null) ? null : (com.inmobi.media.ads.network.common.model.Ad) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) ads);
        return (ad == null || (telemetryMetadataBlob = ad.getTelemetryMetadataBlob()) == null) ? "" : telemetryMetadataBlob;
    }

    public final com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations z() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "timeOutConfiguration getter " + this);
        }
        com.inmobi.media.core.config.models.AdConfig adConfig = this.c;
        kotlin.jvm.internal.Intrinsics.checkNotNull(adConfig);
        return adConfig.getTimeouts();
    }

    public final int l(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "getCurrentRenderingPodAdIndex " + this);
        }
        if (!this.s) {
            return -1;
        }
        int indexOf = this.h.indexOf(renderView);
        com.inmobi.media.C2799u9 c2799u92 = this.i;
        if (c2799u92 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u92.c("l1", "getCurrentRenderingPodAdIndex " + indexOf);
        }
        return indexOf;
    }

    public void o(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "onAdUnloadedAfterShowSuccess");
        }
        renderView.n();
        b((byte) 4);
    }

    public final void d(int i) {
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi;
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.a("l1", "initializeHtmlAdContainer " + this);
        }
        android.content.Context o = o();
        if (o == null) {
            return;
        }
        try {
            if (this.h.get(i) == null || ((gestureDetectorOnGestureListenerC2675pi = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) this.h.get(i)) != null && gestureDetectorOnGestureListenerC2675pi.N.get())) {
                com.inmobi.media.ads.network.common.model.Ad b = b(i);
                com.inmobi.media.C2630o0 a2 = a(i);
                com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a3 = ((com.inmobi.media.Bo) this.B.getValue()).a(new com.inmobi.media.Qi("adUnit-" + i, com.unity3d.ads.BuildConfig.FLAVOR), o, (short) 0, a2, this.c);
                a(a3, a2.p);
                this.h.set(i, a3);
                a3.a(this);
                a3.a(b);
            }
        } catch (java.lang.Exception e) {
            a((com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) this.h.get(this.o), (short) 2136, e((short) 2136));
            com.inmobi.media.C2799u9 c2799u92 = this.i;
            if (c2799u92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c2799u92.a("l1", "Exception while initializing WebView", e);
            }
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.AbstractC2665p9.a(e);
        }
    }

    public static java.lang.String p(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        kotlinx.coroutines.Job job = renderView.z;
        return e((job == null || !job.isActive()) ? (short) 3103 : (short) 3102);
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void h(final com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.a("l1", "onRenderViewSignaledAdReady " + this);
        }
        if (!this.k && o() != null) {
            android.os.Handler handler = this.j;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.inmobi.media.l1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.inmobi.media.AbstractC2551l1.a(com.inmobi.media.AbstractC2551l1.this, renderView);
                    }
                });
                return;
            } else {
                c((short) 2187);
                return;
            }
        }
        c((short) 2186);
    }

    public final void k(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi) {
        int indexOf = this.h.indexOf(gestureDetectorOnGestureListenerC2675pi);
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.a("l1", "fireLoadAdTokenUrlSuccessful : " + indexOf + io.ktor.sse.ServerSentEventKt.SPACE + this);
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(indexOf);
        if (b != null) {
            for (java.lang.String url : com.inmobi.media.Li.a(b, "load_ad_token_url")) {
                com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
                com.inmobi.media.C2799u9 c2799u92 = this.i;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
                com.inmobi.media.A3.a(url, true, c2799u92);
            }
        }
    }

    public void n(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView) {
        int l;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "onAdUnloadedAfterLoadSuccess");
        }
        if (this.s && (l = l(renderView)) > this.p) {
            this.r.remove(java.lang.Integer.valueOf(l));
        } else {
            V();
        }
    }

    public final void b(com.inmobi.media.AbstractC2421g1 abstractC2421g1) {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.a("l1", "onAdShowFailed " + this);
        }
        d((short) 85);
        abstractC2421g1.b();
    }

    public final void b(com.inmobi.ads.InMobiAdRequestStatus requestStatus, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestStatus, "requestStatus");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.a("l1", "onAdFetchFailed " + this);
        }
        if (!this.k && o() != null && this.b != 3) {
            a(requestStatus, s);
            return;
        }
        com.inmobi.media.C2799u9 c2799u92 = this.i;
        if (c2799u92 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u92.b("l1", "callback ignored - isDestroyed - " + this.k + " context - " + o() + " state- " + ((int) this.b));
        }
    }

    public final void c(byte b) {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.d("l1", "STATE UPDATE: from " + ((int) this.b) + " to " + ((int) b));
        }
        this.b = b;
    }

    public final boolean c(int i) {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "getAllowAutoRedirectionForIndex " + this + " index - " + i);
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(i);
        return b != null && b.getAllowAutoRedirection();
    }

    public final void c(com.inmobi.media.AbstractC2421g1 listener) {
        java.lang.String str;
        com.inmobi.media.ads.network.common.model.MetaInfo metaInfo;
        java.lang.String creativeType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "onFetchSuccess " + this);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        c(hashMap);
        hashMap.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad p = p();
        if (p == null || (str = p.getImpressionId()) == null) {
            str = "";
        }
        hashMap.put("impressionId", str);
        long j = this.z.h;
        kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2939zl.f5596a;
        hashMap.put("latency", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j));
        hashMap.put("metadataBlob", y());
        com.inmobi.media.C2586ma c2586ma = this.v;
        if (c2586ma != null) {
            hashMap.put("retryCount", java.lang.Integer.valueOf(c2586ma.b));
        }
        com.inmobi.media.ads.network.common.model.AdSet s = s();
        if (s != null) {
            hashMap.put("isRewarded", java.lang.Boolean.valueOf(s.getIsRewarded()));
        }
        com.inmobi.media.ads.network.common.model.Ad p2 = p();
        if (p2 != null && (metaInfo = p2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            hashMap.put("creativeType", creativeType);
        }
        c("ParseSuccess", hashMap);
        com.inmobi.ads.AdMetaInfo k = k();
        if (k == null) {
            com.inmobi.media.C2799u9 c2799u92 = this.i;
            if (c2799u92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c2799u92.b("l1", "ad meta info null. fail");
            }
            b(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2106);
            return;
        }
        com.inmobi.media.C2799u9 c2799u93 = this.i;
        if (c2799u93 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u93.a("l1", "callback - onAdFetchSuccess");
        }
        listener.b(k);
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void j(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        byte b = this.b;
        if (b == 2) {
            V();
            b((byte) 1);
            com.inmobi.media.AbstractC2421g1 n = n();
            com.inmobi.ads.InMobiAdRequestStatus inMobiAdRequestStatus = new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
            if (n != null) {
                n.a(this, inMobiAdRequestStatus);
            } else {
                com.inmobi.media.C2799u9 c2799u9 = this.i;
                if (c2799u9 != null) {
                    c2799u9.a();
                }
            }
            c((short) 2238);
            renderView.b();
            return;
        }
        if (b == 4) {
            n(renderView);
            renderView.b();
            b((byte) 4);
        } else {
            if (b != 6 && b != 7) {
                com.inmobi.media.C2799u9 c2799u92 = this.i;
                if (c2799u92 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                    c2799u92.b("l1", "onUnloadCalled - invalid state - " + ((int) this.b));
                    return;
                }
                return;
            }
            o(renderView);
        }
    }

    public final void b(com.inmobi.ads.InMobiAdRequestStatus requestStatus, boolean z, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestStatus, "requestStatus");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.b("l1", "handleAdLoadFailure " + this + " errorCode - " + ((int) s));
        }
        if (this.b == 1 && z) {
            com.inmobi.media.C2799u9 c2799u92 = this.i;
            if (c2799u92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c2799u92.b("l1", "load failed - " + ((int) s));
            }
            com.inmobi.media.C2799u9 c2799u93 = this.i;
            if (c2799u93 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c2799u93.d("l1", "AdUnit " + this + " state - FAILED");
            }
            c((byte) 3);
            b((byte) 1);
        }
        com.inmobi.media.AbstractC2421g1 n = n();
        if (n != null) {
            n.a(this, requestStatus);
        } else {
            com.inmobi.media.C2799u9 c2799u94 = this.i;
            if (c2799u94 != null) {
                c2799u94.a();
            }
        }
        if (s != 0) {
            c(s);
        }
    }

    public final void b(java.lang.String podAdContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(podAdContext, "podAdContext");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "setPodAdContext " + this);
        }
        if (this.s) {
            this.t = podAdContext;
        }
    }

    public final void e() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.a("l1", "clearAdPods " + this);
        }
        if (this.s) {
            f();
            this.h.clear();
            this.o = 0;
            this.p = 0;
            this.r.clear();
        }
    }

    public static final void b(com.inmobi.media.AbstractC2551l1 abstractC2551l1) {
        if (6 == abstractC2551l1.b) {
            abstractC2551l1.a((short) 2158);
        }
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void b(java.util.HashMap rewards) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewards, "rewards");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "onAdRewardActionCompleted " + this);
        }
        if (this.k || o() == null) {
            return;
        }
        com.inmobi.media.C2799u9 c2799u92 = this.i;
        if (c2799u92 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u92.a("l1", "Ad reward action completed. Params:" + rewards);
        }
        com.inmobi.media.AbstractC2421g1 n = n();
        if (n != null) {
            n.b(rewards);
        }
    }

    public final void e(int i) {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "resetCurrentRenderingIndex " + this);
        }
        this.p = i;
    }

    public static java.lang.String e(short s) {
        return "SDK_" + ((int) s);
    }

    public final void b(short s) {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "submitAdLoadDroppedAtSDK " + this);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errorCode", java.lang.Short.valueOf(s));
        c(hashMap);
        c("AdLoadDroppedAtSDK", hashMap);
    }

    public static final com.inmobi.media.Go e(com.inmobi.media.AbstractC2551l1 abstractC2551l1) {
        com.inmobi.media.ads.network.common.model.Ad b = abstractC2551l1.b(0);
        if (b == null || abstractC2551l1.A()) {
            b = null;
        }
        com.inmobi.media.C2799u9 c2799u9 = abstractC2551l1.i;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
        return new com.inmobi.media.Go(b, c2799u9);
    }

    public final void b(java.util.Map map) {
        com.inmobi.media.ads.network.common.model.MetaInfo metaInfo;
        java.lang.String creativeType;
        map.put("latency", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - this.z.d));
        map.put("networkType", com.inmobi.media.B5.g());
        map.put("plId", java.lang.Long.valueOf(this.l.f5497a));
        com.inmobi.media.ads.network.common.model.AdSet s = s();
        map.put("isRewarded", java.lang.Boolean.valueOf(s != null ? s.getIsRewarded() : false));
        java.lang.String str = this.l.e;
        if (str != null) {
            map.put("adType", str);
        }
        java.lang.String str2 = this.l.f;
        if (str2 != null) {
            map.put("plType", str2);
        }
        com.inmobi.media.C2586ma c2586ma = this.v;
        if (c2586ma != null) {
            map.put("retryCount", java.lang.Integer.valueOf(c2586ma.b));
        }
        com.inmobi.media.ads.network.common.model.Ad p = p();
        if (p != null && (metaInfo = p.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        a(p(), map);
        b("ServerError", map);
    }

    public final void b(java.lang.String str, java.util.Map map) {
        com.inmobi.media.ads.network.common.model.Ad p;
        com.inmobi.media.ads.network.common.model.MetaInfo metaInfo;
        java.lang.String creativeType;
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "onTelemetryEvent " + this + " adState=" + ((int) this.b));
        }
        if (this.b != 3) {
            a(str, map);
            if ((kotlin.jvm.internal.Intrinsics.areEqual(str, "ServerFill") || kotlin.jvm.internal.Intrinsics.areEqual(str, "ServerError")) && (p = p()) != null && (metaInfo = p.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
                map.put("creativeType", creativeType);
            }
            c(str, map);
        }
    }

    public final void b(com.inmobi.media.ads.network.common.model.Ad ad) {
        java.util.LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "updateAd " + this);
        }
        com.inmobi.media.ads.network.common.model.AdSet s = s();
        if (s == null || (ads = s.getAds()) == null) {
            return;
        }
        ads.set(0, ad);
    }

    public final void b(byte b) {
        com.inmobi.media.Fk fk;
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.a("l1", "cancelTimer " + this);
        }
        if (b == 1 && (fk = this.n) != null) {
            fk.a((byte) 2);
        }
        com.inmobi.media.Fk fk2 = this.n;
        if (fk2 != null) {
            fk2.a(b);
        }
    }

    public final void b(int i, boolean z) {
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi;
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.a("l1", "fireAdPodShowResult " + this);
        }
        java.util.concurrent.CopyOnWriteArrayList list = this.h;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "list");
        if (i < 0 || i >= list.size() || (gestureDetectorOnGestureListenerC2675pi = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) this.h.get(i)) == null) {
            return;
        }
        gestureDetectorOnGestureListenerC2675pi.b(z);
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void b(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView) {
        com.inmobi.media.ads.network.common.model.MetaInfo metaInfo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.a("l1", "fireClickTracker " + this);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        com.inmobi.media.ads.network.common.model.Ad b = b(this.h.indexOf(renderView));
        if (kotlin.jvm.internal.Intrinsics.areEqual((b == null || (metaInfo = b.getMetaInfo()) == null) ? null : metaInfo.getCreativeType(), "video") || b == null) {
            return;
        }
        for (java.lang.String url : com.inmobi.media.Li.a(b, com.ironsource.Y3.d)) {
            com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
            com.inmobi.media.C2799u9 c2799u92 = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            com.inmobi.media.A3.a(url, true, c2799u92);
        }
    }

    public static final void a(com.inmobi.media.AbstractC2551l1 abstractC2551l1, com.inmobi.media.W w) {
        abstractC2551l1.getClass();
        if (w instanceof com.inmobi.media.C2641ob) {
            com.inmobi.media.C2709r1 c2709r1 = abstractC2551l1.z;
            c2709r1.getClass();
            c2709r1.d = android.os.SystemClock.elapsedRealtime();
            return;
        }
        if (w instanceof com.inmobi.media.Qf) {
            com.inmobi.media.C2709r1 c2709r12 = abstractC2551l1.z;
            c2709r12.getClass();
            c2709r12.h = android.os.SystemClock.elapsedRealtime();
        } else {
            if (w instanceof com.inmobi.media.C2334cj) {
                java.util.Map map = ((com.inmobi.media.C2334cj) w).f5144a;
                java.util.Map mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("latency", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - abstractC2551l1.z.d)), kotlin.TuplesKt.to("networkType", com.inmobi.media.B5.g()), kotlin.TuplesKt.to("plId", java.lang.Long.valueOf(abstractC2551l1.l.f5497a)));
                mutableMapOf.putAll(map);
                java.lang.String str = abstractC2551l1.l.f;
                if (str != null) {
                    mutableMapOf.put("plType", str);
                }
                java.lang.String str2 = abstractC2551l1.l.e;
                if (str2 != null) {
                    mutableMapOf.put("adType", str2);
                }
                abstractC2551l1.b("ServerFill", mutableMapOf);
                return;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public final void a(android.content.Context context, com.inmobi.media.C2816v0 adPlacement, com.inmobi.media.Uk uk) {
        com.inmobi.media.C2816v0 c2816v0;
        java.lang.String str;
        java.lang.String str2;
        com.inmobi.media.C2799u9 c2799u9;
        com.inmobi.media.C2799u9 c2799u92;
        com.inmobi.media.C2799u9 c2799u93;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adPlacement, "adPlacement");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
        toString();
        a(context);
        this.f = new java.lang.ref.WeakReference(uk);
        com.inmobi.media.Ib ib = com.inmobi.media.Sh.f4959a;
        com.inmobi.media.Sh.a(uk, this.i);
        java.lang.ref.WeakReference weakReference = this.f;
        java.lang.String m = m();
        com.inmobi.media.ads.network.common.model.AdSet s = s();
        this.u = new com.inmobi.media.C2287b0(weakReference, m, s != null ? s.getIsRewarded() : false);
        this.l = adPlacement;
        B();
        com.inmobi.media.C2799u9 c2799u94 = this.i;
        if (c2799u94 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u94.c("l1", "initInternetAvailabilityAdRetry");
        }
        if (this.c == null && (c2799u93 = this.i) != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u93.c("l1", "adConfig is null");
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        if (this.l.f == null && (c2799u92 = this.i) != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u92.c("l1", "placement.placementType is null");
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        }
        if (this.l.e == null && (c2799u9 = this.i) != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "placement.adType is null");
            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
        }
        com.inmobi.media.core.config.models.AdConfig adConfig = this.c;
        if (adConfig != null && (str = (c2816v0 = this.l).f) != null && (str2 = c2816v0.e) != null) {
            com.inmobi.media.C2828vc a2 = com.inmobi.media.AbstractC2802uc.a(adConfig.getTimeouts().X(), str, str2, com.inmobi.media.Yi.b);
            this.v = new com.inmobi.media.C2586ma(a2);
            this.w = a2;
        }
        if (com.inmobi.media.N5.h != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("N5", "TAG");
        } else {
            com.inmobi.media.N5.h = java.lang.Float.valueOf(new android.widget.TextView(context).getTextSize());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("N5", "TAG");
        }
        M();
    }

    public final void a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "setContext " + this);
        }
        this.d = new java.lang.ref.WeakReference(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0117, code lost:
    
        if (r10.equals("video") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x011e, code lost:
    
        if (r10.equals("audio") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010e, code lost:
    
        if (r10.equals("nonvideo") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02a8, code lost:
    
        if (r2 != null) goto L120;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0247 A[EDGE_INSN: B:135:0x0247->B:78:0x0247 BREAK  A[LOOP:1: B:57:0x01a7->B:134:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.inmobi.media.C2630o0 a(int i) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Boolean bool;
        boolean z;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.util.Iterator<com.inmobi.media.ads.network.common.model.Viewability> it;
        com.inmobi.media.ads.network.common.model.MetaInfo metaInfo;
        com.inmobi.media.ads.network.common.model.MetaInfo metaInfo2;
        com.inmobi.media.ads.network.common.model.InlineParams inlineParams;
        java.lang.String creativeId;
        com.inmobi.media.ads.network.common.model.MetaInfo metaInfo3;
        java.lang.String creativeType;
        java.util.List<com.inmobi.media.ads.network.common.model.LandingPageParam> landingPageParams;
        java.util.List<com.inmobi.media.ads.network.common.model.LandingPageParam> landingPageParams2;
        com.inmobi.media.ads.network.common.model.LandingPageParam landingPageParam;
        com.inmobi.media.core.config.models.AdConfig.ViewabilityConfig viewability;
        com.inmobi.media.core.config.models.AdConfig.OmidConfig omidConfig;
        com.inmobi.media.ads.network.common.model.MetaInfo metaInfo4;
        com.inmobi.media.ads.network.common.model.Ad ad = b(i);
        if (ad == null || (str = ad.getMarkupType()) == null) {
            str = "html";
        }
        java.lang.String str7 = str;
        java.lang.String str8 = "audio";
        java.lang.String str9 = (kotlin.jvm.internal.Intrinsics.areEqual(this.l.e, "banner") || kotlin.jvm.internal.Intrinsics.areEqual(this.l.e, "audio")) ? this.l.h : null;
        java.lang.String str10 = this.l.e;
        boolean a2 = a(ad);
        long j = this.l.f5497a;
        boolean c = c(i);
        java.lang.String str11 = this.l.k;
        java.lang.String creativeType2 = (ad == null || (metaInfo4 = ad.getMetaInfo()) == null) ? null : metaInfo4.getCreativeType();
        com.inmobi.ads.AdMetaInfo k = k();
        java.lang.String creativeID = k != null ? k.getCreativeID() : null;
        boolean z2 = this.l.j;
        java.util.LinkedHashMap linkedHashMap = this.y;
        com.inmobi.ads.WatermarkData watermarkData = this.A;
        com.inmobi.media.ads.network.common.model.AdQualityControl adQualityControl = ad != null ? ad.getAdQualityControl() : null;
        byte u = u();
        kotlin.jvm.internal.Intrinsics.checkNotNull(ad);
        com.inmobi.media.core.config.models.AdConfig adConfig = this.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        com.inmobi.media.ads.network.common.model.MetaInfo metaInfo5 = ad.getMetaInfo();
        if (adConfig == null || (viewability = adConfig.getViewability()) == null || (omidConfig = viewability.getOmidConfig()) == null) {
            str2 = str11;
            bool = null;
        } else {
            bool = java.lang.Boolean.valueOf(omidConfig.isOmidEnabled());
            str2 = str11;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(bool, java.lang.Boolean.TRUE)) {
            if ((metaInfo5 != null ? metaInfo5.getOmsdkInfo() : null) != null) {
                com.inmobi.media.ads.network.common.model.OmSdkInfo omsdkInfo = metaInfo5.getOmsdkInfo();
                if (omsdkInfo.getOmidEnabled()) {
                    str4 = str9;
                    com.inmobi.media.Nk nk = new com.inmobi.media.Nk((byte) 3);
                    boolean isolateVerificationScripts = omsdkInfo.getIsolateVerificationScripts();
                    java.lang.String customReferenceData = omsdkInfo.getCustomReferenceData();
                    str3 = str7;
                    java.util.HashMap<java.lang.String, java.lang.String> obj = omsdkInfo.getMacros();
                    str5 = creativeType2;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "obj");
                    org.json.JSONObject a3 = com.inmobi.media.AbstractC2773ta.a(obj, obj.getClass());
                    byte impressionType = omsdkInfo.getImpressionType();
                    java.lang.String creativeType3 = metaInfo5.getCreativeType();
                    str6 = creativeID;
                    int hashCode = creativeType3.hashCode();
                    z = c;
                    if (hashCode != 93166550) {
                        if (hashCode == 112202875) {
                            str8 = "video";
                        } else {
                            if (hashCode == 1425678798) {
                                str8 = "nonvideo";
                            }
                            str8 = "unknown";
                            java.util.HashMap hashMap = new java.util.HashMap();
                            if (a3 != null) {
                                for (java.util.Iterator<java.lang.String> keys = a3.keys(); keys.hasNext(); keys = keys) {
                                    java.lang.String next = keys.next();
                                    hashMap.put(next, a3.optString(next));
                                }
                            }
                            java.util.HashMap hashMapOf = kotlin.collections.MapsKt.hashMapOf(kotlin.TuplesKt.to("creativeType", str8), kotlin.TuplesKt.to("customReferenceData", customReferenceData), kotlin.TuplesKt.to("impressionType", java.lang.Byte.valueOf(impressionType)), kotlin.TuplesKt.to("macros", hashMap), kotlin.TuplesKt.to("isolateVerificationScripts", java.lang.Boolean.valueOf(isolateVerificationScripts)));
                            if (!(hashMapOf instanceof java.util.HashMap)) {
                                hashMapOf = null;
                            }
                            if (hashMapOf == null) {
                                hashMapOf = new java.util.HashMap();
                            }
                            nk.b = hashMapOf;
                            linkedHashSet.add(nk);
                        }
                    }
                    it = ad.getViewability().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            break;
                        }
                        com.inmobi.media.ads.network.common.model.Viewability next2 = it.next();
                        if (next2.getInmobi() != null) {
                            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                            int a4 = com.inmobi.media.Ok.a(next2.getInmobi().getTime());
                            if (a4 != -1) {
                                linkedHashMap2.put("time", java.lang.Integer.valueOf(a4));
                            }
                            int a5 = com.inmobi.media.Ok.a(next2.getInmobi().getView());
                            if (a5 != -1) {
                                linkedHashMap2.put(com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, java.lang.Integer.valueOf(a5));
                            }
                            int a6 = com.inmobi.media.Ok.a(next2.getInmobi().getPixel());
                            if (a6 != -1) {
                                linkedHashMap2.put("pixel", java.lang.Integer.valueOf(a6));
                            }
                            byte type = next2.getInmobi().getType();
                            linkedHashMap2.put("type", java.lang.Integer.valueOf(type));
                            if (type == 2) {
                                if (next2.getInmobi().getFrame().length == 4) {
                                    linkedHashMap2.put("frame", next2.getInmobi().getFrame());
                                } else {
                                    linkedHashMap2.put("frame", new org.json.JSONArray("[0,0,0,0]"));
                                }
                            }
                            com.inmobi.media.Nk nk2 = new com.inmobi.media.Nk((byte) 2);
                            nk2.b = linkedHashMap2;
                            linkedHashSet.add(nk2);
                        }
                    }
                    com.inmobi.media.ads.network.common.model.Ad b = b(i);
                    java.lang.String impressionId = b == null ? b.getImpressionId() : null;
                    metaInfo = ad.getMetaInfo();
                    if (metaInfo != null || (landingPageParams2 = metaInfo.getLandingPageParams()) == null || (landingPageParam = (com.inmobi.media.ads.network.common.model.LandingPageParam) kotlin.collections.CollectionsKt.getOrNull(landingPageParams2, 0)) == null || (r2 = landingPageParam.getOpenMode()) == null) {
                        java.lang.String str12 = "DEFAULT";
                    }
                    java.lang.String str13 = str12;
                    com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.TelemetryConfig.class, "clazz");
                    com.inmobi.media.C2911yi c2911yi = new com.inmobi.media.C2911yi(((com.inmobi.media.core.config.models.TelemetryConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.TelemetryConfig.class)).getMaxTemplateEvents());
                    metaInfo2 = ad.getMetaInfo();
                    if (metaInfo2 == null && (landingPageParams = metaInfo2.getLandingPageParams()) != null) {
                        com.inmobi.media.ads.network.common.model.LandingPageParam landingPageParam2 = (com.inmobi.media.ads.network.common.model.LandingPageParam) kotlin.collections.CollectionsKt.getOrNull(landingPageParams, 0);
                        if (landingPageParam2 != null) {
                            inlineParams = landingPageParam2.getAParams();
                        }
                    }
                    inlineParams = new com.inmobi.media.ads.network.common.model.InlineParams(null, null, null, false, null, null, false, 127, null);
                    inlineParams.setTargetBundleId(ad.getBidBundle());
                    inlineParams.setCallerBundleId(com.inmobi.media.A1.f4591a);
                    inlineParams.setPingInWebView(this.c.getInlineInstaller().getShouldPingInWebView());
                    com.inmobi.media.C2816v0 c2816v0 = this.l;
                    java.lang.String t = t();
                    java.lang.String impressionId2 = ad.getImpressionId();
                    java.lang.String str14 = impressionId2 != null ? "" : impressionId2;
                    java.lang.String telemetryMetadataBlob = ad.getTelemetryMetadataBlob();
                    java.lang.String str15 = telemetryMetadataBlob != null ? "" : telemetryMetadataBlob;
                    com.inmobi.media.C2586ma c2586ma = this.v;
                    int i2 = c2586ma == null ? c2586ma.b : 0;
                    com.inmobi.media.ads.network.common.model.Ad p = p();
                    java.lang.String str16 = (p != null || (metaInfo3 = p.getMetaInfo()) == null || (creativeType = metaInfo3.getCreativeType()) == null) ? "" : creativeType;
                    com.inmobi.media.ads.network.common.model.Ad p2 = p();
                    java.lang.String str17 = (p2 != null || (creativeId = p2.getCreativeId()) == null) ? "" : creativeId;
                    com.inmobi.media.ads.network.common.model.AdSet s = s();
                    return new com.inmobi.media.C2630o0(str10, a2, j, z, str6, str5, str3, str4, this, str2, linkedHashMap, java.lang.Boolean.valueOf(z2), watermarkData, adQualityControl, u, linkedHashSet, impressionId, str13, new com.inmobi.media.C2781ti(c2816v0, t, str14, str15, i2, str16, str17, s == null ? s.getIsRewarded() : false, i, this.z.j, c2911yi, com.unity3d.ads.BuildConfig.FLAVOR, inlineParams), this.i);
                }
            }
        }
        z = c;
        str3 = str7;
        str4 = str9;
        str5 = creativeType2;
        str6 = creativeID;
        it = ad.getViewability().iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        com.inmobi.media.ads.network.common.model.Ad b2 = b(i);
        if (b2 == null) {
        }
        metaInfo = ad.getMetaInfo();
        if (metaInfo != null) {
        }
        java.lang.String str122 = "DEFAULT";
        java.lang.String str132 = str122;
        com.inmobi.media.C2580m4 c2580m42 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.TelemetryConfig.class, "clazz");
        com.inmobi.media.C2911yi c2911yi2 = new com.inmobi.media.C2911yi(((com.inmobi.media.core.config.models.TelemetryConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.TelemetryConfig.class)).getMaxTemplateEvents());
        metaInfo2 = ad.getMetaInfo();
        if (metaInfo2 == null) {
        }
        inlineParams = new com.inmobi.media.ads.network.common.model.InlineParams(null, null, null, false, null, null, false, 127, null);
        inlineParams.setTargetBundleId(ad.getBidBundle());
        inlineParams.setCallerBundleId(com.inmobi.media.A1.f4591a);
        inlineParams.setPingInWebView(this.c.getInlineInstaller().getShouldPingInWebView());
        com.inmobi.media.C2816v0 c2816v02 = this.l;
        java.lang.String t2 = t();
        java.lang.String impressionId22 = ad.getImpressionId();
        if (impressionId22 != null) {
        }
        java.lang.String telemetryMetadataBlob2 = ad.getTelemetryMetadataBlob();
        if (telemetryMetadataBlob2 != null) {
        }
        com.inmobi.media.C2586ma c2586ma2 = this.v;
        if (c2586ma2 == null) {
        }
        com.inmobi.media.ads.network.common.model.Ad p3 = p();
        if (p3 != null) {
        }
        com.inmobi.media.ads.network.common.model.Ad p22 = p();
        if (p22 != null) {
        }
        com.inmobi.media.ads.network.common.model.AdSet s2 = s();
        return new com.inmobi.media.C2630o0(str10, a2, j, z, str6, str5, str3, str4, this, str2, linkedHashMap, java.lang.Boolean.valueOf(z2), watermarkData, adQualityControl, u, linkedHashSet, impressionId, str132, new com.inmobi.media.C2781ti(c2816v02, t2, str14, str15, i2, str16, str17, s2 == null ? s2.getIsRewarded() : false, i, this.z.j, c2911yi2, com.unity3d.ads.BuildConfig.FLAVOR, inlineParams), this.i);
    }

    public final void b(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView, java.lang.String errorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        int indexOf = this.h.indexOf(renderView);
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.b("l1", "fireLoadAdTokenUrlFailed : " + indexOf + io.ktor.sse.ServerSentEventKt.SPACE + this + " errorCode: " + errorCode);
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(indexOf);
        if (b != null) {
            java.util.List<java.lang.String> a2 = com.inmobi.media.Li.a(b, "load_ad_token_url_failure");
            boolean contains = this.c.getDisableAppendingKeysForBeacons().contains("load_ad_token_url_failure");
            for (java.lang.String url : a2) {
                if (!contains) {
                    android.net.Uri parse = android.net.Uri.parse(url);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "Uri.parse(this)");
                    url = parse.buildUpon().appendQueryParameter("error", errorCode).build().toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(url, "toString(...)");
                }
                com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
                com.inmobi.media.C2799u9 c2799u92 = this.i;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
                com.inmobi.media.A3.a(url, true, c2799u92);
            }
        }
    }

    public final void d(com.inmobi.media.AbstractC2421g1 listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.a("l1", "onLoadSuccess " + this);
        }
        com.inmobi.ads.AdMetaInfo k = k();
        if (k == null) {
            com.inmobi.media.C2799u9 c2799u92 = this.i;
            if (c2799u92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c2799u92.b("l1", "load success - ad unit null");
            }
            b(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2107);
            return;
        }
        b((byte) 1);
        com.inmobi.media.C2799u9 c2799u93 = this.i;
        if (c2799u93 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u93.a("l1", "callback - onAdLoadSucceeded");
        }
        listener.c(k);
    }

    public void d() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.a("l1", "clear " + this);
        }
        if (this.k) {
            return;
        }
        this.k = true;
        android.os.Handler handler = this.j;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        e();
        com.inmobi.media.C2586ma c2586ma = this.v;
        if (c2586ma != null) {
            c2586ma.b = 0;
        }
        J();
        c((byte) 0);
        com.inmobi.media.C2799u9 c2799u92 = this.i;
        if (c2799u92 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u92.d("l1", "AdUnit " + this + " state - CREATED");
        }
        com.inmobi.media.Fa fa = this.g;
        java.lang.String id = this.f5305a;
        fa.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        try {
            java.util.List list = (java.util.List) fa.c.get(id);
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) it.next(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                }
            }
            java.util.List list2 = (java.util.List) fa.c.remove(id);
            if (list2 != null) {
                list2.clear();
            }
        } catch (java.lang.Exception unused) {
        }
        this.m = null;
        this.s = false;
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void d(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        if (this.C) {
            return;
        }
        this.C = true;
        com.inmobi.media.C2936zi c2936zi = renderView.e0;
        if (c2936zi != null) {
            java.util.Map a2 = c2936zi.a();
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b("AttachedToWindow", a2, com.inmobi.media.EnumC2728rk.f5431a);
        }
    }

    public final void d(short s) {
        java.lang.String str;
        com.inmobi.media.ads.network.common.model.MetaInfo metaInfo;
        java.lang.String creativeType;
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "submitAdShowFailed " + this);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        long j = this.z.f;
        kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2939zl.f5596a;
        hashMap.put("latency", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j));
        hashMap.put("errorCode", java.lang.Short.valueOf(s));
        hashMap.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad q = q();
        if (q == null || (str = q.getImpressionId()) == null) {
            str = "";
        }
        hashMap.put("impressionId", str);
        com.inmobi.media.ads.network.common.model.Ad q2 = q();
        if (q2 != null && (metaInfo = q2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            hashMap.put("creativeType", creativeType);
        }
        com.inmobi.media.ads.network.common.model.AdSet s2 = s();
        if (s2 != null) {
            hashMap.put("isRewarded", java.lang.Boolean.valueOf(s2.getIsRewarded()));
        }
        if (y().length() > 0) {
            hashMap.put("metadataBlob", y());
        }
        c(hashMap);
        a(q(), hashMap);
        c("AdShowFailed", hashMap);
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void c() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "onAdScreenDisplayFailed " + this);
        }
        if (this.k || o() == null) {
            return;
        }
        com.inmobi.media.C2799u9 c2799u92 = this.i;
        if (c2799u92 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u92.b("l1", "Ad failed to display");
        }
        android.os.Handler handler = this.j;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.inmobi.media.l1$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    com.inmobi.media.AbstractC2551l1.b(com.inmobi.media.AbstractC2551l1.this);
                }
            });
        }
    }

    public final void c(java.util.HashMap hashMap) {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "constructTelemetryPayload " + this);
        }
        hashMap.put("adType", m());
        hashMap.put("networkType", com.inmobi.media.B5.g());
        hashMap.put("plId", java.lang.Long.valueOf(this.l.f5497a));
        java.lang.String str = this.l.f;
        if (str != null) {
            hashMap.put("plType", str);
        }
    }

    public final void c(short s) {
        long j;
        long elapsedRealtime;
        java.lang.String str;
        com.inmobi.media.ads.network.common.model.MetaInfo metaInfo;
        java.lang.String creativeType;
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "submitAdLoadFailedEvent " + this);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        if (s == 2138 || s == 2109) {
            j = this.z.e;
            kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2939zl.f5596a;
            elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        } else if (s == 2139) {
            j = this.z.g;
            kotlinx.coroutines.CoroutineScope coroutineScope2 = com.inmobi.media.AbstractC2939zl.f5596a;
            elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        } else {
            j = this.z.c;
            kotlinx.coroutines.CoroutineScope coroutineScope3 = com.inmobi.media.AbstractC2939zl.f5596a;
            elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        }
        hashMap.put("latency", java.lang.Long.valueOf(elapsedRealtime - j));
        hashMap.put("errorCode", java.lang.Short.valueOf(s));
        hashMap.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad p = p();
        if (p == null || (str = p.getImpressionId()) == null) {
            str = "";
        }
        hashMap.put("impressionId", str);
        com.inmobi.media.ads.network.common.model.Ad p2 = p();
        if (p2 != null && (metaInfo = p2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            hashMap.put("creativeType", creativeType);
        }
        com.inmobi.media.C2586ma c2586ma = this.v;
        if (c2586ma != null) {
            hashMap.put("retryCount", java.lang.Integer.valueOf(c2586ma.b));
        }
        com.inmobi.media.ads.network.common.model.AdSet s2 = s();
        if (s2 != null) {
            hashMap.put("isRewarded", java.lang.Boolean.valueOf(s2.getIsRewarded()));
        }
        if (y().length() > 0) {
            hashMap.put("metadataBlob", y());
        }
        c(hashMap);
        a(p(), hashMap);
        c("AdLoadFailed", hashMap);
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void g(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.a("l1", "RenderView completed loading ad content, for index " + this.h.indexOf(renderView) + io.ktor.sse.ServerSentEventKt.SPACE + this);
        }
    }

    public final boolean d(byte b) {
        int Y;
        java.lang.Integer num;
        long j;
        java.lang.Integer num2;
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.a("l1", "startTimer " + this);
        }
        if (b == 0) {
            com.inmobi.media.C2828vc c2828vc = this.w;
            if (c2828vc != null && (num2 = c2828vc.d) != null) {
                Y = num2.intValue();
                j = Y;
            }
            j = 15000;
        } else if (b == 1) {
            com.inmobi.media.C2828vc c2828vc2 = this.w;
            if (c2828vc2 != null) {
                Y = c2828vc2.c;
                j = Y;
            }
            j = 15000;
        } else {
            if (b == 2) {
                com.inmobi.media.C2828vc c2828vc3 = this.w;
                if (c2828vc3 != null && (num = c2828vc3.e) != null) {
                    Y = num.intValue();
                }
                j = 15000;
            } else if (b == 4) {
                com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations timeoutConfigurations = this.e;
                kotlin.jvm.internal.Intrinsics.checkNotNull(timeoutConfigurations);
                Y = timeoutConfigurations.Y();
            } else {
                com.inmobi.media.C2799u9 c2799u92 = this.i;
                if (c2799u92 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                    c2799u92.b("l1", "Invalid value for timeOutScenario passed!. Please pass a valid value");
                }
                return false;
            }
            j = Y;
        }
        com.inmobi.media.Fk fk = this.n;
        return fk != null && fk.a(b, j);
    }

    public final void c(java.lang.String eventType, java.util.Map kv) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kv, "kv");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "submitTelemetryEvent " + this);
        }
        com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
        com.inmobi.media.C2624nk.b(eventType, kv, com.inmobi.media.EnumC2728rk.f5431a);
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void c(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView) {
        com.inmobi.media.ads.network.common.model.MetaInfo metaInfo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.a("l1", "fireImpressionTracker " + this);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        com.inmobi.media.ads.network.common.model.Ad b = b(this.h.indexOf(renderView));
        if (kotlin.jvm.internal.Intrinsics.areEqual((b == null || (metaInfo = b.getMetaInfo()) == null) ? null : metaInfo.getCreativeType(), "video") || b == null) {
            return;
        }
        for (java.lang.String url : com.inmobi.media.Li.a(b, "impression")) {
            com.inmobi.media.C2888xk telemetryOnAdImpression = renderView.getTelemetryOnAdImpression();
            telemetryOnAdImpression.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("adResponseTracker", "<set-?>");
            telemetryOnAdImpression.f = "adResponseTracker";
            com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
            com.inmobi.media.C2260a0 c2260a0 = new com.inmobi.media.C2260a0(this.u, telemetryOnAdImpression);
            com.inmobi.media.C2799u9 c2799u92 = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            com.inmobi.media.Mg.a(com.inmobi.media.Jg.f4782a, new com.inmobi.media.C2737s3(url, c2799u92, c2260a0, null));
        }
    }

    public final boolean a(com.inmobi.media.ads.network.common.model.Ad ad) {
        java.lang.Short sh;
        kotlin.Pair pair;
        com.inmobi.media.O0 features;
        boolean enableImmersive = this.c.getRendering().getEnableImmersive();
        boolean z = com.inmobi.media.N5.i;
        boolean a2 = (ad == null || (features = ad.getFeatures()) == null) ? false : features.a(false);
        boolean z2 = enableImmersive && z && a2;
        if (!z2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Immersive not supported on");
            java.util.BitSet bitSet = new java.util.BitSet(3);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (!enableImmersive) {
                arrayList.add(" config");
                bitSet.set(0);
            }
            if (!z) {
                arrayList.add(" device");
                bitSet.set(1);
            }
            if (!a2) {
                arrayList.add(" ad");
                bitSet.set(2);
            }
            sb.append(kotlin.collections.CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitSet, "bitSet");
            if (bitSet.get(0) && bitSet.get(1) && bitSet.get(2)) {
                sh = (short) 2202;
            } else if (bitSet.get(0) && bitSet.get(1)) {
                sh = (short) 2200;
            } else if (bitSet.get(0) && bitSet.get(2)) {
                sh = (short) 2199;
            } else if (bitSet.get(1) && bitSet.get(2)) {
                sh = (short) 2201;
            } else if (bitSet.get(0)) {
                sh = (short) 2196;
            } else if (bitSet.get(1)) {
                sh = (short) 2197;
            } else {
                sh = bitSet.get(2) ? (short) 2198 : null;
            }
            short shortValue = sh != null ? sh.shortValue() : (short) -1;
            if (shortValue == -1) {
                pair = new kotlin.Pair("Invalid Reason", (short) -1);
            } else {
                pair = new kotlin.Pair(sb.toString(), java.lang.Short.valueOf(shortValue));
            }
            java.lang.String str = (java.lang.String) pair.component1();
            short shortValue2 = ((java.lang.Number) pair.component2()).shortValue();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("reason", str);
            hashMap.put("errorCode", java.lang.Short.valueOf(shortValue2));
            c("ImmersiveNotSupported", hashMap);
        }
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.a("l1", "Immersive support - config, device, adResponse - (" + enableImmersive + io.ktor.sse.ServerSentEventKt.SPACE + z + io.ktor.sse.ServerSentEventKt.SPACE + a2 + ")");
        }
        return z2;
    }

    public final void a(com.inmobi.media.AbstractC2421g1 listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "onAdDisplayed " + this);
        }
        com.inmobi.ads.AdMetaInfo k = k();
        if (k == null) {
            com.inmobi.media.C2799u9 c2799u92 = this.i;
            if (c2799u92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c2799u92.b("l1", "callback onAdDisplayed failed. ad meta info is null");
            }
            b(listener);
            return;
        }
        com.inmobi.media.C2799u9 c2799u93 = this.i;
        if (c2799u93 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u93.a("l1", "callback - onAdDisplayed");
        }
        listener.a(k);
    }

    public final void a(com.inmobi.media.ads.network.common.model.AdResponse adResponse) {
        java.util.LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "handleAdFetchSuccessful " + this);
        }
        if (!this.k && o() != null) {
            if (this.b == 1) {
                this.m = adResponse;
                com.inmobi.media.ads.network.common.model.AdSet s = s();
                this.s = s != null ? s.getIsPod() : false;
                this.h = new java.util.concurrent.CopyOnWriteArrayList();
                com.inmobi.media.ads.network.common.model.AdSet s2 = s();
                if (s2 != null && (ads = s2.getAds()) != null) {
                    for (com.inmobi.media.ads.network.common.model.Ad ad : ads) {
                        this.h.add(null);
                    }
                }
                G();
                return;
            }
            com.inmobi.media.C2799u9 c2799u92 = this.i;
            if (c2799u92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c2799u92.b("l1", "incorrect state - " + ((int) this.b));
            }
            b(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2118);
            return;
        }
        c((short) 2185);
        com.inmobi.media.C2799u9 c2799u93 = this.i;
        if (c2799u93 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u93.b("l1", "adUnit is destroyed");
        }
    }

    public final void a(com.inmobi.ads.InMobiAdRequestStatus inMobiAdRequestStatus, short s) {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "handleMarkupFetchFailure " + this);
        }
        try {
            if (this.b == 1) {
                com.inmobi.media.C2799u9 c2799u92 = this.i;
                if (c2799u92 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                    c2799u92.b("l1", "Failed to fetch ad for placement id: " + this.l + ", reason - " + inMobiAdRequestStatus.getMessage());
                }
                java.lang.String str = "MarkupFetch failed reason is: " + inMobiAdRequestStatus.getMessage();
                com.inmobi.media.C2799u9 c2799u93 = this.i;
                if (c2799u93 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                    c2799u93.b("l1", str);
                }
                com.inmobi.media.C2799u9 c2799u94 = this.i;
                if (c2799u94 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                    c2799u94.d("l1", "AdUnit " + this + " state - FAILED");
                }
                c((byte) 3);
                b((byte) 1);
                if (s != 0) {
                    b(s);
                }
                com.inmobi.media.AbstractC2421g1 n = n();
                if (n != null) {
                    n.a(inMobiAdRequestStatus);
                    return;
                }
                com.inmobi.media.C2799u9 c2799u95 = this.i;
                if (c2799u95 != null) {
                    c2799u95.a();
                }
            }
        } catch (java.lang.Exception e) {
            com.inmobi.media.C2799u9 c2799u96 = this.i;
            if (c2799u96 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c2799u96.a("l1", "onAdFetchFailed with error: ", e);
            }
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.AbstractC2665p9.a(e);
        }
    }

    public final void a(short s) {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.b("l1", "handleAdShowFailure " + this + " errorCode - " + ((int) s));
        }
        com.inmobi.media.C2799u9 c2799u92 = this.i;
        if (c2799u92 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u92.d("l1", "AdUnit " + this + " state - FAILED");
        }
        c((byte) 3);
        b((byte) 4);
        com.inmobi.media.AbstractC2421g1 n = n();
        if (n != null) {
            n.b();
        }
        if (s != 0) {
            d(s);
        }
    }

    public final void a(com.inmobi.ads.InMobiAdRequestStatus requestStatus, boolean z, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestStatus, "requestStatus");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.b("l1", "handleAdFetchFailure " + this + " errorCode - " + ((int) s));
        }
        if (this.b == 3 && z) {
            com.inmobi.media.C2799u9 c2799u92 = this.i;
            if (c2799u92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c2799u92.d("l1", "AdUnit " + this + " state - FAILED");
            }
            c((byte) 3);
            b((byte) 1);
        }
        com.inmobi.media.AbstractC2421g1 n = n();
        if (n != null) {
            n.a(this, requestStatus);
        }
        if (s != 0) {
            b(s);
        }
    }

    public final void a(java.util.Map map) {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "setPublisherSuppliedExtras " + this + " - " + map);
        }
        this.l.c = map;
    }

    public static final kotlin.Unit a(com.inmobi.media.AbstractC2551l1 abstractC2551l1) {
        com.inmobi.media.C2709r1 c2709r1 = abstractC2551l1.z;
        c2709r1.getClass();
        c2709r1.e = android.os.SystemClock.elapsedRealtime();
        abstractC2551l1.g();
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(com.inmobi.media.AbstractC2551l1 abstractC2551l1, com.inmobi.media.EnumC2372e6 errorCode) {
        short s;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "it");
        com.inmobi.ads.InMobiAdRequestStatus inMobiAdRequestStatus = new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        int ordinal = errorCode.ordinal();
        if (ordinal != 0) {
            if (ordinal != 21) {
                switch (ordinal) {
                    case 12:
                        s = 2101;
                        break;
                    case 13:
                        s = 2102;
                        break;
                    case 14:
                        s = 2103;
                        break;
                    case 15:
                        s = 2104;
                        break;
                    case 16:
                        s = 2105;
                        break;
                }
            } else {
                s = 2228;
            }
            abstractC2551l1.a(inMobiAdRequestStatus, true, s);
            return kotlin.Unit.INSTANCE;
        }
        s = 2100;
        abstractC2551l1.a(inMobiAdRequestStatus, true, s);
        return kotlin.Unit.INSTANCE;
    }

    public final void a(final kotlin.jvm.functions.Function0 onSuccess, final kotlin.jvm.functions.Function1 onMaxRetryReached) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onMaxRetryReached, "onMaxRetryReached");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        java.lang.Object obj = null;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            com.inmobi.media.C2586ma c2586ma = this.v;
            c2799u9.c("l1", "loadWithRetry " + (c2586ma != null ? java.lang.Integer.valueOf(c2586ma.b) : null));
        }
        com.inmobi.media.C2586ma c2586ma2 = this.v;
        if (c2586ma2 != null) {
            com.inmobi.media.EnumC2372e6 a2 = com.inmobi.media.Ze.a();
            if (a2 == null) {
                obj = com.inmobi.media.Pf.f4898a;
            } else {
                int i = c2586ma2.b + 1;
                c2586ma2.b = i;
                if (i >= c2586ma2.f5332a.b) {
                    obj = new com.inmobi.media.C2326cc(a2);
                } else {
                    obj = com.inmobi.media.C2833vh.f5512a;
                }
            }
        }
        if (obj instanceof com.inmobi.media.C2326cc) {
            onMaxRetryReached.invoke(((com.inmobi.media.C2326cc) obj).f5138a);
            return;
        }
        if (obj instanceof com.inmobi.media.Pf) {
            com.inmobi.media.C2799u9 c2799u92 = this.i;
            if (c2799u92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c2799u92.c("l1", "load with retry success");
            }
            onSuccess.invoke();
            return;
        }
        if (!(obj instanceof com.inmobi.media.C2833vh)) {
            if (obj == null) {
                com.inmobi.media.C2799u9 c2799u93 = this.i;
                if (c2799u93 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                    c2799u93.c("l1", "shouldProceedToLoad result null. starting as if we have internet.");
                }
                onSuccess.invoke();
                return;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.inmobi.media.C2799u9 c2799u94 = this.i;
        if (c2799u94 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u94.c("l1", "load failed, retrying");
        }
        this.x.postDelayed(new java.lang.Runnable() { // from class: com.inmobi.media.l1$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.AbstractC2551l1.a(com.inmobi.media.AbstractC2551l1.this, onSuccess, onMaxRetryReached);
            }
        }, this.w != null ? r8.f5508a : 1000L);
    }

    public static final void a(com.inmobi.media.AbstractC2551l1 abstractC2551l1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1) {
        com.inmobi.media.C2799u9 c2799u9 = abstractC2551l1.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            com.inmobi.media.C2586ma c2586ma = abstractC2551l1.v;
            c2799u9.c("l1", "Loading from retry Handler " + (c2586ma != null ? java.lang.Integer.valueOf(c2586ma.b) : null));
        }
        abstractC2551l1.a(function0, function1);
    }

    public void a(byte[] bArr) {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "load response " + this);
        }
        com.inmobi.media.C2709r1 c2709r1 = this.z;
        c2709r1.getClass();
        c2709r1.c = android.os.SystemClock.elapsedRealtime();
        if (C()) {
            com.inmobi.media.C2799u9 c2799u92 = this.i;
            if (c2799u92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c2799u92.a("l1", "isBlockingStateForLoadWithResponse - blocking");
                return;
            }
            return;
        }
        if (bArr != null && bArr.length != 0) {
            c((byte) 1);
            com.inmobi.media.C2799u9 c2799u93 = this.i;
            if (c2799u93 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c2799u93.d("l1", "AdUnit " + this + " state - LOADING");
            }
            this.g.a(this.f5305a, new com.inmobi.media.C2498j1(bArr, this, null));
            return;
        }
        b(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INVALID_RESPONSE_IN_LOAD), true, (short) 2143);
        com.inmobi.media.C2799u9 c2799u94 = this.i;
        if (c2799u94 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u94.a("l1", "null response. failing");
        }
    }

    public static final void a(com.inmobi.media.AbstractC2551l1 abstractC2551l1, com.inmobi.media.Y y) {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
        java.util.Objects.toString(y);
        com.inmobi.media.V v = y.b;
        if (v instanceof com.inmobi.media.C2360dj) {
            abstractC2551l1.getClass();
            java.util.Map mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("latency", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - abstractC2551l1.z.d)), kotlin.TuplesKt.to("networkType", com.inmobi.media.B5.g()), kotlin.TuplesKt.to("plId", java.lang.Long.valueOf(abstractC2551l1.l.f5497a)));
            java.lang.String str = abstractC2551l1.l.f;
            if (str != null) {
                mutableMapOf.put("plType", str);
            }
            java.lang.String str2 = abstractC2551l1.l.e;
            if (str2 != null) {
                mutableMapOf.put("adType", str2);
            }
            abstractC2551l1.b("ServerNoFill", mutableMapOf);
            abstractC2551l1.b(y.f5055a, (short) 0);
            return;
        }
        if (v instanceof com.inmobi.media.N6) {
            abstractC2551l1.b(y.f5055a, ((com.inmobi.media.N6) v).f4848a);
            return;
        }
        if (v instanceof com.inmobi.media.O6) {
            abstractC2551l1.b(kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("errorCode", java.lang.Integer.valueOf(((com.inmobi.media.O6) v).f4870a))));
            abstractC2551l1.b(y.f5055a, (short) 2205);
        } else {
            if (v instanceof com.inmobi.media.C2306bj) {
                abstractC2551l1.b(((com.inmobi.media.C2306bj) v).f5127a);
                abstractC2551l1.b(y.f5055a, (short) 0);
                return;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final void a(com.inmobi.media.AbstractC2551l1 abstractC2551l1, com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi) {
        abstractC2551l1.m(gestureDetectorOnGestureListenerC2675pi);
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void a(final com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView, final java.lang.String errorCode) {
        android.os.Handler handler;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.a("l1", "onRenderViewSignaledAdFailed " + this);
        }
        if (this.k || o() == null || (handler = this.j) == null) {
            return;
        }
        handler.post(new java.lang.Runnable() { // from class: com.inmobi.media.l1$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.AbstractC2551l1.a(com.inmobi.media.AbstractC2551l1.this, renderView, errorCode);
            }
        });
    }

    public static final void a(com.inmobi.media.AbstractC2551l1 abstractC2551l1, com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi, java.lang.String str) {
        abstractC2551l1.a(gestureDetectorOnGestureListenerC2675pi, (short) 2137, str);
    }

    public void a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi, short s, java.lang.String failureErrorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failureErrorCode, "failureErrorCode");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.b("l1", "Render view signaled ad failed, for index " + this.h.indexOf(gestureDetectorOnGestureListenerC2675pi) + io.ktor.sse.ServerSentEventKt.SPACE + this);
        }
        if (gestureDetectorOnGestureListenerC2675pi == null || !kotlin.jvm.internal.Intrinsics.areEqual(gestureDetectorOnGestureListenerC2675pi.getMarkupType(), "htmlUrl")) {
            return;
        }
        b(gestureDetectorOnGestureListenerC2675pi, failureErrorCode);
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void a(java.util.HashMap params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "onAdInteraction " + this);
        }
        if (this.k || o() == null) {
            return;
        }
        com.inmobi.media.C2799u9 c2799u92 = this.i;
        if (c2799u92 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u92.a("l1", "Ad interaction. Params: " + params);
        }
        com.inmobi.media.AbstractC2421g1 n = n();
        if (n != null) {
            n.a(params);
        }
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void a(final com.inmobi.media.C2888xk telemetryOnAdImpression) {
        com.inmobi.media.C2913yk c2913yk;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(telemetryOnAdImpression, "telemetryOnAdImpression");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "onImpressionFiredFromTemplate " + this);
        }
        telemetryOnAdImpression.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("imraid_impressionFired", "<set-?>");
        telemetryOnAdImpression.f = "imraid_impressionFired";
        if (!this.k && o() != null) {
            com.inmobi.media.C2799u9 c2799u92 = this.i;
            if (c2799u92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c2799u92.a("l1", "onImpressionFiredFromTemplate");
            }
            android.os.Handler handler = this.j;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.inmobi.media.l1$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.inmobi.media.AbstractC2551l1.a(com.inmobi.media.AbstractC2551l1.this, telemetryOnAdImpression);
                    }
                });
                return;
            }
            return;
        }
        com.inmobi.media.C2709r1 c2709r1 = telemetryOnAdImpression.f5555a;
        if (c2709r1 == null || (c2913yk = c2709r1.b) == null || (atomicBoolean = c2913yk.f5575a) == null || !atomicBoolean.getAndSet(true)) {
            java.util.LinkedHashMap a2 = telemetryOnAdImpression.a();
            a2.put("networkType", com.inmobi.media.B5.g());
            a2.put("errorCode", (short) 2180);
            java.lang.String str = telemetryOnAdImpression.d;
            if (str == null) {
                str = "";
            }
            a2.put("impressionId", str);
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b("AdImpressionSuccessful", a2, com.inmobi.media.EnumC2728rk.f5431a);
        }
    }

    public static final void a(com.inmobi.media.AbstractC2551l1 abstractC2551l1, com.inmobi.media.C2888xk c2888xk) {
        abstractC2551l1.u.a(c2888xk);
    }

    @Override // com.inmobi.media.AbstractC2726ri, com.inmobi.media.InterfaceC2729rl
    public final void a() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "onUserLeaveApplication " + this);
        }
        if (this.k || o() == null) {
            return;
        }
        com.inmobi.media.C2799u9 c2799u92 = this.i;
        if (c2799u92 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u92.a("l1", "User left application");
        }
        com.inmobi.media.AbstractC2421g1 n = n();
        if (n != null) {
            n.e();
        }
    }

    public final void a(com.inmobi.media.ads.network.common.model.Ad ad, java.util.Map map) {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "updateIdsInTelemetryPayload " + this);
        }
        if (ad != null) {
            map.put("creativeId", ad.getCreativeId());
        }
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void a(java.lang.String eventType, java.util.HashMap kv) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kv, "kv");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "onRenderViewRequestedAction " + this);
        }
        c(eventType, kv);
    }

    public final void a(java.lang.String str, java.util.Map map) {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "addRetryCountToTelemetryEvent event - " + str);
        }
        switch (str.hashCode()) {
            case -1959333523:
                if (!str.equals("RenderSuccess")) {
                    return;
                }
                break;
            case 167123846:
                if (!str.equals("ServerFill")) {
                    return;
                }
                break;
            case 885222501:
                if (!str.equals("ServerError")) {
                    return;
                }
                break;
            case 925075267:
                if (!str.equals("AdLoadSuccessful")) {
                    return;
                }
                break;
            case 1881615718:
                if (!str.equals("AdLoadFailed")) {
                    return;
                }
                break;
            case 1925668903:
                if (!str.equals("ServerNoFill")) {
                    return;
                }
                break;
            default:
                return;
        }
        com.inmobi.media.C2586ma c2586ma = this.v;
        if (c2586ma != null) {
            map.put("retryCount", java.lang.Integer.valueOf(c2586ma.b));
        }
    }

    public final void a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi, java.util.LinkedHashSet linkedHashSet) {
        com.inmobi.media.core.config.models.AdConfig.ViewabilityConfig viewability;
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.a("l1", "omidSessionForHtmlMarkup " + this);
        }
        com.inmobi.media.core.config.models.AdConfig adConfig = this.c;
        com.inmobi.media.core.config.models.AdConfig.OmidConfig omidConfig = (adConfig == null || (viewability = adConfig.getViewability()) == null) ? null : viewability.getOmidConfig();
        if (omidConfig == null || omidConfig.isOmidEnabled()) {
            com.inmobi.media.Jf.f4781a.getClass();
            if (com.iab.omid.library.inmobi.Omid.isActive()) {
                java.util.Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    com.inmobi.media.Nk nk = (com.inmobi.media.Nk) it.next();
                    if (3 == nk.f4860a) {
                        try {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("creativeType", com.ironsource.X3.i.W);
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(java.lang.String.class, "classType");
                            java.lang.Object obj = nk.b.get("creativeType");
                            java.lang.String str = (java.lang.String) (java.lang.String.class.isInstance(obj) ? java.lang.String.class.cast(obj) : null);
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("customReferenceData", com.ironsource.X3.i.W);
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(java.lang.String.class, "classType");
                            java.lang.Object obj2 = nk.b.get("customReferenceData");
                            java.lang.String str2 = (java.lang.String) (java.lang.String.class.isInstance(obj2) ? java.lang.String.class.cast(obj2) : null);
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("isolateVerificationScripts", com.ironsource.X3.i.W);
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(java.lang.Boolean.class, "classType");
                            java.lang.Object obj3 = nk.b.get("isolateVerificationScripts");
                            java.lang.Boolean bool = (java.lang.Boolean) (java.lang.Boolean.class.isInstance(obj3) ? java.lang.Boolean.class.cast(obj3) : null);
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("impressionType", com.ironsource.X3.i.W);
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(java.lang.Byte.class, "classType");
                            java.lang.Object obj4 = nk.b.get("impressionType");
                            java.lang.Byte b = (java.lang.Byte) (java.lang.Byte.class.isInstance(obj4) ? java.lang.Byte.class.cast(obj4) : null);
                            com.inmobi.media.C2723rf a2 = (str == null || bool == null || b == null) ? null : com.inmobi.media.Cf.a(str, gestureDetectorOnGestureListenerC2675pi, bool.booleanValue(), this.l.k, b.byteValue(), str2);
                            if (a2 != null) {
                                nk.b.put("omidAdSession", a2);
                                nk.b.put("deferred", java.lang.Boolean.TRUE);
                                com.inmobi.media.C2799u9 c2799u92 = this.i;
                                if (c2799u92 != null) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                                    c2799u92.a("l1", "OMID ad session created and WebView container registered with OMID");
                                }
                            } else {
                                com.inmobi.media.C2799u9 c2799u93 = this.i;
                                if (c2799u93 != null) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                                    c2799u93.a("l1", "Ignoring IAB meta data for this ad markup");
                                }
                            }
                        } catch (java.lang.Exception e) {
                            com.inmobi.media.C2799u9 c2799u94 = this.i;
                            if (c2799u94 != null) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                                c2799u94.b("l1", "Setting up impression tracking for IAB encountered an unexpected error: " + e.getMessage());
                            }
                            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
                            com.inmobi.media.AbstractC2665p9.a(e);
                        }
                    }
                }
            }
        }
    }

    public final void a(com.inmobi.media.ads.network.common.model.Ad ad, java.lang.String str) {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "updateAdForBlob " + this);
        }
        ad.setWebVast(str);
        b(ad);
    }

    public final void a(java.lang.String blob, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blob, "blob");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "saveBlob " + this);
        }
        this.g.a(this.f5305a, new com.inmobi.media.C2524k1(this, str, blob, null));
    }

    public final void a(java.lang.String jsCallbackNamespace, java.lang.String callback, com.inmobi.media.G2 receiver, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiver, "receiver");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "getBlob " + this);
        }
        this.g.a(this.f5305a, new com.inmobi.media.C2473i1(this, str, receiver, jsCallbackNamespace, callback, null));
    }

    public void a(int i, com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "Show pod ad with index : " + i + " from creative: " + this.h.indexOf(renderView) + io.ktor.sse.ServerSentEventKt.SPACE + this);
        }
        if (i >= 0) {
            this.p = i;
        } else {
            this.p++;
        }
    }

    @Override // com.inmobi.media.InterfaceC2842w0
    public void a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView, android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.c("l1", "closeCurrentPodAd " + this);
        }
    }

    @Override // com.inmobi.media.InterfaceC2842w0
    public boolean a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 == null) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
        c2799u9.c("l1", "hasNextAdInAdPod " + this);
        return false;
    }

    @Override // com.inmobi.media.Dk
    public void a(byte b) {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.a("l1", "onTimeOut " + this);
        }
        if (b == 0) {
            com.inmobi.media.C2799u9 c2799u92 = this.i;
            if (c2799u92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c2799u92.a("l1", "AdRequestTimeOut by timer, Adstate=" + ((int) this.b));
            }
            if (this.b != 3) {
                b(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), (short) 2109);
                return;
            }
            return;
        }
        if (b != 2 && b != 1) {
            if (b == 4) {
                com.inmobi.media.C2799u9 c2799u93 = this.i;
                if (c2799u93 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                    c2799u93.a("l1", "Show RequestTimeOut by show timer");
                }
                com.inmobi.media.AbstractC2421g1 n = n();
                if (n != null) {
                    n.d();
                    return;
                }
                return;
            }
            com.inmobi.media.C2799u9 c2799u94 = this.i;
            if (c2799u94 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c2799u94.a("l1", "Unknown TimeOut ignored");
                return;
            }
            return;
        }
        com.inmobi.media.C2799u9 c2799u95 = this.i;
        if (c2799u95 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u95.a("l1", "Internal LoadTimeOut by timer, Adstate=" + ((int) this.b));
        }
        if (this.b != 3) {
            this.x.removeCallbacksAndMessages(null);
            com.inmobi.media.C2799u9 c2799u96 = this.i;
            if (c2799u96 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c2799u96.a("l1", "adUnitEventListener=" + n() + ", Adstate=" + ((int) this.b));
            }
            if (2 == this.b) {
                K();
                i();
                c(com.inmobi.media.Ze.a() == null ? (short) 2139 : (short) 2203);
                com.inmobi.media.AbstractC2421g1 n2 = n();
                if (n2 != null) {
                    n2.a(this, new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    return;
                }
                return;
            }
            if (1 == this.b) {
                K();
                c((short) 2138);
                com.inmobi.media.AbstractC2421g1 n3 = n();
                if (n3 != null) {
                    n3.a(this, new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT));
                }
            }
        }
    }

    public final void a(int i, boolean z) {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.a("l1", "Destroying container for index " + i + io.ktor.sse.ServerSentEventKt.SPACE + this);
        }
        java.util.concurrent.CopyOnWriteArrayList list = this.h;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "list");
        if (i < 0 || i >= list.size()) {
            return;
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) this.h.get(i);
        if (gestureDetectorOnGestureListenerC2675pi != null) {
            gestureDetectorOnGestureListenerC2675pi.J0.set(z);
            gestureDetectorOnGestureListenerC2675pi.stopLoading();
            gestureDetectorOnGestureListenerC2675pi.b();
        }
        this.h.set(i, null);
    }

    public final void a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi, java.lang.Integer num, int i) {
        int intValue;
        if (gestureDetectorOnGestureListenerC2675pi != null) {
            intValue = this.h.indexOf(gestureDetectorOnGestureListenerC2675pi);
        } else if (num == null) {
            return;
        } else {
            intValue = num.intValue();
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(intValue);
        if (b != null) {
            java.util.Iterator it = com.inmobi.media.Li.a(b, "pod_abort").iterator();
            while (it.hasNext()) {
                java.lang.String url = kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default((java.lang.String) it.next(), "$PODINDEX", java.lang.String.valueOf(intValue), false, 4, (java.lang.Object) null), "$REASON", java.lang.String.valueOf(i), false, 4, (java.lang.Object) null);
                com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
                com.inmobi.media.C2799u9 c2799u9 = this.i;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
                com.inmobi.media.A3.a(url, true, c2799u9);
            }
        }
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView, java.lang.String trackerName, java.util.Map macros) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(macros, "macros");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u9.a("l1", "fireLandingPageTracker " + trackerName + io.ktor.sse.ServerSentEventKt.SPACE + this);
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(this.h.indexOf(renderView));
        if (b != null) {
            for (java.lang.String str : com.inmobi.media.Li.a(b, trackerName)) {
                java.lang.String url = str;
                for (java.util.Map.Entry entry : macros.entrySet()) {
                    url = kotlin.text.StringsKt.replace$default(url, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, (java.lang.Object) null);
                }
                com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
                com.inmobi.media.C2799u9 c2799u92 = this.i;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
                com.inmobi.media.A3.a(url, true, c2799u92);
            }
            return;
        }
        com.inmobi.media.C2799u9 c2799u93 = this.i;
        if (c2799u93 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c2799u93.a("l1", "fireLandingPageTracker failed");
        }
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void a(java.lang.String log) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(log, "log");
        com.inmobi.media.AbstractC2421g1 n = n();
        if (n != null) {
            n.a(log);
        }
    }

    @Override // com.inmobi.media.Io
    public final java.lang.String a(int i, double d) {
        return ((com.inmobi.media.Io) this.D.getValue()).a(i, d);
    }

    @Override // com.inmobi.media.Io
    public final java.lang.String a(double d) {
        return ((com.inmobi.media.Io) this.D.getValue()).a(d);
    }
}
