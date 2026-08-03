package com.unity3d.ironsourceads.banner;

/* loaded from: classes5.dex */
public final class BannerAdView extends android.widget.FrameLayout implements com.ironsource.Q2 {

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.P2 f8015a;
    private com.unity3d.ironsourceads.banner.BannerAdViewListener b;

    private BannerAdView(android.content.Context context) {
        super(context);
    }

    public final com.unity3d.ironsourceads.banner.BannerAdInfo getAdInfo() {
        com.ironsource.P2 p2 = this.f8015a;
        if (p2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bannerAdViewInternal");
            p2 = null;
        }
        return p2.c();
    }

    public final com.unity3d.ironsourceads.banner.BannerAdViewListener getListener() {
        return this.b;
    }

    @Override // com.ironsource.Q2
    public void onBannerAdClicked() {
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("BannerAdViewListener onBannerAdClicked adInfo: " + getAdInfo());
        com.unity3d.ironsourceads.banner.BannerAdViewListener bannerAdViewListener = this.b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdClicked(this);
        }
    }

    @Override // com.ironsource.Q2
    public void onBannerAdShown() {
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("BannerAdViewListener onBannerAdShown adInfo: " + getAdInfo());
        com.unity3d.ironsourceads.banner.BannerAdViewListener bannerAdViewListener = this.b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdShown(this);
        }
    }

    public final void setListener(com.unity3d.ironsourceads.banner.BannerAdViewListener bannerAdViewListener) {
        this.b = bannerAdViewListener;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BannerAdView(com.ironsource.P2 bannerAdViewInternal) {
        this(r0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerAdViewInternal, "bannerAdViewInternal");
        android.content.Context context = bannerAdViewInternal.d().getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "bannerAdViewInternal.container.context");
        this.f8015a = bannerAdViewInternal;
        bannerAdViewInternal.a(new java.lang.ref.WeakReference<>(this));
        bannerAdViewInternal.b(new java.lang.ref.WeakReference<>(this));
    }
}
