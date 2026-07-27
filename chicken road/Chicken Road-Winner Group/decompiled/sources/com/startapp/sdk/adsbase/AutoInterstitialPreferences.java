package com.startapp.sdk.adsbase;

import java.io.Serializable;

/* loaded from: classes.dex */
public class AutoInterstitialPreferences implements Serializable {
    private static final long serialVersionUID = -9010452850291284559L;
    private int activitiesBetweenAds;
    private int secondsBetweenAds;

    public AutoInterstitialPreferences() {
        setActivitiesBetweenAds(AdsCommonMetaData.k().f());
        setSecondsBetweenAds(AdsCommonMetaData.k().g());
    }

    public int getActivitiesBetweenAds() {
        return this.activitiesBetweenAds;
    }

    public int getSecondsBetweenAds() {
        return this.secondsBetweenAds;
    }

    public AutoInterstitialPreferences setActivitiesBetweenAds(int i3) {
        if (i3 < 1) {
            i3 = 1;
        }
        this.activitiesBetweenAds = i3;
        return this;
    }

    public AutoInterstitialPreferences setSecondsBetweenAds(int i3) {
        if (i3 < 0) {
            i3 = 0;
        }
        this.secondsBetweenAds = i3;
        return this;
    }
}
