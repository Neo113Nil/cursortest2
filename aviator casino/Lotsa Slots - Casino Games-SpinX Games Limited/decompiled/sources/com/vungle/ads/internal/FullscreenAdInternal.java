package com.vungle.ads.internal;

/* compiled from: FullscreenAdInternal.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u0011J \u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/vungle/ads/internal/FullscreenAdInternal;", "Lcom/vungle/ads/internal/AdInternal;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "playContext", "Ljava/lang/ref/WeakReference;", "getAdSizeForAdRequest", "Lcom/vungle/ads/VungleAdSize;", "getPresenterDelegate", "Lcom/vungle/ads/internal/presenter/PresenterDelegate;", "isValidAdSize", "", com.ironsource.X3.i.O, "play", "", "adPlayCallback", "Lcom/vungle/ads/internal/presenter/AdPlayCallback;", "renderAd", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "placement", "Lcom/vungle/ads/internal/model/Placement;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "PendingData", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public abstract class FullscreenAdInternal extends com.vungle.ads.internal.AdInternal {
    private static final java.lang.String TAG = "FullscreenAdInternal";
    private java.lang.ref.WeakReference<android.content.Context> playContext;

    @Override // com.vungle.ads.internal.AdInternal
    public com.vungle.ads.VungleAdSize getAdSizeForAdRequest() {
        return null;
    }

    public com.vungle.ads.internal.presenter.PresenterDelegate getPresenterDelegate() {
        return null;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdSize(com.vungle.ads.VungleAdSize adSize) {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullscreenAdInternal(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.vungle.ads.internal.FullscreenAdInternal$play$callbackWrapper$1] */
    public final void play(android.content.Context context, final com.vungle.ads.internal.presenter.AdPlayCallback adPlayCallback) {
        com.vungle.ads.internal.util.LogEntry logEntry$vungle_ads_release;
        java.lang.Long adLoadType;
        java.lang.ref.WeakReference<android.content.Context> weakReference;
        java.lang.Long adLoadType2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adPlayCallback, "adPlayCallback");
        com.vungle.ads.internal.util.LogEntry logEntry$vungle_ads_release2 = getLogEntry$vungle_ads_release();
        if ((logEntry$vungle_ads_release2 != null && (adLoadType2 = logEntry$vungle_ads_release2.getAdLoadType()) != null && adLoadType2.longValue() == 3) || ((logEntry$vungle_ads_release = getLogEntry$vungle_ads_release()) != null && (adLoadType = logEntry$vungle_ads_release.getAdLoadType()) != null && adLoadType.longValue() == 4)) {
            sendWinURL();
        }
        getShowToValidationMetric$vungle_ads_release().markStart();
        if (context != null) {
            weakReference = new java.lang.ref.WeakReference<>(context);
        } else {
            weakReference = null;
        }
        this.playContext = weakReference;
        com.vungle.ads.VungleError canPlayAd = canPlayAd(true);
        if (canPlayAd != null) {
            adPlayCallback.onFailure(canPlayAd);
            if (isErrorTerminal$vungle_ads_release(canPlayAd.getCode())) {
                setAdState(com.vungle.ads.internal.AdInternal.AdState.ERROR);
                return;
            }
            return;
        }
        final com.vungle.ads.internal.model.AdPayload advertisement = getAdvertisement();
        final com.vungle.ads.internal.model.Placement placement = getPlacement();
        if (advertisement == null || placement == null) {
            adPlayCallback.onFailure(new com.vungle.ads.AdNotLoadedCantPlay("Ad or Placement is null: pl=" + placement + " adv=" + advertisement).setLogEntry$vungle_ads_release(getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
            return;
        }
        final ?? r1 = new com.vungle.ads.internal.presenter.AdPlayCallbackWrapper(adPlayCallback) { // from class: com.vungle.ads.internal.FullscreenAdInternal$play$callbackWrapper$1
            @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdStart(java.lang.String id) {
                this.setAdState(com.vungle.ads.internal.AdInternal.AdState.PLAYING);
                this.getValidationToPresentMetric$vungle_ads_release().markEnd();
                com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, this.getValidationToPresentMetric$vungle_ads_release(), this.getLogEntry$vungle_ads_release(), (java.lang.String) null, 4, (java.lang.Object) null);
                super.onAdStart(id);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdImpression(java.lang.String id) {
                this.setAdState(com.vungle.ads.internal.AdInternal.AdState.IMPRESSION_LOGGED);
                super.onAdImpression(id);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdEnd(java.lang.String id) {
                this.setAdState(com.vungle.ads.internal.AdInternal.AdState.FINISHED);
                super.onAdEnd(id);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
            public void onFailure(com.vungle.ads.VungleError error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
                this.setAdState(com.vungle.ads.internal.AdInternal.AdState.ERROR);
                super.onFailure(error);
            }
        };
        cancelDownload$vungle_ads_release();
        com.vungle.ads.internal.util.ThreadUtil.INSTANCE.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.internal.FullscreenAdInternal$play$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.vungle.ads.internal.FullscreenAdInternal.this.renderAd(r1, advertisement, placement);
            }
        });
    }

    /* compiled from: FullscreenAdInternal.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/vungle/ads/internal/FullscreenAdInternal$PendingData;", "", "adPayload", "Lcom/vungle/ads/internal/model/AdPayload;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "presenterDelegate", "Lcom/vungle/ads/internal/presenter/PresenterDelegate;", "(Lcom/vungle/ads/internal/model/AdPayload;Lcom/vungle/ads/internal/model/Placement;Lcom/vungle/ads/internal/presenter/PresenterDelegate;)V", "getAdPayload", "()Lcom/vungle/ads/internal/model/AdPayload;", "getPlacement", "()Lcom/vungle/ads/internal/model/Placement;", "getPresenterDelegate", "()Lcom/vungle/ads/internal/presenter/PresenterDelegate;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class PendingData {
        private final com.vungle.ads.internal.model.AdPayload adPayload;
        private final com.vungle.ads.internal.model.Placement placement;
        private final com.vungle.ads.internal.presenter.PresenterDelegate presenterDelegate;

        public static /* synthetic */ com.vungle.ads.internal.FullscreenAdInternal.PendingData copy$default(com.vungle.ads.internal.FullscreenAdInternal.PendingData pendingData, com.vungle.ads.internal.model.AdPayload adPayload, com.vungle.ads.internal.model.Placement placement, com.vungle.ads.internal.presenter.PresenterDelegate presenterDelegate, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                adPayload = pendingData.adPayload;
            }
            if ((i & 2) != 0) {
                placement = pendingData.placement;
            }
            if ((i & 4) != 0) {
                presenterDelegate = pendingData.presenterDelegate;
            }
            return pendingData.copy(adPayload, placement, presenterDelegate);
        }

        /* renamed from: component1, reason: from getter */
        public final com.vungle.ads.internal.model.AdPayload getAdPayload() {
            return this.adPayload;
        }

        /* renamed from: component2, reason: from getter */
        public final com.vungle.ads.internal.model.Placement getPlacement() {
            return this.placement;
        }

        /* renamed from: component3, reason: from getter */
        public final com.vungle.ads.internal.presenter.PresenterDelegate getPresenterDelegate() {
            return this.presenterDelegate;
        }

        public final com.vungle.ads.internal.FullscreenAdInternal.PendingData copy(com.vungle.ads.internal.model.AdPayload adPayload, com.vungle.ads.internal.model.Placement placement, com.vungle.ads.internal.presenter.PresenterDelegate presenterDelegate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adPayload, "adPayload");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
            return new com.vungle.ads.internal.FullscreenAdInternal.PendingData(adPayload, placement, presenterDelegate);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.vungle.ads.internal.FullscreenAdInternal.PendingData)) {
                return false;
            }
            com.vungle.ads.internal.FullscreenAdInternal.PendingData pendingData = (com.vungle.ads.internal.FullscreenAdInternal.PendingData) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.adPayload, pendingData.adPayload) && kotlin.jvm.internal.Intrinsics.areEqual(this.placement, pendingData.placement) && kotlin.jvm.internal.Intrinsics.areEqual(this.presenterDelegate, pendingData.presenterDelegate);
        }

        public int hashCode() {
            int hashCode = ((this.adPayload.hashCode() * 31) + this.placement.hashCode()) * 31;
            com.vungle.ads.internal.presenter.PresenterDelegate presenterDelegate = this.presenterDelegate;
            return hashCode + (presenterDelegate == null ? 0 : presenterDelegate.hashCode());
        }

        public java.lang.String toString() {
            return "PendingData(adPayload=" + this.adPayload + ", placement=" + this.placement + ", presenterDelegate=" + this.presenterDelegate + ')';
        }

        public PendingData(com.vungle.ads.internal.model.AdPayload adPayload, com.vungle.ads.internal.model.Placement placement, com.vungle.ads.internal.presenter.PresenterDelegate presenterDelegate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adPayload, "adPayload");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
            this.adPayload = adPayload;
            this.placement = placement;
            this.presenterDelegate = presenterDelegate;
        }

        public final com.vungle.ads.internal.model.AdPayload getAdPayload() {
            return this.adPayload;
        }

        public final com.vungle.ads.internal.model.Placement getPlacement() {
            return this.placement;
        }

        public final com.vungle.ads.internal.presenter.PresenterDelegate getPresenterDelegate() {
            return this.presenterDelegate;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderAd(com.vungle.ads.internal.presenter.AdPlayCallback listener, com.vungle.ads.internal.model.AdPayload advertisement, com.vungle.ads.internal.model.Placement placement) {
        android.content.Context context;
        java.lang.ref.WeakReference<android.content.Context> weakReference = this.playContext;
        if (weakReference == null || (context = weakReference.get()) == null) {
            context = getContext();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "playContext?.get() ?: context");
        com.vungle.ads.internal.presenter.AdEventListener adEventListener = new com.vungle.ads.internal.presenter.AdEventListener(listener, placement);
        com.vungle.ads.internal.ui.AdActivity.INSTANCE.setPendingData$vungle_ads_release(new com.vungle.ads.internal.FullscreenAdInternal.PendingData(advertisement, placement, getPresenterDelegate()));
        com.vungle.ads.internal.ui.AdActivity.INSTANCE.setEventListener$vungle_ads_release(adEventListener);
        android.content.Intent createIntent = com.vungle.ads.internal.ui.AdActivity.INSTANCE.createIntent(context, placement.getReferenceId(), advertisement.eventId());
        if (!com.vungle.ads.internal.util.ActivityManager.INSTANCE.isForeground()) {
            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "The ad activity is in background on play, log AD_VISIBILITY_INVISIBLE.");
            createIntent.putExtra(com.vungle.ads.internal.ui.AdActivity.AD_INVISIBLE_LOGGED_KEY, true);
            com.vungle.ads.AnalyticsClient analyticsClient = com.vungle.ads.AnalyticsClient.INSTANCE;
            com.vungle.ads.SingleValueMetric singleValueMetric = new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
            singleValueMetric.setValue(1L);
            com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, getLogEntry$vungle_ads_release(), (java.lang.String) null, 4, (java.lang.Object) null);
        }
        getShowToValidationMetric$vungle_ads_release().markEnd();
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, getShowToValidationMetric$vungle_ads_release(), getLogEntry$vungle_ads_release(), (java.lang.String) null, 4, (java.lang.Object) null);
        getValidationToPresentMetric$vungle_ads_release().markStart();
        com.vungle.ads.internal.util.ActivityManager.INSTANCE.startWhenForeground(context, null, createIntent, null);
    }
}
