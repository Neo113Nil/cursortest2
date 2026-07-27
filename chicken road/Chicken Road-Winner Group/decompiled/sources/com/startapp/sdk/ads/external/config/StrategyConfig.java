package com.startapp.sdk.ads.external.config;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.ih;
import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class StrategyConfig implements Serializable {
    public static final ih Companion = new ih();
    private static final long serialVersionUID = 6500875630965723999L;

    @TypeInfo(complex = true)
    private PlacementConfig interstitial = new PlacementConfig();

    @TypeInfo(complex = true)
    private PlacementConfig banner = new PlacementConfig();

    @TypeInfo(complex = true)
    private PlacementConfig rewarded = new PlacementConfig();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !r.a(StrategyConfig.class).equals(r.a(obj.getClass()))) {
            return false;
        }
        StrategyConfig strategyConfig = (StrategyConfig) obj;
        return si.a((Object) this.interstitial, (Object) strategyConfig.interstitial) && si.a((Object) this.banner, (Object) strategyConfig.banner) && si.a((Object) this.rewarded, (Object) strategyConfig.rewarded);
    }

    public final PlacementConfig getBanner() {
        return this.banner;
    }

    public final PlacementConfig getInterstitial() {
        return this.interstitial;
    }

    public final PlacementConfig getRewarded() {
        return this.rewarded;
    }

    public int hashCode() {
        Object[] objArr = {this.interstitial, this.banner, this.rewarded};
        WeakHashMap weakHashMap = si.f4343a;
        return Arrays.deepHashCode(objArr);
    }

    public final void setBanner(PlacementConfig placementConfig) {
        j.e(placementConfig, "<set-?>");
        this.banner = placementConfig;
    }

    public final void setInterstitial(PlacementConfig placementConfig) {
        j.e(placementConfig, "<set-?>");
        this.interstitial = placementConfig;
    }

    public final void setRewarded(PlacementConfig placementConfig) {
        j.e(placementConfig, "<set-?>");
        this.rewarded = placementConfig;
    }
}
