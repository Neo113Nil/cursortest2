package com.unity3d.ads.beta;

/* compiled from: LoadOptions.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\rB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/beta/LoadOptions;", "", "placementId", "", "adMarkup", "extras", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getAdMarkup", "()Ljava/lang/String;", "getExtras", "()Ljava/util/Map;", "getPlacementId", "Builder", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LoadOptions {
    private final java.lang.String adMarkup;
    private final java.util.Map<java.lang.String, java.lang.String> extras;
    private final java.lang.String placementId;

    public LoadOptions(java.lang.String placementId, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> extras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "placementId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
        this.placementId = placementId;
        this.adMarkup = str;
        this.extras = extras;
    }

    public final java.lang.String getPlacementId() {
        return this.placementId;
    }

    public final java.lang.String getAdMarkup() {
        return this.adMarkup;
    }

    public /* synthetic */ LoadOptions(java.lang.String str, java.lang.String str2, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
    }

    public final java.util.Map<java.lang.String, java.lang.String> getExtras() {
        return this.extras;
    }

    /* compiled from: LoadOptions.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003J\u001a\u0010\u000b\u001a\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/beta/LoadOptions$Builder;", "", "placementId", "", "(Ljava/lang/String;)V", "adMarkup", "extras", "", "build", "Lcom/unity3d/ads/beta/LoadOptions;", "withAdMarkup", "withExtras", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private java.lang.String adMarkup;
        private final java.util.Map<java.lang.String, java.lang.String> extras;
        private final java.lang.String placementId;

        public Builder(java.lang.String placementId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "placementId");
            this.placementId = placementId;
            this.extras = new java.util.LinkedHashMap();
        }

        public final com.unity3d.ads.beta.LoadOptions.Builder withAdMarkup(java.lang.String adMarkup) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adMarkup, "adMarkup");
            this.adMarkup = adMarkup;
            return this;
        }

        public final com.unity3d.ads.beta.LoadOptions.Builder withExtras(java.util.Map<java.lang.String, java.lang.String> extras) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
            this.extras.putAll(extras);
            return this;
        }

        public final com.unity3d.ads.beta.LoadOptions build() {
            return new com.unity3d.ads.beta.LoadOptions(this.placementId, this.adMarkup, this.extras);
        }
    }
}
