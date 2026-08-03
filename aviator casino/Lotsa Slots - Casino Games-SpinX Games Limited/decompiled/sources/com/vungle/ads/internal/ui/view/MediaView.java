package com.vungle.ads.internal.ui.view;

/* compiled from: MediaView.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\r\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fJ\u0006\u0010\u0010\u001a\u00020\u0007J\u0006\u0010\u0011\u001a\u00020\u0007J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0002\b\u0014J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\u0018J\u000e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\fR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/vungle/ads/internal/ui/view/MediaView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "contentView", "Lcom/vungle/ads/internal/ui/view/BaseContentView;", "videoListener", "Lcom/vungle/ads/nativead/NativeVideoListener;", "destroy", "", "destroy$vungle_ads_release", "getCurrentTime", "getDuration", "getVideoControl", "Lcom/vungle/ads/nativead/NativeVideoContract$VideoControl;", "getVideoControl$vungle_ads_release", "present", "internal", "Lcom/vungle/ads/internal/NativeAdInternal;", "present$vungle_ads_release", "setNativeVideoListener", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class MediaView extends android.widget.RelativeLayout {
    private com.vungle.ads.internal.ui.view.BaseContentView contentView;
    private com.vungle.ads.nativead.NativeVideoListener videoListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MediaView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setNativeVideoListener(com.vungle.ads.nativead.NativeVideoListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        this.videoListener = listener;
        com.vungle.ads.internal.ui.view.BaseContentView baseContentView = this.contentView;
        com.vungle.ads.internal.ui.view.VideoContentView videoContentView = baseContentView instanceof com.vungle.ads.internal.ui.view.VideoContentView ? (com.vungle.ads.internal.ui.view.VideoContentView) baseContentView : null;
        if (videoContentView == null) {
            return;
        }
        videoContentView.setNativeVideoListener(listener);
    }

    public final void present$vungle_ads_release(com.vungle.ads.internal.NativeAdInternal internal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internal, "internal");
        if (internal.hasVideoContent()) {
            if (this.contentView == null) {
                android.content.Context context = getContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "context");
                com.vungle.ads.internal.ui.view.VideoContentView videoContentView = new com.vungle.ads.internal.ui.view.VideoContentView(context, internal);
                videoContentView.setNativeVideoListener(this.videoListener);
                com.vungle.ads.AnalyticsClient analyticsClient = com.vungle.ads.AnalyticsClient.INSTANCE;
                com.vungle.ads.SingleValueMetric singleValueMetric = new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.NATIVE_PLAY_ASSET_TYPE);
                singleValueMetric.setValue(1L);
                com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, internal.getLogEntry$vungle_ads_release(), (java.lang.String) null, 4, (java.lang.Object) null);
                this.contentView = videoContentView;
            }
        } else if (this.contentView == null) {
            android.content.Context context2 = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "context");
            com.vungle.ads.internal.ui.view.BaseContentView baseContentView = new com.vungle.ads.internal.ui.view.BaseContentView(context2, internal);
            com.vungle.ads.AnalyticsClient analyticsClient2 = com.vungle.ads.AnalyticsClient.INSTANCE;
            com.vungle.ads.SingleValueMetric singleValueMetric2 = new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.NATIVE_PLAY_ASSET_TYPE);
            singleValueMetric2.setValue(2L);
            com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient2, singleValueMetric2, internal.getLogEntry$vungle_ads_release(), (java.lang.String) null, 4, (java.lang.Object) null);
            this.contentView = baseContentView;
        }
        com.vungle.ads.internal.ui.view.BaseContentView baseContentView2 = this.contentView;
        if (baseContentView2 != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            baseContentView2.setLayoutParams(layoutParams);
            if (!kotlin.jvm.internal.Intrinsics.areEqual(baseContentView2.getParent(), this)) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) baseContentView2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(baseContentView2);
                }
                addView(baseContentView2);
            }
            android.content.Context context3 = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context3, "context");
            baseContentView2.render(context3);
        }
    }

    public final com.vungle.ads.nativead.NativeVideoContract.VideoControl getVideoControl$vungle_ads_release() {
        android.view.ViewParent viewParent = this.contentView;
        if (viewParent instanceof com.vungle.ads.nativead.NativeVideoContract.VideoControl) {
            return (com.vungle.ads.nativead.NativeVideoContract.VideoControl) viewParent;
        }
        return null;
    }

    public final int getDuration() {
        com.vungle.ads.nativead.NativeVideoContract.VideoControl videoControl$vungle_ads_release = getVideoControl$vungle_ads_release();
        return (videoControl$vungle_ads_release != null ? videoControl$vungle_ads_release.getDuration() : 0) / 1000;
    }

    public final int getCurrentTime() {
        com.vungle.ads.nativead.NativeVideoContract.VideoControl videoControl$vungle_ads_release = getVideoControl$vungle_ads_release();
        return (videoControl$vungle_ads_release != null ? videoControl$vungle_ads_release.getCurrentTime() : 0) / 1000;
    }

    public final void destroy$vungle_ads_release() {
        setOnClickListener(null);
        setOnTouchListener(null);
        removeAllViews();
        com.vungle.ads.internal.ui.view.BaseContentView baseContentView = this.contentView;
        if (baseContentView != null) {
            baseContentView.destroy$vungle_ads_release();
        }
        this.contentView = null;
    }
}
