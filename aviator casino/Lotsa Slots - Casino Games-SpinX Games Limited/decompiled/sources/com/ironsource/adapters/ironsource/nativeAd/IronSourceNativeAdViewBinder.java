package com.ironsource.adapters.ironsource.nativeAd;

/* loaded from: classes5.dex */
public final class IronSourceNativeAdViewBinder extends com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder {
    private final com.ironsource.E8 nativeAd;
    private final com.ironsource.mediationsdk.adunit.adapter.utility.NativeAdProperties nativeAdProperties;
    private com.ironsource.B8 networkNativeAdView;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.ironsource.mediationsdk.adunit.adapter.utility.AdOptionsPosition.values().length];
            try {
                iArr[com.ironsource.mediationsdk.adunit.adapter.utility.AdOptionsPosition.TOP_LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.ironsource.mediationsdk.adunit.adapter.utility.AdOptionsPosition.TOP_RIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.ironsource.mediationsdk.adunit.adapter.utility.AdOptionsPosition.BOTTOM_LEFT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.ironsource.mediationsdk.adunit.adapter.utility.AdOptionsPosition.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public IronSourceNativeAdViewBinder(com.ironsource.E8 nativeAd, com.ironsource.mediationsdk.adunit.adapter.utility.NativeAdProperties nativeAdProperties) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdProperties, "nativeAdProperties");
        this.nativeAd = nativeAd;
        this.nativeAdProperties = nativeAdProperties;
    }

    private final android.widget.FrameLayout.LayoutParams getPrivacyIconLayoutParams() {
        int i;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        int i2 = com.ironsource.adapters.ironsource.nativeAd.IronSourceNativeAdViewBinder.WhenMappings.$EnumSwitchMapping$0[this.nativeAdProperties.getAdOptionsPosition().ordinal()];
        if (i2 == 1) {
            i = 51;
        } else if (i2 == 2) {
            i = 53;
        } else if (i2 == 3) {
            i = 83;
        } else {
            if (i2 != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            i = 85;
        }
        layoutParams.gravity = i;
        return layoutParams;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinderInterface
    public void setNativeAdView(android.view.View view) {
        if (view == null) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("nativeAdView is null");
            return;
        }
        if (this.nativeAd.c() == null) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("nativeAd.adData is null");
            return;
        }
        com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView mediaView = getNativeAdViewHolder().getMediaView();
        if (mediaView != null) {
            com.ironsource.C8 c = this.nativeAd.c();
            kotlin.jvm.internal.Intrinsics.checkNotNull(c);
            android.webkit.WebView l = c.l();
            if (l != null) {
                mediaView.addView(l, new android.view.ViewGroup.LayoutParams(-1, -1));
            }
        }
        com.ironsource.C8 c2 = this.nativeAd.c();
        kotlin.jvm.internal.Intrinsics.checkNotNull(c2);
        android.view.View m = c2.m();
        m.setId(com.ironsource.sdk.mediation.R.id.privacy_icon_button);
        m.setLayoutParams(getPrivacyIconLayoutParams());
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "context");
        com.ironsource.B8 b8 = new com.ironsource.B8(context);
        b8.addView(view);
        b8.addView(m);
        this.networkNativeAdView = b8;
        com.ironsource.B8 networkNativeAdView = getNetworkNativeAdView();
        kotlin.jvm.internal.Intrinsics.checkNotNull(networkNativeAdView);
        this.nativeAd.a(new com.ironsource.F8(networkNativeAdView, getNativeAdViewHolder().getTitleView(), getNativeAdViewHolder().getAdvertiserView(), getNativeAdViewHolder().getIconView(), getNativeAdViewHolder().getBodyView(), getNativeAdViewHolder().getMediaView(), getNativeAdViewHolder().getCallToActionView(), m));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinderInterface
    public com.ironsource.B8 getNetworkNativeAdView() {
        return this.networkNativeAdView;
    }
}
