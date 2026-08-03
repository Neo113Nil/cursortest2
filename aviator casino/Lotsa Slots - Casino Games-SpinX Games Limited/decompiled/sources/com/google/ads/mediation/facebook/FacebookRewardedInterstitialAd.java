package com.google.ads.mediation.facebook;

/* loaded from: classes3.dex */
public class FacebookRewardedInterstitialAd extends com.google.ads.mediation.facebook.FacebookRewardedAd {
    public FacebookRewardedInterstitialAd(com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback, com.google.ads.mediation.facebook.MetaFactory metaFactory) {
        super(mediationAdLoadCallback, metaFactory);
    }

    @Override // com.google.ads.mediation.facebook.FacebookRewardedAd
    com.facebook.ads.AdExperienceType getAdExperienceType() {
        return com.facebook.ads.AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED_INTERSTITIAL;
    }
}
