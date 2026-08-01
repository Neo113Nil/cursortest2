package com.unity3d.mediation.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ironsource.C4637s7;
import com.ironsource.C4766za;
import com.ironsource.U2;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdSize;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LevelPlayBannerAdView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final C4766za f11686a;

    public static final class Config {
        public static final Companion Companion = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        private final LevelPlayAdSize f11687a;
        private final Double b;
        private final String c;

        public static final class Builder {

            /* renamed from: a, reason: collision with root package name */
            private LevelPlayAdSize f11688a;
            private Double b;
            private String c;

            public final Config build() {
                return new Config(this.f11688a, this.b, this.c);
            }

            public final Builder setAdSize(LevelPlayAdSize adSize) {
                Intrinsics.checkNotNullParameter(adSize, "adSize");
                this.f11688a = adSize;
                return this;
            }

            public final Builder setBidFloor(double d) {
                this.b = Double.valueOf(d);
                return this;
            }

            public final Builder setPlacementName(String placementName) {
                Intrinsics.checkNotNullParameter(placementName, "placementName");
                this.c = placementName;
                return this;
            }
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Config empty() {
                return new Config(null, null, null, 7, null);
            }

            private Companion() {
            }
        }

        public Config() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ Config copy$default(Config config, LevelPlayAdSize levelPlayAdSize, Double d, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                levelPlayAdSize = config.f11687a;
            }
            if ((i & 2) != 0) {
                d = config.b;
            }
            if ((i & 4) != 0) {
                str = config.c;
            }
            return config.copy(levelPlayAdSize, d, str);
        }

        public final LevelPlayAdSize component1() {
            return this.f11687a;
        }

        public final Double component2() {
            return this.b;
        }

        public final String component3() {
            return this.c;
        }

        public final Config copy(LevelPlayAdSize levelPlayAdSize, Double d, String str) {
            return new Config(levelPlayAdSize, d, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return Intrinsics.areEqual(this.f11687a, config.f11687a) && Intrinsics.areEqual((Object) this.b, (Object) config.b) && Intrinsics.areEqual(this.c, config.c);
        }

        public final LevelPlayAdSize getAdSize() {
            return this.f11687a;
        }

        public final Double getBidFloor() {
            return this.b;
        }

        public final String getPlacementName() {
            return this.c;
        }

        public int hashCode() {
            LevelPlayAdSize levelPlayAdSize = this.f11687a;
            int hashCode = (levelPlayAdSize == null ? 0 : levelPlayAdSize.hashCode()) * 31;
            Double d = this.b;
            int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
            String str = this.c;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Config(adSize=" + this.f11687a + ", bidFloor=" + this.b + ", placementName=" + this.c + ")";
        }

        public Config(LevelPlayAdSize levelPlayAdSize, Double d, String str) {
            this.f11687a = levelPlayAdSize;
            this.b = d;
            this.c = str;
        }

        public /* synthetic */ Config(LevelPlayAdSize levelPlayAdSize, Double d, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : levelPlayAdSize, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final C4766za a(String str, Config config) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        U2 a2 = a(context);
        addView(a2);
        return new C4766za(C4637s7.f8524a.a(), str, a2, config, null, null, 48, null);
    }

    public final void destroy() {
        this.f11686a.b();
    }

    public final String getAdId() {
        String uuid = this.f11686a.c().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "bannerViewInternal.adId.toString()");
        return uuid;
    }

    public final LevelPlayAdSize getAdSize() {
        return this.f11686a.d();
    }

    public final String getAdUnitId() {
        return this.f11686a.e();
    }

    public final LevelPlayBannerAdViewListener getBannerListener() {
        return this.f11686a.f();
    }

    public final String getPlacementName() {
        return this.f11686a.g();
    }

    public final void loadAd() {
        this.f11686a.i();
    }

    public final void pauseAutoRefresh() {
        this.f11686a.j();
    }

    public final void resumeAutoRefresh() {
        this.f11686a.k();
    }

    public final void setBannerListener(LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        this.f11686a.a(levelPlayBannerAdViewListener);
    }

    public final void setImpressionDataListener(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        this.f11686a.a(levelPlayImpressionDataListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ LevelPlayBannerAdView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        IronLog.API.info("context: " + context.getClass().getSimpleName());
        Pair<String, Config> a2 = C4766za.o.a(context, attributeSet);
        this.f11686a = a(a2.component1(), a2.component2());
    }

    private final U2 a(Context context) {
        U2 u2 = new U2(context);
        u2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return u2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context, String adUnitId) {
        this(context, adUnitId, Config.Companion.empty());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context, String adUnitId, Config config) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(config, "config");
        IronLog.API.info("adUnitId: " + adUnitId + ", config: " + config + ", context: " + context.getClass().getSimpleName());
        this.f11686a = a(adUnitId, config);
    }
}
