package com.unity3d.ads.beta;

/* compiled from: UnityAdsPrivacy.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH\u0000\u001a\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\bH\u0000¨\u0006\f"}, d2 = {"set", "", com.ironsource.X3.j.b0, "Lcom/unity3d/ads/beta/UnityAdsPrivacyConsent;", "value", "Lcom/unity3d/ads/beta/UnityAdsPrivacyConsentValue;", com.facebook.share.internal.ShareConstants.WEB_DIALOG_PARAM_PRIVACY, "Lcom/unity3d/ads/beta/UnityAdsPrivacyFlag;", "Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;", "setPrivacy", "flag", "", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UnityAdsPrivacy {
    public static final void set(com.unity3d.ads.beta.UnityAdsPrivacyConsent consent, com.unity3d.ads.beta.UnityAdsPrivacyConsentValue value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consent, "consent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
    }

    public static final void set(com.unity3d.ads.beta.UnityAdsPrivacyFlag privacy, com.unity3d.ads.beta.UnityAdsPrivacyValue value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(privacy, "privacy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
    }

    public static final void setPrivacy(java.lang.String flag, com.unity3d.ads.beta.UnityAdsPrivacyConsentValue value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flag, "flag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
    }

    public static final void setPrivacy(java.lang.String flag, com.unity3d.ads.beta.UnityAdsPrivacyValue consent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flag, "flag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consent, "consent");
    }
}
