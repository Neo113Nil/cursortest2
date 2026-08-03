package com.unity3d.mediation.banner;

/* loaded from: classes5.dex */
public final class LevelPlayBannerAdView extends android.widget.FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3401za f8043a;

    public static final class Config {
        public static final com.unity3d.mediation.banner.LevelPlayBannerAdView.Config.Companion Companion = new com.unity3d.mediation.banner.LevelPlayBannerAdView.Config.Companion(null);

        /* renamed from: a, reason: collision with root package name */
        private final com.unity3d.mediation.LevelPlayAdSize f8044a;
        private final java.lang.Double b;
        private final java.lang.String c;

        public static final class Builder {

            /* renamed from: a, reason: collision with root package name */
            private com.unity3d.mediation.LevelPlayAdSize f8045a;
            private java.lang.Double b;
            private java.lang.String c;

            public final com.unity3d.mediation.banner.LevelPlayBannerAdView.Config build() {
                return new com.unity3d.mediation.banner.LevelPlayBannerAdView.Config(this.f8045a, this.b, this.c);
            }

            public final com.unity3d.mediation.banner.LevelPlayBannerAdView.Config.Builder setAdSize(com.unity3d.mediation.LevelPlayAdSize adSize) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSize, "adSize");
                this.f8045a = adSize;
                return this;
            }

            public final com.unity3d.mediation.banner.LevelPlayBannerAdView.Config.Builder setBidFloor(double d) {
                this.b = java.lang.Double.valueOf(d);
                return this;
            }

            public final com.unity3d.mediation.banner.LevelPlayBannerAdView.Config.Builder setPlacementName(java.lang.String placementName) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "placementName");
                this.c = placementName;
                return this;
            }
        }

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final com.unity3d.mediation.banner.LevelPlayBannerAdView.Config empty() {
                return new com.unity3d.mediation.banner.LevelPlayBannerAdView.Config(null, null, null, 7, null);
            }

            private Companion() {
            }
        }

        public Config() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ com.unity3d.mediation.banner.LevelPlayBannerAdView.Config copy$default(com.unity3d.mediation.banner.LevelPlayBannerAdView.Config config, com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize, java.lang.Double d, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                levelPlayAdSize = config.f8044a;
            }
            if ((i & 2) != 0) {
                d = config.b;
            }
            if ((i & 4) != 0) {
                str = config.c;
            }
            return config.copy(levelPlayAdSize, d, str);
        }

        public final com.unity3d.mediation.LevelPlayAdSize component1() {
            return this.f8044a;
        }

        public final java.lang.Double component2() {
            return this.b;
        }

        public final java.lang.String component3() {
            return this.c;
        }

        public final com.unity3d.mediation.banner.LevelPlayBannerAdView.Config copy(com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize, java.lang.Double d, java.lang.String str) {
            return new com.unity3d.mediation.banner.LevelPlayBannerAdView.Config(levelPlayAdSize, d, str);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.unity3d.mediation.banner.LevelPlayBannerAdView.Config)) {
                return false;
            }
            com.unity3d.mediation.banner.LevelPlayBannerAdView.Config config = (com.unity3d.mediation.banner.LevelPlayBannerAdView.Config) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.f8044a, config.f8044a) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.b, (java.lang.Object) config.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, config.c);
        }

        public final com.unity3d.mediation.LevelPlayAdSize getAdSize() {
            return this.f8044a;
        }

        public final java.lang.Double getBidFloor() {
            return this.b;
        }

        public final java.lang.String getPlacementName() {
            return this.c;
        }

        public int hashCode() {
            com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize = this.f8044a;
            int hashCode = (levelPlayAdSize == null ? 0 : levelPlayAdSize.hashCode()) * 31;
            java.lang.Double d = this.b;
            int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
            java.lang.String str = this.c;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public java.lang.String toString() {
            return "Config(adSize=" + this.f8044a + ", bidFloor=" + this.b + ", placementName=" + this.c + ")";
        }

        public Config(com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize, java.lang.Double d, java.lang.String str) {
            this.f8044a = levelPlayAdSize;
            this.b = d;
            this.c = str;
        }

        public /* synthetic */ Config(com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize, java.lang.Double d, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : levelPlayAdSize, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final com.ironsource.C3401za a(java.lang.String str, com.unity3d.mediation.banner.LevelPlayBannerAdView.Config config) {
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "context");
        com.ironsource.W2 a2 = a(context);
        addView(a2);
        return new com.ironsource.C3401za(com.ironsource.C3326v7.f6774a.a(), str, a2, config, null, 16, null);
    }

    public final void destroy() {
        this.f8043a.b();
    }

    public final java.lang.String getAdId() {
        java.lang.String uuid = this.f8043a.c().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "bannerViewInternal.adId.toString()");
        return uuid;
    }

    public final com.unity3d.mediation.LevelPlayAdSize getAdSize() {
        return this.f8043a.d();
    }

    public final java.lang.String getAdUnitId() {
        return this.f8043a.e();
    }

    public final com.unity3d.mediation.banner.LevelPlayBannerAdViewListener getBannerListener() {
        return this.f8043a.f();
    }

    public final java.lang.String getPlacementName() {
        return this.f8043a.g();
    }

    public final void loadAd() {
        this.f8043a.i();
    }

    public final void pauseAutoRefresh() {
        this.f8043a.j();
    }

    public final void resumeAutoRefresh() {
        this.f8043a.k();
    }

    public final void setBannerListener(com.unity3d.mediation.banner.LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        this.f8043a.a(levelPlayBannerAdViewListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ LevelPlayBannerAdView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.ironsource.mediationsdk.logger.IronLog.API.info("context: " + context.getClass().getSimpleName());
        kotlin.Pair<java.lang.String, com.unity3d.mediation.banner.LevelPlayBannerAdView.Config> a2 = com.ironsource.C3401za.n.a(context, attributeSet);
        this.f8043a = a(a2.component1(), a2.component2());
    }

    private final com.ironsource.W2 a(android.content.Context context) {
        com.ironsource.W2 w2 = new com.ironsource.W2(context);
        w2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        return w2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(android.content.Context context, java.lang.String adUnitId) {
        this(context, adUnitId, com.unity3d.mediation.banner.LevelPlayBannerAdView.Config.Companion.empty());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(android.content.Context context, java.lang.String adUnitId, com.unity3d.mediation.banner.LevelPlayBannerAdView.Config config) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        com.ironsource.mediationsdk.logger.IronLog.API.info("adUnitId: " + adUnitId + ", config: " + config + ", context: " + context.getClass().getSimpleName());
        this.f8043a = a(adUnitId, config);
    }
}
