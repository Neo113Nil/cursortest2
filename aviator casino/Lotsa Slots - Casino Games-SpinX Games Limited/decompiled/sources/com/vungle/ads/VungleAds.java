package com.vungle.ads;

/* compiled from: VungleAds.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/vungle/ads/VungleAds;", "", "()V", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class VungleAds {
    public static final java.lang.String TAG = "VungleAds";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.vungle.ads.VungleAds.Companion INSTANCE = new com.vungle.ads.VungleAds.Companion(null);
    private static com.vungle.ads.internal.VungleInternal vungleInternal = new com.vungle.ads.internal.VungleInternal();
    private static com.vungle.ads.internal.VungleInitializer initializer = new com.vungle.ads.internal.VungleInitializer();
    public static final com.vungle.ads.fpd.FirstPartyData firstPartyData = new com.vungle.ads.fpd.FirstPartyData();

    @kotlin.jvm.JvmStatic
    public static final void deInit(android.content.Context context) {
        INSTANCE.deInit(context);
    }

    @kotlin.jvm.JvmStatic
    public static final void getBiddingToken(android.content.Context context, com.vungle.ads.BidTokenCallback bidTokenCallback) {
        INSTANCE.getBiddingToken(context, bidTokenCallback);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getSdkVersion() {
        return INSTANCE.getSdkVersion();
    }

    @kotlin.jvm.JvmStatic
    public static final void init(android.content.Context context, java.lang.String str, com.vungle.ads.InitializationListener initializationListener) {
        INSTANCE.init(context, str, initializationListener);
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isInitialized() {
        return INSTANCE.isInitialized();
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isInline(java.lang.String str) {
        return INSTANCE.isInline(str);
    }

    @kotlin.jvm.JvmStatic
    public static final void setIntegrationName(java.lang.String str, java.lang.String str2) {
        INSTANCE.setIntegrationName(str, str2);
    }

    /* compiled from: VungleAds.kt */
    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010\u0012\u001a\u00020\u0004H\u0007J \u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0015H\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0004H\u0007J\u0018\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/vungle/ads/VungleAds$Companion;", "", "()V", "TAG", "", "firstPartyData", "Lcom/vungle/ads/fpd/FirstPartyData;", "initializer", "Lcom/vungle/ads/internal/VungleInitializer;", "vungleInternal", "Lcom/vungle/ads/internal/VungleInternal;", "deInit", "", "context", "Landroid/content/Context;", "getBiddingToken", "callback", "Lcom/vungle/ads/BidTokenCallback;", "getSdkVersion", com.ironsource.X3.a.f, com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID, "Lcom/vungle/ads/InitializationListener;", "isInitialized", "", "isInline", "placementId", "setIntegrationName", "integrationName", "version", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final void init(android.content.Context context, java.lang.String appId, com.vungle.ads.InitializationListener callback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "appId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
            if (!(context instanceof android.app.Application)) {
                context = context.getApplicationContext();
            }
            com.vungle.ads.internal.VungleInitializer vungleInitializer = com.vungle.ads.VungleAds.initializer;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "appContext");
            vungleInitializer.init(appId, context, callback);
        }

        @kotlin.jvm.JvmStatic
        public final boolean isInitialized() {
            return com.vungle.ads.VungleAds.initializer.isInitialized();
        }

        @kotlin.jvm.JvmStatic
        public final void getBiddingToken(android.content.Context context, com.vungle.ads.BidTokenCallback callback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
            com.vungle.ads.VungleAds.vungleInternal.getAvailableBidTokensAsync(context, callback);
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String getSdkVersion() {
            return com.vungle.ads.VungleAds.vungleInternal.getSdkVersion();
        }

        @kotlin.jvm.JvmStatic
        public final boolean isInline(java.lang.String placementId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "placementId");
            com.vungle.ads.internal.model.Placement placement = com.vungle.ads.internal.ConfigManager.INSTANCE.getPlacement(placementId);
            if (placement != null) {
                return placement.isInline();
            }
            return false;
        }

        @kotlin.jvm.JvmStatic
        public final void setIntegrationName(java.lang.String integrationName, java.lang.String version) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(integrationName, "integrationName");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "version");
            com.vungle.ads.VungleAds.initializer.setIntegrationName(integrationName, version);
        }

        @kotlin.jvm.JvmStatic
        public final void deInit(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            com.vungle.ads.VungleAds.initializer.deInit$vungle_ads_release();
        }
    }
}
