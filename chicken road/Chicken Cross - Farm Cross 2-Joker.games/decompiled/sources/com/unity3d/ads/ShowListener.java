package com.unity3d.ads;

import kotlin.Metadata;

/* compiled from: ShowListener.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\nH&¢\u0006\u0002\u0010\u000bJ\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u000eH&¢\u0006\u0002\u0010\u000f\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/ShowListener;", "UnityAd", "", "onStarted", "", "unityAd", "(Ljava/lang/Object;)V", "onClicked", "onCompleted", "state", "Lcom/unity3d/ads/ShowFinishState;", "(Ljava/lang/Object;Lcom/unity3d/ads/ShowFinishState;)V", "onFailed", "error", "Lcom/unity3d/ads/UnityAdsError;", "(Ljava/lang/Object;Lcom/unity3d/ads/UnityAdsError;)V", "Lcom/unity3d/ads/InterstitialShowListener;", "Lcom/unity3d/ads/RewardedShowListener;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ShowListener<UnityAd> {
    void onClicked(UnityAd unityAd);

    void onCompleted(UnityAd unityAd, ShowFinishState state);

    void onFailed(UnityAd unityAd, UnityAdsError error);

    void onStarted(UnityAd unityAd);
}
