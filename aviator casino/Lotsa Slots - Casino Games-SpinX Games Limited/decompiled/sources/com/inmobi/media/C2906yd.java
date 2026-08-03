package com.inmobi.media;

/* renamed from: com.inmobi.media.yd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2906yd extends com.inmobi.media.AbstractC2892y implements com.inmobi.media.InterfaceC2782tj, com.inmobi.media.Ah, com.inmobi.media.InterfaceC2392f {
    public final com.inmobi.media.ads.nativeAd.MediaView b;
    public final android.view.View c;
    public final com.inmobi.media.AbstractC2367e1 d;
    public final com.inmobi.media.Vc e;
    public final com.inmobi.media.Mc f;
    public final com.inmobi.media.Rc g;
    public final com.inmobi.media.H4 h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2906yd(com.inmobi.media.ads.nativeAd.MediaView mediaView, android.view.View view, com.inmobi.media.AbstractC2367e1 adSessionManager, com.inmobi.media.Vc nativeBeaconProcessor, com.inmobi.media.Mc nativeAdUnitComponent, com.inmobi.media.Rc stateMachine) {
        super(r0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeBeaconProcessor, "nativeBeaconProcessor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        com.inmobi.media.C2867x c2867x = nativeAdUnitComponent.f4836a;
        this.b = mediaView;
        this.c = view;
        this.d = adSessionManager;
        this.e = nativeBeaconProcessor;
        this.f = nativeAdUnitComponent;
        this.g = stateMachine;
        com.inmobi.media.G g = c2867x.b;
        this.h = new com.inmobi.media.H4(g.h, g.f4714a.f5382a.f4958a);
    }

    @Override // com.inmobi.media.InterfaceC2782tj
    public final void a() {
        com.inmobi.media.ads.network.inmobiJson.model.NativeMedia media;
        com.inmobi.media.ads.network.inmobiJson.model.AppMetrics appMetrics;
        com.inmobi.media.ads.network.inmobiJson.model.Sponsored sponsored;
        com.inmobi.media.ads.network.inmobiJson.model.CTA cta;
        com.inmobi.media.ads.network.inmobiJson.model.Description description;
        com.inmobi.media.ads.network.inmobiJson.model.Title title;
        com.inmobi.media.ads.network.inmobiJson.model.Icon icon;
        com.inmobi.media.ads.network.inmobiJson.model.AppMetrics appMetrics2;
        com.inmobi.media.ads.network.inmobiJson.model.AppMetrics appMetrics3;
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("NativeLoadedState", "Initialize Called");
        }
        com.inmobi.media.Lc lc = (com.inmobi.media.Lc) this.f.f.getValue();
        java.util.Map a2 = com.inmobi.media.AbstractC2938zk.a(lc.f4817a);
        long j = lc.b.f5131a;
        kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2939zl.f5596a;
        a2.put("latency", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j));
        com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
        com.inmobi.media.C2624nk.b("AdLoadSuccessful", a2, com.inmobi.media.EnumC2728rk.f5431a);
        this.e.b.b.a(com.inmobi.media.C2302bf.f5123a);
        com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject assetsObject = this.f.b.getAssetsObject();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.inmobi.ads.InMobiNative.APP_INSTALLS, (assetsObject == null || (appMetrics3 = assetsObject.getAppMetrics()) == null) ? null : appMetrics3.getDownloads());
        jSONObject.put(com.inmobi.ads.InMobiNative.LIKES, (assetsObject == null || (appMetrics2 = assetsObject.getAppMetrics()) == null) ? null : appMetrics2.getLikes());
        com.inmobi.media.C2511je pubData = new com.inmobi.media.C2511je((assetsObject == null || (title = assetsObject.getTitle()) == null) ? null : title.getText(), (assetsObject == null || (description = assetsObject.getDescription()) == null) ? null : description.getText(), new com.inmobi.media.ads.nativeAd.InMobiNativeImage((assetsObject == null || (icon = assetsObject.getIcon()) == null) ? null : icon.getUrl()), (assetsObject == null || (cta = assetsObject.getCta()) == null) ? null : cta.getText(), jSONObject, (assetsObject == null || (sponsored = assetsObject.getSponsored()) == null) ? null : sponsored.getText(), (assetsObject == null || (appMetrics = assetsObject.getAppMetrics()) == null) ? null : appMetrics.getRating(), kotlin.jvm.internal.Intrinsics.areEqual((assetsObject == null || (media = assetsObject.getMedia()) == null) ? null : media.getType(), "video"), this.b, this.c);
        com.inmobi.media.Ic ic = this.f.c;
        ic.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pubData, "pubData");
        com.inmobi.media.InterfaceC2782tj interfaceC2782tj = ic.c;
        com.inmobi.media.Kd kd = interfaceC2782tj instanceof com.inmobi.media.Kd ? (com.inmobi.media.Kd) interfaceC2782tj : null;
        if (kd != null) {
            kd.a(pubData);
        }
    }

    @Override // com.inmobi.media.InterfaceC2782tj
    public final void c() {
    }

    @Override // com.inmobi.media.Ah
    public final void a(com.inmobi.media.ads.nativeAd.InMobiNativeViewData inMobiNativeViewData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("NativeLoadedState", "registerViewForTracking - parentView: " + inMobiNativeViewData.getParentView() + ", isAttachedToWindow: " + inMobiNativeViewData.getParentView().isAttachedToWindow());
        }
        com.inmobi.media.G g = this.f5559a.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(g, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(g, "<this>");
        long timeToLive = g.f4714a.b.getCacheConfig("native").getTimeToLive();
        long j = g.k;
        if (j == -1) {
            j = g.j + java.util.concurrent.TimeUnit.SECONDS.toMillis(timeToLive);
        }
        if (j - java.lang.System.currentTimeMillis() < 0) {
            com.inmobi.media.InterfaceC2772t9 l2 = l();
            if (l2 != null) {
                ((com.inmobi.media.C2799u9) l2).a("NativeLoadedState", "Ad-Expired");
            }
            java.util.Map a2 = com.inmobi.media.AbstractC2938zk.a(((com.inmobi.media.Lc) this.f.f.getValue()).f4817a);
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b("AdExpired", a2, com.inmobi.media.EnumC2728rk.f5431a);
        }
        this.h.a();
        com.inmobi.media.C2313c0 c2313c0 = this.f5559a.f5538a.d;
        c2313c0.getClass();
        c2313c0.d = android.os.SystemClock.elapsedRealtime();
        this.e.b.d.a(com.inmobi.media.C2302bf.f5123a);
        java.util.Map a3 = com.inmobi.media.AbstractC2938zk.a(((com.inmobi.media.Lc) this.f.f.getValue()).f4817a);
        com.inmobi.media.C2624nk c2624nk2 = com.inmobi.media.C2624nk.f5360a;
        com.inmobi.media.C2624nk.b("StartTracking", a3, com.inmobi.media.EnumC2728rk.f5431a);
        this.g.a(new com.inmobi.media.Be(new com.inmobi.media.Ce(new com.inmobi.media.Fi(), new com.inmobi.media.C2304bh(inMobiNativeViewData, this.b, this.c), this.h, this.d, this.e, this.f), this.g), this);
    }

    @Override // com.inmobi.media.InterfaceC2392f
    public final java.lang.Object a(kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("NativeLoadedState", "onDestroy");
        }
        java.lang.Object a2 = this.g.a(new com.inmobi.media.C2354dd(), this, (kotlin.coroutines.jvm.internal.ContinuationImpl) continuation);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }
}
