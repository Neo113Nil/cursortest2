package com.inmobi.media;

/* renamed from: com.inmobi.media.qa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2693qa extends com.inmobi.media.AbstractC2551l1 {
    public int F;
    public boolean G;
    public final com.inmobi.media.C2440gk H;
    public kotlin.jvm.functions.Function0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2693qa(android.content.Context context, com.inmobi.media.C2816v0 adPlacement, com.inmobi.media.C2744sa c2744sa) {
        super(context, adPlacement, c2744sa);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adPlacement, "adPlacement");
        this.H = new com.inmobi.media.C2440gk();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qa", "TAG");
        long j = adPlacement.f5497a;
        a(context, adPlacement, c2744sa);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("activity", "monetizationContext");
        super.L();
    }

    public static final void c(com.inmobi.media.C2693qa c2693qa) {
        c2693qa.g(c2693qa.n());
    }

    public static final kotlin.Unit d(com.inmobi.media.C2693qa c2693qa) {
        c2693qa.Z();
        return kotlin.Unit.INSTANCE;
    }

    public static final void e(com.inmobi.media.C2693qa c2693qa) {
        java.util.LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        c2693qa.O();
        if (c2693qa.s) {
            com.inmobi.media.ads.network.common.model.AdSet s = c2693qa.s();
            int size = (s == null || (ads = s.getAds()) == null) ? 0 : ads.size();
            for (int i = 1; i < size; i++) {
                c2693qa.o++;
                c2693qa.O();
            }
        }
    }

    @Override // com.inmobi.media.AbstractC2551l1
    public final void D() {
        if (W()) {
            super.D();
        }
    }

    @Override // com.inmobi.media.AbstractC2551l1
    public final void G() {
        super.G();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(t(), "html") && !kotlin.jvm.internal.Intrinsics.areEqual(t(), "htmlUrl")) {
            a(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 57);
            return;
        }
        if (this.b == 2) {
            com.inmobi.media.C2799u9 c2799u9 = this.i;
            if (c2799u9 != null) {
                c2799u9.a("InMobiInterstitial", "Interstitial ad successfully fetched for placement id: " + this.l);
            }
            com.inmobi.media.AbstractC2421g1 n = n();
            if (n != null) {
                com.inmobi.media.C2799u9 c2799u92 = this.i;
                if (c2799u92 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qa", "TAG");
                    c2799u92.a("qa", "callback - onFetchSuccess");
                }
                c(n);
                return;
            }
            c((short) 2188);
            com.inmobi.media.C2799u9 c2799u93 = this.i;
            if (c2799u93 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qa", "TAG");
                c2799u93.b("qa", "listener is null");
            }
        }
    }

    @Override // com.inmobi.media.AbstractC2551l1
    public final void J() {
        super.J();
        this.F = 0;
    }

    @Override // com.inmobi.media.AbstractC2551l1
    public final void L() {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("activity", "monetizationContext");
        super.L();
    }

    public final boolean W() {
        if (F()) {
            com.inmobi.media.C2799u9 c2799u9 = this.i;
            if (c2799u9 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qa", "TAG");
                c2799u9.a("qa", "Some of the dependency libraries for Interstitial not found");
            }
            a(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return false;
        }
        com.inmobi.media.AbstractC2421g1 n = n();
        if (n == null || h(n)) {
            return false;
        }
        if (4 == this.b) {
            if (!A()) {
                com.inmobi.media.C2799u9 c2799u92 = this.i;
                if (c2799u92 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qa", "TAG");
                    c2799u92.a("qa", "An ad is ready with the ad unit. Signaling ad load success ...");
                }
                com.inmobi.media.AbstractC2421g1 n2 = n();
                if (n2 == null) {
                    com.inmobi.media.C2799u9 c2799u93 = this.i;
                    if (c2799u93 != null) {
                        c2799u93.b("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
                    }
                } else {
                    c(n2);
                    d(n2);
                }
                return false;
            }
            super.d();
            this.I = null;
        }
        E();
        return true;
    }

    public final int X() {
        java.util.LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        com.inmobi.media.ads.network.common.model.AdSet s = s();
        if (s != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(s.getPodSuccessCount());
            if (valueOf.intValue() < 1) {
                valueOf = null;
            }
            if (valueOf != null) {
                return valueOf.intValue();
            }
        }
        com.inmobi.media.ads.network.common.model.AdSet s2 = s();
        if (s2 != null && (ads = s2.getAds()) != null) {
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(ads.size());
            java.lang.Integer num = valueOf2.intValue() > 0 ? valueOf2 : null;
            if (num != null) {
                return num.intValue();
            }
        }
        return 1;
    }

    public final void Y() {
        com.inmobi.media.core.config.models.AdConfig adConfig;
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.l.f, "AB") && (adConfig = this.c) != null && adConfig.getSkipNetCheckHB()) {
            com.inmobi.media.C2799u9 c2799u9 = this.i;
            if (c2799u9 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qa", "TAG");
                c2799u9.a("qa", "renderAd without internet check");
            }
            Z();
            return;
        }
        com.inmobi.media.C2799u9 c2799u92 = this.i;
        if (c2799u92 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qa", "TAG");
            c2799u92.a("qa", "renderAd");
        }
        a(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.qa$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.C2693qa.d(com.inmobi.media.C2693qa.this);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.qa$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.C2693qa.a(com.inmobi.media.C2693qa.this, (com.inmobi.media.EnumC2372e6) obj);
            }
        });
    }

    public final void Z() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qa", "TAG");
            c2799u9.a("qa", "renderAdPostInternetCheck");
        }
        super.J();
        this.F = 0;
        try {
            if (N()) {
                return;
            }
            com.inmobi.media.C2709r1 c2709r1 = this.z;
            c2709r1.getClass();
            c2709r1.g = android.os.SystemClock.elapsedRealtime();
            java.lang.String t = t();
            if (!kotlin.jvm.internal.Intrinsics.areEqual(t, "html") && !kotlin.jvm.internal.Intrinsics.areEqual(t, "htmlUrl")) {
                com.inmobi.media.C2799u9 c2799u92 = this.i;
                if (c2799u92 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qa", "TAG");
                    c2799u92.a("qa", "Cannot handle markupType: " + t());
                }
                b(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2121);
                return;
            }
            android.os.Handler handler = this.j;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.inmobi.media.qa$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.inmobi.media.C2693qa.e(com.inmobi.media.C2693qa.this);
                    }
                });
            }
        } catch (java.lang.IllegalStateException e) {
            com.inmobi.media.C2799u9 c2799u93 = this.i;
            if (c2799u93 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qa", "TAG");
                c2799u93.a("qa", "Exception while loading ad.", e);
            }
            b(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2134);
        }
    }

    @Override // com.inmobi.media.InterfaceC2842w0
    public final void a(int i, com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
    }

    public final void a0() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qa", "TAG");
            c2799u9.d("qa", "AdUnit " + this + " state - READY");
        }
        c((byte) 4);
        com.inmobi.media.C2709r1 c2709r1 = this.z;
        c2709r1.getClass();
        c2709r1.i = android.os.SystemClock.elapsedRealtime();
        Q();
        T();
        this.H.f5224a = true;
        com.inmobi.media.AbstractC2421g1 n = n();
        if (n != null) {
            com.inmobi.media.C2799u9 c2799u92 = this.i;
            if (c2799u92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qa", "TAG");
                c2799u92.a("qa", "signaling Success");
            }
            d(n);
        }
    }

    public final short b(android.content.Context context) {
        try {
            com.inmobi.media.C2799u9 c2799u9 = this.i;
            if (c2799u9 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qa", "TAG");
                c2799u9.a("qa", ">>> Starting InMobiAdActivity to display interstitial ad ...");
            }
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi container = j();
            if (container == null) {
                return (short) 2155;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual("unknown", container.getMarkupType())) {
                return (short) 2156;
            }
            android.util.SparseArray sparseArray = com.inmobi.ads.rendering.InMobiAdActivity.t;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(container, "container");
            int hashCode = container.hashCode();
            com.inmobi.ads.rendering.InMobiAdActivity.t.put(hashCode, container);
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.inmobi.ads.rendering.InMobiAdActivity.class);
            com.inmobi.media.C2799u9 obj = this.i;
            if (obj != null) {
                java.lang.String uuid = java.util.UUID.randomUUID().toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                java.util.HashMap hashMap = com.inmobi.media.U8.f4992a;
                java.lang.String key = uuid.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "obj");
                com.inmobi.media.U8.f4992a.put(key, new java.lang.ref.WeakReference(obj));
                intent.putExtra("loggerCacheKey", uuid.toString());
            }
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", hashCode);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
            java.lang.String t = t();
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", kotlin.jvm.internal.Intrinsics.areEqual(t, "html") ? 200 : kotlin.jvm.internal.Intrinsics.areEqual(t, "htmlUrl") ? 202 : 201);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", true);
            if (context == null) {
                return (short) 2157;
            }
            if (this.s) {
                if (this.q == -1) {
                    this.q = java.lang.System.currentTimeMillis();
                }
                if (this.o > 0) {
                    intent.setFlags(603979776);
                }
            }
            android.content.Context context2 = com.inmobi.media.Xi.f5051a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
            if (!(context instanceof android.app.Activity)) {
                intent.setFlags(268435456);
            }
            context.startActivity(intent);
            return (short) 0;
        } catch (java.lang.Exception e) {
            com.inmobi.media.C2799u9 c2799u92 = this.i;
            if (c2799u92 != null) {
                c2799u92.b("InMobiInterstitial", "Cannot show ad; SDK encountered an unexpected error");
            }
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.AbstractC2665p9.a(e);
            return (short) 2154;
        }
    }

    public final void b0() {
        com.inmobi.media.ads.network.common.model.MetaInfo metaInfo;
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
            c2799u9.c("l1", "submitAdNotReady " + this);
        }
        com.inmobi.media.C2440gk c2440gk = this.H;
        com.inmobi.media.C2709r1 c2709r1 = this.z;
        com.inmobi.media.ads.network.common.model.Ad q = q();
        java.lang.String creativeType = (q == null || (metaInfo = q.getMetaInfo()) == null) ? null : metaInfo.getCreativeType();
        com.inmobi.media.ads.network.common.model.AdSet s = s();
        java.lang.Boolean valueOf = s != null ? java.lang.Boolean.valueOf(s.getIsRewarded()) : null;
        java.lang.String t = t();
        byte b = this.b;
        com.inmobi.media.ads.network.common.model.Ad q2 = q();
        java.lang.String impressionId = q2 != null ? q2.getImpressionId() : null;
        com.inmobi.media.C2763t0 adNotReadyMetadata = new com.inmobi.media.C2763t0(c2709r1, creativeType, valueOf, t, b, impressionId);
        c2440gk.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adNotReadyMetadata, "adNotReadyMetadata");
        java.util.HashMap hashMap = new java.util.HashMap();
        long j = c2709r1.c;
        kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2939zl.f5596a;
        hashMap.put("latency", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j));
        hashMap.put("errorCode", java.lang.Short.valueOf(b == 0 ? (short) 2204 : b == 1 ? (short) 2282 : b == 2 ? (short) 2283 : b == 3 ? (short) 2284 : b == 6 ? (short) 2285 : b == 7 ? (short) 2209 : b == 8 ? (short) 2242 : (short) 2210));
        hashMap.put("markupType", t);
        if (creativeType != null) {
            hashMap.put("creativeType", creativeType);
        }
        if (impressionId != null) {
            hashMap.put("impressionId", impressionId);
        }
        if (valueOf != null) {
            hashMap.put("isRewarded", valueOf);
        }
        java.lang.String a2 = c2709r1.a();
        if (a2.length() > 0) {
            hashMap.put("metadataBlob", a2);
        }
        hashMap.put("adType", c2709r1.f5416a.m());
        hashMap.put("networkType", com.inmobi.media.B5.o());
        hashMap.put("plId", java.lang.Long.valueOf(c2709r1.f5416a.l.f5497a));
        hashMap.put("isAdLoaded", java.lang.Boolean.valueOf(c2440gk.f5224a));
        java.lang.String str = c2709r1.f5416a.l.f;
        if (str != null) {
            hashMap.put("plType", str);
        }
        com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
        com.inmobi.media.C2624nk.b("AdNotReady", hashMap, com.inmobi.media.EnumC2728rk.f5431a);
    }

    public final void c0() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            c2799u9.a("InMobiInterstitial", "Successfully loaded Interstitial ad markup in the WebView for placement id: " + this.l);
        }
        h();
        a0();
    }

    public final void f(short s) {
        if (this.b == 2) {
            com.inmobi.media.C2799u9 c2799u9 = this.i;
            if (c2799u9 != null) {
                c2799u9.a("InMobiInterstitial", "Failed to load the Interstitial markup in the WebView for placement id: " + this.l);
            }
            b(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s);
        }
    }

    public final void g(com.inmobi.media.AbstractC2421g1 abstractC2421g1) {
        if (this.b != 6) {
            if (this.b == 7) {
                this.F++;
                return;
            }
            return;
        }
        int i = this.F + 1;
        this.F = i;
        if (i != 1) {
            c((byte) 7);
            return;
        }
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            c2799u9.a("InMobiInterstitial", "Successfully displayed Interstitial for placement id: " + this.l);
        }
        if (abstractC2421g1 != null) {
            b((byte) 4);
            a(abstractC2421g1);
        }
    }

    public final boolean h(com.inmobi.media.AbstractC2421g1 abstractC2421g1) {
        byte b = this.b;
        if (b == 1) {
            com.inmobi.media.C2799u9 c2799u9 = this.i;
            if (c2799u9 != null) {
                c2799u9.b("InMobiInterstitial", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + this.l);
            }
            a(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD), false, (short) 2008);
            return true;
        }
        if (b == 7 || b == 6) {
            com.inmobi.media.C2799u9 c2799u92 = this.i;
            if (c2799u92 != null) {
                c2799u92.b("InMobiInterstitial", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + this.l);
            }
            a(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2010);
            return true;
        }
        if (b != 2) {
            return false;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual("html", t()) || kotlin.jvm.internal.Intrinsics.areEqual("htmlUrl", t())) {
            com.inmobi.media.C2799u9 c2799u93 = this.i;
            if (c2799u93 != null) {
                c2799u93.b("InMobiInterstitial", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + this.l);
            }
            a(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD), false, (short) 2011);
        } else {
            c(abstractC2421g1);
        }
        return true;
    }

    @Override // com.inmobi.media.AbstractC2551l1
    public final void i() {
        if (this.h.isEmpty()) {
            return;
        }
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            if (!this.r.contains(java.lang.Integer.valueOf(i))) {
                com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) this.h.get(i);
                if (kotlin.jvm.internal.Intrinsics.areEqual(gestureDetectorOnGestureListenerC2675pi != null ? gestureDetectorOnGestureListenerC2675pi.getMarkupType() : null, "htmlUrl")) {
                    b(gestureDetectorOnGestureListenerC2675pi, com.inmobi.media.AbstractC2551l1.p(gestureDetectorOnGestureListenerC2675pi));
                    gestureDetectorOnGestureListenerC2675pi.g();
                }
            }
        }
    }

    @Override // com.inmobi.media.AbstractC2551l1
    public final java.lang.String m() {
        return "int";
    }

    @Override // com.inmobi.media.AbstractC2551l1
    public final void n(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        if (!this.s) {
            V();
        } else if (!a(renderView)) {
            V();
        }
        super.n(renderView);
    }

    @Override // com.inmobi.media.AbstractC2551l1
    public final com.inmobi.media.GestureDetectorOnGestureListenerC2675pi r() {
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = (this.h.size() <= 0 || this.p >= this.h.size()) ? null : (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) this.h.get(this.p);
        if (this.G && gestureDetectorOnGestureListenerC2675pi != null) {
            gestureDetectorOnGestureListenerC2675pi.l();
        }
        return gestureDetectorOnGestureListenerC2675pi;
    }

    @Override // com.inmobi.media.AbstractC2551l1
    public final byte u() {
        return (byte) 1;
    }

    @Override // com.inmobi.media.AbstractC2551l1
    public final void a(byte[] bArr) {
        if (W()) {
            super.a(bArr);
        }
    }

    @Override // com.inmobi.media.AbstractC2551l1
    public final void m(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi) {
        super.m(gestureDetectorOnGestureListenerC2675pi);
        if (!this.s) {
            if (this.b == 2) {
                b((byte) 1);
                c0();
                return;
            }
            return;
        }
        int indexOf = this.h.indexOf(gestureDetectorOnGestureListenerC2675pi);
        if (indexOf < this.p) {
            com.inmobi.media.C2799u9 c2799u9 = this.i;
            if (c2799u9 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qa", "TAG");
                c2799u9.a("qa", "Ignoring loaded ad with index " + indexOf + " as current rendering index is " + this.p);
                return;
            }
            return;
        }
        this.r.add(java.lang.Integer.valueOf(indexOf));
        if (this.b == 2) {
            int X = X();
            for (int i = 0; i < X && i < this.h.size(); i++) {
                if (this.h.get(i) == null || !this.r.contains(java.lang.Integer.valueOf(i))) {
                    return;
                }
            }
            com.inmobi.media.C2799u9 c2799u92 = this.i;
            if (c2799u92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qa", "TAG");
                c2799u92.a("qa", "Providing success based on index " + indexOf);
            }
            b((byte) 1);
            this.p = 0;
            c0();
        }
    }

    @Override // com.inmobi.media.AbstractC2551l1
    public final void d() {
        super.d();
        this.I = null;
    }

    public final void a(final com.inmobi.media.C2744sa c2744sa, final android.app.Activity activity) {
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            a((com.inmobi.media.AbstractC2421g1) c2744sa, (android.content.Context) activity);
        } else {
            ((com.inmobi.media.ExecutorC2378ec) com.inmobi.media.AbstractC2740s6.e.getValue()).f5177a.post(new java.lang.Runnable() { // from class: com.inmobi.media.qa$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    com.inmobi.media.C2693qa.a(com.inmobi.media.C2693qa.this, c2744sa, activity);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final synchronized void e(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        super.e(renderView);
        android.os.Handler handler = this.j;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.inmobi.media.qa$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.inmobi.media.C2693qa.b(com.inmobi.media.C2693qa.this);
                }
            });
        }
    }

    public static final void a(com.inmobi.media.C2693qa c2693qa, com.inmobi.media.AbstractC2421g1 abstractC2421g1, android.content.Context context) {
        c2693qa.a(abstractC2421g1, context);
    }

    public static final void a(final com.inmobi.media.C2693qa c2693qa, final com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi, android.content.Context context) {
        final int indexOf = c2693qa.h.indexOf(gestureDetectorOnGestureListenerC2675pi);
        java.util.concurrent.CopyOnWriteArrayList list = c2693qa.h;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "list");
        if (indexOf < 0 || indexOf >= list.size()) {
            return;
        }
        short b = c2693qa.b(context);
        if (b != 0) {
            c2693qa.e(indexOf);
        }
        c2693qa.b(indexOf, b == 0);
        android.os.Handler handler = c2693qa.j;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.inmobi.media.qa$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    com.inmobi.media.C2693qa.a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.this, c2693qa, indexOf);
                }
            });
        }
    }

    public final void f(com.inmobi.media.AbstractC2421g1 abstractC2421g1) {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qa", "TAG");
            c2799u9.c("qa", "handleAdScreenDismissed " + ((int) this.b));
        }
        if (this.b == 7) {
            int i = this.F - 1;
            this.F = i;
            if (i == 1) {
                c((byte) 6);
                com.inmobi.media.C2799u9 c2799u92 = this.i;
                if (c2799u92 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qa", "TAG");
                    c2799u92.d("qa", "AdUnit " + this + " state - RENDERED");
                    return;
                }
                return;
            }
            return;
        }
        if (this.b == 6 || this.b == 8) {
            this.F--;
            com.inmobi.media.C2799u9 c2799u93 = this.i;
            if (c2799u93 != null) {
                c2799u93.a("InMobiInterstitial", "Interstitial ad dismissed for placement id: " + this.l);
            }
            if (abstractC2421g1 != null) {
                abstractC2421g1.a();
                return;
            }
            com.inmobi.media.C2799u9 c2799u94 = this.i;
            if (c2799u94 != null) {
                c2799u94.c("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
        }
    }

    @Override // com.inmobi.media.AbstractC2551l1, com.inmobi.media.InterfaceC2842w0
    public final void a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView, android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
            c2799u9.c("l1", "closeCurrentPodAd " + this);
        }
        if (this.s) {
            java.lang.Integer num = (java.lang.Integer) this.r.higher(java.lang.Integer.valueOf(this.h.indexOf(renderView)));
            if (num != null) {
                a(num.intValue(), renderView, activity);
            } else {
                b();
            }
        }
    }

    public final void a(com.inmobi.media.AbstractC2421g1 abstractC2421g1, android.content.Context context) {
        if (abstractC2421g1 == null) {
            com.inmobi.media.C2799u9 c2799u9 = this.i;
            if (c2799u9 != null) {
                c2799u9.b("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
            a((short) 2151);
            return;
        }
        kotlin.jvm.functions.Function0 function0 = this.I;
        if (function0 != null) {
            function0.invoke();
            return;
        }
        if (this.b == 8) {
            com.inmobi.media.C2799u9 c2799u92 = this.i;
            if (c2799u92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qa", "TAG");
                c2799u92.b("qa", "unload has been called on this ad. Dont show. ");
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qa", "TAG");
            com.inmobi.media.Sb.a((byte) 2, "qa", "Failed to show Ad as creative has called unload() on the Ad");
            a((short) 2239);
            return;
        }
        if (this.b == 4) {
            e(abstractC2421g1);
            c((byte) 6);
            if (A()) {
                a((short) 2153);
                c((byte) 0);
                com.inmobi.media.GestureDetectorOnGestureListenerC2675pi j = j();
                if (j != null) {
                    j.b();
                    return;
                }
                return;
            }
            if (context == null) {
                context = o();
            }
            short b = b(context);
            if (b != 0) {
                a(b);
                return;
            } else {
                abstractC2421g1.c();
                return;
            }
        }
        com.inmobi.media.Sb.a((byte) 2, "InMobiInterstitial", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
        com.inmobi.media.C2799u9 c2799u93 = this.i;
        if (c2799u93 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qa", "TAG");
            c2799u93.b("qa", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qa", "TAG");
        com.inmobi.media.Sb.a((byte) 1, "qa", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
        a((short) 2152);
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final synchronized void f(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        super.f(renderView);
        android.os.Handler handler = this.j;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.inmobi.media.qa$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    com.inmobi.media.C2693qa.c(com.inmobi.media.C2693qa.this);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC2551l1, com.inmobi.media.InterfaceC2842w0
    public final boolean a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        if (this.s) {
            if (((java.lang.Integer) this.r.higher(java.lang.Integer.valueOf(this.h.indexOf(renderView)))) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.inmobi.media.AbstractC2551l1, com.inmobi.media.Dk
    public final void a(byte b) {
        if (b == 1) {
            if (this.s) {
                if (this.b == 2) {
                    com.inmobi.media.C2799u9 c2799u9 = this.i;
                    if (c2799u9 != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qa", "TAG");
                        c2799u9.b("qa", "RenderView time out");
                    }
                    int X = X();
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= X) {
                            break;
                        }
                        if (!this.r.contains(java.lang.Integer.valueOf(i2))) {
                            i = i2;
                            break;
                        }
                        i2++;
                    }
                    a((com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) null, java.lang.Integer.valueOf(i), 2);
                    i();
                    f();
                    b(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2139);
                    return;
                }
                f();
                return;
            }
            super.a(b);
            return;
        }
        super.a(b);
    }

    @Override // com.inmobi.media.AbstractC2551l1, com.inmobi.media.InterfaceC2842w0
    public final void a(int i, final com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView, final android.content.Context context) {
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        if (!this.s) {
            com.inmobi.media.C2799u9 c2799u9 = this.i;
            if (c2799u9 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qa", "TAG");
                c2799u9.a("qa", "Cannot show an pod ad as isPod is not set.");
                return;
            }
            return;
        }
        if (this.r.contains(java.lang.Integer.valueOf(i)) && i > this.h.indexOf(renderView) && i < this.h.size() && this.h.get(i) != null && ((gestureDetectorOnGestureListenerC2675pi = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) this.h.get(i)) == null || gestureDetectorOnGestureListenerC2675pi.C0)) {
            if (context == null) {
                context = o();
            }
            super.a(i, renderView, context);
            android.os.Handler handler = this.j;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.inmobi.media.qa$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.inmobi.media.C2693qa.a(com.inmobi.media.C2693qa.this, renderView, context);
                    }
                });
                return;
            }
            return;
        }
        com.inmobi.media.C2799u9 c2799u92 = this.i;
        if (c2799u92 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qa", "TAG");
            c2799u92.a("qa", "Cannot show an pod ad with invalid index passed");
        }
        b(this.h.indexOf(renderView), false);
    }

    public static final kotlin.Unit a(com.inmobi.media.C2693qa c2693qa, com.inmobi.media.EnumC2372e6 errorCode) {
        short s;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "it");
        com.inmobi.ads.InMobiAdRequestStatus inMobiAdRequestStatus = new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        int ordinal = errorCode.ordinal();
        if (ordinal != 0) {
            if (ordinal != 21) {
                switch (ordinal) {
                    case 12:
                        s = 2123;
                        break;
                    case 13:
                        s = 2124;
                        break;
                    case 14:
                        s = 2125;
                        break;
                    case 15:
                        s = 2126;
                        break;
                    case 16:
                        s = 2127;
                        break;
                }
            } else {
                s = 2229;
            }
            c2693qa.a(inMobiAdRequestStatus, true, s);
            return kotlin.Unit.INSTANCE;
        }
        s = 2122;
        c2693qa.a(inMobiAdRequestStatus, true, s);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.inmobi.media.AbstractC2551l1
    public final void a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi, short s, java.lang.String failureErrorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failureErrorCode, "failureErrorCode");
        super.a(gestureDetectorOnGestureListenerC2675pi, s, failureErrorCode);
        if (this.s) {
            int indexOf = this.h.indexOf(gestureDetectorOnGestureListenerC2675pi);
            if (indexOf < X()) {
                a(gestureDetectorOnGestureListenerC2675pi, (java.lang.Integer) null, s == 2137 ? 1 : 3);
                f(s);
            }
            a(indexOf, true);
            return;
        }
        f(s);
    }

    public static final void a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi, com.inmobi.media.C2693qa c2693qa, int i) {
        gestureDetectorOnGestureListenerC2675pi.m();
        c2693qa.a(i, false);
    }

    public static final void a(com.inmobi.media.C2693qa c2693qa) {
        c2693qa.e();
        com.inmobi.media.C2799u9 c2799u9 = c2693qa.i;
        if (c2799u9 != null) {
            c2799u9.c("InMobiInterstitial", "Interstitial ad dismissed for placement id: " + c2693qa.l);
        }
        if (c2693qa.n() != null) {
            com.inmobi.media.AbstractC2421g1 n = c2693qa.n();
            if (n != null) {
                n.a();
                return;
            }
            return;
        }
        com.inmobi.media.C2799u9 c2799u92 = c2693qa.i;
        if (c2799u92 != null) {
            c2799u92.c("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
        }
    }

    @Override // com.inmobi.media.AbstractC2551l1, com.inmobi.media.AbstractC2726ri
    public final void a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        super.a(renderView, z);
        byte b = this.b;
        if (b == 4) {
            final short s = z ? (short) 2220 : (short) 2219;
            this.I = new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.qa$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.inmobi.media.C2693qa.a(com.inmobi.media.C2693qa.this, s);
                }
            };
            return;
        }
        if (b != 6) {
            if (b == 7) {
                short s2 = z ? (short) 2224 : (short) 2223;
                com.inmobi.media.Sb.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
                com.inmobi.media.C2799u9 c2799u9 = this.i;
                if (c2799u9 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qa", "TAG");
                    c2799u9.b("qa", "RenderProcess of the WebView has crashed. Please create another adUnit");
                }
                renderView.a(z, s2);
                renderView.x();
                f(n());
                return;
            }
            return;
        }
        short s3 = z ? (short) 2222 : (short) 2221;
        com.inmobi.media.Sb.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
        com.inmobi.media.C2799u9 c2799u92 = this.i;
        if (c2799u92 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qa", "TAG");
            c2799u92.b("qa", "RenderProcess of the WebView has crashed. Please create another adUnit");
        }
        renderView.x();
        if (this.F == 0) {
            a(s3);
        } else {
            renderView.a(z, s3);
            f(n());
        }
    }

    public static final kotlin.Unit a(com.inmobi.media.C2693qa c2693qa, short s) {
        com.inmobi.media.Sb.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
        com.inmobi.media.C2799u9 c2799u9 = c2693qa.i;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qa", "TAG");
            c2799u9.b("qa", "RenderProcess of the WebView has crashed. Please create another adUnit");
        }
        c2693qa.a(s);
        c2693qa.I = null;
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.inmobi.media.InterfaceC2842w0
    public final void b() {
        if (this.s) {
            com.inmobi.media.C2799u9 c2799u9 = this.i;
            if (c2799u9 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("qa", "TAG");
                c2799u9.a("qa", "Closing the ad as closeAll is called");
            }
            android.os.Handler handler = this.j;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.inmobi.media.qa$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.inmobi.media.C2693qa.a(com.inmobi.media.C2693qa.this);
                    }
                });
            }
        }
    }

    public static final void b(com.inmobi.media.C2693qa c2693qa) {
        c2693qa.f(c2693qa.n());
    }
}
