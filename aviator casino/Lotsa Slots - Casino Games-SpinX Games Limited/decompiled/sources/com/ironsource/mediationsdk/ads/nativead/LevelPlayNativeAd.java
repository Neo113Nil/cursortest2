package com.ironsource.mediationsdk.ads.nativead;

/* loaded from: classes5.dex */
public final class LevelPlayNativeAd implements com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface, com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.String f6399a;
    private com.ironsource.C3064gd b;
    private com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener c;
    private com.ironsource.Yb d;
    private com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData e;
    private com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder f;
    private final java.util.concurrent.atomic.AtomicBoolean g;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private java.lang.String f6400a;
        private com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener b;

        public final com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd build() {
            return new com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd(this, null);
        }

        public final com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener getMListener$mediationsdk_release() {
            return this.b;
        }

        public final java.lang.String getMPlacementName$mediationsdk_release() {
            return this.f6400a;
        }

        public final void setMListener$mediationsdk_release(com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener levelPlayNativeAdListener) {
            this.b = levelPlayNativeAdListener;
        }

        public final void setMPlacementName$mediationsdk_release(java.lang.String str) {
            this.f6400a = str;
        }

        public final com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd.Builder withActivity(android.app.Activity activity) {
            com.ironsource.environment.ContextProvider.getInstance().updateActivity(activity);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("activity is updated to: " + (activity != null ? activity.hashCode() : 0));
            return this;
        }

        public final com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd.Builder withListener(com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
            this.b = listener;
            return this;
        }

        public final com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd.Builder withPlacementName(java.lang.String str) {
            this.f6400a = str;
            return this;
        }
    }

    public /* synthetic */ LevelPlayNativeAd(com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd this$0) {
        kotlin.Unit unit;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.b();
        com.ironsource.Yb yb = this$0.d;
        if (yb != null) {
            yb.a(this$0.b);
            unit = kotlin.Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this$0.a();
        }
    }

    private final void b() {
        if (this.g.compareAndSet(false, true)) {
            com.ironsource.Yb c = com.ironsource.mediationsdk.p.h().c();
            this.d = c;
            if (c != null) {
                c.a(this);
                com.ironsource.C2955ac i = com.ironsource.mediationsdk.p.h().i(this.f6399a);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(i, "getInstance().getNativeAdPlacement(mPlacementName)");
                this.b = new com.ironsource.C3064gd(i);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface
    public void destroyAd() {
        com.ironsource.mediationsdk.logger.IronLog.API.info(java.lang.String.valueOf(this));
        try {
            com.ironsource.Yb yb = this.d;
            if (yb != null) {
                yb.J();
            }
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            com.ironsource.mediationsdk.logger.IronLog.API.error("destroyNativeAd()");
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public java.lang.String getAdvertiser() {
        com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData = this.e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public java.lang.String getBody() {
        com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData = this.e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public java.lang.String getCallToAction() {
        com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData = this.e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface.Image getIcon() {
        com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData = this.e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getIcon();
        }
        return null;
    }

    public final com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder getNativeAdViewBinder() {
        return this.f;
    }

    public final java.util.UUID getObjectId() {
        com.ironsource.Yb yb = this.d;
        if (yb != null) {
            return yb.h();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public java.lang.String getTitle() {
        com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData = this.e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface
    public void loadAd() {
        com.ironsource.mediationsdk.logger.IronLog.API.info(java.lang.String.valueOf(this));
        java.lang.String initError = com.ironsource.mediationsdk.p.h().b();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(initError, "initError");
        if (initError.length() <= 0) {
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.getInitHandler().post(new java.lang.Runnable() { // from class: com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd.a(com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd.this);
                }
            });
            return;
        }
        com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener levelPlayNativeAdListener = this.c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this, com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError("loadAd(): " + initError, com.ironsource.mediationsdk.utils.IronSourceConstants.NATIVE_AD_UNIT));
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdClicked(final com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info(java.lang.String.valueOf(this));
        com.ironsource.environment.thread.IronSourceThreadManager.postOnUiThreadTask$default(com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE, new java.lang.Runnable() { // from class: com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd.a(com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd.this, adInfo);
            }
        }, 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdImpression(final com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info(java.lang.String.valueOf(this));
        com.ironsource.environment.thread.IronSourceThreadManager.postOnUiThreadTask$default(com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE, new java.lang.Runnable() { // from class: com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd.b(com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd.this, adInfo);
            }
        }, 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdLoadFailed(final com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info(java.lang.String.valueOf(this));
        com.ironsource.environment.thread.IronSourceThreadManager.postOnUiThreadTask$default(com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE, new java.lang.Runnable() { // from class: com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd.a(com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd.this, ironSourceError);
            }
        }, 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdLoaded(final com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo, final com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData, final com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder nativeAdViewBinder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info(java.lang.String.valueOf(this));
        com.ironsource.environment.thread.IronSourceThreadManager.postOnUiThreadTask$default(com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE, new java.lang.Runnable() { // from class: com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd.a(com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd.this, adapterNativeAdData, nativeAdViewBinder, adInfo);
            }
        }, 0L, 2, null);
    }

    public final void setListener(com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener levelPlayNativeAdListener) {
        this.c = levelPlayNativeAdListener;
    }

    private LevelPlayNativeAd(com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd.Builder builder) {
        this.g = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f6399a = builder.getMPlacementName$mediationsdk_release();
        this.c = builder.getMListener$mediationsdk_release();
    }

    private final void a() {
        com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener levelPlayNativeAdListener = this.c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this, com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError("init() has failed", com.ironsource.mediationsdk.utils.IronSourceConstants.NATIVE_AD_UNIT));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd this$0, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdImpression(this$0, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd this$0, com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData, com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder nativeAdViewBinder, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterNativeAdData, "$adapterNativeAdData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdViewBinder, "$nativeAdViewBinder");
        this$0.e = adapterNativeAdData;
        this$0.f = nativeAdViewBinder;
        com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoaded(this$0, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd this$0, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this$0, ironSourceError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd this$0, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdClicked(this$0, adInfo);
        }
    }
}
