package com.unity3d.ads.beta;

/* compiled from: BannerLoadOptions.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0016BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/unity3d/ads/beta/BannerLoadOptions;", "", "placementId", "", "bannerSize", "Lkotlin/Pair;", "", "adMarkup", "extras", "", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ads/beta/BannerShowListener;", "(Ljava/lang/String;Lkotlin/Pair;Ljava/lang/String;Ljava/util/Map;Lcom/unity3d/ads/beta/BannerShowListener;)V", "getAdMarkup", "()Ljava/lang/String;", "getBannerSize", "()Lkotlin/Pair;", "getExtras", "()Ljava/util/Map;", "getListener", "()Lcom/unity3d/ads/beta/BannerShowListener;", "getPlacementId", "Builder", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BannerLoadOptions {
    private final java.lang.String adMarkup;
    private final kotlin.Pair<java.lang.Integer, java.lang.Integer> bannerSize;
    private final java.util.Map<java.lang.String, java.lang.String> extras;
    private final com.unity3d.ads.beta.BannerShowListener listener;
    private final java.lang.String placementId;

    public BannerLoadOptions(java.lang.String placementId, kotlin.Pair<java.lang.Integer, java.lang.Integer> bannerSize, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, com.unity3d.ads.beta.BannerShowListener bannerShowListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "placementId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        this.placementId = placementId;
        this.bannerSize = bannerSize;
        this.adMarkup = str;
        this.extras = map;
        this.listener = bannerShowListener;
    }

    public /* synthetic */ BannerLoadOptions(java.lang.String str, kotlin.Pair pair, java.lang.String str2, java.util.Map map, com.unity3d.ads.beta.BannerShowListener bannerShowListener, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, pair, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : map, (i & 16) != 0 ? null : bannerShowListener);
    }

    public final java.lang.String getPlacementId() {
        return this.placementId;
    }

    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> getBannerSize() {
        return this.bannerSize;
    }

    public final java.lang.String getAdMarkup() {
        return this.adMarkup;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getExtras() {
        return this.extras;
    }

    public final com.unity3d.ads.beta.BannerShowListener getListener() {
        return this.listener;
    }

    /* compiled from: BannerLoadOptions.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003J\u001a\u0010\u0010\u001a\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/beta/BannerLoadOptions$Builder;", "", "placementId", "", "bannerSize", "Lkotlin/Pair;", "", "(Ljava/lang/String;Lkotlin/Pair;)V", "adMarkup", "extras", "", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ads/beta/BannerShowListener;", "build", "Lcom/unity3d/ads/beta/BannerLoadOptions;", "withAdMarkup", "withExtras", "withListener", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private java.lang.String adMarkup;
        private final kotlin.Pair<java.lang.Integer, java.lang.Integer> bannerSize;
        private java.util.Map<java.lang.String, java.lang.String> extras;
        private com.unity3d.ads.beta.BannerShowListener listener;
        private final java.lang.String placementId;

        public Builder(java.lang.String placementId, kotlin.Pair<java.lang.Integer, java.lang.Integer> bannerSize) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "placementId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
            this.placementId = placementId;
            this.bannerSize = bannerSize;
        }

        public final com.unity3d.ads.beta.BannerLoadOptions.Builder withAdMarkup(java.lang.String adMarkup) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adMarkup, "adMarkup");
            this.adMarkup = adMarkup;
            return this;
        }

        public final com.unity3d.ads.beta.BannerLoadOptions.Builder withExtras(java.util.Map<java.lang.String, java.lang.String> extras) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
            this.extras = extras;
            return this;
        }

        public final com.unity3d.ads.beta.BannerLoadOptions.Builder withListener(com.unity3d.ads.beta.BannerShowListener listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
            this.listener = listener;
            return this;
        }

        public final com.unity3d.ads.beta.BannerLoadOptions build() {
            return new com.unity3d.ads.beta.BannerLoadOptions(this.placementId, this.bannerSize, this.adMarkup, this.extras, this.listener);
        }
    }
}
