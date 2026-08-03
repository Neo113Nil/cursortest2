package com.unity3d.ads.adplayer;

/* compiled from: AndroidEmbeddableWebViewAdPlayer.kt */
@kotlin.Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0011\u0010&\u001a\u00020'H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010(J\t\u0010)\u001a\u00020'H\u0096\u0001J\u0019\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020,H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010-J\u0019\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u00020\u0006H\u0096Aø\u0001\u0000¢\u0006\u0002\u00100J)\u00101\u001a\u00020'2\u0016\u00102\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u000104\u0018\u000103H\u0096Aø\u0001\u0000¢\u0006\u0002\u00105J\u0011\u00106\u001a\u00020'H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010(J\u0019\u00107\u001a\u00020'2\u0006\u00108\u001a\u000209H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010:J\u0019\u0010;\u001a\u00020'2\u0006\u0010/\u001a\u00020<H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010=J\u0019\u0010>\u001a\u00020'2\u0006\u0010?\u001a\u000209H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010:J\u0019\u0010@\u001a\u00020'2\u0006\u0010/\u001a\u00020AH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010BJ\u0019\u0010C\u001a\u00020'2\u0006\u0010+\u001a\u00020,H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010-J\u0019\u0010D\u001a\u00020'2\u0006\u0010/\u001a\u00020EH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010FJ\u0019\u0010G\u001a\u00020'2\u0006\u0010+\u001a\u00020,H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010-J\u0019\u0010H\u001a\u00020'2\u0006\u0010I\u001a\u000209H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010:J\u0019\u0010J\u001a\u00020'2\u0006\u0010K\u001a\u00020LH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010MJ\u0010\u0010N\u001a\u00020'2\u0006\u0010O\u001a\u00020PH\u0016R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0013X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0013X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010 \u001a\u00020!X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Q"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidEmbeddableWebViewAdPlayer;", "Lcom/unity3d/ads/adplayer/AdPlayer;", "Lcom/unity3d/ads/adplayer/EmbeddableAdPlayer;", "webViewAdPlayer", "Lcom/unity3d/ads/adplayer/WebViewAdPlayer;", "opportunityId", "", "webViewContainer", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "openMeasurementRepository", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "scarManager", "Lcom/unity3d/ads/core/data/manager/ScarManager;", "lifecycleDataSource", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "context", "Landroid/content/Context;", "(Lcom/unity3d/ads/adplayer/WebViewAdPlayer;Ljava/lang/String;Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;Lcom/unity3d/ads/core/data/manager/ScarManager;Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;Landroid/content/Context;)V", "onLoadEvent", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", "getOnLoadEvent", "()Lkotlinx/coroutines/flow/Flow;", "onOfferwallEvent", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent;", "getOnOfferwallEvent", "onScarEvent", "Lcom/unity3d/ads/core/data/model/ScarEvent;", "getOnScarEvent", "onShowEvent", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "getOnShowEvent", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "getWebViewContainer", "()Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "destroy", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchShowCompleted", "onAllowedPiiChange", "value", "", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onBroadcastEvent", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestShow", "unityAdsShowOptions", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendActivityDestroyed", "sendFocusChange", "isFocused", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendGmaEvent", "Lcom/unity3d/scar/adapter/common/GMAEvent;", "(Lcom/unity3d/scar/adapter/common/GMAEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMuteChange", "isMuted", "sendOfferwallEvent", "Lcom/unity3d/services/ads/offerwall/OfferwallEvent;", "(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendPrivacyFsmChange", "sendScarBannerEvent", "Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;", "(Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendUserConsentChange", "sendVisibilityChange", com.ironsource.C3023e8.k, "sendVolumeChange", "volume", "", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.ironsource.C3232q2.v, "showOptions", "Lcom/unity3d/ads/adplayer/ShowOptions;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidEmbeddableWebViewAdPlayer implements com.unity3d.ads.adplayer.AdPlayer, com.unity3d.ads.adplayer.EmbeddableAdPlayer {
    private final android.content.Context context;
    private final com.unity3d.ads.core.data.datasource.LifecycleDataSource lifecycleDataSource;
    private final com.unity3d.ads.core.data.repository.OpenMeasurementRepository openMeasurementRepository;
    private final java.lang.String opportunityId;
    private final com.unity3d.ads.core.data.manager.ScarManager scarManager;
    private final com.unity3d.ads.adplayer.WebViewAdPlayer webViewAdPlayer;
    private final com.unity3d.ads.adplayer.AndroidWebViewContainer webViewContainer;

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        this.webViewAdPlayer.dispatchShowCompleted();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.model.LoadEvent> getOnLoadEvent() {
        return this.webViewAdPlayer.getOnLoadEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.model.OfferwallShowEvent> getOnOfferwallEvent() {
        return this.webViewAdPlayer.getOnOfferwallEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.model.ScarEvent> getOnScarEvent() {
        return this.webViewAdPlayer.getOnScarEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.model.ShowEvent> getOnShowEvent() {
        return this.webViewAdPlayer.getOnShowEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public kotlinx.coroutines.CoroutineScope getScope() {
        return this.webViewAdPlayer.getScope();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object onAllowedPiiChange(byte[] bArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.onAllowedPiiChange(bArr, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object onBroadcastEvent(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.onBroadcastEvent(str, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object requestShow(java.util.Map<java.lang.String, ? extends java.lang.Object> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.requestShow(map, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendActivityDestroyed(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.sendActivityDestroyed(continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendFocusChange(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.sendFocusChange(z, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendGmaEvent(com.unity3d.scar.adapter.common.GMAEvent gMAEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.sendGmaEvent(gMAEvent, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendMuteChange(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.sendMuteChange(z, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendOfferwallEvent(com.unity3d.services.ads.offerwall.OfferwallEvent offerwallEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.sendOfferwallEvent(offerwallEvent, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendPrivacyFsmChange(byte[] bArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.sendPrivacyFsmChange(bArr, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendScarBannerEvent(com.unity3d.services.banners.bridge.BannerBridge.BannerEvent bannerEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.sendScarBannerEvent(bannerEvent, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendUserConsentChange(byte[] bArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.sendUserConsentChange(bArr, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendVisibilityChange(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.sendVisibilityChange(z, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendVolumeChange(double d, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.sendVolumeChange(d, continuation);
    }

    public AndroidEmbeddableWebViewAdPlayer(com.unity3d.ads.adplayer.WebViewAdPlayer webViewAdPlayer, java.lang.String opportunityId, com.unity3d.ads.adplayer.AndroidWebViewContainer webViewContainer, com.unity3d.ads.core.data.repository.OpenMeasurementRepository openMeasurementRepository, com.unity3d.ads.core.data.manager.ScarManager scarManager, com.unity3d.ads.core.data.datasource.LifecycleDataSource lifecycleDataSource, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewAdPlayer, "webViewAdPlayer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewContainer, "webViewContainer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openMeasurementRepository, "openMeasurementRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scarManager, "scarManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleDataSource, "lifecycleDataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.webViewAdPlayer = webViewAdPlayer;
        this.opportunityId = opportunityId;
        this.webViewContainer = webViewContainer;
        this.openMeasurementRepository = openMeasurementRepository;
        this.scarManager = scarManager;
        this.lifecycleDataSource = lifecycleDataSource;
        this.context = context;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public com.unity3d.ads.adplayer.AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(final com.unity3d.ads.adplayer.ShowOptions showOptions) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showOptions, "showOptions");
        if (!(showOptions instanceof com.unity3d.ads.adplayer.AndroidShowOptions)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        com.unity3d.services.banners.BannerViewCache bannerViewCache = com.unity3d.services.banners.BannerViewCache.getInstance();
        final com.unity3d.services.banners.BannerView bannerView = bannerViewCache.getBannerView(this.opportunityId);
        if (bannerView == null) {
            if (bannerViewCache.isBannerViewDeleted(this.opportunityId)) {
                str = "BannerView has been deleted";
            } else {
                str = "BannerView not found";
            }
            throw new java.lang.IllegalStateException(str.toString());
        }
        com.unity3d.ads.adplayer.AndroidShowOptions androidShowOptions = (com.unity3d.ads.adplayer.AndroidShowOptions) showOptions;
        if (!androidShowOptions.isScarAd()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.MainScope(), null, null, new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$2(this, bannerView, null), 3, null);
            final android.webkit.WebView webView = getWebViewContainer().getWebView();
            if (androidx.core.view.ViewCompat.isAttachedToWindow(webView)) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.webViewAdPlayer.getScope(), null, null, new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3$1(this, showOptions, null), 3, null);
                if (!androidx.core.view.ViewCompat.isAttachedToWindow(webView)) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.webViewAdPlayer.getScope(), null, null, new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3$2$1(this, null), 3, null);
                } else {
                    webView.addOnAttachStateChangeListener(new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$lambda$4$$inlined$doOnDetach$1(webView, this));
                }
            } else {
                webView.addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() { // from class: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$$inlined$doOnAttach$2
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(android.view.View view) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(android.view.View view) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
                        webView.removeOnAttachStateChangeListener(this);
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.webViewAdPlayer.getScope(), null, null, new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3$1(this, showOptions, null), 3, null);
                        if (!androidx.core.view.ViewCompat.isAttachedToWindow(view)) {
                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.webViewAdPlayer.getScope(), null, null, new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3$2$1(this, null), 3, null);
                        } else {
                            view.addOnAttachStateChangeListener(new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$lambda$4$$inlined$doOnDetach$1(view, this));
                        }
                    }
                });
            }
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.MainScope(), null, null, new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$4(bannerView, this, null), 3, null);
            return;
        }
        java.lang.String placementId = androidShowOptions.getPlacementId();
        java.lang.String str2 = placementId == null ? "" : placementId;
        java.lang.String scarQueryId = androidShowOptions.getScarQueryId();
        java.lang.String str3 = scarQueryId == null ? "" : scarQueryId;
        java.lang.String scarAdUnitId = androidShowOptions.getScarAdUnitId();
        java.lang.String str4 = scarAdUnitId == null ? "" : scarAdUnitId;
        java.lang.String scarAdString = androidShowOptions.getScarAdString();
        com.unity3d.scar.adapter.common.scarads.ScarAdMetadata scarAdMetadata = new com.unity3d.scar.adapter.common.scarads.ScarAdMetadata(str2, str3, str4, scarAdString == null ? "" : scarAdString, 0);
        com.unity3d.ads.core.data.manager.ScarManager scarManager = this.scarManager;
        android.content.Context context = this.context;
        com.unity3d.services.banners.UnityBannerSize size = bannerView.getSize();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(size, "bannerView.size");
        final kotlinx.coroutines.flow.SharedFlow shareIn = kotlinx.coroutines.flow.FlowKt.shareIn(scarManager.loadBannerAd(context, bannerView, scarAdMetadata, size, this.opportunityId), getScope(), kotlinx.coroutines.flow.SharingStarted.INSTANCE.getEagerly(), 10);
        final com.unity3d.services.banners.BannerView bannerView2 = bannerView;
        if (androidx.core.view.ViewCompat.isAttachedToWindow(bannerView2)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1(this, shareIn, showOptions, null), 3, null);
            if (!androidx.core.view.ViewCompat.isAttachedToWindow(bannerView2)) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.webViewAdPlayer.getScope(), null, null, new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$2$1(this, null), 3, null);
                return;
            } else {
                bannerView2.addOnAttachStateChangeListener(new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1(bannerView2, this));
                return;
            }
        }
        bannerView2.addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() { // from class: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$$inlined$doOnAttach$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(android.view.View view) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(android.view.View view) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
                bannerView2.removeOnAttachStateChangeListener(this);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getScope(), null, null, new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1(this, shareIn, showOptions, null), 3, null);
                com.unity3d.services.banners.BannerView bannerView3 = bannerView;
                if (!androidx.core.view.ViewCompat.isAttachedToWindow(bannerView3)) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.webViewAdPlayer.getScope(), null, null, new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$2$1(this, null), 3, null);
                } else {
                    bannerView3.addOnAttachStateChangeListener(new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1(bannerView3, this));
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object destroy(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1 androidEmbeddableWebViewAdPlayer$destroy$1;
        java.lang.Object coroutine_suspended;
        int i;
        com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer;
        com.unity3d.ads.adplayer.AndroidWebViewContainer webViewContainer;
        if (continuation instanceof com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1) {
            androidEmbeddableWebViewAdPlayer$destroy$1 = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1) continuation;
            if ((androidEmbeddableWebViewAdPlayer$destroy$1.label & Integer.MIN_VALUE) != 0) {
                androidEmbeddableWebViewAdPlayer$destroy$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidEmbeddableWebViewAdPlayer$destroy$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidEmbeddableWebViewAdPlayer$destroy$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.webViewAdPlayer.dispatchShowCompleted();
                    if (this.openMeasurementRepository.hasSessionFinished(com.google.protobuf.kotlin.ByteStringsKt.toByteStringUtf8(this.opportunityId))) {
                        androidEmbeddableWebViewAdPlayer$destroy$1.L$0 = this;
                        androidEmbeddableWebViewAdPlayer$destroy$1.label = 1;
                        if (kotlinx.coroutines.DelayKt.delay(1000L, androidEmbeddableWebViewAdPlayer$destroy$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    androidEmbeddableWebViewAdPlayer = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        androidEmbeddableWebViewAdPlayer = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer) androidEmbeddableWebViewAdPlayer$destroy$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidEmbeddableWebViewAdPlayer$destroy$1.L$0 = null;
                        androidEmbeddableWebViewAdPlayer$destroy$1.label = 3;
                        if (com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(androidEmbeddableWebViewAdPlayer, androidEmbeddableWebViewAdPlayer$destroy$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    androidEmbeddableWebViewAdPlayer = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer) androidEmbeddableWebViewAdPlayer$destroy$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                webViewContainer = androidEmbeddableWebViewAdPlayer.getWebViewContainer();
                androidEmbeddableWebViewAdPlayer$destroy$1.L$0 = androidEmbeddableWebViewAdPlayer;
                androidEmbeddableWebViewAdPlayer$destroy$1.label = 2;
                if (webViewContainer.destroy(androidEmbeddableWebViewAdPlayer$destroy$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                androidEmbeddableWebViewAdPlayer$destroy$1.L$0 = null;
                androidEmbeddableWebViewAdPlayer$destroy$1.label = 3;
                if (com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(androidEmbeddableWebViewAdPlayer, androidEmbeddableWebViewAdPlayer$destroy$1) == coroutine_suspended) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        androidEmbeddableWebViewAdPlayer$destroy$1 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1(this, continuation);
        java.lang.Object obj2 = androidEmbeddableWebViewAdPlayer$destroy$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidEmbeddableWebViewAdPlayer$destroy$1.label;
        if (i != 0) {
        }
        webViewContainer = androidEmbeddableWebViewAdPlayer.getWebViewContainer();
        androidEmbeddableWebViewAdPlayer$destroy$1.L$0 = androidEmbeddableWebViewAdPlayer;
        androidEmbeddableWebViewAdPlayer$destroy$1.label = 2;
        if (webViewContainer.destroy(androidEmbeddableWebViewAdPlayer$destroy$1) == coroutine_suspended) {
        }
        androidEmbeddableWebViewAdPlayer$destroy$1.L$0 = null;
        androidEmbeddableWebViewAdPlayer$destroy$1.label = 3;
        if (com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(androidEmbeddableWebViewAdPlayer, androidEmbeddableWebViewAdPlayer$destroy$1) == coroutine_suspended) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
