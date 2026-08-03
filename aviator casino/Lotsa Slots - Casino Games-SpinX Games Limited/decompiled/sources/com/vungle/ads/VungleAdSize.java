package com.vungle.ads;

/* compiled from: AdSize.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\r\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/vungle/ads/VungleAdSize;", "", "width", "", "height", "(II)V", "getHeight", "()I", "isAdaptiveHeight", "", "isAdaptiveHeight$vungle_ads_release", "()Z", "setAdaptiveHeight$vungle_ads_release", "(Z)V", "isAdaptiveWidth", "isAdaptiveWidth$vungle_ads_release", "setAdaptiveWidth$vungle_ads_release", "getWidth", "isValidSize", "isValidSize$vungle_ads_release", "toString", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class VungleAdSize {
    private final int height;
    private boolean isAdaptiveHeight;
    private boolean isAdaptiveWidth;
    private final int width;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.vungle.ads.VungleAdSize.Companion INSTANCE = new com.vungle.ads.VungleAdSize.Companion(null);
    public static final com.vungle.ads.VungleAdSize BANNER = new com.vungle.ads.VungleAdSize(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);
    public static final com.vungle.ads.VungleAdSize BANNER_SHORT = new com.vungle.ads.VungleAdSize(androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis, 50);
    public static final com.vungle.ads.VungleAdSize BANNER_LEADERBOARD = new com.vungle.ads.VungleAdSize(728, 90);
    public static final com.vungle.ads.VungleAdSize MREC = new com.vungle.ads.VungleAdSize(androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis, androidx.recyclerview.widget.ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);

    @kotlin.jvm.JvmStatic
    public static final com.vungle.ads.VungleAdSize getAdSizeWithWidth(android.content.Context context, int i) {
        return INSTANCE.getAdSizeWithWidth(context, i);
    }

    @kotlin.jvm.JvmStatic
    public static final com.vungle.ads.VungleAdSize getAdSizeWithWidthAndHeight(int i, int i2) {
        return INSTANCE.getAdSizeWithWidthAndHeight(i, i2);
    }

    @kotlin.jvm.JvmStatic
    public static final com.vungle.ads.VungleAdSize getValidAdSizeFromSize(int i, int i2, java.lang.String str) {
        return INSTANCE.getValidAdSizeFromSize(i, i2, str);
    }

    public VungleAdSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    /* renamed from: isAdaptiveHeight$vungle_ads_release, reason: from getter */
    public final boolean getIsAdaptiveHeight() {
        return this.isAdaptiveHeight;
    }

    public final void setAdaptiveHeight$vungle_ads_release(boolean z) {
        this.isAdaptiveHeight = z;
    }

    /* renamed from: isAdaptiveWidth$vungle_ads_release, reason: from getter */
    public final boolean getIsAdaptiveWidth() {
        return this.isAdaptiveWidth;
    }

    public final void setAdaptiveWidth$vungle_ads_release(boolean z) {
        this.isAdaptiveWidth = z;
    }

    /* compiled from: AdSize.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0007J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/vungle/ads/VungleAdSize$Companion;", "", "()V", com.ironsource.mediationsdk.j.f6439a, "Lcom/vungle/ads/VungleAdSize;", "BANNER_LEADERBOARD", "BANNER_SHORT", "MREC", "getAdSizeWithWidth", "context", "Landroid/content/Context;", "width", "", "getAdSizeWithWidthAndHeight", "height", "getValidAdSizeFromSize", "placementId", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.vungle.ads.VungleAdSize getAdSizeWithWidth(android.content.Context context, int width) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            int intValue = com.vungle.ads.internal.util.ViewUtility.INSTANCE.getDeviceWidthAndHeightWithOrientation(context, 0).component2().intValue();
            if (width < 0) {
                width = 0;
            }
            com.vungle.ads.VungleAdSize vungleAdSize = new com.vungle.ads.VungleAdSize(width, intValue);
            if (vungleAdSize.getWidth() == 0) {
                vungleAdSize.setAdaptiveWidth$vungle_ads_release(true);
            }
            vungleAdSize.setAdaptiveHeight$vungle_ads_release(true);
            return vungleAdSize;
        }

        @kotlin.jvm.JvmStatic
        public final com.vungle.ads.VungleAdSize getAdSizeWithWidthAndHeight(int width, int height) {
            if (width < 0) {
                width = 0;
            }
            if (height < 0) {
                height = 0;
            }
            com.vungle.ads.VungleAdSize vungleAdSize = new com.vungle.ads.VungleAdSize(width, height);
            if (vungleAdSize.getWidth() == 0) {
                vungleAdSize.setAdaptiveWidth$vungle_ads_release(true);
            }
            if (vungleAdSize.getHeight() == 0) {
                vungleAdSize.setAdaptiveHeight$vungle_ads_release(true);
            }
            return vungleAdSize;
        }

        @kotlin.jvm.JvmStatic
        public final com.vungle.ads.VungleAdSize getValidAdSizeFromSize(int width, int height, java.lang.String placementId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "placementId");
            com.vungle.ads.internal.model.Placement placement = com.vungle.ads.internal.ConfigManager.INSTANCE.getPlacement(placementId);
            if (placement != null) {
                if (!placement.isInline()) {
                    placement = null;
                }
                if (placement != null) {
                    return com.vungle.ads.VungleAdSize.INSTANCE.getAdSizeWithWidthAndHeight(width, height);
                }
            }
            if (width >= com.vungle.ads.VungleAdSize.MREC.getWidth() && height >= com.vungle.ads.VungleAdSize.MREC.getHeight()) {
                return com.vungle.ads.VungleAdSize.MREC;
            }
            if (width >= com.vungle.ads.VungleAdSize.BANNER_LEADERBOARD.getWidth() && height >= com.vungle.ads.VungleAdSize.BANNER_LEADERBOARD.getHeight()) {
                return com.vungle.ads.VungleAdSize.BANNER_LEADERBOARD;
            }
            if (width >= com.vungle.ads.VungleAdSize.BANNER.getWidth() && height >= com.vungle.ads.VungleAdSize.BANNER.getHeight()) {
                return com.vungle.ads.VungleAdSize.BANNER;
            }
            if (width >= com.vungle.ads.VungleAdSize.BANNER_SHORT.getWidth() && height >= com.vungle.ads.VungleAdSize.BANNER_SHORT.getHeight()) {
                return com.vungle.ads.VungleAdSize.BANNER_SHORT;
            }
            return getAdSizeWithWidthAndHeight(width, height);
        }
    }

    public final boolean isValidSize$vungle_ads_release() {
        return this.width >= 0 && this.height >= 0;
    }

    public java.lang.String toString() {
        return "VungleAdSize(width=" + this.width + ", height=" + this.height + ')';
    }
}
