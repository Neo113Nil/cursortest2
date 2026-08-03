package com.unity3d.mediation.interstitial;

/* loaded from: classes5.dex */
public final class LevelPlayInterstitialAd {
    public static final com.unity3d.mediation.interstitial.LevelPlayInterstitialAd.Companion Companion = new com.unity3d.mediation.interstitial.LevelPlayInterstitialAd.Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f8047a;
    private final com.ironsource.C2990cb b;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final boolean isPlacementCapped(java.lang.String placementName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "placementName");
            return com.ironsource.Xa.o.a(placementName, com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL);
        }

        private Companion() {
        }
    }

    public static final class Config implements com.ironsource.Xa.b {
        public static final com.unity3d.mediation.interstitial.LevelPlayInterstitialAd.Config.Companion Companion = new com.unity3d.mediation.interstitial.LevelPlayInterstitialAd.Config.Companion(null);

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.Double f8048a;

        public static final class Builder {

            /* renamed from: a, reason: collision with root package name */
            private java.lang.Double f8049a;

            public final com.unity3d.mediation.interstitial.LevelPlayInterstitialAd.Config build() {
                return new com.unity3d.mediation.interstitial.LevelPlayInterstitialAd.Config(this.f8049a);
            }

            public final com.unity3d.mediation.interstitial.LevelPlayInterstitialAd.Config.Builder setBidFloor(double d) {
                this.f8049a = java.lang.Double.valueOf(d);
                return this;
            }
        }

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final com.unity3d.mediation.interstitial.LevelPlayInterstitialAd.Config empty() {
                return new com.unity3d.mediation.interstitial.LevelPlayInterstitialAd.Config(null, 1, 0 == true ? 1 : 0);
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Config() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ com.unity3d.mediation.interstitial.LevelPlayInterstitialAd.Config copy$default(com.unity3d.mediation.interstitial.LevelPlayInterstitialAd.Config config, java.lang.Double d, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                d = config.f8048a;
            }
            return config.copy(d);
        }

        public final java.lang.Double component1() {
            return this.f8048a;
        }

        public final com.unity3d.mediation.interstitial.LevelPlayInterstitialAd.Config copy(java.lang.Double d) {
            return new com.unity3d.mediation.interstitial.LevelPlayInterstitialAd.Config(d);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.unity3d.mediation.interstitial.LevelPlayInterstitialAd.Config) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.f8048a, (java.lang.Object) ((com.unity3d.mediation.interstitial.LevelPlayInterstitialAd.Config) obj).f8048a);
        }

        @Override // com.ironsource.Xa.b
        public java.lang.Double getBidFloor() {
            return this.f8048a;
        }

        public int hashCode() {
            java.lang.Double d = this.f8048a;
            if (d == null) {
                return 0;
            }
            return d.hashCode();
        }

        public java.lang.String toString() {
            return "Config(bidFloor=" + this.f8048a + ")";
        }

        public Config(java.lang.Double d) {
            this.f8048a = d;
        }

        public /* synthetic */ Config(java.lang.Double d, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : d);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInterstitialAd(java.lang.String adUnitId) {
        this(adUnitId, com.unity3d.mediation.interstitial.LevelPlayInterstitialAd.Config.Companion.empty());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isPlacementCapped(java.lang.String str) {
        return Companion.isPlacementCapped(str);
    }

    public static /* synthetic */ void showAd$default(com.unity3d.mediation.interstitial.LevelPlayInterstitialAd levelPlayInterstitialAd, android.app.Activity activity, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        levelPlayInterstitialAd.showAd(activity, str);
    }

    public final java.lang.String getAdId() {
        return this.b.b();
    }

    public final java.lang.String getAdUnitId() {
        return this.f8047a;
    }

    public final boolean isAdReady() {
        return this.b.c();
    }

    public final void loadAd() {
        this.b.d();
    }

    public final void setListener(com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        this.b.a(levelPlayInterstitialAdListener);
    }

    public final void showAd(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        showAd$default(this, activity, null, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInterstitialAd(java.lang.String adUnitId, com.unity3d.mediation.interstitial.LevelPlayInterstitialAd.Config config) {
        this(adUnitId, new com.ironsource.Xa.c(new com.ironsource.C3212p0(com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL, com.ironsource.F0.b.MEDIATION), new com.ironsource.C3003d6(), com.ironsource.Jb.u.d(), new com.ironsource.InterfaceC3216p4.a(), com.ironsource.C3326v7.f6774a, config, new com.ironsource.Z0()));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
    }

    public final void showAd(android.app.Activity activity, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.b.a(activity, str);
    }

    public LevelPlayInterstitialAd(java.lang.String adUnitId, com.ironsource.Xa.c payload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
        com.ironsource.mediationsdk.logger.IronLog.API.info("adUnitId: " + adUnitId + ", config: " + payload.d());
        this.f8047a = adUnitId;
        this.b = new com.ironsource.C2990cb(adUnitId, payload.d(), payload.b(), payload.a(), payload.g(), payload.e(), payload.f(), payload.c());
    }
}
