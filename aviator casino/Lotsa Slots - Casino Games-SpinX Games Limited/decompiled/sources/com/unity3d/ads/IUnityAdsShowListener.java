package com.unity3d.ads;

/* loaded from: classes5.dex */
public interface IUnityAdsShowListener {
    void onUnityAdsShowClick(java.lang.String str);

    void onUnityAdsShowComplete(java.lang.String str, com.unity3d.ads.UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState);

    void onUnityAdsShowFailure(java.lang.String str, com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError, java.lang.String str2);

    void onUnityAdsShowStart(java.lang.String str);
}
